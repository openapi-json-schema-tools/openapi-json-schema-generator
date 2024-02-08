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
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class BananaReq {
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
    
    
    public static class LengthCm extends NumberJsonSchema {
        private static @Nullable LengthCm instance = null;
        public static LengthCm getInstance() {
            if (instance == null) {
                instance = new LengthCm();
            }
            return instance;
        }
    }
    
    
    public static class Sweet extends BooleanJsonSchema {
        private static @Nullable Sweet instance = null;
        public static Sweet getInstance() {
            if (instance == null) {
                instance = new Sweet();
            }
            return instance;
        }
    }
    
    
    public static class BananaReqMap extends FrozenMap<Object> {
        protected BananaReqMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "lengthCm"
        );
        public static final Set<String> optionalKeys = Set.of(
            "sweet"
        );
        public static BananaReqMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return BananaReq1.getInstance().validate(arg, configuration);
        }
        
        public Number lengthCm() {
                        Object value = get("lengthCm");
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for lengthCm");
            }
            return (Number) value;
        }
        
        public boolean sweet() throws UnsetPropertyException {
            String key = "sweet";
            throwIfKeyNotPresent(key);
            Object value = get(key);
            if (!(value instanceof Boolean)) {
                throw new InvalidTypeException("Invalid value stored for sweet");
            }
            return (boolean) value;
        }
    }
    
    public interface SetterForLengthCm <T> {
        Map<String, Object> getInstance();
        T getBuilderAfterLengthCm(Map<String, Object> instance);
        
        default T lengthCm(int value) {
            var instance = getInstance();
            instance.put("lengthCm", value);
            return getBuilderAfterLengthCm(instance);
        }
        
        default T lengthCm(float value) {
            var instance = getInstance();
            instance.put("lengthCm", value);
            return getBuilderAfterLengthCm(instance);
        }
        
        default T lengthCm(long value) {
            var instance = getInstance();
            instance.put("lengthCm", value);
            return getBuilderAfterLengthCm(instance);
        }
        
        default T lengthCm(double value) {
            var instance = getInstance();
            instance.put("lengthCm", value);
            return getBuilderAfterLengthCm(instance);
        }
    }
    
    public interface SetterForSweet <T> {
        Map<String, Object> getInstance();
        T getBuilderAfterSweet(Map<String, Object> instance);
        
        default T sweet(boolean value) {
            var instance = getInstance();
            instance.put("sweet", value);
            return getBuilderAfterSweet(instance);
        }
    }
    
    public static class BananaReqMap0Builder implements GenericBuilder<Map<String, Object>>, SetterForSweet<BananaReqMap0Builder> {
        private final Map<String, Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "lengthCm",
            "sweet"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public BananaReqMap0Builder(Map<String, Object> instance) {
            this.instance = instance;
        }
        public Map<String, Object> build() {
            return instance;
        }
        public Map<String, Object> getInstance() {
            return instance;
        }
        public BananaReqMap0Builder getBuilderAfterSweet(Map<String, Object> instance) {
            return this;
        }
    }
    
    public static class BananaReqMapBuilder implements SetterForLengthCm<BananaReqMap0Builder> {
        private final Map<String, Object> instance;
        public BananaReqMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Object> getInstance() {
            return instance;
        }
        public BananaReqMap0Builder getBuilderAfterLengthCm(Map<String, Object> instance) {
            return new BananaReqMap0Builder(instance);
        }
    }
    
    
    public static abstract sealed class BananaReq1Boxed permits BananaReq1BoxedMap {}
    public static final class BananaReq1BoxedMap extends BananaReq1Boxed {
        public final BananaReqMap data;
        private BananaReq1BoxedMap(BananaReqMap data) {
            this.data = data;
        }
    }
    
    
    public static class BananaReq1 extends JsonSchema implements MapSchemaValidator<BananaReqMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable BananaReq1 instance = null;
    
        protected BananaReq1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("lengthCm", LengthCm.class),
                    new PropertyEntry("sweet", Sweet.class)
                ))
                .required(Set.of(
                    "lengthCm"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static BananaReq1 getInstance() {
            if (instance == null) {
                instance = new BananaReq1();
            }
            return instance;
        }
        
        public BananaReqMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new BananaReqMap(castProperties);
        }
        
        public BananaReqMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public BananaReq1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new BananaReq1BoxedMap(validate(arg, configuration));
        }
    }

}
