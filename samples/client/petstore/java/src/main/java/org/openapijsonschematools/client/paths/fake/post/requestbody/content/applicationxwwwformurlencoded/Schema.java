package org.openapijsonschematools.client.paths.fake.post.requestbody.content.applicationxwwwformurlencoded;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.DateJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.DefaultValueMethod;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class IntegerSchema extends JsonSchema implements NumberSchemaValidator {
        private static @Nullable IntegerSchema instance = null;
    
        protected IntegerSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .format("int")
                .maximum(100)
                .minimum(10)
            );
        }
    
        public static IntegerSchema getInstance() {
            if (instance == null) {
                instance = new IntegerSchema();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return (int) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return (long) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class Int32 extends JsonSchema implements NumberSchemaValidator {
        private static @Nullable Int32 instance = null;
    
        protected Int32() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .format("int32")
                .maximum(200)
                .minimum(20)
            );
        }
    
        public static Int32 getInstance() {
            if (instance == null) {
                instance = new Int32();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return (int) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg, configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class Int64 extends Int64JsonSchema {
        private static @Nullable Int64 instance = null;
        public static Int64 getInstance() {
            if (instance == null) {
                instance = new Int64();
            }
            return instance;
        }
    }
    
    
    public static class NumberSchema extends JsonSchema implements NumberSchemaValidator {
        private static @Nullable NumberSchema instance = null;
    
        protected NumberSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .maximum(543.2)
                .minimum(32.1)
            );
        }
    
        public static NumberSchema getInstance() {
            if (instance == null) {
                instance = new NumberSchema();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return (int) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return (long) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class FloatSchema extends JsonSchema implements NumberSchemaValidator {
        private static @Nullable FloatSchema instance = null;
    
        protected FloatSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .format("float")
                .maximum(987.6)
            );
        }
    
        public static FloatSchema getInstance() {
            if (instance == null) {
                instance = new FloatSchema();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg, configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class DoubleSchema extends JsonSchema implements NumberSchemaValidator {
        private static @Nullable DoubleSchema instance = null;
    
        protected DoubleSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .format("double")
                .maximum(123.4)
                .minimum(67.8)
            );
        }
    
        public static DoubleSchema getInstance() {
            if (instance == null) {
                instance = new DoubleSchema();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class StringSchema extends JsonSchema implements StringSchemaValidator {
        private static @Nullable StringSchema instance = null;
    
        protected StringSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .pattern(Pattern.compile(
                    "[a-z]",
                    Pattern.CASE_INSENSITIVE
                ))
            );
        }
    
        public static StringSchema getInstance() {
            if (instance == null) {
                instance = new StringSchema();
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
    
    public static class PatternWithoutDelimiter extends JsonSchema implements StringSchemaValidator {
        private static @Nullable PatternWithoutDelimiter instance = null;
    
        protected PatternWithoutDelimiter() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .pattern(Pattern.compile(
                    "^[A-Z].*"
                ))
            );
        }
    
        public static PatternWithoutDelimiter getInstance() {
            if (instance == null) {
                instance = new PatternWithoutDelimiter();
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
    
    public static class ByteSchema extends StringJsonSchema {
        private static @Nullable ByteSchema instance = null;
        public static ByteSchema getInstance() {
            if (instance == null) {
                instance = new ByteSchema();
            }
            return instance;
        }
    }
    
    
    public static class Binary extends StringJsonSchema {
        // BinarySchema
        private static @Nullable Binary instance = null;
        public static Binary getInstance() {
            if (instance == null) {
                instance = new Binary();
            }
            return instance;
        }
    }
    
    
    public static class Date extends DateJsonSchema {
        private static @Nullable Date instance = null;
        public static Date getInstance() {
            if (instance == null) {
                instance = new Date();
            }
            return instance;
        }
    }
    
    
    public static class DateTime extends JsonSchema implements StringSchemaValidator, DefaultValueMethod<String> {
        private static @Nullable DateTime instance = null;
    
        protected DateTime() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .format("date-time")
                .defaultValue("2010-02-01T10:20:10.111110+01:00")
            );
        }
    
        public static DateTime getInstance() {
            if (instance == null) {
                instance = new DateTime();
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
        public String defaultValue() {
            if (defaultValue instanceof String) {
                return (String) defaultValue;
            }
            throw new InvalidTypeException("Invalid type stored in defaultValue");
        }
    
        public static abstract sealed class DateTimeBoxed permits DateTimeBoxedString {}
        public static final class DateTimeBoxedString extends DateTimeBoxed {
            public final String data;
            private DateTimeString(String data) {
                this.data = data;
            }
        }
        public DateTimeBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new DateTimeBoxedString(validate(arg, configuration));
        }
    }    
    
    public static class Password extends JsonSchema implements StringSchemaValidator {
        private static @Nullable Password instance = null;
    
        protected Password() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .format("password")
                .maxLength(64)
                .minLength(10)
            );
        }
    
        public static Password getInstance() {
            if (instance == null) {
                instance = new Password();
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
    
    public static class Callback extends StringJsonSchema {
        private static @Nullable Callback instance = null;
        public static Callback getInstance() {
            if (instance == null) {
                instance = new Callback();
            }
            return instance;
        }
    }
    
    
    public static class SchemaMap extends FrozenMap<@Nullable Object> {
        protected SchemaMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "byte",
            "double",
            "number",
            "pattern_without_delimiter"
        );
        public static final Set<String> optionalKeys = Set.of(
            "integer",
            "int32",
            "int64",
            "float",
            "string",
            "binary",
            "date",
            "dateTime",
            "password",
            "callback"
        );
        public static SchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema1.getInstance().validate(arg, configuration);
        }
        
        public String pattern_without_delimiter() {
                        @Nullable Object value = get("pattern_without_delimiter");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for pattern_without_delimiter");
            }
            return (String) value;
        }
        
        public Number int32() throws UnsetPropertyException {
            String key = "int32";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for int32");
            }
            return (Number) value;
        }
        
        public Number int64() throws UnsetPropertyException {
            String key = "int64";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for int64");
            }
            return (Number) value;
        }
        
        public String binary() throws UnsetPropertyException {
            String key = "binary";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for binary");
            }
            return (String) value;
        }
        
        public String date() throws UnsetPropertyException {
            String key = "date";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for date");
            }
            return (String) value;
        }
        
        public String dateTime() throws UnsetPropertyException {
            String key = "dateTime";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for dateTime");
            }
            return (String) value;
        }
        
        public String password() throws UnsetPropertyException {
            String key = "password";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for password");
            }
            return (String) value;
        }
        
        public String callback() throws UnsetPropertyException {
            String key = "callback";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for callback");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForByteSchema <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterByteSchema(Map<String, @Nullable Object> instance);
        
        default T setByte(String value) {
            var instance = getInstance();
            instance.put("byte", value);
            return getBuilderAfterByteSchema(instance);
        }
    }
    
    public interface SetterForDoubleSchema <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterDoubleSchema(Map<String, @Nullable Object> instance);
        
        default T setDouble(int value) {
            var instance = getInstance();
            instance.put("double", value);
            return getBuilderAfterDoubleSchema(instance);
        }
        
        default T setDouble(float value) {
            var instance = getInstance();
            instance.put("double", value);
            return getBuilderAfterDoubleSchema(instance);
        }
        
        default T setDouble(long value) {
            var instance = getInstance();
            instance.put("double", value);
            return getBuilderAfterDoubleSchema(instance);
        }
        
        default T setDouble(double value) {
            var instance = getInstance();
            instance.put("double", value);
            return getBuilderAfterDoubleSchema(instance);
        }
    }
    
    public interface SetterForNumberSchema <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance);
        
        default T setNumber(int value) {
            var instance = getInstance();
            instance.put("number", value);
            return getBuilderAfterNumberSchema(instance);
        }
        
        default T setNumber(float value) {
            var instance = getInstance();
            instance.put("number", value);
            return getBuilderAfterNumberSchema(instance);
        }
        
        default T setNumber(long value) {
            var instance = getInstance();
            instance.put("number", value);
            return getBuilderAfterNumberSchema(instance);
        }
        
        default T setNumber(double value) {
            var instance = getInstance();
            instance.put("number", value);
            return getBuilderAfterNumberSchema(instance);
        }
    }
    
    public interface SetterForPatternWithoutDelimiter <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterPatternWithoutDelimiter(Map<String, @Nullable Object> instance);
        
        default T pattern_without_delimiter(String value) {
            var instance = getInstance();
            instance.put("pattern_without_delimiter", value);
            return getBuilderAfterPatternWithoutDelimiter(instance);
        }
    }
    
    public interface SetterForIntegerSchema <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterIntegerSchema(Map<String, @Nullable Object> instance);
        
        default T setInteger(int value) {
            var instance = getInstance();
            instance.put("integer", value);
            return getBuilderAfterIntegerSchema(instance);
        }
        
        default T setInteger(float value) {
            var instance = getInstance();
            instance.put("integer", value);
            return getBuilderAfterIntegerSchema(instance);
        }
        
        default T setInteger(long value) {
            var instance = getInstance();
            instance.put("integer", value);
            return getBuilderAfterIntegerSchema(instance);
        }
        
        default T setInteger(double value) {
            var instance = getInstance();
            instance.put("integer", value);
            return getBuilderAfterIntegerSchema(instance);
        }
    }
    
    public interface SetterForInt32 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterInt32(Map<String, @Nullable Object> instance);
        
        default T int32(int value) {
            var instance = getInstance();
            instance.put("int32", value);
            return getBuilderAfterInt32(instance);
        }
        
        default T int32(float value) {
            var instance = getInstance();
            instance.put("int32", value);
            return getBuilderAfterInt32(instance);
        }
    }
    
    public interface SetterForInt64 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterInt64(Map<String, @Nullable Object> instance);
        
        default T int64(int value) {
            var instance = getInstance();
            instance.put("int64", value);
            return getBuilderAfterInt64(instance);
        }
        
        default T int64(float value) {
            var instance = getInstance();
            instance.put("int64", value);
            return getBuilderAfterInt64(instance);
        }
        
        default T int64(long value) {
            var instance = getInstance();
            instance.put("int64", value);
            return getBuilderAfterInt64(instance);
        }
        
        default T int64(double value) {
            var instance = getInstance();
            instance.put("int64", value);
            return getBuilderAfterInt64(instance);
        }
    }
    
    public interface SetterForFloatSchema <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFloatSchema(Map<String, @Nullable Object> instance);
        
        default T setFloat(int value) {
            var instance = getInstance();
            instance.put("float", value);
            return getBuilderAfterFloatSchema(instance);
        }
        
        default T setFloat(float value) {
            var instance = getInstance();
            instance.put("float", value);
            return getBuilderAfterFloatSchema(instance);
        }
        
        default T setFloat(long value) {
            var instance = getInstance();
            instance.put("float", value);
            return getBuilderAfterFloatSchema(instance);
        }
        
        default T setFloat(double value) {
            var instance = getInstance();
            instance.put("float", value);
            return getBuilderAfterFloatSchema(instance);
        }
    }
    
    public interface SetterForStringSchema <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterStringSchema(Map<String, @Nullable Object> instance);
        
        default T setString(String value) {
            var instance = getInstance();
            instance.put("string", value);
            return getBuilderAfterStringSchema(instance);
        }
    }
    
    public interface SetterForBinary <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterBinary(Map<String, @Nullable Object> instance);
        
        default T binary(String value) {
            var instance = getInstance();
            instance.put("binary", value);
            return getBuilderAfterBinary(instance);
        }
    }
    
    public interface SetterForDate <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterDate(Map<String, @Nullable Object> instance);
        
        default T date(String value) {
            var instance = getInstance();
            instance.put("date", value);
            return getBuilderAfterDate(instance);
        }
    }
    
    public interface SetterForDateTime <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterDateTime(Map<String, @Nullable Object> instance);
        
        default T dateTime(String value) {
            var instance = getInstance();
            instance.put("dateTime", value);
            return getBuilderAfterDateTime(instance);
        }
    }
    
    public interface SetterForPassword <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterPassword(Map<String, @Nullable Object> instance);
        
        default T password(String value) {
            var instance = getInstance();
            instance.put("password", value);
            return getBuilderAfterPassword(instance);
        }
    }
    
    public interface SetterForCallback <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCallback(Map<String, @Nullable Object> instance);
        
        default T callback(String value) {
            var instance = getInstance();
            instance.put("callback", value);
            return getBuilderAfterCallback(instance);
        }
    }
    
    public static class SchemaMap0000Builder extends UnsetAddPropsSetter<SchemaMap0000Builder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForIntegerSchema<SchemaMap0000Builder>, SetterForInt32<SchemaMap0000Builder>, SetterForInt64<SchemaMap0000Builder>, SetterForFloatSchema<SchemaMap0000Builder>, SetterForStringSchema<SchemaMap0000Builder>, SetterForBinary<SchemaMap0000Builder>, SetterForDate<SchemaMap0000Builder>, SetterForDateTime<SchemaMap0000Builder>, SetterForPassword<SchemaMap0000Builder>, SetterForCallback<SchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "byte",
            "double",
            "number",
            "pattern_without_delimiter",
            "integer",
            "int32",
            "int64",
            "float",
            "string",
            "binary",
            "date",
            "dateTime",
            "password",
            "callback"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public SchemaMap0000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0000Builder getBuilderAfterIntegerSchema(Map<String, @Nullable Object> instance) {
            return this;
        }
        public SchemaMap0000Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return this;
        }
        public SchemaMap0000Builder getBuilderAfterInt64(Map<String, @Nullable Object> instance) {
            return this;
        }
        public SchemaMap0000Builder getBuilderAfterFloatSchema(Map<String, @Nullable Object> instance) {
            return this;
        }
        public SchemaMap0000Builder getBuilderAfterStringSchema(Map<String, @Nullable Object> instance) {
            return this;
        }
        public SchemaMap0000Builder getBuilderAfterBinary(Map<String, @Nullable Object> instance) {
            return this;
        }
        public SchemaMap0000Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return this;
        }
        public SchemaMap0000Builder getBuilderAfterDateTime(Map<String, @Nullable Object> instance) {
            return this;
        }
        public SchemaMap0000Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return this;
        }
        public SchemaMap0000Builder getBuilderAfterCallback(Map<String, @Nullable Object> instance) {
            return this;
        }
        public SchemaMap0000Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class SchemaMap0001Builder implements SetterForPatternWithoutDelimiter<SchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap0001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0000Builder getBuilderAfterPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new SchemaMap0000Builder(instance);
        }
    }
    
    public static class SchemaMap0010Builder implements SetterForNumberSchema<SchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap0010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0000Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0000Builder(instance);
        }
    }
    
    public static class SchemaMap0011Builder implements SetterForNumberSchema<SchemaMap0001Builder>, SetterForPatternWithoutDelimiter<SchemaMap0010Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap0011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0001Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0001Builder(instance);
        }
        public SchemaMap0010Builder getBuilderAfterPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new SchemaMap0010Builder(instance);
        }
    }
    
    public static class SchemaMap0100Builder implements SetterForDoubleSchema<SchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap0100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0000Builder getBuilderAfterDoubleSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0000Builder(instance);
        }
    }
    
    public static class SchemaMap0101Builder implements SetterForDoubleSchema<SchemaMap0001Builder>, SetterForPatternWithoutDelimiter<SchemaMap0100Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap0101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0001Builder getBuilderAfterDoubleSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0001Builder(instance);
        }
        public SchemaMap0100Builder getBuilderAfterPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new SchemaMap0100Builder(instance);
        }
    }
    
    public static class SchemaMap0110Builder implements SetterForDoubleSchema<SchemaMap0010Builder>, SetterForNumberSchema<SchemaMap0100Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap0110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0010Builder getBuilderAfterDoubleSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0010Builder(instance);
        }
        public SchemaMap0100Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0100Builder(instance);
        }
    }
    
    public static class SchemaMap0111Builder implements SetterForDoubleSchema<SchemaMap0011Builder>, SetterForNumberSchema<SchemaMap0101Builder>, SetterForPatternWithoutDelimiter<SchemaMap0110Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap0111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0011Builder getBuilderAfterDoubleSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0011Builder(instance);
        }
        public SchemaMap0101Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0101Builder(instance);
        }
        public SchemaMap0110Builder getBuilderAfterPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new SchemaMap0110Builder(instance);
        }
    }
    
    public static class SchemaMap1000Builder implements SetterForByteSchema<SchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap1000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0000Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0000Builder(instance);
        }
    }
    
    public static class SchemaMap1001Builder implements SetterForByteSchema<SchemaMap0001Builder>, SetterForPatternWithoutDelimiter<SchemaMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap1001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0001Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0001Builder(instance);
        }
        public SchemaMap1000Builder getBuilderAfterPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new SchemaMap1000Builder(instance);
        }
    }
    
    public static class SchemaMap1010Builder implements SetterForByteSchema<SchemaMap0010Builder>, SetterForNumberSchema<SchemaMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap1010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0010Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0010Builder(instance);
        }
        public SchemaMap1000Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap1000Builder(instance);
        }
    }
    
    public static class SchemaMap1011Builder implements SetterForByteSchema<SchemaMap0011Builder>, SetterForNumberSchema<SchemaMap1001Builder>, SetterForPatternWithoutDelimiter<SchemaMap1010Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap1011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0011Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0011Builder(instance);
        }
        public SchemaMap1001Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap1001Builder(instance);
        }
        public SchemaMap1010Builder getBuilderAfterPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new SchemaMap1010Builder(instance);
        }
    }
    
    public static class SchemaMap1100Builder implements SetterForByteSchema<SchemaMap0100Builder>, SetterForDoubleSchema<SchemaMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap1100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0100Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0100Builder(instance);
        }
        public SchemaMap1000Builder getBuilderAfterDoubleSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap1000Builder(instance);
        }
    }
    
    public static class SchemaMap1101Builder implements SetterForByteSchema<SchemaMap0101Builder>, SetterForDoubleSchema<SchemaMap1001Builder>, SetterForPatternWithoutDelimiter<SchemaMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap1101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0101Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0101Builder(instance);
        }
        public SchemaMap1001Builder getBuilderAfterDoubleSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap1001Builder(instance);
        }
        public SchemaMap1100Builder getBuilderAfterPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new SchemaMap1100Builder(instance);
        }
    }
    
    public static class SchemaMap1110Builder implements SetterForByteSchema<SchemaMap0110Builder>, SetterForDoubleSchema<SchemaMap1010Builder>, SetterForNumberSchema<SchemaMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap1110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0110Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0110Builder(instance);
        }
        public SchemaMap1010Builder getBuilderAfterDoubleSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap1010Builder(instance);
        }
        public SchemaMap1100Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap1100Builder(instance);
        }
    }
    
    public static class SchemaMapBuilder implements SetterForByteSchema<SchemaMap0111Builder>, SetterForDoubleSchema<SchemaMap1011Builder>, SetterForNumberSchema<SchemaMap1101Builder>, SetterForPatternWithoutDelimiter<SchemaMap1110Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap0111Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap0111Builder(instance);
        }
        public SchemaMap1011Builder getBuilderAfterDoubleSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap1011Builder(instance);
        }
        public SchemaMap1101Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new SchemaMap1101Builder(instance);
        }
        public SchemaMap1110Builder getBuilderAfterPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new SchemaMap1110Builder(instance);
        }
    }
    
    
    public static class Schema1 extends JsonSchema implements MapSchemaValidator<SchemaMap> {
        private static @Nullable Schema1 instance = null;
    
        protected Schema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("integer", IntegerSchema.class),
                    new PropertyEntry("int32", Int32.class),
                    new PropertyEntry("int64", Int64.class),
                    new PropertyEntry("number", NumberSchema.class),
                    new PropertyEntry("float", FloatSchema.class),
                    new PropertyEntry("double", DoubleSchema.class),
                    new PropertyEntry("string", StringSchema.class),
                    new PropertyEntry("pattern_without_delimiter", PatternWithoutDelimiter.class),
                    new PropertyEntry("byte", ByteSchema.class),
                    new PropertyEntry("binary", Binary.class),
                    new PropertyEntry("date", Date.class),
                    new PropertyEntry("dateTime", DateTime.class),
                    new PropertyEntry("password", Password.class),
                    new PropertyEntry("callback", Callback.class)
                ))
                .required(Set.of(
                    "byte",
                    "double",
                    "number",
                    "pattern_without_delimiter"
                ))
            );
        }
    
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
        
        public SchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new SchemaMap(castProperties);
        }
        
        public SchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
