package org.openapijsonschematools.client.paths.petpetiduploadimage.post.requestbody.content.multipartformdata;
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
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class MultipartformdataSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class MultipartformdataAdditionalMetadata extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable MultipartformdataAdditionalMetadata instance = null;
        public static MultipartformdataAdditionalMetadata getInstance() {
            if (instance == null) {
                instance = new MultipartformdataAdditionalMetadata();
            }
            return instance;
        }
    }
    
    
    public static class MultipartformdataFile extends StringJsonSchema.StringJsonSchema1 {
        // BinarySchema
        private static @Nullable MultipartformdataFile instance = null;
        public static MultipartformdataFile getInstance() {
            if (instance == null) {
                instance = new MultipartformdataFile();
            }
            return instance;
        }
    }
    
    
    public static class MultipartformdataSchemaMap extends FrozenMap<@Nullable Object> {
        protected MultipartformdataSchemaMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "additionalMetadata",
            "file"
        );
        public static MultipartformdataSchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return MultipartformdataSchema1.getInstance().validate(arg, configuration);
        }
        
        public String additionalMetadata() throws UnsetPropertyException {
            String key = "additionalMetadata";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for additionalMetadata");
            }
            return (String) value;
        }
        
        public String file() throws UnsetPropertyException {
            String key = "file";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for file");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForMultipartformdataAdditionalMetadata <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMultipartformdataAdditionalMetadata(Map<String, @Nullable Object> instance);
        
        default T additionalMetadata(String value) {
            var instance = getInstance();
            instance.put("additionalMetadata", value);
            return getBuilderAfterMultipartformdataAdditionalMetadata(instance);
        }
    }
    
    public interface SetterForMultipartformdataFile <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMultipartformdataFile(Map<String, @Nullable Object> instance);
        
        default T file(String value) {
            var instance = getInstance();
            instance.put("file", value);
            return getBuilderAfterMultipartformdataFile(instance);
        }
    }
    
    public static class MultipartformdataSchemaMapBuilder extends UnsetAddPropsSetter<MultipartformdataSchemaMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForMultipartformdataAdditionalMetadata<MultipartformdataSchemaMapBuilder>, SetterForMultipartformdataFile<MultipartformdataSchemaMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "additionalMetadata",
            "file"
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
        public MultipartformdataSchemaMapBuilder getBuilderAfterMultipartformdataAdditionalMetadata(Map<String, @Nullable Object> instance) {
            return this;
        }
        public MultipartformdataSchemaMapBuilder getBuilderAfterMultipartformdataFile(Map<String, @Nullable Object> instance) {
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
    
    
    public static class MultipartformdataSchema1 extends JsonSchema<MultipartformdataSchema1Boxed> implements MapSchemaValidator<MultipartformdataSchemaMap, MultipartformdataSchema1BoxedMap> {
        private static @Nullable MultipartformdataSchema1 instance = null;
    
        protected MultipartformdataSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("additionalMetadata", MultipartformdataAdditionalMetadata.class),
                    new PropertyEntry("file", MultipartformdataFile.class)
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
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new MultipartformdataSchemaMap(castProperties);
        }
        
        public MultipartformdataSchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
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
        public MultipartformdataSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new MultipartformdataSchema1BoxedMap(validate(arg, configuration));
        }
        @Override
        public MultipartformdataSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
