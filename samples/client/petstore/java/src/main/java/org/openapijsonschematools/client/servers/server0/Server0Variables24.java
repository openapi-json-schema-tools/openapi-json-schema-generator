package org.openapijsonschematools.client.servers.server0;
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
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.validation.DefaultValueMethod;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringEnumValidator;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.StringValueMethod;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Server0Variables {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Server0Variables13 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable Server0Variables13 instance = null;
        public static Server0Variables13 getInstance() {
            if (instance == null) {
                instance = new Server0Variables13();
            }
            return instance;
        }
    }
    
    public enum StringServer0Variables6 implements StringValueMethod {
        PETSTORE("petstore"),
        QA_HYPHEN_MINUS_PETSTORE("qa-petstore"),
        DEV_HYPHEN_MINUS_PETSTORE("dev-petstore");
        private final String value;
    
        StringServer0Variables6(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface Server0Variables4Boxed permits Server0Variables4BoxedString {
        @Nullable Object getData();
    }
    
    public record Server0Variables4BoxedString(String data) implements Server0Variables4Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Server0Variables4 extends JsonSchema<Server0Variables4Boxed> implements StringSchemaValidator<Server0Variables4BoxedString>, StringEnumValidator<StringServer0Variables6>, DefaultValueMethod<String> {
        private static @Nullable Server0Variables4 instance = null;
    
        protected Server0Variables4() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "petstore",
                    "qa-petstore",
                    "dev-petstore"
                ))
                .defaultValue("petstore")
            );
        }
    
        public static Server0Variables4 getInstance() {
            if (instance == null) {
                instance = new Server0Variables4();
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
        public String validate(StringServer0Variables6 arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
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
        public String defaultValue() throws ValidationException {
            if (defaultValue instanceof String) {
                return (String) defaultValue;
            }
            throw new ValidationException("Invalid type stored in defaultValue");
        }
        @Override
        public Server0Variables4BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new Server0Variables4BoxedString(validate(arg, configuration));
        }
        @Override
        public Server0Variables4Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    public enum StringServer0Variables10 implements StringValueMethod {
        POSITIVE_80("80"),
        POSITIVE_8080("8080");
        private final String value;
    
        StringServer0Variables10(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface Server0Variables8Boxed permits Server0Variables8BoxedString {
        @Nullable Object getData();
    }
    
    public record Server0Variables8BoxedString(String data) implements Server0Variables8Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Server0Variables8 extends JsonSchema<Server0Variables8Boxed> implements StringSchemaValidator<Server0Variables8BoxedString>, StringEnumValidator<StringServer0Variables10>, DefaultValueMethod<String> {
        private static @Nullable Server0Variables8 instance = null;
    
        protected Server0Variables8() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "80",
                    "8080"
                ))
                .defaultValue("80")
            );
        }
    
        public static Server0Variables8 getInstance() {
            if (instance == null) {
                instance = new Server0Variables8();
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
        public String validate(StringServer0Variables10 arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
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
        public String defaultValue() throws ValidationException {
            if (defaultValue instanceof String) {
                return (String) defaultValue;
            }
            throw new ValidationException("Invalid type stored in defaultValue");
        }
        @Override
        public Server0Variables8BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new Server0Variables8BoxedString(validate(arg, configuration));
        }
        @Override
        public Server0Variables8Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class Server0Variables20 extends FrozenMap<String> {
        protected Server0Variables20(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "port",
            "server"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static Server0Variables20 of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return Server0Variables1.getInstance().validate(arg, configuration);
        }
        
        public String port() {
                        String value = get("port");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for port");
            }
            return (String) value;
        }
        
        public String server() {
                        String value = get("server");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for server");
            }
            return (String) value;
        }
    }
    
    public interface SetterForServer0Variables8 <T> {
        Map<String, String> getInstance();
        T getBuilderAfterServer0Variables8(Map<String, String> instance);
        
        default T port(String value) {
            var instance = getInstance();
            instance.put("port", value);
            return getBuilderAfterServer0Variables8(instance);
        }
        
        default T port(StringServer0Variables10 value) {
            var instance = getInstance();
            instance.put("port", value.value());
            return getBuilderAfterServer0Variables8(instance);
        }
    }
    
    public interface SetterForServer0Variables4 <T> {
        Map<String, String> getInstance();
        T getBuilderAfterServer0Variables4(Map<String, String> instance);
        
        default T server(String value) {
            var instance = getInstance();
            instance.put("server", value);
            return getBuilderAfterServer0Variables4(instance);
        }
        
        default T server(StringServer0Variables6 value) {
            var instance = getInstance();
            instance.put("server", value.value());
            return getBuilderAfterServer0Variables4(instance);
        }
    }
    
    public static class Server0Variables21 implements GenericBuilder<Map<String, String>> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "port",
            "server"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public Server0Variables21(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> build() {
            return instance;
        }
    }
    
    public static class Server0Variables22 implements SetterForServer0Variables4<Server0Variables21> {
        private final Map<String, String> instance;
        public Server0Variables22(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public Server0Variables21 getBuilderAfterServer0Variables4(Map<String, String> instance) {
            return new Server0Variables21(instance);
        }
    }
    
    public static class Server0Variables23 implements SetterForServer0Variables8<Server0Variables21> {
        private final Map<String, String> instance;
        public Server0Variables23(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public Server0Variables21 getBuilderAfterServer0Variables8(Map<String, String> instance) {
            return new Server0Variables21(instance);
        }
    }
    
    public static class Server0Variables19 implements SetterForServer0Variables8<Server0Variables22>, SetterForServer0Variables4<Server0Variables23> {
        private final Map<String, String> instance;
        public Server0Variables19() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public Server0Variables22 getBuilderAfterServer0Variables8(Map<String, String> instance) {
            return new Server0Variables22(instance);
        }
        public Server0Variables23 getBuilderAfterServer0Variables4(Map<String, String> instance) {
            return new Server0Variables23(instance);
        }
    }
    
    
    public sealed interface Server0Variables1Boxed permits Server0Variables1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Server0Variables1BoxedMap(Server0Variables20 data) implements Server0Variables1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Server0Variables1 extends JsonSchema<Server0Variables1Boxed> implements MapSchemaValidator<Server0Variables20, Server0Variables1BoxedMap> {
        private static @Nullable Server0Variables1 instance = null;
    
        protected Server0Variables1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("server", Server0Variables4.class),
                    new PropertyEntry("port", Server0Variables8.class)
                ))
                .required(Set.of(
                    "port",
                    "server"
                ))
                .additionalProperties(Server0Variables13.class)
            );
        }
    
        public static Server0Variables1 getInstance() {
            if (instance == null) {
                instance = new Server0Variables1();
            }
            return instance;
        }
        
        public Server0Variables20 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, String> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof String)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (String) propertyInstance);
            }
            FrozenMap<String> castProperties = new FrozenMap<>(properties);
            return new Server0Variables20(castProperties);
        }
        
        public Server0Variables20 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public Server0Variables1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new Server0Variables1BoxedMap(validate(arg, configuration));
        }
        @Override
        public Server0Variables1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
