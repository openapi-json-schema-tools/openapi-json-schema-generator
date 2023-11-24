package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class GrandparentAnimal {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class PetType extends StringJsonSchema {}
    
    
    public static class GrandparentAnimalMap extends FrozenMap<String, Object> {

        GrandparentAnimalMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "pet_type"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static GrandparentAnimalMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return GrandparentAnimal1.validate(arg, configuration);
        }
        
        public String pet_type() {

            return (String) get("pet_type");

        }
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
        }
    }    
    
    public class GrandparentAnimal1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("pet_type", PetType.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "pet_type"
            )))
        ));
        protected static GrandparentAnimalMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new GrandparentAnimalMap(arg);
        }
        public static GrandparentAnimalMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(GrandparentAnimal1.class, arg, configuration);
        }
    }
}
