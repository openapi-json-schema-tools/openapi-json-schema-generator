package org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get;
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
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.parameters.parameter0.content.applicationjson.Schema0;
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

public class FakequeryparamwithjsoncontenttypeGetQueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class FakequeryparamwithjsoncontenttypeGetadditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable FakequeryparamwithjsoncontenttypeGetadditionalProperties instance = null;
        public static FakequeryparamwithjsoncontenttypeGetadditionalProperties getInstance() {
            if (instance == null) {
                instance = new FakequeryparamwithjsoncontenttypeGetadditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class FakequeryparamwithjsoncontenttypeGetQueryParametersMap extends FrozenMap<@Nullable Object> {
        protected FakequeryparamwithjsoncontenttypeGetQueryParametersMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "someParam"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static FakequeryparamwithjsoncontenttypeGetQueryParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return FakequeryparamwithjsoncontenttypeGetQueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object someParam() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public interface SetterForFakequeryparamwithjsoncontenttypeGetsomeParam <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakequeryparamwithjsoncontenttypeGetsomeParam(Map<String, @Nullable Object> instance);
        
        default T someParam(Void value) {
            var instance = getInstance();
            instance.put("someParam", null);
            return getBuilderAfterFakequeryparamwithjsoncontenttypeGetsomeParam(instance);
        }
        
        default T someParam(boolean value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterFakequeryparamwithjsoncontenttypeGetsomeParam(instance);
        }
        
        default T someParam(String value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterFakequeryparamwithjsoncontenttypeGetsomeParam(instance);
        }
        
        default T someParam(int value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterFakequeryparamwithjsoncontenttypeGetsomeParam(instance);
        }
        
        default T someParam(float value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterFakequeryparamwithjsoncontenttypeGetsomeParam(instance);
        }
        
        default T someParam(long value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterFakequeryparamwithjsoncontenttypeGetsomeParam(instance);
        }
        
        default T someParam(double value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterFakequeryparamwithjsoncontenttypeGetsomeParam(instance);
        }
        
        default T someParam(List<?> value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterFakequeryparamwithjsoncontenttypeGetsomeParam(instance);
        }
        
        default T someParam(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("someParam", value);
            return getBuilderAfterFakequeryparamwithjsoncontenttypeGetsomeParam(instance);
        }
    }
    
    public static class FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "someParam"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    public static class FakequeryparamwithjsoncontenttypeGetQueryParametersMapBuilder implements SetterForFakequeryparamwithjsoncontenttypeGetsomeParam<FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        public FakequeryparamwithjsoncontenttypeGetQueryParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder getBuilderAfterFakequeryparamwithjsoncontenttypeGetsomeParam(Map<String, @Nullable Object> instance) {
            return new FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder(instance);
        }
    }
    
    
    public sealed interface FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed permits FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap(FakequeryparamwithjsoncontenttypeGetQueryParametersMap data) implements FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class FakequeryparamwithjsoncontenttypeGetQueryParameters1 extends JsonSchema<FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed> implements MapSchemaValidator<FakequeryparamwithjsoncontenttypeGetQueryParametersMap, FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap> {
        private static @Nullable FakequeryparamwithjsoncontenttypeGetQueryParameters1 instance = null;
    
        protected FakequeryparamwithjsoncontenttypeGetQueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("someParam", Schema0.Schema01.class)
                ))
                .required(Set.of(
                    "someParam"
                ))
                .additionalProperties(FakequeryparamwithjsoncontenttypeGetadditionalProperties.class)
            );
        }
    
        public static FakequeryparamwithjsoncontenttypeGetQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new FakequeryparamwithjsoncontenttypeGetQueryParameters1();
            }
            return instance;
        }
        
        public FakequeryparamwithjsoncontenttypeGetQueryParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
                if (!(propertyInstance instanceof Object)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (@Nullable Object) propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new FakequeryparamwithjsoncontenttypeGetQueryParametersMap(castProperties);
        }
        
        public FakequeryparamwithjsoncontenttypeGetQueryParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
