package org.openapijsonschematools.client.paths.faketestqueryparamters.put;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.StringWithValidation;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter1.Schema1;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter2.Schema2;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter3.Schema3;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter4.Schema4;
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
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class QueryParametersMap extends FrozenMap<@Nullable Object> {
        protected QueryParametersMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "context",
            "http",
            "ioutil",
            "pipe",
            "refParam",
            "url"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static QueryParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return QueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public Schema4.SchemaList4 context() {
                        @Nullable Object value = get("context");
            if (!(value instanceof Schema4.SchemaList4)) {
                throw new InvalidTypeException("Invalid value stored for context");
            }
            return (Schema4.SchemaList4) value;
        }
        
        public Schema2.SchemaList2 http() {
                        @Nullable Object value = get("http");
            if (!(value instanceof Schema2.SchemaList2)) {
                throw new InvalidTypeException("Invalid value stored for http");
            }
            return (Schema2.SchemaList2) value;
        }
        
        public Schema1.SchemaList1 ioutil() {
                        @Nullable Object value = get("ioutil");
            if (!(value instanceof Schema1.SchemaList1)) {
                throw new InvalidTypeException("Invalid value stored for ioutil");
            }
            return (Schema1.SchemaList1) value;
        }
        
        public Schema0.SchemaList0 pipe() {
                        @Nullable Object value = get("pipe");
            if (!(value instanceof Schema0.SchemaList0)) {
                throw new InvalidTypeException("Invalid value stored for pipe");
            }
            return (Schema0.SchemaList0) value;
        }
        
        public String refParam() {
                        @Nullable Object value = get("refParam");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for refParam");
            }
            return (String) value;
        }
        
        public Schema3.SchemaList3 url() {
                        @Nullable Object value = get("url");
            if (!(value instanceof Schema3.SchemaList3)) {
                throw new InvalidTypeException("Invalid value stored for url");
            }
            return (Schema3.SchemaList3) value;
        }
    }
    public static class QueryParametersMapBuilder {
        // empty mapping
    }
    
    
    public static class QueryParameters1 extends JsonSchema implements MapSchemaValidator<QueryParametersMap> {
        private static @Nullable QueryParameters1 instance = null;
    
        protected QueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("refParam", StringWithValidation.StringWithValidation1.class),
                    new PropertyEntry("ioutil", Schema1.Schema11.class),
                    new PropertyEntry("context", Schema4.Schema41.class),
                    new PropertyEntry("http", Schema2.Schema21.class),
                    new PropertyEntry("pipe", Schema0.Schema01.class),
                    new PropertyEntry("url", Schema3.Schema31.class)
                ))
                .required(Set.of(
                    "context",
                    "http",
                    "ioutil",
                    "pipe",
                    "refParam",
                    "url"
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
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new InvalidTypeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new QueryParametersMap(castProperties);
        }
        
        public QueryParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }

}
