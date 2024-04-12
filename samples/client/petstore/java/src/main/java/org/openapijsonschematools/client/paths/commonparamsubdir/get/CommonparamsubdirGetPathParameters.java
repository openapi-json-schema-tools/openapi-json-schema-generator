package org.openapijsonschematools.client.paths.commonparamsubdir.get;
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

public class CommonparamsubdirGetPathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class CommonparamsubdirGetPathParameters4 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable CommonparamsubdirGetPathParameters4 instance = null;
        public static CommonparamsubdirGetPathParameters4 getInstance() {
            if (instance == null) {
                instance = new CommonparamsubdirGetPathParameters4();
            }
            return instance;
        }
    }
    
    
    public static class CommonparamsubdirGetPathParameters9 extends FrozenMap<String> {
        protected CommonparamsubdirGetPathParameters9(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "subDir"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static CommonparamsubdirGetPathParameters9 of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return CommonparamsubdirGetPathParameters1.getInstance().validate(arg, configuration);
        }
        
        public String subDir() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public interface SetterForCommonparamsubdirGetPathParameters2 <T> {
        Map<String, String> getInstance();
        T getBuilderAfterCommonparamsubdirGetPathParameters2(Map<String, String> instance);
        
        default T subDir(String value) {
            var instance = getInstance();
            instance.put("subDir", value);
            return getBuilderAfterCommonparamsubdirGetPathParameters2(instance);
        }
        
        default T subDir(RouteParamSchema0.StringRouteParamSchemaEnums0 value) {
            var instance = getInstance();
            instance.put("subDir", value.value());
            return getBuilderAfterCommonparamsubdirGetPathParameters2(instance);
        }
    }
    
    public static class CommonparamsubdirGetPathParameters10 implements GenericBuilder<Map<String, String>> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "subDir"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public CommonparamsubdirGetPathParameters10(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> build() {
            return instance;
        }
    }
    
    public static class CommonparamsubdirGetPathParameters8 implements SetterForCommonparamsubdirGetPathParameters2<CommonparamsubdirGetPathParameters10> {
        private final Map<String, String> instance;
        public CommonparamsubdirGetPathParameters8() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public CommonparamsubdirGetPathParameters10 getBuilderAfterCommonparamsubdirGetPathParameters2(Map<String, String> instance) {
            return new CommonparamsubdirGetPathParameters10(instance);
        }
    }
    
    
    public sealed interface CommonparamsubdirGetPathParameters1Boxed permits CommonparamsubdirGetPathParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record CommonparamsubdirGetPathParameters1BoxedMap(CommonparamsubdirGetPathParameters9 data) implements CommonparamsubdirGetPathParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class CommonparamsubdirGetPathParameters1 extends JsonSchema<CommonparamsubdirGetPathParameters1Boxed> implements MapSchemaValidator<CommonparamsubdirGetPathParameters9, CommonparamsubdirGetPathParameters1BoxedMap> {
        private static @Nullable CommonparamsubdirGetPathParameters1 instance = null;
    
        protected CommonparamsubdirGetPathParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("subDir", RouteParamSchema0.RouteParamSchema01.class)
                ))
                .required(Set.of(
                    "subDir"
                ))
                .additionalProperties(CommonparamsubdirGetPathParameters4.class)
            );
        }
    
        public static CommonparamsubdirGetPathParameters1 getInstance() {
            if (instance == null) {
                instance = new CommonparamsubdirGetPathParameters1();
            }
            return instance;
        }
        
        public CommonparamsubdirGetPathParameters9 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new CommonparamsubdirGetPathParameters9(castProperties);
        }
        
        public CommonparamsubdirGetPathParameters9 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public CommonparamsubdirGetPathParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new CommonparamsubdirGetPathParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public CommonparamsubdirGetPathParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
