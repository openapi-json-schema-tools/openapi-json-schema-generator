package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.DefaultValueMethod;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Animal {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ClassName extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable ClassName instance = null;
        public static ClassName getInstance() {
            if (instance == null) {
                instance = new ClassName();
            }
            return instance;
        }
    }
    
    
    public sealed interface ColorBoxed permits ColorBoxedString {
        @Nullable Object getData();
    }
    
    public record ColorBoxedString(String data) implements ColorBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Color extends JsonSchema<ColorBoxed> implements StringSchemaValidator<ColorBoxedString>, DefaultValueMethod<String> {
        private static @Nullable Color instance = null;
    
        protected Color() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .defaultValue("red")
            );
        }
    
        public static Color getInstance() {
            if (instance == null) {
                instance = new Color();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        public String defaultValue() throws InvalidTypeException {
            if (defaultValue instanceof String) {
                return (String) defaultValue;
            }
            throw new InvalidTypeException("Invalid type stored in defaultValue");
        }
        @Override
        public ColorBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ColorBoxedString(validate(arg, configuration));
        }
        @Override
        public ColorBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class AnimalMap extends FrozenMap<@Nullable Object> {
        protected AnimalMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "className"
        );
        public static final Set<String> optionalKeys = Set.of(
            "color"
        );
        public static AnimalMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return Animal1.getInstance().validate(arg, configuration);
        }
        
        public String className() {
                        @Nullable Object value = get("className");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for className");
            }
            return (String) value;
        }
        
        public String color() throws UnsetPropertyException {
            String key = "color";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for color");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForClassName <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterClassName(Map<String, @Nullable Object> instance);
        
        default T className(String value) {
            var instance = getInstance();
            instance.put("className", value);
            return getBuilderAfterClassName(instance);
        }
    }
    
    public interface SetterForColor <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterColor(Map<String, @Nullable Object> instance);
        
        default T color(String value) {
            var instance = getInstance();
            instance.put("color", value);
            return getBuilderAfterColor(instance);
        }
    }
    
    public static class AnimalMap0Builder extends UnsetAddPropsSetter<AnimalMap0Builder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForColor<AnimalMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "className",
            "color"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public AnimalMap0Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AnimalMap0Builder getBuilderAfterColor(Map<String, @Nullable Object> instance) {
            return this;
        }
        public AnimalMap0Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class AnimalMapBuilder implements SetterForClassName<AnimalMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        public AnimalMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AnimalMap0Builder getBuilderAfterClassName(Map<String, @Nullable Object> instance) {
            return new AnimalMap0Builder(instance);
        }
    }
    
    
    public sealed interface Animal1Boxed permits Animal1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Animal1BoxedMap(AnimalMap data) implements Animal1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Animal1 extends JsonSchema<Animal1Boxed> implements MapSchemaValidator<AnimalMap, Animal1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable Animal1 instance = null;
    
        protected Animal1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("className", ClassName.class),
                    new PropertyEntry("color", Color.class)
                ))
                .required(Set.of(
                    "className"
                ))
            );
        }
    
        public static Animal1 getInstance() {
            if (instance == null) {
                instance = new Animal1();
            }
            return instance;
        }
        
        public AnimalMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new RuntimeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new AnimalMap(castProperties);
        }
        
        public AnimalMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        @Override
        public Animal1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Animal1BoxedMap(validate(arg, configuration));
        }
        @Override
        public Animal1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
