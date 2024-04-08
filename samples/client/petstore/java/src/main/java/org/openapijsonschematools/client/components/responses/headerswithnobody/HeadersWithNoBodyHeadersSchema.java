package org.openapijsonschematools.client.components.responses.headerswithnobody;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.responses.headerswithnobody.headers.location.LocationSchema;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
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

public class HeadersWithNoBodyHeadersSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class HeadersWithNoBodyAdditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable HeadersWithNoBodyAdditionalProperties instance = null;
        public static HeadersWithNoBodyAdditionalProperties getInstance() {
            if (instance == null) {
                instance = new HeadersWithNoBodyAdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class HeadersWithNoBodyHeadersSchemaMap extends FrozenMap<String> {
        protected HeadersWithNoBodyHeadersSchemaMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "location"
        );
        public static HeadersWithNoBodyHeadersSchemaMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return HeadersWithNoBodyHeadersSchema1.getInstance().validate(arg, configuration);
        }
        
        public String location() throws UnsetPropertyException {
            return getOrThrow("location");
        }
    }
    
    public interface SetterForHeadersWithNoBodyLocation <T> {
        Map<String, String> getInstance();
        T getBuilderAfterHeadersWithNoBodyLocation(Map<String, String> instance);
        
        default T location(String value) {
            var instance = getInstance();
            instance.put("location", value);
            return getBuilderAfterHeadersWithNoBodyLocation(instance);
        }
    }
    
    public static class HeadersWithNoBodyHeadersSchemaMapBuilder implements GenericBuilder<Map<String, String>>, SetterForHeadersWithNoBodyLocation<HeadersWithNoBodyHeadersSchemaMapBuilder> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "location"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public HeadersWithNoBodyHeadersSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> build() {
            return instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public HeadersWithNoBodyHeadersSchemaMapBuilder getBuilderAfterHeadersWithNoBodyLocation(Map<String, String> instance) {
            return this;
        }
    }
    
    
    public sealed interface HeadersWithNoBodyHeadersSchema1Boxed permits HeadersWithNoBodyHeadersSchema1BoxedMap {
        @Nullable Object getData();
    }
    
    public record HeadersWithNoBodyHeadersSchema1BoxedMap(HeadersWithNoBodyHeadersSchemaMap data) implements HeadersWithNoBodyHeadersSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class HeadersWithNoBodyHeadersSchema1 extends JsonSchema<HeadersWithNoBodyHeadersSchema1Boxed> implements MapSchemaValidator<HeadersWithNoBodyHeadersSchemaMap, HeadersWithNoBodyHeadersSchema1BoxedMap> {
        private static @Nullable HeadersWithNoBodyHeadersSchema1 instance = null;
    
        protected HeadersWithNoBodyHeadersSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("location", LocationSchema.LocationSchema1.class)
                ))
                .additionalProperties(HeadersWithNoBodyAdditionalProperties.class)
            );
        }
    
        public static HeadersWithNoBodyHeadersSchema1 getInstance() {
            if (instance == null) {
                instance = new HeadersWithNoBodyHeadersSchema1();
            }
            return instance;
        }
        
        public HeadersWithNoBodyHeadersSchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new HeadersWithNoBodyHeadersSchemaMap(castProperties);
        }
        
        public HeadersWithNoBodyHeadersSchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public HeadersWithNoBodyHeadersSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new HeadersWithNoBodyHeadersSchema1BoxedMap(validate(arg, configuration));
        }
        @Override
        public HeadersWithNoBodyHeadersSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
