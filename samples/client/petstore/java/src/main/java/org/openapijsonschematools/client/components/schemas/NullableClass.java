package org.openapijsonschematools.client.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
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
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class NullableClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public sealed interface AdditionalProperties3Boxed permits AdditionalProperties3BoxedVoid, AdditionalProperties3BoxedMap {
        @Nullable Object getData();
    }
    
    public record AdditionalProperties3BoxedVoid(Void data) implements AdditionalProperties3Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record AdditionalProperties3BoxedMap(FrozenMap<@Nullable Object> data) implements AdditionalProperties3Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class AdditionalProperties3 extends JsonSchema<AdditionalProperties3Boxed> implements NullSchemaValidator<AdditionalProperties3BoxedVoid>, MapSchemaValidator<FrozenMap<@Nullable Object>, AdditionalProperties3BoxedMap> {
        private static @Nullable AdditionalProperties3 instance = null;
    
        protected AdditionalProperties3() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    Map.class
                ))
            );
        }
    
        public static AdditionalProperties3 getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties3();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return castProperties;
        }
        
        public FrozenMap<@Nullable Object> validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public AdditionalProperties3BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new AdditionalProperties3BoxedVoid(validate(arg, configuration));
        }
        @Override
        public AdditionalProperties3BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new AdditionalProperties3BoxedMap(validate(arg, configuration));
        }
        @Override
        public AdditionalProperties3Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface IntegerPropBoxed permits IntegerPropBoxedVoid, IntegerPropBoxedNumber {
        @Nullable Object getData();
    }
    
    public record IntegerPropBoxedVoid(Void data) implements IntegerPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record IntegerPropBoxedNumber(Number data) implements IntegerPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class IntegerProp extends JsonSchema<IntegerPropBoxed> implements NullSchemaValidator<IntegerPropBoxedVoid>, NumberSchemaValidator<IntegerPropBoxedNumber> {
        private static @Nullable IntegerProp instance = null;
    
        protected IntegerProp() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .format("int")
            );
        }
    
        public static IntegerProp getInstance() {
            if (instance == null) {
                instance = new IntegerProp();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public IntegerPropBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new IntegerPropBoxedVoid(validate(arg, configuration));
        }
        @Override
        public IntegerPropBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new IntegerPropBoxedNumber(validate(arg, configuration));
        }
        @Override
        public IntegerPropBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface NumberPropBoxed permits NumberPropBoxedVoid, NumberPropBoxedNumber {
        @Nullable Object getData();
    }
    
    public record NumberPropBoxedVoid(Void data) implements NumberPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record NumberPropBoxedNumber(Number data) implements NumberPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class NumberProp extends JsonSchema<NumberPropBoxed> implements NullSchemaValidator<NumberPropBoxedVoid>, NumberSchemaValidator<NumberPropBoxedNumber> {
        private static @Nullable NumberProp instance = null;
    
        protected NumberProp() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
            );
        }
    
        public static NumberProp getInstance() {
            if (instance == null) {
                instance = new NumberProp();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public NumberPropBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new NumberPropBoxedVoid(validate(arg, configuration));
        }
        @Override
        public NumberPropBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new NumberPropBoxedNumber(validate(arg, configuration));
        }
        @Override
        public NumberPropBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface BooleanPropBoxed permits BooleanPropBoxedVoid, BooleanPropBoxedBoolean {
        @Nullable Object getData();
    }
    
    public record BooleanPropBoxedVoid(Void data) implements BooleanPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record BooleanPropBoxedBoolean(boolean data) implements BooleanPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class BooleanProp extends JsonSchema<BooleanPropBoxed> implements NullSchemaValidator<BooleanPropBoxedVoid>, BooleanSchemaValidator<BooleanPropBoxedBoolean> {
        private static @Nullable BooleanProp instance = null;
    
        protected BooleanProp() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    Boolean.class
                ))
            );
        }
    
        public static BooleanProp getInstance() {
            if (instance == null) {
                instance = new BooleanProp();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return validate(boolArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return getNewInstance(boolArg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public BooleanPropBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new BooleanPropBoxedVoid(validate(arg, configuration));
        }
        @Override
        public BooleanPropBoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return new BooleanPropBoxedBoolean(validate(arg, configuration));
        }
        @Override
        public BooleanPropBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Boolean booleanArg) {
                boolean castArg = booleanArg;
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface StringPropBoxed permits StringPropBoxedVoid, StringPropBoxedString {
        @Nullable Object getData();
    }
    
    public record StringPropBoxedVoid(Void data) implements StringPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record StringPropBoxedString(String data) implements StringPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class StringProp extends JsonSchema<StringPropBoxed> implements NullSchemaValidator<StringPropBoxedVoid>, StringSchemaValidator<StringPropBoxedString> {
        private static @Nullable StringProp instance = null;
    
        protected StringProp() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    String.class
                ))
            );
        }
    
        public static StringProp getInstance() {
            if (instance == null) {
                instance = new StringProp();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public StringPropBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new StringPropBoxedVoid(validate(arg, configuration));
        }
        @Override
        public StringPropBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new StringPropBoxedString(validate(arg, configuration));
        }
        @Override
        public StringPropBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface DatePropBoxed permits DatePropBoxedVoid, DatePropBoxedString {
        @Nullable Object getData();
    }
    
    public record DatePropBoxedVoid(Void data) implements DatePropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record DatePropBoxedString(String data) implements DatePropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class DateProp extends JsonSchema<DatePropBoxed> implements NullSchemaValidator<DatePropBoxedVoid>, StringSchemaValidator<DatePropBoxedString> {
        private static @Nullable DateProp instance = null;
    
        protected DateProp() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    String.class
                ))
                .format("date")
            );
        }
    
        public static DateProp getInstance() {
            if (instance == null) {
                instance = new DateProp();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public DatePropBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new DatePropBoxedVoid(validate(arg, configuration));
        }
        @Override
        public DatePropBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new DatePropBoxedString(validate(arg, configuration));
        }
        @Override
        public DatePropBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface DatetimePropBoxed permits DatetimePropBoxedVoid, DatetimePropBoxedString {
        @Nullable Object getData();
    }
    
    public record DatetimePropBoxedVoid(Void data) implements DatetimePropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record DatetimePropBoxedString(String data) implements DatetimePropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class DatetimeProp extends JsonSchema<DatetimePropBoxed> implements NullSchemaValidator<DatetimePropBoxedVoid>, StringSchemaValidator<DatetimePropBoxedString> {
        private static @Nullable DatetimeProp instance = null;
    
        protected DatetimeProp() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    String.class
                ))
                .format("date-time")
            );
        }
    
        public static DatetimeProp getInstance() {
            if (instance == null) {
                instance = new DatetimeProp();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public DatetimePropBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new DatetimePropBoxedVoid(validate(arg, configuration));
        }
        @Override
        public DatetimePropBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new DatetimePropBoxedString(validate(arg, configuration));
        }
        @Override
        public DatetimePropBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class Items extends MapJsonSchema.MapJsonSchema1 {
        private static @Nullable Items instance = null;
        public static Items getInstance() {
            if (instance == null) {
                instance = new Items();
            }
            return instance;
        }
    }
    
    
    public static class ArrayNullablePropList extends FrozenList<FrozenMap<?>> {
        protected ArrayNullablePropList(FrozenList<FrozenMap<?>> m) {
            super(m);
        }
        public static ArrayNullablePropList of(List<Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayNullableProp.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayNullablePropListBuilder {
        // class to build List<Map<String, @Nullable Object>>
        private final List<Map<String, @Nullable Object>> list;
    
        public ArrayNullablePropListBuilder() {
            list = new ArrayList<>();
        }
    
        public ArrayNullablePropListBuilder(List<Map<String, @Nullable Object>> list) {
            this.list = list;
        }
        
        public ArrayNullablePropListBuilder add(Map<String, @Nullable Object> item) {
            list.add(item);
            return this;
        }
    
        public List<Map<String, @Nullable Object>> build() {
            return list;
        }
    }
    
    
    public sealed interface ArrayNullablePropBoxed permits ArrayNullablePropBoxedVoid, ArrayNullablePropBoxedList {
        @Nullable Object getData();
    }
    
    public record ArrayNullablePropBoxedVoid(Void data) implements ArrayNullablePropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ArrayNullablePropBoxedList(ArrayNullablePropList data) implements ArrayNullablePropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class ArrayNullableProp extends JsonSchema<ArrayNullablePropBoxed> implements NullSchemaValidator<ArrayNullablePropBoxedVoid>, ListSchemaValidator<ArrayNullablePropList, ArrayNullablePropBoxedList> {
        private static @Nullable ArrayNullableProp instance = null;
    
        protected ArrayNullableProp() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    List.class
                ))
                .items(Items.class)
            );
        }
    
        public static ArrayNullableProp getInstance() {
            if (instance == null) {
                instance = new ArrayNullableProp();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public ArrayNullablePropList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<FrozenMap<?>> items = new ArrayList<>();
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
                if (!(itemInstance instanceof FrozenMap<?>)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                items.add((FrozenMap<?>) itemInstance);
                i += 1;
            }
            FrozenList<FrozenMap<?>> newInstanceItems = new FrozenList<>(items);
            return new ArrayNullablePropList(newInstanceItems);
        }
        
        public ArrayNullablePropList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ArrayNullablePropBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new ArrayNullablePropBoxedVoid(validate(arg, configuration));
        }
        @Override
        public ArrayNullablePropBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ArrayNullablePropBoxedList(validate(arg, configuration));
        }
        @Override
        public ArrayNullablePropBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface Items1Boxed permits Items1BoxedVoid, Items1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Items1BoxedVoid(Void data) implements Items1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record Items1BoxedMap(FrozenMap<@Nullable Object> data) implements Items1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Items1 extends JsonSchema<Items1Boxed> implements NullSchemaValidator<Items1BoxedVoid>, MapSchemaValidator<FrozenMap<@Nullable Object>, Items1BoxedMap> {
        private static @Nullable Items1 instance = null;
    
        protected Items1() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    Map.class
                ))
            );
        }
    
        public static Items1 getInstance() {
            if (instance == null) {
                instance = new Items1();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return castProperties;
        }
        
        public FrozenMap<@Nullable Object> validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public Items1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new Items1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public Items1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new Items1BoxedMap(validate(arg, configuration));
        }
        @Override
        public Items1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class ArrayAndItemsNullablePropList extends FrozenList<@Nullable FrozenMap<?>> {
        protected ArrayAndItemsNullablePropList(FrozenList<@Nullable FrozenMap<?>> m) {
            super(m);
        }
        public static ArrayAndItemsNullablePropList of(List<? extends @Nullable Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayAndItemsNullableProp.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayAndItemsNullablePropListBuilder {
        // class to build List<@Nullable Map<String, @Nullable Object>>
        private final List<@Nullable Map<String, @Nullable Object>> list;
    
        public ArrayAndItemsNullablePropListBuilder() {
            list = new ArrayList<>();
        }
    
        public ArrayAndItemsNullablePropListBuilder(List<@Nullable Map<String, @Nullable Object>> list) {
            this.list = list;
        }
        
        public ArrayAndItemsNullablePropListBuilder add(Void item) {
            list.add(null);
            return this;
        }
        
        public ArrayAndItemsNullablePropListBuilder add(Map<String, @Nullable Object> item) {
            list.add(item);
            return this;
        }
    
        public List<@Nullable Map<String, @Nullable Object>> build() {
            return list;
        }
    }
    
    
    public sealed interface ArrayAndItemsNullablePropBoxed permits ArrayAndItemsNullablePropBoxedVoid, ArrayAndItemsNullablePropBoxedList {
        @Nullable Object getData();
    }
    
    public record ArrayAndItemsNullablePropBoxedVoid(Void data) implements ArrayAndItemsNullablePropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ArrayAndItemsNullablePropBoxedList(ArrayAndItemsNullablePropList data) implements ArrayAndItemsNullablePropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class ArrayAndItemsNullableProp extends JsonSchema<ArrayAndItemsNullablePropBoxed> implements NullSchemaValidator<ArrayAndItemsNullablePropBoxedVoid>, ListSchemaValidator<ArrayAndItemsNullablePropList, ArrayAndItemsNullablePropBoxedList> {
        private static @Nullable ArrayAndItemsNullableProp instance = null;
    
        protected ArrayAndItemsNullableProp() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    List.class
                ))
                .items(Items1.class)
            );
        }
    
        public static ArrayAndItemsNullableProp getInstance() {
            if (instance == null) {
                instance = new ArrayAndItemsNullableProp();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public ArrayAndItemsNullablePropList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<@Nullable FrozenMap<?>> items = new ArrayList<>();
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
                if (!(itemInstance == null || itemInstance instanceof FrozenMap<?>)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                items.add((@Nullable FrozenMap<?>) itemInstance);
                i += 1;
            }
            FrozenList<@Nullable FrozenMap<?>> newInstanceItems = new FrozenList<>(items);
            return new ArrayAndItemsNullablePropList(newInstanceItems);
        }
        
        public ArrayAndItemsNullablePropList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ArrayAndItemsNullablePropBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new ArrayAndItemsNullablePropBoxedVoid(validate(arg, configuration));
        }
        @Override
        public ArrayAndItemsNullablePropBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ArrayAndItemsNullablePropBoxedList(validate(arg, configuration));
        }
        @Override
        public ArrayAndItemsNullablePropBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface Items2Boxed permits Items2BoxedVoid, Items2BoxedMap {
        @Nullable Object getData();
    }
    
    public record Items2BoxedVoid(Void data) implements Items2Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record Items2BoxedMap(FrozenMap<@Nullable Object> data) implements Items2Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Items2 extends JsonSchema<Items2Boxed> implements NullSchemaValidator<Items2BoxedVoid>, MapSchemaValidator<FrozenMap<@Nullable Object>, Items2BoxedMap> {
        private static @Nullable Items2 instance = null;
    
        protected Items2() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    Map.class
                ))
            );
        }
    
        public static Items2 getInstance() {
            if (instance == null) {
                instance = new Items2();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return castProperties;
        }
        
        public FrozenMap<@Nullable Object> validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public Items2BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new Items2BoxedVoid(validate(arg, configuration));
        }
        @Override
        public Items2BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new Items2BoxedMap(validate(arg, configuration));
        }
        @Override
        public Items2Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class ArrayItemsNullableList extends FrozenList<@Nullable FrozenMap<?>> {
        protected ArrayItemsNullableList(FrozenList<@Nullable FrozenMap<?>> m) {
            super(m);
        }
        public static ArrayItemsNullableList of(List<? extends @Nullable Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayItemsNullable.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayItemsNullableListBuilder {
        // class to build List<@Nullable Map<String, @Nullable Object>>
        private final List<@Nullable Map<String, @Nullable Object>> list;
    
        public ArrayItemsNullableListBuilder() {
            list = new ArrayList<>();
        }
    
        public ArrayItemsNullableListBuilder(List<@Nullable Map<String, @Nullable Object>> list) {
            this.list = list;
        }
        
        public ArrayItemsNullableListBuilder add(Void item) {
            list.add(null);
            return this;
        }
        
        public ArrayItemsNullableListBuilder add(Map<String, @Nullable Object> item) {
            list.add(item);
            return this;
        }
    
        public List<@Nullable Map<String, @Nullable Object>> build() {
            return list;
        }
    }
    
    
    public sealed interface ArrayItemsNullableBoxed permits ArrayItemsNullableBoxedList {
        @Nullable Object getData();
    }
    
    public record ArrayItemsNullableBoxedList(ArrayItemsNullableList data) implements ArrayItemsNullableBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class ArrayItemsNullable extends JsonSchema<ArrayItemsNullableBoxed> implements ListSchemaValidator<ArrayItemsNullableList, ArrayItemsNullableBoxedList> {
        private static @Nullable ArrayItemsNullable instance = null;
    
        protected ArrayItemsNullable() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items2.class)
            );
        }
    
        public static ArrayItemsNullable getInstance() {
            if (instance == null) {
                instance = new ArrayItemsNullable();
            }
            return instance;
        }
        
        @Override
        public ArrayItemsNullableList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<@Nullable FrozenMap<?>> items = new ArrayList<>();
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
                if (!(itemInstance == null || itemInstance instanceof FrozenMap<?>)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                items.add((@Nullable FrozenMap<?>) itemInstance);
                i += 1;
            }
            FrozenList<@Nullable FrozenMap<?>> newInstanceItems = new FrozenList<>(items);
            return new ArrayItemsNullableList(newInstanceItems);
        }
        
        public ArrayItemsNullableList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public ArrayItemsNullableBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ArrayItemsNullableBoxedList(validate(arg, configuration));
        }
        @Override
        public ArrayItemsNullableBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class AdditionalProperties extends MapJsonSchema.MapJsonSchema1 {
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class ObjectNullablePropMap extends FrozenMap<FrozenMap<?>> {
        protected ObjectNullablePropMap(FrozenMap<FrozenMap<?>> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static ObjectNullablePropMap of(Map<String, Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectNullableProp.getInstance().validate(arg, configuration);
        }
        
        public FrozenMap<?> getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    
    public interface SetterForAdditionalProperties<T> {
        Set<String> getKnownKeys();
        Map<String, Map<String, @Nullable Object>> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, Map<String, @Nullable Object>> instance);
        
        default T additionalProperty(String key, Map<String, @Nullable Object> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class ObjectNullablePropMapBuilder implements GenericBuilder<Map<String, Map<String, @Nullable Object>>>, SetterForAdditionalProperties<ObjectNullablePropMapBuilder> {
        private final Map<String, Map<String, @Nullable Object>> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ObjectNullablePropMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Map<String, @Nullable Object>> build() {
            return instance;
        }
        public Map<String, Map<String, @Nullable Object>> getInstance() {
            return instance;
        }
        public ObjectNullablePropMapBuilder getBuilderAfterAdditionalProperty(Map<String, Map<String, @Nullable Object>> instance) {
            return this;
        }
    }
    
    
    public sealed interface ObjectNullablePropBoxed permits ObjectNullablePropBoxedVoid, ObjectNullablePropBoxedMap {
        @Nullable Object getData();
    }
    
    public record ObjectNullablePropBoxedVoid(Void data) implements ObjectNullablePropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ObjectNullablePropBoxedMap(ObjectNullablePropMap data) implements ObjectNullablePropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ObjectNullableProp extends JsonSchema<ObjectNullablePropBoxed> implements NullSchemaValidator<ObjectNullablePropBoxedVoid>, MapSchemaValidator<ObjectNullablePropMap, ObjectNullablePropBoxedMap> {
        private static @Nullable ObjectNullableProp instance = null;
    
        protected ObjectNullableProp() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    Map.class
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static ObjectNullableProp getInstance() {
            if (instance == null) {
                instance = new ObjectNullableProp();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public ObjectNullablePropMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, FrozenMap<?>> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof FrozenMap<?>)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (FrozenMap<?>) propertyInstance);
            }
            FrozenMap<FrozenMap<?>> castProperties = new FrozenMap<>(properties);
            return new ObjectNullablePropMap(castProperties);
        }
        
        public ObjectNullablePropMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ObjectNullablePropBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new ObjectNullablePropBoxedVoid(validate(arg, configuration));
        }
        @Override
        public ObjectNullablePropBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ObjectNullablePropBoxedMap(validate(arg, configuration));
        }
        @Override
        public ObjectNullablePropBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface AdditionalProperties1Boxed permits AdditionalProperties1BoxedVoid, AdditionalProperties1BoxedMap {
        @Nullable Object getData();
    }
    
    public record AdditionalProperties1BoxedVoid(Void data) implements AdditionalProperties1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record AdditionalProperties1BoxedMap(FrozenMap<@Nullable Object> data) implements AdditionalProperties1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class AdditionalProperties1 extends JsonSchema<AdditionalProperties1Boxed> implements NullSchemaValidator<AdditionalProperties1BoxedVoid>, MapSchemaValidator<FrozenMap<@Nullable Object>, AdditionalProperties1BoxedMap> {
        private static @Nullable AdditionalProperties1 instance = null;
    
        protected AdditionalProperties1() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    Map.class
                ))
            );
        }
    
        public static AdditionalProperties1 getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties1();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return castProperties;
        }
        
        public FrozenMap<@Nullable Object> validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public AdditionalProperties1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new AdditionalProperties1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public AdditionalProperties1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new AdditionalProperties1BoxedMap(validate(arg, configuration));
        }
        @Override
        public AdditionalProperties1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class ObjectAndItemsNullablePropMap extends FrozenMap<@Nullable FrozenMap<?>> {
        protected ObjectAndItemsNullablePropMap(FrozenMap<@Nullable FrozenMap<?>> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static ObjectAndItemsNullablePropMap of(Map<String, ? extends @Nullable Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectAndItemsNullableProp.getInstance().validate(arg, configuration);
        }
        
        public @Nullable FrozenMap<?> getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    
    public interface SetterForAdditionalProperties1<T> {
        Set<String> getKnownKeys();
        Map<String, @Nullable Map<String, @Nullable Object>> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, @Nullable Map<String, @Nullable Object>> instance);
        
        default T additionalProperty(String key, Void value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, null);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, Map<String, @Nullable Object> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class ObjectAndItemsNullablePropMapBuilder implements GenericBuilder<Map<String, @Nullable Map<String, @Nullable Object>>>, SetterForAdditionalProperties1<ObjectAndItemsNullablePropMapBuilder> {
        private final Map<String, @Nullable Map<String, @Nullable Object>> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ObjectAndItemsNullablePropMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Map<String, @Nullable Object>> build() {
            return instance;
        }
        public Map<String, @Nullable Map<String, @Nullable Object>> getInstance() {
            return instance;
        }
        public ObjectAndItemsNullablePropMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Map<String, @Nullable Object>> instance) {
            return this;
        }
    }
    
    
    public sealed interface ObjectAndItemsNullablePropBoxed permits ObjectAndItemsNullablePropBoxedVoid, ObjectAndItemsNullablePropBoxedMap {
        @Nullable Object getData();
    }
    
    public record ObjectAndItemsNullablePropBoxedVoid(Void data) implements ObjectAndItemsNullablePropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ObjectAndItemsNullablePropBoxedMap(ObjectAndItemsNullablePropMap data) implements ObjectAndItemsNullablePropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ObjectAndItemsNullableProp extends JsonSchema<ObjectAndItemsNullablePropBoxed> implements NullSchemaValidator<ObjectAndItemsNullablePropBoxedVoid>, MapSchemaValidator<ObjectAndItemsNullablePropMap, ObjectAndItemsNullablePropBoxedMap> {
        private static @Nullable ObjectAndItemsNullableProp instance = null;
    
        protected ObjectAndItemsNullableProp() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    Map.class
                ))
                .additionalProperties(AdditionalProperties1.class)
            );
        }
    
        public static ObjectAndItemsNullableProp getInstance() {
            if (instance == null) {
                instance = new ObjectAndItemsNullableProp();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public ObjectAndItemsNullablePropMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable FrozenMap<?>> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance == null || propertyInstance instanceof FrozenMap<?>)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (@Nullable FrozenMap<?>) propertyInstance);
            }
            FrozenMap<@Nullable FrozenMap<?>> castProperties = new FrozenMap<>(properties);
            return new ObjectAndItemsNullablePropMap(castProperties);
        }
        
        public ObjectAndItemsNullablePropMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ObjectAndItemsNullablePropBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new ObjectAndItemsNullablePropBoxedVoid(validate(arg, configuration));
        }
        @Override
        public ObjectAndItemsNullablePropBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ObjectAndItemsNullablePropBoxedMap(validate(arg, configuration));
        }
        @Override
        public ObjectAndItemsNullablePropBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface AdditionalProperties2Boxed permits AdditionalProperties2BoxedVoid, AdditionalProperties2BoxedMap {
        @Nullable Object getData();
    }
    
    public record AdditionalProperties2BoxedVoid(Void data) implements AdditionalProperties2Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record AdditionalProperties2BoxedMap(FrozenMap<@Nullable Object> data) implements AdditionalProperties2Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class AdditionalProperties2 extends JsonSchema<AdditionalProperties2Boxed> implements NullSchemaValidator<AdditionalProperties2BoxedVoid>, MapSchemaValidator<FrozenMap<@Nullable Object>, AdditionalProperties2BoxedMap> {
        private static @Nullable AdditionalProperties2 instance = null;
    
        protected AdditionalProperties2() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    Map.class
                ))
            );
        }
    
        public static AdditionalProperties2 getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties2();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return castProperties;
        }
        
        public FrozenMap<@Nullable Object> validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public AdditionalProperties2BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new AdditionalProperties2BoxedVoid(validate(arg, configuration));
        }
        @Override
        public AdditionalProperties2BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new AdditionalProperties2BoxedMap(validate(arg, configuration));
        }
        @Override
        public AdditionalProperties2Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class ObjectItemsNullableMap extends FrozenMap<@Nullable FrozenMap<?>> {
        protected ObjectItemsNullableMap(FrozenMap<@Nullable FrozenMap<?>> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static ObjectItemsNullableMap of(Map<String, ? extends @Nullable Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectItemsNullable.getInstance().validate(arg, configuration);
        }
        
        public @Nullable FrozenMap<?> getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    
    public interface SetterForAdditionalProperties2<T> {
        Set<String> getKnownKeys();
        Map<String, @Nullable Map<String, @Nullable Object>> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, @Nullable Map<String, @Nullable Object>> instance);
        
        default T additionalProperty(String key, Void value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, null);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, Map<String, @Nullable Object> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class ObjectItemsNullableMapBuilder implements GenericBuilder<Map<String, @Nullable Map<String, @Nullable Object>>>, SetterForAdditionalProperties2<ObjectItemsNullableMapBuilder> {
        private final Map<String, @Nullable Map<String, @Nullable Object>> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ObjectItemsNullableMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Map<String, @Nullable Object>> build() {
            return instance;
        }
        public Map<String, @Nullable Map<String, @Nullable Object>> getInstance() {
            return instance;
        }
        public ObjectItemsNullableMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Map<String, @Nullable Object>> instance) {
            return this;
        }
    }
    
    
    public sealed interface ObjectItemsNullableBoxed permits ObjectItemsNullableBoxedMap {
        @Nullable Object getData();
    }
    
    public record ObjectItemsNullableBoxedMap(ObjectItemsNullableMap data) implements ObjectItemsNullableBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ObjectItemsNullable extends JsonSchema<ObjectItemsNullableBoxed> implements MapSchemaValidator<ObjectItemsNullableMap, ObjectItemsNullableBoxedMap> {
        private static @Nullable ObjectItemsNullable instance = null;
    
        protected ObjectItemsNullable() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties2.class)
            );
        }
    
        public static ObjectItemsNullable getInstance() {
            if (instance == null) {
                instance = new ObjectItemsNullable();
            }
            return instance;
        }
        
        public ObjectItemsNullableMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable FrozenMap<?>> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance == null || propertyInstance instanceof FrozenMap<?>)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (@Nullable FrozenMap<?>) propertyInstance);
            }
            FrozenMap<@Nullable FrozenMap<?>> castProperties = new FrozenMap<>(properties);
            return new ObjectItemsNullableMap(castProperties);
        }
        
        public ObjectItemsNullableMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public ObjectItemsNullableBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ObjectItemsNullableBoxedMap(validate(arg, configuration));
        }
        @Override
        public ObjectItemsNullableBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
    
    
    public static class NullableClassMap extends FrozenMap<@Nullable Object> {
        protected NullableClassMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "integer_prop",
            "number_prop",
            "boolean_prop",
            "string_prop",
            "date_prop",
            "datetime_prop",
            "array_nullable_prop",
            "array_and_items_nullable_prop",
            "array_items_nullable",
            "object_nullable_prop",
            "object_and_items_nullable_prop",
            "object_items_nullable"
        );
        public static NullableClassMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return NullableClass1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Number integer_prop() throws UnsetPropertyException {
            String key = "integer_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for integer_prop");
            }
            return (@Nullable Number) value;
        }
        
        public @Nullable Number number_prop() throws UnsetPropertyException {
            String key = "number_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for number_prop");
            }
            return (@Nullable Number) value;
        }
        
        public @Nullable Boolean boolean_prop() throws UnsetPropertyException {
            String key = "boolean_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof Boolean)) {
                throw new RuntimeException("Invalid value stored for boolean_prop");
            }
            return (@Nullable Boolean) value;
        }
        
        public @Nullable String string_prop() throws UnsetPropertyException {
            String key = "string_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof String)) {
                throw new RuntimeException("Invalid value stored for string_prop");
            }
            return (@Nullable String) value;
        }
        
        public @Nullable String date_prop() throws UnsetPropertyException {
            String key = "date_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof String)) {
                throw new RuntimeException("Invalid value stored for date_prop");
            }
            return (@Nullable String) value;
        }
        
        public @Nullable String datetime_prop() throws UnsetPropertyException {
            String key = "datetime_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof String)) {
                throw new RuntimeException("Invalid value stored for datetime_prop");
            }
            return (@Nullable String) value;
        }
        
        public @Nullable ArrayNullablePropList array_nullable_prop() throws UnsetPropertyException {
            String key = "array_nullable_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof ArrayNullablePropList)) {
                throw new RuntimeException("Invalid value stored for array_nullable_prop");
            }
            return (@Nullable ArrayNullablePropList) value;
        }
        
        public @Nullable ArrayAndItemsNullablePropList array_and_items_nullable_prop() throws UnsetPropertyException {
            String key = "array_and_items_nullable_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof ArrayAndItemsNullablePropList)) {
                throw new RuntimeException("Invalid value stored for array_and_items_nullable_prop");
            }
            return (@Nullable ArrayAndItemsNullablePropList) value;
        }
        
        public ArrayItemsNullableList array_items_nullable() throws UnsetPropertyException {
            String key = "array_items_nullable";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof ArrayItemsNullableList)) {
                throw new RuntimeException("Invalid value stored for array_items_nullable");
            }
            return (ArrayItemsNullableList) value;
        }
        
        public @Nullable ObjectNullablePropMap object_nullable_prop() throws UnsetPropertyException {
            String key = "object_nullable_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof ObjectNullablePropMap)) {
                throw new RuntimeException("Invalid value stored for object_nullable_prop");
            }
            return (@Nullable ObjectNullablePropMap) value;
        }
        
        public @Nullable ObjectAndItemsNullablePropMap object_and_items_nullable_prop() throws UnsetPropertyException {
            String key = "object_and_items_nullable_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof ObjectAndItemsNullablePropMap)) {
                throw new RuntimeException("Invalid value stored for object_and_items_nullable_prop");
            }
            return (@Nullable ObjectAndItemsNullablePropMap) value;
        }
        
        public ObjectItemsNullableMap object_items_nullable() throws UnsetPropertyException {
            String key = "object_items_nullable";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof ObjectItemsNullableMap)) {
                throw new RuntimeException("Invalid value stored for object_items_nullable");
            }
            return (ObjectItemsNullableMap) value;
        }
        
        public @Nullable FrozenMap<?> getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            var value = getOrThrow(name);
            if (!(value == null || value instanceof FrozenMap<?>)) {
                throw new RuntimeException("Invalid value stored for " + name);
            }
            return (@Nullable FrozenMap<?>) value;
        }
    }
    
    public interface SetterForIntegerProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterIntegerProp(Map<String, @Nullable Object> instance);
        
        default T integer_prop(Void value) {
            var instance = getInstance();
            instance.put("integer_prop", null);
            return getBuilderAfterIntegerProp(instance);
        }
        
        default T integer_prop(int value) {
            var instance = getInstance();
            instance.put("integer_prop", value);
            return getBuilderAfterIntegerProp(instance);
        }
        
        default T integer_prop(float value) {
            var instance = getInstance();
            instance.put("integer_prop", value);
            return getBuilderAfterIntegerProp(instance);
        }
        
        default T integer_prop(long value) {
            var instance = getInstance();
            instance.put("integer_prop", value);
            return getBuilderAfterIntegerProp(instance);
        }
        
        default T integer_prop(double value) {
            var instance = getInstance();
            instance.put("integer_prop", value);
            return getBuilderAfterIntegerProp(instance);
        }
    }
    
    public interface SetterForNumberProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterNumberProp(Map<String, @Nullable Object> instance);
        
        default T number_prop(Void value) {
            var instance = getInstance();
            instance.put("number_prop", null);
            return getBuilderAfterNumberProp(instance);
        }
        
        default T number_prop(int value) {
            var instance = getInstance();
            instance.put("number_prop", value);
            return getBuilderAfterNumberProp(instance);
        }
        
        default T number_prop(float value) {
            var instance = getInstance();
            instance.put("number_prop", value);
            return getBuilderAfterNumberProp(instance);
        }
        
        default T number_prop(long value) {
            var instance = getInstance();
            instance.put("number_prop", value);
            return getBuilderAfterNumberProp(instance);
        }
        
        default T number_prop(double value) {
            var instance = getInstance();
            instance.put("number_prop", value);
            return getBuilderAfterNumberProp(instance);
        }
    }
    
    public interface SetterForBooleanProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterBooleanProp(Map<String, @Nullable Object> instance);
        
        default T boolean_prop(Void value) {
            var instance = getInstance();
            instance.put("boolean_prop", null);
            return getBuilderAfterBooleanProp(instance);
        }
        
        default T boolean_prop(boolean value) {
            var instance = getInstance();
            instance.put("boolean_prop", value);
            return getBuilderAfterBooleanProp(instance);
        }
    }
    
    public interface SetterForStringProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterStringProp(Map<String, @Nullable Object> instance);
        
        default T string_prop(Void value) {
            var instance = getInstance();
            instance.put("string_prop", null);
            return getBuilderAfterStringProp(instance);
        }
        
        default T string_prop(String value) {
            var instance = getInstance();
            instance.put("string_prop", value);
            return getBuilderAfterStringProp(instance);
        }
    }
    
    public interface SetterForDateProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterDateProp(Map<String, @Nullable Object> instance);
        
        default T date_prop(Void value) {
            var instance = getInstance();
            instance.put("date_prop", null);
            return getBuilderAfterDateProp(instance);
        }
        
        default T date_prop(String value) {
            var instance = getInstance();
            instance.put("date_prop", value);
            return getBuilderAfterDateProp(instance);
        }
    }
    
    public interface SetterForDatetimeProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterDatetimeProp(Map<String, @Nullable Object> instance);
        
        default T datetime_prop(Void value) {
            var instance = getInstance();
            instance.put("datetime_prop", null);
            return getBuilderAfterDatetimeProp(instance);
        }
        
        default T datetime_prop(String value) {
            var instance = getInstance();
            instance.put("datetime_prop", value);
            return getBuilderAfterDatetimeProp(instance);
        }
    }
    
    public interface SetterForArrayNullableProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterArrayNullableProp(Map<String, @Nullable Object> instance);
        
        default T array_nullable_prop(Void value) {
            var instance = getInstance();
            instance.put("array_nullable_prop", null);
            return getBuilderAfterArrayNullableProp(instance);
        }
        
        default T array_nullable_prop(List<Map<String, @Nullable Object>> value) {
            var instance = getInstance();
            instance.put("array_nullable_prop", value);
            return getBuilderAfterArrayNullableProp(instance);
        }
    }
    
    public interface SetterForArrayAndItemsNullableProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterArrayAndItemsNullableProp(Map<String, @Nullable Object> instance);
        
        default T array_and_items_nullable_prop(Void value) {
            var instance = getInstance();
            instance.put("array_and_items_nullable_prop", null);
            return getBuilderAfterArrayAndItemsNullableProp(instance);
        }
        
        default T array_and_items_nullable_prop(List<@Nullable Map<String, @Nullable Object>> value) {
            var instance = getInstance();
            instance.put("array_and_items_nullable_prop", value);
            return getBuilderAfterArrayAndItemsNullableProp(instance);
        }
    }
    
    public interface SetterForArrayItemsNullable <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterArrayItemsNullable(Map<String, @Nullable Object> instance);
        
        default T array_items_nullable(List<@Nullable Map<String, @Nullable Object>> value) {
            var instance = getInstance();
            instance.put("array_items_nullable", value);
            return getBuilderAfterArrayItemsNullable(instance);
        }
    }
    
    public interface SetterForObjectNullableProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterObjectNullableProp(Map<String, @Nullable Object> instance);
        
        default T object_nullable_prop(Void value) {
            var instance = getInstance();
            instance.put("object_nullable_prop", null);
            return getBuilderAfterObjectNullableProp(instance);
        }
        
        default T object_nullable_prop(Map<String, Map<String, @Nullable Object>> value) {
            var instance = getInstance();
            instance.put("object_nullable_prop", value);
            return getBuilderAfterObjectNullableProp(instance);
        }
    }
    
    public interface SetterForObjectAndItemsNullableProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterObjectAndItemsNullableProp(Map<String, @Nullable Object> instance);
        
        default T object_and_items_nullable_prop(Void value) {
            var instance = getInstance();
            instance.put("object_and_items_nullable_prop", null);
            return getBuilderAfterObjectAndItemsNullableProp(instance);
        }
        
        default T object_and_items_nullable_prop(Map<String, @Nullable Map<String, @Nullable Object>> value) {
            var instance = getInstance();
            instance.put("object_and_items_nullable_prop", value);
            return getBuilderAfterObjectAndItemsNullableProp(instance);
        }
    }
    
    public interface SetterForObjectItemsNullable <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterObjectItemsNullable(Map<String, @Nullable Object> instance);
        
        default T object_items_nullable(Map<String, @Nullable Map<String, @Nullable Object>> value) {
            var instance = getInstance();
            instance.put("object_items_nullable", value);
            return getBuilderAfterObjectItemsNullable(instance);
        }
    }
    
    public interface SetterForAdditionalProperties3<T> {
        Set<String> getKnownKeys();
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance);
        
        default T additionalProperty(String key, Void value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, null);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, Map<String, @Nullable Object> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class NullableClassMapBuilder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForIntegerProp<NullableClassMapBuilder>, SetterForNumberProp<NullableClassMapBuilder>, SetterForBooleanProp<NullableClassMapBuilder>, SetterForStringProp<NullableClassMapBuilder>, SetterForDateProp<NullableClassMapBuilder>, SetterForDatetimeProp<NullableClassMapBuilder>, SetterForArrayNullableProp<NullableClassMapBuilder>, SetterForArrayAndItemsNullableProp<NullableClassMapBuilder>, SetterForArrayItemsNullable<NullableClassMapBuilder>, SetterForObjectNullableProp<NullableClassMapBuilder>, SetterForObjectAndItemsNullableProp<NullableClassMapBuilder>, SetterForObjectItemsNullable<NullableClassMapBuilder>, SetterForAdditionalProperties3<NullableClassMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "integer_prop",
            "number_prop",
            "boolean_prop",
            "string_prop",
            "date_prop",
            "datetime_prop",
            "array_nullable_prop",
            "array_and_items_nullable_prop",
            "array_items_nullable",
            "object_nullable_prop",
            "object_and_items_nullable_prop",
            "object_items_nullable"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public NullableClassMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public NullableClassMapBuilder getBuilderAfterIntegerProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public NullableClassMapBuilder getBuilderAfterNumberProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public NullableClassMapBuilder getBuilderAfterBooleanProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public NullableClassMapBuilder getBuilderAfterStringProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public NullableClassMapBuilder getBuilderAfterDateProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public NullableClassMapBuilder getBuilderAfterDatetimeProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public NullableClassMapBuilder getBuilderAfterArrayNullableProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public NullableClassMapBuilder getBuilderAfterArrayAndItemsNullableProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public NullableClassMapBuilder getBuilderAfterArrayItemsNullable(Map<String, @Nullable Object> instance) {
            return this;
        }
        public NullableClassMapBuilder getBuilderAfterObjectNullableProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public NullableClassMapBuilder getBuilderAfterObjectAndItemsNullableProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public NullableClassMapBuilder getBuilderAfterObjectItemsNullable(Map<String, @Nullable Object> instance) {
            return this;
        }
        public NullableClassMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface NullableClass1Boxed permits NullableClass1BoxedMap {
        @Nullable Object getData();
    }
    
    public record NullableClass1BoxedMap(NullableClassMap data) implements NullableClass1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class NullableClass1 extends JsonSchema<NullableClass1Boxed> implements MapSchemaValidator<NullableClassMap, NullableClass1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable NullableClass1 instance = null;
    
        protected NullableClass1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("integer_prop", IntegerProp.class),
                    new PropertyEntry("number_prop", NumberProp.class),
                    new PropertyEntry("boolean_prop", BooleanProp.class),
                    new PropertyEntry("string_prop", StringProp.class),
                    new PropertyEntry("date_prop", DateProp.class),
                    new PropertyEntry("datetime_prop", DatetimeProp.class),
                    new PropertyEntry("array_nullable_prop", ArrayNullableProp.class),
                    new PropertyEntry("array_and_items_nullable_prop", ArrayAndItemsNullableProp.class),
                    new PropertyEntry("array_items_nullable", ArrayItemsNullable.class),
                    new PropertyEntry("object_nullable_prop", ObjectNullableProp.class),
                    new PropertyEntry("object_and_items_nullable_prop", ObjectAndItemsNullableProp.class),
                    new PropertyEntry("object_items_nullable", ObjectItemsNullable.class)
                ))
                .additionalProperties(AdditionalProperties3.class)
            );
        }
    
        public static NullableClass1 getInstance() {
            if (instance == null) {
                instance = new NullableClass1();
            }
            return instance;
        }
        
        public NullableClassMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
                if (!(propertyInstance == null || propertyInstance instanceof Object)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (@Nullable Object) propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new NullableClassMap(castProperties);
        }
        
        public NullableClassMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public NullableClass1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new NullableClass1BoxedMap(validate(arg, configuration));
        }
        @Override
        public NullableClass1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
