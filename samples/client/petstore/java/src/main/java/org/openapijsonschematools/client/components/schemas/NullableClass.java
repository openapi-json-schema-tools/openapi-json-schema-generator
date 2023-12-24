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
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class NullableClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties3 extends JsonSchema implements NullSchemaValidator, MapSchemaValidator<FrozenMap<@Nullable Object>> {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return castProperties;
        }
        
        public FrozenMap<@Nullable Object> validate(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class IntegerProp extends JsonSchema implements NullSchemaValidator, NumberSchemaValidator {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class NumberProp extends JsonSchema implements NullSchemaValidator, NumberSchemaValidator {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class BooleanProp extends JsonSchema implements NullSchemaValidator, BooleanSchemaValidator {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return getNewInstance(boolArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class StringProp extends JsonSchema implements NullSchemaValidator, StringSchemaValidator {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class DateProp extends JsonSchema implements NullSchemaValidator, StringSchemaValidator {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class DatetimeProp extends JsonSchema implements NullSchemaValidator, StringSchemaValidator {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class Items extends MapJsonSchema {
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
    
    public static class ArrayNullablePropListInput {
        // class to build List<Map<String, ? extends @Nullable Object>>
    }
    
    
    public static class ArrayNullableProp extends JsonSchema implements NullSchemaValidator, ListSchemaValidator<ArrayNullablePropList> {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
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
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof FrozenMap<?>)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((FrozenMap<?>) itemInstance);
                i += 1;
            }
            FrozenList<FrozenMap<?>> newInstanceItems = new FrozenList<>(items);
            return new ArrayNullablePropList(newInstanceItems);
        }
        
        public ArrayNullablePropList validate(List<Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class Items1 extends JsonSchema implements NullSchemaValidator, MapSchemaValidator<FrozenMap<@Nullable Object>> {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return castProperties;
        }
        
        public FrozenMap<@Nullable Object> validate(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
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
    
    public static class ArrayAndItemsNullablePropListInput {
        // class to build List<? extends @Nullable Map<String, ? extends @Nullable Object>>
    }
    
    
    public static class ArrayAndItemsNullableProp extends JsonSchema implements NullSchemaValidator, ListSchemaValidator<ArrayAndItemsNullablePropList> {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
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
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance == null || itemInstance instanceof FrozenMap<?>)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((@Nullable FrozenMap<?>) itemInstance);
                i += 1;
            }
            FrozenList<@Nullable FrozenMap<?>> newInstanceItems = new FrozenList<>(items);
            return new ArrayAndItemsNullablePropList(newInstanceItems);
        }
        
        public ArrayAndItemsNullablePropList validate(List<? extends @Nullable Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class Items2 extends JsonSchema implements NullSchemaValidator, MapSchemaValidator<FrozenMap<@Nullable Object>> {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return castProperties;
        }
        
        public FrozenMap<@Nullable Object> validate(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
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
    
    public static class ArrayItemsNullableListInput {
        // class to build List<? extends @Nullable Map<String, ? extends @Nullable Object>>
    }
    
    
    public static class ArrayItemsNullable extends JsonSchema implements ListSchemaValidator<ArrayItemsNullableList> {
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
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance == null || itemInstance instanceof FrozenMap<?>)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((@Nullable FrozenMap<?>) itemInstance);
                i += 1;
            }
            FrozenList<@Nullable FrozenMap<?>> newInstanceItems = new FrozenList<>(items);
            return new ArrayItemsNullableList(newInstanceItems);
        }
        
        public ArrayItemsNullableList validate(List<? extends @Nullable Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class AdditionalProperties extends MapJsonSchema {
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
    public static class ObjectNullablePropMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class ObjectNullableProp extends JsonSchema implements NullSchemaValidator, MapSchemaValidator<ObjectNullablePropMap> {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public ObjectNullablePropMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, FrozenMap<?>> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof FrozenMap<?>)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (FrozenMap<?>) propertyInstance);
            }
            FrozenMap<FrozenMap<?>> castProperties = new FrozenMap<>(properties);
            return new ObjectNullablePropMap(castProperties);
        }
        
        public ObjectNullablePropMap validate(Map<String, Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class AdditionalProperties1 extends JsonSchema implements NullSchemaValidator, MapSchemaValidator<FrozenMap<@Nullable Object>> {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return castProperties;
        }
        
        public FrozenMap<@Nullable Object> validate(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
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
    public static class ObjectAndItemsNullablePropMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class ObjectAndItemsNullableProp extends JsonSchema implements NullSchemaValidator, MapSchemaValidator<ObjectAndItemsNullablePropMap> {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public ObjectAndItemsNullablePropMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable FrozenMap<?>> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance == null || propertyInstance instanceof FrozenMap<?>)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (@Nullable FrozenMap<?>) propertyInstance);
            }
            FrozenMap<@Nullable FrozenMap<?>> castProperties = new FrozenMap<>(properties);
            return new ObjectAndItemsNullablePropMap(castProperties);
        }
        
        public ObjectAndItemsNullablePropMap validate(Map<String, ? extends @Nullable Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class AdditionalProperties2 extends JsonSchema implements NullSchemaValidator, MapSchemaValidator<FrozenMap<@Nullable Object>> {
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return castProperties;
        }
        
        public FrozenMap<@Nullable Object> validate(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
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
    public static class ObjectItemsNullableMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class ObjectItemsNullable extends JsonSchema implements MapSchemaValidator<ObjectItemsNullableMap> {
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
                if (!(propertyInstance == null || propertyInstance instanceof FrozenMap<?>)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (@Nullable FrozenMap<?>) propertyInstance);
            }
            FrozenMap<@Nullable FrozenMap<?>> castProperties = new FrozenMap<>(properties);
            return new ObjectItemsNullableMap(castProperties);
        }
        
        public ObjectItemsNullableMap validate(Map<String, ? extends @Nullable Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
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
        
        public @Nullable Long integer_prop() throws UnsetPropertyException {
            String key = "integer_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof Long)) {
                throw new InvalidTypeException("Invalid value stored for integer_prop");
            }
            return (@Nullable Long) value;
        }
        
        public @Nullable Number number_prop() throws UnsetPropertyException {
            String key = "number_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for number_prop");
            }
            return (@Nullable Number) value;
        }
        
        public @Nullable Boolean boolean_prop() throws UnsetPropertyException {
            String key = "boolean_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof Boolean)) {
                throw new InvalidTypeException("Invalid value stored for boolean_prop");
            }
            return (@Nullable Boolean) value;
        }
        
        public @Nullable String string_prop() throws UnsetPropertyException {
            String key = "string_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for string_prop");
            }
            return (@Nullable String) value;
        }
        
        public @Nullable String date_prop() throws UnsetPropertyException {
            String key = "date_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for date_prop");
            }
            return (@Nullable String) value;
        }
        
        public @Nullable String datetime_prop() throws UnsetPropertyException {
            String key = "datetime_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for datetime_prop");
            }
            return (@Nullable String) value;
        }
        
        public @Nullable ArrayNullablePropList array_nullable_prop() throws UnsetPropertyException {
            String key = "array_nullable_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof ArrayNullablePropList)) {
                throw new InvalidTypeException("Invalid value stored for array_nullable_prop");
            }
            return (@Nullable ArrayNullablePropList) value;
        }
        
        public @Nullable ArrayAndItemsNullablePropList array_and_items_nullable_prop() throws UnsetPropertyException {
            String key = "array_and_items_nullable_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof ArrayAndItemsNullablePropList)) {
                throw new InvalidTypeException("Invalid value stored for array_and_items_nullable_prop");
            }
            return (@Nullable ArrayAndItemsNullablePropList) value;
        }
        
        public ArrayItemsNullableList array_items_nullable() throws UnsetPropertyException {
            String key = "array_items_nullable";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof ArrayItemsNullableList)) {
                throw new InvalidTypeException("Invalid value stored for array_items_nullable");
            }
            return (ArrayItemsNullableList) value;
        }
        
        public @Nullable ObjectNullablePropMap object_nullable_prop() throws UnsetPropertyException {
            String key = "object_nullable_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof ObjectNullablePropMap)) {
                throw new InvalidTypeException("Invalid value stored for object_nullable_prop");
            }
            return (@Nullable ObjectNullablePropMap) value;
        }
        
        public @Nullable ObjectAndItemsNullablePropMap object_and_items_nullable_prop() throws UnsetPropertyException {
            String key = "object_and_items_nullable_prop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof ObjectAndItemsNullablePropMap)) {
                throw new InvalidTypeException("Invalid value stored for object_and_items_nullable_prop");
            }
            return (@Nullable ObjectAndItemsNullablePropMap) value;
        }
        
        public ObjectItemsNullableMap object_items_nullable() throws UnsetPropertyException {
            String key = "object_items_nullable";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof ObjectItemsNullableMap)) {
                throw new InvalidTypeException("Invalid value stored for object_items_nullable");
            }
            return (ObjectItemsNullableMap) value;
        }
        
        public @Nullable FrozenMap<?> getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            var value = getOrThrow(name);
            if (!(value == null || value instanceof FrozenMap<?>)) {
                throw new InvalidTypeException("Invalid value stored for " + name);
            }
            return (@Nullable FrozenMap<?>) value;
        }
    }
    public static class NullableClassMapInput {
        // optionalProperties + additionalProperties
    }
    
    
    public static class NullableClass1 extends JsonSchema implements MapSchemaValidator<NullableClassMap> {
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
                if (!(propertyInstance == null || propertyInstance instanceof Object)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (@Nullable Object) propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new NullableClassMap(castProperties);
        }
        
        public NullableClassMap validate(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }

}
