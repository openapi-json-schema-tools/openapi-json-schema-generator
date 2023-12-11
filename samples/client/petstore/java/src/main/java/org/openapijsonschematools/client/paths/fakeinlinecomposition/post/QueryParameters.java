package org.openapijsonschematools.client.paths.fakeinlinecomposition.post;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.parameter1.Schema1;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class QueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class QueryParametersMap extends FrozenMap<String, Object> {
        QueryParametersMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "compositionAtRoot",
            "compositionInProperty"
        );
        public static QueryParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(QueryParameters1.class).validate(arg, configuration);
        }
        
        public Object compositionAtRoot() {
            String key = "compositionAtRoot";
            throwIfKeyNotPresent(key);
            return (Object) get(key);
        }
        
        public Schema1.SchemaMap1 compositionInProperty() {
            String key = "compositionInProperty";
            throwIfKeyNotPresent(key);
            return (Schema1.SchemaMap1) get(key);
        }
    }
    public class QueryParametersMapInput {
        // empty mapping
    }
    
    
    public static class QueryParameters1 extends JsonSchema<Object, Object, QueryParametersMap, Object, Object, FrozenList<Object>> {
        public QueryParameters1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("compositionAtRoot", Schema0.Schema01.class),
                    new PropertyEntry("compositionInProperty", Schema1.Schema11.class)
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
        
        @Override
        protected QueryParametersMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new QueryParametersMap(arg);
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public QueryParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
