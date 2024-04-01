package org.openapijsonschematools.client.components.schemas;
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
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.IntJsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class PaginatedResultMyObjectDto {
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
    
    
    public static class Count extends IntJsonSchema.IntJsonSchema1 {
        private static @Nullable Count instance = null;
        public static Count getInstance() {
            if (instance == null) {
                instance = new Count();
            }
            return instance;
        }
    }
    
    
    public static class ResultsList extends FrozenList<MyObjectDto.MyObjectDtoMap> {
        protected ResultsList(FrozenList<MyObjectDto.MyObjectDtoMap> m) {
            super(m);
        }
        public static ResultsList of(List<Map<String, String>> arg, SchemaConfiguration configuration) throws ValidationException {
            return Results.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ResultsListBuilder {
        // class to build List<Map<String, String>>
        private final List<Map<String, String>> list;
    
        public ResultsListBuilder() {
            list = new ArrayList<>();
        }
    
        public ResultsListBuilder(List<Map<String, String>> list) {
            this.list = list;
        }
        
        public ResultsListBuilder add(Map<String, String> item) {
            list.add(item);
            return this;
        }
    
        public List<Map<String, String>> build() {
            return list;
        }
    }
    
    
    public sealed interface ResultsBoxed permits ResultsBoxedList {
        @Nullable Object getData();
    }
    
    public record ResultsBoxedList(ResultsList data) implements ResultsBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Results extends JsonSchema<ResultsBoxed> implements ListSchemaValidator<ResultsList, ResultsBoxedList> {
        private static @Nullable Results instance = null;
    
        protected Results() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(MyObjectDto.MyObjectDto1.class)
            );
        }
    
        public static Results getInstance() {
            if (instance == null) {
                instance = new Results();
            }
            return instance;
        }
        
        @Override
        public ResultsList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            List<MyObjectDto.MyObjectDtoMap> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof MyObjectDto.MyObjectDtoMap)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((MyObjectDto.MyObjectDtoMap) itemInstance);
                i += 1;
            }
            FrozenList<MyObjectDto.MyObjectDtoMap> newInstanceItems = new FrozenList<>(items);
            return new ResultsList(newInstanceItems);
        }
        
        public ResultsList validate(List<?> arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ResultsBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ResultsBoxedList(validate(arg, configuration));
        }
        @Override
        public ResultsBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class PaginatedResultMyObjectDtoMap extends FrozenMap<Object> {
        protected PaginatedResultMyObjectDtoMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "count",
            "results"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static PaginatedResultMyObjectDtoMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return PaginatedResultMyObjectDto1.getInstance().validate(arg, configuration);
        }
        
        public Number count() {
                        Object value = get("count");
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for count");
            }
            return (Number) value;
        }
        
        public ResultsList results() {
                        Object value = get("results");
            if (!(value instanceof ResultsList)) {
                throw new InvalidTypeException("Invalid value stored for results");
            }
            return (ResultsList) value;
        }
    }
    
    public interface SetterForCount <T> {
        Map<String, Object> getInstance();
        T getBuilderAfterCount(Map<String, Object> instance);
        
        default T count(int value) {
            var instance = getInstance();
            instance.put("count", value);
            return getBuilderAfterCount(instance);
        }
        
        default T count(float value) {
            var instance = getInstance();
            instance.put("count", value);
            return getBuilderAfterCount(instance);
        }
        
        default T count(long value) {
            var instance = getInstance();
            instance.put("count", value);
            return getBuilderAfterCount(instance);
        }
        
        default T count(double value) {
            var instance = getInstance();
            instance.put("count", value);
            return getBuilderAfterCount(instance);
        }
    }
    
    public interface SetterForResults <T> {
        Map<String, Object> getInstance();
        T getBuilderAfterResults(Map<String, Object> instance);
        
        default T results(List<Map<String, String>> value) {
            var instance = getInstance();
            instance.put("results", value);
            return getBuilderAfterResults(instance);
        }
    }
    
    public static class PaginatedResultMyObjectDtoMap00Builder implements GenericBuilder<Map<String, Object>> {
        private final Map<String, Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "count",
            "results"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public PaginatedResultMyObjectDtoMap00Builder(Map<String, Object> instance) {
            this.instance = instance;
        }
        public Map<String, Object> build() {
            return instance;
        }
    }
    
    public static class PaginatedResultMyObjectDtoMap01Builder implements SetterForResults<PaginatedResultMyObjectDtoMap00Builder> {
        private final Map<String, Object> instance;
        public PaginatedResultMyObjectDtoMap01Builder(Map<String, Object> instance) {
            this.instance = instance;
        }
        public Map<String, Object> getInstance() {
            return instance;
        }
        public PaginatedResultMyObjectDtoMap00Builder getBuilderAfterResults(Map<String, Object> instance) {
            return new PaginatedResultMyObjectDtoMap00Builder(instance);
        }
    }
    
    public static class PaginatedResultMyObjectDtoMap10Builder implements SetterForCount<PaginatedResultMyObjectDtoMap00Builder> {
        private final Map<String, Object> instance;
        public PaginatedResultMyObjectDtoMap10Builder(Map<String, Object> instance) {
            this.instance = instance;
        }
        public Map<String, Object> getInstance() {
            return instance;
        }
        public PaginatedResultMyObjectDtoMap00Builder getBuilderAfterCount(Map<String, Object> instance) {
            return new PaginatedResultMyObjectDtoMap00Builder(instance);
        }
    }
    
    public static class PaginatedResultMyObjectDtoMapBuilder implements SetterForCount<PaginatedResultMyObjectDtoMap01Builder>, SetterForResults<PaginatedResultMyObjectDtoMap10Builder> {
        private final Map<String, Object> instance;
        public PaginatedResultMyObjectDtoMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Object> getInstance() {
            return instance;
        }
        public PaginatedResultMyObjectDtoMap01Builder getBuilderAfterCount(Map<String, Object> instance) {
            return new PaginatedResultMyObjectDtoMap01Builder(instance);
        }
        public PaginatedResultMyObjectDtoMap10Builder getBuilderAfterResults(Map<String, Object> instance) {
            return new PaginatedResultMyObjectDtoMap10Builder(instance);
        }
    }
    
    
    public sealed interface PaginatedResultMyObjectDto1Boxed permits PaginatedResultMyObjectDto1BoxedMap {
        @Nullable Object getData();
    }
    
    public record PaginatedResultMyObjectDto1BoxedMap(PaginatedResultMyObjectDtoMap data) implements PaginatedResultMyObjectDto1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class PaginatedResultMyObjectDto1 extends JsonSchema<PaginatedResultMyObjectDto1Boxed> implements MapSchemaValidator<PaginatedResultMyObjectDtoMap, PaginatedResultMyObjectDto1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable PaginatedResultMyObjectDto1 instance = null;
    
        protected PaginatedResultMyObjectDto1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("count", Count.class),
                    new PropertyEntry("results", Results.class)
                ))
                .required(Set.of(
                    "count",
                    "results"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static PaginatedResultMyObjectDto1 getInstance() {
            if (instance == null) {
                instance = new PaginatedResultMyObjectDto1();
            }
            return instance;
        }
        
        public PaginatedResultMyObjectDtoMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new InvalidTypeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                if (!(propertyInstance instanceof Object)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (Object) propertyInstance);
            }
            FrozenMap<Object> castProperties = new FrozenMap<>(properties);
            return new PaginatedResultMyObjectDtoMap(castProperties);
        }
        
        public PaginatedResultMyObjectDtoMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public PaginatedResultMyObjectDto1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new PaginatedResultMyObjectDto1BoxedMap(validate(arg, configuration));
        }
        @Override
        public PaginatedResultMyObjectDto1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
