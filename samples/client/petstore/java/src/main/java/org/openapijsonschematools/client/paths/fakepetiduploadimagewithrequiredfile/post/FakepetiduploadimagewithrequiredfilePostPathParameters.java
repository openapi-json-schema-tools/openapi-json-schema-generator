package org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post;
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
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.parameters.parameter0.Schema0;
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

public class FakepetiduploadimagewithrequiredfilePostPathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class FakepetiduploadimagewithrequiredfilePostPathParameters4 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable FakepetiduploadimagewithrequiredfilePostPathParameters4 instance = null;
        public static FakepetiduploadimagewithrequiredfilePostPathParameters4 getInstance() {
            if (instance == null) {
                instance = new FakepetiduploadimagewithrequiredfilePostPathParameters4();
            }
            return instance;
        }
    }
    
    
    public static class FakepetiduploadimagewithrequiredfilePostPathParameters9 extends FrozenMap<Number> {
        protected FakepetiduploadimagewithrequiredfilePostPathParameters9(FrozenMap<Number> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "petId"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static FakepetiduploadimagewithrequiredfilePostPathParameters9 of(Map<String, Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return FakepetiduploadimagewithrequiredfilePostPathParameters1.getInstance().validate(arg, configuration);
        }
        
        public Number petId() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public interface SetterForFakepetiduploadimagewithrequiredfilePostPathParameters2 <T> {
        Map<String, Number> getInstance();
        T getBuilderAfterFakepetiduploadimagewithrequiredfilePostPathParameters2(Map<String, Number> instance);
        
        default T petId(int value) {
            var instance = getInstance();
            instance.put("petId", value);
            return getBuilderAfterFakepetiduploadimagewithrequiredfilePostPathParameters2(instance);
        }
        
        default T petId(float value) {
            var instance = getInstance();
            instance.put("petId", value);
            return getBuilderAfterFakepetiduploadimagewithrequiredfilePostPathParameters2(instance);
        }
        
        default T petId(long value) {
            var instance = getInstance();
            instance.put("petId", value);
            return getBuilderAfterFakepetiduploadimagewithrequiredfilePostPathParameters2(instance);
        }
        
        default T petId(double value) {
            var instance = getInstance();
            instance.put("petId", value);
            return getBuilderAfterFakepetiduploadimagewithrequiredfilePostPathParameters2(instance);
        }
    }
    
    public static class FakepetiduploadimagewithrequiredfilePostPathParameters10 implements GenericBuilder<Map<String, Number>> {
        private final Map<String, Number> instance;
        private static final Set<String> knownKeys = Set.of(
            "petId"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FakepetiduploadimagewithrequiredfilePostPathParameters10(Map<String, Number> instance) {
            this.instance = instance;
        }
        public Map<String, Number> build() {
            return instance;
        }
    }
    
    public static class FakepetiduploadimagewithrequiredfilePostPathParameters8 implements SetterForFakepetiduploadimagewithrequiredfilePostPathParameters2<FakepetiduploadimagewithrequiredfilePostPathParameters10> {
        private final Map<String, Number> instance;
        public FakepetiduploadimagewithrequiredfilePostPathParameters8() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Number> getInstance() {
            return instance;
        }
        public FakepetiduploadimagewithrequiredfilePostPathParameters10 getBuilderAfterFakepetiduploadimagewithrequiredfilePostPathParameters2(Map<String, Number> instance) {
            return new FakepetiduploadimagewithrequiredfilePostPathParameters10(instance);
        }
    }
    
    
    public sealed interface FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed permits FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap(FakepetiduploadimagewithrequiredfilePostPathParameters9 data) implements FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class FakepetiduploadimagewithrequiredfilePostPathParameters1 extends JsonSchema<FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed> implements MapSchemaValidator<FakepetiduploadimagewithrequiredfilePostPathParameters9, FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap> {
        private static @Nullable FakepetiduploadimagewithrequiredfilePostPathParameters1 instance = null;
    
        protected FakepetiduploadimagewithrequiredfilePostPathParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("petId", Schema0.Schema01.class)
                ))
                .required(Set.of(
                    "petId"
                ))
                .additionalProperties(FakepetiduploadimagewithrequiredfilePostPathParameters4.class)
            );
        }
    
        public static FakepetiduploadimagewithrequiredfilePostPathParameters1 getInstance() {
            if (instance == null) {
                instance = new FakepetiduploadimagewithrequiredfilePostPathParameters1();
            }
            return instance;
        }
        
        public FakepetiduploadimagewithrequiredfilePostPathParameters9 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Number> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof Number)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (Number) propertyInstance);
            }
            FrozenMap<Number> castProperties = new FrozenMap<>(properties);
            return new FakepetiduploadimagewithrequiredfilePostPathParameters9(castProperties);
        }
        
        public FakepetiduploadimagewithrequiredfilePostPathParameters9 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
