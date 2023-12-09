package org.openapijsonschematools.client.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class NullableClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties3 extends JsonSchema<Object, FrozenMap, Object, FrozenList> {
        public AdditionalProperties3() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    FrozenMap.class
                )))
            )));
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }    
    
    public static class IntegerProp extends JsonSchema<Object, FrozenMap, Object, FrozenList> {
        public IntegerProp() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                )))
            )));
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return validateInt(arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return validateFloat(arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLong(arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return validateDouble(arg, configuration);
        }
    }    
    
    public static class NumberProp extends JsonSchema<Object, FrozenMap, Object, FrozenList> {
        public NumberProp() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                )))
            )));
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return validateInt(arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLong(arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return validateFloat(arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return validateDouble(arg, configuration);
        }
    }    
    
    public static class BooleanProp extends JsonSchema<Object, FrozenMap, Object, FrozenList> {
        public BooleanProp() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    Boolean.class
                )))
            )));
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
        }
    }    
    
    public static class StringProp extends JsonSchema<Object, FrozenMap, Object, FrozenList> {
        public StringProp() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    String.class
                )))
            )));
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class DateProp extends JsonSchema<Object, FrozenMap, Object, FrozenList> {
        public DateProp() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    String.class
                ))),
                new KeywordEntry("format", new FormatValidator("date"))
            )));
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class DatetimeProp extends JsonSchema<Object, FrozenMap, Object, FrozenList> {
        public DatetimeProp() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    String.class
                ))),
                new KeywordEntry("format", new FormatValidator("date-time"))
            )));
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class Items extends MapJsonSchema {}
    
    
    public static class ArrayNullablePropList extends FrozenList<FrozenMap<String, Object>> {
        ArrayNullablePropList(FrozenList<FrozenMap<String, Object>> m) {
            super(m);
        }
        public static ArrayNullablePropList of(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ArrayNullableProp.class).validate(arg, configuration);
        }
    }
    
    public class ArrayNullablePropListInput {
        // class to build List<Map<String, Object>>
    }
    
    
    public static class ArrayNullableProp extends JsonSchema<Object, FrozenMap, Map<String, Object>, ArrayNullablePropList> {
        public ArrayNullableProp() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    FrozenList.class
                ))),
                new KeywordEntry("items", new ItemsValidator(Items.class))
            )));
        }
        
        @Override
        protected ArrayNullablePropList getListOutputInstance(FrozenList<?> arg) {
            return new ArrayNullablePropList((FrozenList<FrozenMap<String, Object>>) arg);
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public ArrayNullablePropList validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class Items1 extends JsonSchema<Object, FrozenMap, Object, FrozenList> {
        public Items1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    FrozenMap.class
                )))
            )));
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }    
    
    public static class ArrayAndItemsNullablePropList extends FrozenList<FrozenMap<String, Object>> {
        ArrayAndItemsNullablePropList(FrozenList<FrozenMap<String, Object>> m) {
            super(m);
        }
        public static ArrayAndItemsNullablePropList of(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ArrayAndItemsNullableProp.class).validate(arg, configuration);
        }
    }
    
    public class ArrayAndItemsNullablePropListInput {
        // class to build List<Map<String, Object>>
    }
    
    
    public static class ArrayAndItemsNullableProp extends JsonSchema<Object, FrozenMap, Map<String, Object>, ArrayAndItemsNullablePropList> {
        public ArrayAndItemsNullableProp() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    FrozenList.class
                ))),
                new KeywordEntry("items", new ItemsValidator(Items1.class))
            )));
        }
        
        @Override
        protected ArrayAndItemsNullablePropList getListOutputInstance(FrozenList<?> arg) {
            return new ArrayAndItemsNullablePropList((FrozenList<FrozenMap<String, Object>>) arg);
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public ArrayAndItemsNullablePropList validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class Items2 extends JsonSchema<Object, FrozenMap, Object, FrozenList> {
        public Items2() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    FrozenMap.class
                )))
            )));
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }    
    
    public static class ArrayItemsNullableList extends FrozenList<FrozenMap<String, Object>> {
        ArrayItemsNullableList(FrozenList<FrozenMap<String, Object>> m) {
            super(m);
        }
        public static ArrayItemsNullableList of(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ArrayItemsNullable.class).validate(arg, configuration);
        }
    }
    
    public class ArrayItemsNullableListInput {
        // class to build List<Map<String, Object>>
    }
    
    
    public static class ArrayItemsNullable extends JsonSchema<Object, FrozenMap<String, Object>, Map<String, Object>, ArrayItemsNullableList> {
        public ArrayItemsNullable() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items2.class))
            )));
        }
        
        @Override
        protected ArrayItemsNullableList getListOutputInstance(FrozenList<?> arg) {
            return new ArrayItemsNullableList((FrozenList<FrozenMap<String, Object>>) arg);
        }
        public ArrayItemsNullableList validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class AdditionalProperties extends MapJsonSchema {}
    
    
    public static class ObjectNullablePropMap extends FrozenMap<String, FrozenMap<String, Object>> {
        ObjectNullablePropMap(FrozenMap<String, FrozenMap<String, Object>> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static ObjectNullablePropMap of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ObjectNullableProp.class).validate(arg, configuration);
        }
        
        public FrozenMap<String, Object> getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class ObjectNullablePropMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class ObjectNullableProp extends JsonSchema<Map<String, Object>, ObjectNullablePropMap, Object, FrozenList> {
        public ObjectNullableProp() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    FrozenMap.class
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
        
        @Override
        protected ObjectNullablePropMap getMapOutputInstance(FrozenMap<String, ?> arg) {
            return new ObjectNullablePropMap((FrozenMap<String, FrozenMap<String, Object>>) arg);
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public ObjectNullablePropMap validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }    
    
    public static class AdditionalProperties1 extends JsonSchema<Object, FrozenMap, Object, FrozenList> {
        public AdditionalProperties1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    FrozenMap.class
                )))
            )));
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }    
    
    public static class ObjectAndItemsNullablePropMap extends FrozenMap<String, FrozenMap<String, Object>> {
        ObjectAndItemsNullablePropMap(FrozenMap<String, FrozenMap<String, Object>> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static ObjectAndItemsNullablePropMap of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ObjectAndItemsNullableProp.class).validate(arg, configuration);
        }
        
        public FrozenMap<String, Object> getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class ObjectAndItemsNullablePropMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class ObjectAndItemsNullableProp extends JsonSchema<Map<String, Object>, ObjectAndItemsNullablePropMap, Object, FrozenList> {
        public ObjectAndItemsNullableProp() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    FrozenMap.class
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties1.class))
            )));
        }
        
        @Override
        protected ObjectAndItemsNullablePropMap getMapOutputInstance(FrozenMap<String, ?> arg) {
            return new ObjectAndItemsNullablePropMap((FrozenMap<String, FrozenMap<String, Object>>) arg);
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public ObjectAndItemsNullablePropMap validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }    
    
    public static class AdditionalProperties2 extends JsonSchema<Object, FrozenMap, Object, FrozenList> {
        public AdditionalProperties2() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Void.class,
                    FrozenMap.class
                )))
            )));
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }    
    
    public static class ObjectItemsNullableMap extends FrozenMap<String, FrozenMap<String, Object>> {
        ObjectItemsNullableMap(FrozenMap<String, FrozenMap<String, Object>> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static ObjectItemsNullableMap of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ObjectItemsNullable.class).validate(arg, configuration);
        }
        
        public FrozenMap<String, Object> getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class ObjectItemsNullableMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class ObjectItemsNullable extends JsonSchema<Map<String, Object>, ObjectItemsNullableMap, Object, FrozenList<Object>> {
        public ObjectItemsNullable() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties2.class))
            )));
        }
        
        @Override
        protected ObjectItemsNullableMap getMapOutputInstance(FrozenMap<String, ?> arg) {
            return new ObjectItemsNullableMap((FrozenMap<String, FrozenMap<String, Object>>) arg);
        }
        public ObjectItemsNullableMap validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
    
    
    public static class NullableClassMap extends FrozenMap<String, Object> {
        NullableClassMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "integer_prop",
            "number_prop",
            "boolean_prop",
            "string_prop",
            "date_prop",
            "datetime_prop",
            "array_nullable_prop",
            "array_and_items_nullable_prop",
            "array_items_nullable",
            "object_nullable_prop",
            "object_and_items_nullable_prop",
            "object_items_nullable"
        );
        public static NullableClassMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(NullableClass1.class).validate(arg, configuration);
        }
        
        public Long integer_prop() {
            String key = "integer_prop";
            throwIfKeyNotPresent(key);
            return (Long) get(key);
        }
        
        public Number number_prop() {
            String key = "number_prop";
            throwIfKeyNotPresent(key);
            return (Number) get(key);
        }
        
        public Boolean boolean_prop() {
            String key = "boolean_prop";
            throwIfKeyNotPresent(key);
            return (Boolean) get(key);
        }
        
        public String string_prop() {
            String key = "string_prop";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String date_prop() {
            String key = "date_prop";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String datetime_prop() {
            String key = "datetime_prop";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public ArrayNullablePropList array_nullable_prop() {
            String key = "array_nullable_prop";
            throwIfKeyNotPresent(key);
            return (ArrayNullablePropList) get(key);
        }
        
        public ArrayAndItemsNullablePropList array_and_items_nullable_prop() {
            String key = "array_and_items_nullable_prop";
            throwIfKeyNotPresent(key);
            return (ArrayAndItemsNullablePropList) get(key);
        }
        
        public ArrayItemsNullableList array_items_nullable() {
            String key = "array_items_nullable";
            throwIfKeyNotPresent(key);
            return (ArrayItemsNullableList) get(key);
        }
        
        public ObjectNullablePropMap object_nullable_prop() {
            String key = "object_nullable_prop";
            throwIfKeyNotPresent(key);
            return (ObjectNullablePropMap) get(key);
        }
        
        public ObjectAndItemsNullablePropMap object_and_items_nullable_prop() {
            String key = "object_and_items_nullable_prop";
            throwIfKeyNotPresent(key);
            return (ObjectAndItemsNullablePropMap) get(key);
        }
        
        public ObjectItemsNullableMap object_items_nullable() {
            String key = "object_items_nullable";
            throwIfKeyNotPresent(key);
            return (ObjectItemsNullableMap) get(key);
        }
        
        public FrozenMap<String, Object> getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return (FrozenMap<String, Object>) get(name);
        }
    }
    public class NullableClassMapInput {
        // optionalProperties + additionalProperties
    }
    
    
    public static class NullableClass1 extends JsonSchema<Object, NullableClassMap, Object, FrozenList<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public NullableClass1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("integer_prop", IntegerProp.class),
                    new PropertyEntry("number_prop", NumberProp.class),
                    new PropertyEntry("boolean_prop", BooleanProp.class),
                    new PropertyEntry("string_prop", StringProp.class),
                    new PropertyEntry("date_prop", DateProp.class),
                    new PropertyEntry("datetime_prop", DatetimeProp.class),
                    new PropertyEntry("array_nullable_prop", ArrayNullableProp.class),
                    new PropertyEntry("array_and_items_nullable_prop", ArrayAndItemsNullableProp.class),
                    new PropertyEntry("array_items_nullable", ArrayItemsNullable.class),
                    new PropertyEntry("object_nullable_prop", ObjectNullableProp.class),
                    new PropertyEntry("object_and_items_nullable_prop", ObjectAndItemsNullableProp.class),
                    new PropertyEntry("object_items_nullable", ObjectItemsNullable.class)
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties3.class))
            )));
        }
        
        @Override
        protected NullableClassMap getMapOutputInstance(FrozenMap<String, ?> arg) {
            return new NullableClassMap((FrozenMap<String, Object>) arg);
        }
        public NullableClassMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
