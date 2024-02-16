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
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;
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
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class UniqueitemsFalseWithAnArrayOfItems {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class UniqueitemsFalseWithAnArrayOfItemsList extends FrozenList<@Nullable Object> {
        protected UniqueitemsFalseWithAnArrayOfItemsList(FrozenList<@Nullable Object> m) {
            super(m);
        }
        public static UniqueitemsFalseWithAnArrayOfItemsList of(List<? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return UniqueitemsFalseWithAnArrayOfItems1.getInstance().validate(arg, configuration);
        }
    }
    
    public static class UniqueitemsFalseWithAnArrayOfItemsListBuilder {
        // class to build List<@Nullable Object>
        private final List<@Nullable Object> list;
    
        public UniqueitemsFalseWithAnArrayOfItemsListBuilder() {
            list = new ArrayList<>();
        }
    
        public UniqueitemsFalseWithAnArrayOfItemsListBuilder(List<@Nullable Object> list) {
            this.list = list;
        }
        
        public UniqueitemsFalseWithAnArrayOfItemsListBuilder add(Void item) {
            list.add(null);
            return this;
        }
        
        public UniqueitemsFalseWithAnArrayOfItemsListBuilder add(boolean item) {
            list.add(item);
            return this;
        }
        
        public UniqueitemsFalseWithAnArrayOfItemsListBuilder add(String item) {
            list.add(item);
            return this;
        }
        
        public UniqueitemsFalseWithAnArrayOfItemsListBuilder add(int item) {
            list.add(item);
            return this;
        }
        
        public UniqueitemsFalseWithAnArrayOfItemsListBuilder add(float item) {
            list.add(item);
            return this;
        }
        
        public UniqueitemsFalseWithAnArrayOfItemsListBuilder add(long item) {
            list.add(item);
            return this;
        }
        
        public UniqueitemsFalseWithAnArrayOfItemsListBuilder add(double item) {
            list.add(item);
            return this;
        }
        
        public UniqueitemsFalseWithAnArrayOfItemsListBuilder add(List<?> item) {
            list.add(item);
            return this;
        }
        
        public UniqueitemsFalseWithAnArrayOfItemsListBuilder add(Map<String, ?> item) {
            list.add(item);
            return this;
        }
    
        public List<@Nullable Object> build() {
            return list;
        }
    }
    
    
    public static class Schema0 extends BooleanJsonSchema.BooleanJsonSchema1 {
        private static @Nullable Schema0 instance = null;
        public static Schema0 getInstance() {
            if (instance == null) {
                instance = new Schema0();
            }
            return instance;
        }
    }
    
    
    public static class Schema1 extends BooleanJsonSchema.BooleanJsonSchema1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
    
    
    public static abstract sealed class UniqueitemsFalseWithAnArrayOfItems1Boxed permits UniqueitemsFalseWithAnArrayOfItems1BoxedVoid, UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean, UniqueitemsFalseWithAnArrayOfItems1BoxedNumber, UniqueitemsFalseWithAnArrayOfItems1BoxedString, UniqueitemsFalseWithAnArrayOfItems1BoxedList, UniqueitemsFalseWithAnArrayOfItems1BoxedMap {
        public abstract @Nullable Object data();
    }
    
    public static final class UniqueitemsFalseWithAnArrayOfItems1BoxedVoid extends UniqueitemsFalseWithAnArrayOfItems1Boxed {
        public final Void data;
        private UniqueitemsFalseWithAnArrayOfItems1BoxedVoid(Void data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    public static final class UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean extends UniqueitemsFalseWithAnArrayOfItems1Boxed {
        public final boolean data;
        private UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean(boolean data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    public static final class UniqueitemsFalseWithAnArrayOfItems1BoxedNumber extends UniqueitemsFalseWithAnArrayOfItems1Boxed {
        public final Number data;
        private UniqueitemsFalseWithAnArrayOfItems1BoxedNumber(Number data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    public static final class UniqueitemsFalseWithAnArrayOfItems1BoxedString extends UniqueitemsFalseWithAnArrayOfItems1Boxed {
        public final String data;
        private UniqueitemsFalseWithAnArrayOfItems1BoxedString(String data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    public static final class UniqueitemsFalseWithAnArrayOfItems1BoxedList extends UniqueitemsFalseWithAnArrayOfItems1Boxed {
        public final UniqueitemsFalseWithAnArrayOfItemsList data;
        private UniqueitemsFalseWithAnArrayOfItems1BoxedList(UniqueitemsFalseWithAnArrayOfItemsList data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    public static final class UniqueitemsFalseWithAnArrayOfItems1BoxedMap extends UniqueitemsFalseWithAnArrayOfItems1Boxed {
        public final FrozenMap<@Nullable Object> data;
        private UniqueitemsFalseWithAnArrayOfItems1BoxedMap(FrozenMap<@Nullable Object> data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    public static class UniqueitemsFalseWithAnArrayOfItems1 extends JsonSchema implements NullSchemaValidator<UniqueitemsFalseWithAnArrayOfItems1BoxedVoid>, BooleanSchemaValidator<UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean>, NumberSchemaValidator<UniqueitemsFalseWithAnArrayOfItems1BoxedNumber>, StringSchemaValidator<UniqueitemsFalseWithAnArrayOfItems1BoxedString>, ListSchemaValidator<UniqueitemsFalseWithAnArrayOfItemsList, UniqueitemsFalseWithAnArrayOfItems1BoxedList>, MapSchemaValidator<FrozenMap<@Nullable Object>, UniqueitemsFalseWithAnArrayOfItems1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable UniqueitemsFalseWithAnArrayOfItems1 instance = null;
    
        protected UniqueitemsFalseWithAnArrayOfItems1() {
            super(new JsonSchemaInfo()
                .uniqueItems(false)
                .prefixItems(List.of(
                    Schema0.class,
                    Schema1.class
                ))
            );
        }
    
        public static UniqueitemsFalseWithAnArrayOfItems1 getInstance() {
            if (instance == null) {
                instance = new UniqueitemsFalseWithAnArrayOfItems1();
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
        public UniqueitemsFalseWithAnArrayOfItemsList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new UniqueitemsFalseWithAnArrayOfItemsList(newInstanceItems);
        }
        
        public UniqueitemsFalseWithAnArrayOfItemsList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public UniqueitemsFalseWithAnArrayOfItems1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new UniqueitemsFalseWithAnArrayOfItems1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean(validate(arg, configuration));
        }
        @Override
        public UniqueitemsFalseWithAnArrayOfItems1BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new UniqueitemsFalseWithAnArrayOfItems1BoxedNumber(validate(arg, configuration));
        }
        @Override
        public UniqueitemsFalseWithAnArrayOfItems1BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new UniqueitemsFalseWithAnArrayOfItems1BoxedString(validate(arg, configuration));
        }
        @Override
        public UniqueitemsFalseWithAnArrayOfItems1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new UniqueitemsFalseWithAnArrayOfItems1BoxedList(validate(arg, configuration));
        }
        @Override
        public UniqueitemsFalseWithAnArrayOfItems1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new UniqueitemsFalseWithAnArrayOfItems1BoxedMap(validate(arg, configuration));
        }
    }
}
