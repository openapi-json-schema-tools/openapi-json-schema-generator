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
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;
import org.openapijsonschematools.client.schemas.DateJsonSchema;
import org.openapijsonschematools.client.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.client.schemas.DoubleJsonSchema;
import org.openapijsonschematools.client.schemas.FloatJsonSchema;
import org.openapijsonschematools.client.schemas.Int32JsonSchema;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.IntJsonSchema;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.NullJsonSchema;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
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
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ComposedAnyOfDifferentTypesNoValidations {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema0 extends MapJsonSchema {
        private static @Nullable Schema0 instance = null;
        public static Schema0 getInstance() {
            if (instance == null) {
                instance = new Schema0();
            }
            return instance;
        }
    }
    
    
    public static class Schema1 extends DateJsonSchema {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
    
    
    public static class Schema2 extends DateTimeJsonSchema {
        private static @Nullable Schema2 instance = null;
        public static Schema2 getInstance() {
            if (instance == null) {
                instance = new Schema2();
            }
            return instance;
        }
    }
    
    
    public static class Schema3 extends StringJsonSchema {
        // BinarySchema
        private static @Nullable Schema3 instance = null;
        public static Schema3 getInstance() {
            if (instance == null) {
                instance = new Schema3();
            }
            return instance;
        }
    }
    
    
    public static class Schema4 extends StringJsonSchema {
        private static @Nullable Schema4 instance = null;
        public static Schema4 getInstance() {
            if (instance == null) {
                instance = new Schema4();
            }
            return instance;
        }
    }
    
    
    public static class Schema5 extends StringJsonSchema {
        private static @Nullable Schema5 instance = null;
        public static Schema5 getInstance() {
            if (instance == null) {
                instance = new Schema5();
            }
            return instance;
        }
    }
    
    
    public static class Schema6 extends MapJsonSchema {
        private static @Nullable Schema6 instance = null;
        public static Schema6 getInstance() {
            if (instance == null) {
                instance = new Schema6();
            }
            return instance;
        }
    }
    
    
    public static class Schema7 extends BooleanJsonSchema {
        private static @Nullable Schema7 instance = null;
        public static Schema7 getInstance() {
            if (instance == null) {
                instance = new Schema7();
            }
            return instance;
        }
    }
    
    
    public static class Schema8 extends NullJsonSchema {
        private static @Nullable Schema8 instance = null;
        public static Schema8 getInstance() {
            if (instance == null) {
                instance = new Schema8();
            }
            return instance;
        }
    }
    
    
    public static class Items extends AnyTypeJsonSchema {
        private static @Nullable Items instance = null;
        public static Items getInstance() {
            if (instance == null) {
                instance = new Items();
            }
            return instance;
        }
    }
    
    
    public static class Schema9List extends FrozenList<@Nullable Object> {
        protected Schema9List(FrozenList<@Nullable Object> m) {
            super(m);
        }
        public static Schema9List of(List<? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema9.getInstance().validate(arg, configuration);
        }
    }
    
    public static class Schema9ListInput {
        // class to build List<? extends @Nullable Object>
    }
    
    
    public static class Schema9 extends JsonSchema implements ListSchemaValidator<Schema9List> {
        private static @Nullable Schema9 instance = null;
    
        protected Schema9() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items.class)
            );
        }
    
        public static Schema9 getInstance() {
            if (instance == null) {
                instance = new Schema9();
            }
            return instance;
        }
        
        @Override
        public Schema9List getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new Schema9List(newInstanceItems);
        }
        
        public Schema9List validate(List<? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
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
    
    public static class Schema10 extends NumberJsonSchema {
        private static @Nullable Schema10 instance = null;
        public static Schema10 getInstance() {
            if (instance == null) {
                instance = new Schema10();
            }
            return instance;
        }
    }
    
    
    public static class Schema11 extends FloatJsonSchema {
        private static @Nullable Schema11 instance = null;
        public static Schema11 getInstance() {
            if (instance == null) {
                instance = new Schema11();
            }
            return instance;
        }
    }
    
    
    public static class Schema12 extends DoubleJsonSchema {
        private static @Nullable Schema12 instance = null;
        public static Schema12 getInstance() {
            if (instance == null) {
                instance = new Schema12();
            }
            return instance;
        }
    }
    
    
    public static class Schema13 extends IntJsonSchema {
        private static @Nullable Schema13 instance = null;
        public static Schema13 getInstance() {
            if (instance == null) {
                instance = new Schema13();
            }
            return instance;
        }
    }
    
    
    public static class Schema14 extends Int32JsonSchema {
        private static @Nullable Schema14 instance = null;
        public static Schema14 getInstance() {
            if (instance == null) {
                instance = new Schema14();
            }
            return instance;
        }
    }
    
    
    public static class Schema15 extends Int64JsonSchema {
        private static @Nullable Schema15 instance = null;
        public static Schema15 getInstance() {
            if (instance == null) {
                instance = new Schema15();
            }
            return instance;
        }
    }
    
    
    public static class ComposedAnyOfDifferentTypesNoValidations1 extends JsonSchema implements NullSchemaValidator, BooleanSchemaValidator, NumberSchemaValidator, StringSchemaValidator, ListSchemaValidator<FrozenList<@Nullable Object>>, MapSchemaValidator<FrozenMap<@Nullable Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ComposedAnyOfDifferentTypesNoValidations1 instance = null;
    
        protected ComposedAnyOfDifferentTypesNoValidations1() {
            super(new JsonSchemaInfo()
                .anyOf(List.of(
                    Schema0.class,
                    Schema1.class,
                    Schema2.class,
                    Schema3.class,
                    Schema4.class,
                    Schema5.class,
                    Schema6.class,
                    Schema7.class,
                    Schema8.class,
                    Schema9.class,
                    Schema10.class,
                    Schema11.class,
                    Schema12.class,
                    Schema13.class,
                    Schema14.class,
                    Schema15.class
                ))
            );
        }
    
        public static ComposedAnyOfDifferentTypesNoValidations1 getInstance() {
            if (instance == null) {
                instance = new ComposedAnyOfDifferentTypesNoValidations1();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = new ArrayList<>();
            pathToItem.add("args[0]");
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
            List<Object> pathToItem = new ArrayList<>();
            pathToItem.add("args[0]");
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
            List<Object> pathToItem = new ArrayList<>();
            pathToItem.add("args[0]");
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
            List<Object> pathToItem = new ArrayList<>();
            pathToItem.add("args[0]");
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
        
        public FrozenList<@Nullable Object> validate(List<? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
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
            List<Object> pathToItem = new ArrayList<>();
            pathToItem.add("args[0]");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
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
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }
}
