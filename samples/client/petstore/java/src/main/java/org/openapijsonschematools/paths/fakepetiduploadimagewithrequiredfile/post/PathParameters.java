package org.openapijsonschematools.paths.fakepetiduploadimagewithrequiredfile.post;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.fakepetiduploadimagewithrequiredfile.post.parameters.parameter0.Schema0;
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
    
    
    public static class PathParametersMap extends FrozenMap<String, Long> {

        PathParametersMap(FrozenMap<String, Long> m) {

            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "petId"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static PathParametersMap of(Map<String, Long> arg, SchemaConfiguration configuration) {

            return PathParameters1.validate(arg, configuration);
        }
        
        public long petId() {

            return get("petId");
        }
    }    
    
    public class PathParameters1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("petId", Schema0.Schema01.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "petId"
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static PathParametersMap getMapOutputInstance(FrozenMap<String, Long> arg) {

            return new PathParametersMap(arg);
        }
        public static PathParametersMap validate(Map<String, Long> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(PathParameters1.class, arg, configuration);
        }
    }
}
