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
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ArrayOfNumberOnly {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items extends NumberJsonSchema {}
    
    
    public static class ArrayNumberList extends FrozenList<Number> {

        ArrayNumberList(FrozenList<Number> m) {

            super(m);
        }
        public static ArrayNumberList of(List<Number> arg, SchemaConfiguration configuration) {

            return ArrayNumber.validate(arg, configuration);
        }
    }
    
    
    public class ArrayNumber extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items.class))
        ));
        protected static ArrayNumberList getListOutputInstance(FrozenList<Number> arg) {

            return new ArrayNumberList(arg);
        }
        public static ArrayNumberList validate(List<Number> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(ArrayNumber.class, arg, configuration);
        }
    }    
    
    public static class ArrayOfNumberOnlyMap extends FrozenMap<String, Object> {

        ArrayOfNumberOnlyMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static ArrayOfNumberOnlyMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return ArrayOfNumberOnly1.validate(arg, configuration);
        }
        
        public ArrayNumberList ArrayNumber() {

            String key = "ArrayNumber";
            if (!containsKey(key)) {
                throw new RuntimeException("ArrayNumber is unset");
            }
            return ArrayNumberList get(key);

        }
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
        }
    }    
    
    public class ArrayOfNumberOnly1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("ArrayNumber", ArrayNumber.class)
            )))
        ));
        protected static ArrayOfNumberOnlyMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new ArrayOfNumberOnlyMap(arg);
        }
        public static ArrayOfNumberOnlyMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(ArrayOfNumberOnly1.class, arg, configuration);
        }
    }
}
