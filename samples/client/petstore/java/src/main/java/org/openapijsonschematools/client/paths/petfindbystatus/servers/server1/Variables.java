package org.openapijsonschematools.client.paths.petfindbystatus.servers.server1;
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

public class PetfindbystatusServer1Variables {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class PetfindbystatusServer1Variables6 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable PetfindbystatusServer1Variables6 instance = null;
        public static PetfindbystatusServer1Variables6 getInstance() {
            if (instance == null) {
                instance = new PetfindbystatusServer1Variables6();
            }
            return instance;
        }
    }
    
    public enum StringPetfindbystatusServer1Variables3 implements StringValueMethod {
        V1("v1"),
        V2("v2");
        private final String value;
    
        StringPetfindbystatusServer1Variables3(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface PetfindbystatusServer1Variables2Boxed permits PetfindbystatusServer1Variables2BoxedString {
        @Nullable Object getData();
    }
    
    public record PetfindbystatusServer1Variables2BoxedString(String data) implements PetfindbystatusServer1Variables2Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class PetfindbystatusServer1Variables2 extends JsonSchema<PetfindbystatusServer1Variables2Boxed> implements StringSchemaValidator<PetfindbystatusServer1Variables2BoxedString>, StringEnumValidator<StringPetfindbystatusServer1Variables3>, DefaultValueMethod<String> {
        private static @Nullable PetfindbystatusServer1Variables2 instance = null;
    
        protected PetfindbystatusServer1Variables2() {
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
    
        public static PetfindbystatusServer1Variables2 getInstance() {
            if (instance == null) {
                instance = new PetfindbystatusServer1Variables2();
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
        public String validate(StringPetfindbystatusServer1Variables3 arg,SchemaConfiguration configuration) throws ValidationException {
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
        public PetfindbystatusServer1Variables2BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new PetfindbystatusServer1Variables2BoxedString(validate(arg, configuration));
        }
        @Override
        public PetfindbystatusServer1Variables2Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class PetfindbystatusServer1Variables11 extends FrozenMap<String> {
        protected PetfindbystatusServer1Variables11(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "version"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static PetfindbystatusServer1Variables11 of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return PetfindbystatusServer1Variables1.getInstance().validate(arg, configuration);
        }
        
        public String version() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public interface SetterForPetfindbystatusServer1Variables2 <T> {
        Map<String, String> getInstance();
        T getBuilderAfterPetfindbystatusServer1Variables2(Map<String, String> instance);
        
        default T version(String value) {
            var instance = getInstance();
            instance.put("version", value);
            return getBuilderAfterPetfindbystatusServer1Variables2(instance);
        }
        
        default T version(StringPetfindbystatusServer1Variables3 value) {
            var instance = getInstance();
            instance.put("version", value.value());
            return getBuilderAfterPetfindbystatusServer1Variables2(instance);
        }
    }
    
    public static class PetfindbystatusServer1Variables12 implements GenericBuilder<Map<String, String>> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "version"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public PetfindbystatusServer1Variables12(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> build() {
            return instance;
        }
    }
    
    public static class PetfindbystatusServer1Variables10 implements SetterForPetfindbystatusServer1Variables2<PetfindbystatusServer1Variables12> {
        private final Map<String, String> instance;
        public PetfindbystatusServer1Variables10() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public PetfindbystatusServer1Variables12 getBuilderAfterPetfindbystatusServer1Variables2(Map<String, String> instance) {
            return new PetfindbystatusServer1Variables12(instance);
        }
    }
    
    
    public sealed interface PetfindbystatusServer1Variables1Boxed permits PetfindbystatusServer1Variables1BoxedMap {
        @Nullable Object getData();
    }
    
    public record PetfindbystatusServer1Variables1BoxedMap(PetfindbystatusServer1Variables11 data) implements PetfindbystatusServer1Variables1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class PetfindbystatusServer1Variables1 extends JsonSchema<PetfindbystatusServer1Variables1Boxed> implements MapSchemaValidator<PetfindbystatusServer1Variables11, PetfindbystatusServer1Variables1BoxedMap> {
        private static @Nullable PetfindbystatusServer1Variables1 instance = null;
    
        protected PetfindbystatusServer1Variables1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("version", PetfindbystatusServer1Variables2.class)
                ))
                .required(Set.of(
                    "version"
                ))
                .additionalProperties(PetfindbystatusServer1Variables6.class)
            );
        }
    
        public static PetfindbystatusServer1Variables1 getInstance() {
            if (instance == null) {
                instance = new PetfindbystatusServer1Variables1();
            }
            return instance;
        }
        
        public PetfindbystatusServer1Variables11 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new PetfindbystatusServer1Variables11(castProperties);
        }
        
        public PetfindbystatusServer1Variables11 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public PetfindbystatusServer1Variables1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new PetfindbystatusServer1Variables1BoxedMap(validate(arg, configuration));
        }
        @Override
        public PetfindbystatusServer1Variables1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
