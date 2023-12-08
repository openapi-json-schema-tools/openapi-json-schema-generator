package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class ObjectTypeSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    public static class ObjectWithPropsSchema extends JsonSchema {
        public ObjectWithPropsSchema() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                    new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                    new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                            new PropertyEntry("someString", StringJsonSchema.class)
                    )))
            ));

        }

        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return validateMap(arg, configuration);
        }
    }

    public static class ObjectWithAddpropsSchema extends JsonSchema {
        public ObjectWithAddpropsSchema() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                    new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                    new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(StringJsonSchema.class))
            ));
        }

        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return validateMap(arg, configuration);
        }
    }

    public static class ObjectWithPropsAndAddpropsSchema extends JsonSchema {
        public ObjectWithPropsAndAddpropsSchema() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                    new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                    new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                            new PropertyEntry("someString", StringJsonSchema.class)
                    ))),
                    new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(BooleanJsonSchema.class))
            ));
        }

        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return validateMap(arg, configuration);
        }
    }

    public static class ObjectWithOutputTypeSchemaMap extends FrozenMap<String, Object> {
        ObjectWithOutputTypeSchemaMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }

        public static ObjectWithOutputTypeSchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchemaFactory.getInstance(ObjectWithOutputTypeSchema.class).validate(arg, configuration);
        }
    }


    public static class ObjectWithOutputTypeSchema extends JsonSchema<ObjectWithOutputTypeSchemaMap, FrozenList> {
        public ObjectWithOutputTypeSchema() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                    new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                    new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                            new PropertyEntry("someString", StringJsonSchema.class)
                    )))
            ));
        }

        @Override
        protected ObjectWithOutputTypeSchemaMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new ObjectWithOutputTypeSchemaMap((FrozenMap<? extends String, ?>) arg);
        }

        public ObjectWithOutputTypeSchemaMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return validateMap(arg, configuration);
        }
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        ObjectWithPropsSchema schema = JsonSchemaFactory.getInstance(ObjectWithPropsSchema.class);
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
                (Void) null, configuration
        ));
    }

    @Test
    public void testValidateObjectWithPropsSchema() {
        ObjectWithPropsSchema schema = JsonSchemaFactory.getInstance(ObjectWithPropsSchema.class);

        // map with only property works
        Map<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        FrozenMap<String, Object> validatedValue = schema.validate(inMap, configuration);
        LinkedHashMap<String, String> outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);

        // map with additional unvalidated property works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        inMap.put("someOtherString", "def");
        validatedValue = schema.validate(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        outMap.put("someOtherString", "def");
        Assert.assertEquals(validatedValue, outMap);

        // invalid prop type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someString", 1);
        Map<String, Object> finalInMap = inMap;
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
                finalInMap, configuration
        ));
    }

    @Test
    public void testValidateObjectWithAddpropsSchema() {
        ObjectWithAddpropsSchema schema = JsonSchemaFactory.getInstance(ObjectWithAddpropsSchema.class);

        // map with only property works
        Map<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        FrozenMap<String, Object> validatedValue = schema.validate(inMap, configuration);
        LinkedHashMap<String, String> outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);

        // map with additional properties works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        inMap.put("someOtherString", "def");
        validatedValue = schema.validate(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        outMap.put("someOtherString", "def");
        Assert.assertEquals(validatedValue, outMap);

        // invalid addProp type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someString", 1);
        Map<String, Object> finalInMap = inMap;
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
                finalInMap, configuration
        ));
    }

    @Test
    public void testValidateObjectWithPropsAndAddpropsSchema() {
        ObjectWithPropsAndAddpropsSchema schema = JsonSchemaFactory.getInstance(ObjectWithPropsAndAddpropsSchema.class);

        // map with only property works
        Map<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        FrozenMap<String, Object> validatedValue = schema.validate(inMap, configuration);
        LinkedHashMap<String, Object> outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);

        // map with additional properties works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        inMap.put("someAddProp", true);
        validatedValue = schema.validate(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        outMap.put("someAddProp", true);
        Assert.assertEquals(validatedValue, outMap);

        // invalid prop type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someString", 1);
        Map<String, Object> invalidPropMap = inMap;
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
                invalidPropMap, configuration
        ));

        // invalid addProp type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someAddProp", 1);
        Map<String, Object> invalidAddpropMap = inMap;
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
                invalidAddpropMap, configuration
        ));
    }

    @Test
    public void testValidateObjectWithOutputTypeSchema() {
        ObjectWithOutputTypeSchema schema = JsonSchemaFactory.getInstance(ObjectWithOutputTypeSchema.class);

        // map with only property works
        Map<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        ObjectWithOutputTypeSchemaMap validatedValue = schema.validate(inMap, configuration);
        LinkedHashMap<String, String> outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);

        // map with additional unvalidated property works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        inMap.put("someOtherString", "def");
        validatedValue = schema.validate(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        outMap.put("someOtherString", "def");
        Assert.assertEquals(validatedValue, outMap);

        // invalid prop type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someString", 1);
        Map<String, Object> finalInMap = inMap;
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
                finalInMap, configuration
        ));

        // using output class directly works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        validatedValue = ObjectWithOutputTypeSchemaMap.of(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);
    }
}
