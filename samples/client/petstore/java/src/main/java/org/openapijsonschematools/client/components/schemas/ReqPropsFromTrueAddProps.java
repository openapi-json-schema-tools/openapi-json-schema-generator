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
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.BaseBuilder;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ReqPropsFromTrueAddProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends AnyTypeJsonSchema {
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class ReqPropsFromTrueAddPropsMap extends FrozenMap<@Nullable Object> {
        protected ReqPropsFromTrueAddPropsMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "invalid-name",
            "validName"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static ReqPropsFromTrueAddPropsMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ReqPropsFromTrueAddProps1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object validName() {
            return getOrThrow("validName");
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            return getOrThrow(name);
        }
    }
    
    public interface SetterForInvalidname <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterInvalidname(Map<String, @Nullable Object> instance);
        
        default T setInvalidHyphenMinusName(Void value) {
            var instance = getInstance();
            instance.put("invalid-name", null);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T setInvalidHyphenMinusName(boolean value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T setInvalidHyphenMinusName(String value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T setInvalidHyphenMinusName(int value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T setInvalidHyphenMinusName(float value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T setInvalidHyphenMinusName(long value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T setInvalidHyphenMinusName(double value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T setInvalidHyphenMinusName(List<?> value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
        
        default T setInvalidHyphenMinusName(Map<String, ?> value) {
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
    
    public interface SetterForAdditionalProperties<T> {
        Set<String> getKnownKeys();
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance);
        
        default T additionalProperty(String key, Void value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, null);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, boolean value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, String value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, int value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, float value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, long value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, double value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, List<?> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, Map<String, ?> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class ReqPropsFromTrueAddPropsMap00Builder implements BaseBuilder<@Nullable Object>, SetterForAdditionalProperties<ReqPropsFromTrueAddPropsMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "invalid-name",
            "validName"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ReqPropsFromTrueAddPropsMap00Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ReqPropsFromTrueAddPropsMap00Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class ReqPropsFromTrueAddPropsMap01Builder implements SetterForValidName<ReqPropsFromTrueAddPropsMap00Builder>, SetterForAdditionalProperties<ReqPropsFromTrueAddPropsMap01Builder> {
        private final Map<String, @Nullable Object> instance;
        public ReqPropsFromTrueAddPropsMap01Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ReqPropsFromTrueAddPropsMap00Builder getBuilderAfterValidName(Map<String, @Nullable Object> instance) {
            return new ReqPropsFromTrueAddPropsMap00Builder(instance);
        }
    }
    
    public static class ReqPropsFromTrueAddPropsMap10Builder implements SetterForInvalidname<ReqPropsFromTrueAddPropsMap00Builder>, SetterForAdditionalProperties<ReqPropsFromTrueAddPropsMap10Builder> {
        private final Map<String, @Nullable Object> instance;
        public ReqPropsFromTrueAddPropsMap10Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ReqPropsFromTrueAddPropsMap00Builder getBuilderAfterInvalidname(Map<String, @Nullable Object> instance) {
            return new ReqPropsFromTrueAddPropsMap00Builder(instance);
        }
    }
    
    public static class ReqPropsFromTrueAddPropsMapBuilder implements SetterForInvalidname<ReqPropsFromTrueAddPropsMap01Builder>, SetterForValidName<ReqPropsFromTrueAddPropsMap10Builder>, SetterForAdditionalProperties<ReqPropsFromTrueAddPropsMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        public ReqPropsFromTrueAddPropsMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ReqPropsFromTrueAddPropsMap01Builder getBuilderAfterInvalidname(Map<String, @Nullable Object> instance) {
            return new ReqPropsFromTrueAddPropsMap01Builder(instance);
        }
        public ReqPropsFromTrueAddPropsMap10Builder getBuilderAfterValidName(Map<String, @Nullable Object> instance) {
            return new ReqPropsFromTrueAddPropsMap10Builder(instance);
        }
    }
    
    
    public static class ReqPropsFromTrueAddProps1 extends JsonSchema implements MapSchemaValidator<ReqPropsFromTrueAddPropsMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ReqPropsFromTrueAddProps1 instance = null;
    
        protected ReqPropsFromTrueAddProps1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .required(Set.of(
                    "invalid-name",
                    "validName"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static ReqPropsFromTrueAddProps1 getInstance() {
            if (instance == null) {
                instance = new ReqPropsFromTrueAddProps1();
            }
            return instance;
        }
        
        public ReqPropsFromTrueAddPropsMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ReqPropsFromTrueAddPropsMap(castProperties);
        }
        
        public ReqPropsFromTrueAddPropsMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
