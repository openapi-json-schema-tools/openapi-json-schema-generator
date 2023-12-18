package org.openapijsonschematools.client.paths.fake.delete;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter2.Schema2;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter3.Schema3;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter5.Schema5;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class QueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class QueryParametersMap extends FrozenMap<Object> {
        protected QueryParametersMap(FrozenMap<Object> m) {
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
            return QueryParameters1.getInstance().validate(arg, configuration);
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
    public static class QueryParametersMapInput {
        // requiredProperties, optionalProperties, NO additionalProperties
    }
    
    
    public static class QueryParameters1 extends JsonSchema implements MapSchemaValidator<Object, QueryParametersMap> {
        private static QueryParameters1 instance;
    
        protected QueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("required_string_group", Schema0.Schema01.class),
                    new PropertyEntry("int64_group", Schema5.Schema51.class),
                    new PropertyEntry("string_group", Schema3.Schema31.class),
                    new PropertyEntry("required_int64_group", Schema2.Schema21.class)
                ))
                .required(Set.of(
                    "required_int64_group",
                    "required_string_group"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static QueryParameters1 getInstance() {
            if (instance == null) {
                instance = new QueryParameters1();
            }
            return instance;
        }
        
        public QueryParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                String propertyName = (String) entry.getKey();
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
                Object castValue = (Object) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<Object> castProperties = new FrozenMap<>(properties);
            return new QueryParametersMap(castProperties);
        }
        
        @Override
        public QueryParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

}
