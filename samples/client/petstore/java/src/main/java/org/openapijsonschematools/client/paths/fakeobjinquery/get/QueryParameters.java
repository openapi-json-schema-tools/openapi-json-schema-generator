package org.openapijsonschematools.client.paths.fakeobjinquery.get;
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
import org.openapijsonschematools.client.paths.fakeobjinquery.get.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.SchemaMapValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class QueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class QueryParametersMap extends FrozenMap<Schema0.SchemaMap0> {
        QueryParametersMap(FrozenMap<Schema0.SchemaMap0> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "mapBean"
        );
        public static QueryParametersMap of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return QueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public Schema0.SchemaMap0 mapBean() {
            String key = "mapBean";
            throwIfKeyNotPresent(key);
            return get(key);
        }
    }
    public static class QueryParametersMapInput {
        // empty mapping
    }
    
    
    public static class QueryParameters1 extends JsonSchema implements SchemaMapValidator<Map<String, Object>, FrozenMap<String, Object>, QueryParametersMap> {
        private static QueryParameters1 instance;
        protected QueryParameters1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("mapBean", Schema0.Schema01.class)
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
    
        public static QueryParameters1 getInstance() {
            if (instance == null) {
                instance = new QueryParameters1();
            }
            return instance;
        }
        
        @Override
        public FrozenMap<FrozenMap<String, Object>> castToAllowedTypes(Map<String, Map<String, Object>> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            LinkedHashMap<String, FrozenMap<String, Object>> argFixed = new LinkedHashMap<>();
            for (Map.Entry<String, Map<String, Object>> entry: arg.entrySet()) {
                String key = entry.getKey();
                                Map<String, Object> val = entry.getValue();
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(key);
                                FrozenMap<String, Object> fixedVal = (FrozenMap<String, Object>) castToAllowedObjectTypes(val, newPathToItem, pathSet);
                argFixed.put(key, fixedVal);
            }
            return new FrozenMap<>(argFixed);
        }
        
        public QueryParametersMap getNewInstance(FrozenMap<FrozenMap<String, Object>> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Schema0.SchemaMap0> properties = new LinkedHashMap<>();
            for(Map.Entry<String, FrozenMap<String, Object>> entry: arg.entrySet()) {
                String propertyName = entry.getKey();
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                FrozenMap<String, Object> value = entry.getValue();
                JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
                Schema0.SchemaMap0 castValue = (Schema0.SchemaMap0) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<Schema0.SchemaMap0> castProperties = new FrozenMap<>(properties);
            return new QueryParametersMap(castProperties);
        }
        
        @Override
        public QueryParametersMap validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenMap<FrozenMap<String, Object>> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenMap) {
                @SuppressWarnings("unchecked") FrozenMap<Map<String, Object>> castArg = (FrozenMap<Map<String, Object>>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

}
