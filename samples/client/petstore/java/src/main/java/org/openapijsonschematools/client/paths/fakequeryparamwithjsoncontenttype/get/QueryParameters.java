package org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.parameters.parameter0.content.applicationjson.Schema0;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
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
            "someParam"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static QueryParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return QueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object someParam() {
            return getOrThrow("someParam");
        }
    }
    
    public interface SetterForSomeParam <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSomeParam(Map<String, @Nullable Object> instance);
        
        default T someParam(Void value) {
            var instance = getInstance();
            instance.put("someParam", null);
            return getBuilderAfterSomeParam(instance);
        }
        
        default T someParam(boolean value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterSomeParam(instance);
        }
        
        default T someParam(String value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterSomeParam(instance);
        }
        
        default T someParam(int value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterSomeParam(instance);
        }
        
        default T someParam(float value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterSomeParam(instance);
        }
        
        default T someParam(long value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterSomeParam(instance);
        }
        
        default T someParam(double value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterSomeParam(instance);
        }
        
        default T someParam(List<?> value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterSomeParam(instance);
        }
        
        default T someParam(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterSomeParam(instance);
        }
    }
    
    public static class QueryParametersMap0Builder implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "someParam"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public QueryParametersMap0Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    public static class QueryParametersMapBuilder implements SetterForSomeParam<QueryParametersMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap0Builder getBuilderAfterSomeParam(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap0Builder(instance);
        }
    }
    
    
    public static abstract sealed class QueryParameters1Boxed permits QueryParameters1BoxedMap {}
    public static final class QueryParameters1BoxedMap extends QueryParameters1Boxed {
        public final QueryParametersMap data;
        private QueryParameters1BoxedMap(QueryParametersMap data) {
            this.data = data;
        }
    }
    
    
    public static class QueryParameters1 extends JsonSchema implements MapSchemaValidator<QueryParametersMap, QueryParameters1BoxedMap> {
        private static @Nullable QueryParameters1 instance = null;
    
        protected QueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("someParam", Schema0.Schema01.class)
                ))
                .required(Set.of(
                    "someParam"
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
                if (!(propertyInstance instanceof Object)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (@Nullable Object) propertyInstance);
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
        @Override
        public QueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new QueryParameters1BoxedMap(validate(arg, configuration));
        }
    }

}
