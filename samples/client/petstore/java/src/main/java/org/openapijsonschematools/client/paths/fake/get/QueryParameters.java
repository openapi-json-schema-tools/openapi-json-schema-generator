package org.openapijsonschematools.client.paths.fake.get;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fake.get.parameters.parameter2.Schema2;
import org.openapijsonschematools.client.paths.fake.get.parameters.parameter3.Schema3;
import org.openapijsonschematools.client.paths.fake.get.parameters.parameter4.Schema4;
import org.openapijsonschematools.client.paths.fake.get.parameters.parameter5.Schema5;
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
            "enum_query_double",
            "enum_query_string",
            "enum_query_integer",
            "enum_query_string_array"
        );
        public static QueryParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(QueryParameters1.class).validate(arg, configuration);
        }
        
        public double enum_query_double() {
            String key = "enum_query_double";
            throwIfKeyNotPresent(key);
            return (double) get(key);
        }
        
        public String enum_query_string() {
            String key = "enum_query_string";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public int enum_query_integer() {
            String key = "enum_query_integer";
            throwIfKeyNotPresent(key);
            return (int) get(key);
        }
        
        public Schema2.SchemaList2 enum_query_string_array() {
            String key = "enum_query_string_array";
            throwIfKeyNotPresent(key);
            return (Schema2.SchemaList2) get(key);
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
                    new PropertyEntry("enum_query_double", Schema5.Schema51.class),
                    new PropertyEntry("enum_query_string", Schema3.Schema31.class),
                    new PropertyEntry("enum_query_integer", Schema4.Schema41.class),
                    new PropertyEntry("enum_query_string_array", Schema2.Schema21.class)
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
        
        @Override
        protected QueryParametersMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new QueryParametersMap(arg);
        }
        public QueryParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
