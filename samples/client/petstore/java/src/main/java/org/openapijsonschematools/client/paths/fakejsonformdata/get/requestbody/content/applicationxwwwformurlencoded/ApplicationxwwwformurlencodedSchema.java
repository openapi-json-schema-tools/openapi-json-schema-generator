package org.openapijsonschematools.client.paths.fakejsonformdata.get.requestbody.content.applicationxwwwformurlencoded;
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
    
    
    public static class ApplicationxwwwformurlencodedParam extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable ApplicationxwwwformurlencodedParam instance = null;
        public static ApplicationxwwwformurlencodedParam getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedParam();
            }
            return instance;
        }
    }
    
    
    public static class ApplicationxwwwformurlencodedParam2 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable ApplicationxwwwformurlencodedParam2 instance = null;
        public static ApplicationxwwwformurlencodedParam2 getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedParam2();
            }
            return instance;
        }
    }
    
    
    public static class ApplicationxwwwformurlencodedSchemaMap extends FrozenMap<@Nullable Object> {
        protected ApplicationxwwwformurlencodedSchemaMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "param",
            "param2"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static ApplicationxwwwformurlencodedSchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ApplicationxwwwformurlencodedSchema1.getInstance().validate(arg, configuration);
        }
        
        public String param() {
                        @Nullable Object value = get("param");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for param");
            }
            return (String) value;
        }
        
        public String param2() {
                        @Nullable Object value = get("param2");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for param2");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedParam <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedParam(Map<String, @Nullable Object> instance);
        
        default T param(String value) {
            var instance = getInstance();
            instance.put("param", value);
            return getBuilderAfterApplicationxwwwformurlencodedParam(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedParam2 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedParam2(Map<String, @Nullable Object> instance);
        
        default T param2(String value) {
            var instance = getInstance();
            instance.put("param2", value);
            return getBuilderAfterApplicationxwwwformurlencodedParam2(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap00Builder extends UnsetAddPropsSetter<ApplicationxwwwformurlencodedSchemaMap00Builder> implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "param",
            "param2"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ApplicationxwwwformurlencodedSchemaMap00Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap00Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap01Builder implements SetterForApplicationxwwwformurlencodedParam2<ApplicationxwwwformurlencodedSchemaMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap01Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap00Builder getBuilderAfterApplicationxwwwformurlencodedParam2(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap00Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap10Builder implements SetterForApplicationxwwwformurlencodedParam<ApplicationxwwwformurlencodedSchemaMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap10Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap00Builder getBuilderAfterApplicationxwwwformurlencodedParam(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap00Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMapBuilder implements SetterForApplicationxwwwformurlencodedParam<ApplicationxwwwformurlencodedSchemaMap01Builder>, SetterForApplicationxwwwformurlencodedParam2<ApplicationxwwwformurlencodedSchemaMap10Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap01Builder getBuilderAfterApplicationxwwwformurlencodedParam(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap01Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap10Builder getBuilderAfterApplicationxwwwformurlencodedParam2(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap10Builder(instance);
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
                    new PropertyEntry("param", ApplicationxwwwformurlencodedParam.class),
                    new PropertyEntry("param2", ApplicationxwwwformurlencodedParam2.class)
                ))
                .required(Set.of(
                    "param",
                    "param2"
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
