package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post;
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
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter1.Schema1;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter2.Schema2;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter3.Schema3;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter4.Schema4;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Fakeparametercollisions1ababselfabPostQueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Fakeparametercollisions1ababselfabPostadditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable Fakeparametercollisions1ababselfabPostadditionalProperties instance = null;
        public static Fakeparametercollisions1ababselfabPostadditionalProperties getInstance() {
            if (instance == null) {
                instance = new Fakeparametercollisions1ababselfabPostadditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class Fakeparametercollisions1ababselfabPostQueryParametersMap extends FrozenMap<@Nullable Object> {
        protected Fakeparametercollisions1ababselfabPostQueryParametersMap(FrozenMap<@Nullable Object> m) {
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
        public static Fakeparametercollisions1ababselfabPostQueryParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Fakeparametercollisions1ababselfabPostQueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public String aB() throws UnsetPropertyException {
            String key = "aB";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for aB");
            }
            return (String) value;
        }
        
        public String Ab() throws UnsetPropertyException {
            String key = "Ab";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for Ab");
            }
            return (String) value;
        }
        
        public String self() throws UnsetPropertyException {
            String key = "self";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for self");
            }
            return (String) value;
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPost1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance);
        
        default T positive1(String value) {
            var instance = getInstance();
            instance.put("1", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPost1(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostaB <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance);
        
        default T aB(String value) {
            var instance = getInstance();
            instance.put("aB", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostaB(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostAb <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance);
        
        default T Ab(String value) {
            var instance = getInstance();
            instance.put("Ab", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostAb(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostAB <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance);
        
        default T aHyphenMinusB(String value) {
            var instance = getInstance();
            instance.put("A-B", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostAB(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostself <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance);
        
        default T self(String value) {
            var instance = getInstance();
            instance.put("self", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostself(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostQueryParametersMapBuilder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForFakeparametercollisions1ababselfabPost1<Fakeparametercollisions1ababselfabPostQueryParametersMapBuilder>, SetterForFakeparametercollisions1ababselfabPostaB<Fakeparametercollisions1ababselfabPostQueryParametersMapBuilder>, SetterForFakeparametercollisions1ababselfabPostAb<Fakeparametercollisions1ababselfabPostQueryParametersMapBuilder>, SetterForFakeparametercollisions1ababselfabPostAB<Fakeparametercollisions1ababselfabPostQueryParametersMapBuilder>, SetterForFakeparametercollisions1ababselfabPostself<Fakeparametercollisions1ababselfabPostQueryParametersMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "1",
            "aB",
            "Ab",
            "A-B",
            "self"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public Fakeparametercollisions1ababselfabPostQueryParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostQueryParametersMapBuilder getBuilderAfterFakeparametercollisions1ababselfabPost1(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Fakeparametercollisions1ababselfabPostQueryParametersMapBuilder getBuilderAfterFakeparametercollisions1ababselfabPostaB(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Fakeparametercollisions1ababselfabPostQueryParametersMapBuilder getBuilderAfterFakeparametercollisions1ababselfabPostAb(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Fakeparametercollisions1ababselfabPostQueryParametersMapBuilder getBuilderAfterFakeparametercollisions1ababselfabPostAB(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Fakeparametercollisions1ababselfabPostQueryParametersMapBuilder getBuilderAfterFakeparametercollisions1ababselfabPostself(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface Fakeparametercollisions1ababselfabPostQueryParameters1Boxed permits Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap(Fakeparametercollisions1ababselfabPostQueryParametersMap data) implements Fakeparametercollisions1ababselfabPostQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Fakeparametercollisions1ababselfabPostQueryParameters1 extends JsonSchema<Fakeparametercollisions1ababselfabPostQueryParameters1Boxed> implements MapSchemaValidator<Fakeparametercollisions1ababselfabPostQueryParametersMap, Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap> {
        private static @Nullable Fakeparametercollisions1ababselfabPostQueryParameters1 instance = null;
    
        protected Fakeparametercollisions1ababselfabPostQueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("1", Schema0.Schema01.class),
                    new PropertyEntry("aB", Schema1.Schema11.class),
                    new PropertyEntry("Ab", Schema2.Schema21.class),
                    new PropertyEntry("A-B", Schema4.Schema41.class),
                    new PropertyEntry("self", Schema3.Schema31.class)
                ))
                .additionalProperties(Fakeparametercollisions1ababselfabPostadditionalProperties.class)
            );
        }
    
        public static Fakeparametercollisions1ababselfabPostQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new Fakeparametercollisions1ababselfabPostQueryParameters1();
            }
            return instance;
        }
        
        public Fakeparametercollisions1ababselfabPostQueryParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new Fakeparametercollisions1ababselfabPostQueryParametersMap(castProperties);
        }
        
        public Fakeparametercollisions1ababselfabPostQueryParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public Fakeparametercollisions1ababselfabPostQueryParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
