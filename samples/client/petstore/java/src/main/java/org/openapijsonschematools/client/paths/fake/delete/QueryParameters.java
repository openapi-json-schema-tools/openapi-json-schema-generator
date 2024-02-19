package org.openapijsonschematools.client.paths.fake.delete;
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
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter2.Schema2;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter3.Schema3;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter5.Schema5;
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
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
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
            "required_int64_group",
            "required_string_group"
        );
        public static final Set<String> optionalKeys = Set.of(
            "int64_group",
            "string_group"
        );
        public static QueryParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return QueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public Number required_int64_group() {
                        @Nullable Object value = get("required_int64_group");
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for required_int64_group");
            }
            return (Number) value;
        }
        
        public String required_string_group() {
                        @Nullable Object value = get("required_string_group");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for required_string_group");
            }
            return (String) value;
        }
        
        public Number int64_group() throws UnsetPropertyException {
            String key = "int64_group";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for int64_group");
            }
            return (Number) value;
        }
        
        public String string_group() throws UnsetPropertyException {
            String key = "string_group";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for string_group");
            }
            return (String) value;
        }
    }
    
    public interface SetterForRequiredInt64Group <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterRequiredInt64Group(Map<String, @Nullable Object> instance);
        
        default T required_int64_group(int value) {
            var instance = getInstance();
            instance.put("required_int64_group", value);
            return getBuilderAfterRequiredInt64Group(instance);
        }
        
        default T required_int64_group(float value) {
            var instance = getInstance();
            instance.put("required_int64_group", value);
            return getBuilderAfterRequiredInt64Group(instance);
        }
        
        default T required_int64_group(long value) {
            var instance = getInstance();
            instance.put("required_int64_group", value);
            return getBuilderAfterRequiredInt64Group(instance);
        }
        
        default T required_int64_group(double value) {
            var instance = getInstance();
            instance.put("required_int64_group", value);
            return getBuilderAfterRequiredInt64Group(instance);
        }
    }
    
    public interface SetterForRequiredStringGroup <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterRequiredStringGroup(Map<String, @Nullable Object> instance);
        
        default T required_string_group(String value) {
            var instance = getInstance();
            instance.put("required_string_group", value);
            return getBuilderAfterRequiredStringGroup(instance);
        }
    }
    
    public interface SetterForInt64Group <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterInt64Group(Map<String, @Nullable Object> instance);
        
        default T int64_group(int value) {
            var instance = getInstance();
            instance.put("int64_group", value);
            return getBuilderAfterInt64Group(instance);
        }
        
        default T int64_group(float value) {
            var instance = getInstance();
            instance.put("int64_group", value);
            return getBuilderAfterInt64Group(instance);
        }
        
        default T int64_group(long value) {
            var instance = getInstance();
            instance.put("int64_group", value);
            return getBuilderAfterInt64Group(instance);
        }
        
        default T int64_group(double value) {
            var instance = getInstance();
            instance.put("int64_group", value);
            return getBuilderAfterInt64Group(instance);
        }
    }
    
    public interface SetterForStringGroup <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterStringGroup(Map<String, @Nullable Object> instance);
        
        default T string_group(String value) {
            var instance = getInstance();
            instance.put("string_group", value);
            return getBuilderAfterStringGroup(instance);
        }
    }
    
    public static class QueryParametersMap00Builder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForInt64Group<QueryParametersMap00Builder>, SetterForStringGroup<QueryParametersMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "required_int64_group",
            "required_string_group",
            "int64_group",
            "string_group"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public QueryParametersMap00Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap00Builder getBuilderAfterInt64Group(Map<String, @Nullable Object> instance) {
            return this;
        }
        public QueryParametersMap00Builder getBuilderAfterStringGroup(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class QueryParametersMap01Builder implements SetterForRequiredStringGroup<QueryParametersMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap01Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap00Builder getBuilderAfterRequiredStringGroup(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap00Builder(instance);
        }
    }
    
    public static class QueryParametersMap10Builder implements SetterForRequiredInt64Group<QueryParametersMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMap10Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap00Builder getBuilderAfterRequiredInt64Group(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap00Builder(instance);
        }
    }
    
    public static class QueryParametersMapBuilder implements SetterForRequiredInt64Group<QueryParametersMap01Builder>, SetterForRequiredStringGroup<QueryParametersMap10Builder> {
        private final Map<String, @Nullable Object> instance;
        public QueryParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public QueryParametersMap01Builder getBuilderAfterRequiredInt64Group(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap01Builder(instance);
        }
        public QueryParametersMap10Builder getBuilderAfterRequiredStringGroup(Map<String, @Nullable Object> instance) {
            return new QueryParametersMap10Builder(instance);
        }
    }
    
    
    public sealed interface QueryParameters1Boxed permits QueryParameters1BoxedMap {
        @Nullable Object data();
    }
    
    public static final class QueryParameters1BoxedMap implements QueryParameters1Boxed {
        public final QueryParametersMap data;
        private QueryParameters1BoxedMap(QueryParametersMap data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    public static class QueryParameters1 extends JsonSchema implements MapSchemaValidator<QueryParametersMap, QueryParameters1BoxedMap> {
        private static @Nullable QueryParameters1 instance = null;
    
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
