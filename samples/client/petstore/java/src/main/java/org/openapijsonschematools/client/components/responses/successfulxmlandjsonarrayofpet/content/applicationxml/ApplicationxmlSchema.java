package org.openapijsonschematools.client.components.responses.successfulxmlandjsonarrayofpet.content.applicationxml;
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
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ApplicationxmlSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ApplicationxmlSchemaList extends FrozenList<Pet.PetMap> {
        protected ApplicationxmlSchemaList(FrozenList<Pet.PetMap> m) {
            super(m);
        }
        public static ApplicationxmlSchemaList of(List<Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ApplicationxmlSchema1.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ApplicationxmlSchemaListBuilder {
        // class to build List<Map<String, @Nullable Object>>
        private final List<Map<String, @Nullable Object>> list;
    
        public ApplicationxmlSchemaListBuilder() {
            list = new ArrayList<>();
        }
    
        public ApplicationxmlSchemaListBuilder(List<Map<String, @Nullable Object>> list) {
            this.list = list;
        }
        
        public ApplicationxmlSchemaListBuilder add(Map<String, @Nullable Object> item) {
            list.add(item);
            return this;
        }
    
        public List<Map<String, @Nullable Object>> build() {
            return list;
        }
    }
    
    
    public sealed interface ApplicationxmlSchema1Boxed permits ApplicationxmlSchema1BoxedList {
        @Nullable Object data();
    }
    
    public static final class ApplicationxmlSchema1BoxedList implements ApplicationxmlSchema1Boxed {
        public final ApplicationxmlSchemaList data;
        private ApplicationxmlSchema1BoxedList(ApplicationxmlSchemaList data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxmlSchema1 extends JsonSchema implements ListSchemaValidator<ApplicationxmlSchemaList, ApplicationxmlSchema1BoxedList> {
        private static @Nullable ApplicationxmlSchema1 instance = null;
    
        protected ApplicationxmlSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Pet.Pet1.class)
            );
        }
    
        public static ApplicationxmlSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationxmlSchema1();
            }
            return instance;
        }
        
        @Override
        public ApplicationxmlSchemaList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<Pet.PetMap> items = new ArrayList<>();
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
                if (!(itemInstance instanceof Pet.PetMap)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((Pet.PetMap) itemInstance);
                i += 1;
            }
            FrozenList<Pet.PetMap> newInstanceItems = new FrozenList<>(items);
            return new ApplicationxmlSchemaList(newInstanceItems);
        }
        
        public ApplicationxmlSchemaList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public ApplicationxmlSchema1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApplicationxmlSchema1BoxedList(validate(arg, configuration));
        }
    }
}
