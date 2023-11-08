package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

record ObjectWithPropsSchema(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties) implements Schema {
    public static ObjectWithPropsSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        // can't use ImmutableMap because it does not allow null values in entries
        // can't use Collections.unmodifiableMap because Collections.UnmodifiableMap is not public + extensible
        type.add(FrozenMap.class);
        LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
        properties.put("someString", StringSchema.class);
        return new ObjectWithPropsSchema(type, properties);
    }

    public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
        return Schema.validate(ObjectWithPropsSchema.class, arg, configuration);
    }
}

record ObjectWithAddpropsSchema(LinkedHashSet<Class<?>> type, Class<?> additionalProperties) implements Schema {
    public static ObjectWithAddpropsSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        // can't use ImmutableMap because it does not allow null values in entries
        // can't use Collections.unmodifiableMap because Collections.UnmodifiableMap is not public + extensible
        type.add(FrozenMap.class);
        Class<?> additionalProperties = StringSchema.class;
        return new ObjectWithAddpropsSchema(type, additionalProperties);
    }

    public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
        return Schema.validate(ObjectWithAddpropsSchema.class, arg, configuration);
    }
}

record ObjectWithPropsAndAddpropsSchema(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties, Class<?> additionalProperties) implements Schema {
    public static ObjectWithPropsAndAddpropsSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        // can't use ImmutableMap because it does not allow null values in entries
        // can't use Collections.unmodifiableMap because Collections.UnmodifiableMap is not public + extensible
        type.add(FrozenMap.class);
        LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
        properties.put("someString", StringSchema.class);
        Class<?> additionalProperties = BooleanSchema.class;
        return new ObjectWithPropsAndAddpropsSchema(type, properties, additionalProperties);
    }

    public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
        return Schema.validate(ObjectWithPropsAndAddpropsSchema.class, arg, configuration);
    }
}

public class ObjectTypeSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(RuntimeException.class, () -> Schema.validate(
                ObjectWithPropsSchema.class, (Void) null, configuration
        ));
    }

    @Test
    public void testValidateObjectWithPropsSchema() {
        // map with only property works
        Map<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        FrozenMap<String, Object> validatedValue = ObjectWithPropsSchema.validate(inMap, configuration);
        LinkedHashMap<String, String> outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);

        // map with additional unvalidated property works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        inMap.put("someOtherString", "def");
        validatedValue = ObjectWithPropsSchema.validate(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        outMap.put("someOtherString", "def");
        Assert.assertEquals(validatedValue, outMap);

        // invalid prop type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someString", 1);
        Map<String, Object> finalInMap = inMap;
        Assert.assertThrows(RuntimeException.class, () -> ObjectWithPropsSchema.validate(
                finalInMap, configuration
        ));
    }

    @Test
    public void testValidateObjectWithAddpropsSchema() {
        // map with only property works
        Map<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        FrozenMap<String, Object> validatedValue = ObjectWithAddpropsSchema.validate(inMap, configuration);
        LinkedHashMap<String, String> outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);

        // map with additional properties works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        inMap.put("someOtherString", "def");
        validatedValue = ObjectWithAddpropsSchema.validate(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        outMap.put("someOtherString", "def");
        Assert.assertEquals(validatedValue, outMap);

        // invalid addProp type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someString", 1);
        Map<String, Object> finalInMap = inMap;
        Assert.assertThrows(RuntimeException.class, () -> ObjectWithAddpropsSchema.validate(
                finalInMap, configuration
        ));
    }

    @Test
    public void testValidateObjectWithPropsAndAddpropsSchema() {
        // map with only property works
        Map<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        FrozenMap<String, Object> validatedValue = ObjectWithPropsAndAddpropsSchema.validate(inMap, configuration);
        LinkedHashMap<String, Object> outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        Assert.assertEquals(validatedValue, outMap);

        // map with additional properties works
        inMap = new LinkedHashMap<>();
        inMap.put("someString", "abc");
        inMap.put("someAddProp", true);
        validatedValue = ObjectWithPropsAndAddpropsSchema.validate(inMap, configuration);
        outMap = new LinkedHashMap<>();
        outMap.put("someString", "abc");
        outMap.put("someAddProp", true);
        Assert.assertEquals(validatedValue, outMap);

        // invalid prop type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someString", 1);
        Map<String, Object> invalidPropMap = inMap;
        Assert.assertThrows(RuntimeException.class, () -> ObjectWithPropsAndAddpropsSchema.validate(
                invalidPropMap, configuration
        ));

        // invalid addProp type fails
        inMap = new LinkedHashMap<>();
        inMap.put("someAddProp", 1);
        Map<String, Object> invalidAddpropMap = inMap;
        Assert.assertThrows(RuntimeException.class, () -> ObjectWithPropsAndAddpropsSchema.validate(
                invalidAddpropMap, configuration
        ));
    }
}
