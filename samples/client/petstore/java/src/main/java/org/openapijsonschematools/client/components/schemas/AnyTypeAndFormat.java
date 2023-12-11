package org.openapijsonschematools.client.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.NonCollectionJsonSchema;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class AnyTypeAndFormat {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class UuidSchema extends NonCollectionJsonSchema {
        public UuidSchema() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("format", new FormatValidator("uuid"))
            )));
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
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
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class Date extends NonCollectionJsonSchema {
        public Date() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("format", new FormatValidator("date"))
            )));
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
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
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class Datetime extends NonCollectionJsonSchema {
        public Datetime() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("format", new FormatValidator("date-time"))
            )));
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
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
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class NumberSchema extends NonCollectionJsonSchema {
        public NumberSchema() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("format", new FormatValidator("number"))
            )));
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
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
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class Binary extends NonCollectionJsonSchema {
        public Binary() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("format", new FormatValidator("binary"))
            )));
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
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
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class Int32 extends NonCollectionJsonSchema {
        public Int32() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("format", new FormatValidator("int32"))
            )));
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
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
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class Int64 extends NonCollectionJsonSchema {
        public Int64() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("format", new FormatValidator("int64"))
            )));
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
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
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class DoubleSchema extends NonCollectionJsonSchema {
        public DoubleSchema() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("format", new FormatValidator("double"))
            )));
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
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
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class FloatSchema extends NonCollectionJsonSchema {
        public FloatSchema() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("format", new FormatValidator("float"))
            )));
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
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
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class AnyTypeAndFormatMap extends FrozenMap<String, Object> {
        AnyTypeAndFormatMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "uuid",
            "date",
            "date-time",
            "number",
            "binary",
            "int32",
            "int64",
            "double",
            "float"
        );
        public static AnyTypeAndFormatMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(AnyTypeAndFormat1.class).validate(arg, configuration);
        }
        
        public Object date() {
            String key = "date";
            throwIfKeyNotPresent(key);
            return get(key);
        }
        
        public Object binary() {
            String key = "binary";
            throwIfKeyNotPresent(key);
            return get(key);
        }
        
        public Object int32() {
            String key = "int32";
            throwIfKeyNotPresent(key);
            return get(key);
        }
        
        public Object int64() {
            String key = "int64";
            throwIfKeyNotPresent(key);
            return get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class AnyTypeAndFormatMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class AnyTypeAndFormat1 extends JsonSchema<Object, Object, AnyTypeAndFormatMap, Object, Object, FrozenList<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public AnyTypeAndFormat1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("uuid", UuidSchema.class),
                    new PropertyEntry("date", Date.class),
                    new PropertyEntry("date-time", Datetime.class),
                    new PropertyEntry("number", NumberSchema.class),
                    new PropertyEntry("binary", Binary.class),
                    new PropertyEntry("int32", Int32.class),
                    new PropertyEntry("int64", Int64.class),
                    new PropertyEntry("double", DoubleSchema.class),
                    new PropertyEntry("float", FloatSchema.class)
                )))
            )));
        }
        
        @Override
        protected AnyTypeAndFormatMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new AnyTypeAndFormatMap(arg);
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public AnyTypeAndFormatMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
