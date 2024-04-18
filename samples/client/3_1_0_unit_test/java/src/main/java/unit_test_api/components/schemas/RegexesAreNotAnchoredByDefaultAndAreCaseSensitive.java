package unit_test_api.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.Nullable;
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.InvalidAdditionalPropertyException;
import unit_test_api.exceptions.UnsetPropertyException;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.BooleanJsonSchema;
import unit_test_api.schemas.StringJsonSchema;
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
import unit_test_api.schemas.validation.StringSchemaValidator;
import unit_test_api.schemas.validation.ValidationMetadata;

public class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema092 extends BooleanJsonSchema.BooleanJsonSchema1 {
        private static @Nullable Schema092 instance = null;
        public static Schema092 getInstance() {
            if (instance == null) {
                instance = new Schema092();
            }
            return instance;
        }
    }
    
    
    public static class X extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable X instance = null;
        public static X getInstance() {
            if (instance == null) {
                instance = new X();
            }
            return instance;
        }
    }
    
    
    public sealed interface RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed permits RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid, RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean, RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber, RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString, RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList, RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap {
        @Nullable Object getData();
    }
    
    public record RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid(Void data) implements RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean(boolean data) implements RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber(Number data) implements RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString(String data) implements RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList(FrozenList<@Nullable Object> data) implements RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap(FrozenMap<@Nullable Object> data) implements RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1 extends JsonSchema<RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed> implements NullSchemaValidator<RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid>, BooleanSchemaValidator<RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean>, NumberSchemaValidator<RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber>, StringSchemaValidator<RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString>, ListSchemaValidator<FrozenList<@Nullable Object>, RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList>, MapSchemaValidator<FrozenMap<@Nullable Object>, RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1 instance = null;
    
        protected RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1() {
            super(new JsonSchemaInfo()
                .patternProperties(Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(Pattern.compile("[0-9]{2,}"), Schema092.class),
                    new AbstractMap.SimpleEntry<>(Pattern.compile("X_"), X.class)
                ))
            );
        }
    
        public static RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1 getInstance() {
            if (instance == null) {
                instance = new RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1();
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
        public RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return new RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedBoolean(validate(arg, configuration));
        }
        @Override
        public RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException {
            return new RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedNumber(validate(arg, configuration));
        }
        @Override
        public RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedString(validate(arg, configuration));
        }
        @Override
        public RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedList(validate(arg, configuration));
        }
        @Override
        public RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1BoxedMap(validate(arg, configuration));
        }
        @Override
        public RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
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
