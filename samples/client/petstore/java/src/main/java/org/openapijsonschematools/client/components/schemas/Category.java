package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Category {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Id extends Int64JsonSchema {}
    
    
    public static class Name extends JsonSchema {
        public Name() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                )))
            ));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class CategoryMap extends FrozenMap<String, Object> {
        CategoryMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "name"
        );
        public static final Set<String> optionalKeys = Set.of(
            "id"
        );
        public static CategoryMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Category1.class).validate(arg, configuration);
        }
        
        public String name() {
            return (String) get("name");
        }
        
        public long id() {
            String key = "id";
            throwIfKeyNotPresent(key);
            return (long) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class CategoryMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class Category1 extends JsonSchema<CategoryMap, FrozenList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public Category1() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("id", Id.class),
                    new PropertyEntry("name", Name.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "name"
                )))
            ));
        }
        
        @Override
        protected CategoryMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new CategoryMap((FrozenMap<String, Object>) arg);
        }
        public CategoryMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
