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
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ReqPropsFromUnsetAddProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ReqPropsFromUnsetAddPropsMap extends FrozenMap<@Nullable Object> {
        protected ReqPropsFromUnsetAddPropsMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "invalid-name",
            "validName"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static ReqPropsFromUnsetAddPropsMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return ReqPropsFromUnsetAddProps1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object validName() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForInvalidname <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterInvalidname(Map<String, @Nullable Object> instance);
        
        default T invalidHyphenMinusName(Void value) {
            var instance = getInstance();
            instance.put("invalid-name", null);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T invalidHyphenMinusName(boolean value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T invalidHyphenMinusName(String value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T invalidHyphenMinusName(int value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T invalidHyphenMinusName(float value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T invalidHyphenMinusName(long value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T invalidHyphenMinusName(double value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T invalidHyphenMinusName(List<?> value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T invalidHyphenMinusName(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
    }
    
    public interface SetterForValidName <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterValidName(Map<String, @Nullable Object> instance);
        
        default T validName(Void value) {
            var instance = getInstance();
            instance.put("validName", null);
            return getBuilderAfterValidName(instance);
        }
        
        default T validName(boolean value) {
            var instance = getInstance();
            instance.put("validName", value);
            return getBuilderAfterValidName(instance);
        }
        
        default T validName(String value) {
            var instance = getInstance();
            instance.put("validName", value);
            return getBuilderAfterValidName(instance);
        }
        
        default T validName(int value) {
            var instance = getInstance();
            instance.put("validName", value);
            return getBuilderAfterValidName(instance);
        }
        
        default T validName(float value) {
            var instance = getInstance();
            instance.put("validName", value);
            return getBuilderAfterValidName(instance);
        }
        
        default T validName(long value) {
            var instance = getInstance();
            instance.put("validName", value);
            return getBuilderAfterValidName(instance);
        }
        
        default T validName(double value) {
            var instance = getInstance();
            instance.put("validName", value);
            return getBuilderAfterValidName(instance);
        }
        
        default T validName(List<?> value) {
            var instance = getInstance();
            instance.put("validName", value);
            return getBuilderAfterValidName(instance);
        }
        
        default T validName(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("validName", value);
            return getBuilderAfterValidName(instance);
        }
    }
    
    public static class ReqPropsFromUnsetAddPropsMap00Builder extends UnsetAddPropsSetter<ReqPropsFromUnsetAddPropsMap00Builder> implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "invalid-name",
            "validName"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ReqPropsFromUnsetAddPropsMap00Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ReqPropsFromUnsetAddPropsMap00Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class ReqPropsFromUnsetAddPropsMap01Builder implements SetterForValidName<ReqPropsFromUnsetAddPropsMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public ReqPropsFromUnsetAddPropsMap01Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ReqPropsFromUnsetAddPropsMap00Builder getBuilderAfterValidName(Map<String, @Nullable Object> instance) {
            return new ReqPropsFromUnsetAddPropsMap00Builder(instance);
        }
    }
    
    public static class ReqPropsFromUnsetAddPropsMap10Builder implements SetterForInvalidname<ReqPropsFromUnsetAddPropsMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public ReqPropsFromUnsetAddPropsMap10Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ReqPropsFromUnsetAddPropsMap00Builder getBuilderAfterInvalidname(Map<String, @Nullable Object> instance) {
            return new ReqPropsFromUnsetAddPropsMap00Builder(instance);
        }
    }
    
    public static class ReqPropsFromUnsetAddPropsMapBuilder implements SetterForInvalidname<ReqPropsFromUnsetAddPropsMap01Builder>, SetterForValidName<ReqPropsFromUnsetAddPropsMap10Builder> {
        private final Map<String, @Nullable Object> instance;
        public ReqPropsFromUnsetAddPropsMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ReqPropsFromUnsetAddPropsMap01Builder getBuilderAfterInvalidname(Map<String, @Nullable Object> instance) {
            return new ReqPropsFromUnsetAddPropsMap01Builder(instance);
        }
        public ReqPropsFromUnsetAddPropsMap10Builder getBuilderAfterValidName(Map<String, @Nullable Object> instance) {
            return new ReqPropsFromUnsetAddPropsMap10Builder(instance);
        }
    }
    
    
    public sealed interface ReqPropsFromUnsetAddProps1Boxed permits ReqPropsFromUnsetAddProps1BoxedMap {
        @Nullable Object getData();
    }
    
    public record ReqPropsFromUnsetAddProps1BoxedMap(ReqPropsFromUnsetAddPropsMap data) implements ReqPropsFromUnsetAddProps1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ReqPropsFromUnsetAddProps1 extends JsonSchema<ReqPropsFromUnsetAddProps1Boxed> implements MapSchemaValidator<ReqPropsFromUnsetAddPropsMap, ReqPropsFromUnsetAddProps1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ReqPropsFromUnsetAddProps1 instance = null;
    
        protected ReqPropsFromUnsetAddProps1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .required(Set.of(
                    "invalid-name",
                    "validName"
                ))
            );
        }
    
        public static ReqPropsFromUnsetAddProps1 getInstance() {
            if (instance == null) {
                instance = new ReqPropsFromUnsetAddProps1();
            }
            return instance;
        }
        
        public ReqPropsFromUnsetAddPropsMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ReqPropsFromUnsetAddPropsMap(castProperties);
        }
        
        public ReqPropsFromUnsetAddPropsMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ReqPropsFromUnsetAddProps1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ReqPropsFromUnsetAddProps1BoxedMap(validate(arg, configuration));
        }
        @Override
        public ReqPropsFromUnsetAddProps1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
