package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post;
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
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter14.Schema14;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter15.Schema15;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter16.Schema16;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter17.Schema17;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter18.Schema18;
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

public class CookieParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class CookieParametersMap extends FrozenMap<Object> {
        CookieParametersMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "1",
            "aB",
            "Ab",
            "A-B",
            "self"
        );
        public static CookieParametersMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return CookieParameters1.getInstance().validate(arg, configuration);
        }
        
        public String aB() {
            String key = "aB";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String Ab() {
            String key = "Ab";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String self() {
            String key = "self";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
    }
    public static class CookieParametersMapInput {
        // empty mapping
    }
    
    
    public static class CookieParameters1 extends JsonSchema implements SchemaMapValidator<Object, Object, CookieParametersMap> {
        private static CookieParameters1 instance;
        protected CookieParameters1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("1", Schema14.Schema141.class),
                    new PropertyEntry("aB", Schema15.Schema151.class),
                    new PropertyEntry("Ab", Schema16.Schema161.class),
                    new PropertyEntry("A-B", Schema18.Schema181.class),
                    new PropertyEntry("self", Schema17.Schema171.class)
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
    
        public static CookieParameters1 getInstance() {
            if (instance == null) {
                instance = new CookieParameters1();
            }
            return instance;
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
        
        public CookieParametersMap getNewInstance(FrozenMap<Object> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new CookieParametersMap(castProperties);
        }
        
        @Override
        public CookieParametersMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenMap<Object> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenMap) {
                @SuppressWarnings("unchecked") FrozenMap<Object> castArg = (FrozenMap<Object>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

}
