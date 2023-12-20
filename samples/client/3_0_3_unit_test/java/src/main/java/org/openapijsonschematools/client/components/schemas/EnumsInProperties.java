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
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class EnumsInProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Foo extends JsonSchema implements StringSchemaValidator {
        private static @Nullable Foo instance = null;
    
        protected Foo() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "foo"
                ))
            );
        }
    
        public static Foo getInstance() {
            if (instance == null) {
                instance = new Foo();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class Bar extends JsonSchema implements StringSchemaValidator {
        private static @Nullable Bar instance = null;
    
        protected Bar() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "bar"
                ))
            );
        }
    
        public static Bar getInstance() {
            if (instance == null) {
                instance = new Bar();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class EnumsInPropertiesMap extends FrozenMap<@Nullable Object> {
        protected EnumsInPropertiesMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "bar"
        );
        public static final Set<String> optionalKeys = Set.of(
            "foo"
        );
        public static EnumsInPropertiesMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return EnumsInProperties1.getInstance().validate(arg, configuration);
        }
        
        public @NonNull String bar() {
                        @Nullable Object value = get("bar");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for bar");
            }
            return (@NonNull String) value;
        }
        
        public @NonNull String foo() throws UnsetPropertyException {
            String key = "foo";
            throwIfKeyNotPresent(key);
            // mapValueSchema.typeSchema CodegenSchema{, description&#x3D;&#x27;null&#x27;, jsonPathPiece&#x3D;&#x27;null&#x27;, defaultValue&#x3D;&#x27;null&#x27;, title&#x3D;&#x27;null&#x27;, maxLength&#x3D;null, minLength&#x3D;null, patternInfo&#x3D;&#x27;null&#x27;, example&#x3D;&#x27;null&#x27;, minimum&#x3D;&#x27;null&#x27;, maximum&#x3D;&#x27;null&#x27;, exclusiveMinimum&#x3D;null, exclusiveMaximum&#x3D;null, deprecated&#x3D;null, types&#x3D;null, readOnly&#x3D;null, writeOnly&#x3D;null, nullable&#x3D;null, allowableValues&#x3D;null, items&#x3D;null, additionalProperties&#x3D;null, vendorExtensions&#x3D;null, hasValidation&#x3D;false, maxItems&#x3D;null, minItems&#x3D;null, maxProperties&#x3D;null, minProperties&#x3D;null, uniqueItems&#x3D;null, multipleOf&#x3D;null, xml&#x3D;null, requiredProperties&#x3D;null, optionalProperties&#x3D;null, properties&#x3D;null, refInfo&#x3D;null, schemaIsFromAdditionalProperties&#x3D;false, isBooleanSchemaTrue&#x3D;false, isBooleanSchemaFalse&#x3D;false, format&#x3D;null, dependentRequired&#x3D;null, contains&#x3D;null, allOf&#x3D;null, anyOf&#x3D;null, oneOf&#x3D;null, not&#x3D;null, externalDocumentation&#x3D;null, discriminator&#x3D;null, imports&#x3D;null, componentModule&#x3D;false, testCases&#x3D;{}, instanceType&#x3D;null, jsonPath&#x3D;null, arrayOutputJsonPathPiece&#x3D;null}
            // typeSchema CodegenSchema{, description&#x3D;&#x27;null&#x27;, jsonPathPiece&#x3D;&#x27;null&#x27;, defaultValue&#x3D;&#x27;null&#x27;, title&#x3D;&#x27;null&#x27;, maxLength&#x3D;null, minLength&#x3D;null, patternInfo&#x3D;&#x27;null&#x27;, example&#x3D;&#x27;null&#x27;, minimum&#x3D;&#x27;null&#x27;, maximum&#x3D;&#x27;null&#x27;, exclusiveMinimum&#x3D;null, exclusiveMaximum&#x3D;null, deprecated&#x3D;null, types&#x3D;[string], readOnly&#x3D;null, writeOnly&#x3D;null, nullable&#x3D;null, allowableValues&#x3D;org.openapijsonschematools.codegen.generators.openapimodels.EnumInfo@b5093a57, items&#x3D;null, additionalProperties&#x3D;null, vendorExtensions&#x3D;null, hasValidation&#x3D;false, maxItems&#x3D;null, minItems&#x3D;null, maxProperties&#x3D;null, minProperties&#x3D;null, uniqueItems&#x3D;null, multipleOf&#x3D;null, xml&#x3D;null, requiredProperties&#x3D;null, optionalProperties&#x3D;null, properties&#x3D;null, refInfo&#x3D;null, schemaIsFromAdditionalProperties&#x3D;false, isBooleanSchemaTrue&#x3D;false, isBooleanSchemaFalse&#x3D;false, format&#x3D;null, dependentRequired&#x3D;null, contains&#x3D;null, allOf&#x3D;null, anyOf&#x3D;null, oneOf&#x3D;null, not&#x3D;null, externalDocumentation&#x3D;null, discriminator&#x3D;null, imports&#x3D;null, componentModule&#x3D;false, testCases&#x3D;{}, instanceType&#x3D;null, jsonPath&#x3D;null, arrayOutputJsonPathPiece&#x3D;null}
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for foo");
            }
            return (@NonNull String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class EnumsInPropertiesMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class EnumsInProperties1 extends JsonSchema implements MapSchemaValidator<Object, EnumsInPropertiesMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable EnumsInProperties1 instance = null;
    
        protected EnumsInProperties1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("foo", Foo.class),
                    new PropertyEntry("bar", Bar.class)
                ))
                .required(Set.of(
                    "bar"
                ))
            );
        }
    
        public static EnumsInProperties1 getInstance() {
            if (instance == null) {
                instance = new EnumsInProperties1();
            }
            return instance;
        }
        
        public EnumsInPropertiesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                @NonNull String propertyName;
                if (entryKey instanceof String) {
                    propertyName = (@NonNull String) entryKey;
                } else {
                    throw new RuntimeException("Invalid non-string key value");
                }
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object castValue = (@Nullable Object) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new EnumsInPropertiesMap(castProperties);
        }
        
        @Override
        public EnumsInPropertiesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
