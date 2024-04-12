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
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter14.Schema14;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter15.Schema15;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter16.Schema16;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter17.Schema17;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter18.Schema18;
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

public class Fakeparametercollisions1ababselfabPostCookieParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Fakeparametercollisions1ababselfabPostCookieParameters8 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable Fakeparametercollisions1ababselfabPostCookieParameters8 instance = null;
        public static Fakeparametercollisions1ababselfabPostCookieParameters8 getInstance() {
            if (instance == null) {
                instance = new Fakeparametercollisions1ababselfabPostCookieParameters8();
            }
            return instance;
        }
    }
    
    
    public static class Fakeparametercollisions1ababselfabPostCookieParameters13 extends FrozenMap<@Nullable Object> {
        protected Fakeparametercollisions1ababselfabPostCookieParameters13(FrozenMap<@Nullable Object> m) {
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
        public static Fakeparametercollisions1ababselfabPostCookieParameters13 of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Fakeparametercollisions1ababselfabPostCookieParameters1.getInstance().validate(arg, configuration);
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
    
    public interface SetterForFakeparametercollisions1ababselfabPostCookieParameters2 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters2(Map<String, @Nullable Object> instance);
        
        default T positive1(String value) {
            var instance = getInstance();
            instance.put("1", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters2(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostCookieParameters3 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters3(Map<String, @Nullable Object> instance);
        
        default T aB(String value) {
            var instance = getInstance();
            instance.put("aB", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters3(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostCookieParameters4 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters4(Map<String, @Nullable Object> instance);
        
        default T Ab(String value) {
            var instance = getInstance();
            instance.put("Ab", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters4(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostCookieParameters5 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters5(Map<String, @Nullable Object> instance);
        
        default T aHyphenMinusB(String value) {
            var instance = getInstance();
            instance.put("A-B", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters5(instance);
        }
    }
    
    public interface SetterForFakeparametercollisions1ababselfabPostCookieParameters6 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters6(Map<String, @Nullable Object> instance);
        
        default T self(String value) {
            var instance = getInstance();
            instance.put("self", value);
            return getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters6(instance);
        }
    }
    
    public static class Fakeparametercollisions1ababselfabPostCookieParameters12 implements GenericBuilder<Map<String, @Nullable Object>>, SetterForFakeparametercollisions1ababselfabPostCookieParameters2<Fakeparametercollisions1ababselfabPostCookieParameters12>, SetterForFakeparametercollisions1ababselfabPostCookieParameters3<Fakeparametercollisions1ababselfabPostCookieParameters12>, SetterForFakeparametercollisions1ababselfabPostCookieParameters4<Fakeparametercollisions1ababselfabPostCookieParameters12>, SetterForFakeparametercollisions1ababselfabPostCookieParameters5<Fakeparametercollisions1ababselfabPostCookieParameters12>, SetterForFakeparametercollisions1ababselfabPostCookieParameters6<Fakeparametercollisions1ababselfabPostCookieParameters12> {
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
        public Fakeparametercollisions1ababselfabPostCookieParameters12() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Fakeparametercollisions1ababselfabPostCookieParameters12 getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters2(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Fakeparametercollisions1ababselfabPostCookieParameters12 getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters3(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Fakeparametercollisions1ababselfabPostCookieParameters12 getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters4(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Fakeparametercollisions1ababselfabPostCookieParameters12 getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters5(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Fakeparametercollisions1ababselfabPostCookieParameters12 getBuilderAfterFakeparametercollisions1ababselfabPostCookieParameters6(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface Fakeparametercollisions1ababselfabPostCookieParameters1Boxed permits Fakeparametercollisions1ababselfabPostCookieParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Fakeparametercollisions1ababselfabPostCookieParameters1BoxedMap(Fakeparametercollisions1ababselfabPostCookieParameters13 data) implements Fakeparametercollisions1ababselfabPostCookieParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Fakeparametercollisions1ababselfabPostCookieParameters1 extends JsonSchema<Fakeparametercollisions1ababselfabPostCookieParameters1Boxed> implements MapSchemaValidator<Fakeparametercollisions1ababselfabPostCookieParameters13, Fakeparametercollisions1ababselfabPostCookieParameters1BoxedMap> {
        private static @Nullable Fakeparametercollisions1ababselfabPostCookieParameters1 instance = null;
    
        protected Fakeparametercollisions1ababselfabPostCookieParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("1", Schema14.Schema141.class),
                    new PropertyEntry("aB", Schema15.Schema151.class),
                    new PropertyEntry("Ab", Schema16.Schema161.class),
                    new PropertyEntry("A-B", Schema18.Schema181.class),
                    new PropertyEntry("self", Schema17.Schema171.class)
                ))
                .additionalProperties(Fakeparametercollisions1ababselfabPostCookieParameters8.class)
            );
        }
    
        public static Fakeparametercollisions1ababselfabPostCookieParameters1 getInstance() {
            if (instance == null) {
                instance = new Fakeparametercollisions1ababselfabPostCookieParameters1();
            }
            return instance;
        }
        
        public Fakeparametercollisions1ababselfabPostCookieParameters13 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new Fakeparametercollisions1ababselfabPostCookieParameters13(castProperties);
        }
        
        public Fakeparametercollisions1ababselfabPostCookieParameters13 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public Fakeparametercollisions1ababselfabPostCookieParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new Fakeparametercollisions1ababselfabPostCookieParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public Fakeparametercollisions1ababselfabPostCookieParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
