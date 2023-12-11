package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;
import org.openapijsonschematools.client.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.client.schemas.Int32JsonSchema;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.validation.EnumValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Order {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Id extends Int64JsonSchema {}
    
    
    public static class PetId extends Int64JsonSchema {}
    
    
    public static class Quantity extends Int32JsonSchema {}
    
    
    public static class ShipDate extends DateTimeJsonSchema {}
    
    
    public static class Status extends JsonSchema<Object, Object, FrozenMap<String, Object>, Object, Object, FrozenList<Object>> {
        public Status() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    "placed",
                    "approved",
                    "delivered"
                )))
            )));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class Complete extends BooleanJsonSchema {}
    
    
    public static class OrderMap extends FrozenMap<String, Object> {
        OrderMap(FrozenMap<String, Object> m) {
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
        public static OrderMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Order1.class).validate(arg, configuration);
        }
        
        public long id() {
            String key = "id";
            throwIfKeyNotPresent(key);
            return (long) get(key);
        }
        
        public long petId() {
            String key = "petId";
            throwIfKeyNotPresent(key);
            return (long) get(key);
        }
        
        public int quantity() {
            String key = "quantity";
            throwIfKeyNotPresent(key);
            return (int) get(key);
        }
        
        public String shipDate() {
            String key = "shipDate";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String status() {
            String key = "status";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public boolean complete() {
            String key = "complete";
            throwIfKeyNotPresent(key);
            return (boolean) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class OrderMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class Order1 extends JsonSchema<Object, Object, OrderMap, Object, Object, FrozenList<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public Order1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("id", Id.class),
                    new PropertyEntry("petId", PetId.class),
                    new PropertyEntry("quantity", Quantity.class),
                    new PropertyEntry("shipDate", ShipDate.class),
                    new PropertyEntry("status", Status.class),
                    new PropertyEntry("complete", Complete.class)
                )))
            )));
        }
        
        @Override
        protected OrderMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new OrderMap(arg);
        }
        public OrderMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
