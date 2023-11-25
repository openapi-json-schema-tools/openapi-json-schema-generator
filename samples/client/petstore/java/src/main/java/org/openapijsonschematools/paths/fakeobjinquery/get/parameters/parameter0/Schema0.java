package org.openapijsonschematools.paths.fakeobjinquery.get.parameters.parameter0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema0 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Keyword0 extends StringJsonSchema {}
    
    
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
    
    public class Schema01 extends JsonSchema {
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

            return JsonSchema.validate(Schema01.class, arg, configuration);
        }
    }
}
