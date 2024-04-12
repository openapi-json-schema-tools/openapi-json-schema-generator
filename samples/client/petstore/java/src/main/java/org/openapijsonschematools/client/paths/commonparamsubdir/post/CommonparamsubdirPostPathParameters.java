package org.openapijsonschematools.client.paths.commonparamsubdir.post;
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
import org.openapijsonschematools.client.paths.commonparamsubdir.parameters.routeparameter0.RouteParamSchema0;
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

public class CommonparamsubdirPostPathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class CommonparamsubdirPostPathParameters4 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable CommonparamsubdirPostPathParameters4 instance = null;
        public static CommonparamsubdirPostPathParameters4 getInstance() {
            if (instance == null) {
                instance = new CommonparamsubdirPostPathParameters4();
            }
            return instance;
        }
    }
    
    
    public static class CommonparamsubdirPostPathParameters9 extends FrozenMap<String> {
        protected CommonparamsubdirPostPathParameters9(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "subDir"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static CommonparamsubdirPostPathParameters9 of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return CommonparamsubdirPostPathParameters1.getInstance().validate(arg, configuration);
        }
        
        public String subDir() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public interface SetterForCommonparamsubdirPostPathParameters2 <T> {
        Map<String, String> getInstance();
        T getBuilderAfterCommonparamsubdirPostPathParameters2(Map<String, String> instance);
        
        default T subDir(String value) {
            var instance = getInstance();
            instance.put("subDir", value);
            return getBuilderAfterCommonparamsubdirPostPathParameters2(instance);
        }
        
        default T subDir(RouteParamSchema0.StringRouteParamSchemaEnums0 value) {
            var instance = getInstance();
            instance.put("subDir", value.value());
            return getBuilderAfterCommonparamsubdirPostPathParameters2(instance);
        }
    }
    
    public static class CommonparamsubdirPostPathParameters10 implements GenericBuilder<Map<String, String>> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "subDir"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public CommonparamsubdirPostPathParameters10(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> build() {
            return instance;
        }
    }
    
    public static class CommonparamsubdirPostPathParameters8 implements SetterForCommonparamsubdirPostPathParameters2<CommonparamsubdirPostPathParameters10> {
        private final Map<String, String> instance;
        public CommonparamsubdirPostPathParameters8() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public CommonparamsubdirPostPathParameters10 getBuilderAfterCommonparamsubdirPostPathParameters2(Map<String, String> instance) {
            return new CommonparamsubdirPostPathParameters10(instance);
        }
    }
    
    
    public sealed interface CommonparamsubdirPostPathParameters1Boxed permits CommonparamsubdirPostPathParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record CommonparamsubdirPostPathParameters1BoxedMap(CommonparamsubdirPostPathParameters9 data) implements CommonparamsubdirPostPathParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class CommonparamsubdirPostPathParameters1 extends JsonSchema<CommonparamsubdirPostPathParameters1Boxed> implements MapSchemaValidator<CommonparamsubdirPostPathParameters9, CommonparamsubdirPostPathParameters1BoxedMap> {
        private static @Nullable CommonparamsubdirPostPathParameters1 instance = null;
    
        protected CommonparamsubdirPostPathParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("subDir", RouteParamSchema0.RouteParamSchema01.class)
                ))
                .required(Set.of(
                    "subDir"
                ))
                .additionalProperties(CommonparamsubdirPostPathParameters4.class)
            );
        }
    
        public static CommonparamsubdirPostPathParameters1 getInstance() {
            if (instance == null) {
                instance = new CommonparamsubdirPostPathParameters1();
            }
            return instance;
        }
        
        public CommonparamsubdirPostPathParameters9 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new CommonparamsubdirPostPathParameters9(castProperties);
        }
        
        public CommonparamsubdirPostPathParameters9 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public CommonparamsubdirPostPathParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new CommonparamsubdirPostPathParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public CommonparamsubdirPostPathParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
