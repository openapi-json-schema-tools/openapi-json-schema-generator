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
    
    
    public sealed interface IntegerBoxed permits IntegerBoxedNumber {
        @Nullable Object getData();
    }
    
    public record IntegerBoxedNumber(Number data) implements IntegerBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Integer extends JsonSchema<IntegerBoxed> implements NumberSchemaValidator<IntegerBoxedNumber> {
        private static @Nullable Integer instance = null;
    
        protected Integer() {
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
    
        public static Integer getInstance() {
            if (instance == null) {
                instance = new Integer();
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
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return (long) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg, configuration);
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
        public IntegerBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new IntegerBoxedNumber(validate(arg, configuration));
        }
        @Override
        public IntegerBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
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
        public Int32withValidationsBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new Int32withValidationsBoxedNumber(validate(arg, configuration));
        }
        @Override
        public Int32withValidationsBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
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
    
    
    public sealed interface NumberBoxed permits NumberBoxedNumber {
        @Nullable Object getData();
    }
    
    public record NumberBoxedNumber(Number data) implements NumberBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Number extends JsonSchema<NumberBoxed> implements NumberSchemaValidator<NumberBoxedNumber> {
        private static @Nullable Number instance = null;
    
        protected Number() {
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
    
        public static Number getInstance() {
            if (instance == null) {
                instance = new Number();
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
        public NumberBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new NumberBoxedNumber(validate(arg, configuration));
        }
        @Override
        public NumberBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface FloatBoxed permits FloatBoxedNumber {
        @Nullable Object getData();
    }
    
    public record FloatBoxedNumber(Number data) implements FloatBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Float extends JsonSchema<FloatBoxed> implements NumberSchemaValidator<FloatBoxedNumber> {
        private static @Nullable Float instance = null;
    
        protected Float() {
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
    
        public static Float getInstance() {
            if (instance == null) {
                instance = new Float();
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
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg, configuration);
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
        public FloatBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new FloatBoxedNumber(validate(arg, configuration));
        }
        @Override
        public FloatBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
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
    
    
    public sealed interface DoubleBoxed permits DoubleBoxedNumber {
        @Nullable Object getData();
    }
    
    public record DoubleBoxedNumber(Number data) implements DoubleBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Double extends JsonSchema<DoubleBoxed> implements NumberSchemaValidator<DoubleBoxedNumber> {
        private static @Nullable Double instance = null;
    
        protected Double() {
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
    
        public static Double getInstance() {
            if (instance == null) {
                instance = new Double();
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
        public DoubleBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new DoubleBoxedNumber(validate(arg, configuration));
        }
        @Override
        public DoubleBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
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
        public ArrayWithUniqueItemsList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<Number> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof Number)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                items.add((Number) itemInstance);
                i += 1;
            }
            FrozenList<Number> newInstanceItems = new FrozenList<>(items);
            return new ArrayWithUniqueItemsList(newInstanceItems);
        }
        
        public ArrayWithUniqueItemsList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ArrayWithUniqueItemsBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ArrayWithUniqueItemsBoxedList(validate(arg, configuration));
        }
        @Override
        public ArrayWithUniqueItemsBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface StringBoxed permits StringBoxedString {
        @Nullable Object getData();
    }
    
    public record StringBoxedString(String data) implements StringBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class String extends JsonSchema<StringBoxed> implements StringSchemaValidator<StringBoxedString> {
        private static @Nullable String instance = null;
    
        protected String() {
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
    
        public static String getInstance() {
            if (instance == null) {
                instance = new String();
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
        public StringBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new StringBoxedString(validate(arg, configuration));
        }
        @Override
        public StringBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class Byte extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Byte instance = null;
        public static Byte getInstance() {
            if (instance == null) {
                instance = new Byte();
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
    
    
    public static class Uuid extends UuidJsonSchema.UuidJsonSchema1 {
        private static @Nullable Uuid instance = null;
        public static Uuid getInstance() {
            if (instance == null) {
                instance = new Uuid();
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
        public PasswordBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new PasswordBoxedString(validate(arg, configuration));
        }
        @Override
        public PasswordBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
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
        public PatternWithDigitsBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new PatternWithDigitsBoxedString(validate(arg, configuration));
        }
        @Override
        public PatternWithDigitsBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
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
        public PatternWithDigitsAndDelimiterBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new PatternWithDigitsAndDelimiterBoxedString(validate(arg, configuration));
        }
        @Override
        public PatternWithDigitsAndDelimiterBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
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
        public static FormatTestMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return FormatTest1.getInstance().validate(arg, configuration);
        }
        
        public String byte() {
                        @Nullable Object value = get("byte");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for byte");
            }
            return (String) value;
        }
        
        public String date() {
                        @Nullable Object value = get("date");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for date");
            }
            return (String) value;
        }
        
        public Number number() {
                        @Nullable Object value = get("number");
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for number");
            }
            return (Number) value;
        }
        
        public String password() {
                        @Nullable Object value = get("password");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for password");
            }
            return (String) value;
        }
        
        public Number integer() throws UnsetPropertyException {
            String key = "integer";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for integer");
            }
            return (Number) value;
        }
        
        public Number int32() throws UnsetPropertyException {
            String key = "int32";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for int32");
            }
            return (Number) value;
        }
        
        public Number int32withValidations() throws UnsetPropertyException {
            String key = "int32withValidations";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for int32withValidations");
            }
            return (Number) value;
        }
        
        public Number int64() throws UnsetPropertyException {
            String key = "int64";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for int64");
            }
            return (Number) value;
        }
        
        public Number float() throws UnsetPropertyException {
            String key = "float";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for float");
            }
            return (Number) value;
        }
        
        public Number float32() throws UnsetPropertyException {
            String key = "float32";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for float32");
            }
            return (Number) value;
        }
        
        public Number double() throws UnsetPropertyException {
            String key = "double";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for double");
            }
            return (Number) value;
        }
        
        public Number float64() throws UnsetPropertyException {
            String key = "float64";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for float64");
            }
            return (Number) value;
        }
        
        public ArrayWithUniqueItemsList arrayWithUniqueItems() throws UnsetPropertyException {
            String key = "arrayWithUniqueItems";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof ArrayWithUniqueItemsList)) {
                throw new RuntimeException("Invalid value stored for arrayWithUniqueItems");
            }
            return (ArrayWithUniqueItemsList) value;
        }
        
        public String string() throws UnsetPropertyException {
            String key = "string";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for string");
            }
            return (String) value;
        }
        
        public String binary() throws UnsetPropertyException {
            String key = "binary";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for binary");
            }
            return (String) value;
        }
        
        public String dateTime() throws UnsetPropertyException {
            String key = "dateTime";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for dateTime");
            }
            return (String) value;
        }
        
        public String uuid() throws UnsetPropertyException {
            String key = "uuid";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for uuid");
            }
            return (String) value;
        }
        
        public String uuidNoExample() throws UnsetPropertyException {
            String key = "uuidNoExample";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for uuidNoExample");
            }
            return (String) value;
        }
        
        public String pattern_with_digits() throws UnsetPropertyException {
            String key = "pattern_with_digits";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for pattern_with_digits");
            }
            return (String) value;
        }
        
        public String pattern_with_digits_and_delimiter() throws UnsetPropertyException {
            String key = "pattern_with_digits_and_delimiter";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for pattern_with_digits_and_delimiter");
            }
            return (String) value;
        }
        
        public Void noneProp() throws UnsetPropertyException {
            String key = "noneProp";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof Void)) {
                throw new RuntimeException("Invalid value stored for noneProp");
            }
            return (Void) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForByte <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterByte(Map<String, @Nullable Object> instance);
        
        default T byte(String value) {
            var instance = getInstance();
            instance.put("byte", value);
            return getBuilderAfterByte(instance);
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
    
    public interface SetterForNumber <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterNumber(Map<String, @Nullable Object> instance);
        
        default T number(int value) {
            var instance = getInstance();
            instance.put("number", value);
            return getBuilderAfterNumber(instance);
        }
        
        default T number(float value) {
            var instance = getInstance();
            instance.put("number", value);
            return getBuilderAfterNumber(instance);
        }
        
        default T number(long value) {
            var instance = getInstance();
            instance.put("number", value);
            return getBuilderAfterNumber(instance);
        }
        
        default T number(double value) {
            var instance = getInstance();
            instance.put("number", value);
            return getBuilderAfterNumber(instance);
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
    
    public interface SetterForInteger <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterInteger(Map<String, @Nullable Object> instance);
        
        default T integer(int value) {
            var instance = getInstance();
            instance.put("integer", value);
            return getBuilderAfterInteger(instance);
        }
        
        default T integer(float value) {
            var instance = getInstance();
            instance.put("integer", value);
            return getBuilderAfterInteger(instance);
        }
        
        default T integer(long value) {
            var instance = getInstance();
            instance.put("integer", value);
            return getBuilderAfterInteger(instance);
        }
        
        default T integer(double value) {
            var instance = getInstance();
            instance.put("integer", value);
            return getBuilderAfterInteger(instance);
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
    
    public interface SetterForFloat <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFloat(Map<String, @Nullable Object> instance);
        
        default T float(int value) {
            var instance = getInstance();
            instance.put("float", value);
            return getBuilderAfterFloat(instance);
        }
        
        default T float(float value) {
            var instance = getInstance();
            instance.put("float", value);
            return getBuilderAfterFloat(instance);
        }
        
        default T float(long value) {
            var instance = getInstance();
            instance.put("float", value);
            return getBuilderAfterFloat(instance);
        }
        
        default T float(double value) {
            var instance = getInstance();
            instance.put("float", value);
            return getBuilderAfterFloat(instance);
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
    
    public interface SetterForDouble <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterDouble(Map<String, @Nullable Object> instance);
        
        default T double(int value) {
            var instance = getInstance();
            instance.put("double", value);
            return getBuilderAfterDouble(instance);
        }
        
        default T double(float value) {
            var instance = getInstance();
            instance.put("double", value);
            return getBuilderAfterDouble(instance);
        }
        
        default T double(long value) {
            var instance = getInstance();
            instance.put("double", value);
            return getBuilderAfterDouble(instance);
        }
        
        default T double(double value) {
            var instance = getInstance();
            instance.put("double", value);
            return getBuilderAfterDouble(instance);
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
    
    public interface SetterForString <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterString(Map<String, @Nullable Object> instance);
        
        default T string(String value) {
            var instance = getInstance();
            instance.put("string", value);
            return getBuilderAfterString(instance);
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
    
    public interface SetterForUuid <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterUuid(Map<String, @Nullable Object> instance);
        
        default T uuid(String value) {
            var instance = getInstance();
            instance.put("uuid", value);
            return getBuilderAfterUuid(instance);
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
    
    public static class FormatTestMap0000Builder extends UnsetAddPropsSetter<FormatTestMap0000Builder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForInteger<FormatTestMap0000Builder>, SetterForInt32<FormatTestMap0000Builder>, SetterForInt32withValidations<FormatTestMap0000Builder>, SetterForInt64<FormatTestMap0000Builder>, SetterForFloat<FormatTestMap0000Builder>, SetterForFloat32<FormatTestMap0000Builder>, SetterForDouble<FormatTestMap0000Builder>, SetterForFloat64<FormatTestMap0000Builder>, SetterForArrayWithUniqueItems<FormatTestMap0000Builder>, SetterForString<FormatTestMap0000Builder>, SetterForBinary<FormatTestMap0000Builder>, SetterForDateTime<FormatTestMap0000Builder>, SetterForUuid<FormatTestMap0000Builder>, SetterForUuidNoExample<FormatTestMap0000Builder>, SetterForPatternWithDigits<FormatTestMap0000Builder>, SetterForPatternWithDigitsAndDelimiter<FormatTestMap0000Builder>, SetterForNoneProp<FormatTestMap0000Builder> {
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
        public FormatTestMap0000Builder getBuilderAfterInteger(Map<String, @Nullable Object> instance) {
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
        public FormatTestMap0000Builder getBuilderAfterFloat(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterFloat32(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterDouble(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterFloat64(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterArrayWithUniqueItems(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterString(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterBinary(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterDateTime(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FormatTestMap0000Builder getBuilderAfterUuid(Map<String, @Nullable Object> instance) {
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
    
    public static class FormatTestMap0010Builder implements SetterForNumber<FormatTestMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap0010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0000Builder getBuilderAfterNumber(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0000Builder(instance);
        }
    }
    
    public static class FormatTestMap0011Builder implements SetterForNumber<FormatTestMap0001Builder>, SetterForPassword<FormatTestMap0010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap0011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0001Builder getBuilderAfterNumber(Map<String, @Nullable Object> instance) {
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
    
    public static class FormatTestMap0110Builder implements SetterForDate<FormatTestMap0010Builder>, SetterForNumber<FormatTestMap0100Builder> {
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
        public FormatTestMap0100Builder getBuilderAfterNumber(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0100Builder(instance);
        }
    }
    
    public static class FormatTestMap0111Builder implements SetterForDate<FormatTestMap0011Builder>, SetterForNumber<FormatTestMap0101Builder>, SetterForPassword<FormatTestMap0110Builder> {
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
        public FormatTestMap0101Builder getBuilderAfterNumber(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0101Builder(instance);
        }
        public FormatTestMap0110Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0110Builder(instance);
        }
    }
    
    public static class FormatTestMap1000Builder implements SetterForByte<FormatTestMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0000Builder getBuilderAfterByte(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0000Builder(instance);
        }
    }
    
    public static class FormatTestMap1001Builder implements SetterForByte<FormatTestMap0001Builder>, SetterForPassword<FormatTestMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0001Builder getBuilderAfterByte(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0001Builder(instance);
        }
        public FormatTestMap1000Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1000Builder(instance);
        }
    }
    
    public static class FormatTestMap1010Builder implements SetterForByte<FormatTestMap0010Builder>, SetterForNumber<FormatTestMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0010Builder getBuilderAfterByte(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0010Builder(instance);
        }
        public FormatTestMap1000Builder getBuilderAfterNumber(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1000Builder(instance);
        }
    }
    
    public static class FormatTestMap1011Builder implements SetterForByte<FormatTestMap0011Builder>, SetterForNumber<FormatTestMap1001Builder>, SetterForPassword<FormatTestMap1010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0011Builder getBuilderAfterByte(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0011Builder(instance);
        }
        public FormatTestMap1001Builder getBuilderAfterNumber(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1001Builder(instance);
        }
        public FormatTestMap1010Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1010Builder(instance);
        }
    }
    
    public static class FormatTestMap1100Builder implements SetterForByte<FormatTestMap0100Builder>, SetterForDate<FormatTestMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0100Builder getBuilderAfterByte(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0100Builder(instance);
        }
        public FormatTestMap1000Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1000Builder(instance);
        }
    }
    
    public static class FormatTestMap1101Builder implements SetterForByte<FormatTestMap0101Builder>, SetterForDate<FormatTestMap1001Builder>, SetterForPassword<FormatTestMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0101Builder getBuilderAfterByte(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0101Builder(instance);
        }
        public FormatTestMap1001Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1001Builder(instance);
        }
        public FormatTestMap1100Builder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1100Builder(instance);
        }
    }
    
    public static class FormatTestMap1110Builder implements SetterForByte<FormatTestMap0110Builder>, SetterForDate<FormatTestMap1010Builder>, SetterForNumber<FormatTestMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMap1110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0110Builder getBuilderAfterByte(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0110Builder(instance);
        }
        public FormatTestMap1010Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1010Builder(instance);
        }
        public FormatTestMap1100Builder getBuilderAfterNumber(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1100Builder(instance);
        }
    }
    
    public static class FormatTestMapBuilder implements SetterForByte<FormatTestMap0111Builder>, SetterForDate<FormatTestMap1011Builder>, SetterForNumber<FormatTestMap1101Builder>, SetterForPassword<FormatTestMap1110Builder> {
        private final Map<String, @Nullable Object> instance;
        public FormatTestMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FormatTestMap0111Builder getBuilderAfterByte(Map<String, @Nullable Object> instance) {
            return new FormatTestMap0111Builder(instance);
        }
        public FormatTestMap1011Builder getBuilderAfterDate(Map<String, @Nullable Object> instance) {
            return new FormatTestMap1011Builder(instance);
        }
        public FormatTestMap1101Builder getBuilderAfterNumber(Map<String, @Nullable Object> instance) {
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
                    new PropertyEntry("integer", Integer.class),
                    new PropertyEntry("int32", Int32.class),
                    new PropertyEntry("int32withValidations", Int32withValidations.class),
                    new PropertyEntry("int64", Int64.class),
                    new PropertyEntry("number", Number.class),
                    new PropertyEntry("float", Float.class),
                    new PropertyEntry("float32", Float32.class),
                    new PropertyEntry("double", Double.class),
                    new PropertyEntry("float64", Float64.class),
                    new PropertyEntry("arrayWithUniqueItems", ArrayWithUniqueItems.class),
                    new PropertyEntry("string", String.class),
                    new PropertyEntry("byte", Byte.class),
                    new PropertyEntry("binary", Binary.class),
                    new PropertyEntry("date", Date.class),
                    new PropertyEntry("dateTime", DateTime.class),
                    new PropertyEntry("uuid", Uuid.class),
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
        
        public FormatTestMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new FormatTestMap(castProperties);
        }
        
        public FormatTestMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public FormatTest1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FormatTest1BoxedMap(validate(arg, configuration));
        }
        @Override
        public FormatTest1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
