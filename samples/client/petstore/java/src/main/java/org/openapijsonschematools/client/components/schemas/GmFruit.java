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
import org.openapijsonschematools.client.schemas.GenericBuilder;
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

public class GmFruit {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Color extends StringJsonSchema {
        private static @Nullable Color instance = null;
        public static Color getInstance() {
            if (instance == null) {
                instance = new Color();
            }
            return instance;
        }
    }
    
    
    public static class GmFruitMap extends FrozenMap<@Nullable Object> {
        protected GmFruitMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "color"
        );
        public static GmFruitMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return GmFruit1.getInstance().validate(arg, configuration);
        }
        
        public String color() throws UnsetPropertyException {
            String key = "color";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for color");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForColor <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterColor(Map<String, @Nullable Object> instance);
        
        default T color(String value) {
            var instance = getInstance();
            instance.put("color", value);
            return getBuilderAfterColor(instance);
        }
    }
    
    public static class GmFruitMapBuilder extends UnsetAddPropsSetter<GmFruitMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForColor<GmFruitMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "color"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public GmFruitMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public GmFruitMapBuilder getBuilderAfterColor(Map<String, @Nullable Object> instance) {
            return this;
        }
        public GmFruitMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class GmFruit1Boxed permits GmFruit1BoxedVoid, GmFruit1BoxedBoolean, GmFruit1BoxedNumber, GmFruit1BoxedString, GmFruit1BoxedList, GmFruit1BoxedMap {}
    public static final class GmFruit1BoxedVoid extends GmFruit1Boxed {
        public final Void data;
        private GmFruit1BoxedVoid(Void data) {
            this.data = data;
        }
    }
    public static final class GmFruit1BoxedBoolean extends GmFruit1Boxed {
        public final boolean data;
        private GmFruit1BoxedBoolean(boolean data) {
            this.data = data;
        }
    }
    public static final class GmFruit1BoxedNumber extends GmFruit1Boxed {
        public final Number data;
        private GmFruit1BoxedNumber(Number data) {
            this.data = data;
        }
    }
    public static final class GmFruit1BoxedString extends GmFruit1Boxed {
        public final String data;
        private GmFruit1BoxedString(String data) {
            this.data = data;
        }
    }
    public static final class GmFruit1BoxedList extends GmFruit1Boxed {
        public final FrozenList<@Nullable Object> data;
        private GmFruit1BoxedList(FrozenList<@Nullable Object> data) {
            this.data = data;
        }
    }
    public static final class GmFruit1BoxedMap extends GmFruit1Boxed {
        public final GmFruitMap data;
        private GmFruit1BoxedMap(GmFruitMap data) {
            this.data = data;
        }
    }
    
    
    public static class GmFruit1 extends JsonSchema implements NullSchemaValidator<GmFruit1BoxedVoid>, BooleanSchemaValidator<GmFruit1BoxedBoolean>, NumberSchemaValidator<GmFruit1BoxedNumber>, StringSchemaValidator<GmFruit1BoxedString>, ListSchemaValidator<FrozenList<@Nullable Object>, GmFruit1BoxedList>, MapSchemaValidator<GmFruitMap, GmFruit1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable GmFruit1 instance = null;
    
        protected GmFruit1() {
            super(new JsonSchemaInfo()
                .properties(Map.ofEntries(
                    new PropertyEntry("color", Color.class)
                ))
                .anyOf(List.of(
                    Apple.Apple1.class,
                    Banana.Banana1.class
                ))
            );
        }
    
        public static GmFruit1 getInstance() {
            if (instance == null) {
                instance = new GmFruit1();
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
        
        public int validate(int arg, SchemaConfiguration configuration) {
            return (int) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) {
            return (long) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) {
            return (float) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) {
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
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
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
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public GmFruitMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new GmFruitMap(castProperties);
        }
        
        public GmFruitMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
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
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public GmFruit1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new GmFruit1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public GmFruit1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new GmFruit1BoxedBoolean(validate(arg, configuration));
        }
        @Override
        public GmFruit1BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new GmFruit1BoxedNumber(validate(arg, configuration));
        }
        @Override
        public GmFruit1BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new GmFruit1BoxedString(validate(arg, configuration));
        }
        @Override
        public GmFruit1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new GmFruit1BoxedList(validate(arg, configuration));
        }
        @Override
        public GmFruit1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new GmFruit1BoxedMap(validate(arg, configuration));
        }
    }
}
