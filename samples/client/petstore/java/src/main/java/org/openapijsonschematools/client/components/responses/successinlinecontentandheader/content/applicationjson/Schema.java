package org.openapijsonschematools.client.components.responses.successinlinecontentandheader.content.applicationjson;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.Int32JsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends Int32JsonSchema {}
    
    
    public static class SchemaMap extends FrozenMap<String, Integer> {
        SchemaMap(FrozenMap<String, Integer> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static SchemaMap of(Map<String, Integer> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema1.validate(arg, configuration);
        }
        
        public int getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class SchemaMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class Schema1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        
        protected static SchemaMap getMapOutputInstance(FrozenMap<String, Integer> arg) {
            return new SchemaMap(arg);
        }
        public static SchemaMap validate(Map<String, Integer> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Schema1.class, arg, configuration);
        }
    }
}
