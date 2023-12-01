package org.openapijsonschematools.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.AllOfValidator;
import org.openapijsonschematools.schemas.validation.AnyOfValidator;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.MultipleOfValidator;
import org.openapijsonschematools.schemas.validation.OneOfValidator;

public class AllofCombinedWithAnyofOneof {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema02 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("multipleOf", new MultipleOfValidator(2))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(Schema02.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(Schema02.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(Schema02.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(Schema02.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(Schema02.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(Schema02.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(Schema02.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(Schema02.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(Schema02.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(Schema02.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Schema02.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Schema02.class, arg, configuration);
        }
    }    
    
    public static class Schema01 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("multipleOf", new MultipleOfValidator(3))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(Schema01.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(Schema01.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(Schema01.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(Schema01.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(Schema01.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(Schema01.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(Schema01.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(Schema01.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(Schema01.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(Schema01.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Schema01.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Schema01.class, arg, configuration);
        }
    }    
    
    public static class Schema0 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("multipleOf", new MultipleOfValidator(5))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(Schema0.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(Schema0.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(Schema0.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(Schema0.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(Schema0.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(Schema0.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(Schema0.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(Schema0.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(Schema0.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(Schema0.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Schema0.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Schema0.class, arg, configuration);
        }
    }    
    
    public static class AllofCombinedWithAnyofOneof1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("allOf", new AllOfValidator(List.of(
                Schema02.class
            ))),
            new KeywordEntry("anyOf", new AnyOfValidator(List.of(
                Schema01.class
            ))),
            new KeywordEntry("oneOf", new OneOfValidator(List.of(
                Schema0.class
            )))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(AllofCombinedWithAnyofOneof1.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(AllofCombinedWithAnyofOneof1.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(AllofCombinedWithAnyofOneof1.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(AllofCombinedWithAnyofOneof1.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(AllofCombinedWithAnyofOneof1.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(AllofCombinedWithAnyofOneof1.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(AllofCombinedWithAnyofOneof1.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(AllofCombinedWithAnyofOneof1.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(AllofCombinedWithAnyofOneof1.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(AllofCombinedWithAnyofOneof1.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(AllofCombinedWithAnyofOneof1.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(AllofCombinedWithAnyofOneof1.class, arg, configuration);
        }
    }}
