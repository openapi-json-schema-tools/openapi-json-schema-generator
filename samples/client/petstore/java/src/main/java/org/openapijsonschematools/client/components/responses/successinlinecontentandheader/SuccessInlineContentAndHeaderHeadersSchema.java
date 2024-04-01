package org.openapijsonschematools.client.components.responses.successinlinecontentandheader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.responses.successinlinecontentandheader.headers.someheader.SomeHeaderSchema;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
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

public class SuccessInlineContentAndHeaderHeadersSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SuccessInlineContentAndHeaderAdditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable SuccessInlineContentAndHeaderAdditionalProperties instance = null;
        public static SuccessInlineContentAndHeaderAdditionalProperties getInstance() {
            if (instance == null) {
                instance = new SuccessInlineContentAndHeaderAdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class SuccessInlineContentAndHeaderHeadersSchemaMap extends FrozenMap<String> {
        protected SuccessInlineContentAndHeaderHeadersSchemaMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "someHeader"
        );
        public static SuccessInlineContentAndHeaderHeadersSchemaMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return SuccessInlineContentAndHeaderHeadersSchema1.getInstance().validate(arg, configuration);
        }
        
        public String someHeader() throws UnsetPropertyException {
            return getOrThrow("someHeader");
        }
    }
    
    public interface SetterForSuccessInlineContentAndHeaderSomeHeader <T> {
        Map<String, String> getInstance();
        T getBuilderAfterSuccessInlineContentAndHeaderSomeHeader(Map<String, String> instance);
        
        default T someHeader(String value) {
            var instance = getInstance();
            instance.put("someHeader", value);
            return getBuilderAfterSuccessInlineContentAndHeaderSomeHeader(instance);
        }
    }
    
    public static class SuccessInlineContentAndHeaderHeadersSchemaMapBuilder implements GenericBuilder<Map<String, String>>, SetterForSuccessInlineContentAndHeaderSomeHeader<SuccessInlineContentAndHeaderHeadersSchemaMapBuilder> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "someHeader"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public SuccessInlineContentAndHeaderHeadersSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> build() {
            return instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public SuccessInlineContentAndHeaderHeadersSchemaMapBuilder getBuilderAfterSuccessInlineContentAndHeaderSomeHeader(Map<String, String> instance) {
            return this;
        }
    }
    
    
    public sealed interface SuccessInlineContentAndHeaderHeadersSchema1Boxed permits SuccessInlineContentAndHeaderHeadersSchema1BoxedMap {
        @Nullable Object getData();
    }
    
    public record SuccessInlineContentAndHeaderHeadersSchema1BoxedMap(SuccessInlineContentAndHeaderHeadersSchemaMap data) implements SuccessInlineContentAndHeaderHeadersSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class SuccessInlineContentAndHeaderHeadersSchema1 extends JsonSchema<SuccessInlineContentAndHeaderHeadersSchema1Boxed> implements MapSchemaValidator<SuccessInlineContentAndHeaderHeadersSchemaMap, SuccessInlineContentAndHeaderHeadersSchema1BoxedMap> {
        private static @Nullable SuccessInlineContentAndHeaderHeadersSchema1 instance = null;
    
        protected SuccessInlineContentAndHeaderHeadersSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("someHeader", SomeHeaderSchema.SomeHeaderSchema1.class)
                ))
                .additionalProperties(SuccessInlineContentAndHeaderAdditionalProperties.class)
            );
        }
    
        public static SuccessInlineContentAndHeaderHeadersSchema1 getInstance() {
            if (instance == null) {
                instance = new SuccessInlineContentAndHeaderHeadersSchema1();
            }
            return instance;
        }
        
        public SuccessInlineContentAndHeaderHeadersSchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            LinkedHashMap<String, String> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new InvalidTypeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                if (!(propertyInstance instanceof String)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (String) propertyInstance);
            }
            FrozenMap<String> castProperties = new FrozenMap<>(properties);
            return new SuccessInlineContentAndHeaderHeadersSchemaMap(castProperties);
        }
        
        public SuccessInlineContentAndHeaderHeadersSchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public SuccessInlineContentAndHeaderHeadersSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new SuccessInlineContentAndHeaderHeadersSchema1BoxedMap(validate(arg, configuration));
        }
        @Override
        public SuccessInlineContentAndHeaderHeadersSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
