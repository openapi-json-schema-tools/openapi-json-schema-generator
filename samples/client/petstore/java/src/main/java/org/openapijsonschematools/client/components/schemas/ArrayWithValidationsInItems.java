package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ArrayWithValidationsInItems {
    // nest classes so all schemas and input/output classes can be public
    
    
    public sealed interface ItemsBoxed permits ItemsBoxedNumber {
        @Nullable Object getData();
    }
    
    public record ItemsBoxedNumber(Number data) implements ItemsBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Items extends JsonSchema<ItemsBoxed> implements NumberSchemaValidator<ItemsBoxedNumber> {
        private static @Nullable Items instance = null;
    
        protected Items() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))
                .format("int64")
                .maximum(7)
            );
        }
    
        public static Items getInstance() {
            if (instance == null) {
                instance = new Items();
            }
            return instance;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (int) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (float) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (long) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ItemsBoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ItemsBoxedNumber(validate(arg, configuration));
        }
        @Override
        public ItemsBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class ArrayWithValidationsInItemsList extends FrozenList<Number> {
        protected ArrayWithValidationsInItemsList(FrozenList<Number> m) {
            super(m);
        }
        public static ArrayWithValidationsInItemsList of(List<Number> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return ArrayWithValidationsInItems1.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayWithValidationsInItemsListBuilder {
        // class to build List<Number>
        private final List<Number> list;
    
        public ArrayWithValidationsInItemsListBuilder() {
            list = new ArrayList<>();
        }
    
        public ArrayWithValidationsInItemsListBuilder(List<Number> list) {
            this.list = list;
        }
        
        public ArrayWithValidationsInItemsListBuilder add(int item) {
            list.add(item);
            return this;
        }
        
        public ArrayWithValidationsInItemsListBuilder add(float item) {
            list.add(item);
            return this;
        }
        
        public ArrayWithValidationsInItemsListBuilder add(long item) {
            list.add(item);
            return this;
        }
        
        public ArrayWithValidationsInItemsListBuilder add(double item) {
            list.add(item);
            return this;
        }
    
        public List<Number> build() {
            return list;
        }
    }
    
    
    public sealed interface ArrayWithValidationsInItems1Boxed permits ArrayWithValidationsInItems1BoxedList {
        @Nullable Object getData();
    }
    
    public record ArrayWithValidationsInItems1BoxedList(ArrayWithValidationsInItemsList data) implements ArrayWithValidationsInItems1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class ArrayWithValidationsInItems1 extends JsonSchema<ArrayWithValidationsInItems1Boxed> implements ListSchemaValidator<ArrayWithValidationsInItemsList, ArrayWithValidationsInItems1BoxedList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ArrayWithValidationsInItems1 instance = null;
    
        protected ArrayWithValidationsInItems1() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items.class)
                .maxItems(2)
            );
        }
    
        public static ArrayWithValidationsInItems1 getInstance() {
            if (instance == null) {
                instance = new ArrayWithValidationsInItems1();
            }
            return instance;
        }
        
        @Override
        public ArrayWithValidationsInItemsList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            List<Number> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof Number)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((Number) itemInstance);
                i += 1;
            }
            FrozenList<Number> newInstanceItems = new FrozenList<>(items);
            return new ArrayWithValidationsInItemsList(newInstanceItems);
        }
        
        public ArrayWithValidationsInItemsList validate(List<?> arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ArrayWithValidationsInItems1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ArrayWithValidationsInItems1BoxedList(validate(arg, configuration));
        }
        @Override
        public ArrayWithValidationsInItems1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
