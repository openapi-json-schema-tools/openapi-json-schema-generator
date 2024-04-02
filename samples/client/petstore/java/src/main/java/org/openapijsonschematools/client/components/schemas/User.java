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
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.Int32JsonSchema;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.NullJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
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

public class User {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Id extends Int64JsonSchema.Int64JsonSchema1 {
        private static @Nullable Id instance = null;
        public static Id getInstance() {
            if (instance == null) {
                instance = new Id();
            }
            return instance;
        }
    }
    
    
    public static class Username extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Username instance = null;
        public static Username getInstance() {
            if (instance == null) {
                instance = new Username();
            }
            return instance;
        }
    }
    
    
    public static class FirstName extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable FirstName instance = null;
        public static FirstName getInstance() {
            if (instance == null) {
                instance = new FirstName();
            }
            return instance;
        }
    }
    
    
    public static class LastName extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable LastName instance = null;
        public static LastName getInstance() {
            if (instance == null) {
                instance = new LastName();
            }
            return instance;
        }
    }
    
    
    public static class Email extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Email instance = null;
        public static Email getInstance() {
            if (instance == null) {
                instance = new Email();
            }
            return instance;
        }
    }
    
    
    public static class Password extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Password instance = null;
        public static Password getInstance() {
            if (instance == null) {
                instance = new Password();
            }
            return instance;
        }
    }
    
    
    public static class Phone extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Phone instance = null;
        public static Phone getInstance() {
            if (instance == null) {
                instance = new Phone();
            }
            return instance;
        }
    }
    
    
    public static class UserStatus extends Int32JsonSchema.Int32JsonSchema1 {
        private static @Nullable UserStatus instance = null;
        public static UserStatus getInstance() {
            if (instance == null) {
                instance = new UserStatus();
            }
            return instance;
        }
    }
    
    
    public static class ObjectWithNoDeclaredProps extends MapJsonSchema.MapJsonSchema1 {
        private static @Nullable ObjectWithNoDeclaredProps instance = null;
        public static ObjectWithNoDeclaredProps getInstance() {
            if (instance == null) {
                instance = new ObjectWithNoDeclaredProps();
            }
            return instance;
        }
    }
    
    
    public sealed interface ObjectWithNoDeclaredPropsNullableBoxed permits ObjectWithNoDeclaredPropsNullableBoxedVoid, ObjectWithNoDeclaredPropsNullableBoxedMap {
        @Nullable Object getData();
    }
    
    public record ObjectWithNoDeclaredPropsNullableBoxedVoid(Void data) implements ObjectWithNoDeclaredPropsNullableBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ObjectWithNoDeclaredPropsNullableBoxedMap(FrozenMap<@Nullable Object> data) implements ObjectWithNoDeclaredPropsNullableBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ObjectWithNoDeclaredPropsNullable extends JsonSchema<ObjectWithNoDeclaredPropsNullableBoxed> implements NullSchemaValidator<ObjectWithNoDeclaredPropsNullableBoxedVoid>, MapSchemaValidator<FrozenMap<@Nullable Object>, ObjectWithNoDeclaredPropsNullableBoxedMap> {
        private static @Nullable ObjectWithNoDeclaredPropsNullable instance = null;
    
        protected ObjectWithNoDeclaredPropsNullable() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    Map.class
                ))
            );
        }
    
        public static ObjectWithNoDeclaredPropsNullable getInstance() {
            if (instance == null) {
                instance = new ObjectWithNoDeclaredPropsNullable();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        
        public FrozenMap<@Nullable Object> validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
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
        public ObjectWithNoDeclaredPropsNullableBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ObjectWithNoDeclaredPropsNullableBoxedVoid(validate(arg, configuration));
        }
        @Override
        public ObjectWithNoDeclaredPropsNullableBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ObjectWithNoDeclaredPropsNullableBoxedMap(validate(arg, configuration));
        }
        @Override
        public ObjectWithNoDeclaredPropsNullableBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class AnyTypeProp extends AnyTypeJsonSchema.AnyTypeJsonSchema1 {
        private static @Nullable AnyTypeProp instance = null;
        public static AnyTypeProp getInstance() {
            if (instance == null) {
                instance = new AnyTypeProp();
            }
            return instance;
        }
    }
    
    
    public static class Not extends NullJsonSchema.NullJsonSchema1 {
        private static @Nullable Not instance = null;
        public static Not getInstance() {
            if (instance == null) {
                instance = new Not();
            }
            return instance;
        }
    }
    
    
    public sealed interface AnyTypeExceptNullPropBoxed permits AnyTypeExceptNullPropBoxedVoid, AnyTypeExceptNullPropBoxedBoolean, AnyTypeExceptNullPropBoxedNumber, AnyTypeExceptNullPropBoxedString, AnyTypeExceptNullPropBoxedList, AnyTypeExceptNullPropBoxedMap {
        @Nullable Object getData();
    }
    
    public record AnyTypeExceptNullPropBoxedVoid(Void data) implements AnyTypeExceptNullPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record AnyTypeExceptNullPropBoxedBoolean(boolean data) implements AnyTypeExceptNullPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record AnyTypeExceptNullPropBoxedNumber(Number data) implements AnyTypeExceptNullPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record AnyTypeExceptNullPropBoxedString(String data) implements AnyTypeExceptNullPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record AnyTypeExceptNullPropBoxedList(FrozenList<@Nullable Object> data) implements AnyTypeExceptNullPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record AnyTypeExceptNullPropBoxedMap(FrozenMap<@Nullable Object> data) implements AnyTypeExceptNullPropBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class AnyTypeExceptNullProp extends JsonSchema<AnyTypeExceptNullPropBoxed> implements NullSchemaValidator<AnyTypeExceptNullPropBoxedVoid>, BooleanSchemaValidator<AnyTypeExceptNullPropBoxedBoolean>, NumberSchemaValidator<AnyTypeExceptNullPropBoxedNumber>, StringSchemaValidator<AnyTypeExceptNullPropBoxedString>, ListSchemaValidator<FrozenList<@Nullable Object>, AnyTypeExceptNullPropBoxedList>, MapSchemaValidator<FrozenMap<@Nullable Object>, AnyTypeExceptNullPropBoxedMap> {
        private static @Nullable AnyTypeExceptNullProp instance = null;
    
        protected AnyTypeExceptNullProp() {
            super(new JsonSchemaInfo()
                .not(Not.class)
            );
        }
    
        public static AnyTypeExceptNullProp getInstance() {
            if (instance == null) {
                instance = new AnyTypeExceptNullProp();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
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
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        
        public FrozenList<@Nullable Object> validate(List<?> arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
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
        
        public FrozenMap<@Nullable Object> validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
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
        public AnyTypeExceptNullPropBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AnyTypeExceptNullPropBoxedVoid(validate(arg, configuration));
        }
        @Override
        public AnyTypeExceptNullPropBoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AnyTypeExceptNullPropBoxedBoolean(validate(arg, configuration));
        }
        @Override
        public AnyTypeExceptNullPropBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AnyTypeExceptNullPropBoxedNumber(validate(arg, configuration));
        }
        @Override
        public AnyTypeExceptNullPropBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AnyTypeExceptNullPropBoxedString(validate(arg, configuration));
        }
        @Override
        public AnyTypeExceptNullPropBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AnyTypeExceptNullPropBoxedList(validate(arg, configuration));
        }
        @Override
        public AnyTypeExceptNullPropBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AnyTypeExceptNullPropBoxedMap(validate(arg, configuration));
        }
        @Override
        public AnyTypeExceptNullPropBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class AnyTypePropNullable extends AnyTypeJsonSchema.AnyTypeJsonSchema1 {
        private static @Nullable AnyTypePropNullable instance = null;
        public static AnyTypePropNullable getInstance() {
            if (instance == null) {
                instance = new AnyTypePropNullable();
            }
            return instance;
        }
    }
    
    
    public static class UserMap extends FrozenMap<@Nullable Object> {
        protected UserMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "id",
            "username",
            "firstName",
            "lastName",
            "email",
            "password",
            "phone",
            "userStatus",
            "objectWithNoDeclaredProps",
            "objectWithNoDeclaredPropsNullable",
            "anyTypeProp",
            "anyTypeExceptNullProp",
            "anyTypePropNullable"
        );
        public static UserMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return User1.getInstance().validate(arg, configuration);
        }
        
        public Number id() throws UnsetPropertyException {
            String key = "id";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for id");
            }
            return (Number) value;
        }
        
        public String username() throws UnsetPropertyException {
            String key = "username";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for username");
            }
            return (String) value;
        }
        
        public String firstName() throws UnsetPropertyException {
            String key = "firstName";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for firstName");
            }
            return (String) value;
        }
        
        public String lastName() throws UnsetPropertyException {
            String key = "lastName";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for lastName");
            }
            return (String) value;
        }
        
        public String email() throws UnsetPropertyException {
            String key = "email";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for email");
            }
            return (String) value;
        }
        
        public String password() throws UnsetPropertyException {
            String key = "password";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for password");
            }
            return (String) value;
        }
        
        public String phone() throws UnsetPropertyException {
            String key = "phone";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for phone");
            }
            return (String) value;
        }
        
        public Number userStatus() throws UnsetPropertyException {
            String key = "userStatus";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for userStatus");
            }
            return (Number) value;
        }
        
        public FrozenMap<?> objectWithNoDeclaredProps() throws UnsetPropertyException {
            String key = "objectWithNoDeclaredProps";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof FrozenMap<?>)) {
                throw new RuntimeException("Invalid value stored for objectWithNoDeclaredProps");
            }
            return (FrozenMap<?>) value;
        }
        
        public @Nullable FrozenMap<?> objectWithNoDeclaredPropsNullable() throws UnsetPropertyException {
            String key = "objectWithNoDeclaredPropsNullable";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof FrozenMap<?>)) {
                throw new RuntimeException("Invalid value stored for objectWithNoDeclaredPropsNullable");
            }
            return (@Nullable FrozenMap<?>) value;
        }
        
        public @Nullable Object anyTypeProp() throws UnsetPropertyException {
            return getOrThrow("anyTypeProp");
        }
        
        public @Nullable Object anyTypeExceptNullProp() throws UnsetPropertyException {
            return getOrThrow("anyTypeExceptNullProp");
        }
        
        public @Nullable Object anyTypePropNullable() throws UnsetPropertyException {
            return getOrThrow("anyTypePropNullable");
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForId <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterId(Map<String, @Nullable Object> instance);
        
        default T id(int value) {
            var instance = getInstance();
            instance.put("id", value);
            return getBuilderAfterId(instance);
        }
        
        default T id(float value) {
            var instance = getInstance();
            instance.put("id", value);
            return getBuilderAfterId(instance);
        }
        
        default T id(long value) {
            var instance = getInstance();
            instance.put("id", value);
            return getBuilderAfterId(instance);
        }
        
        default T id(double value) {
            var instance = getInstance();
            instance.put("id", value);
            return getBuilderAfterId(instance);
        }
    }
    
    public interface SetterForUsername <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterUsername(Map<String, @Nullable Object> instance);
        
        default T username(String value) {
            var instance = getInstance();
            instance.put("username", value);
            return getBuilderAfterUsername(instance);
        }
    }
    
    public interface SetterForFirstName <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFirstName(Map<String, @Nullable Object> instance);
        
        default T firstName(String value) {
            var instance = getInstance();
            instance.put("firstName", value);
            return getBuilderAfterFirstName(instance);
        }
    }
    
    public interface SetterForLastName <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterLastName(Map<String, @Nullable Object> instance);
        
        default T lastName(String value) {
            var instance = getInstance();
            instance.put("lastName", value);
            return getBuilderAfterLastName(instance);
        }
    }
    
    public interface SetterForEmail <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterEmail(Map<String, @Nullable Object> instance);
        
        default T email(String value) {
            var instance = getInstance();
            instance.put("email", value);
            return getBuilderAfterEmail(instance);
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
    
    public interface SetterForPhone <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterPhone(Map<String, @Nullable Object> instance);
        
        default T phone(String value) {
            var instance = getInstance();
            instance.put("phone", value);
            return getBuilderAfterPhone(instance);
        }
    }
    
    public interface SetterForUserStatus <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterUserStatus(Map<String, @Nullable Object> instance);
        
        default T userStatus(int value) {
            var instance = getInstance();
            instance.put("userStatus", value);
            return getBuilderAfterUserStatus(instance);
        }
        
        default T userStatus(float value) {
            var instance = getInstance();
            instance.put("userStatus", value);
            return getBuilderAfterUserStatus(instance);
        }
    }
    
    public interface SetterForObjectWithNoDeclaredProps <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterObjectWithNoDeclaredProps(Map<String, @Nullable Object> instance);
        
        default T objectWithNoDeclaredProps(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("objectWithNoDeclaredProps", value);
            return getBuilderAfterObjectWithNoDeclaredProps(instance);
        }
    }
    
    public interface SetterForObjectWithNoDeclaredPropsNullable <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterObjectWithNoDeclaredPropsNullable(Map<String, @Nullable Object> instance);
        
        default T objectWithNoDeclaredPropsNullable(Void value) {
            var instance = getInstance();
            instance.put("objectWithNoDeclaredPropsNullable", null);
            return getBuilderAfterObjectWithNoDeclaredPropsNullable(instance);
        }
        
        default T objectWithNoDeclaredPropsNullable(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("objectWithNoDeclaredPropsNullable", value);
            return getBuilderAfterObjectWithNoDeclaredPropsNullable(instance);
        }
    }
    
    public interface SetterForAnyTypeProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAnyTypeProp(Map<String, @Nullable Object> instance);
        
        default T anyTypeProp(Void value) {
            var instance = getInstance();
            instance.put("anyTypeProp", null);
            return getBuilderAfterAnyTypeProp(instance);
        }
        
        default T anyTypeProp(boolean value) {
            var instance = getInstance();
            instance.put("anyTypeProp", value);
            return getBuilderAfterAnyTypeProp(instance);
        }
        
        default T anyTypeProp(String value) {
            var instance = getInstance();
            instance.put("anyTypeProp", value);
            return getBuilderAfterAnyTypeProp(instance);
        }
        
        default T anyTypeProp(int value) {
            var instance = getInstance();
            instance.put("anyTypeProp", value);
            return getBuilderAfterAnyTypeProp(instance);
        }
        
        default T anyTypeProp(float value) {
            var instance = getInstance();
            instance.put("anyTypeProp", value);
            return getBuilderAfterAnyTypeProp(instance);
        }
        
        default T anyTypeProp(long value) {
            var instance = getInstance();
            instance.put("anyTypeProp", value);
            return getBuilderAfterAnyTypeProp(instance);
        }
        
        default T anyTypeProp(double value) {
            var instance = getInstance();
            instance.put("anyTypeProp", value);
            return getBuilderAfterAnyTypeProp(instance);
        }
        
        default T anyTypeProp(List<?> value) {
            var instance = getInstance();
            instance.put("anyTypeProp", value);
            return getBuilderAfterAnyTypeProp(instance);
        }
        
        default T anyTypeProp(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("anyTypeProp", value);
            return getBuilderAfterAnyTypeProp(instance);
        }
    }
    
    public interface SetterForAnyTypeExceptNullProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAnyTypeExceptNullProp(Map<String, @Nullable Object> instance);
        
        default T anyTypeExceptNullProp(Void value) {
            var instance = getInstance();
            instance.put("anyTypeExceptNullProp", null);
            return getBuilderAfterAnyTypeExceptNullProp(instance);
        }
        
        default T anyTypeExceptNullProp(boolean value) {
            var instance = getInstance();
            instance.put("anyTypeExceptNullProp", value);
            return getBuilderAfterAnyTypeExceptNullProp(instance);
        }
        
        default T anyTypeExceptNullProp(String value) {
            var instance = getInstance();
            instance.put("anyTypeExceptNullProp", value);
            return getBuilderAfterAnyTypeExceptNullProp(instance);
        }
        
        default T anyTypeExceptNullProp(int value) {
            var instance = getInstance();
            instance.put("anyTypeExceptNullProp", value);
            return getBuilderAfterAnyTypeExceptNullProp(instance);
        }
        
        default T anyTypeExceptNullProp(float value) {
            var instance = getInstance();
            instance.put("anyTypeExceptNullProp", value);
            return getBuilderAfterAnyTypeExceptNullProp(instance);
        }
        
        default T anyTypeExceptNullProp(long value) {
            var instance = getInstance();
            instance.put("anyTypeExceptNullProp", value);
            return getBuilderAfterAnyTypeExceptNullProp(instance);
        }
        
        default T anyTypeExceptNullProp(double value) {
            var instance = getInstance();
            instance.put("anyTypeExceptNullProp", value);
            return getBuilderAfterAnyTypeExceptNullProp(instance);
        }
        
        default T anyTypeExceptNullProp(List<?> value) {
            var instance = getInstance();
            instance.put("anyTypeExceptNullProp", value);
            return getBuilderAfterAnyTypeExceptNullProp(instance);
        }
        
        default T anyTypeExceptNullProp(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("anyTypeExceptNullProp", value);
            return getBuilderAfterAnyTypeExceptNullProp(instance);
        }
    }
    
    public interface SetterForAnyTypePropNullable <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAnyTypePropNullable(Map<String, @Nullable Object> instance);
        
        default T anyTypePropNullable(Void value) {
            var instance = getInstance();
            instance.put("anyTypePropNullable", null);
            return getBuilderAfterAnyTypePropNullable(instance);
        }
        
        default T anyTypePropNullable(boolean value) {
            var instance = getInstance();
            instance.put("anyTypePropNullable", value);
            return getBuilderAfterAnyTypePropNullable(instance);
        }
        
        default T anyTypePropNullable(String value) {
            var instance = getInstance();
            instance.put("anyTypePropNullable", value);
            return getBuilderAfterAnyTypePropNullable(instance);
        }
        
        default T anyTypePropNullable(int value) {
            var instance = getInstance();
            instance.put("anyTypePropNullable", value);
            return getBuilderAfterAnyTypePropNullable(instance);
        }
        
        default T anyTypePropNullable(float value) {
            var instance = getInstance();
            instance.put("anyTypePropNullable", value);
            return getBuilderAfterAnyTypePropNullable(instance);
        }
        
        default T anyTypePropNullable(long value) {
            var instance = getInstance();
            instance.put("anyTypePropNullable", value);
            return getBuilderAfterAnyTypePropNullable(instance);
        }
        
        default T anyTypePropNullable(double value) {
            var instance = getInstance();
            instance.put("anyTypePropNullable", value);
            return getBuilderAfterAnyTypePropNullable(instance);
        }
        
        default T anyTypePropNullable(List<?> value) {
            var instance = getInstance();
            instance.put("anyTypePropNullable", value);
            return getBuilderAfterAnyTypePropNullable(instance);
        }
        
        default T anyTypePropNullable(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("anyTypePropNullable", value);
            return getBuilderAfterAnyTypePropNullable(instance);
        }
    }
    
    public static class UserMapBuilder extends UnsetAddPropsSetter<UserMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForId<UserMapBuilder>, SetterForUsername<UserMapBuilder>, SetterForFirstName<UserMapBuilder>, SetterForLastName<UserMapBuilder>, SetterForEmail<UserMapBuilder>, SetterForPassword<UserMapBuilder>, SetterForPhone<UserMapBuilder>, SetterForUserStatus<UserMapBuilder>, SetterForObjectWithNoDeclaredProps<UserMapBuilder>, SetterForObjectWithNoDeclaredPropsNullable<UserMapBuilder>, SetterForAnyTypeProp<UserMapBuilder>, SetterForAnyTypeExceptNullProp<UserMapBuilder>, SetterForAnyTypePropNullable<UserMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "id",
            "username",
            "firstName",
            "lastName",
            "email",
            "password",
            "phone",
            "userStatus",
            "objectWithNoDeclaredProps",
            "objectWithNoDeclaredPropsNullable",
            "anyTypeProp",
            "anyTypeExceptNullProp",
            "anyTypePropNullable"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public UserMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public UserMapBuilder getBuilderAfterId(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterUsername(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterFirstName(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterLastName(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterEmail(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterPassword(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterPhone(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterUserStatus(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterObjectWithNoDeclaredProps(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterObjectWithNoDeclaredPropsNullable(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterAnyTypeProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterAnyTypeExceptNullProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterAnyTypePropNullable(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UserMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface User1Boxed permits User1BoxedMap {
        @Nullable Object getData();
    }
    
    public record User1BoxedMap(UserMap data) implements User1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class User1 extends JsonSchema<User1Boxed> implements MapSchemaValidator<UserMap, User1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable User1 instance = null;
    
        protected User1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("id", Id.class),
                    new PropertyEntry("username", Username.class),
                    new PropertyEntry("firstName", FirstName.class),
                    new PropertyEntry("lastName", LastName.class),
                    new PropertyEntry("email", Email.class),
                    new PropertyEntry("password", Password.class),
                    new PropertyEntry("phone", Phone.class),
                    new PropertyEntry("userStatus", UserStatus.class),
                    new PropertyEntry("objectWithNoDeclaredProps", ObjectWithNoDeclaredProps.class),
                    new PropertyEntry("objectWithNoDeclaredPropsNullable", ObjectWithNoDeclaredPropsNullable.class),
                    new PropertyEntry("anyTypeProp", AnyTypeProp.class),
                    new PropertyEntry("anyTypeExceptNullProp", AnyTypeExceptNullProp.class),
                    new PropertyEntry("anyTypePropNullable", AnyTypePropNullable.class)
                ))
            );
        }
    
        public static User1 getInstance() {
            if (instance == null) {
                instance = new User1();
            }
            return instance;
        }
        
        public UserMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new UserMap(castProperties);
        }
        
        public UserMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public User1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new User1BoxedMap(validate(arg, configuration));
        }
        @Override
        public User1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
