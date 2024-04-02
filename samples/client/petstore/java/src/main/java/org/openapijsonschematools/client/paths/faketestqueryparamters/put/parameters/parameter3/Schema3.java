package org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter3;
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
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Schema3 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items3 extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Items3 instance = null;
        public static Items3 getInstance() {
            if (instance == null) {
                instance = new Items3();
            }
            return instance;
        }
    }
    
    
    public static class SchemaList3 extends FrozenList<String> {
        protected SchemaList3(FrozenList<String> m) {
            super(m);
        }
        public static SchemaList3 of(List<String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return Schema31.getInstance().validate(arg, configuration);
        }
    }
    
    public static class SchemaListBuilder3 {
        // class to build List<String>
        private final List<String> list;
    
        public SchemaListBuilder3() {
            list = new ArrayList<>();
        }
    
        public SchemaListBuilder3(List<String> list) {
            this.list = list;
        }
        
        public SchemaListBuilder3 add(String item) {
            list.add(item);
            return this;
        }
    
        public List<String> build() {
            return list;
        }
    }
    
    
    public sealed interface Schema31Boxed permits Schema31BoxedList {
        @Nullable Object getData();
    }
    
    public record Schema31BoxedList(SchemaList3 data) implements Schema31Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Schema31 extends JsonSchema<Schema31Boxed> implements ListSchemaValidator<SchemaList3, Schema31BoxedList> {
        private static @Nullable Schema31 instance = null;
    
        protected Schema31() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items3.class)
            );
        }
    
        public static Schema31 getInstance() {
            if (instance == null) {
                instance = new Schema31();
            }
            return instance;
        }
        
        @Override
        public SchemaList3 getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            List<String> items = new ArrayList<>();
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
                if (!(itemInstance instanceof String)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((String) itemInstance);
                i += 1;
            }
            FrozenList<String> newInstanceItems = new FrozenList<>(items);
            return new SchemaList3(newInstanceItems);
        }
        
        public SchemaList3 validate(List<?> arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
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
        public Schema31BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Schema31BoxedList(validate(arg, configuration));
        }
        @Override
        public Schema31Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
