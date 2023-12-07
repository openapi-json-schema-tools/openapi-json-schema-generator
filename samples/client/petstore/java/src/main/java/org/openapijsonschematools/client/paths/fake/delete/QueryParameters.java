package org.openapijsonschematools.client.paths.fake.delete;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter2.Schema2;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter3.Schema3;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter5.Schema5;
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

public class QueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    public class QueryParametersMapInput {
        // empty mapping
    }
    public class QueryParametersMapInput {
        // empty mapping
    }
    
    
    public static class QueryParametersMap extends FrozenMap<String, Object> {
        QueryParametersMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "required_int64_group",
            "required_string_group"
        );
        public static final Set<String> optionalKeys = Set.of(
            "int64_group",
            "string_group"
        );
        public static QueryParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return QueryParameters1.validate(arg, configuration);
        }
        
        public long required_int64_group() {
            return (long) get("required_int64_group");
        }
        
        public String required_string_group() {
            return (String) get("required_string_group");
        }
        
        public long int64_group() {
            String key = "int64_group";
            throwIfKeyNotPresent(key);
            return (long) get(key);
        }
        
        public String string_group() {
            String key = "string_group";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
    }
    public class QueryParametersMapInput {
        // requiredProperties, optionalProperties, NO additionalProperties
    }
    
    
    public static class QueryParameters1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("required_string_group", Schema0.Schema01.class),
                new PropertyEntry("int64_group", Schema5.Schema51.class),
                new PropertyEntry("string_group", Schema3.Schema31.class),
                new PropertyEntry("required_int64_group", Schema2.Schema21.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "required_int64_group",
                "required_string_group"
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        
        protected static QueryParametersMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new QueryParametersMap(arg);
        }
        public static QueryParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(QueryParameters1.class, arg, configuration);
        }
    }
}
