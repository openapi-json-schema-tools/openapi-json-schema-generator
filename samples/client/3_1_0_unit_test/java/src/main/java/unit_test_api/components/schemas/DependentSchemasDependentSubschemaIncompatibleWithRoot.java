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
import unit_test_api.schemas.AnyTypeJsonSchema;
import unit_test_api.schemas.GenericBuilder;
import unit_test_api.schemas.NotAnyTypeJsonSchema;
import unit_test_api.schemas.UnsetAddPropsSetter;
import unit_test_api.schemas.validation.BooleanSchemaValidator;
import unit_test_api.schemas.validation.FrozenList;
import unit_test_api.schemas.validation.FrozenMap;
import unit_test_api.schemas.validation.JsonSchema;
import unit_test_api.schemas.validation.JsonSchemaInfo;
import unit_test_api.schemas.validation.ListSchemaValidator;
import unit_test_api.schemas.validation.MapSchemaValidator;
import unit_test_api.schemas.validation.MapUtils;
import unit_test_api.schemas.validation.NullSchemaValidator;
import unit_test_api.schemas.validation.NumberSchemaValidator;
import unit_test_api.schemas.validation.PathToSchemasMap;
import unit_test_api.schemas.validation.PropertyEntry;
import unit_test_api.schemas.validation.StringSchemaValidator;
import unit_test_api.schemas.validation.ValidationMetadata;

