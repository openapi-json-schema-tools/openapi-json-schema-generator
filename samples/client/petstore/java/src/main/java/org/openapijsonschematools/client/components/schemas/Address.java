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
import org.openapijsonschematools.client.schemas.IntJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Address {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends IntJsonSchema {
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class AddressMap extends FrozenMap<Number> {
        protected AddressMap(FrozenMap<Number> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static AddressMap of(Map<String, Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return Address1.getInstance().validate(arg, configuration);
        }
        
        public Number getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    
    public interface SetterForAdditionalProperties<T> {
        Set<String> getKnownKeys();
        Map<String, Number> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, Number> instance);
        
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
    }
    
    public static class AddressMapBuilder implements GenericBuilder<Map<String, Number>>, SetterForAdditionalProperties<AddressMapBuilder> {
        private final Map<String, Number> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public AddressMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Number> build() {
            return instance;
        }
        public Map<String, Number> getInstance() {
            return instance;
        }
        public AddressMapBuilder getBuilderAfterAdditionalProperty(Map<String, Number> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class Address1Boxed permits Address1BoxedMap {}
    public static final class Address1BoxedMap extends Address1Boxed {
        public final AddressMap data;
        private Address1BoxedMap(AddressMap data) {
            this.data = data;
        }
    }
    
    
    public static class Address1 extends JsonSchema implements MapSchemaValidator<AddressMap, Address1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable Address1 instance = null;
    
        protected Address1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static Address1 getInstance() {
            if (instance == null) {
                instance = new Address1();
            }
            return instance;
        }
        
        public AddressMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Number> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof Number)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (Number) propertyInstance);
            }
            FrozenMap<Number> castProperties = new FrozenMap<>(properties);
            return new AddressMap(castProperties);
        }
        
        public AddressMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public Address1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Address1BoxedMap(validate(arg, configuration));
        }
    }

}
