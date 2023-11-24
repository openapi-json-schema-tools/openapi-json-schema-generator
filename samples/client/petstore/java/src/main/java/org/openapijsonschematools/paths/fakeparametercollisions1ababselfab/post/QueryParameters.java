package org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter0.Schema0;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter1.Schema1;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter2.Schema2;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter3.Schema3;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter4.Schema4;
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

public class QueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class QueryParametersMap extends FrozenMap<String, Object> {

        QueryParametersMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static QueryParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return QueryParameters1.validate(arg, configuration);
        }
        
        public String aB() {

            String key = "aB";
            if (!containsKey(key)) {
                throw new RuntimeException("aB is unset");
            }
            return (String) get(key);

        }
        
        public String Ab() {

            String key = "Ab";
            if (!containsKey(key)) {
                throw new RuntimeException("Ab is unset");
            }
            return (String) get(key);

        }
        
        public String self() {

            String key = "self";
            if (!containsKey(key)) {
                throw new RuntimeException("self is unset");
            }
            return (String) get(key);

        }
    }    
    
    public class QueryParameters1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("1", Schema0.Schema01.class),
                new PropertyEntry("aB", Schema1.Schema11.class),
                new PropertyEntry("Ab", Schema2.Schema21.class),
                new PropertyEntry("A-B", Schema4.Schema41.class),
                new PropertyEntry("self", Schema3.Schema31.class)
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static QueryParametersMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new QueryParametersMap(arg);
        }
        public static QueryParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(QueryParameters1.class, arg, configuration);
        }
    }
}
