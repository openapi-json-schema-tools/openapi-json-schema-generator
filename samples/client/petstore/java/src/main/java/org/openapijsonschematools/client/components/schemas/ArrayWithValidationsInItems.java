package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.MaxItemsValidator;
import org.openapijsonschematools.client.schemas.validation.MaximumValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class ArrayWithValidationsInItems {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("format", new FormatValidator("int64")),
            new KeywordEntry("maximum", new MaximumValidator(7))
        ));
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(Items.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(Items.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(Items.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(Items.class, arg, configuration);
        }
    }    
    
    public static class ArrayWithValidationsInItemsList extends FrozenList<Long> {
        ArrayWithValidationsInItemsList(FrozenList<Long> m) {
            super(m);
        }
        public static ArrayWithValidationsInItemsList of(List<Long> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayWithValidationsInItems1.validate(arg, configuration);
        }
    }
    
    public static interface ArrayWithValidationsInItemsListInput extends List<Long> {}
    
    
    public static class ArrayWithValidationsInItems1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items.class)),
            new KeywordEntry("maxItems", new MaxItemsValidator(2))
        ));
        
        protected static ArrayWithValidationsInItemsList getListOutputInstance(FrozenList<Long> arg) {
            return new ArrayWithValidationsInItemsList(arg);
        }
        public static ArrayWithValidationsInItemsList validate(List<Long> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(ArrayWithValidationsInItems1.class, arg, configuration);
        }
    }}
