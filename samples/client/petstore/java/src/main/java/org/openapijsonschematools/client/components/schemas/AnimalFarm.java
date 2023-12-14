package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.SchemaListValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class AnimalFarm {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AnimalFarmList extends FrozenList<Animal.AnimalMap> {
        AnimalFarmList(FrozenList<Animal.AnimalMap> m) {
            super(m);
        }
        public static AnimalFarmList of(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return AnimalFarm1.getInstance().validate(arg, configuration);
        }
    }
    
    public static class AnimalFarmListInput {
        // class to build List<Map<String, Object>>
    }
    
    
    public static class AnimalFarm1 extends JsonSchema implements SchemaListValidator<Map<String, Object>, FrozenMap<Object>, AnimalFarmList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static AnimalFarm1 instance;
        protected AnimalFarm1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Animal.Animal1.class))
            )));
        }
    
        public static AnimalFarm1 getInstance() {
            if (instance == null) {
                instance = new AnimalFarm1();
            }
            return instance;
        }
        
        @Override
        public FrozenList<FrozenMap<Object>> castToAllowedTypes(List<Map<String, Object>> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<FrozenMap<Object>> argFixed = new ArrayList<>();
            int i =0;
            for (Map<String, Object> item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                FrozenMap<Object> fixedVal = (FrozenMap<Object>) castToAllowedObjectTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
        
        @Override
        public AnimalFarmList getNewInstance(FrozenList<FrozenMap<Object>> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<Animal.AnimalMap> items = new ArrayList<>();
            int i = 0;
            for (FrozenMap<Object> item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                                Animal.AnimalMap castItem = (Animal.AnimalMap) itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<Animal.AnimalMap> newInstanceItems = new FrozenList<>(items);
            return new AnimalFarmList(newInstanceItems);
        }
        
        @Override
        public AnimalFarmList validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<FrozenMap<Object>> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenList) {
                @SuppressWarnings("unchecked") FrozenList<Map<String, Object>> castArg = (FrozenList<Map<String, Object>>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }
}
