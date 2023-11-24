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
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Player {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Name extends StringJsonSchema {}
    
    
    public static class PlayerMap extends FrozenMap<String, Object> {

        PlayerMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static PlayerMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Player1.validate(arg, configuration);
        }
    }    
    
    public class Player1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        a model that includes a self reference this forces properties and additionalProperties to be lazy loaded in python models because the Player class has not fully loaded when defining properties
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("name", Name.class),
                new PropertyEntry("enemyPlayer", Player1.class)
            )))
        ));
        protected static PlayerMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new PlayerMap(arg);
        }
        public static PlayerMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Player1.class, arg, configuration);
        }
    }
}
