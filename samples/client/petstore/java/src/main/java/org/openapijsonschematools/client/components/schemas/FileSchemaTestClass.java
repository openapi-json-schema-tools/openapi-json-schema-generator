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
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
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

public class FileSchemaTestClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class FilesList extends FrozenList<File.FileMap> {
        protected FilesList(FrozenList<File.FileMap> m) {
            super(m);
        }
        public static FilesList of(List<Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return Files.getInstance().validate(arg, configuration);
        }
    }
    
    public static class FilesListBuilder {
        // class to build List<Map<String, @Nullable Object>>
        private final List<Map<String, @Nullable Object>> list;
    
        public FilesListBuilder() {
            list = new ArrayList<>();
        }
    
        public FilesListBuilder(List<Map<String, @Nullable Object>> list) {
            this.list = list;
        }
        
        public FilesListBuilder add(Map<String, @Nullable Object> item) {
            list.add(item);
            return this;
        }
    
        public List<Map<String, @Nullable Object>> build() {
            return list;
        }
    }
    
    
    public static class Files extends JsonSchema implements ListSchemaValidator<FilesList> {
        private static @Nullable Files instance = null;
    
        protected Files() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(File.File1.class)
            );
        }
    
        public static Files getInstance() {
            if (instance == null) {
                instance = new Files();
            }
            return instance;
        }
        
        @Override
        public FilesList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<File.FileMap> items = new ArrayList<>();
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
                if (!(itemInstance instanceof File.FileMap)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((File.FileMap) itemInstance);
                i += 1;
            }
            FrozenList<File.FileMap> newInstanceItems = new FrozenList<>(items);
            return new FilesList(newInstanceItems);
        }
        
        public FilesList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
    }    
    
    public static class FileSchemaTestClassMap extends FrozenMap<@Nullable Object> {
        protected FileSchemaTestClassMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "file",
            "files"
        );
        public static FileSchemaTestClassMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return FileSchemaTestClass1.getInstance().validate(arg, configuration);
        }
        
        public File.FileMap file() throws UnsetPropertyException {
            String key = "file";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof File.FileMap)) {
                throw new InvalidTypeException("Invalid value stored for file");
            }
            return (File.FileMap) value;
        }
        
        public FilesList files() throws UnsetPropertyException {
            String key = "files";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof FilesList)) {
                throw new InvalidTypeException("Invalid value stored for files");
            }
            return (FilesList) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForFile <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFile(Map<String, @Nullable Object> instance);
        
        default T file(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("file", value);
            return getBuilderAfterFile(instance);
        }
    }
    
    public interface SetterForFiles <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFiles(Map<String, @Nullable Object> instance);
        
        default T files(List<Map<String, @Nullable Object>> value) {
            var instance = getInstance();
            instance.put("files", value);
            return getBuilderAfterFiles(instance);
        }
    }
    
    public static class FileSchemaTestClassMapBuilder extends UnsetAddPropsSetter<FileSchemaTestClassMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForFile<FileSchemaTestClassMapBuilder>, SetterForFiles<FileSchemaTestClassMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "file",
            "files"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FileSchemaTestClassMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FileSchemaTestClassMapBuilder getBuilderAfterFile(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FileSchemaTestClassMapBuilder getBuilderAfterFiles(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FileSchemaTestClassMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public static class FileSchemaTestClass1 extends JsonSchema implements MapSchemaValidator<FileSchemaTestClassMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable FileSchemaTestClass1 instance = null;
    
        protected FileSchemaTestClass1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("file", File.File1.class),
                    new PropertyEntry("files", Files.class)
                ))
            );
        }
    
        public static FileSchemaTestClass1 getInstance() {
            if (instance == null) {
                instance = new FileSchemaTestClass1();
            }
            return instance;
        }
        
        public FileSchemaTestClassMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new FileSchemaTestClassMap(castProperties);
        }
        
        public FileSchemaTestClassMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
