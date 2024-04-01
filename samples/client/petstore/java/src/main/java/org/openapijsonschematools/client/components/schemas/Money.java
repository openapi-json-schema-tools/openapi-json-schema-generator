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
import org.openapijsonschematools.client.schemas.DecimalJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Money {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class Amount extends DecimalJsonSchema.DecimalJsonSchema1 {
        private static @Nullable Amount instance = null;
        public static Amount getInstance() {
            if (instance == null) {
                instance = new Amount();
            }
            return instance;
        }
    }
    
    
    public static class MoneyMap extends FrozenMap<@Nullable Object> {
        protected MoneyMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "amount",
            "currency"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static MoneyMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return Money1.getInstance().validate(arg, configuration);
        }
        
        public String amount() {
                        @Nullable Object value = get("amount");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for amount");
            }
            return (String) value;
        }
        
        public String currency() {
                        @Nullable Object value = get("currency");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for currency");
            }
            return (String) value;
        }
    }
    
    public interface SetterForAmount <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAmount(Map<String, @Nullable Object> instance);
        
        default T amount(String value) {
            var instance = getInstance();
            instance.put("amount", value);
            return getBuilderAfterAmount(instance);
        }
    }
    
    public interface SetterForCurrency <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCurrency(Map<String, @Nullable Object> instance);
        
        default T currency(String value) {
            var instance = getInstance();
            instance.put("currency", value);
            return getBuilderAfterCurrency(instance);
        }
        
        default T currency(Currency.StringCurrencyEnums value) {
            var instance = getInstance();
            instance.put("currency", value.value());
            return getBuilderAfterCurrency(instance);
        }
    }
    
    public static class MoneyMap00Builder implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "amount",
            "currency"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public MoneyMap00Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    public static class MoneyMap01Builder implements SetterForCurrency<MoneyMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public MoneyMap01Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public MoneyMap00Builder getBuilderAfterCurrency(Map<String, @Nullable Object> instance) {
            return new MoneyMap00Builder(instance);
        }
    }
    
    public static class MoneyMap10Builder implements SetterForAmount<MoneyMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public MoneyMap10Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public MoneyMap00Builder getBuilderAfterAmount(Map<String, @Nullable Object> instance) {
            return new MoneyMap00Builder(instance);
        }
    }
    
    public static class MoneyMapBuilder implements SetterForAmount<MoneyMap01Builder>, SetterForCurrency<MoneyMap10Builder> {
        private final Map<String, @Nullable Object> instance;
        public MoneyMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public MoneyMap01Builder getBuilderAfterAmount(Map<String, @Nullable Object> instance) {
            return new MoneyMap01Builder(instance);
        }
        public MoneyMap10Builder getBuilderAfterCurrency(Map<String, @Nullable Object> instance) {
            return new MoneyMap10Builder(instance);
        }
    }
    
    
    public sealed interface Money1Boxed permits Money1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Money1BoxedMap(MoneyMap data) implements Money1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Money1 extends JsonSchema<Money1Boxed> implements MapSchemaValidator<MoneyMap, Money1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable Money1 instance = null;
    
        protected Money1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("amount", Amount.class),
                    new PropertyEntry("currency", Currency.Currency1.class)
                ))
                .required(Set.of(
                    "amount",
                    "currency"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static Money1 getInstance() {
            if (instance == null) {
                instance = new Money1();
            }
            return instance;
        }
        
        public MoneyMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
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
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new MoneyMap(castProperties);
        }
        
        public MoneyMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public Money1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Money1BoxedMap(validate(arg, configuration));
        }
        @Override
        public Money1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
