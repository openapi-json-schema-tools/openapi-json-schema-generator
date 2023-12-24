package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter10.Schema10;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter11.Schema11;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter12.Schema12;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter13.Schema13;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter9.Schema9;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class PathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class PathParametersMap extends FrozenMap<@Nullable Object> {
        protected PathParametersMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "1",
            "A-B",
            "Ab",
            "aB",
            "self"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static PathParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return PathParameters1.getInstance().validate(arg, configuration);
        }
        
        public String Ab() {
                        @Nullable Object value = get("Ab");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for Ab");
            }
            return (String) value;
        }
        
        public String aB() {
                        @Nullable Object value = get("aB");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for aB");
            }
            return (String) value;
        }
        
        public String self() {
                        @Nullable Object value = get("self");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for self");
            }
            return (String) value;
        }
    }
    public static class PathParametersMapInput {
        // empty mapping
    }
    
    
    public static class PathParameters1 extends JsonSchema implements MapSchemaValidator<PathParametersMap> {
        private static @Nullable PathParameters1 instance = null;
    
        protected PathParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("1", Schema9.Schema91.class),
                    new PropertyEntry("aB", Schema10.Schema101.class),
                    new PropertyEntry("Ab", Schema11.Schema111.class),
                    new PropertyEntry("A-B", Schema13.Schema131.class),
                    new PropertyEntry("self", Schema12.Schema121.class)
                ))
                .required(Set.of(
                    "1",
                    "A-B",
                    "Ab",
                    "aB",
                    "self"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static PathParameters1 getInstance() {
            if (instance == null) {
                instance = new PathParameters1();
            }
            return instance;
        }
        
        public PathParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new InvalidTypeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new PathParametersMap(castProperties);
        }
        
        public PathParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }

}
