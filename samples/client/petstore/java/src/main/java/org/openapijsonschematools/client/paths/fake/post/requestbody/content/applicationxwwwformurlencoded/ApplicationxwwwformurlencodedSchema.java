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

public class ApplicationxwwwformurlencodedSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static abstract sealed class ApplicationxwwwformurlencodedIntegerBoxed permits ApplicationxwwwformurlencodedIntegerBoxedNumber {
        public abstract @Nullable Object data();
    }
    
    public static final class ApplicationxwwwformurlencodedIntegerBoxedNumber extends ApplicationxwwwformurlencodedIntegerBoxed {
        public final Number data;
        private ApplicationxwwwformurlencodedIntegerBoxedNumber(Number data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxwwwformurlencodedInteger extends JsonSchema implements NumberSchemaValidator<ApplicationxwwwformurlencodedIntegerBoxedNumber> {
        private static @Nullable ApplicationxwwwformurlencodedInteger instance = null;
    
        protected ApplicationxwwwformurlencodedInteger() {
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
    
        public static ApplicationxwwwformurlencodedInteger getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedInteger();
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
        @Override
        public ApplicationxwwwformurlencodedIntegerBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApplicationxwwwformurlencodedIntegerBoxedNumber(validate(arg, configuration));
        }
    }    
    
    public static abstract sealed class ApplicationxwwwformurlencodedInt32Boxed permits ApplicationxwwwformurlencodedInt32BoxedNumber {
        public abstract @Nullable Object data();
    }
    
    public static final class ApplicationxwwwformurlencodedInt32BoxedNumber extends ApplicationxwwwformurlencodedInt32Boxed {
        public final Number data;
        private ApplicationxwwwformurlencodedInt32BoxedNumber(Number data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxwwwformurlencodedInt32 extends JsonSchema implements NumberSchemaValidator<ApplicationxwwwformurlencodedInt32BoxedNumber> {
        private static @Nullable ApplicationxwwwformurlencodedInt32 instance = null;
    
        protected ApplicationxwwwformurlencodedInt32() {
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
    
        public static ApplicationxwwwformurlencodedInt32 getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedInt32();
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
        @Override
        public ApplicationxwwwformurlencodedInt32BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApplicationxwwwformurlencodedInt32BoxedNumber(validate(arg, configuration));
        }
    }    
    
    public static class ApplicationxwwwformurlencodedInt64 extends Int64JsonSchema.Int64JsonSchema1 {
        private static @Nullable ApplicationxwwwformurlencodedInt64 instance = null;
        public static ApplicationxwwwformurlencodedInt64 getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedInt64();
            }
            return instance;
        }
    }
    
    
    public static abstract sealed class ApplicationxwwwformurlencodedNumberBoxed permits ApplicationxwwwformurlencodedNumberBoxedNumber {
        public abstract @Nullable Object data();
    }
    
    public static final class ApplicationxwwwformurlencodedNumberBoxedNumber extends ApplicationxwwwformurlencodedNumberBoxed {
        public final Number data;
        private ApplicationxwwwformurlencodedNumberBoxedNumber(Number data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxwwwformurlencodedNumber extends JsonSchema implements NumberSchemaValidator<ApplicationxwwwformurlencodedNumberBoxedNumber> {
        private static @Nullable ApplicationxwwwformurlencodedNumber instance = null;
    
        protected ApplicationxwwwformurlencodedNumber() {
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
    
        public static ApplicationxwwwformurlencodedNumber getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedNumber();
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
        @Override
        public ApplicationxwwwformurlencodedNumberBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApplicationxwwwformurlencodedNumberBoxedNumber(validate(arg, configuration));
        }
    }    
    
    public static abstract sealed class ApplicationxwwwformurlencodedFloatBoxed permits ApplicationxwwwformurlencodedFloatBoxedNumber {
        public abstract @Nullable Object data();
    }
    
    public static final class ApplicationxwwwformurlencodedFloatBoxedNumber extends ApplicationxwwwformurlencodedFloatBoxed {
        public final Number data;
        private ApplicationxwwwformurlencodedFloatBoxedNumber(Number data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxwwwformurlencodedFloat extends JsonSchema implements NumberSchemaValidator<ApplicationxwwwformurlencodedFloatBoxedNumber> {
        private static @Nullable ApplicationxwwwformurlencodedFloat instance = null;
    
        protected ApplicationxwwwformurlencodedFloat() {
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
    
        public static ApplicationxwwwformurlencodedFloat getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedFloat();
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
        @Override
        public ApplicationxwwwformurlencodedFloatBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApplicationxwwwformurlencodedFloatBoxedNumber(validate(arg, configuration));
        }
    }    
    
    public static abstract sealed class ApplicationxwwwformurlencodedDoubleBoxed permits ApplicationxwwwformurlencodedDoubleBoxedNumber {
        public abstract @Nullable Object data();
    }
    
    public static final class ApplicationxwwwformurlencodedDoubleBoxedNumber extends ApplicationxwwwformurlencodedDoubleBoxed {
        public final Number data;
        private ApplicationxwwwformurlencodedDoubleBoxedNumber(Number data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxwwwformurlencodedDouble extends JsonSchema implements NumberSchemaValidator<ApplicationxwwwformurlencodedDoubleBoxedNumber> {
        private static @Nullable ApplicationxwwwformurlencodedDouble instance = null;
    
        protected ApplicationxwwwformurlencodedDouble() {
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
    
        public static ApplicationxwwwformurlencodedDouble getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedDouble();
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
        @Override
        public ApplicationxwwwformurlencodedDoubleBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApplicationxwwwformurlencodedDoubleBoxedNumber(validate(arg, configuration));
        }
    }    
    
    public static abstract sealed class ApplicationxwwwformurlencodedStringBoxed permits ApplicationxwwwformurlencodedStringBoxedString {
        public abstract @Nullable Object data();
    }
    
    public static final class ApplicationxwwwformurlencodedStringBoxedString extends ApplicationxwwwformurlencodedStringBoxed {
        public final String data;
        private ApplicationxwwwformurlencodedStringBoxedString(String data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxwwwformurlencodedString extends JsonSchema implements StringSchemaValidator<ApplicationxwwwformurlencodedStringBoxedString> {
        private static @Nullable ApplicationxwwwformurlencodedString instance = null;
    
        protected ApplicationxwwwformurlencodedString() {
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
    
        public static ApplicationxwwwformurlencodedString getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedString();
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
        @Override
        public ApplicationxwwwformurlencodedStringBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApplicationxwwwformurlencodedStringBoxedString(validate(arg, configuration));
        }
    }    
    
    public static abstract sealed class ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxed permits ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxedString {
        public abstract @Nullable Object data();
    }
    
    public static final class ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxedString extends ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxed {
        public final String data;
        private ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxedString(String data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxwwwformurlencodedPatternWithoutDelimiter extends JsonSchema implements StringSchemaValidator<ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxedString> {
        private static @Nullable ApplicationxwwwformurlencodedPatternWithoutDelimiter instance = null;
    
        protected ApplicationxwwwformurlencodedPatternWithoutDelimiter() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .pattern(Pattern.compile(
                    "^[A-Z].*"
                ))
            );
        }
    
        public static ApplicationxwwwformurlencodedPatternWithoutDelimiter getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedPatternWithoutDelimiter();
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
        @Override
        public ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxedString(validate(arg, configuration));
        }
    }    
    
    public static class ApplicationxwwwformurlencodedByte extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable ApplicationxwwwformurlencodedByte instance = null;
        public static ApplicationxwwwformurlencodedByte getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedByte();
            }
            return instance;
        }
    }
    
    
    public static class ApplicationxwwwformurlencodedBinary extends StringJsonSchema.StringJsonSchema1 {
        // BinarySchema
        private static @Nullable ApplicationxwwwformurlencodedBinary instance = null;
        public static ApplicationxwwwformurlencodedBinary getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedBinary();
            }
            return instance;
        }
    }
    
    
    public static class ApplicationxwwwformurlencodedDate extends DateJsonSchema.DateJsonSchema1 {
        private static @Nullable ApplicationxwwwformurlencodedDate instance = null;
        public static ApplicationxwwwformurlencodedDate getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedDate();
            }
            return instance;
        }
    }
    
    
    public static abstract sealed class ApplicationxwwwformurlencodedDateTimeBoxed permits ApplicationxwwwformurlencodedDateTimeBoxedString {
        public abstract @Nullable Object data();
    }
    
    public static final class ApplicationxwwwformurlencodedDateTimeBoxedString extends ApplicationxwwwformurlencodedDateTimeBoxed {
        public final String data;
        private ApplicationxwwwformurlencodedDateTimeBoxedString(String data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxwwwformurlencodedDateTime extends JsonSchema implements StringSchemaValidator<ApplicationxwwwformurlencodedDateTimeBoxedString>, DefaultValueMethod<String> {
        private static @Nullable ApplicationxwwwformurlencodedDateTime instance = null;
    
        protected ApplicationxwwwformurlencodedDateTime() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .format("date-time")
                .defaultValue("2010-02-01T10:20:10.111110+01:00")
            );
        }
    
        public static ApplicationxwwwformurlencodedDateTime getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedDateTime();
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
        @Override
        public ApplicationxwwwformurlencodedDateTimeBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApplicationxwwwformurlencodedDateTimeBoxedString(validate(arg, configuration));
        }
    }    
    
    public static abstract sealed class ApplicationxwwwformurlencodedPasswordBoxed permits ApplicationxwwwformurlencodedPasswordBoxedString {
        public abstract @Nullable Object data();
    }
    
    public static final class ApplicationxwwwformurlencodedPasswordBoxedString extends ApplicationxwwwformurlencodedPasswordBoxed {
        public final String data;
        private ApplicationxwwwformurlencodedPasswordBoxedString(String data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxwwwformurlencodedPassword extends JsonSchema implements StringSchemaValidator<ApplicationxwwwformurlencodedPasswordBoxedString> {
        private static @Nullable ApplicationxwwwformurlencodedPassword instance = null;
    
        protected ApplicationxwwwformurlencodedPassword() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .format("password")
                .maxLength(64)
                .minLength(10)
            );
        }
    
        public static ApplicationxwwwformurlencodedPassword getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedPassword();
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
        @Override
        public ApplicationxwwwformurlencodedPasswordBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApplicationxwwwformurlencodedPasswordBoxedString(validate(arg, configuration));
        }
    }    
    
    public static class ApplicationxwwwformurlencodedCallback extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable ApplicationxwwwformurlencodedCallback instance = null;
        public static ApplicationxwwwformurlencodedCallback getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedCallback();
            }
            return instance;
        }
    }
    
    
    public static class ApplicationxwwwformurlencodedSchemaMap extends FrozenMap<@Nullable Object> {
        protected ApplicationxwwwformurlencodedSchemaMap(FrozenMap<@Nullable Object> m) {
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
        public static ApplicationxwwwformurlencodedSchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ApplicationxwwwformurlencodedSchema1.getInstance().validate(arg, configuration);
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
    
    public interface SetterForApplicationxwwwformurlencodedByte <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedByte(Map<String, @Nullable Object> instance);
        
        default T setByte(String value) {
            var instance = getInstance();
            instance.put("byte", value);
            return getBuilderAfterApplicationxwwwformurlencodedByte(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedDouble <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedDouble(Map<String, @Nullable Object> instance);
        
        default T setDouble(int value) {
            var instance = getInstance();
            instance.put("double", value);
            return getBuilderAfterApplicationxwwwformurlencodedDouble(instance);
        }
        
        default T setDouble(float value) {
            var instance = getInstance();
            instance.put("double", value);
            return getBuilderAfterApplicationxwwwformurlencodedDouble(instance);
        }
        
        default T setDouble(long value) {
            var instance = getInstance();
            instance.put("double", value);
            return getBuilderAfterApplicationxwwwformurlencodedDouble(instance);
        }
        
        default T setDouble(double value) {
            var instance = getInstance();
            instance.put("double", value);
            return getBuilderAfterApplicationxwwwformurlencodedDouble(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedNumber <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedNumber(Map<String, @Nullable Object> instance);
        
        default T setNumber(int value) {
            var instance = getInstance();
            instance.put("number", value);
            return getBuilderAfterApplicationxwwwformurlencodedNumber(instance);
        }
        
        default T setNumber(float value) {
            var instance = getInstance();
            instance.put("number", value);
            return getBuilderAfterApplicationxwwwformurlencodedNumber(instance);
        }
        
        default T setNumber(long value) {
            var instance = getInstance();
            instance.put("number", value);
            return getBuilderAfterApplicationxwwwformurlencodedNumber(instance);
        }
        
        default T setNumber(double value) {
            var instance = getInstance();
            instance.put("number", value);
            return getBuilderAfterApplicationxwwwformurlencodedNumber(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedPatternWithoutDelimiter <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedPatternWithoutDelimiter(Map<String, @Nullable Object> instance);
        
        default T pattern_without_delimiter(String value) {
            var instance = getInstance();
            instance.put("pattern_without_delimiter", value);
            return getBuilderAfterApplicationxwwwformurlencodedPatternWithoutDelimiter(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedInteger <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedInteger(Map<String, @Nullable Object> instance);
        
        default T setInteger(int value) {
            var instance = getInstance();
            instance.put("integer", value);
            return getBuilderAfterApplicationxwwwformurlencodedInteger(instance);
        }
        
        default T setInteger(float value) {
            var instance = getInstance();
            instance.put("integer", value);
            return getBuilderAfterApplicationxwwwformurlencodedInteger(instance);
        }
        
        default T setInteger(long value) {
            var instance = getInstance();
            instance.put("integer", value);
            return getBuilderAfterApplicationxwwwformurlencodedInteger(instance);
        }
        
        default T setInteger(double value) {
            var instance = getInstance();
            instance.put("integer", value);
            return getBuilderAfterApplicationxwwwformurlencodedInteger(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedInt32 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedInt32(Map<String, @Nullable Object> instance);
        
        default T int32(int value) {
            var instance = getInstance();
            instance.put("int32", value);
            return getBuilderAfterApplicationxwwwformurlencodedInt32(instance);
        }
        
        default T int32(float value) {
            var instance = getInstance();
            instance.put("int32", value);
            return getBuilderAfterApplicationxwwwformurlencodedInt32(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedInt64 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedInt64(Map<String, @Nullable Object> instance);
        
        default T int64(int value) {
            var instance = getInstance();
            instance.put("int64", value);
            return getBuilderAfterApplicationxwwwformurlencodedInt64(instance);
        }
        
        default T int64(float value) {
            var instance = getInstance();
            instance.put("int64", value);
            return getBuilderAfterApplicationxwwwformurlencodedInt64(instance);
        }
        
        default T int64(long value) {
            var instance = getInstance();
            instance.put("int64", value);
            return getBuilderAfterApplicationxwwwformurlencodedInt64(instance);
        }
        
        default T int64(double value) {
            var instance = getInstance();
            instance.put("int64", value);
            return getBuilderAfterApplicationxwwwformurlencodedInt64(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedFloat <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedFloat(Map<String, @Nullable Object> instance);
        
        default T setFloat(int value) {
            var instance = getInstance();
            instance.put("float", value);
            return getBuilderAfterApplicationxwwwformurlencodedFloat(instance);
        }
        
        default T setFloat(float value) {
            var instance = getInstance();
            instance.put("float", value);
            return getBuilderAfterApplicationxwwwformurlencodedFloat(instance);
        }
        
        default T setFloat(long value) {
            var instance = getInstance();
            instance.put("float", value);
            return getBuilderAfterApplicationxwwwformurlencodedFloat(instance);
        }
        
        default T setFloat(double value) {
            var instance = getInstance();
            instance.put("float", value);
            return getBuilderAfterApplicationxwwwformurlencodedFloat(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedString <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedString(Map<String, @Nullable Object> instance);
        
        default T setString(String value) {
            var instance = getInstance();
            instance.put("string", value);
            return getBuilderAfterApplicationxwwwformurlencodedString(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedBinary <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedBinary(Map<String, @Nullable Object> instance);
        
        default T binary(String value) {
            var instance = getInstance();
            instance.put("binary", value);
            return getBuilderAfterApplicationxwwwformurlencodedBinary(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedDate <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedDate(Map<String, @Nullable Object> instance);
        
        default T date(String value) {
            var instance = getInstance();
            instance.put("date", value);
            return getBuilderAfterApplicationxwwwformurlencodedDate(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedDateTime <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedDateTime(Map<String, @Nullable Object> instance);
        
        default T dateTime(String value) {
            var instance = getInstance();
            instance.put("dateTime", value);
            return getBuilderAfterApplicationxwwwformurlencodedDateTime(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedPassword <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedPassword(Map<String, @Nullable Object> instance);
        
        default T password(String value) {
            var instance = getInstance();
            instance.put("password", value);
            return getBuilderAfterApplicationxwwwformurlencodedPassword(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedCallback <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedCallback(Map<String, @Nullable Object> instance);
        
        default T callback(String value) {
            var instance = getInstance();
            instance.put("callback", value);
            return getBuilderAfterApplicationxwwwformurlencodedCallback(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap0000Builder extends UnsetAddPropsSetter<ApplicationxwwwformurlencodedSchemaMap0000Builder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForApplicationxwwwformurlencodedInteger<ApplicationxwwwformurlencodedSchemaMap0000Builder>, SetterForApplicationxwwwformurlencodedInt32<ApplicationxwwwformurlencodedSchemaMap0000Builder>, SetterForApplicationxwwwformurlencodedInt64<ApplicationxwwwformurlencodedSchemaMap0000Builder>, SetterForApplicationxwwwformurlencodedFloat<ApplicationxwwwformurlencodedSchemaMap0000Builder>, SetterForApplicationxwwwformurlencodedString<ApplicationxwwwformurlencodedSchemaMap0000Builder>, SetterForApplicationxwwwformurlencodedBinary<ApplicationxwwwformurlencodedSchemaMap0000Builder>, SetterForApplicationxwwwformurlencodedDate<ApplicationxwwwformurlencodedSchemaMap0000Builder>, SetterForApplicationxwwwformurlencodedDateTime<ApplicationxwwwformurlencodedSchemaMap0000Builder>, SetterForApplicationxwwwformurlencodedPassword<ApplicationxwwwformurlencodedSchemaMap0000Builder>, SetterForApplicationxwwwformurlencodedCallback<ApplicationxwwwformurlencodedSchemaMap0000Builder> {
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
        public ApplicationxwwwformurlencodedSchemaMap0000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedInteger(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedInt32(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedInt64(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedFloat(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedString(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedBinary(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedDate(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedDateTime(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedPassword(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedCallback(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap0001Builder implements SetterForApplicationxwwwformurlencodedPatternWithoutDelimiter<ApplicationxwwwformurlencodedSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap0001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0000Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap0010Builder implements SetterForApplicationxwwwformurlencodedNumber<ApplicationxwwwformurlencodedSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap0010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedNumber(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0000Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap0011Builder implements SetterForApplicationxwwwformurlencodedNumber<ApplicationxwwwformurlencodedSchemaMap0001Builder>, SetterForApplicationxwwwformurlencodedPatternWithoutDelimiter<ApplicationxwwwformurlencodedSchemaMap0010Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap0011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0001Builder getBuilderAfterApplicationxwwwformurlencodedNumber(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0001Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap0010Builder getBuilderAfterApplicationxwwwformurlencodedPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0010Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap0100Builder implements SetterForApplicationxwwwformurlencodedDouble<ApplicationxwwwformurlencodedSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap0100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedDouble(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0000Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap0101Builder implements SetterForApplicationxwwwformurlencodedDouble<ApplicationxwwwformurlencodedSchemaMap0001Builder>, SetterForApplicationxwwwformurlencodedPatternWithoutDelimiter<ApplicationxwwwformurlencodedSchemaMap0100Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap0101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0001Builder getBuilderAfterApplicationxwwwformurlencodedDouble(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0001Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap0100Builder getBuilderAfterApplicationxwwwformurlencodedPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0100Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap0110Builder implements SetterForApplicationxwwwformurlencodedDouble<ApplicationxwwwformurlencodedSchemaMap0010Builder>, SetterForApplicationxwwwformurlencodedNumber<ApplicationxwwwformurlencodedSchemaMap0100Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap0110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0010Builder getBuilderAfterApplicationxwwwformurlencodedDouble(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0010Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap0100Builder getBuilderAfterApplicationxwwwformurlencodedNumber(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0100Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap0111Builder implements SetterForApplicationxwwwformurlencodedDouble<ApplicationxwwwformurlencodedSchemaMap0011Builder>, SetterForApplicationxwwwformurlencodedNumber<ApplicationxwwwformurlencodedSchemaMap0101Builder>, SetterForApplicationxwwwformurlencodedPatternWithoutDelimiter<ApplicationxwwwformurlencodedSchemaMap0110Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap0111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0011Builder getBuilderAfterApplicationxwwwformurlencodedDouble(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0011Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap0101Builder getBuilderAfterApplicationxwwwformurlencodedNumber(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0101Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap0110Builder getBuilderAfterApplicationxwwwformurlencodedPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0110Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap1000Builder implements SetterForApplicationxwwwformurlencodedByte<ApplicationxwwwformurlencodedSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap1000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0000Builder getBuilderAfterApplicationxwwwformurlencodedByte(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0000Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap1001Builder implements SetterForApplicationxwwwformurlencodedByte<ApplicationxwwwformurlencodedSchemaMap0001Builder>, SetterForApplicationxwwwformurlencodedPatternWithoutDelimiter<ApplicationxwwwformurlencodedSchemaMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap1001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0001Builder getBuilderAfterApplicationxwwwformurlencodedByte(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0001Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap1000Builder getBuilderAfterApplicationxwwwformurlencodedPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap1000Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap1010Builder implements SetterForApplicationxwwwformurlencodedByte<ApplicationxwwwformurlencodedSchemaMap0010Builder>, SetterForApplicationxwwwformurlencodedNumber<ApplicationxwwwformurlencodedSchemaMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap1010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0010Builder getBuilderAfterApplicationxwwwformurlencodedByte(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0010Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap1000Builder getBuilderAfterApplicationxwwwformurlencodedNumber(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap1000Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap1011Builder implements SetterForApplicationxwwwformurlencodedByte<ApplicationxwwwformurlencodedSchemaMap0011Builder>, SetterForApplicationxwwwformurlencodedNumber<ApplicationxwwwformurlencodedSchemaMap1001Builder>, SetterForApplicationxwwwformurlencodedPatternWithoutDelimiter<ApplicationxwwwformurlencodedSchemaMap1010Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap1011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0011Builder getBuilderAfterApplicationxwwwformurlencodedByte(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0011Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap1001Builder getBuilderAfterApplicationxwwwformurlencodedNumber(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap1001Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap1010Builder getBuilderAfterApplicationxwwwformurlencodedPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap1010Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap1100Builder implements SetterForApplicationxwwwformurlencodedByte<ApplicationxwwwformurlencodedSchemaMap0100Builder>, SetterForApplicationxwwwformurlencodedDouble<ApplicationxwwwformurlencodedSchemaMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap1100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0100Builder getBuilderAfterApplicationxwwwformurlencodedByte(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0100Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap1000Builder getBuilderAfterApplicationxwwwformurlencodedDouble(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap1000Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap1101Builder implements SetterForApplicationxwwwformurlencodedByte<ApplicationxwwwformurlencodedSchemaMap0101Builder>, SetterForApplicationxwwwformurlencodedDouble<ApplicationxwwwformurlencodedSchemaMap1001Builder>, SetterForApplicationxwwwformurlencodedPatternWithoutDelimiter<ApplicationxwwwformurlencodedSchemaMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap1101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0101Builder getBuilderAfterApplicationxwwwformurlencodedByte(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0101Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap1001Builder getBuilderAfterApplicationxwwwformurlencodedDouble(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap1001Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap1100Builder getBuilderAfterApplicationxwwwformurlencodedPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap1100Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMap1110Builder implements SetterForApplicationxwwwformurlencodedByte<ApplicationxwwwformurlencodedSchemaMap0110Builder>, SetterForApplicationxwwwformurlencodedDouble<ApplicationxwwwformurlencodedSchemaMap1010Builder>, SetterForApplicationxwwwformurlencodedNumber<ApplicationxwwwformurlencodedSchemaMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMap1110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0110Builder getBuilderAfterApplicationxwwwformurlencodedByte(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0110Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap1010Builder getBuilderAfterApplicationxwwwformurlencodedDouble(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap1010Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap1100Builder getBuilderAfterApplicationxwwwformurlencodedNumber(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap1100Builder(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMapBuilder implements SetterForApplicationxwwwformurlencodedByte<ApplicationxwwwformurlencodedSchemaMap0111Builder>, SetterForApplicationxwwwformurlencodedDouble<ApplicationxwwwformurlencodedSchemaMap1011Builder>, SetterForApplicationxwwwformurlencodedNumber<ApplicationxwwwformurlencodedSchemaMap1101Builder>, SetterForApplicationxwwwformurlencodedPatternWithoutDelimiter<ApplicationxwwwformurlencodedSchemaMap1110Builder> {
        private final Map<String, @Nullable Object> instance;
        public ApplicationxwwwformurlencodedSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMap0111Builder getBuilderAfterApplicationxwwwformurlencodedByte(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap0111Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap1011Builder getBuilderAfterApplicationxwwwformurlencodedDouble(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap1011Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap1101Builder getBuilderAfterApplicationxwwwformurlencodedNumber(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap1101Builder(instance);
        }
        public ApplicationxwwwformurlencodedSchemaMap1110Builder getBuilderAfterApplicationxwwwformurlencodedPatternWithoutDelimiter(Map<String, @Nullable Object> instance) {
            return new ApplicationxwwwformurlencodedSchemaMap1110Builder(instance);
        }
    }
    
    
    public static abstract sealed class ApplicationxwwwformurlencodedSchema1Boxed permits ApplicationxwwwformurlencodedSchema1BoxedMap {
        public abstract @Nullable Object data();
    }
    
    public static final class ApplicationxwwwformurlencodedSchema1BoxedMap extends ApplicationxwwwformurlencodedSchema1Boxed {
        public final ApplicationxwwwformurlencodedSchemaMap data;
        private ApplicationxwwwformurlencodedSchema1BoxedMap(ApplicationxwwwformurlencodedSchemaMap data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    public static class ApplicationxwwwformurlencodedSchema1 extends JsonSchema implements MapSchemaValidator<ApplicationxwwwformurlencodedSchemaMap, ApplicationxwwwformurlencodedSchema1BoxedMap> {
        private static @Nullable ApplicationxwwwformurlencodedSchema1 instance = null;
    
        protected ApplicationxwwwformurlencodedSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("integer", ApplicationxwwwformurlencodedInteger.class),
                    new PropertyEntry("int32", ApplicationxwwwformurlencodedInt32.class),
                    new PropertyEntry("int64", ApplicationxwwwformurlencodedInt64.class),
                    new PropertyEntry("number", ApplicationxwwwformurlencodedNumber.class),
                    new PropertyEntry("float", ApplicationxwwwformurlencodedFloat.class),
                    new PropertyEntry("double", ApplicationxwwwformurlencodedDouble.class),
                    new PropertyEntry("string", ApplicationxwwwformurlencodedString.class),
                    new PropertyEntry("pattern_without_delimiter", ApplicationxwwwformurlencodedPatternWithoutDelimiter.class),
                    new PropertyEntry("byte", ApplicationxwwwformurlencodedByte.class),
                    new PropertyEntry("binary", ApplicationxwwwformurlencodedBinary.class),
                    new PropertyEntry("date", ApplicationxwwwformurlencodedDate.class),
                    new PropertyEntry("dateTime", ApplicationxwwwformurlencodedDateTime.class),
                    new PropertyEntry("password", ApplicationxwwwformurlencodedPassword.class),
                    new PropertyEntry("callback", ApplicationxwwwformurlencodedCallback.class)
                ))
                .required(Set.of(
                    "byte",
                    "double",
                    "number",
                    "pattern_without_delimiter"
                ))
            );
        }
    
        public static ApplicationxwwwformurlencodedSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedSchema1();
            }
            return instance;
        }
        
        public ApplicationxwwwformurlencodedSchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ApplicationxwwwformurlencodedSchemaMap(castProperties);
        }
        
        public ApplicationxwwwformurlencodedSchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public ApplicationxwwwformurlencodedSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApplicationxwwwformurlencodedSchema1BoxedMap(validate(arg, configuration));
        }
    }

}
