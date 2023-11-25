package org.openapijsonschematools.components.responses.successinlinecontentandheader.content.applicationjson;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.Int32JsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends Int32JsonSchema {}
    
    
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
    
    public class Schema1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static SchemaMap getMapOutputInstance(FrozenMap<String, Integer> arg) {

            return new SchemaMap(arg);
        }
        public static SchemaMap validate(Map<String, Integer> arg, SchemaConfiguration configuration) throws ValidationException {

            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }
}
