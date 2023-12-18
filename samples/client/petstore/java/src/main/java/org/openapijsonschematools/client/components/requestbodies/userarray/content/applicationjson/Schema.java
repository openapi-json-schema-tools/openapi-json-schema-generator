package org.openapijsonschematools.client.components.requestbodies.userarray.content.applicationjson;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapijsonschematools.client.components.schemas.User;
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

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SchemaList extends FrozenList<User.UserMap> {
        protected SchemaList(FrozenList<User.UserMap> m) {
            super(m);
        }
        public static SchemaList of(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema1.getInstance().validate(arg, configuration);
        }
    }
    
    public static class SchemaListInput {
        // class to build List<Map<String, Object>>
    }
    
    
    public static class Schema1 extends JsonSchema implements ListSchemaValidator<Map<String, Object>, SchemaList> {
        private static Schema1 instance;
    
        protected Schema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(User.User1.class)
            );
        }
    
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
        
        @Override
        public SchemaList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<User.UserMap> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                User.UserMap castItem = (User.UserMap) itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<User.UserMap> newInstanceItems = new FrozenList<>(items);
            return new SchemaList(newInstanceItems);
        }
        
        @Override
        public SchemaList validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }
}
