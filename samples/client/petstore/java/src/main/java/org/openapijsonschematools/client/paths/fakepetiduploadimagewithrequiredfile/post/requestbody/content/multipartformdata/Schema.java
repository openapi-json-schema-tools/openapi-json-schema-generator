package org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.requestbody.content.multipartformdata;
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
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalMetadata extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable AdditionalMetadata instance = null;
        public static AdditionalMetadata getInstance() {
            if (instance == null) {
                instance = new AdditionalMetadata();
            }
            return instance;
        }
    }
    
    
    public static class RequiredFile extends StringJsonSchema.StringJsonSchema1 {
        // BinarySchema
        private static @Nullable RequiredFile instance = null;
        public static RequiredFile getInstance() {
            if (instance == null) {
                instance = new RequiredFile();
            }
            return instance;
        }
    }
    
    
    public static class SchemaMap extends FrozenMap<@Nullable Object> {
        protected SchemaMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "requiredFile"
        );
        public static final Set<String> optionalKeys = Set.of(
            "additionalMetadata"
        );
        public static SchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema1.getInstance().validate(arg, configuration);
        }
        
        public String requiredFile() {
                        @Nullable Object value = get("requiredFile");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for requiredFile");
            }
            return (String) value;
        }
        
        public String additionalMetadata() throws UnsetPropertyException {
            String key = "additionalMetadata";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for additionalMetadata");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForRequiredFile <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterRequiredFile(Map<String, @Nullable Object> instance);
        
        default T requiredFile(String value) {
            var instance = getInstance();
            instance.put("requiredFile", value);
            return getBuilderAfterRequiredFile(instance);
        }
    }
    
    public interface SetterForAdditionalMetadata <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAdditionalMetadata(Map<String, @Nullable Object> instance);
        
        default T additionalMetadata(String value) {
            var instance = getInstance();
            instance.put("additionalMetadata", value);
            return getBuilderAfterAdditionalMetadata(instance);
        }
    }
    
    public static class SchemaMap0Builder extends UnsetAddPropsSetter<SchemaMap0Builder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForAdditionalMetadata<SchemaMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "requiredFile",
            "additionalMetadata"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public SchemaMap0Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0Builder getBuilderAfterAdditionalMetadata(Map<String, @Nullable Object> instance) {
            return this;
        }
        public SchemaMap0Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class SchemaMapBuilder implements SetterForRequiredFile<SchemaMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0Builder getBuilderAfterRequiredFile(Map<String, @Nullable Object> instance) {
            return new SchemaMap0Builder(instance);
        }
    }
    
    
    public static abstract sealed class Schema1Boxed permits Schema1BoxedMap {}
    public static final class Schema1BoxedMap extends Schema1Boxed {
        public final SchemaMap data;
        private Schema1BoxedMap(SchemaMap data) {
            this.data = data;
        }
    }
    
    
    public static class Schema1 extends JsonSchema implements MapSchemaValidator<SchemaMap, Schema1BoxedMap> {
        private static @Nullable Schema1 instance = null;
    
        protected Schema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("additionalMetadata", AdditionalMetadata.class),
                    new PropertyEntry("requiredFile", RequiredFile.class)
                ))
                .required(Set.of(
                    "requiredFile"
                ))
            );
        }
    
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
        
        public SchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new SchemaMap(castProperties);
        }
        
        public SchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public Schema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Schema1BoxedMap(validate(arg, configuration));
        }
    }

}
