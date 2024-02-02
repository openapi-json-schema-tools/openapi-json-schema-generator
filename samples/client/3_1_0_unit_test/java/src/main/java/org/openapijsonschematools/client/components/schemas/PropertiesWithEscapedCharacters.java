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
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
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

public class PropertiesWithEscapedCharacters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Foonbar extends NumberJsonSchema {
        private static @Nullable Foonbar instance = null;
        public static Foonbar getInstance() {
            if (instance == null) {
                instance = new Foonbar();
            }
            return instance;
        }
    }
    
    
    public static class Foobar extends NumberJsonSchema {
        private static @Nullable Foobar instance = null;
        public static Foobar getInstance() {
            if (instance == null) {
                instance = new Foobar();
            }
            return instance;
        }
    }
    
    
    public static class Foobar1 extends NumberJsonSchema {
        private static @Nullable Foobar1 instance = null;
        public static Foobar1 getInstance() {
            if (instance == null) {
                instance = new Foobar1();
            }
            return instance;
        }
    }
    
    
    public static class Foorbar extends NumberJsonSchema {
        private static @Nullable Foorbar instance = null;
        public static Foorbar getInstance() {
            if (instance == null) {
                instance = new Foorbar();
            }
            return instance;
        }
    }
    
    
    public static class Footbar extends NumberJsonSchema {
        private static @Nullable Footbar instance = null;
        public static Footbar getInstance() {
            if (instance == null) {
                instance = new Footbar();
            }
            return instance;
        }
    }
    
    
    public static class Foofbar extends NumberJsonSchema {
        private static @Nullable Foofbar instance = null;
        public static Foofbar getInstance() {
            if (instance == null) {
                instance = new Foofbar();
            }
            return instance;
        }
    }
    
    
    public static class PropertiesWithEscapedCharactersMap extends FrozenMap<@Nullable Object> {
        protected PropertiesWithEscapedCharactersMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "foo\nbar",
            "foo\"bar",
            "foo\\bar",
            "foo\rbar",
            "foo\tbar",
            "foo\fbar"
        );
        public static PropertiesWithEscapedCharactersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return PropertiesWithEscapedCharacters1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForFoonbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoonbar(Map<String, @Nullable Object> instance);
        
        default T setFooReverseSolidusNbar(int value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T setFooReverseSolidusNbar(float value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T setFooReverseSolidusNbar(long value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
        
        default T setFooReverseSolidusNbar(double value) {
            var instance = getInstance();
            instance.put("foo\nbar", value);
            return getBuilderAfterFoonbar(instance);
        }
    }
    
    public interface SetterForFoobar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoobar(Map<String, @Nullable Object> instance);
        
        default T setFooReverseSolidusQuotationMarkBar(int value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T setFooReverseSolidusQuotationMarkBar(float value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T setFooReverseSolidusQuotationMarkBar(long value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
        
        default T setFooReverseSolidusQuotationMarkBar(double value) {
            var instance = getInstance();
            instance.put("foo\"bar", value);
            return getBuilderAfterFoobar(instance);
        }
    }
    
    public interface SetterForFoobar1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoobar1(Map<String, @Nullable Object> instance);
        
        default T setFooReverseSolidusReverseSolidusBar(int value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T setFooReverseSolidusReverseSolidusBar(float value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T setFooReverseSolidusReverseSolidusBar(long value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
        
        default T setFooReverseSolidusReverseSolidusBar(double value) {
            var instance = getInstance();
            instance.put("foo\\bar", value);
            return getBuilderAfterFoobar1(instance);
        }
    }
    
    public interface SetterForFoorbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoorbar(Map<String, @Nullable Object> instance);
        
        default T setFooReverseSolidusRbar(int value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T setFooReverseSolidusRbar(float value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T setFooReverseSolidusRbar(long value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
        
        default T setFooReverseSolidusRbar(double value) {
            var instance = getInstance();
            instance.put("foo\rbar", value);
            return getBuilderAfterFoorbar(instance);
        }
    }
    
    public interface SetterForFootbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFootbar(Map<String, @Nullable Object> instance);
        
        default T setFooReverseSolidusTbar(int value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T setFooReverseSolidusTbar(float value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T setFooReverseSolidusTbar(long value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
        
        default T setFooReverseSolidusTbar(double value) {
            var instance = getInstance();
            instance.put("foo\tbar", value);
            return getBuilderAfterFootbar(instance);
        }
    }
    
    public interface SetterForFoofbar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoofbar(Map<String, @Nullable Object> instance);
        
        default T setFooReverseSolidusFbar(int value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T setFooReverseSolidusFbar(float value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T setFooReverseSolidusFbar(long value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
        
        default T setFooReverseSolidusFbar(double value) {
            var instance = getInstance();
            instance.put("foo\fbar", value);
            return getBuilderAfterFoofbar(instance);
        }
    }
    
    public static class PropertiesWithEscapedCharactersMapBuilder extends UnsetAddPropsSetter<PropertiesWithEscapedCharactersMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForFoonbar<PropertiesWithEscapedCharactersMapBuilder>, SetterForFoobar<PropertiesWithEscapedCharactersMapBuilder>, SetterForFoobar1<PropertiesWithEscapedCharactersMapBuilder>, SetterForFoorbar<PropertiesWithEscapedCharactersMapBuilder>, SetterForFootbar<PropertiesWithEscapedCharactersMapBuilder>, SetterForFoofbar<PropertiesWithEscapedCharactersMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "foo\nbar",
            "foo\"bar",
            "foo\\bar",
            "foo\rbar",
            "foo\tbar",
            "foo\fbar"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public PropertiesWithEscapedCharactersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PropertiesWithEscapedCharactersMapBuilder getBuilderAfterFoonbar(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PropertiesWithEscapedCharactersMapBuilder getBuilderAfterFoobar(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PropertiesWithEscapedCharactersMapBuilder getBuilderAfterFoobar1(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PropertiesWithEscapedCharactersMapBuilder getBuilderAfterFoorbar(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PropertiesWithEscapedCharactersMapBuilder getBuilderAfterFootbar(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PropertiesWithEscapedCharactersMapBuilder getBuilderAfterFoofbar(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PropertiesWithEscapedCharactersMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public static class PropertiesWithEscapedCharacters1 extends JsonSchema implements NullSchemaValidator, BooleanSchemaValidator, NumberSchemaValidator, StringSchemaValidator, ListSchemaValidator<FrozenList<@Nullable Object>>, MapSchemaValidator<PropertiesWithEscapedCharactersMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable PropertiesWithEscapedCharacters1 instance = null;
    
        protected PropertiesWithEscapedCharacters1() {
            super(new JsonSchemaInfo()
                .properties(Map.ofEntries(
                    new PropertyEntry("foo\nbar", Foonbar.class),
                    new PropertyEntry("foo\"bar", Foobar.class),
                    new PropertyEntry("foo\\bar", Foobar1.class),
                    new PropertyEntry("foo\rbar", Foorbar.class),
                    new PropertyEntry("foo\tbar", Footbar.class),
                    new PropertyEntry("foo\fbar", Foofbar.class)
                ))
            );
        }
    
        public static PropertiesWithEscapedCharacters1 getInstance() {
            if (instance == null) {
                instance = new PropertiesWithEscapedCharacters1();
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
        public PropertiesWithEscapedCharactersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new PropertiesWithEscapedCharactersMap(castProperties);
        }
        
        public PropertiesWithEscapedCharactersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
    }
}
