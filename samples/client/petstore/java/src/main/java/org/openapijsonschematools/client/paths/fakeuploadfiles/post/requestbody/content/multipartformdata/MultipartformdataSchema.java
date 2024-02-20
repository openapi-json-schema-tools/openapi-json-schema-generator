package org.openapijsonschematools.client.paths.fakeuploadfiles.post.requestbody.content.multipartformdata;
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
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class MultipartformdataSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class MultipartformdataItems extends StringJsonSchema.StringJsonSchema1 {
        // BinarySchema
        private static @Nullable MultipartformdataItems instance = null;
        public static MultipartformdataItems getInstance() {
            if (instance == null) {
                instance = new MultipartformdataItems();
            }
            return instance;
        }
    }
    
    
    public static class MultipartformdataFilesList extends FrozenList<String> {
        protected MultipartformdataFilesList(FrozenList<String> m) {
            super(m);
        }
        public static MultipartformdataFilesList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return MultipartformdataFiles.getInstance().validate(arg, configuration);
        }
    }
    
    public static class MultipartformdataFilesListBuilder {
        // class to build List<String>
        private final List<String> list;
    
        public MultipartformdataFilesListBuilder() {
            list = new ArrayList<>();
        }
    
        public MultipartformdataFilesListBuilder(List<String> list) {
            this.list = list;
        }
        
        public MultipartformdataFilesListBuilder add(String item) {
            list.add(item);
            return this;
        }
    
        public List<String> build() {
            return list;
        }
    }
    
    
    public sealed interface MultipartformdataFilesBoxed permits MultipartformdataFilesBoxedList {
        @Nullable Object getData();
    }
    
    public record MultipartformdataFilesBoxedList(MultipartformdataFilesList data) implements MultipartformdataFilesBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class MultipartformdataFiles extends JsonSchema implements ListSchemaValidator<MultipartformdataFilesList, MultipartformdataFilesBoxedList> {
        private static @Nullable MultipartformdataFiles instance = null;
    
        protected MultipartformdataFiles() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(MultipartformdataItems.class)
            );
        }
    
        public static MultipartformdataFiles getInstance() {
            if (instance == null) {
                instance = new MultipartformdataFiles();
            }
            return instance;
        }
        
        @Override
        public MultipartformdataFilesList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<String> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof String)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((String) itemInstance);
                i += 1;
            }
            FrozenList<String> newInstanceItems = new FrozenList<>(items);
            return new MultipartformdataFilesList(newInstanceItems);
        }
        
        public MultipartformdataFilesList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public MultipartformdataFilesBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new MultipartformdataFilesBoxedList(validate(arg, configuration));
        }
    }    
    
    public static class MultipartformdataSchemaMap extends FrozenMap<@Nullable Object> {
        protected MultipartformdataSchemaMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "files"
        );
        public static MultipartformdataSchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return MultipartformdataSchema1.getInstance().validate(arg, configuration);
        }
        
        public MultipartformdataFilesList files() throws UnsetPropertyException {
            String key = "files";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof MultipartformdataFilesList)) {
                throw new InvalidTypeException("Invalid value stored for files");
            }
            return (MultipartformdataFilesList) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForMultipartformdataFiles <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMultipartformdataFiles(Map<String, @Nullable Object> instance);
        
        default T files(List<String> value) {
            var instance = getInstance();
            instance.put("files", value);
            return getBuilderAfterMultipartformdataFiles(instance);
        }
    }
    
    public static class MultipartformdataSchemaMapBuilder extends UnsetAddPropsSetter<MultipartformdataSchemaMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForMultipartformdataFiles<MultipartformdataSchemaMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "files"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public MultipartformdataSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public MultipartformdataSchemaMapBuilder getBuilderAfterMultipartformdataFiles(Map<String, @Nullable Object> instance) {
            return this;
        }
        public MultipartformdataSchemaMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface MultipartformdataSchema1Boxed permits MultipartformdataSchema1BoxedMap {
        @Nullable Object getData();
    }
    
    public record MultipartformdataSchema1BoxedMap(MultipartformdataSchemaMap data) implements MultipartformdataSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class MultipartformdataSchema1 extends JsonSchema implements MapSchemaValidator<MultipartformdataSchemaMap, MultipartformdataSchema1BoxedMap> {
        private static @Nullable MultipartformdataSchema1 instance = null;
    
        protected MultipartformdataSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("files", MultipartformdataFiles.class)
                ))
            );
        }
    
        public static MultipartformdataSchema1 getInstance() {
            if (instance == null) {
                instance = new MultipartformdataSchema1();
            }
            return instance;
        }
        
        public MultipartformdataSchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new MultipartformdataSchemaMap(castProperties);
        }
        
        public MultipartformdataSchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public MultipartformdataSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new MultipartformdataSchema1BoxedMap(validate(arg, configuration));
        }
    }

}
