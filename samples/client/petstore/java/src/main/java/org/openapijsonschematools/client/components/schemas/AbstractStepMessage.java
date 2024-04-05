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

public class AbstractStepMessage {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Discriminator extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Discriminator instance = null;
        public static Discriminator getInstance() {
            if (instance == null) {
                instance = new Discriminator();
            }
            return instance;
        }
    }
    
    
    public static class AbstractStepMessageMap extends FrozenMap<@Nullable Object> {
        protected AbstractStepMessageMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "description",
            "discriminator",
            "sequenceNumber"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static AbstractStepMessageMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return AbstractStepMessage1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object description() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
        
        public String discriminator() {
                        @Nullable Object value = get("discriminator");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for discriminator");
            }
            return (String) value;
        }
        
        public @Nullable Object sequenceNumber() {
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
    
    public interface SetterForDescription <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterDescription(Map<String, @Nullable Object> instance);
        
        default T description(Void value) {
            var instance = getInstance();
            instance.put("description", null);
            return getBuilderAfterDescription(instance);
        }
        
        default T description(boolean value) {
            var instance = getInstance();
            instance.put("description", value);
            return getBuilderAfterDescription(instance);
        }
        
        default T description(String value) {
            var instance = getInstance();
            instance.put("description", value);
            return getBuilderAfterDescription(instance);
        }
        
        default T description(int value) {
            var instance = getInstance();
            instance.put("description", value);
            return getBuilderAfterDescription(instance);
        }
        
        default T description(float value) {
            var instance = getInstance();
            instance.put("description", value);
            return getBuilderAfterDescription(instance);
        }
        
        default T description(long value) {
            var instance = getInstance();
            instance.put("description", value);
            return getBuilderAfterDescription(instance);
        }
        
        default T description(double value) {
            var instance = getInstance();
            instance.put("description", value);
            return getBuilderAfterDescription(instance);
        }
        
        default T description(List<?> value) {
            var instance = getInstance();
            instance.put("description", value);
            return getBuilderAfterDescription(instance);
        }
        
        default T description(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("description", value);
            return getBuilderAfterDescription(instance);
        }
    }
    
    public interface SetterForDiscriminator <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterDiscriminator(Map<String, @Nullable Object> instance);
        
        default T discriminator(String value) {
            var instance = getInstance();
            instance.put("discriminator", value);
            return getBuilderAfterDiscriminator(instance);
        }
    }
    
    public interface SetterForSequenceNumber <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSequenceNumber(Map<String, @Nullable Object> instance);
        
        default T sequenceNumber(Void value) {
            var instance = getInstance();
            instance.put("sequenceNumber", null);
            return getBuilderAfterSequenceNumber(instance);
        }
        
        default T sequenceNumber(boolean value) {
            var instance = getInstance();
            instance.put("sequenceNumber", value);
            return getBuilderAfterSequenceNumber(instance);
        }
        
        default T sequenceNumber(String value) {
            var instance = getInstance();
            instance.put("sequenceNumber", value);
            return getBuilderAfterSequenceNumber(instance);
        }
        
        default T sequenceNumber(int value) {
            var instance = getInstance();
            instance.put("sequenceNumber", value);
            return getBuilderAfterSequenceNumber(instance);
        }
        
        default T sequenceNumber(float value) {
            var instance = getInstance();
            instance.put("sequenceNumber", value);
            return getBuilderAfterSequenceNumber(instance);
        }
        
        default T sequenceNumber(long value) {
            var instance = getInstance();
            instance.put("sequenceNumber", value);
            return getBuilderAfterSequenceNumber(instance);
        }
        
        default T sequenceNumber(double value) {
            var instance = getInstance();
            instance.put("sequenceNumber", value);
            return getBuilderAfterSequenceNumber(instance);
        }
        
        default T sequenceNumber(List<?> value) {
            var instance = getInstance();
            instance.put("sequenceNumber", value);
            return getBuilderAfterSequenceNumber(instance);
        }
        
        default T sequenceNumber(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("sequenceNumber", value);
            return getBuilderAfterSequenceNumber(instance);
        }
    }
    
    public static class AbstractStepMessageMap000Builder extends UnsetAddPropsSetter<AbstractStepMessageMap000Builder> implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "description",
            "discriminator",
            "sequenceNumber"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public AbstractStepMessageMap000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AbstractStepMessageMap000Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class AbstractStepMessageMap001Builder implements SetterForSequenceNumber<AbstractStepMessageMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public AbstractStepMessageMap001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AbstractStepMessageMap000Builder getBuilderAfterSequenceNumber(Map<String, @Nullable Object> instance) {
            return new AbstractStepMessageMap000Builder(instance);
        }
    }
    
    public static class AbstractStepMessageMap010Builder implements SetterForDiscriminator<AbstractStepMessageMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public AbstractStepMessageMap010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AbstractStepMessageMap000Builder getBuilderAfterDiscriminator(Map<String, @Nullable Object> instance) {
            return new AbstractStepMessageMap000Builder(instance);
        }
    }
    
    public static class AbstractStepMessageMap011Builder implements SetterForDiscriminator<AbstractStepMessageMap001Builder>, SetterForSequenceNumber<AbstractStepMessageMap010Builder> {
        private final Map<String, @Nullable Object> instance;
        public AbstractStepMessageMap011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AbstractStepMessageMap001Builder getBuilderAfterDiscriminator(Map<String, @Nullable Object> instance) {
            return new AbstractStepMessageMap001Builder(instance);
        }
        public AbstractStepMessageMap010Builder getBuilderAfterSequenceNumber(Map<String, @Nullable Object> instance) {
            return new AbstractStepMessageMap010Builder(instance);
        }
    }
    
    public static class AbstractStepMessageMap100Builder implements SetterForDescription<AbstractStepMessageMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public AbstractStepMessageMap100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AbstractStepMessageMap000Builder getBuilderAfterDescription(Map<String, @Nullable Object> instance) {
            return new AbstractStepMessageMap000Builder(instance);
        }
    }
    
    public static class AbstractStepMessageMap101Builder implements SetterForDescription<AbstractStepMessageMap001Builder>, SetterForSequenceNumber<AbstractStepMessageMap100Builder> {
        private final Map<String, @Nullable Object> instance;
        public AbstractStepMessageMap101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AbstractStepMessageMap001Builder getBuilderAfterDescription(Map<String, @Nullable Object> instance) {
            return new AbstractStepMessageMap001Builder(instance);
        }
        public AbstractStepMessageMap100Builder getBuilderAfterSequenceNumber(Map<String, @Nullable Object> instance) {
            return new AbstractStepMessageMap100Builder(instance);
        }
    }
    
    public static class AbstractStepMessageMap110Builder implements SetterForDescription<AbstractStepMessageMap010Builder>, SetterForDiscriminator<AbstractStepMessageMap100Builder> {
        private final Map<String, @Nullable Object> instance;
        public AbstractStepMessageMap110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AbstractStepMessageMap010Builder getBuilderAfterDescription(Map<String, @Nullable Object> instance) {
            return new AbstractStepMessageMap010Builder(instance);
        }
        public AbstractStepMessageMap100Builder getBuilderAfterDiscriminator(Map<String, @Nullable Object> instance) {
            return new AbstractStepMessageMap100Builder(instance);
        }
    }
    
    public static class AbstractStepMessageMapBuilder implements SetterForDescription<AbstractStepMessageMap011Builder>, SetterForDiscriminator<AbstractStepMessageMap101Builder>, SetterForSequenceNumber<AbstractStepMessageMap110Builder> {
        private final Map<String, @Nullable Object> instance;
        public AbstractStepMessageMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AbstractStepMessageMap011Builder getBuilderAfterDescription(Map<String, @Nullable Object> instance) {
            return new AbstractStepMessageMap011Builder(instance);
        }
        public AbstractStepMessageMap101Builder getBuilderAfterDiscriminator(Map<String, @Nullable Object> instance) {
            return new AbstractStepMessageMap101Builder(instance);
        }
        public AbstractStepMessageMap110Builder getBuilderAfterSequenceNumber(Map<String, @Nullable Object> instance) {
            return new AbstractStepMessageMap110Builder(instance);
        }
    }
    
    
    public sealed interface AbstractStepMessage1Boxed permits AbstractStepMessage1BoxedMap {
        @Nullable Object getData();
    }
    
    public record AbstractStepMessage1BoxedMap(AbstractStepMessageMap data) implements AbstractStepMessage1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class AbstractStepMessage1 extends JsonSchema<AbstractStepMessage1Boxed> implements MapSchemaValidator<AbstractStepMessageMap, AbstractStepMessage1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        Abstract Step
        */
        private static @Nullable AbstractStepMessage1 instance = null;
    
        protected AbstractStepMessage1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("discriminator", Discriminator.class)
                ))
                .required(Set.of(
                    "description",
                    "discriminator",
                    "sequenceNumber"
                ))
                .anyOf(List.of(
                    AbstractStepMessage1.class
                ))
            );
        }
    
        public static AbstractStepMessage1 getInstance() {
            if (instance == null) {
                instance = new AbstractStepMessage1();
            }
            return instance;
        }
        
        public AbstractStepMessageMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new AbstractStepMessageMap(castProperties);
        }
        
        public AbstractStepMessageMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public AbstractStepMessage1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new AbstractStepMessage1BoxedMap(validate(arg, configuration));
        }
        @Override
        public AbstractStepMessage1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
