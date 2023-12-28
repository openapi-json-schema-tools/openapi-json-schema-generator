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
import org.openapijsonschematools.client.schemas.Int32JsonSchema;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.NullJsonSchema;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
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
    
    public static class Int32 extends Int32JsonSchema {
        private static @Nullable Int32 instance = null;
        public static Int32 getInstance() {
            if (instance == null) {
                instance = new Int32();
            }
            return instance;
        }
    }
    
    
    public static class Int32withValidations extends JsonSchema implements NumberSchemaValidator {
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
    
    public static class Float32 extends FloatJsonSchema {
        private static @Nullable Float32 instance = null;
        public static Float32 getInstance() {
            if (instance == null) {
                instance = new Float32();
            }
            return instance;
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
    
    public static class Float64 extends DoubleJsonSchema {
        private static @Nullable Float64 instance = null;
        public static Float64 getInstance() {
            if (instance == null) {
                instance = new Float64();
            }
            return instance;
        }
    }
    
    
    public static class Items extends NumberJsonSchema {
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
    
    
    public static class ArrayWithUniqueItems extends JsonSchema implements ListSchemaValidator<ArrayWithUniqueItemsList> {
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
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
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
        
        public ArrayWithUniqueItemsList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
    
    
    public static class DateTime extends DateTimeJsonSchema {
        private static @Nullable DateTime instance = null;
        public static DateTime getInstance() {
            if (instance == null) {
                instance = new DateTime();
            }
            return instance;
        }
    }
    
    
    public static class UuidSchema extends UuidJsonSchema {
        private static @Nullable UuidSchema instance = null;
        public static UuidSchema getInstance() {
            if (instance == null) {
                instance = new UuidSchema();
            }
            return instance;
        }
    }
    
    
    public static class UuidNoExample extends UuidJsonSchema {
        private static @Nullable UuidNoExample instance = null;
        public static UuidNoExample getInstance() {
            if (instance == null) {
                instance = new UuidNoExample();
            }
            return instance;
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
    
    public static class PatternWithDigits extends JsonSchema implements StringSchemaValidator {
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
    
    public static class PatternWithDigitsAndDelimiter extends JsonSchema implements StringSchemaValidator {
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
    
    public static class NoneProp extends NullJsonSchema {
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
        
        public int int32() throws UnsetPropertyException {
            String key = "int32";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Integer)) {
                throw new InvalidTypeException("Invalid value stored for int32");
            }
            return (int) value;
        }
        
        public int int32withValidations() throws UnsetPropertyException {
            String key = "int32withValidations";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Integer)) {
                throw new InvalidTypeException("Invalid value stored for int32withValidations");
            }
            return (int) value;
        }
        
        public long int64() throws UnsetPropertyException {
            String key = "int64";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Long)) {
                throw new InvalidTypeException("Invalid value stored for int64");
            }
            return (long) value;
        }
        
        public float float32() throws UnsetPropertyException {
            String key = "float32";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Float)) {
                throw new InvalidTypeException("Invalid value stored for float32");
            }
            return (float) value;
        }
        
        public double float64() throws UnsetPropertyException {
            String key = "float64";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Double)) {
                throw new InvalidTypeException("Invalid value stored for float64");
            }
            return (double) value;
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
    public static class FormatTestMapBuilder {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class FormatTest1 extends JsonSchema implements MapSchemaValidator<FormatTestMap> {
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
        
        public FormatTestMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
    }

}
