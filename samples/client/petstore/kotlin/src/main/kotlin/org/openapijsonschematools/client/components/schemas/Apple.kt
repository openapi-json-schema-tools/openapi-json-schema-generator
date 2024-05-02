package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Apple {
    // nest classes so all schemas and input/output classes can be public
    
    
    public sealed interface CultivarBoxed permits CultivarBoxedString {
        @Nullable Object getData();
    }
    
    public record CultivarBoxedString(String data) implements CultivarBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Cultivar extends JsonSchema<CultivarBoxed> implements StringSchemaValidator<CultivarBoxedString> {
        private static @Nullable Cultivar instance = null;
    
        protected Cultivar() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .pattern(Pattern.compile(
                    "^[a-zA-Z\\s]*$"
                ))
            );
        }
    
        public static Cultivar getInstance() {
            if (instance == null) {
                instance = new Cultivar();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public CultivarBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new CultivarBoxedString(validate(arg, configuration));
        }
        @Override
        public CultivarBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public sealed interface OriginBoxed permits OriginBoxedString {
        @Nullable Object getData();
    }
    
    public record OriginBoxedString(String data) implements OriginBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Origin extends JsonSchema<OriginBoxed> implements StringSchemaValidator<OriginBoxedString> {
        private static @Nullable Origin instance = null;
    
        protected Origin() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .pattern(Pattern.compile(
                    "^[A-Z\\s]*$",
                    Pattern.CASE_INSENSITIVE
                ))
            );
        }
    
        public static Origin getInstance() {
            if (instance == null) {
                instance = new Origin();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public OriginBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new OriginBoxedString(validate(arg, configuration));
        }
        @Override
        public OriginBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class AppleMap extends FrozenMap<@Nullable Object> {
        protected AppleMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "cultivar"
        );
        public static final Set<String> optionalKeys = Set.of(
            "origin"
        );
        public static AppleMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Apple1.getInstance().validate(arg, configuration);
        }
        
        public String cultivar() {
                        @Nullable Object value = get("cultivar");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for cultivar");
            }
            return (String) value;
        }
        
        public String origin() throws UnsetPropertyException {
            String key = "origin";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for origin");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForCultivar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCultivar(Map<String, @Nullable Object> instance);
        
        default T cultivar(String value) {
            var instance = getInstance();
            instance.put("cultivar", value);
            return getBuilderAfterCultivar(instance);
        }
    }
    
    public interface SetterForOrigin <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterOrigin(Map<String, @Nullable Object> instance);
        
        default T origin(String value) {
            var instance = getInstance();
            instance.put("origin", value);
            return getBuilderAfterOrigin(instance);
        }
    }
    
    public static class AppleMap0Builder extends UnsetAddPropsSetter<AppleMap0Builder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForOrigin<AppleMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "cultivar",
            "origin"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public AppleMap0Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AppleMap0Builder getBuilderAfterOrigin(Map<String, @Nullable Object> instance) {
            return this;
        }
        public AppleMap0Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class AppleMapBuilder implements SetterForCultivar<AppleMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        public AppleMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AppleMap0Builder getBuilderAfterCultivar(Map<String, @Nullable Object> instance) {
            return new AppleMap0Builder(instance);
        }
    }
    
    
    public sealed interface Apple1Boxed permits Apple1BoxedNothing?, Apple1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Apple1BoxedVoid(Nothing? data) implements Apple1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record Apple1BoxedMap(AppleMap data) implements Apple1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Apple1 extends JsonSchema<Apple1Boxed> implements NullSchemaValidator<Apple1BoxedVoid>, MapSchemaValidator<AppleMap, Apple1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable Apple1 instance = null;
    
        protected Apple1() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Nothing?.class,
                    Map.class
                ))
                .properties(Map.ofEntries(
                    new PropertyEntry("cultivar", Cultivar.class),
                    new PropertyEntry("origin", Origin.class)
                ))
                .required(Set.of(
                    "cultivar"
                ))
            );
        }
    
        public static Apple1 getInstance() {
            if (instance == null) {
                instance = new Apple1();
            }
            return instance;
        }
        
        @Override
        public Nothing? validate(Nothing? arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Nothing? castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public AppleMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
                LinkedHashMap<JsonSchema<?>, Nothing?> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new AppleMap(castProperties);
        }
        
        public AppleMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                return validate((Nothing?) null, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Nothing?) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public Apple1BoxedVoid validateAndBox(Nothing? arg, SchemaConfiguration configuration) throws ValidationException {
            return new Apple1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public Apple1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new Apple1BoxedMap(validate(arg, configuration));
        }
        @Override
        public Apple1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Nothing? castArg = (Nothing?) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
