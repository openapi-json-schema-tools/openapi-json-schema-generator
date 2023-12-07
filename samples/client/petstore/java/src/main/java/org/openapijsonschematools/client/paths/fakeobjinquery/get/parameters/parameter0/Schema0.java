package org.openapijsonschematools.client.paths.fakeobjinquery.get.parameters.parameter0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Schema0 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Keyword0 extends StringJsonSchema {}
    
    
    public static class SchemaMap0 extends FrozenMap<String, Object> {
        SchemaMap0(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "keyword"
        );
        public static SchemaMap0 of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema01.validate(arg, configuration);
        }
        
        public String keyword() {
            String key = "keyword";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class SchemaMapInput0 {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class Schema01 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("keyword", Keyword0.class)
            )))
        ));
        
        protected static SchemaMap0 getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new SchemaMap0(arg);
        }
        public static SchemaMap0 validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Schema01.class, arg, configuration);
        }
    }
}
