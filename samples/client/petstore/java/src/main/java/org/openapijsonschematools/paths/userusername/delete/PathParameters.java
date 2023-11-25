package org.openapijsonschematools.paths.userusername.delete;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.components.parameters.pathusername.Schema;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class PathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class PathParametersMap extends FrozenMap<String, String> {
        PathParametersMap(FrozenMap<String, String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "username"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static PathParametersMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return PathParameters1.validate(arg, configuration);
        }
        
        public String username() {
            return get("username");
        }
    }    
    
    public class PathParameters1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("username", Schema.Schema1.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "username"
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static PathParametersMap getMapOutputInstance(FrozenMap<String, String> arg) {
            return new PathParametersMap(arg);
        }
        public static PathParametersMap validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(PathParameters1.class, arg, configuration);
        }
    }
}