public class DependentSchemasDependentSubschemaIncompatibleWithRoot {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class Bar extends AnyTypeJsonSchema.AnyTypeJsonSchema1 {
        private static @Nullable Bar instance = null;
        public static Bar getInstance() {
            if (instance == null) {
                instance = new Bar();
            }
            return instance;
        }
    }
    
    
    public static class FooMap extends FrozenMap<@Nullable Object> {
        protected FooMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "bar"
        );
        public static FooMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Foo1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object bar() throws UnsetPropertyException {
            return getOrThrow("bar");
        }
    }
    
    public interface SetterForBar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterBar(Map<String, @Nullable Object> instance);
        
        default T bar(Void value) {
            var instance = getInstance();
            instance.put("bar", null);
            return getBuilderAfterBar(instance);
        }
        
        default T bar(boolean value) {
            var instance = getInstance();
            instance.put("bar", value);
            return getBuilderAfterBar(instance);
        }
        
        default T bar(String value) {
            var instance = getInstance();
            instance.put("bar", value);
            return getBuilderAfterBar(instance);
        }
        
        default T bar(int value) {
            var instance = getInstance();
            instance.put("bar", value);
            return getBuilderAfterBar(instance);
        }
        
        default T bar(float value) {
            var instance = getInstance();
            instance.put("bar", value);
            return getBuilderAfterBar(instance);
        }
        
        default T bar(long value) {
            var instance = getInstance();
            instance.put("bar", value);
            return getBuilderAfterBar(instance);
        }
        
        default T bar(double value) {
            var instance = getInstance();
            instance.put("bar", value);
            return getBuilderAfterBar(instance);
        }
        
        default T bar(List<?> value) {
            var instance = getInstance();
            instance.put("bar", value);
            return getBuilderAfterBar(instance);
        }
        
        default T bar(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("bar", value);
            return getBuilderAfterBar(instance);
        }
    }
    
    public static class FooMapBuilder1 implements GenericBuilder<Map<String, @Nullable Object>>, SetterForBar<FooMapBuilder1> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "bar"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FooMapBuilder1() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FooMapBuilder1 getBuilderAfterBar(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface Foo1Boxed permits Foo1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Foo1BoxedMap(FooMap data) implements Foo1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Foo1 extends JsonSchema<Foo1Boxed> implements MapSchemaValidator<FooMap, Foo1BoxedMap> {
        private static @Nullable Foo1 instance = null;
    
        protected Foo1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("bar", Bar.class)
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static Foo1 getInstance() {
            if (instance == null) {
                instance = new Foo1();
            }
            return instance;
        }
        
        public FooMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new FooMap(castProperties);
        }
        
        public FooMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public Foo1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new Foo1BoxedMap(validate(arg, configuration));
        }
        @Override
        public Foo1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
    
    
    public static class Foo extends AnyTypeJsonSchema.AnyTypeJsonSchema1 {
        private static @Nullable Foo instance = null;
        public static Foo getInstance() {
            if (instance == null) {
                instance = new Foo();
            }
            return instance;
        }
    }
    
    
    public static class DependentSchemasDependentSubschemaIncompatibleWithRootMap extends FrozenMap<@Nullable Object> {
        protected DependentSchemasDependentSubschemaIncompatibleWithRootMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "foo"
        );
        public static DependentSchemasDependentSubschemaIncompatibleWithRootMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return DependentSchemasDependentSubschemaIncompatibleWithRoot1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object foo() throws UnsetPropertyException {
            return getOrThrow("foo");
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForFoo <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoo(Map<String, @Nullable Object> instance);
        
        default T foo(Void value) {
            var instance = getInstance();
            instance.put("foo", null);
            return getBuilderAfterFoo(instance);
        }
        
        default T foo(boolean value) {
            var instance = getInstance();
            instance.put("foo", value);
            return getBuilderAfterFoo(instance);
        }
        
        default T foo(String value) {
            var instance = getInstance();
            instance.put("foo", value);
            return getBuilderAfterFoo(instance);
        }
        
        default T foo(int value) {
            var instance = getInstance();
            instance.put("foo", value);
            return getBuilderAfterFoo(instance);
        }
        
        default T foo(float value) {
            var instance = getInstance();
            instance.put("foo", value);
            return getBuilderAfterFoo(instance);
        }
        
        default T foo(long value) {
            var instance = getInstance();
            instance.put("foo", value);
            return getBuilderAfterFoo(instance);
        }
        
        default T foo(double value) {
            var instance = getInstance();
            instance.put("foo", value);
            return getBuilderAfterFoo(instance);
        }
        
        default T foo(List<?> value) {
            var instance = getInstance();
            instance.put("foo", value);
            return getBuilderAfterFoo(instance);
        }
        
        default T foo(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("foo", value);
            return getBuilderAfterFoo(instance);
        }
    }
    
    public static class DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder extends UnsetAddPropsSetter<DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForFoo<DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "foo"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder getBuilderAfterFoo(Map<String, @Nullable Object> instance) {
            return this;
        }
        public DependentSchemasDependentSubschemaIncompatibleWithRootMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed permits DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid, DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean, DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber, DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString, DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList, DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap {
        @Nullable Object getData();
    }
    
    public record DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid(Void data) implements DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean(boolean data) implements DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber(Number data) implements DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString(String data) implements DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList(FrozenList<@Nullable Object> data) implements DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap(DependentSchemasDependentSubschemaIncompatibleWithRootMap data) implements DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class DependentSchemasDependentSubschemaIncompatibleWithRoot1 extends JsonSchema<DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed> implements NullSchemaValidator<DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid>, BooleanSchemaValidator<DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean>, NumberSchemaValidator<DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber>, StringSchemaValidator<DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString>, ListSchemaValidator<FrozenList<@Nullable Object>, DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList>, MapSchemaValidator<DependentSchemasDependentSubschemaIncompatibleWithRootMap, DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable DependentSchemasDependentSubschemaIncompatibleWithRoot1 instance = null;
    
        protected DependentSchemasDependentSubschemaIncompatibleWithRoot1() {
            super(new JsonSchemaInfo()
                .properties(Map.ofEntries(
                    new PropertyEntry("foo", Foo.class)
                ))
                .dependentSchemas(Map.ofEntries(
                    new PropertyEntry("foo", Foo1.class)
                ))
            );
        }
    
        public static DependentSchemasDependentSubschemaIncompatibleWithRoot1 getInstance() {
            if (instance == null) {
                instance = new DependentSchemasDependentSubschemaIncompatibleWithRoot1();
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
        public DependentSchemasDependentSubschemaIncompatibleWithRootMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new DependentSchemasDependentSubschemaIncompatibleWithRootMap(castProperties);
        }
        
        public DependentSchemasDependentSubschemaIncompatibleWithRootMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return new DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedBoolean(validate(arg, configuration));
        }
        @Override
        public DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedNumber(validate(arg, configuration));
        }
        @Override
        public DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedString(validate(arg, configuration));
        }
        @Override
        public DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedList(validate(arg, configuration));
        }
        @Override
        public DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new DependentSchemasDependentSubschemaIncompatibleWithRoot1BoxedMap(validate(arg, configuration));
        }
        @Override
        public DependentSchemasDependentSubschemaIncompatibleWithRoot1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
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
