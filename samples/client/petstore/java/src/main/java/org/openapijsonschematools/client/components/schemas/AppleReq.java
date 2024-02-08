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
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class AppleReq {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class Cultivar extends StringJsonSchema {
        private static @Nullable Cultivar instance = null;
        public static Cultivar getInstance() {
            if (instance == null) {
                instance = new Cultivar();
            }
            return instance;
        }
    }
    
    
    public static class Mealy extends BooleanJsonSchema {
        private static @Nullable Mealy instance = null;
        public static Mealy getInstance() {
            if (instance == null) {
                instance = new Mealy();
            }
            return instance;
        }
    }
    
    
    public static class AppleReqMap extends FrozenMap<Object> {
        protected AppleReqMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "cultivar"
        );
        public static final Set<String> optionalKeys = Set.of(
            "mealy"
        );
        public static AppleReqMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return AppleReq1.getInstance().validate(arg, configuration);
        }
        
        public String cultivar() {
                        Object value = get("cultivar");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for cultivar");
            }
            return (String) value;
        }
        
        public boolean mealy() throws UnsetPropertyException {
            String key = "mealy";
            throwIfKeyNotPresent(key);
            Object value = get(key);
            if (!(value instanceof Boolean)) {
                throw new InvalidTypeException("Invalid value stored for mealy");
            }
            return (boolean) value;
        }
    }
    
    public interface SetterForCultivar <T> {
        Map<String, Object> getInstance();
        T getBuilderAfterCultivar(Map<String, Object> instance);
        
        default T cultivar(String value) {
            var instance = getInstance();
            instance.put("cultivar", value);
            return getBuilderAfterCultivar(instance);
        }
    }
    
    public interface SetterForMealy <T> {
        Map<String, Object> getInstance();
        T getBuilderAfterMealy(Map<String, Object> instance);
        
        default T mealy(boolean value) {
            var instance = getInstance();
            instance.put("mealy", value);
            return getBuilderAfterMealy(instance);
        }
    }
    
    public static class AppleReqMap0Builder implements GenericBuilder<Map<String, Object>>, SetterForMealy<AppleReqMap0Builder> {
        private final Map<String, Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "cultivar",
            "mealy"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public AppleReqMap0Builder(Map<String, Object> instance) {
            this.instance = instance;
        }
        public Map<String, Object> build() {
            return instance;
        }
        public Map<String, Object> getInstance() {
            return instance;
        }
        public AppleReqMap0Builder getBuilderAfterMealy(Map<String, Object> instance) {
            return this;
        }
    }
    
    public static class AppleReqMapBuilder implements SetterForCultivar<AppleReqMap0Builder> {
        private final Map<String, Object> instance;
        public AppleReqMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Object> getInstance() {
            return instance;
        }
        public AppleReqMap0Builder getBuilderAfterCultivar(Map<String, Object> instance) {
            return new AppleReqMap0Builder(instance);
        }
    }
    
    
    public static abstract sealed class AppleReq1Boxed permits AppleReq1BoxedMap {}
    public static final class AppleReq1BoxedMap extends AppleReq1Boxed {
        public final AppleReqMap data;
        private AppleReq1BoxedMap(AppleReqMap data) {
            this.data = data;
        }
    }
    
    
    public static class AppleReq1 extends JsonSchema implements MapSchemaValidator<AppleReqMap, AppleReq1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable AppleReq1 instance = null;
    
        protected AppleReq1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("cultivar", Cultivar.class),
                    new PropertyEntry("mealy", Mealy.class)
                ))
                .required(Set.of(
                    "cultivar"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static AppleReq1 getInstance() {
            if (instance == null) {
                instance = new AppleReq1();
            }
            return instance;
        }
        
        public AppleReqMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof Object)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (Object) propertyInstance);
            }
            FrozenMap<Object> castProperties = new FrozenMap<>(properties);
            return new AppleReqMap(castProperties);
        }
        
        public AppleReqMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public AppleReq1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AppleReq1BoxedMap(validate(arg, configuration));
        }
    }

}
