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
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ReqPropsFromExplicitAddProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class ReqPropsFromExplicitAddPropsMap extends FrozenMap<String> {
        protected ReqPropsFromExplicitAddPropsMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "invalid-name",
            "validName"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static ReqPropsFromExplicitAddPropsMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return ReqPropsFromExplicitAddProps1.getInstance().validate(arg, configuration);
        }
        
        public String validName() {
            return getOrThrow("validName");
        }
        
        public String getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            return getOrThrow(name);
        }
    }
    
    public interface SetterForInvalidname <T> {
        Map<String, String> getInstance();
        T getBuilderAfterInvalidname(Map<String, String> instance);
        
        default T setInvalidHyphenMinusName(String value) {
            var instance = getInstance();
            instance.put("invalid-name", value);
            return getBuilderAfterInvalidname(instance);
        }
    }
    
    public interface SetterForValidName <T> {
        Map<String, String> getInstance();
        T getBuilderAfterValidName(Map<String, String> instance);
        
        default T validName(String value) {
            var instance = getInstance();
            instance.put("validName", value);
            return getBuilderAfterValidName(instance);
        }
    }
    
    public interface SetterForAdditionalProperties<T> {
        Set<String> getKnownKeys();
        Map<String, String> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, String> instance);
        
        default T additionalProperty(String key, String value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class ReqPropsFromExplicitAddPropsMap00Builder implements GenericBuilder<Map<String, String>>, SetterForAdditionalProperties<ReqPropsFromExplicitAddPropsMap00Builder> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "invalid-name",
            "validName"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ReqPropsFromExplicitAddPropsMap00Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> build() {
            return instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public ReqPropsFromExplicitAddPropsMap00Builder getBuilderAfterAdditionalProperty(Map<String, String> instance) {
            return this;
        }
    }
    
    public static class ReqPropsFromExplicitAddPropsMap01Builder implements SetterForValidName<ReqPropsFromExplicitAddPropsMap00Builder> {
        private final Map<String, String> instance;
        public ReqPropsFromExplicitAddPropsMap01Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public ReqPropsFromExplicitAddPropsMap00Builder getBuilderAfterValidName(Map<String, String> instance) {
            return new ReqPropsFromExplicitAddPropsMap00Builder(instance);
        }
    }
    
    public static class ReqPropsFromExplicitAddPropsMap10Builder implements SetterForInvalidname<ReqPropsFromExplicitAddPropsMap00Builder> {
        private final Map<String, String> instance;
        public ReqPropsFromExplicitAddPropsMap10Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public ReqPropsFromExplicitAddPropsMap00Builder getBuilderAfterInvalidname(Map<String, String> instance) {
            return new ReqPropsFromExplicitAddPropsMap00Builder(instance);
        }
    }
    
    public static class ReqPropsFromExplicitAddPropsMapBuilder implements SetterForInvalidname<ReqPropsFromExplicitAddPropsMap01Builder>, SetterForValidName<ReqPropsFromExplicitAddPropsMap10Builder> {
        private final Map<String, String> instance;
        public ReqPropsFromExplicitAddPropsMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public ReqPropsFromExplicitAddPropsMap01Builder getBuilderAfterInvalidname(Map<String, String> instance) {
            return new ReqPropsFromExplicitAddPropsMap01Builder(instance);
        }
        public ReqPropsFromExplicitAddPropsMap10Builder getBuilderAfterValidName(Map<String, String> instance) {
            return new ReqPropsFromExplicitAddPropsMap10Builder(instance);
        }
    }
    
    
    public static abstract sealed class ReqPropsFromExplicitAddProps1Boxed permits ReqPropsFromExplicitAddProps1BoxedMap {}
    public static final class ReqPropsFromExplicitAddProps1BoxedMap extends ReqPropsFromExplicitAddProps1Boxed {
        public final ReqPropsFromExplicitAddPropsMap data;
        private ReqPropsFromExplicitAddProps1BoxedMap(ReqPropsFromExplicitAddPropsMap data) {
            this.data = data;
        }
    }
    
    
    public static class ReqPropsFromExplicitAddProps1 extends JsonSchema implements MapSchemaValidator<ReqPropsFromExplicitAddPropsMap, ReqPropsFromExplicitAddProps1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ReqPropsFromExplicitAddProps1 instance = null;
    
        protected ReqPropsFromExplicitAddProps1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .required(Set.of(
                    "invalid-name",
                    "validName"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static ReqPropsFromExplicitAddProps1 getInstance() {
            if (instance == null) {
                instance = new ReqPropsFromExplicitAddProps1();
            }
            return instance;
        }
        
        public ReqPropsFromExplicitAddPropsMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, String> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof String)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (String) propertyInstance);
            }
            FrozenMap<String> castProperties = new FrozenMap<>(properties);
            return new ReqPropsFromExplicitAddPropsMap(castProperties);
        }
        
        public ReqPropsFromExplicitAddPropsMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public ReqPropsFromExplicitAddProps1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ReqPropsFromExplicitAddProps1BoxedMap(validate(arg, configuration));
        }
    }

}
