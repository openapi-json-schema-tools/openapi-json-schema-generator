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
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.Int32JsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
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

public class MultiPropertiesSchema {
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
    
    
    public static class Status extends Int32JsonSchema.Int32JsonSchema1 {
        private static @Nullable Status instance = null;
        public static Status getInstance() {
            if (instance == null) {
                instance = new Status();
            }
            return instance;
        }
    }
    
    
    public static class Message extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Message instance = null;
        public static Message getInstance() {
            if (instance == null) {
                instance = new Message();
            }
            return instance;
        }
    }
    
    
    public static class DataList extends FrozenList<ItemsSchema.ItemsSchemaMap> {
        protected DataList(FrozenList<ItemsSchema.ItemsSchemaMap> m) {
            super(m);
        }
        public static DataList of(List<Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return Data.getInstance().validate(arg, configuration);
        }
    }
    
    public static class DataListBuilder {
        // class to build List<Map<String, @Nullable Object>>
        private final List<Map<String, @Nullable Object>> list;
    
        public DataListBuilder() {
            list = new ArrayList<>();
        }
    
        public DataListBuilder(List<Map<String, @Nullable Object>> list) {
            this.list = list;
        }
        
        public DataListBuilder add(Map<String, @Nullable Object> item) {
            list.add(item);
            return this;
        }
    
        public List<Map<String, @Nullable Object>> build() {
            return list;
        }
    }
    
    
    public sealed interface DataBoxed permits DataBoxedList {
        @Nullable Object getData();
    }
    
    public record DataBoxedList(DataList data) implements DataBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Data extends JsonSchema<DataBoxed> implements ListSchemaValidator<DataList, DataBoxedList> {
        private static @Nullable Data instance = null;
    
        protected Data() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(ItemsSchema.ItemsSchema1.class)
            );
        }
    
        public static Data getInstance() {
            if (instance == null) {
                instance = new Data();
            }
            return instance;
        }
        
        @Override
        public DataList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<ItemsSchema.ItemsSchemaMap> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof ItemsSchema.ItemsSchemaMap)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                items.add((ItemsSchema.ItemsSchemaMap) itemInstance);
                i += 1;
            }
            FrozenList<ItemsSchema.ItemsSchemaMap> newInstanceItems = new FrozenList<>(items);
            return new DataList(newInstanceItems);
        }
        
        public DataList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public DataBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new DataBoxedList(validate(arg, configuration));
        }
        @Override
        public DataBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class MultiPropertiesSchemaMap extends FrozenMap<Object> {
        protected MultiPropertiesSchemaMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "status"
        );
        public static final Set<String> optionalKeys = Set.of(
            "data",
            "message"
        );
        public static MultiPropertiesSchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return MultiPropertiesSchema1.getInstance().validate(arg, configuration);
        }
        
        public Number status() {
                        Object value = get("status");
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for status");
            }
            return (Number) value;
        }
        
        public DataList data() throws UnsetPropertyException {
            String key = "data";
            throwIfKeyNotPresent(key);
            Object value = get(key);
            if (!(value instanceof DataList)) {
                throw new RuntimeException("Invalid value stored for data");
            }
            return (DataList) value;
        }
        
        public String message() throws UnsetPropertyException {
            String key = "message";
            throwIfKeyNotPresent(key);
            Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for message");
            }
            return (String) value;
        }
    }
    
    public interface SetterForStatus <T> {
        Map<String, Object> getInstance();
        T getBuilderAfterStatus(Map<String, Object> instance);
        
        default T status(int value) {
            var instance = getInstance();
            instance.put("status", value);
            return getBuilderAfterStatus(instance);
        }
        
        default T status(float value) {
            var instance = getInstance();
            instance.put("status", value);
            return getBuilderAfterStatus(instance);
        }
    }
    
    public interface SetterForData <T> {
        Map<String, Object> getInstance();
        T getBuilderAfterData(Map<String, Object> instance);
        
        default T data(List<Map<String, @Nullable Object>> value) {
            var instance = getInstance();
            instance.put("data", value);
            return getBuilderAfterData(instance);
        }
    }
    
    public interface SetterForMessage <T> {
        Map<String, Object> getInstance();
        T getBuilderAfterMessage(Map<String, Object> instance);
        
        default T message(String value) {
            var instance = getInstance();
            instance.put("message", value);
            return getBuilderAfterMessage(instance);
        }
    }
    
    public static class MultiPropertiesSchemaMap0Builder implements GenericBuilder<Map<String, Object>>, SetterForData<MultiPropertiesSchemaMap0Builder>, SetterForMessage<MultiPropertiesSchemaMap0Builder> {
        private final Map<String, Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "status",
            "data",
            "message"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public MultiPropertiesSchemaMap0Builder(Map<String, Object> instance) {
            this.instance = instance;
        }
        public Map<String, Object> build() {
            return instance;
        }
        public Map<String, Object> getInstance() {
            return instance;
        }
        public MultiPropertiesSchemaMap0Builder getBuilderAfterData(Map<String, Object> instance) {
            return this;
        }
        public MultiPropertiesSchemaMap0Builder getBuilderAfterMessage(Map<String, Object> instance) {
            return this;
        }
    }
    
    public static class MultiPropertiesSchemaMapBuilder implements SetterForStatus<MultiPropertiesSchemaMap0Builder> {
        private final Map<String, Object> instance;
        public MultiPropertiesSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Object> getInstance() {
            return instance;
        }
        public MultiPropertiesSchemaMap0Builder getBuilderAfterStatus(Map<String, Object> instance) {
            return new MultiPropertiesSchemaMap0Builder(instance);
        }
    }
    
    
    public sealed interface MultiPropertiesSchema1Boxed permits MultiPropertiesSchema1BoxedMap {
        @Nullable Object getData();
    }
    
    public record MultiPropertiesSchema1BoxedMap(MultiPropertiesSchemaMap data) implements MultiPropertiesSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class MultiPropertiesSchema1 extends JsonSchema<MultiPropertiesSchema1Boxed> implements MapSchemaValidator<MultiPropertiesSchemaMap, MultiPropertiesSchema1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable MultiPropertiesSchema1 instance = null;
    
        protected MultiPropertiesSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("status", Status.class),
                    new PropertyEntry("data", Data.class),
                    new PropertyEntry("message", Message.class)
                ))
                .required(Set.of(
                    "status"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static MultiPropertiesSchema1 getInstance() {
            if (instance == null) {
                instance = new MultiPropertiesSchema1();
            }
            return instance;
        }
        
        public MultiPropertiesSchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new RuntimeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                if (!(propertyInstance instanceof Object)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (Object) propertyInstance);
            }
            FrozenMap<Object> castProperties = new FrozenMap<>(properties);
            return new MultiPropertiesSchemaMap(castProperties);
        }
        
        public MultiPropertiesSchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public MultiPropertiesSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new MultiPropertiesSchema1BoxedMap(validate(arg, configuration));
        }
        @Override
        public MultiPropertiesSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
