package org.openapijsonschematools.client.paths.faketestqueryparamters.put;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapijsonschematools.client.components.schemas.StringWithValidation;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter1.Schema1;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter2.Schema2;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter3.Schema3;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter4.Schema4;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.SchemaMapValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class QueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class QueryParametersMap extends FrozenMap<Object> {
        QueryParametersMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "context",
            "http",
            "ioutil",
            "pipe",
            "refParam",
            "url"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static QueryParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return QueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public Schema4.SchemaList4 context() {
            return (Schema4.SchemaList4) get("context");
        }
        
        public Schema2.SchemaList2 http() {
            return (Schema2.SchemaList2) get("http");
        }
        
        public Schema1.SchemaList1 ioutil() {
            return (Schema1.SchemaList1) get("ioutil");
        }
        
        public Schema0.SchemaList0 pipe() {
            return (Schema0.SchemaList0) get("pipe");
        }
        
        public String refParam() {
            return (String) get("refParam");
        }
        
        public Schema3.SchemaList3 url() {
            return (Schema3.SchemaList3) get("url");
        }
    }
    public static class QueryParametersMapInput {
        // empty mapping
    }
    
    
    public static class QueryParameters1 extends JsonSchema implements SchemaMapValidator<Object, Object, QueryParametersMap> {
        private static QueryParameters1 instance;
        protected QueryParameters1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("refParam", StringWithValidation.StringWithValidation1.class),
                    new PropertyEntry("ioutil", Schema1.Schema11.class),
                    new PropertyEntry("context", Schema4.Schema41.class),
                    new PropertyEntry("http", Schema2.Schema21.class),
                    new PropertyEntry("pipe", Schema0.Schema01.class),
                    new PropertyEntry("url", Schema3.Schema31.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "context",
                    "http",
                    "ioutil",
                    "pipe",
                    "refParam",
                    "url"
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
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenMap) {
                @SuppressWarnings("unchecked") FrozenMap<Object> castArg = (FrozenMap<Object>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
        
        @Override
        public FrozenMap<Object> castToAllowedTypes(Map<String, Object> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            LinkedHashMap<String, Object> argFixed = new LinkedHashMap<>();
            for (Map.Entry<String, Object> entry: arg.entrySet()) {
                String key = entry.getKey();
                                Object val = entry.getValue();
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(key);
                                Object fixedVal = (Object) castToAllowedObjectTypes(val, newPathToItem, pathSet);
                argFixed.put(key, fixedVal);
            }
            return new FrozenMap<>(argFixed);
        }
        
        public QueryParametersMap getNewInstance(FrozenMap<Object> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
            for(Map.Entry<String, Object> entry: arg.entrySet()) {
                String propertyName = entry.getKey();
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
                Object castValue = (Object) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<Object> castProperties = new FrozenMap<>(properties);
            return new QueryParametersMap(castProperties);
        }
        
        @Override
        public QueryParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenMap<Object> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
    }

}
