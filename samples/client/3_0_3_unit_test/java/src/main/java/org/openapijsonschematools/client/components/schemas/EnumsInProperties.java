package org.openapijsonschematools.client.components.schemas;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.validation.EnumValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.SchemaMapValidator;
import org.openapijsonschematools.client.schemas.validation.SchemaStringValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class EnumsInProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Foo extends JsonSchema implements SchemaStringValidator {
        public Foo() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    "foo"
                )))
            )));
        }
    
        @Override
        public String castToAllowedTypes(String arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedStringTypes(arg, pathToItem, pathSet);
        }
    
        @Override
        public String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }
    
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
    
    }    
    
    public static class Bar extends JsonSchema implements SchemaStringValidator {
        public Bar() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    "bar"
                )))
            )));
        }
    
        @Override
        public String castToAllowedTypes(String arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedStringTypes(arg, pathToItem, pathSet);
        }
    
        @Override
        public String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }
    
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
    
    }    
    
    public static class EnumsInPropertiesMap extends FrozenMap<String, Object> {
        EnumsInPropertiesMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "bar"
        );
        public static final Set<String> optionalKeys = Set.of(
            "foo"
        );
        public static EnumsInPropertiesMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(EnumsInProperties1.class).validate(arg, configuration);
        }
        
        public String bar() {
            return (String) get("bar");
        }
        
        public String foo() {
            String key = "foo";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class EnumsInPropertiesMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class EnumsInProperties1 extends JsonSchema implements SchemaMapValidator<Object, Object, EnumsInPropertiesMap<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public EnumsInProperties1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("foo", Foo.class),
                    new PropertyEntry("bar", Bar.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "bar"
                )))
            )));
        }
        
        @Override
        protected EnumsInPropertiesMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new EnumsInPropertiesMap(arg);
        }
        public EnumsInPropertiesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
