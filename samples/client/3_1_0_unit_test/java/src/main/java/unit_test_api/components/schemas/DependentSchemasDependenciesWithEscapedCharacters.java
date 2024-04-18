package unit_test_api.components.schemas;
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
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.Nullable;
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.InvalidAdditionalPropertyException;
import unit_test_api.exceptions.UnsetPropertyException;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.GenericBuilder;
import unit_test_api.schemas.UnsetAddPropsSetter;
import unit_test_api.schemas.validation.BooleanSchemaValidator;
import unit_test_api.schemas.validation.FrozenList;
import unit_test_api.schemas.validation.FrozenMap;
import unit_test_api.schemas.validation.JsonSchema;
import unit_test_api.schemas.validation.JsonSchemaInfo;
import unit_test_api.schemas.validation.ListSchemaValidator;
import unit_test_api.schemas.validation.MapSchemaValidator;
import unit_test_api.schemas.validation.NullSchemaValidator;
import unit_test_api.schemas.validation.NumberSchemaValidator;
import unit_test_api.schemas.validation.PathToSchemasMap;
import unit_test_api.schemas.validation.PropertyEntry;
import unit_test_api.schemas.validation.StringSchemaValidator;
import unit_test_api.schemas.validation.ValidationMetadata;

public class DependentSchemasDependenciesWithEscapedCharacters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public sealed interface FootbarBoxed permits FootbarBoxedVoid, FootbarBoxedBoolean, FootbarBoxedNumber, FootbarBoxedString, FootbarBoxedList, FootbarBoxedMap {
        @Nullable Object getData();
    }
    
    public record FootbarBoxedVoid(Void data) implements FootbarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record FootbarBoxedBoolean(boolean data) implements FootbarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record FootbarBoxedNumber(Number data) implements FootbarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record FootbarBoxedString(String data) implements FootbarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record FootbarBoxedList(FrozenList<@Nullable Object> data) implements FootbarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record FootbarBoxedMap(FrozenMap<@Nullable Object> data) implements FootbarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Footbar extends JsonSchema<FootbarBoxed> implements NullSchemaValidator<FootbarBoxedVoid>, BooleanSchemaValidator<FootbarBoxedBoolean>, NumberSchemaValidator<FootbarBoxedNumber>, StringSchemaValidator<FootbarBoxedString>, ListSchemaValidator<FrozenList<@Nullable Object>, FootbarBoxedList>, MapSchemaValidator<FrozenMap<@Nullable Object>, FootbarBoxedMap> {
        private static @Nullable Footbar instance = null;
    
        protected Footbar() {
            super(new JsonSchemaInfo()
                .minProperties(4)
            );
        }
    
        public static Footbar getInstance() {
            if (instance == null) {
                instance = new Footbar();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
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
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        @Override
        public FrozenList<@Nullable Object> getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<@Nullable Object> items = new ArrayList<>();
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
                items.add(itemInstance);
                i += 1;
            }
            FrozenList<@Nullable Object> newInstanceItems = new FrozenList<>(items);
            return newInstanceItems;
        }
        
        public FrozenList<@Nullable Object> validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
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
            List<Object> pathToItem = List.of("args[0]");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return validate(boolArg, configuration);
            } else if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            } else if (arg instanceof String) {
                return validate((String) arg, configuration);
            } else if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
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
            } else if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public FootbarBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new FootbarBoxedVoid(validate(arg, configuration));
        }
        @Override
        public FootbarBoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return new FootbarBoxedBoolean(validate(arg, configuration));
        }
        @Override
        public FootbarBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new FootbarBoxedNumber(validate(arg, configuration));
        }
        @Override
        public FootbarBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new FootbarBoxedString(validate(arg, configuration));
        }
        @Override
        public FootbarBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FootbarBoxedList(validate(arg, configuration));
        }
        @Override
        public FootbarBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FootbarBoxedMap(validate(arg, configuration));
        }
        @Override
        public FootbarBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Boolean booleanArg) {
                boolean castArg = booleanArg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class FoobarMap extends FrozenMap<@Nullable Object> {
        protected FoobarMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "foo\"bar"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static FoobarMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Foobar.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForFoobar1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoobar1(Map<String, @Nullable Object> instance);
        
        default T fooReverseSolidusQuotationMarkBar(Void value) {
            var instance = getInstance();
            instance.put("foo\"bar", null);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(boolean value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(String value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(int value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(float value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(long value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(double value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(List<?> value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T fooReverseSolidusQuotationMarkBar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar1(instance);
        }
    }
    
    public static class FoobarMap0Builder extends UnsetAddPropsSetter<FoobarMap0Builder> implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "foo\"bar"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FoobarMap0Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FoobarMap0Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class FoobarMapBuilder implements SetterForFoobar1<FoobarMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        public FoobarMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FoobarMap0Builder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return new FoobarMap0Builder(instance);
        }
    }
    
    
    public sealed interface FoobarBoxed permits FoobarBoxedVoid, FoobarBoxedBoolean, FoobarBoxedNumber, FoobarBoxedString, FoobarBoxedList, FoobarBoxedMap {
        @Nullable Object getData();
    }
    
    public record FoobarBoxedVoid(Void data) implements FoobarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record FoobarBoxedBoolean(boolean data) implements FoobarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record FoobarBoxedNumber(Number data) implements FoobarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record FoobarBoxedString(String data) implements FoobarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record FoobarBoxedList(FrozenList<@Nullable Object> data) implements FoobarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record FoobarBoxedMap(FoobarMap data) implements FoobarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Foobar extends JsonSchema<FoobarBoxed> implements NullSchemaValidator<FoobarBoxedVoid>, BooleanSchemaValidator<FoobarBoxedBoolean>, NumberSchemaValidator<FoobarBoxedNumber>, StringSchemaValidator<FoobarBoxedString>, ListSchemaValidator<FrozenList<@Nullable Object>, FoobarBoxedList>, MapSchemaValidator<FoobarMap, FoobarBoxedMap> {
        private static @Nullable Foobar instance = null;
    
        protected Foobar() {
            super(new JsonSchemaInfo()
                .required(Set.of(
                    "foo\"bar"
                ))
            );
        }
    
        public static Foobar getInstance() {
            if (instance == null) {
                instance = new Foobar();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
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
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        @Override
        public FrozenList<@Nullable Object> getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<@Nullable Object> items = new ArrayList<>();
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
                items.add(itemInstance);
                i += 1;
            }
            FrozenList<@Nullable Object> newInstanceItems = new FrozenList<>(items);
            return newInstanceItems;
        }
        
        public FrozenList<@Nullable Object> validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public FoobarMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new FoobarMap(castProperties);
        }
        
        public FoobarMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return validate(boolArg, configuration);
            } else if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            } else if (arg instanceof String) {
                return validate((String) arg, configuration);
            } else if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
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
            } else if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public FoobarBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new FoobarBoxedVoid(validate(arg, configuration));
        }
        @Override
        public FoobarBoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return new FoobarBoxedBoolean(validate(arg, configuration));
        }
        @Override
        public FoobarBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new FoobarBoxedNumber(validate(arg, configuration));
        }
        @Override
        public FoobarBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new FoobarBoxedString(validate(arg, configuration));
        }
        @Override
        public FoobarBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FoobarBoxedList(validate(arg, configuration));
        }
        @Override
        public FoobarBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FoobarBoxedMap(validate(arg, configuration));
        }
        @Override
        public FoobarBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Boolean booleanArg) {
                boolean castArg = booleanArg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface DependentSchemasDependenciesWithEscapedCharacters1Boxed permits DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid, DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean, DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber, DependentSchemasDependenciesWithEscapedCharacters1BoxedString, DependentSchemasDependenciesWithEscapedCharacters1BoxedList, DependentSchemasDependenciesWithEscapedCharacters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid(Void data) implements DependentSchemasDependenciesWithEscapedCharacters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean(boolean data) implements DependentSchemasDependenciesWithEscapedCharacters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber(Number data) implements DependentSchemasDependenciesWithEscapedCharacters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record DependentSchemasDependenciesWithEscapedCharacters1BoxedString(String data) implements DependentSchemasDependenciesWithEscapedCharacters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record DependentSchemasDependenciesWithEscapedCharacters1BoxedList(FrozenList<@Nullable Object> data) implements DependentSchemasDependenciesWithEscapedCharacters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record DependentSchemasDependenciesWithEscapedCharacters1BoxedMap(FrozenMap<@Nullable Object> data) implements DependentSchemasDependenciesWithEscapedCharacters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class DependentSchemasDependenciesWithEscapedCharacters1 extends JsonSchema<DependentSchemasDependenciesWithEscapedCharacters1Boxed> implements NullSchemaValidator<DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid>, BooleanSchemaValidator<DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean>, NumberSchemaValidator<DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber>, StringSchemaValidator<DependentSchemasDependenciesWithEscapedCharacters1BoxedString>, ListSchemaValidator<FrozenList<@Nullable Object>, DependentSchemasDependenciesWithEscapedCharacters1BoxedList>, MapSchemaValidator<FrozenMap<@Nullable Object>, DependentSchemasDependenciesWithEscapedCharacters1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable DependentSchemasDependenciesWithEscapedCharacters1 instance = null;
    
        protected DependentSchemasDependenciesWithEscapedCharacters1() {
            super(new JsonSchemaInfo()
                .dependentSchemas(Map.ofEntries(
                    new PropertyEntry("foo\tbar", Footbar.class),
                    new PropertyEntry("foo'bar", Foobar.class)
                ))
            );
        }
    
        public static DependentSchemasDependenciesWithEscapedCharacters1 getInstance() {
            if (instance == null) {
                instance = new DependentSchemasDependenciesWithEscapedCharacters1();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
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
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        @Override
        public FrozenList<@Nullable Object> getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<@Nullable Object> items = new ArrayList<>();
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
                items.add(itemInstance);
                i += 1;
            }
            FrozenList<@Nullable Object> newInstanceItems = new FrozenList<>(items);
            return newInstanceItems;
        }
        
        public FrozenList<@Nullable Object> validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
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
            List<Object> pathToItem = List.of("args[0]");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return validate(boolArg, configuration);
            } else if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            } else if (arg instanceof String) {
                return validate((String) arg, configuration);
            } else if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
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
            } else if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return new DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean(validate(arg, configuration));
        }
        @Override
        public DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber(validate(arg, configuration));
        }
        @Override
        public DependentSchemasDependenciesWithEscapedCharacters1BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new DependentSchemasDependenciesWithEscapedCharacters1BoxedString(validate(arg, configuration));
        }
        @Override
        public DependentSchemasDependenciesWithEscapedCharacters1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new DependentSchemasDependenciesWithEscapedCharacters1BoxedList(validate(arg, configuration));
        }
        @Override
        public DependentSchemasDependenciesWithEscapedCharacters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new DependentSchemasDependenciesWithEscapedCharacters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public DependentSchemasDependenciesWithEscapedCharacters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Boolean booleanArg) {
                boolean castArg = booleanArg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
