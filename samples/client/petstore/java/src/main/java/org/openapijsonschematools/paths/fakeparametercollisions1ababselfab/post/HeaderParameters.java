package org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter5.Schema5;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter6.Schema6;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter7.Schema7;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter8.Schema8;
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
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class HeaderParametersMap extends FrozenMap<String, Object> {
        HeaderParametersMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "1",
            "aB",
            "A-B",
            "self"
        );
        public static HeaderParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return HeaderParameters1.validate(arg, configuration);
        }
        
        public String aB() {
            String key = "aB";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String self() {
            String key = "self";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
    }    
    
    public static class HeaderParameters1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("1", Schema5.Schema51.class),
                new PropertyEntry("aB", Schema6.Schema61.class),
                new PropertyEntry("A-B", Schema8.Schema81.class),
                new PropertyEntry("self", Schema7.Schema71.class)
            ))),
            
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            
        ));
        protected static HeaderParametersMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new HeaderParametersMap(arg);
        }
        public static HeaderParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(HeaderParameters1.class, arg, configuration);
        }
    }
}
