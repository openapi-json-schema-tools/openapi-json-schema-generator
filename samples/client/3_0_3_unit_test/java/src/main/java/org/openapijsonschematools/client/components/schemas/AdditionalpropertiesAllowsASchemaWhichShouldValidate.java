package org.openapijsonschematools.client.components.schemas;
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
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class AdditionalpropertiesAllowsASchemaWhichShouldValidate {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends BooleanJsonSchema {}
    
    
    public static class Foo extends AnyTypeJsonSchema {}
    
    
    public static class Bar extends AnyTypeJsonSchema {}
    
    
    public static class AdditionalpropertiesAllowsASchemaWhichShouldValidateMap extends FrozenMap<@Nullable Object> {
        protected AdditionalpropertiesAllowsASchemaWhichShouldValidateMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "foo",
            "bar"
        );
        public static AdditionalpropertiesAllowsASchemaWhichShouldValidateMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return AdditionalpropertiesAllowsASchemaWhichShouldValidate1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object foo() throws UnsetPropertyException {
            String key = "foo";
            throwIfKeyNotPresent(key);
            return get(key);
        }
        
        public @Nullable Object bar() throws UnsetPropertyException {
            String key = "bar";
            throwIfKeyNotPresent(key);
            return get(key);
        }
        
        public boolean getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
                        @Nullable Object value = get(name);
            if (!(value instanceof Boolean)) {
                throw new InvalidTypeException("Invalid value stored for " + name);
            }
            return (boolean) value;
        }
    }
    public static class AdditionalpropertiesAllowsASchemaWhichShouldValidateMapInput {
        // optionalProperties + additionalProperties
    }
    
    
    public static class AdditionalpropertiesAllowsASchemaWhichShouldValidate1 extends JsonSchema implements MapSchemaValidator<Object, AdditionalpropertiesAllowsASchemaWhichShouldValidateMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable AdditionalpropertiesAllowsASchemaWhichShouldValidate1 instance = null;
    
        protected AdditionalpropertiesAllowsASchemaWhichShouldValidate1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("foo", Foo.class),
                    new PropertyEntry("bar", Bar.class)
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static AdditionalpropertiesAllowsASchemaWhichShouldValidate1 getInstance() {
            if (instance == null) {
                instance = new AdditionalpropertiesAllowsASchemaWhichShouldValidate1();
            }
            return instance;
        }
        
        public AdditionalpropertiesAllowsASchemaWhichShouldValidateMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new InvalidTypeException("Invalid non-string key value");
                }
                @NonNull String propertyName = (@NonNull String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                if (!(propertyInstance instanceof Object)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (@Nullable Object) propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new AdditionalpropertiesAllowsASchemaWhichShouldValidateMap(castProperties);
        }
        
        @Override
        public AdditionalpropertiesAllowsASchemaWhichShouldValidateMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }

}
