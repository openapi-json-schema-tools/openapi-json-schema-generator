package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.NumberJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ArrayOfArrayOfNumberOnly {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items1 extends NumberJsonSchema {}
    
    
    public static class ItemsList extends FrozenList<Object> {
        ItemsList(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class Items extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class)),
            new KeywordEntry("items", new ItemsValidator(Items1.class)
        ));
        protected static ItemsList getListOutputInstance(FrozenList<Object> arg) {
            return new ItemsList(arg);
        }
        public static ItemsList validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items.class, arg, configuration);
        }
    }    
    
    public static class ArrayArrayNumberList extends FrozenList<Object> {
        ArrayArrayNumberList(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class ArrayArrayNumber extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class)),
            new KeywordEntry("items", new ItemsValidator(Items.class)
        ));
        protected static ArrayArrayNumberList getListOutputInstance(FrozenList<Object> arg) {
            return new ArrayArrayNumberList(arg);
        }
        public static ArrayArrayNumberList validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayArrayNumber.class, arg, configuration);
        }
    }    
    
    public static class ArrayOfArrayOfNumberOnlyMap extends FrozenMap<String, Object> {
        ArrayOfArrayOfNumberOnlyMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ArrayOfArrayOfNumberOnlyMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return ArrayOfArrayOfNumberOnly1.validate(arg, configuration);
        }
    }    
    
    public class ArrayOfArrayOfNumberOnly1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class)),
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("ArrayArrayNumber", ArrayArrayNumber.class)
        ));
        protected static ArrayOfArrayOfNumberOnlyMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new ArrayOfArrayOfNumberOnlyMap(arg);
        }
        public static ArrayOfArrayOfNumberOnlyMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayOfArrayOfNumberOnly1.class, arg, configuration);
        }
    }
}
