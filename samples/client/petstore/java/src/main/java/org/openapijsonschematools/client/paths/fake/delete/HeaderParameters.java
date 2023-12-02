package org.openapijsonschematools.client.paths.fake.delete;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter1.Schema1;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter4.Schema4;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class HeaderParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class HeaderParametersMap extends FrozenMap<String, Object> {
        HeaderParametersMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "required_boolean_group"
        );
        public static final Set<String> optionalKeys = Set.of(
            "boolean_group"
        );
        public static HeaderParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return HeaderParameters1.validate(arg, configuration);
        }
        
        public String required_boolean_group() {
            return (String) get("required_boolean_group");
        }
        
        public String boolean_group() {
            String key = "boolean_group";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
    }    
    
    public static class HeaderParameters1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("required_boolean_group", Schema1.Schema11.class),
                new PropertyEntry("boolean_group", Schema4.Schema41.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "required_boolean_group"
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        
        protected static HeaderParametersMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new HeaderParametersMap(arg);
        }
        public static HeaderParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(HeaderParameters1.class, arg, configuration);
        }
    }
}
