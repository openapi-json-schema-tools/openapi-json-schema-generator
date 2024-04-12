package org.openapijsonschematools.client.paths.fakeobjinquery.get;
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
import org.openapijsonschematools.client.paths.fakeobjinquery.get.parameters.parameter0.Schema0;
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

public class FakeobjinqueryGetQueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class FakeobjinqueryGetQueryParameters4 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable FakeobjinqueryGetQueryParameters4 instance = null;
        public static FakeobjinqueryGetQueryParameters4 getInstance() {
            if (instance == null) {
                instance = new FakeobjinqueryGetQueryParameters4();
            }
            return instance;
        }
    }
    
    
    public static class FakeobjinqueryGetQueryParameters9 extends FrozenMap<Schema0.SchemaMap0> {
        protected FakeobjinqueryGetQueryParameters9(FrozenMap<Schema0.SchemaMap0> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "mapBean"
        );
        public static FakeobjinqueryGetQueryParameters9 of(Map<String, Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return FakeobjinqueryGetQueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public Schema0.SchemaMap0 mapBean() throws UnsetPropertyException {
            return getOrThrow("mapBean");
        }
    }
    
    public interface SetterForFakeobjinqueryGetQueryParameters2 <T> {
        Map<String, Map<String, @Nullable Object>> getInstance();
        T getBuilderAfterFakeobjinqueryGetQueryParameters2(Map<String, Map<String, @Nullable Object>> instance);
        
        default T mapBean(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("mapBean", value);
            return getBuilderAfterFakeobjinqueryGetQueryParameters2(instance);
        }
    }
    
    public static class FakeobjinqueryGetQueryParameters8 implements GenericBuilder<Map<String, Map<String, @Nullable Object>>>, SetterForFakeobjinqueryGetQueryParameters2<FakeobjinqueryGetQueryParameters8> {
        private final Map<String, Map<String, @Nullable Object>> instance;
        private static final Set<String> knownKeys = Set.of(
            "mapBean"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FakeobjinqueryGetQueryParameters8() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Map<String, @Nullable Object>> build() {
            return instance;
        }
        public Map<String, Map<String, @Nullable Object>> getInstance() {
            return instance;
        }
        public FakeobjinqueryGetQueryParameters8 getBuilderAfterFakeobjinqueryGetQueryParameters2(Map<String, Map<String, @Nullable Object>> instance) {
            return this;
        }
    }
    
    
    public sealed interface FakeobjinqueryGetQueryParameters1Boxed permits FakeobjinqueryGetQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record FakeobjinqueryGetQueryParameters1BoxedMap(FakeobjinqueryGetQueryParameters9 data) implements FakeobjinqueryGetQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class FakeobjinqueryGetQueryParameters1 extends JsonSchema<FakeobjinqueryGetQueryParameters1Boxed> implements MapSchemaValidator<FakeobjinqueryGetQueryParameters9, FakeobjinqueryGetQueryParameters1BoxedMap> {
        private static @Nullable FakeobjinqueryGetQueryParameters1 instance = null;
    
        protected FakeobjinqueryGetQueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("mapBean", Schema0.Schema01.class)
                ))
                .additionalProperties(FakeobjinqueryGetQueryParameters4.class)
            );
        }
    
        public static FakeobjinqueryGetQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new FakeobjinqueryGetQueryParameters1();
            }
            return instance;
        }
        
        public FakeobjinqueryGetQueryParameters9 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Schema0.SchemaMap0> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof Schema0.SchemaMap0)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (Schema0.SchemaMap0) propertyInstance);
            }
            FrozenMap<Schema0.SchemaMap0> castProperties = new FrozenMap<>(properties);
            return new FakeobjinqueryGetQueryParameters9(castProperties);
        }
        
        public FakeobjinqueryGetQueryParameters9 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public FakeobjinqueryGetQueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FakeobjinqueryGetQueryParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public FakeobjinqueryGetQueryParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
