package org.openapijsonschematools.client.paths.foo.get.servers.server1;
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

public class FooGetServer1Variables {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class FooGetServer1Variables6 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable FooGetServer1Variables6 instance = null;
        public static FooGetServer1Variables6 getInstance() {
            if (instance == null) {
                instance = new FooGetServer1Variables6();
            }
            return instance;
        }
    }
    
    public enum StringFooGetServer1Variables3 implements StringValueMethod {
        V1("v1"),
        V2("v2");
        private final String value;
    
        StringFooGetServer1Variables3(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface FooGetServer1Variables2Boxed permits FooGetServer1Variables2BoxedString {
        @Nullable Object getData();
    }
    
    public record FooGetServer1Variables2BoxedString(String data) implements FooGetServer1Variables2Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class FooGetServer1Variables2 extends JsonSchema<FooGetServer1Variables2Boxed> implements StringSchemaValidator<FooGetServer1Variables2BoxedString>, StringEnumValidator<StringFooGetServer1Variables3>, DefaultValueMethod<String> {
        private static @Nullable FooGetServer1Variables2 instance = null;
    
        protected FooGetServer1Variables2() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "v1",
                    "v2"
                ))
                .defaultValue("v1")
            );
        }
    
        public static FooGetServer1Variables2 getInstance() {
            if (instance == null) {
                instance = new FooGetServer1Variables2();
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
        public String validate(StringFooGetServer1Variables3 arg,SchemaConfiguration configuration) throws ValidationException {
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
        public FooGetServer1Variables2BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new FooGetServer1Variables2BoxedString(validate(arg, configuration));
        }
        @Override
        public FooGetServer1Variables2Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class FooGetServer1Variables11 extends FrozenMap<String> {
        protected FooGetServer1Variables11(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "version"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static FooGetServer1Variables11 of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return FooGetServer1Variables1.getInstance().validate(arg, configuration);
        }
        
        public String version() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public interface SetterForFooGetServer1Variables2 <T> {
        Map<String, String> getInstance();
        T getBuilderAfterFooGetServer1Variables2(Map<String, String> instance);
        
        default T version(String value) {
            var instance = getInstance();
            instance.put("version", value);
            return getBuilderAfterFooGetServer1Variables2(instance);
        }
        
        default T version(StringFooGetServer1Variables3 value) {
            var instance = getInstance();
            instance.put("version", value.value());
            return getBuilderAfterFooGetServer1Variables2(instance);
        }
    }
    
    public static class FooGetServer1Variables12 implements GenericBuilder<Map<String, String>> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "version"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FooGetServer1Variables12(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> build() {
            return instance;
        }
    }
    
    public static class FooGetServer1Variables10 implements SetterForFooGetServer1Variables2<FooGetServer1Variables12> {
        private final Map<String, String> instance;
        public FooGetServer1Variables10() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public FooGetServer1Variables12 getBuilderAfterFooGetServer1Variables2(Map<String, String> instance) {
            return new FooGetServer1Variables12(instance);
        }
    }
    
    
    public sealed interface FooGetServer1Variables1Boxed permits FooGetServer1Variables1BoxedMap {
        @Nullable Object getData();
    }
    
    public record FooGetServer1Variables1BoxedMap(FooGetServer1Variables11 data) implements FooGetServer1Variables1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class FooGetServer1Variables1 extends JsonSchema<FooGetServer1Variables1Boxed> implements MapSchemaValidator<FooGetServer1Variables11, FooGetServer1Variables1BoxedMap> {
        private static @Nullable FooGetServer1Variables1 instance = null;
    
        protected FooGetServer1Variables1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("version", FooGetServer1Variables2.class)
                ))
                .required(Set.of(
                    "version"
                ))
                .additionalProperties(FooGetServer1Variables6.class)
            );
        }
    
        public static FooGetServer1Variables1 getInstance() {
            if (instance == null) {
                instance = new FooGetServer1Variables1();
            }
            return instance;
        }
        
        public FooGetServer1Variables11 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new FooGetServer1Variables11(castProperties);
        }
        
        public FooGetServer1Variables11 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public FooGetServer1Variables1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FooGetServer1Variables1BoxedMap(validate(arg, configuration));
        }
        @Override
        public FooGetServer1Variables1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
