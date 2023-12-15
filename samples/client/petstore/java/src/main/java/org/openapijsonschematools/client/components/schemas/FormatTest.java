package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
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
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.MaxLengthValidator;
import org.openapijsonschematools.client.schemas.validation.MaximumValidator;
import org.openapijsonschematools.client.schemas.validation.MinLengthValidator;
import org.openapijsonschematools.client.schemas.validation.MinimumValidator;
import org.openapijsonschematools.client.schemas.validation.MultipleOfValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PatternValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.SchemaListValidator;
import org.openapijsonschematools.client.schemas.validation.SchemaMapValidator;
import org.openapijsonschematools.client.schemas.validation.SchemaNumberValidator;
import org.openapijsonschematools.client.schemas.validation.SchemaStringValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.UniqueItemsValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class FormatTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class IntegerSchema extends JsonSchema implements SchemaNumberValidator {
        private static IntegerSchema instance;
        protected IntegerSchema() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))),
                new KeywordEntry("maximum", new MaximumValidator(100)),
                new KeywordEntry("minimum", new MinimumValidator(10)),
                new KeywordEntry("multipleOf", new MultipleOfValidator(2))
            )));
        }
    
        public static IntegerSchema getInstance() {
            if (instance == null) {
                instance = new IntegerSchema();
            }
            return instance;
        }
        
        @Override
        public Number castToAllowedTypes(Number arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedNumberTypes(arg, pathToItem, pathSet);
        }
        
        @Override
        public Number getNewInstance(Number arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
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
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class Int32 extends Int32JsonSchema {}
    
    
    public static class Int32withValidations extends JsonSchema implements SchemaNumberValidator {
        private static Int32withValidations instance;
        protected Int32withValidations() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))),
                new KeywordEntry("format", new FormatValidator("int32")),
                new KeywordEntry("maximum", new MaximumValidator(200)),
                new KeywordEntry("minimum", new MinimumValidator(20))
            )));
        }
    
        public static Int32withValidations getInstance() {
            if (instance == null) {
                instance = new Int32withValidations();
            }
            return instance;
        }
        
        @Override
        public Number castToAllowedTypes(Number arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedNumberTypes(arg, pathToItem, pathSet);
        }
        
        @Override
        public Number getNewInstance(Number arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return (int) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg, configuration);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class Int64 extends Int64JsonSchema {}
    
    
    public static class NumberSchema extends JsonSchema implements SchemaNumberValidator {
        private static NumberSchema instance;
        protected NumberSchema() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))),
                new KeywordEntry("maximum", new MaximumValidator(543.2)),
                new KeywordEntry("minimum", new MinimumValidator(32.1)),
                new KeywordEntry("multipleOf", new MultipleOfValidator(32.5))
            )));
        }
    
        public static NumberSchema getInstance() {
            if (instance == null) {
                instance = new NumberSchema();
            }
            return instance;
        }
        
        @Override
        public Number castToAllowedTypes(Number arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedNumberTypes(arg, pathToItem, pathSet);
        }
        
        @Override
        public Number getNewInstance(Number arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
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
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class FloatSchema extends JsonSchema implements SchemaNumberValidator {
        private static FloatSchema instance;
        protected FloatSchema() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))),
                new KeywordEntry("format", new FormatValidator("float")),
                new KeywordEntry("maximum", new MaximumValidator(987.6)),
                new KeywordEntry("minimum", new MinimumValidator(54.3))
            )));
        }
    
        public static FloatSchema getInstance() {
            if (instance == null) {
                instance = new FloatSchema();
            }
            return instance;
        }
        
        @Override
        public Number castToAllowedTypes(Number arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedNumberTypes(arg, pathToItem, pathSet);
        }
        
        @Override
        public Number getNewInstance(Number arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return (float) validate((Number) arg, configuration);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class Float32 extends FloatJsonSchema {}
    
    
    public static class DoubleSchema extends JsonSchema implements SchemaNumberValidator {
        private static DoubleSchema instance;
        protected DoubleSchema() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))),
                new KeywordEntry("format", new FormatValidator("double")),
                new KeywordEntry("maximum", new MaximumValidator(123.4)),
                new KeywordEntry("minimum", new MinimumValidator(67.8))
            )));
        }
    
        public static DoubleSchema getInstance() {
            if (instance == null) {
                instance = new DoubleSchema();
            }
            return instance;
        }
        
        @Override
        public Number castToAllowedTypes(Number arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedNumberTypes(arg, pathToItem, pathSet);
        }
        
        @Override
        public Number getNewInstance(Number arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class Float64 extends DoubleJsonSchema {}
    
    
    public static class Items extends NumberJsonSchema {}
    
    
    public static class ArrayWithUniqueItemsList extends FrozenList<Number> {
        ArrayWithUniqueItemsList(FrozenList<Number> m) {
            super(m);
        }
        public static ArrayWithUniqueItemsList of(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayWithUniqueItems.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayWithUniqueItemsListInput {
        // class to build List<Number>
    }
    
    
    public static class ArrayWithUniqueItems extends JsonSchema implements SchemaListValidator<Number, Number, ArrayWithUniqueItemsList> {
        private static ArrayWithUniqueItems instance;
        protected ArrayWithUniqueItems() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items.class)),
                new KeywordEntry("uniqueItems", new UniqueItemsValidator(true))
            )));
        }
    
        public static ArrayWithUniqueItems getInstance() {
            if (instance == null) {
                instance = new ArrayWithUniqueItems();
            }
            return instance;
        }
        
        @Override
        public FrozenList<Number> castToAllowedTypes(List<Number> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<Number> argFixed = new ArrayList<>();
            int i =0;
            for (Number item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                Number fixedVal = (Number) castToAllowedObjectTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
        
        @Override
        public ArrayWithUniqueItemsList getNewInstance(FrozenList<Number> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<Number> items = new ArrayList<>();
            int i = 0;
            for (Number item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                                Number castItem = (Number) itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<Number> newInstanceItems = new FrozenList<>(items);
            return new ArrayWithUniqueItemsList(newInstanceItems);
        }
        
        @Override
        public ArrayWithUniqueItemsList validate(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<Number> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenList) {
                @SuppressWarnings("unchecked") FrozenList<Number> castArg = (FrozenList<Number>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class StringSchema extends JsonSchema implements SchemaStringValidator {
        private static StringSchema instance;
    
        protected StringSchema() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("pattern", new PatternValidator(Pattern.compile(
                    "[a-z]",
                    Pattern.CASE_INSENSITIVE
                )))
            )));
        }
    
        public static StringSchema getInstance() {
            if (instance == null) {
                instance = new StringSchema();
            }
            return instance;
        }
        
        @Override
        public String castToAllowedTypes(String arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedStringTypes(arg, pathToItem, pathSet);
        }
        
        @Override
        public String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class ByteSchema extends StringJsonSchema {}
    
    
    public static class Binary extends StringJsonSchema {
        // BinarySchema
    }
    
    
    public static class Date extends DateJsonSchema {}
    
    
    public static class DateTime extends DateTimeJsonSchema {}
    
    
    public static class UuidSchema extends UuidJsonSchema {}
    
    
    public static class UuidNoExample extends UuidJsonSchema {}
    
    
    public static class Password extends JsonSchema implements SchemaStringValidator {
        private static Password instance;
    
        protected Password() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("format", new FormatValidator("password")),
                new KeywordEntry("maxLength", new MaxLengthValidator(64)),
                new KeywordEntry("minLength", new MinLengthValidator(10))
            )));
        }
    
        public static Password getInstance() {
            if (instance == null) {
                instance = new Password();
            }
            return instance;
        }
        
        @Override
        public String castToAllowedTypes(String arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedStringTypes(arg, pathToItem, pathSet);
        }
        
        @Override
        public String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class PatternWithDigits extends JsonSchema implements SchemaStringValidator {
        private static PatternWithDigits instance;
    
        protected PatternWithDigits() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("pattern", new PatternValidator(Pattern.compile(
                    "^\\d{10}$"
                )))
            )));
        }
    
        public static PatternWithDigits getInstance() {
            if (instance == null) {
                instance = new PatternWithDigits();
            }
            return instance;
        }
        
        @Override
        public String castToAllowedTypes(String arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedStringTypes(arg, pathToItem, pathSet);
        }
        
        @Override
        public String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class PatternWithDigitsAndDelimiter extends JsonSchema implements SchemaStringValidator {
        private static PatternWithDigitsAndDelimiter instance;
    
        protected PatternWithDigitsAndDelimiter() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("pattern", new PatternValidator(Pattern.compile(
                    "^image_\\d{1,3}$",
                    Pattern.CASE_INSENSITIVE
                )))
            )));
        }
    
        public static PatternWithDigitsAndDelimiter getInstance() {
            if (instance == null) {
                instance = new PatternWithDigitsAndDelimiter();
            }
            return instance;
        }
        
        @Override
        public String castToAllowedTypes(String arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedStringTypes(arg, pathToItem, pathSet);
        }
        
        @Override
        public String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class NoneProp extends NullJsonSchema {}
    
    
    public static class FormatTestMap extends FrozenMap<Object> {
        FormatTestMap(FrozenMap<Object> m) {
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
        public static FormatTestMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return FormatTest1.getInstance().validate(arg, configuration);
        }
        
        public String date() {
            return (String) get("date");
        }
        
        public String password() {
            return (String) get("password");
        }
        
        public int int32() {
            String key = "int32";
            throwIfKeyNotPresent(key);
            return (int) get(key);
        }
        
        public int int32withValidations() {
            String key = "int32withValidations";
            throwIfKeyNotPresent(key);
            return (int) get(key);
        }
        
        public long int64() {
            String key = "int64";
            throwIfKeyNotPresent(key);
            return (long) get(key);
        }
        
        public float float32() {
            String key = "float32";
            throwIfKeyNotPresent(key);
            return (float) get(key);
        }
        
        public double float64() {
            String key = "float64";
            throwIfKeyNotPresent(key);
            return (double) get(key);
        }
        
        public ArrayWithUniqueItemsList arrayWithUniqueItems() {
            String key = "arrayWithUniqueItems";
            throwIfKeyNotPresent(key);
            return (ArrayWithUniqueItemsList) get(key);
        }
        
        public String binary() {
            String key = "binary";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String dateTime() {
            String key = "dateTime";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String uuidNoExample() {
            String key = "uuidNoExample";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String pattern_with_digits() {
            String key = "pattern_with_digits";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String pattern_with_digits_and_delimiter() {
            String key = "pattern_with_digits_and_delimiter";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public Void noneProp() {
            String key = "noneProp";
            throwIfKeyNotPresent(key);
            return (Void) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class FormatTestMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class FormatTest1 extends JsonSchema implements SchemaMapValidator<Object, Object, FormatTestMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static FormatTest1 instance;
        protected FormatTest1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
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
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "byte",
                    "date",
                    "number",
                    "password"
                )))
            )));
        }
    
        public static FormatTest1 getInstance() {
            if (instance == null) {
                instance = new FormatTest1();
            }
            return instance;
        }
        
        @Override
        public FrozenMap<Object> castToAllowedTypes(Map<String, Object> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            LinkedHashMap<String, Object> argFixed = new LinkedHashMap<>();
            for (Map.Entry<String, Object> entry: arg.entrySet()) {
                String key = entry.getKey();
                                Object val = entry.getValue();
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(key);
                                Object fixedVal = (Object) castToAllowedObjectTypes(val, newPathToItem, pathSet);
                argFixed.put(key, fixedVal);
            }
            return new FrozenMap<>(argFixed);
        }
        
        public FormatTestMap getNewInstance(FrozenMap<Object> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
            for(Map.Entry<String, Object> entry: arg.entrySet()) {
                String propertyName = entry.getKey();
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
                Object castValue = (Object) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<Object> castProperties = new FrozenMap<>(properties);
            return new FormatTestMap(castProperties);
        }
        
        @Override
        public FormatTestMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenMap<Object> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenMap) {
                @SuppressWarnings("unchecked") FrozenMap<Object> castArg = (FrozenMap<Object>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

}
