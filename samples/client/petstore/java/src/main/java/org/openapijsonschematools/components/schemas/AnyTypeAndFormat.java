package org.openapijsonschematools.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.FormatValidator;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class AnyTypeAndFormat {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class UuidSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("format", new FormatValidator("uuid"))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(UuidSchema.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(UuidSchema.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(UuidSchema.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(UuidSchema.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(UuidSchema.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(UuidSchema.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(UuidSchema.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(UuidSchema.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(UuidSchema.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(UuidSchema.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(UuidSchema.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(UuidSchema.class, arg, configuration);
        }
    }    
    
    public static class Date extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("format", new FormatValidator("date"))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(Date.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(Date.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(Date.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(Date.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(Date.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(Date.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(Date.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(Date.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(Date.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(Date.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Date.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Date.class, arg, configuration);
        }
    }    
    
    public static class Datetime extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("format", new FormatValidator("date-time"))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(Datetime.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(Datetime.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(Datetime.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(Datetime.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(Datetime.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(Datetime.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(Datetime.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(Datetime.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(Datetime.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(Datetime.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Datetime.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Datetime.class, arg, configuration);
        }
    }    
    
    public static class NumberSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("format", new FormatValidator("number"))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(NumberSchema.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(NumberSchema.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(NumberSchema.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(NumberSchema.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(NumberSchema.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(NumberSchema.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(NumberSchema.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(NumberSchema.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(NumberSchema.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(NumberSchema.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(NumberSchema.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(NumberSchema.class, arg, configuration);
        }
    }    
    
    public static class Binary extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("format", new FormatValidator("binary"))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(Binary.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(Binary.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(Binary.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(Binary.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(Binary.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(Binary.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(Binary.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(Binary.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(Binary.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(Binary.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Binary.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Binary.class, arg, configuration);
        }
    }    
    
    public static class Int32 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("format", new FormatValidator("int32"))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(Int32.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(Int32.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(Int32.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(Int32.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(Int32.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(Int32.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(Int32.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(Int32.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(Int32.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(Int32.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Int32.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Int32.class, arg, configuration);
        }
    }    
    
    public static class Int64 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("format", new FormatValidator("int64"))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(Int64.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(Int64.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(Int64.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(Int64.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(Int64.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(Int64.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(Int64.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(Int64.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(Int64.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(Int64.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Int64.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Int64.class, arg, configuration);
        }
    }    
    
    public static class DoubleSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("format", new FormatValidator("double"))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(DoubleSchema.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(DoubleSchema.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(DoubleSchema.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(DoubleSchema.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(DoubleSchema.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(DoubleSchema.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(DoubleSchema.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(DoubleSchema.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(DoubleSchema.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(DoubleSchema.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(DoubleSchema.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(DoubleSchema.class, arg, configuration);
        }
    }    
    
    public static class FloatSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("format", new FormatValidator("float"))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(FloatSchema.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(FloatSchema.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(FloatSchema.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(FloatSchema.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(FloatSchema.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(FloatSchema.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(FloatSchema.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(FloatSchema.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(FloatSchema.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(FloatSchema.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(FloatSchema.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(FloatSchema.class, arg, configuration);
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
            return AnyTypeAndFormat1.validate(arg, configuration);
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
    
    public static class AnyTypeAndFormat1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
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
        ));
        
        protected static AnyTypeAndFormatMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new AnyTypeAndFormatMap(arg);
        }
        public static AnyTypeAndFormatMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(AnyTypeAndFormat1.class, arg, configuration);
        }
    }
}
