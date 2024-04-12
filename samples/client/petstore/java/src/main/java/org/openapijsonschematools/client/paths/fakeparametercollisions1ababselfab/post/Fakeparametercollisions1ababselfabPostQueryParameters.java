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
    
    
    public static class Fakeparametercollisions1ababselfabPostQueryParameters8 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable Fakeparametercollisions1ababselfabPostQueryParameters8 instance = null;
        public static Fakeparametercollisions1ababselfabPostQueryParameters8 getInstance() {
            if (instance == null) {
                instance = new Fakeparametercollisions1ababselfabPostQueryParameters8();
            }
            return instance;
        }
    }
    
    
    public static class Fakeparametercollisions1ababselfabPostQueryParameters13 extends FrozenMap<@Nullable Object> {
        protected Fakeparametercollisions1ababselfabPostQueryParameters13(FrozenMap<@Nullable Object> m) {
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
        public static Fakeparametercollisions1ababselfabPostQueryParameters13 of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
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
    
    public interface SetterForFakeparametercollisions1ababselfabPostQueryParameters2 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters2(Map<String, @Nullable Object> instance);
        
        default T positive1(String value) {
            var instance = getInstance();
            instance.put("1", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters2(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostQueryParameters3 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters3(Map<String, @Nullable Object> instance);
        
        default T aB(String value) {
            var instance = getInstance();
            instance.put("aB", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters3(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostQueryParameters4 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters4(Map<String, @Nullable Object> instance);
        
        default T Ab(String value) {
            var instance = getInstance();
            instance.put("Ab", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters4(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostQueryParameters5 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters5(Map<String, @Nullable Object> instance);
        
        default T aHyphenMinusB(String value) {
            var instance = getInstance();
            instance.put("A-B", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters5(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostQueryParameters6 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters6(Map<String, @Nullable Object> instance);
        
        default T self(String value) {
            var instance = getInstance();
            instance.put("self", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters6(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostQueryParameters12 implements GenericBuilder<Map<String, @Nullable Object>>, SetterForFakeparametercollisions1ababselfabPostQueryParameters2<Fakeparametercollisions1ababselfabPostQueryParameters12>, SetterForFakeparametercollisions1ababselfabPostQueryParameters3<Fakeparametercollisions1ababselfabPostQueryParameters12>, SetterForFakeparametercollisions1ababselfabPostQueryParameters4<Fakeparametercollisions1ababselfabPostQueryParameters12>, SetterForFakeparametercollisions1ababselfabPostQueryParameters5<Fakeparametercollisions1ababselfabPostQueryParameters12>, SetterForFakeparametercollisions1ababselfabPostQueryParameters6<Fakeparametercollisions1ababselfabPostQueryParameters12> {
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
        public Fakeparametercollisions1ababselfabPostQueryParameters12() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostQueryParameters12 getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters2(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Fakeparametercollisions1ababselfabPostQueryParameters12 getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters3(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Fakeparametercollisions1ababselfabPostQueryParameters12 getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters4(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Fakeparametercollisions1ababselfabPostQueryParameters12 getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters5(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Fakeparametercollisions1ababselfabPostQueryParameters12 getBuilderAfterFakeparametercollisions1ababselfabPostQueryParameters6(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface Fakeparametercollisions1ababselfabPostQueryParameters1Boxed permits Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap(Fakeparametercollisions1ababselfabPostQueryParameters13 data) implements Fakeparametercollisions1ababselfabPostQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Fakeparametercollisions1ababselfabPostQueryParameters1 extends JsonSchema<Fakeparametercollisions1ababselfabPostQueryParameters1Boxed> implements MapSchemaValidator<Fakeparametercollisions1ababselfabPostQueryParameters13, Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap> {
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
                .additionalProperties(Fakeparametercollisions1ababselfabPostQueryParameters8.class)
            );
        }
    
        public static Fakeparametercollisions1ababselfabPostQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new Fakeparametercollisions1ababselfabPostQueryParameters1();
            }
            return instance;
        }
        
        public Fakeparametercollisions1ababselfabPostQueryParameters13 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new Fakeparametercollisions1ababselfabPostQueryParameters13(castProperties);
        }
        
        public Fakeparametercollisions1ababselfabPostQueryParameters13 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
