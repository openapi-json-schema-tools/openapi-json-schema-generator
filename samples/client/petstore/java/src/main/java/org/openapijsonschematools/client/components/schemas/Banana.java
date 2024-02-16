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
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Banana {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class LengthCm extends NumberJsonSchema.NumberJsonSchema1 {
        private static @Nullable LengthCm instance = null;
        public static LengthCm getInstance() {
            if (instance == null) {
                instance = new LengthCm();
            }
            return instance;
        }
    }
    
    
    public static class BananaMap extends FrozenMap<@Nullable Object> {
        protected BananaMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "lengthCm"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static BananaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Banana1.getInstance().validate(arg, configuration);
        }
        
        public Number lengthCm() {
                        @Nullable Object value = get("lengthCm");
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for lengthCm");
            }
            return (Number) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForLengthCm <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterLengthCm(Map<String, @Nullable Object> instance);
        
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
    
    public static class BananaMap0Builder extends UnsetAddPropsSetter<BananaMap0Builder> implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "lengthCm"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public BananaMap0Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public BananaMap0Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class BananaMapBuilder implements SetterForLengthCm<BananaMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        public BananaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public BananaMap0Builder getBuilderAfterLengthCm(Map<String, @Nullable Object> instance) {
            return new BananaMap0Builder(instance);
        }
    }
    
    
    public static abstract sealed class Banana1Boxed permits Banana1BoxedMap {
        public abstract @Nullable Object data();
    }
    
    public static final class Banana1BoxedMap extends Banana1Boxed {
        public final BananaMap data;
        private Banana1BoxedMap(BananaMap data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    public static class Banana1 extends JsonSchema implements MapSchemaValidator<BananaMap, Banana1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable Banana1 instance = null;
    
        protected Banana1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("lengthCm", LengthCm.class)
                ))
                .required(Set.of(
                    "lengthCm"
                ))
            );
        }
    
        public static Banana1 getInstance() {
            if (instance == null) {
                instance = new Banana1();
            }
            return instance;
        }
        
        public BananaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new BananaMap(castProperties);
        }
        
        public BananaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public Banana1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Banana1BoxedMap(validate(arg, configuration));
        }
    }

}
