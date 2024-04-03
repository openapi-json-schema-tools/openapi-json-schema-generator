package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class SelfReferencingArrayModel {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SelfReferencingArrayModelList extends FrozenList<SelfReferencingArrayModelList> {
        protected SelfReferencingArrayModelList(FrozenList<SelfReferencingArrayModelList> m) {
            super(m);
        }
        public static SelfReferencingArrayModelList of(List<List<?>> arg, SchemaConfiguration configuration) throws ValidationException {
            return SelfReferencingArrayModel1.getInstance().validate(arg, configuration);
        }
    }
    
    public static class SelfReferencingArrayModelListBuilder {
        // class to build List<List<?>>
        private final List<List<?>> list;
    
        public SelfReferencingArrayModelListBuilder() {
            list = new ArrayList<>();
        }
    
        public SelfReferencingArrayModelListBuilder(List<List<?>> list) {
            this.list = list;
        }
    
        public SelfReferencingArrayModelListBuilder add(List<?> item) {
            list.add(item);
            return this;
        }
    
        public List<List<?>> build() {
            return list;
        }
    }
    
    
    public sealed interface SelfReferencingArrayModel1Boxed permits SelfReferencingArrayModel1BoxedList {
        @Nullable Object getData();
    }
    
    public record SelfReferencingArrayModel1BoxedList(SelfReferencingArrayModelList data) implements SelfReferencingArrayModel1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class SelfReferencingArrayModel1 extends JsonSchema<SelfReferencingArrayModel1Boxed> implements ListSchemaValidator<SelfReferencingArrayModelList, SelfReferencingArrayModel1BoxedList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable SelfReferencingArrayModel1 instance = null;
    
        protected SelfReferencingArrayModel1() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(SelfReferencingArrayModel1.class)
            );
        }
    
        public static SelfReferencingArrayModel1 getInstance() {
            if (instance == null) {
                instance = new SelfReferencingArrayModel1();
            }
            return instance;
        }
        
        @Override
        public SelfReferencingArrayModelList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<SelfReferencingArrayModelList> items = new ArrayList<>();
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
                if (!(itemInstance instanceof SelfReferencingArrayModelList)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                items.add((SelfReferencingArrayModelList) itemInstance);
                i += 1;
            }
            FrozenList<SelfReferencingArrayModelList> newInstanceItems = new FrozenList<>(items);
            return new SelfReferencingArrayModelList(newInstanceItems);
        }
        
        public SelfReferencingArrayModelList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public SelfReferencingArrayModel1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new SelfReferencingArrayModel1BoxedList(validate(arg, configuration));
        }
        @Override
        public SelfReferencingArrayModel1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
