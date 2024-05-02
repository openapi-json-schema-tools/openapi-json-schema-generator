package org.openapijsonschematools.client.components.schemas;
import java.math.BigDecimal;
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
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.DoubleEnumValidator;
import org.openapijsonschematools.client.schemas.validation.DoubleValueMethod;
import org.openapijsonschematools.client.schemas.validation.FloatEnumValidator;
import org.openapijsonschematools.client.schemas.validation.FloatValueMethod;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.IntegerEnumValidator;
import org.openapijsonschematools.client.schemas.validation.IntegerValueMethod;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.LongEnumValidator;
import org.openapijsonschematools.client.schemas.validation.LongValueMethod;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringEnumValidator;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.StringValueMethod;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class EnumTest {
    // nest classes so all schemas and input/output classes can be public
    
    public enum StringEnumStringEnums implements StringValueMethod {
        UPPER("UPPER"),
        LOWER("lower"),
        EMPTY("");
        private final String value;
    
        StringEnumStringEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface EnumStringBoxed permits EnumStringBoxedString {
        @Nullable Object getData();
    }
    
    public record EnumStringBoxedString(String data) implements EnumStringBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class EnumString extends JsonSchema<EnumStringBoxed> implements StringSchemaValidator<EnumStringBoxedString>, StringEnumValidator<StringEnumStringEnums> {
        private static @Nullable EnumString instance = null;
    
        protected EnumString() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "UPPER",
                    "lower",
                    ""
                ))
            );
        }
    
        public static EnumString getInstance() {
            if (instance == null) {
                instance = new EnumString();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public String validate(StringEnumStringEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public EnumStringBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new EnumStringBoxedString(validate(arg, configuration));
        }
        @Override
        public EnumStringBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    public enum StringEnumStringRequiredEnums implements StringValueMethod {
        UPPER("UPPER"),
        LOWER("lower"),
        EMPTY("");
        private final String value;
    
        StringEnumStringRequiredEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface EnumStringRequiredBoxed permits EnumStringRequiredBoxedString {
        @Nullable Object getData();
    }
    
    public record EnumStringRequiredBoxedString(String data) implements EnumStringRequiredBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class EnumStringRequired extends JsonSchema<EnumStringRequiredBoxed> implements StringSchemaValidator<EnumStringRequiredBoxedString>, StringEnumValidator<StringEnumStringRequiredEnums> {
        private static @Nullable EnumStringRequired instance = null;
    
        protected EnumStringRequired() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "UPPER",
                    "lower",
                    ""
                ))
            );
        }
    
        public static EnumStringRequired getInstance() {
            if (instance == null) {
                instance = new EnumStringRequired();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public String validate(StringEnumStringRequiredEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public EnumStringRequiredBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new EnumStringRequiredBoxedString(validate(arg, configuration));
        }
        @Override
        public EnumStringRequiredBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    public enum IntegerEnumIntegerEnums implements IntegerValueMethod {
        POSITIVE_1(1),
        NEGATIVE_1(-1);
        private final int value;
    
        IntegerEnumIntegerEnums(int value) {
            this.value = value;
        }
        public int value() {
            return this.value;
        }
    }
    
    public enum LongEnumIntegerEnums implements LongValueMethod {
        POSITIVE_1(1L),
        NEGATIVE_1(-1L);
        private final long value;
    
        LongEnumIntegerEnums(long value) {
            this.value = value;
        }
        public long value() {
            return this.value;
        }
    }
    
    public enum FloatEnumIntegerEnums implements FloatValueMethod {
        POSITIVE_1(1.0f),
        NEGATIVE_1(-1.0f);
        private final float value;
    
        FloatEnumIntegerEnums(float value) {
            this.value = value;
        }
        public float value() {
            return this.value;
        }
    }
    
    public enum DoubleEnumIntegerEnums implements DoubleValueMethod {
        POSITIVE_1(1.0d),
        NEGATIVE_1(-1.0d);
        private final double value;
    
        DoubleEnumIntegerEnums(double value) {
            this.value = value;
        }
        public double value() {
            return this.value;
        }
    }
    
    
    public sealed interface EnumIntegerBoxed permits EnumIntegerBoxedNumber {
        @Nullable Object getData();
    }
    
    public record EnumIntegerBoxedNumber(Number data) implements EnumIntegerBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class EnumInteger extends JsonSchema<EnumIntegerBoxed> implements IntegerEnumValidator<IntegerEnumIntegerEnums>, LongEnumValidator<LongEnumIntegerEnums>, FloatEnumValidator<FloatEnumIntegerEnums>, DoubleEnumValidator<DoubleEnumIntegerEnums>, NumberSchemaValidator<EnumIntegerBoxedNumber> {
        private static @Nullable EnumInteger instance = null;
    
        protected EnumInteger() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .format("int32")
                .enumValues(SetMaker.makeSet(
                    new BigDecimal("1"),
                    new BigDecimal("-1")
                ))
            );
        }
    
        public static EnumInteger getInstance() {
            if (instance == null) {
                instance = new EnumInteger();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
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
        public int validate(IntegerEnumIntegerEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return (int) validate((Number) arg.value(), configuration);
        }
        
        @Override
        public long validate(LongEnumIntegerEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return (long) validate((Number) arg.value(), configuration);
        }
        
        @Override
        public float validate(FloatEnumIntegerEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg.value(), configuration);
        }
        
        @Override
        public double validate(DoubleEnumIntegerEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public EnumIntegerBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new EnumIntegerBoxedNumber(validate(arg, configuration));
        }
        @Override
        public EnumIntegerBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    public enum DoubleEnumNumberEnums implements DoubleValueMethod {
        POSITIVE_1_PT_1(1.1d),
        NEGATIVE_1_PT_2(-1.2d);
        private final double value;
    
        DoubleEnumNumberEnums(double value) {
            this.value = value;
        }
        public double value() {
            return this.value;
        }
    }
    
    public enum FloatEnumNumberEnums implements FloatValueMethod {
        POSITIVE_1_PT_1(1.1f),
        NEGATIVE_1_PT_2(-1.2f);
        private final float value;
    
        FloatEnumNumberEnums(float value) {
            this.value = value;
        }
        public float value() {
            return this.value;
        }
    }
    
    
    public sealed interface EnumNumberBoxed permits EnumNumberBoxedNumber {
        @Nullable Object getData();
    }
    
    public record EnumNumberBoxedNumber(Number data) implements EnumNumberBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class EnumNumber extends JsonSchema<EnumNumberBoxed> implements FloatEnumValidator<FloatEnumNumberEnums>, DoubleEnumValidator<DoubleEnumNumberEnums>, NumberSchemaValidator<EnumNumberBoxedNumber> {
        private static @Nullable EnumNumber instance = null;
    
        protected EnumNumber() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .format("double")
                .enumValues(SetMaker.makeSet(
                    new BigDecimal("1.1"),
                    new BigDecimal("-1.2")
                ))
            );
        }
    
        public static EnumNumber getInstance() {
            if (instance == null) {
                instance = new EnumNumber();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public float validate(FloatEnumNumberEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg.value(), configuration);
        }
        
        @Override
        public double validate(DoubleEnumNumberEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public EnumNumberBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new EnumNumberBoxedNumber(validate(arg, configuration));
        }
        @Override
        public EnumNumberBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class EnumTestMap extends FrozenMap<@Nullable Object> {
        protected EnumTestMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "enum_string_required"
        );
        public static final Set<String> optionalKeys = Set.of(
            "enum_string",
            "enum_integer",
            "enum_number",
            "stringEnum",
            "IntegerEnum",
            "StringEnumWithDefaultValue",
            "IntegerEnumWithDefaultValue",
            "IntegerEnumOneValue"
        );
        public static EnumTestMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return EnumTest1.getInstance().validate(arg, configuration);
        }
        
        public String enum_string_required() {
                        @Nullable Object value = get("enum_string_required");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for enum_string_required");
            }
            return (String) value;
        }
        
        public String enum_string() throws UnsetPropertyException {
            String key = "enum_string";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for enum_string");
            }
            return (String) value;
        }
        
        public Number enum_integer() throws UnsetPropertyException {
            String key = "enum_integer";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for enum_integer");
            }
            return (Number) value;
        }
        
        public Number enum_number() throws UnsetPropertyException {
            String key = "enum_number";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for enum_number");
            }
            return (Number) value;
        }
        
        public @Nullable String stringEnum() throws UnsetPropertyException {
            String key = "stringEnum";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for stringEnum");
            }
            return (@Nullable String) value;
        }
        
        public Number IntegerEnum() throws UnsetPropertyException {
            String key = "IntegerEnum";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for IntegerEnum");
            }
            return (Number) value;
        }
        
        public String StringEnumWithDefaultValue() throws UnsetPropertyException {
            String key = "StringEnumWithDefaultValue";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for StringEnumWithDefaultValue");
            }
            return (String) value;
        }
        
        public Number IntegerEnumWithDefaultValue() throws UnsetPropertyException {
            String key = "IntegerEnumWithDefaultValue";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for IntegerEnumWithDefaultValue");
            }
            return (Number) value;
        }
        
        public Number IntegerEnumOneValue() throws UnsetPropertyException {
            String key = "IntegerEnumOneValue";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for IntegerEnumOneValue");
            }
            return (Number) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForEnumStringRequired <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterEnumStringRequired(Map<String, @Nullable Object> instance);
        
        default T enum_string_required(String value) {
            var instance = getInstance();
            instance.put("enum_string_required", value);
            return getBuilderAfterEnumStringRequired(instance);
        }
        
        default T enum_string_required(StringEnumStringRequiredEnums value) {
            var instance = getInstance();
            instance.put("enum_string_required", value.value());
            return getBuilderAfterEnumStringRequired(instance);
        }
    }
    
    public interface SetterForEnumString <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterEnumString(Map<String, @Nullable Object> instance);
        
        default T enum_string(String value) {
            var instance = getInstance();
            instance.put("enum_string", value);
            return getBuilderAfterEnumString(instance);
        }
        
        default T enum_string(StringEnumStringEnums value) {
            var instance = getInstance();
            instance.put("enum_string", value.value());
            return getBuilderAfterEnumString(instance);
        }
    }
    
    public interface SetterForEnumInteger <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterEnumInteger(Map<String, @Nullable Object> instance);
        
        default T enum_integer(int value) {
            var instance = getInstance();
            instance.put("enum_integer", value);
            return getBuilderAfterEnumInteger(instance);
        }
        
        default T enum_integer(float value) {
            var instance = getInstance();
            instance.put("enum_integer", value);
            return getBuilderAfterEnumInteger(instance);
        }
        
        default T enum_integer(IntegerEnumIntegerEnums value) {
            var instance = getInstance();
            instance.put("enum_integer", value.value());
            return getBuilderAfterEnumInteger(instance);
        }
        
        default T enum_integer(LongEnumIntegerEnums value) {
            var instance = getInstance();
            instance.put("enum_integer", value.value());
            return getBuilderAfterEnumInteger(instance);
        }
        
        default T enum_integer(FloatEnumIntegerEnums value) {
            var instance = getInstance();
            instance.put("enum_integer", value.value());
            return getBuilderAfterEnumInteger(instance);
        }
        
        default T enum_integer(DoubleEnumIntegerEnums value) {
            var instance = getInstance();
            instance.put("enum_integer", value.value());
            return getBuilderAfterEnumInteger(instance);
        }
    }
    
    public interface SetterForEnumNumber <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterEnumNumber(Map<String, @Nullable Object> instance);
        
        default T enum_number(int value) {
            var instance = getInstance();
            instance.put("enum_number", value);
            return getBuilderAfterEnumNumber(instance);
        }
        
        default T enum_number(float value) {
            var instance = getInstance();
            instance.put("enum_number", value);
            return getBuilderAfterEnumNumber(instance);
        }
        
        default T enum_number(long value) {
            var instance = getInstance();
            instance.put("enum_number", value);
            return getBuilderAfterEnumNumber(instance);
        }
        
        default T enum_number(double value) {
            var instance = getInstance();
            instance.put("enum_number", value);
            return getBuilderAfterEnumNumber(instance);
        }
        
        default T enum_number(DoubleEnumNumberEnums value) {
            var instance = getInstance();
            instance.put("enum_number", value.value());
            return getBuilderAfterEnumNumber(instance);
        }
        
        default T enum_number(FloatEnumNumberEnums value) {
            var instance = getInstance();
            instance.put("enum_number", value.value());
            return getBuilderAfterEnumNumber(instance);
        }
    }
    
    public interface SetterForStringEnum <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterStringEnum(Map<String, @Nullable Object> instance);
        
        default T stringEnum(Nothing? value) {
            var instance = getInstance();
            instance.put("stringEnum", null);
            return getBuilderAfterStringEnum(instance);
        }
        
        default T stringEnum(String value) {
            var instance = getInstance();
            instance.put("stringEnum", value);
            return getBuilderAfterStringEnum(instance);
        }
        
        default T stringEnum(StringEnum.StringStringEnumEnums value) {
            var instance = getInstance();
            instance.put("stringEnum", value.value());
            return getBuilderAfterStringEnum(instance);
        }
        
        default T stringEnum(StringEnum.NullStringEnumEnums value) {
            var instance = getInstance();
            instance.put("stringEnum", null);
            return getBuilderAfterStringEnum(instance);
        }
    }
    
    public interface SetterForIntegerEnum <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterIntegerEnum(Map<String, @Nullable Object> instance);
        
        default T IntegerEnum(int value) {
            var instance = getInstance();
            instance.put("IntegerEnum", value);
            return getBuilderAfterIntegerEnum(instance);
        }
        
        default T IntegerEnum(float value) {
            var instance = getInstance();
            instance.put("IntegerEnum", value);
            return getBuilderAfterIntegerEnum(instance);
        }
        
        default T IntegerEnum(long value) {
            var instance = getInstance();
            instance.put("IntegerEnum", value);
            return getBuilderAfterIntegerEnum(instance);
        }
        
        default T IntegerEnum(double value) {
            var instance = getInstance();
            instance.put("IntegerEnum", value);
            return getBuilderAfterIntegerEnum(instance);
        }
        
        default T IntegerEnum(IntegerEnum.IntegerIntegerEnumEnums value) {
            var instance = getInstance();
            instance.put("IntegerEnum", value.value());
            return getBuilderAfterIntegerEnum(instance);
        }
        
        default T IntegerEnum(IntegerEnum.LongIntegerEnumEnums value) {
            var instance = getInstance();
            instance.put("IntegerEnum", value.value());
            return getBuilderAfterIntegerEnum(instance);
        }
        
        default T IntegerEnum(IntegerEnum.FloatIntegerEnumEnums value) {
            var instance = getInstance();
            instance.put("IntegerEnum", value.value());
            return getBuilderAfterIntegerEnum(instance);
        }
        
        default T IntegerEnum(IntegerEnum.DoubleIntegerEnumEnums value) {
            var instance = getInstance();
            instance.put("IntegerEnum", value.value());
            return getBuilderAfterIntegerEnum(instance);
        }
    }
    
    public interface SetterForStringEnumWithDefaultValue <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterStringEnumWithDefaultValue(Map<String, @Nullable Object> instance);
        
        default T StringEnumWithDefaultValue(String value) {
            var instance = getInstance();
            instance.put("StringEnumWithDefaultValue", value);
            return getBuilderAfterStringEnumWithDefaultValue(instance);
        }
        
        default T StringEnumWithDefaultValue(StringEnumWithDefaultValue.StringStringEnumWithDefaultValueEnums value) {
            var instance = getInstance();
            instance.put("StringEnumWithDefaultValue", value.value());
            return getBuilderAfterStringEnumWithDefaultValue(instance);
        }
    }
    
    public interface SetterForIntegerEnumWithDefaultValue <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterIntegerEnumWithDefaultValue(Map<String, @Nullable Object> instance);
        
        default T IntegerEnumWithDefaultValue(int value) {
            var instance = getInstance();
            instance.put("IntegerEnumWithDefaultValue", value);
            return getBuilderAfterIntegerEnumWithDefaultValue(instance);
        }
        
        default T IntegerEnumWithDefaultValue(float value) {
            var instance = getInstance();
            instance.put("IntegerEnumWithDefaultValue", value);
            return getBuilderAfterIntegerEnumWithDefaultValue(instance);
        }
        
        default T IntegerEnumWithDefaultValue(long value) {
            var instance = getInstance();
            instance.put("IntegerEnumWithDefaultValue", value);
            return getBuilderAfterIntegerEnumWithDefaultValue(instance);
        }
        
        default T IntegerEnumWithDefaultValue(double value) {
            var instance = getInstance();
            instance.put("IntegerEnumWithDefaultValue", value);
            return getBuilderAfterIntegerEnumWithDefaultValue(instance);
        }
        
        default T IntegerEnumWithDefaultValue(IntegerEnumWithDefaultValue.IntegerIntegerEnumWithDefaultValueEnums value) {
            var instance = getInstance();
            instance.put("IntegerEnumWithDefaultValue", value.value());
            return getBuilderAfterIntegerEnumWithDefaultValue(instance);
        }
        
        default T IntegerEnumWithDefaultValue(IntegerEnumWithDefaultValue.LongIntegerEnumWithDefaultValueEnums value) {
            var instance = getInstance();
            instance.put("IntegerEnumWithDefaultValue", value.value());
            return getBuilderAfterIntegerEnumWithDefaultValue(instance);
        }
        
        default T IntegerEnumWithDefaultValue(IntegerEnumWithDefaultValue.FloatIntegerEnumWithDefaultValueEnums value) {
            var instance = getInstance();
            instance.put("IntegerEnumWithDefaultValue", value.value());
            return getBuilderAfterIntegerEnumWithDefaultValue(instance);
        }
        
        default T IntegerEnumWithDefaultValue(IntegerEnumWithDefaultValue.DoubleIntegerEnumWithDefaultValueEnums value) {
            var instance = getInstance();
            instance.put("IntegerEnumWithDefaultValue", value.value());
            return getBuilderAfterIntegerEnumWithDefaultValue(instance);
        }
    }
    
    public interface SetterForIntegerEnumOneValue <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterIntegerEnumOneValue(Map<String, @Nullable Object> instance);
        
        default T IntegerEnumOneValue(int value) {
            var instance = getInstance();
            instance.put("IntegerEnumOneValue", value);
            return getBuilderAfterIntegerEnumOneValue(instance);
        }
        
        default T IntegerEnumOneValue(float value) {
            var instance = getInstance();
            instance.put("IntegerEnumOneValue", value);
            return getBuilderAfterIntegerEnumOneValue(instance);
        }
        
        default T IntegerEnumOneValue(long value) {
            var instance = getInstance();
            instance.put("IntegerEnumOneValue", value);
            return getBuilderAfterIntegerEnumOneValue(instance);
        }
        
        default T IntegerEnumOneValue(double value) {
            var instance = getInstance();
            instance.put("IntegerEnumOneValue", value);
            return getBuilderAfterIntegerEnumOneValue(instance);
        }
        
        default T IntegerEnumOneValue(IntegerEnumOneValue.IntegerIntegerEnumOneValueEnums value) {
            var instance = getInstance();
            instance.put("IntegerEnumOneValue", value.value());
            return getBuilderAfterIntegerEnumOneValue(instance);
        }
        
        default T IntegerEnumOneValue(IntegerEnumOneValue.LongIntegerEnumOneValueEnums value) {
            var instance = getInstance();
            instance.put("IntegerEnumOneValue", value.value());
            return getBuilderAfterIntegerEnumOneValue(instance);
        }
        
        default T IntegerEnumOneValue(IntegerEnumOneValue.FloatIntegerEnumOneValueEnums value) {
            var instance = getInstance();
            instance.put("IntegerEnumOneValue", value.value());
            return getBuilderAfterIntegerEnumOneValue(instance);
        }
        
        default T IntegerEnumOneValue(IntegerEnumOneValue.DoubleIntegerEnumOneValueEnums value) {
            var instance = getInstance();
            instance.put("IntegerEnumOneValue", value.value());
            return getBuilderAfterIntegerEnumOneValue(instance);
        }
    }
    
    public static class EnumTestMap0Builder extends UnsetAddPropsSetter<EnumTestMap0Builder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForEnumString<EnumTestMap0Builder>, SetterForEnumInteger<EnumTestMap0Builder>, SetterForEnumNumber<EnumTestMap0Builder>, SetterForStringEnum<EnumTestMap0Builder>, SetterForIntegerEnum<EnumTestMap0Builder>, SetterForStringEnumWithDefaultValue<EnumTestMap0Builder>, SetterForIntegerEnumWithDefaultValue<EnumTestMap0Builder>, SetterForIntegerEnumOneValue<EnumTestMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "enum_string_required",
            "enum_string",
            "enum_integer",
            "enum_number",
            "stringEnum",
            "IntegerEnum",
            "StringEnumWithDefaultValue",
            "IntegerEnumWithDefaultValue",
            "IntegerEnumOneValue"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public EnumTestMap0Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public EnumTestMap0Builder getBuilderAfterEnumString(Map<String, @Nullable Object> instance) {
            return this;
        }
        public EnumTestMap0Builder getBuilderAfterEnumInteger(Map<String, @Nullable Object> instance) {
            return this;
        }
        public EnumTestMap0Builder getBuilderAfterEnumNumber(Map<String, @Nullable Object> instance) {
            return this;
        }
        public EnumTestMap0Builder getBuilderAfterStringEnum(Map<String, @Nullable Object> instance) {
            return this;
        }
        public EnumTestMap0Builder getBuilderAfterIntegerEnum(Map<String, @Nullable Object> instance) {
            return this;
        }
        public EnumTestMap0Builder getBuilderAfterStringEnumWithDefaultValue(Map<String, @Nullable Object> instance) {
            return this;
        }
        public EnumTestMap0Builder getBuilderAfterIntegerEnumWithDefaultValue(Map<String, @Nullable Object> instance) {
            return this;
        }
        public EnumTestMap0Builder getBuilderAfterIntegerEnumOneValue(Map<String, @Nullable Object> instance) {
            return this;
        }
        public EnumTestMap0Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class EnumTestMapBuilder implements SetterForEnumStringRequired<EnumTestMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        public EnumTestMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public EnumTestMap0Builder getBuilderAfterEnumStringRequired(Map<String, @Nullable Object> instance) {
            return new EnumTestMap0Builder(instance);
        }
    }
    
    
    public sealed interface EnumTest1Boxed permits EnumTest1BoxedMap {
        @Nullable Object getData();
    }
    
    public record EnumTest1BoxedMap(EnumTestMap data) implements EnumTest1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class EnumTest1 extends JsonSchema<EnumTest1Boxed> implements MapSchemaValidator<EnumTestMap, EnumTest1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable EnumTest1 instance = null;
    
        protected EnumTest1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("enum_string", EnumString.class),
                    new PropertyEntry("enum_string_required", EnumStringRequired.class),
                    new PropertyEntry("enum_integer", EnumInteger.class),
                    new PropertyEntry("enum_number", EnumNumber.class),
                    new PropertyEntry("stringEnum", StringEnum.StringEnum1.class),
                    new PropertyEntry("IntegerEnum", IntegerEnum.IntegerEnum1.class),
                    new PropertyEntry("StringEnumWithDefaultValue", StringEnumWithDefaultValue.StringEnumWithDefaultValue1.class),
                    new PropertyEntry("IntegerEnumWithDefaultValue", IntegerEnumWithDefaultValue.IntegerEnumWithDefaultValue1.class),
                    new PropertyEntry("IntegerEnumOneValue", IntegerEnumOneValue.IntegerEnumOneValue1.class)
                ))
                .required(Set.of(
                    "enum_string_required"
                ))
            );
        }
    
        public static EnumTest1 getInstance() {
            if (instance == null) {
                instance = new EnumTest1();
            }
            return instance;
        }
        
        public EnumTestMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
                LinkedHashMap<JsonSchema<?>, Nothing?> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new EnumTestMap(castProperties);
        }
        
        public EnumTestMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
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
        public EnumTest1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new EnumTest1BoxedMap(validate(arg, configuration));
        }
        @Override
        public EnumTest1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
