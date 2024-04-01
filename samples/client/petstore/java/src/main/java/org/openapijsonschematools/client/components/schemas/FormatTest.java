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
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.DateJsonSchema;
import org.openapijsonschematools.client.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.client.schemas.DoubleJsonSchema;
import org.openapijsonschematools.client.schemas.FloatJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.Int32JsonSchema;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.NullJsonSchema;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.UuidJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class FormatTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public sealed interface IntegerSchemaBoxed permits IntegerSchemaBoxedNumber {
        @Nullable Object getData();
    }
    
    public record IntegerSchemaBoxedNumber(Number data) implements IntegerSchemaBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class IntegerSchema extends JsonSchema<IntegerSchemaBoxed> implements NumberSchemaValidator<IntegerSchemaBoxedNumber> {
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
                .multipleOf(new BigDecimal("2"))
            );
        }
    
        public static IntegerSchema getInstance() {
            if (instance == null) {
                instance = new IntegerSchema();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (int) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (float) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (long) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public IntegerSchemaBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new IntegerSchemaBoxedNumber(validate(arg, configuration));
        }
        @Override
        public IntegerSchemaBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class Int32 extends Int32JsonSchema.Int32JsonSchema1 {
        private static @Nullable Int32 instance = null;
        public static Int32 getInstance() {
            if (instance == null) {
                instance = new Int32();
            }
            return instance;
        }
    }
    
    
    public sealed interface Int32withValidationsBoxed permits Int32withValidationsBoxedNumber {
        @Nullable Object getData();
    }
    
    public record Int32withValidationsBoxedNumber(Number data) implements Int32withValidationsBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Int32withValidations extends JsonSchema<Int32withValidationsBoxed> implements NumberSchemaValidator<Int32withValidationsBoxedNumber> {
        private static @Nullable Int32withValidations instance = null;
    
        protected Int32withValidations() {
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
    
        public static Int32withValidations getInstance() {
            if (instance == null) {
                instance = new Int32withValidations();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (int) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public Int32withValidationsBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Int32withValidationsBoxedNumber(validate(arg, configuration));
        }
        @Override
        public Int32withValidationsBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class Int64 extends Int64JsonSchema.Int64JsonSchema1 {
        private static @Nullable Int64 instance = null;
        public static Int64 getInstance() {
            if (instance == null) {
                instance = new Int64();
            }
            return instance;
        }
    }
    
    
    public sealed interface NumberSchemaBoxed permits NumberSchemaBoxedNumber {
        @Nullable Object getData();
    }
    
    public record NumberSchemaBoxedNumber(Number data) implements NumberSchemaBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class NumberSchema extends JsonSchema<NumberSchemaBoxed> implements NumberSchemaValidator<NumberSchemaBoxedNumber> {
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
                .multipleOf(new BigDecimal("32.5"))
            );
        }
    
        public static NumberSchema getInstance() {
            if (instance == null) {
                instance = new NumberSchema();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (int) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (long) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (float) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public NumberSchemaBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new NumberSchemaBoxedNumber(validate(arg, configuration));
        }
        @Override
        public NumberSchemaBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface FloatSchemaBoxed permits FloatSchemaBoxedNumber {
        @Nullable Object getData();
    }
    
    public record FloatSchemaBoxedNumber(Number data) implements FloatSchemaBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class FloatSchema extends JsonSchema<FloatSchemaBoxed> implements NumberSchemaValidator<FloatSchemaBoxedNumber> {
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
                .minimum(54.3)
            );
        }
    
        public static FloatSchema getInstance() {
            if (instance == null) {
                instance = new FloatSchema();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public FloatSchemaBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new FloatSchemaBoxedNumber(validate(arg, configuration));
        }
        @Override
        public FloatSchemaBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class Float32 extends FloatJsonSchema.FloatJsonSchema1 {
        private static @Nullable Float32 instance = null;
        public static Float32 getInstance() {
            if (instance == null) {
                instance = new Float32();
            }
            return instance;
        }
    }
    
    
    public sealed interface DoubleSchemaBoxed permits DoubleSchemaBoxedNumber {
        @Nullable Object getData();
    }
    
    public record DoubleSchemaBoxedNumber(Number data) implements DoubleSchemaBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class DoubleSchema extends JsonSchema<DoubleSchemaBoxed> implements NumberSchemaValidator<DoubleSchemaBoxedNumber> {
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
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public DoubleSchemaBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new DoubleSchemaBoxedNumber(validate(arg, configuration));
        }
        @Override
        public DoubleSchemaBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class Float64 extends DoubleJsonSchema.DoubleJsonSchema1 {
        private static @Nullable Float64 instance = null;
        public static Float64 getInstance() {
            if (instance == null) {
                instance = new Float64();
            }
            return instance;
        }
    }
    
    
    public static class Items extends NumberJsonSchema.NumberJsonSchema1 {
        private static @Nullable Items instance = null;
        public static Items getInstance() {
            if (instance == null) {
                instance = new Items();
            }
            return instance;
        }
    }
    
    
    public static class ArrayWithUniqueItemsList extends FrozenList<Number> {
        protected ArrayWithUniqueItemsList(FrozenList<Number> m) {
            super(m);
        }
        public static ArrayWithUniqueItemsList of(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayWithUniqueItems.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayWithUniqueItemsListBuilder {
        // class to build List<Number>
        private final List<Number> list;
    
        public ArrayWithUniqueItemsListBuilder() {
            list = new ArrayList<>();
        }
    
        public ArrayWithUniqueItemsListBuilder(List<Number> list) {
            this.list = list;
        }
        
        public ArrayWithUniqueItemsListBuilder add(int item) {
            list.add(item);
            return this;
        }
        
        public ArrayWithUniqueItemsListBuilder add(float item) {
            list.add(item);
            return this;
        }
        
        public ArrayWithUniqueItemsListBuilder add(long item) {
            list.add(item);
            return this;
        }
        
        public ArrayWithUniqueItemsListBuilder add(double item) {
            list.add(item);
            return this;
        }
    
        public List<Number> build() {
            return list;
        }
    }
    
    
    public sealed interface ArrayWithUniqueItemsBoxed permits ArrayWithUniqueItemsBoxedList {
        @Nullable Object getData();
    }
    
    public record ArrayWithUniqueItemsBoxedList(ArrayWithUniqueItemsList data) implements ArrayWithUniqueItemsBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class ArrayWithUniqueItems extends JsonSchema<ArrayWithUniqueItemsBoxed> implements ListSchemaValidator<ArrayWithUniqueItemsList, ArrayWithUniqueItemsBoxedList> {
        private static @Nullable ArrayWithUniqueItems instance = null;
    
        protected ArrayWithUniqueItems() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items.class)
                .uniqueItems(true)
            );
        }
    
        public static ArrayWithUniqueItems getInstance() {
            if (instance == null) {
                instance = new ArrayWithUniqueItems();
            }
            return instance;
        }
        
        @Override
        public ArrayWithUniqueItemsList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            List<Number> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof Number)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((Number) itemInstance);
                i += 1;
            }
            FrozenList<Number> newInstanceItems = new FrozenList<>(items);
            return new ArrayWithUniqueItemsList(newInstanceItems);
        }
        
        public ArrayWithUniqueItemsList validate(List<?> arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ArrayWithUniqueItemsBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ArrayWithUniqueItemsBoxedList(validate(arg, configuration));
        }
        @Override
        public ArrayWithUniqueItemsBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface StringSchemaBoxed permits StringSchemaBoxedString {
        @Nullable Object getData();
    }
    
    public record StringSchemaBoxedString(String data) implements StringSchemaBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class StringSchema extends JsonSchema<StringSchemaBoxed> implements StringSchemaValidator<StringSchemaBoxedString> {
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
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public StringSchemaBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new StringSchemaBoxedString(validate(arg, configuration));
        }
        @Override
        public StringSchemaBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class ByteSchema extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable ByteSchema instance = null;
        public static ByteSchema getInstance() {
            if (instance == null) {
                instance = new ByteSchema();
            }
            return instance;
        }
    }
    
    
    public static class Binary extends StringJsonSchema.StringJsonSchema1 {
        // BinarySchema
        private static @Nullable Binary instance = null;
        public static Binary getInstance() {
            if (instance == null) {
                instance = new Binary();
            }
            return instance;
        }
    }
    
    
    public static class Date extends DateJsonSchema.DateJsonSchema1 {
        private static @Nullable Date instance = null;
        public static Date getInstance() {
            if (instance == null) {
                instance = new Date();
            }
            return instance;
        }
    }
    
    
    public static class DateTime extends DateTimeJsonSchema.DateTimeJsonSchema1 {
        private static @Nullable DateTime instance = null;
        public static DateTime getInstance() {
            if (instance == null) {
                instance = new DateTime();
            }
            return instance;
        }
    }
    
    
    public static class UuidSchema extends UuidJsonSchema.UuidJsonSchema1 {
        private static @Nullable UuidSchema instance = null;
        public static UuidSchema getInstance() {
            if (instance == null) {
                instance = new UuidSchema();
            }
            return instance;
        }
    }
    
    
    public static class UuidNoExample extends UuidJsonSchema.UuidJsonSchema1 {
        private static @Nullable UuidNoExample instance = null;
        public static UuidNoExample getInstance() {
            if (instance == null) {
                instance = new UuidNoExample();
            }
            return instance;
        }
    }
    
    
    public sealed interface PasswordBoxed permits PasswordBoxedString {
        @Nullable Object getData();
    }
    
    public record PasswordBoxedString(String data) implements PasswordBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Password extends JsonSchema<PasswordBoxed> implements StringSchemaValidator<PasswordBoxedString> {
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
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public PasswordBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new PasswordBoxedString(validate(arg, configuration));
        }
        @Override
        public PasswordBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface PatternWithDigitsBoxed permits PatternWithDigitsBoxedString {
        @Nullable Object getData();
    }
    
    public record PatternWithDigitsBoxedString(String data) implements PatternWithDigitsBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class PatternWithDigits extends JsonSchema<PatternWithDigitsBoxed> implements StringSchemaValidator<PatternWithDigitsBoxedString> {
        private static @Nullable PatternWithDigits instance = null;
    
        protected PatternWithDigits() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .pattern(Pattern.compile(
                    "^\\d{10}$"
                ))
            );
        }
    
        public static PatternWithDigits getInstance() {
            if (instance == null) {
                instance = new PatternWithDigits();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public PatternWithDigitsBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new PatternWithDigitsBoxedString(validate(arg, configuration));
        }
        @Override
        public PatternWithDigitsBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface PatternWithDigitsAndDelimiterBoxed permits PatternWithDigitsAndDelimiterBoxedString {
        @Nullable Object getData();
    }
    
    public record PatternWithDigitsAndDelimiterBoxedString(String data) implements PatternWithDigitsAndDelimiterBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class PatternWithDigitsAndDelimiter extends JsonSchema<PatternWithDigitsAndDelimiterBoxed> implements StringSchemaValidator<PatternWithDigitsAndDelimiterBoxedString> {
        private static @Nullable PatternWithDigitsAndDelimiter instance = null;
    
        protected PatternWithDigitsAndDelimiter() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .pattern(Pattern.compile(
                    "^image_\\d{1,3}$",
                    Pattern.CASE_INSENSITIVE
                ))
            );
        }
    
        public static PatternWithDigitsAndDelimiter getInstance() {
            if (instance == null) {
                instance = new PatternWithDigitsAndDelimiter();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public PatternWithDigitsAndDelimiterBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new PatternWithDigitsAndDelimiterBoxedString(validate(arg, configuration));
        }
        @Override
        public PatternWithDigitsAndDelimiterBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class NoneProp extends NullJsonSchema.NullJsonSchema1 {
        private static @Nullable NoneProp instance = null;
        public static NoneProp getInstance() {
            if (instance == null) {
                instance = new NoneProp();
            }
            return instance;
        }
    }
    
    
    public static class FormatTestMap extends FrozenMap<@Nullable Object> {
        protected FormatTestMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "byte",
            "date",
            "number",
            "password"
        );
        public static final Set<String> optionalKeys = Set.of(
            "integer",
            "int32",
            "int32withValidations",
            "int64",
            "float",
            "float32",
            "double",
            "float64",
            "arrayWithUniqueItems",
            "string",
            "binary",
            "dateTime",
            "uuid",
            "uuidNoExample",
            "pattern_with_digits",
            "pattern_with_digits_and_delimiter",
            "noneProp"
        );
        public static FormatTestMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return FormatTest1.getInstance().validate(arg, configuration);
        }
        
        public String date() {
                        @Nullable Object value = get("date");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for date");
            }
            return (String) value;
        }
        
        public String password() {
                        @Nullable Object value = get("password");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for password");
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
        
        public Number int32withValidations() throws UnsetPropertyException {
            String key = "int32withValidations";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for int32withValidations");
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
        
        public Number float32() throws UnsetPropertyException {
            String key = "float32";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for float32");
            }
            return (Number) value;
        }
        
        public Number float64() throws UnsetPropertyException {
            String key = "float64";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for float64");
            }
            return (Number) value;
        }
        
        public ArrayWithUniqueItemsList arrayWithUniqueItems() throws UnsetPropertyException {
            String key = "arrayWithUniqueItems";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof ArrayWithUniqueItemsList)) {
                throw new InvalidTypeException("Invalid value stored for arrayWithUniqueItems");
            }
            return (ArrayWithUniqueItemsList) value;
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
        
        public String dateTime() throws UnsetPropertyException {
            String key = "dateTime";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for dateTime");
            }
            return (String) value;
        }
        
        public String uuidNoExample() throws UnsetPropertyException {
            String key = "uuidNoExample";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for uuidNoExample");
            }
            return (String) value;
        }
        
        public String pattern_with_digits() throws UnsetPropertyException {
            String key = "pattern_with_digits";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for pattern_with_digits");
            }
            return (String) value;
        }
        
        public String pattern_with_digits_and_delimiter() throws UnsetPropertyException {
            String key = "pattern_with_digits_and_delimiter";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for pattern_with_digits_and_delimiter");
            }
            return (String) value;
        }
        
        public Void noneProp() throws UnsetPropertyException {
            String key = "noneProp";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof Void)) {
                throw new InvalidTypeException("Invalid value stored for noneProp");
            }
            return (Void) value;
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
    
    public interface SetterForDate <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterDate(Map<String, @Nullable Object> instance);
        
        default T date(String value) {
            var instance = getInstance();
            instance.put("date", value);
            return getBuilderAfterDate(instance);
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
    
    public interface SetterForPassword <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterPassword(Map<String, @Nullable Object> instance);
        
        default T password(String value) {
            var instance = getInstance();
            instance.put("password", value);
            return getBuilderAfterPassword(instance);
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
    
    public interface SetterForInt32withValidations <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterInt32withValidations(Map<String, @Nullable Object> instance);
        
        default T int32withValidations(int value) {
            var instance = getInstance();
            instance.put("int32withValidations", value);
            return getBuilderAfterInt32withValidations(instance);
        }
        
        default T int32withValidations(float value) {
            var instance = getInstance();
            instance.put("int32withValidations", value);
            return getBuilderAfterInt32withValidations(instance);
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
    
    public interface SetterForFloat32 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFloat32(Map<String, @Nullable Object> instance);
        
        default T float32(int value) {
            var instance = getInstance();
            instance.put("float32", value);
            return getBuilderAfterFloat32(instance);
        }
        
        default T float32(float value) {
            var instance = getInstance();
            instance.put("float32", value);
            return getBuilderAfterFloat32(instance);
        }
        
        default T float32(long value) {
            var instance = getInstance();
            instance.put("float32", value);
            return getBuilderAfterFloat32(instance);
        }
        
        default T float32(double value) {
            var instance = getInstance();
            instance.put("float32", value);
            return getBuilderAfterFloat32(instance);
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
    
    public interface SetterForFloat64 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFloat64(Map<String, @Nullable Object> instance);
        
        default T float64(int value) {
            var instance = getInstance();
            instance.put("float64", value);
            return getBuilderAfterFloat64(instance);
        }
        
        default T float64(float value) {
            var instance = getInstance();
            instance.put("float64", value);
            return getBuilderAfterFloat64(instance);
        }
        
        default T float64(long value) {
            var instance = getInstance();
            instance.put("float64", value);
            return getBuilderAfterFloat64(instance);
        }
        
        default T float64(double value) {
            var instance = getInstance();
            instance.put("float64", value);
            return getBuilderAfterFloat64(instance);
        }
    }
    
    public interface SetterForArrayWithUniqueItems <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterArrayWithUniqueItems(Map<String, @Nullable Object> instance);
        
        default T arrayWithUniqueItems(List<Number> value) {
            var instance = getInstance();
            instance.put("arrayWithUniqueItems", value);
            return getBuilderAfterArrayWithUniqueItems(instance);
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
    
    public interface SetterForDateTime <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterDateTime(Map<String, @Nullable Object> instance);
        
        default T dateTime(String value) {
            var instance = getInstance();
            instance.put("dateTime", value);
            return getBuilderAfterDateTime(instance);
        }
    }
    
    public interface SetterForUuidSchema <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterUuidSchema(Map<String, @Nullable Object> instance);
        
        default T setUuid(String value) {
            var instance = getInstance();
            instance.put("uuid", value);
            return getBuilderAfterUuidSchema(instance);
        }
    }
    
    public interface SetterForUuidNoExample <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterUuidNoExample(Map<String, @Nullable Object> instance);
        
        default T uuidNoExample(String value) {
            var instance = getInstance();
            instance.put("uuidNoExample", value);
            return getBuilderAfterUuidNoExample(instance);
        }
    }
    
    public interface SetterForPatternWithDigits <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterPatternWithDigits(Map<String, @Nullable Object> instance);
        
        default T pattern_with_digits(String value) {
            var instance = getInstance();
            instance.put("pattern_with_digits", value);
            return getBuilderAfterPatternWithDigits(instance);
        }
    }
    
    public interface SetterForPatternWithDigitsAndDelimiter <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterPatternWithDigitsAndDelimiter(Map<String, @Nullable Object> instance);
        
        default T pattern_with_digits_and_delimiter(String value) {
            var instance = getInstance();
            instance.put("pattern_with_digits_and_delimiter", value);
            return getBuilderAfterPatternWithDigitsAndDelimiter(instance);
        }
    }
    
    public interface SetterForNoneProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterNoneProp(Map<String, @Nullable Object> instance);
        
        default T noneProp(Void value) {
            var instance = getInstance();
            instance.put("noneProp", null);
            return getBuilderAfterNoneProp(instance);
        }
    }
    
    public static class FormatTestMap0000Builder extends UnsetAddPropsSetter<FormatTestMap0000Builder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForIntegerSchema<FormatTestMap0000Builder>, SetterForInt32<FormatTestMap0000Builder>, SetterForInt32withValidations<FormatTestMap0000Builder>, SetterForInt64<FormatTestMap0000Builder>, SetterForFloatSchema<FormatTestMap0000Builder>, SetterForFloat32<FormatTestMap0000Builder>, SetterForDoubleSchema<FormatTestMap0000Builder>, SetterForFloat64<FormatTestMap0000Builder>, SetterForArrayWithUniqueItems<FormatTestMap0000Builder>, SetterForStringSchema<FormatTestMap0000Builder>, SetterForBinary<FormatTestMap0000Builder>, SetterForDateTime<FormatTestMap0000Builder>, SetterForUuidSchema<FormatTestMap0000Builder>, SetterForUuidNoExample<FormatTestMap0000Builder>, SetterForPatternWithDigits<FormatTestMap0000Builder>, SetterForPatternWithDigitsAndDelimiter<FormatTestMap0000Builder>, SetterForNoneProp<FormatTestMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "byte",
            "date",
            "number",
            "password",
            "integer",
            "int32",
            "int32withValidations",
            "int64",
            "float",
            "float32",
            "double",
            "float64",
            "arrayWithUniqueItems",
            "string",
            "binary",
            "dateTime",
            "uuid",
            "uuidNoExample",
            "pattern_with_digits",
            "pattern_with_digits_and_delimiter",
            "noneProp"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FormatTestMap0000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0000Builder getBuilderAfterIntegerSchema(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterInt32withValidations(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterInt64(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterFloatSchema(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterFloat32(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterDoubleSchema(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterFloat64(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterArrayWithUniqueItems(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterStringSchema(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterBinary(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterDateTime(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterUuidSchema(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterUuidNoExample(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterPatternWithDigits(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterPatternWithDigitsAndDelimiter(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterNoneProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class FormatTestMap0001Builder implements SetterForPassword<FormatTestMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap0001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0000Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0000Builder(instance);
        }
    }
    
    public static class FormatTestMap0010Builder implements SetterForNumberSchema<FormatTestMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap0010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0000Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0000Builder(instance);
        }
    }
    
    public static class FormatTestMap0011Builder implements SetterForNumberSchema<FormatTestMap0001Builder>, SetterForPassword<FormatTestMap0010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap0011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0001Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0001Builder(instance);
        }
        public FormatTestMap0010Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0010Builder(instance);
        }
    }
    
    public static class FormatTestMap0100Builder implements SetterForDate<FormatTestMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap0100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0000Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0000Builder(instance);
        }
    }
    
    public static class FormatTestMap0101Builder implements SetterForDate<FormatTestMap0001Builder>, SetterForPassword<FormatTestMap0100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap0101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0001Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0001Builder(instance);
        }
        public FormatTestMap0100Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0100Builder(instance);
        }
    }
    
    public static class FormatTestMap0110Builder implements SetterForDate<FormatTestMap0010Builder>, SetterForNumberSchema<FormatTestMap0100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap0110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0010Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0010Builder(instance);
        }
        public FormatTestMap0100Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0100Builder(instance);
        }
    }
    
    public static class FormatTestMap0111Builder implements SetterForDate<FormatTestMap0011Builder>, SetterForNumberSchema<FormatTestMap0101Builder>, SetterForPassword<FormatTestMap0110Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap0111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0011Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0011Builder(instance);
        }
        public FormatTestMap0101Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0101Builder(instance);
        }
        public FormatTestMap0110Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0110Builder(instance);
        }
    }
    
    public static class FormatTestMap1000Builder implements SetterForByteSchema<FormatTestMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0000Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0000Builder(instance);
        }
    }
    
    public static class FormatTestMap1001Builder implements SetterForByteSchema<FormatTestMap0001Builder>, SetterForPassword<FormatTestMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0001Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0001Builder(instance);
        }
        public FormatTestMap1000Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1000Builder(instance);
        }
    }
    
    public static class FormatTestMap1010Builder implements SetterForByteSchema<FormatTestMap0010Builder>, SetterForNumberSchema<FormatTestMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0010Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0010Builder(instance);
        }
        public FormatTestMap1000Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1000Builder(instance);
        }
    }
    
    public static class FormatTestMap1011Builder implements SetterForByteSchema<FormatTestMap0011Builder>, SetterForNumberSchema<FormatTestMap1001Builder>, SetterForPassword<FormatTestMap1010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0011Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0011Builder(instance);
        }
        public FormatTestMap1001Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1001Builder(instance);
        }
        public FormatTestMap1010Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1010Builder(instance);
        }
    }
    
    public static class FormatTestMap1100Builder implements SetterForByteSchema<FormatTestMap0100Builder>, SetterForDate<FormatTestMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0100Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0100Builder(instance);
        }
        public FormatTestMap1000Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1000Builder(instance);
        }
    }
    
    public static class FormatTestMap1101Builder implements SetterForByteSchema<FormatTestMap0101Builder>, SetterForDate<FormatTestMap1001Builder>, SetterForPassword<FormatTestMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0101Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0101Builder(instance);
        }
        public FormatTestMap1001Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1001Builder(instance);
        }
        public FormatTestMap1100Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1100Builder(instance);
        }
    }
    
    public static class FormatTestMap1110Builder implements SetterForByteSchema<FormatTestMap0110Builder>, SetterForDate<FormatTestMap1010Builder>, SetterForNumberSchema<FormatTestMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0110Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0110Builder(instance);
        }
        public FormatTestMap1010Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1010Builder(instance);
        }
        public FormatTestMap1100Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1100Builder(instance);
        }
    }
    
    public static class FormatTestMapBuilder implements SetterForByteSchema<FormatTestMap0111Builder>, SetterForDate<FormatTestMap1011Builder>, SetterForNumberSchema<FormatTestMap1101Builder>, SetterForPassword<FormatTestMap1110Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0111Builder getBuilderAfterByteSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0111Builder(instance);
        }
        public FormatTestMap1011Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1011Builder(instance);
        }
        public FormatTestMap1101Builder getBuilderAfterNumberSchema(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1101Builder(instance);
        }
        public FormatTestMap1110Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1110Builder(instance);
        }
    }
    
    
    public sealed interface FormatTest1Boxed permits FormatTest1BoxedMap {
        @Nullable Object getData();
    }
    
    public record FormatTest1BoxedMap(FormatTestMap data) implements FormatTest1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class FormatTest1 extends JsonSchema<FormatTest1Boxed> implements MapSchemaValidator<FormatTestMap, FormatTest1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable FormatTest1 instance = null;
    
        protected FormatTest1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("integer", IntegerSchema.class),
                    new PropertyEntry("int32", Int32.class),
                    new PropertyEntry("int32withValidations", Int32withValidations.class),
                    new PropertyEntry("int64", Int64.class),
                    new PropertyEntry("number", NumberSchema.class),
                    new PropertyEntry("float", FloatSchema.class),
                    new PropertyEntry("float32", Float32.class),
                    new PropertyEntry("double", DoubleSchema.class),
                    new PropertyEntry("float64", Float64.class),
                    new PropertyEntry("arrayWithUniqueItems", ArrayWithUniqueItems.class),
                    new PropertyEntry("string", StringSchema.class),
                    new PropertyEntry("byte", ByteSchema.class),
                    new PropertyEntry("binary", Binary.class),
                    new PropertyEntry("date", Date.class),
                    new PropertyEntry("dateTime", DateTime.class),
                    new PropertyEntry("uuid", UuidSchema.class),
                    new PropertyEntry("uuidNoExample", UuidNoExample.class),
                    new PropertyEntry("password", Password.class),
                    new PropertyEntry("pattern_with_digits", PatternWithDigits.class),
                    new PropertyEntry("pattern_with_digits_and_delimiter", PatternWithDigitsAndDelimiter.class),
                    new PropertyEntry("noneProp", NoneProp.class)
                ))
                .required(Set.of(
                    "byte",
                    "date",
                    "number",
                    "password"
                ))
            );
        }
    
        public static FormatTest1 getInstance() {
            if (instance == null) {
                instance = new FormatTest1();
            }
            return instance;
        }
        
        public FormatTestMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
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
            return new FormatTestMap(castProperties);
        }
        
        public FormatTestMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public FormatTest1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new FormatTest1BoxedMap(validate(arg, configuration));
        }
        @Override
        public FormatTest1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
