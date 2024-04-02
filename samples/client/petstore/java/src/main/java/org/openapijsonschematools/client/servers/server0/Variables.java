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
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
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

public class Variables {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    public enum StringServerEnums implements StringValueMethod {
        PETSTORE("petstore"),
        QA_HYPHEN_MINUS_PETSTORE("qa-petstore"),
        DEV_HYPHEN_MINUS_PETSTORE("dev-petstore");
        private final String value;
    
        StringServerEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface ServerBoxed permits ServerBoxedString {
        @Nullable Object getData();
    }
    
    public record ServerBoxedString(String data) implements ServerBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Server extends JsonSchema<ServerBoxed> implements StringSchemaValidator<ServerBoxedString>, StringEnumValidator<StringServerEnums>, DefaultValueMethod<String> {
        private static @Nullable Server instance = null;
    
        protected Server() {
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
    
        public static Server getInstance() {
            if (instance == null) {
                instance = new Server();
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
        public String validate(StringServerEnums arg,SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        public String defaultValue() throws InvalidTypeException {
            if (defaultValue instanceof String) {
                return (String) defaultValue;
            }
            throw new InvalidTypeException("Invalid type stored in defaultValue");
        }
        @Override
        public ServerBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ServerBoxedString(validate(arg, configuration));
        }
        @Override
        public ServerBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    public enum StringPortEnums implements StringValueMethod {
        POSITIVE_80("80"),
        POSITIVE_8080("8080");
        private final String value;
    
        StringPortEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface PortBoxed permits PortBoxedString {
        @Nullable Object getData();
    }
    
    public record PortBoxedString(String data) implements PortBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class Port extends JsonSchema<PortBoxed> implements StringSchemaValidator<PortBoxedString>, StringEnumValidator<StringPortEnums>, DefaultValueMethod<String> {
        private static @Nullable Port instance = null;
    
        protected Port() {
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
    
        public static Port getInstance() {
            if (instance == null) {
                instance = new Port();
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
        public String validate(StringPortEnums arg,SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        public String defaultValue() throws InvalidTypeException {
            if (defaultValue instanceof String) {
                return (String) defaultValue;
            }
            throw new InvalidTypeException("Invalid type stored in defaultValue");
        }
        @Override
        public PortBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new PortBoxedString(validate(arg, configuration));
        }
        @Override
        public PortBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class VariablesMap extends FrozenMap<String> {
        protected VariablesMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "port",
            "server"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static VariablesMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return Variables1.getInstance().validate(arg, configuration);
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
    
    public interface SetterForPort <T> {
        Map<String, String> getInstance();
        T getBuilderAfterPort(Map<String, String> instance);
        
        default T port(String value) {
            var instance = getInstance();
            instance.put("port", value);
            return getBuilderAfterPort(instance);
        }
        
        default T port(StringPortEnums value) {
            var instance = getInstance();
            instance.put("port", value.value());
            return getBuilderAfterPort(instance);
        }
    }
    
    public interface SetterForServer <T> {
        Map<String, String> getInstance();
        T getBuilderAfterServer(Map<String, String> instance);
        
        default T server(String value) {
            var instance = getInstance();
            instance.put("server", value);
            return getBuilderAfterServer(instance);
        }
        
        default T server(StringServerEnums value) {
            var instance = getInstance();
            instance.put("server", value.value());
            return getBuilderAfterServer(instance);
        }
    }
    
    public static class VariablesMap00Builder implements GenericBuilder<Map<String, String>> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "port",
            "server"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public VariablesMap00Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> build() {
            return instance;
        }
    }
    
    public static class VariablesMap01Builder implements SetterForServer<VariablesMap00Builder> {
        private final Map<String, String> instance;
        public VariablesMap01Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public VariablesMap00Builder getBuilderAfterServer(Map<String, String> instance) {
            return new VariablesMap00Builder(instance);
        }
    }
    
    public static class VariablesMap10Builder implements SetterForPort<VariablesMap00Builder> {
        private final Map<String, String> instance;
        public VariablesMap10Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public VariablesMap00Builder getBuilderAfterPort(Map<String, String> instance) {
            return new VariablesMap00Builder(instance);
        }
    }
    
    public static class VariablesMapBuilder implements SetterForPort<VariablesMap01Builder>, SetterForServer<VariablesMap10Builder> {
        private final Map<String, String> instance;
        public VariablesMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public VariablesMap01Builder getBuilderAfterPort(Map<String, String> instance) {
            return new VariablesMap01Builder(instance);
        }
        public VariablesMap10Builder getBuilderAfterServer(Map<String, String> instance) {
            return new VariablesMap10Builder(instance);
        }
    }
    
    
    public sealed interface Variables1Boxed permits Variables1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Variables1BoxedMap(VariablesMap data) implements Variables1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Variables1 extends JsonSchema<Variables1Boxed> implements MapSchemaValidator<VariablesMap, Variables1BoxedMap> {
        private static @Nullable Variables1 instance = null;
    
        protected Variables1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("server", Server.class),
                    new PropertyEntry("port", Port.class)
                ))
                .required(Set.of(
                    "port",
                    "server"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static Variables1 getInstance() {
            if (instance == null) {
                instance = new Variables1();
            }
            return instance;
        }
        
        public VariablesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new VariablesMap(castProperties);
        }
        
        public VariablesMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public Variables1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Variables1BoxedMap(validate(arg, configuration));
        }
        @Override
        public Variables1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
