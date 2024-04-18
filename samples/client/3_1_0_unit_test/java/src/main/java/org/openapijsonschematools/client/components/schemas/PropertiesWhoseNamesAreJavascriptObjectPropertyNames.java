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
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
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

public class PropertiesWhoseNamesAreJavascriptObjectPropertyNames {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Proto extends NumberJsonSchema.NumberJsonSchema1 {
        private static @Nullable Proto instance = null;
        public static Proto getInstance() {
            if (instance == null) {
                instance = new Proto();
            }
            return instance;
        }
    }
    
    
    public static class Length extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Length instance = null;
        public static Length getInstance() {
            if (instance == null) {
                instance = new Length();
            }
            return instance;
        }
    }
    
    
    public static class ToStringMap extends FrozenMap<@Nullable Object> {
        protected ToStringMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "length"
        );
        public static ToStringMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ToString.getInstance().validate(arg, configuration);
        }
        
        public String length() throws UnsetPropertyException {
            String key = "length";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for length");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForLength <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterLength(Map<String, @Nullable Object> instance);
        
        default T length(String value) {
            var instance = getInstance();
            instance.put("length", value);
            return getBuilderAfterLength(instance);
        }
    }
    
    public static class ToStringMapBuilder extends UnsetAddPropsSetter<ToStringMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForLength<ToStringMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "length"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ToStringMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ToStringMapBuilder getBuilderAfterLength(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ToStringMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface ToStringBoxed permits ToStringBoxedVoid, ToStringBoxedBoolean, ToStringBoxedNumber, ToStringBoxedString, ToStringBoxedList, ToStringBoxedMap {
        @Nullable Object getData();
    }
    
    public record ToStringBoxedVoid(Void data) implements ToStringBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ToStringBoxedBoolean(boolean data) implements ToStringBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ToStringBoxedNumber(Number data) implements ToStringBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ToStringBoxedString(String data) implements ToStringBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ToStringBoxedList(FrozenList<@Nullable Object> data) implements ToStringBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ToStringBoxedMap(ToStringMap data) implements ToStringBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ToString extends JsonSchema<ToStringBoxed> implements NullSchemaValidator<ToStringBoxedVoid>, BooleanSchemaValidator<ToStringBoxedBoolean>, NumberSchemaValidator<ToStringBoxedNumber>, StringSchemaValidator<ToStringBoxedString>, ListSchemaValidator<FrozenList<@Nullable Object>, ToStringBoxedList>, MapSchemaValidator<ToStringMap, ToStringBoxedMap> {
        private static @Nullable ToString instance = null;
    
        protected ToString() {
            super(new JsonSchemaInfo()
                .properties(Map.ofEntries(
                    new PropertyEntry("length", Length.class)
                ))
            );
        }
    
        public static ToString getInstance() {
            if (instance == null) {
                instance = new ToString();
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
        public ToStringMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ToStringMap(castProperties);
        }
        
        public ToStringMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public ToStringBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new ToStringBoxedVoid(validate(arg, configuration));
        }
        @Override
        public ToStringBoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return new ToStringBoxedBoolean(validate(arg, configuration));
        }
        @Override
        public ToStringBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new ToStringBoxedNumber(validate(arg, configuration));
        }
        @Override
        public ToStringBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new ToStringBoxedString(validate(arg, configuration));
        }
        @Override
        public ToStringBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ToStringBoxedList(validate(arg, configuration));
        }
        @Override
        public ToStringBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ToStringBoxedMap(validate(arg, configuration));
        }
        @Override
        public ToStringBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
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
    
    public static class Constructor extends NumberJsonSchema.NumberJsonSchema1 {
        private static @Nullable Constructor instance = null;
        public static Constructor getInstance() {
            if (instance == null) {
                instance = new Constructor();
            }
            return instance;
        }
    }
    
    
    public static class PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap extends FrozenMap<@Nullable Object> {
        protected PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "__proto__",
            "toString",
            "constructor"
        );
        public static PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object toString() throws UnsetPropertyException {
            String key = "toString";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Object)) {
                throw new RuntimeException("Invalid value stored for toString");
            }
            return (@Nullable Object) value;
        }
        
        public Number constructor() throws UnsetPropertyException {
            String key = "constructor";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for constructor");
            }
            return (Number) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForProto <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterProto(Map<String, @Nullable Object> instance);
        
        default T lowLineProto(int value) {
            var instance = getInstance();
            instance.put("__proto__", value);
            return getBuilderAfterProto(instance);
        }
        
        default T lowLineProto(float value) {
            var instance = getInstance();
            instance.put("__proto__", value);
            return getBuilderAfterProto(instance);
        }
        
        default T lowLineProto(long value) {
            var instance = getInstance();
            instance.put("__proto__", value);
            return getBuilderAfterProto(instance);
        }
        
        default T lowLineProto(double value) {
            var instance = getInstance();
            instance.put("__proto__", value);
            return getBuilderAfterProto(instance);
        }
    }
    
    public interface SetterForToString <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterToString(Map<String, @Nullable Object> instance);
        
        default T toString(Void value) {
            var instance = getInstance();
            instance.put("toString", null);
            return getBuilderAfterToString(instance);
        }
        
        default T toString(boolean value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToString(instance);
        }
        
        default T toString(String value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToString(instance);
        }
        
        default T toString(int value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToString(instance);
        }
        
        default T toString(float value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToString(instance);
        }
        
        default T toString(long value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToString(instance);
        }
        
        default T toString(double value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToString(instance);
        }
        
        default T toString(List<?> value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToString(instance);
        }
        
        default T toString(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToString(instance);
        }
    }
    
    public interface SetterForConstructor <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterConstructor(Map<String, @Nullable Object> instance);
        
        default T constructor(int value) {
            var instance = getInstance();
            instance.put("constructor", value);
            return getBuilderAfterConstructor(instance);
        }
        
        default T constructor(float value) {
            var instance = getInstance();
            instance.put("constructor", value);
            return getBuilderAfterConstructor(instance);
        }
        
        default T constructor(long value) {
            var instance = getInstance();
            instance.put("constructor", value);
            return getBuilderAfterConstructor(instance);
        }
        
        default T constructor(double value) {
            var instance = getInstance();
            instance.put("constructor", value);
            return getBuilderAfterConstructor(instance);
        }
    }
    
    public static class PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder extends UnsetAddPropsSetter<PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForProto<PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder>, SetterForToString<PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder>, SetterForConstructor<PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "__proto__",
            "toString",
            "constructor"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder getBuilderAfterProto(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder getBuilderAfterToString(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder getBuilderAfterConstructor(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed permits PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid, PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean, PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber, PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString, PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList, PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap {
        @Nullable Object getData();
    }
    
    public record PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid(Void data) implements PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean(boolean data) implements PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber(Number data) implements PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString(String data) implements PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList(FrozenList<@Nullable Object> data) implements PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap(PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap data) implements PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1 extends JsonSchema<PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed> implements NullSchemaValidator<PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid>, BooleanSchemaValidator<PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean>, NumberSchemaValidator<PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber>, StringSchemaValidator<PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString>, ListSchemaValidator<FrozenList<@Nullable Object>, PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList>, MapSchemaValidator<PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap, PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable PropertiesWhoseNamesAreJavascriptObjectPropertyNames1 instance = null;
    
        protected PropertiesWhoseNamesAreJavascriptObjectPropertyNames1() {
            super(new JsonSchemaInfo()
                .properties(Map.ofEntries(
                    new PropertyEntry("__proto__", Proto.class),
                    new PropertyEntry("toString", ToString.class),
                    new PropertyEntry("constructor", Constructor.class)
                ))
            );
        }
    
        public static PropertiesWhoseNamesAreJavascriptObjectPropertyNames1 getInstance() {
            if (instance == null) {
                instance = new PropertiesWhoseNamesAreJavascriptObjectPropertyNames1();
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
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap(castProperties);
        }
        
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return new PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean(validate(arg, configuration));
        }
        @Override
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber(validate(arg, configuration));
        }
        @Override
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString(validate(arg, configuration));
        }
        @Override
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList(validate(arg, configuration));
        }
        @Override
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap(validate(arg, configuration));
        }
        @Override
        public PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
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
