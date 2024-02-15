package org.openapijsonschematools.client.paths.petpetid.post.requestbody.content.applicationxwwwformurlencoded;
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

public class ApplicationxwwwformurlencodedSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ApplicationxwwwformurlencodedName extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable ApplicationxwwwformurlencodedName instance = null;
        public static ApplicationxwwwformurlencodedName getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedName();
            }
            return instance;
        }
    }
    
    
    public static class ApplicationxwwwformurlencodedStatus extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable ApplicationxwwwformurlencodedStatus instance = null;
        public static ApplicationxwwwformurlencodedStatus getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedStatus();
            }
            return instance;
        }
    }
    
    
    public static class ApplicationxwwwformurlencodedSchemaMap extends FrozenMap<@Nullable Object> {
        protected ApplicationxwwwformurlencodedSchemaMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "name",
            "status"
        );
        public static ApplicationxwwwformurlencodedSchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ApplicationxwwwformurlencodedSchema1.getInstance().validate(arg, configuration);
        }
        
        public String name() throws UnsetPropertyException {
            String key = "name";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for name");
            }
            return (String) value;
        }
        
        public String status() throws UnsetPropertyException {
            String key = "status";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for status");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedName <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedName(Map<String, @Nullable Object> instance);
        
        default T name(String value) {
            var instance = getInstance();
            instance.put("name", value);
            return getBuilderAfterApplicationxwwwformurlencodedName(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedStatus <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedStatus(Map<String, @Nullable Object> instance);
        
        default T status(String value) {
            var instance = getInstance();
            instance.put("status", value);
            return getBuilderAfterApplicationxwwwformurlencodedStatus(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMapBuilder extends UnsetAddPropsSetter<ApplicationxwwwformurlencodedSchemaMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForApplicationxwwwformurlencodedName<ApplicationxwwwformurlencodedSchemaMapBuilder>, SetterForApplicationxwwwformurlencodedStatus<ApplicationxwwwformurlencodedSchemaMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "name",
            "status"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ApplicationxwwwformurlencodedSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMapBuilder getBuilderAfterApplicationxwwwformurlencodedName(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMapBuilder getBuilderAfterApplicationxwwwformurlencodedStatus(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class ApplicationxwwwformurlencodedSchema1Boxed permits ApplicationxwwwformurlencodedSchema1BoxedMap {
        public abstract @Nullable Object data();
    }
    
    public static final class ApplicationxwwwformurlencodedSchema1BoxedMap extends ApplicationxwwwformurlencodedSchema1Boxed {
        public final ApplicationxwwwformurlencodedSchemaMap data;
        private ApplicationxwwwformurlencodedSchema1BoxedMap(ApplicationxwwwformurlencodedSchemaMap data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    public static class ApplicationxwwwformurlencodedSchema1 extends JsonSchema implements MapSchemaValidator<ApplicationxwwwformurlencodedSchemaMap, ApplicationxwwwformurlencodedSchema1BoxedMap> {
        private static @Nullable ApplicationxwwwformurlencodedSchema1 instance = null;
    
        protected ApplicationxwwwformurlencodedSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("name", ApplicationxwwwformurlencodedName.class),
                    new PropertyEntry("status", ApplicationxwwwformurlencodedStatus.class)
                ))
            );
        }
    
        public static ApplicationxwwwformurlencodedSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedSchema1();
            }
            return instance;
        }
        
        public ApplicationxwwwformurlencodedSchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ApplicationxwwwformurlencodedSchemaMap(castProperties);
        }
        
        public ApplicationxwwwformurlencodedSchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public ApplicationxwwwformurlencodedSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApplicationxwwwformurlencodedSchema1BoxedMap(validate(arg, configuration));
        }
    }

}
