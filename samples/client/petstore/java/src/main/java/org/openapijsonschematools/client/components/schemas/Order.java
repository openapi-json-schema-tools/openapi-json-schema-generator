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
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;
import org.openapijsonschematools.client.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.client.schemas.Int32JsonSchema;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringEnumValidator;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.StringValueMethod;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Order {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Id extends Int64JsonSchema {
        private static @Nullable Id instance = null;
        public static Id getInstance() {
            if (instance == null) {
                instance = new Id();
            }
            return instance;
        }
    }
    
    
    public static class PetId extends Int64JsonSchema {
        private static @Nullable PetId instance = null;
        public static PetId getInstance() {
            if (instance == null) {
                instance = new PetId();
            }
            return instance;
        }
    }
    
    
    public static class Quantity extends Int32JsonSchema {
        private static @Nullable Quantity instance = null;
        public static Quantity getInstance() {
            if (instance == null) {
                instance = new Quantity();
            }
            return instance;
        }
    }
    
    
    public static class ShipDate extends DateTimeJsonSchema {
        private static @Nullable ShipDate instance = null;
        public static ShipDate getInstance() {
            if (instance == null) {
                instance = new ShipDate();
            }
            return instance;
        }
    }
    
    public enum StringStatusEnums implements StringValueMethod {
        PLACED("placed"),
        APPROVED("approved"),
        DELIVERED("delivered");
        private final String value;
    
        StringStatusEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public static class Status extends JsonSchema implements StringSchemaValidator, StringEnumValidator<StringStatusEnums> {
        private static @Nullable Status instance = null;
    
        protected Status() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "placed",
                    "approved",
                    "delivered"
                ))
            );
        }
    
        public static Status getInstance() {
            if (instance == null) {
                instance = new Status();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public String validate(StringStatusEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class Complete extends BooleanJsonSchema {
        private static @Nullable Complete instance = null;
        public static Complete getInstance() {
            if (instance == null) {
                instance = new Complete();
            }
            return instance;
        }
    }
    
    
    public static class OrderMap extends FrozenMap<@Nullable Object> {
        protected OrderMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "id",
            "petId",
            "quantity",
            "shipDate",
            "status",
            "complete"
        );
        public static OrderMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Order1.getInstance().validate(arg, configuration);
        }
        
        public long id() throws UnsetPropertyException {
            String key = "id";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Long)) {
                throw new InvalidTypeException("Invalid value stored for id");
            }
            return (long) value;
        }
        
        public long petId() throws UnsetPropertyException {
            String key = "petId";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Long)) {
                throw new InvalidTypeException("Invalid value stored for petId");
            }
            return (long) value;
        }
        
        public int quantity() throws UnsetPropertyException {
            String key = "quantity";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Integer)) {
                throw new InvalidTypeException("Invalid value stored for quantity");
            }
            return (int) value;
        }
        
        public String shipDate() throws UnsetPropertyException {
            String key = "shipDate";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for shipDate");
            }
            return (String) value;
        }
        
        public String status() throws UnsetPropertyException {
            String key = "status";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for status");
            }
            return (String) value;
        }
        
        public boolean complete() throws UnsetPropertyException {
            String key = "complete";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Boolean)) {
                throw new InvalidTypeException("Invalid value stored for complete");
            }
            return (boolean) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class OrderMapBuilder {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class Order1 extends JsonSchema implements MapSchemaValidator<OrderMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable Order1 instance = null;
    
        protected Order1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("id", Id.class),
                    new PropertyEntry("petId", PetId.class),
                    new PropertyEntry("quantity", Quantity.class),
                    new PropertyEntry("shipDate", ShipDate.class),
                    new PropertyEntry("status", Status.class),
                    new PropertyEntry("complete", Complete.class)
                ))
            );
        }
    
        public static Order1 getInstance() {
            if (instance == null) {
                instance = new Order1();
            }
            return instance;
        }
        
        public OrderMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new OrderMap(castProperties);
        }
        
        public OrderMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
