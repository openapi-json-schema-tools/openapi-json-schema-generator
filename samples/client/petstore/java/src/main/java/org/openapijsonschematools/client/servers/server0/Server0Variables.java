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
    
    
    public static class Server0Variables9 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable Server0Variables9 instance = null;
        public static Server0Variables9 getInstance() {
            if (instance == null) {
                instance = new Server0Variables9();
            }
            return instance;
        }
    }
    
    public enum StringServer0Variables3 implements StringValueMethod {
        PETSTORE("petstore"),
        QA_HYPHEN_MINUS_PETSTORE("qa-petstore"),
        DEV_HYPHEN_MINUS_PETSTORE("dev-petstore");
        private final String value;
    
        StringServer0Variables3(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface Server0Variables2Boxed permits Server0Variables2BoxedString {
        @Nullable Object getData();
    }
    
    public record Server0Variables2BoxedString(String data) implements Server0Variables2Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Server0Variables2 extends JsonSchema<Server0Variables2Boxed> implements StringSchemaValidator<Server0Variables2BoxedString>, StringEnumValidator<StringServer0Variables3>, DefaultValueMethod<String> {
        private static @Nullable Server0Variables2 instance = null;
    
        protected Server0Variables2() {
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
    
        public static Server0Variables2 getInstance() {
            if (instance == null) {
                instance = new Server0Variables2();
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
        public String validate(StringServer0Variables3 arg,SchemaConfiguration configuration) throws ValidationException {
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
        public Server0Variables2BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new Server0Variables2BoxedString(validate(arg, configuration));
        }
        @Override
        public Server0Variables2Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    public enum StringServer0Variables6 implements StringValueMethod {
        POSITIVE_80("80"),
        POSITIVE_8080("8080");
        private final String value;
    
        StringServer0Variables6(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface Server0Variables5Boxed permits Server0Variables5BoxedString {
        @Nullable Object getData();
    }
    
    public record Server0Variables5BoxedString(String data) implements Server0Variables5Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Server0Variables5 extends JsonSchema<Server0Variables5Boxed> implements StringSchemaValidator<Server0Variables5BoxedString>, StringEnumValidator<StringServer0Variables6>, DefaultValueMethod<String> {
        private static @Nullable Server0Variables5 instance = null;
    
        protected Server0Variables5() {
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
    
        public static Server0Variables5 getInstance() {
            if (instance == null) {
                instance = new Server0Variables5();
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
        public Server0Variables5BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new Server0Variables5BoxedString(validate(arg, configuration));
        }
        @Override
        public Server0Variables5Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class Server0Variables14 extends FrozenMap<String> {
        protected Server0Variables14(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "port",
            "server"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static Server0Variables14 of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
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
    
    public interface SetterForServer0Variables5 <T> {
        Map<String, String> getInstance();
        T getBuilderAfterServer0Variables5(Map<String, String> instance);
        
        default T port(String value) {
            var instance = getInstance();
            instance.put("port", value);
            return getBuilderAfterServer0Variables5(instance);
        }
        
        default T port(StringServer0Variables6 value) {
            var instance = getInstance();
            instance.put("port", value.value());
            return getBuilderAfterServer0Variables5(instance);
        }
    }
    
    public interface SetterForServer0Variables2 <T> {
        Map<String, String> getInstance();
        T getBuilderAfterServer0Variables2(Map<String, String> instance);
        
        default T server(String value) {
            var instance = getInstance();
            instance.put("server", value);
            return getBuilderAfterServer0Variables2(instance);
        }
        
        default T server(StringServer0Variables3 value) {
            var instance = getInstance();
            instance.put("server", value.value());
            return getBuilderAfterServer0Variables2(instance);
        }
    }
    
    public static class Server0Variables15 implements GenericBuilder<Map<String, String>> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "port",
            "server"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public Server0Variables15(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> build() {
            return instance;
        }
    }
    
    public static class Server0Variables16 implements SetterForServer0Variables2<Server0Variables15> {
        private final Map<String, String> instance;
        public Server0Variables16(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public Server0Variables15 getBuilderAfterServer0Variables2(Map<String, String> instance) {
            return new Server0Variables15(instance);
        }
    }
    
    public static class Server0Variables17 implements SetterForServer0Variables5<Server0Variables15> {
        private final Map<String, String> instance;
        public Server0Variables17(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public Server0Variables15 getBuilderAfterServer0Variables5(Map<String, String> instance) {
            return new Server0Variables15(instance);
        }
    }
    
    public static class Server0Variables13 implements SetterForServer0Variables5<Server0Variables16>, SetterForServer0Variables2<Server0Variables17> {
        private final Map<String, String> instance;
        public Server0Variables13() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public Server0Variables16 getBuilderAfterServer0Variables5(Map<String, String> instance) {
            return new Server0Variables16(instance);
        }
        public Server0Variables17 getBuilderAfterServer0Variables2(Map<String, String> instance) {
            return new Server0Variables17(instance);
        }
    }
    
    
    public sealed interface Server0Variables1Boxed permits Server0Variables1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Server0Variables1BoxedMap(Server0Variables14 data) implements Server0Variables1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Server0Variables1 extends JsonSchema<Server0Variables1Boxed> implements MapSchemaValidator<Server0Variables14, Server0Variables1BoxedMap> {
        private static @Nullable Server0Variables1 instance = null;
    
        protected Server0Variables1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("server", Server0Variables2.class),
                    new PropertyEntry("port", Server0Variables5.class)
                ))
                .required(Set.of(
                    "port",
                    "server"
                ))
                .additionalProperties(Server0Variables9.class)
            );
        }
    
        public static Server0Variables1 getInstance() {
            if (instance == null) {
                instance = new Server0Variables1();
            }
            return instance;
        }
        
        public Server0Variables14 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new Server0Variables14(castProperties);
        }
        
        public Server0Variables14 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
