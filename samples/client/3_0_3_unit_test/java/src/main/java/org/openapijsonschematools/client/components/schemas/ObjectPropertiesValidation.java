package org.openapijsonschematools.client.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.IntJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ObjectPropertiesValidation {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Foo extends IntJsonSchema {}
    
    
    public static class Bar extends StringJsonSchema {}
    
    
    public static class ObjectPropertiesValidationMap extends FrozenMap<@Nullable Object> {
        protected ObjectPropertiesValidationMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "foo",
            "bar"
        );
        public static ObjectPropertiesValidationMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectPropertiesValidation1.getInstance().validate(arg, configuration);
        }
        
        public long foo() throws UnsetPropertyException {
            String key = "foo";
            throwIfKeyNotPresent(key);
            // mapValueSchema.typeSchema CodegenSchema{, description&#x3D;&#x27;null&#x27;, jsonPathPiece&#x3D;&#x27;null&#x27;, defaultValue&#x3D;&#x27;null&#x27;, title&#x3D;&#x27;null&#x27;, maxLength&#x3D;null, minLength&#x3D;null, patternInfo&#x3D;&#x27;null&#x27;, example&#x3D;&#x27;null&#x27;, minimum&#x3D;&#x27;null&#x27;, maximum&#x3D;&#x27;null&#x27;, exclusiveMinimum&#x3D;null, exclusiveMaximum&#x3D;null, deprecated&#x3D;null, types&#x3D;null, readOnly&#x3D;null, writeOnly&#x3D;null, nullable&#x3D;null, allowableValues&#x3D;null, items&#x3D;null, additionalProperties&#x3D;null, vendorExtensions&#x3D;null, hasValidation&#x3D;false, maxItems&#x3D;null, minItems&#x3D;null, maxProperties&#x3D;null, minProperties&#x3D;null, uniqueItems&#x3D;null, multipleOf&#x3D;null, xml&#x3D;null, requiredProperties&#x3D;null, optionalProperties&#x3D;null, properties&#x3D;null, refInfo&#x3D;null, schemaIsFromAdditionalProperties&#x3D;false, isBooleanSchemaTrue&#x3D;false, isBooleanSchemaFalse&#x3D;false, format&#x3D;null, dependentRequired&#x3D;null, contains&#x3D;null, allOf&#x3D;null, anyOf&#x3D;null, oneOf&#x3D;null, not&#x3D;null, externalDocumentation&#x3D;null, discriminator&#x3D;null, imports&#x3D;null, componentModule&#x3D;false, testCases&#x3D;{}, instanceType&#x3D;null, jsonPath&#x3D;null, arrayOutputJsonPathPiece&#x3D;null}
            // typeSchema CodegenSchema{, description&#x3D;&#x27;null&#x27;, jsonPathPiece&#x3D;&#x27;null&#x27;, defaultValue&#x3D;&#x27;null&#x27;, title&#x3D;&#x27;null&#x27;, maxLength&#x3D;null, minLength&#x3D;null, patternInfo&#x3D;&#x27;null&#x27;, example&#x3D;&#x27;null&#x27;, minimum&#x3D;&#x27;null&#x27;, maximum&#x3D;&#x27;null&#x27;, exclusiveMinimum&#x3D;null, exclusiveMaximum&#x3D;null, deprecated&#x3D;null, types&#x3D;[integer], readOnly&#x3D;null, writeOnly&#x3D;null, nullable&#x3D;null, allowableValues&#x3D;null, items&#x3D;null, additionalProperties&#x3D;null, vendorExtensions&#x3D;null, hasValidation&#x3D;false, maxItems&#x3D;null, minItems&#x3D;null, maxProperties&#x3D;null, minProperties&#x3D;null, uniqueItems&#x3D;null, multipleOf&#x3D;null, xml&#x3D;null, requiredProperties&#x3D;null, optionalProperties&#x3D;null, properties&#x3D;null, refInfo&#x3D;null, schemaIsFromAdditionalProperties&#x3D;false, isBooleanSchemaTrue&#x3D;false, isBooleanSchemaFalse&#x3D;false, format&#x3D;null, dependentRequired&#x3D;null, contains&#x3D;null, allOf&#x3D;null, anyOf&#x3D;null, oneOf&#x3D;null, not&#x3D;null, externalDocumentation&#x3D;null, discriminator&#x3D;null, imports&#x3D;null, componentModule&#x3D;false, testCases&#x3D;{}, instanceType&#x3D;null, jsonPath&#x3D;null, arrayOutputJsonPathPiece&#x3D;null}
            @Nullable Object value = get(key);
            if (!(value instanceof Long)) {
                throw new RuntimeException("Invalid value stored for foo");
            }
            return (long) value;
        }
        
        public @NonNull String bar() throws UnsetPropertyException {
            String key = "bar";
            throwIfKeyNotPresent(key);
            // mapValueSchema.typeSchema CodegenSchema{, description&#x3D;&#x27;null&#x27;, jsonPathPiece&#x3D;&#x27;null&#x27;, defaultValue&#x3D;&#x27;null&#x27;, title&#x3D;&#x27;null&#x27;, maxLength&#x3D;null, minLength&#x3D;null, patternInfo&#x3D;&#x27;null&#x27;, example&#x3D;&#x27;null&#x27;, minimum&#x3D;&#x27;null&#x27;, maximum&#x3D;&#x27;null&#x27;, exclusiveMinimum&#x3D;null, exclusiveMaximum&#x3D;null, deprecated&#x3D;null, types&#x3D;null, readOnly&#x3D;null, writeOnly&#x3D;null, nullable&#x3D;null, allowableValues&#x3D;null, items&#x3D;null, additionalProperties&#x3D;null, vendorExtensions&#x3D;null, hasValidation&#x3D;false, maxItems&#x3D;null, minItems&#x3D;null, maxProperties&#x3D;null, minProperties&#x3D;null, uniqueItems&#x3D;null, multipleOf&#x3D;null, xml&#x3D;null, requiredProperties&#x3D;null, optionalProperties&#x3D;null, properties&#x3D;null, refInfo&#x3D;null, schemaIsFromAdditionalProperties&#x3D;false, isBooleanSchemaTrue&#x3D;false, isBooleanSchemaFalse&#x3D;false, format&#x3D;null, dependentRequired&#x3D;null, contains&#x3D;null, allOf&#x3D;null, anyOf&#x3D;null, oneOf&#x3D;null, not&#x3D;null, externalDocumentation&#x3D;null, discriminator&#x3D;null, imports&#x3D;null, componentModule&#x3D;false, testCases&#x3D;{}, instanceType&#x3D;null, jsonPath&#x3D;null, arrayOutputJsonPathPiece&#x3D;null}
            // typeSchema CodegenSchema{, description&#x3D;&#x27;null&#x27;, jsonPathPiece&#x3D;&#x27;null&#x27;, defaultValue&#x3D;&#x27;null&#x27;, title&#x3D;&#x27;null&#x27;, maxLength&#x3D;null, minLength&#x3D;null, patternInfo&#x3D;&#x27;null&#x27;, example&#x3D;&#x27;null&#x27;, minimum&#x3D;&#x27;null&#x27;, maximum&#x3D;&#x27;null&#x27;, exclusiveMinimum&#x3D;null, exclusiveMaximum&#x3D;null, deprecated&#x3D;null, types&#x3D;[string], readOnly&#x3D;null, writeOnly&#x3D;null, nullable&#x3D;null, allowableValues&#x3D;null, items&#x3D;null, additionalProperties&#x3D;null, vendorExtensions&#x3D;null, hasValidation&#x3D;false, maxItems&#x3D;null, minItems&#x3D;null, maxProperties&#x3D;null, minProperties&#x3D;null, uniqueItems&#x3D;null, multipleOf&#x3D;null, xml&#x3D;null, requiredProperties&#x3D;null, optionalProperties&#x3D;null, properties&#x3D;null, refInfo&#x3D;null, schemaIsFromAdditionalProperties&#x3D;false, isBooleanSchemaTrue&#x3D;false, isBooleanSchemaFalse&#x3D;false, format&#x3D;null, dependentRequired&#x3D;null, contains&#x3D;null, allOf&#x3D;null, anyOf&#x3D;null, oneOf&#x3D;null, not&#x3D;null, externalDocumentation&#x3D;null, discriminator&#x3D;null, imports&#x3D;null, componentModule&#x3D;false, testCases&#x3D;{}, instanceType&#x3D;null, jsonPath&#x3D;null, arrayOutputJsonPathPiece&#x3D;null}
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for bar");
            }
            return (@NonNull String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class ObjectPropertiesValidationMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class ObjectPropertiesValidation1 extends JsonSchema implements NullSchemaValidator, BooleanSchemaValidator, NumberSchemaValidator, StringSchemaValidator, ListSchemaValidator<Object, FrozenList<@Nullable Object>>, MapSchemaValidator<Object, ObjectPropertiesValidationMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ObjectPropertiesValidation1 instance = null;
    
        protected ObjectPropertiesValidation1() {
            super(new JsonSchemaInfo()
                .properties(Map.ofEntries(
                    new PropertyEntry("foo", Foo.class),
                    new PropertyEntry("bar", Bar.class)
                ))
            );
        }
    
        public static ObjectPropertiesValidation1 getInstance() {
            if (instance == null) {
                instance = new ObjectPropertiesValidation1();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = new ArrayList<>();
            pathToItem.add("args[0]");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = new ArrayList<>();
            pathToItem.add("args[0]");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = new ArrayList<>();
            pathToItem.add("args[0]");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) {
            return (int) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) {
            return (long) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) {
            return (float) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = new ArrayList<>();
            pathToItem.add("args[0]");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        @Override
        public FrozenList<@Nullable Object> getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<@Nullable Object> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object castItem = (@Nullable Object) itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<@Nullable Object> newInstanceItems = new FrozenList<>(items);
            return newInstanceItems;
        }
        
        @Override
        public FrozenList<@Nullable Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public ObjectPropertiesValidationMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new RuntimeException("Invalid non-string key value");
                }
                @NonNull String propertyName = (@NonNull String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                if (!(propertyInstance instanceof Object)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (@Nullable Object) propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new ObjectPropertiesValidationMap(castProperties);
        }
        
        @Override
        public ObjectPropertiesValidationMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = new ArrayList<>();
            pathToItem.add("args[0]");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return getNewInstance(boolArg, pathToItem, pathToSchemas);
            } else if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }
}
