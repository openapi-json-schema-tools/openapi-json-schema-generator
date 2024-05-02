package org.openapijsonschematools.client.components.responses.successfulxmlandjsonarrayofpet.content.applicationjson;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.Pet;
import org.openapijsonschematools.client.components.schemas.RefPet;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ApplicationjsonSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ApplicationjsonSchemaList extends FrozenList<Pet.PetMap> {
        protected ApplicationjsonSchemaList(FrozenList<Pet.PetMap> m) {
            super(m);
        }
        public static ApplicationjsonSchemaList of(List<Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ApplicationjsonSchema1.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ApplicationjsonSchemaListBuilder {
        // class to build List<Map<String, @Nullable Object>>
        private final List<Map<String, @Nullable Object>> list;
    
        public ApplicationjsonSchemaListBuilder() {
            list = new ArrayList<>();
        }
    
        public ApplicationjsonSchemaListBuilder(List<Map<String, @Nullable Object>> list) {
            this.list = list;
        }
        
        public ApplicationjsonSchemaListBuilder add(Map<String, @Nullable Object> item) {
            list.add(item);
            return this;
        }
    
        public List<Map<String, @Nullable Object>> build() {
            return list;
        }
    }
    
    
    public sealed interface ApplicationjsonSchema1Boxed permits ApplicationjsonSchema1BoxedList {
        @Nullable Object getData();
    }
    
    public record ApplicationjsonSchema1BoxedList(ApplicationjsonSchemaList data) implements ApplicationjsonSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class ApplicationjsonSchema1 extends JsonSchema<ApplicationjsonSchema1Boxed> implements ListSchemaValidator<ApplicationjsonSchemaList, ApplicationjsonSchema1BoxedList> {
        private static @Nullable ApplicationjsonSchema1 instance = null;
    
        protected ApplicationjsonSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(RefPet.RefPet1.class)
            );
        }
    
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
        
        @Override
        public ApplicationjsonSchemaList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<Pet.PetMap> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Nothing?> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof Pet.PetMap)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                items.add((Pet.PetMap) itemInstance);
                i += 1;
            }
            FrozenList<Pet.PetMap> newInstanceItems = new FrozenList<>(items);
            return new ApplicationjsonSchemaList(newInstanceItems);
        }
        
        public ApplicationjsonSchemaList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
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
        public ApplicationjsonSchema1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ApplicationjsonSchema1BoxedList(validate(arg, configuration));
        }
        @Override
        public ApplicationjsonSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
