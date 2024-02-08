package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post;
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
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter1.Schema1;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter2.Schema2;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter3.Schema3;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter4.Schema4;
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
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "1",
            "aB",
            "Ab",
            "A-B",
            "self"
        );
        public static QueryParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return QueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public String aB() throws UnsetPropertyException {
            String key = "aB";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for aB");
            }
            return (String) value;
        }
        
        public String Ab() throws UnsetPropertyException {
            String key = "Ab";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for Ab");
            }
            return (String) value;
        }
        
        public String self() throws UnsetPropertyException {
            String key = "self";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for self");
            }
            return (String) value;
        }
    }
    
    public interface SetterForSchema1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSchema1(Map<String, @Nullable Object> instance);
        
        default T setPositive1(String value) {
            var instance = getInstance();
            instance.put("1", value);
            return getBuilderAfterSchema1(instance);
        }
    }
    
    public interface SetterForAB <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAB(Map<String, @Nullable Object> instance);
        
        default T aB(String value) {
            var instance = getInstance();
            instance.put("aB", value);
            return getBuilderAfterAB(instance);
        }
    }
    
    public interface SetterForAb <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAb(Map<String, @Nullable Object> instance);
        
        default T Ab(String value) {
            var instance = getInstance();
            instance.put("Ab", value);
            return getBuilderAfterAb(instance);
        }
    }
    
    public interface SetterForAB1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAB1(Map<String, @Nullable Object> instance);
        
        default T setAHyphenMinusB(String value) {
            var instance = getInstance();
            instance.put("A-B", value);
            return getBuilderAfterAB1(instance);
        }
    }
    
    public interface SetterForSelf <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSelf(Map<String, @Nullable Object> instance);
        
        default T self(String value) {
            var instance = getInstance();
            instance.put("self", value);
            return getBuilderAfterSelf(instance);
        }
    }
    
    public static class QueryParametersMapBuilder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForSchema1<QueryParametersMapBuilder>, SetterForAB<QueryParametersMapBuilder>, SetterForAb<QueryParametersMapBuilder>, SetterForAB1<QueryParametersMapBuilder>, SetterForSelf<QueryParametersMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "1",
            "aB",
            "Ab",
            "A-B",
            "self"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public QueryParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMapBuilder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return this;
        }
        public QueryParametersMapBuilder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return this;
        }
        public QueryParametersMapBuilder getBuilderAfterAb(Map<String, @Nullable Object> instance) {
            return this;
        }
        public QueryParametersMapBuilder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return this;
        }
        public QueryParametersMapBuilder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return this;
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
                    new PropertyEntry("1", Schema0.Schema01.class),
                    new PropertyEntry("aB", Schema1.Schema11.class),
                    new PropertyEntry("Ab", Schema2.Schema21.class),
                    new PropertyEntry("A-B", Schema4.Schema41.class),
                    new PropertyEntry("self", Schema3.Schema31.class)
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
        @Override
        public QueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new QueryParameters1BoxedMap(validate(arg, configuration));
        }
    }

}
