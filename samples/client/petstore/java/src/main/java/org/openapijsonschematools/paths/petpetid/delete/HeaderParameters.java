package org.openapijsonschematools.paths.petpetid.delete;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.petpetid.delete.parameters.parameter0.Schema0;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class HeaderParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class HeaderParametersMap extends FrozenMap<String, String> {

        HeaderParametersMap(FrozenMap<String, String> m) {

            super(m);
        }
        public static HeaderParametersMap of(Map<String, String> arg, SchemaConfiguration configuration) {

            return HeaderParameters1.validate(arg, configuration);
        }
        
        public String api_key() {

            String key = "api_key";
            if (!containsKey(key)) {
                throw new RuntimeException("api_key is unset");
            }
            return get(key);
        }
    }    
    
    public class HeaderParameters1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("api_key", Schema0.Schema01.class)
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static HeaderParametersMap getMapOutputInstance(FrozenMap<String, String> arg) {

            return new HeaderParametersMap(arg);
        }
        public static HeaderParametersMap validate(Map<String, String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(HeaderParameters1.class, arg, configuration);
        }
    }
}
