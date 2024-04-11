package org.openapijsonschematools.client.paths.fakecasesensitiveparams.put;
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
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters.parameter1.Schema1;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters.parameter2.Schema2;
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

public class FakecasesensitiveparamsPutQueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class FakecasesensitiveparamsPutadditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable FakecasesensitiveparamsPutadditionalProperties instance = null;
        public static FakecasesensitiveparamsPutadditionalProperties getInstance() {
            if (instance == null) {
                instance = new FakecasesensitiveparamsPutadditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class FakecasesensitiveparamsPutQueryParametersMap extends FrozenMap<@Nullable Object> {
        protected FakecasesensitiveparamsPutQueryParametersMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "SomeVar",
            "someVar",
            "some_var"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static FakecasesensitiveparamsPutQueryParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return FakecasesensitiveparamsPutQueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public String SomeVar() {
                        @Nullable Object value = get("SomeVar");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for SomeVar");
            }
            return (String) value;
        }
        
        public String someVar() {
                        @Nullable Object value = get("someVar");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for someVar");
            }
            return (String) value;
        }
        
        public String some_var() {
                        @Nullable Object value = get("some_var");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for some_var");
            }
            return (String) value;
        }
    }
    
    public interface SetterForFakecasesensitiveparamsPutSomeVar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakecasesensitiveparamsPutSomeVar(Map<String, @Nullable Object> instance);
        
        default T SomeVar(String value) {
            var instance = getInstance();
            instance.put("SomeVar", value);
            return getBuilderAfterFakecasesensitiveparamsPutSomeVar(instance);
        }
    }
    
    public interface SetterForFakecasesensitiveparamsPutsomeVar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakecasesensitiveparamsPutsomeVar(Map<String, @Nullable Object> instance);
        
        default T someVar(String value) {
            var instance = getInstance();
            instance.put("someVar", value);
            return getBuilderAfterFakecasesensitiveparamsPutsomeVar(instance);
        }
    }
    
    public interface SetterForFakecasesensitiveparamsPutsomeVar1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakecasesensitiveparamsPutsomeVar1(Map<String, @Nullable Object> instance);
        
        default T some_var(String value) {
            var instance = getInstance();
            instance.put("some_var", value);
            return getBuilderAfterFakecasesensitiveparamsPutsomeVar1(instance);
        }
    }
    
    public static class FakecasesensitiveparamsPutQueryParametersMap000Builder implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "SomeVar",
            "someVar",
            "some_var"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FakecasesensitiveparamsPutQueryParametersMap000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    public static class FakecasesensitiveparamsPutQueryParametersMap001Builder implements SetterForFakecasesensitiveparamsPutsomeVar1<FakecasesensitiveparamsPutQueryParametersMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FakecasesensitiveparamsPutQueryParametersMap001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakecasesensitiveparamsPutQueryParametersMap000Builder getBuilderAfterFakecasesensitiveparamsPutsomeVar1(Map<String, @Nullable Object> instance) {
            return new FakecasesensitiveparamsPutQueryParametersMap000Builder(instance);
        }
    }
    
    public static class FakecasesensitiveparamsPutQueryParametersMap010Builder implements SetterForFakecasesensitiveparamsPutsomeVar<FakecasesensitiveparamsPutQueryParametersMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FakecasesensitiveparamsPutQueryParametersMap010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakecasesensitiveparamsPutQueryParametersMap000Builder getBuilderAfterFakecasesensitiveparamsPutsomeVar(Map<String, @Nullable Object> instance) {
            return new FakecasesensitiveparamsPutQueryParametersMap000Builder(instance);
        }
    }
    
    public static class FakecasesensitiveparamsPutQueryParametersMap011Builder implements SetterForFakecasesensitiveparamsPutsomeVar<FakecasesensitiveparamsPutQueryParametersMap001Builder>, SetterForFakecasesensitiveparamsPutsomeVar1<FakecasesensitiveparamsPutQueryParametersMap010Builder> {
        private final Map<String, @Nullable Object> instance;
        public FakecasesensitiveparamsPutQueryParametersMap011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakecasesensitiveparamsPutQueryParametersMap001Builder getBuilderAfterFakecasesensitiveparamsPutsomeVar(Map<String, @Nullable Object> instance) {
            return new FakecasesensitiveparamsPutQueryParametersMap001Builder(instance);
        }
        public FakecasesensitiveparamsPutQueryParametersMap010Builder getBuilderAfterFakecasesensitiveparamsPutsomeVar1(Map<String, @Nullable Object> instance) {
            return new FakecasesensitiveparamsPutQueryParametersMap010Builder(instance);
        }
    }
    
    public static class FakecasesensitiveparamsPutQueryParametersMap100Builder implements SetterForFakecasesensitiveparamsPutSomeVar<FakecasesensitiveparamsPutQueryParametersMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public FakecasesensitiveparamsPutQueryParametersMap100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakecasesensitiveparamsPutQueryParametersMap000Builder getBuilderAfterFakecasesensitiveparamsPutSomeVar(Map<String, @Nullable Object> instance) {
            return new FakecasesensitiveparamsPutQueryParametersMap000Builder(instance);
        }
    }
    
    public static class FakecasesensitiveparamsPutQueryParametersMap101Builder implements SetterForFakecasesensitiveparamsPutSomeVar<FakecasesensitiveparamsPutQueryParametersMap001Builder>, SetterForFakecasesensitiveparamsPutsomeVar1<FakecasesensitiveparamsPutQueryParametersMap100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FakecasesensitiveparamsPutQueryParametersMap101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakecasesensitiveparamsPutQueryParametersMap001Builder getBuilderAfterFakecasesensitiveparamsPutSomeVar(Map<String, @Nullable Object> instance) {
            return new FakecasesensitiveparamsPutQueryParametersMap001Builder(instance);
        }
        public FakecasesensitiveparamsPutQueryParametersMap100Builder getBuilderAfterFakecasesensitiveparamsPutsomeVar1(Map<String, @Nullable Object> instance) {
            return new FakecasesensitiveparamsPutQueryParametersMap100Builder(instance);
        }
    }
    
    public static class FakecasesensitiveparamsPutQueryParametersMap110Builder implements SetterForFakecasesensitiveparamsPutSomeVar<FakecasesensitiveparamsPutQueryParametersMap010Builder>, SetterForFakecasesensitiveparamsPutsomeVar<FakecasesensitiveparamsPutQueryParametersMap100Builder> {
        private final Map<String, @Nullable Object> instance;
        public FakecasesensitiveparamsPutQueryParametersMap110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakecasesensitiveparamsPutQueryParametersMap010Builder getBuilderAfterFakecasesensitiveparamsPutSomeVar(Map<String, @Nullable Object> instance) {
            return new FakecasesensitiveparamsPutQueryParametersMap010Builder(instance);
        }
        public FakecasesensitiveparamsPutQueryParametersMap100Builder getBuilderAfterFakecasesensitiveparamsPutsomeVar(Map<String, @Nullable Object> instance) {
            return new FakecasesensitiveparamsPutQueryParametersMap100Builder(instance);
        }
    }
    
    public static class FakecasesensitiveparamsPutQueryParametersMapBuilder implements SetterForFakecasesensitiveparamsPutSomeVar<FakecasesensitiveparamsPutQueryParametersMap011Builder>, SetterForFakecasesensitiveparamsPutsomeVar<FakecasesensitiveparamsPutQueryParametersMap101Builder>, SetterForFakecasesensitiveparamsPutsomeVar1<FakecasesensitiveparamsPutQueryParametersMap110Builder> {
        private final Map<String, @Nullable Object> instance;
        public FakecasesensitiveparamsPutQueryParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakecasesensitiveparamsPutQueryParametersMap011Builder getBuilderAfterFakecasesensitiveparamsPutSomeVar(Map<String, @Nullable Object> instance) {
            return new FakecasesensitiveparamsPutQueryParametersMap011Builder(instance);
        }
        public FakecasesensitiveparamsPutQueryParametersMap101Builder getBuilderAfterFakecasesensitiveparamsPutsomeVar(Map<String, @Nullable Object> instance) {
            return new FakecasesensitiveparamsPutQueryParametersMap101Builder(instance);
        }
        public FakecasesensitiveparamsPutQueryParametersMap110Builder getBuilderAfterFakecasesensitiveparamsPutsomeVar1(Map<String, @Nullable Object> instance) {
            return new FakecasesensitiveparamsPutQueryParametersMap110Builder(instance);
        }
    }
    
    
    public sealed interface FakecasesensitiveparamsPutQueryParameters1Boxed permits FakecasesensitiveparamsPutQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record FakecasesensitiveparamsPutQueryParameters1BoxedMap(FakecasesensitiveparamsPutQueryParametersMap data) implements FakecasesensitiveparamsPutQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class FakecasesensitiveparamsPutQueryParameters1 extends JsonSchema<FakecasesensitiveparamsPutQueryParameters1Boxed> implements MapSchemaValidator<FakecasesensitiveparamsPutQueryParametersMap, FakecasesensitiveparamsPutQueryParameters1BoxedMap> {
        private static @Nullable FakecasesensitiveparamsPutQueryParameters1 instance = null;
    
        protected FakecasesensitiveparamsPutQueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("someVar", Schema0.Schema01.class),
                    new PropertyEntry("some_var", Schema2.Schema21.class),
                    new PropertyEntry("SomeVar", Schema1.Schema11.class)
                ))
                .required(Set.of(
                    "SomeVar",
                    "someVar",
                    "some_var"
                ))
                .additionalProperties(FakecasesensitiveparamsPutadditionalProperties.class)
            );
        }
    
        public static FakecasesensitiveparamsPutQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new FakecasesensitiveparamsPutQueryParameters1();
            }
            return instance;
        }
        
        public FakecasesensitiveparamsPutQueryParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new FakecasesensitiveparamsPutQueryParametersMap(castProperties);
        }
        
        public FakecasesensitiveparamsPutQueryParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public FakecasesensitiveparamsPutQueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FakecasesensitiveparamsPutQueryParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public FakecasesensitiveparamsPutQueryParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
