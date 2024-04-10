package org.openapijsonschematools.client.paths.userlogin.get;
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
import org.openapijsonschematools.client.paths.userlogin.get.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.userlogin.get.parameters.parameter1.Schema1;
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

public class UserloginGetQueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class UserloginGetadditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable UserloginGetadditionalProperties instance = null;
        public static UserloginGetadditionalProperties getInstance() {
            if (instance == null) {
                instance = new UserloginGetadditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class UserloginGetQueryParametersMap extends FrozenMap<@Nullable Object> {
        protected UserloginGetQueryParametersMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "password",
            "username"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static UserloginGetQueryParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return UserloginGetQueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public String password() {
                        @Nullable Object value = get("password");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for password");
            }
            return (String) value;
        }
        
        public String username() {
                        @Nullable Object value = get("username");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for username");
            }
            return (String) value;
        }
    }
    
    public interface SetterForUserloginGetpassword <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterUserloginGetpassword(Map<String, @Nullable Object> instance);
        
        default T password(String value) {
            var instance = getInstance();
            instance.put("password", value);
            return getBuilderAfterUserloginGetpassword(instance);
        }
    }
    
    public interface SetterForUserloginGetusername <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterUserloginGetusername(Map<String, @Nullable Object> instance);
        
        default T username(String value) {
            var instance = getInstance();
            instance.put("username", value);
            return getBuilderAfterUserloginGetusername(instance);
        }
    }
    
    public static class UserloginGetQueryParametersMap00Builder implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "password",
            "username"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public UserloginGetQueryParametersMap00Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    public static class UserloginGetQueryParametersMap01Builder implements SetterForUserloginGetusername<UserloginGetQueryParametersMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public UserloginGetQueryParametersMap01Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public UserloginGetQueryParametersMap00Builder getBuilderAfterUserloginGetusername(Map<String, @Nullable Object> instance) {
            return new UserloginGetQueryParametersMap00Builder(instance);
        }
    }
    
    public static class UserloginGetQueryParametersMap10Builder implements SetterForUserloginGetpassword<UserloginGetQueryParametersMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public UserloginGetQueryParametersMap10Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public UserloginGetQueryParametersMap00Builder getBuilderAfterUserloginGetpassword(Map<String, @Nullable Object> instance) {
            return new UserloginGetQueryParametersMap00Builder(instance);
        }
    }
    
    public static class UserloginGetQueryParametersMapBuilder implements SetterForUserloginGetpassword<UserloginGetQueryParametersMap01Builder>, SetterForUserloginGetusername<UserloginGetQueryParametersMap10Builder> {
        private final Map<String, @Nullable Object> instance;
        public UserloginGetQueryParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public UserloginGetQueryParametersMap01Builder getBuilderAfterUserloginGetpassword(Map<String, @Nullable Object> instance) {
            return new UserloginGetQueryParametersMap01Builder(instance);
        }
        public UserloginGetQueryParametersMap10Builder getBuilderAfterUserloginGetusername(Map<String, @Nullable Object> instance) {
            return new UserloginGetQueryParametersMap10Builder(instance);
        }
    }
    
    
    public sealed interface UserloginGetQueryParameters1Boxed permits UserloginGetQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record UserloginGetQueryParameters1BoxedMap(UserloginGetQueryParametersMap data) implements UserloginGetQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class UserloginGetQueryParameters1 extends JsonSchema<UserloginGetQueryParameters1Boxed> implements MapSchemaValidator<UserloginGetQueryParametersMap, UserloginGetQueryParameters1BoxedMap> {
        private static @Nullable UserloginGetQueryParameters1 instance = null;
    
        protected UserloginGetQueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("password", Schema1.Schema11.class),
                    new PropertyEntry("username", Schema0.Schema01.class)
                ))
                .required(Set.of(
                    "password",
                    "username"
                ))
                .additionalProperties(UserloginGetadditionalProperties.class)
            );
        }
    
        public static UserloginGetQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new UserloginGetQueryParameters1();
            }
            return instance;
        }
        
        public UserloginGetQueryParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new UserloginGetQueryParametersMap(castProperties);
        }
        
        public UserloginGetQueryParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public UserloginGetQueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new UserloginGetQueryParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public UserloginGetQueryParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
