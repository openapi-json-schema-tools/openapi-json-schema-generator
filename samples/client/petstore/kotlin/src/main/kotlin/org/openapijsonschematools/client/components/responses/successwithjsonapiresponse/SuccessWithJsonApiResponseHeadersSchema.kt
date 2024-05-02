package org.openapijsonschematools.client.components.responses.successwithjsonapiresponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.headers.int32jsoncontenttypeheader.content.applicationjson.Int32JsonContentTypeHeaderSchema;
import org.openapijsonschematools.client.components.headers.numberheader.NumberHeaderSchema;
import org.openapijsonschematools.client.components.headers.stringheader.StringHeaderSchema;
import org.openapijsonschematools.client.components.schemas.StringWithValidation;
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

public class SuccessWithJsonApiResponseHeadersSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SuccessWithJsonApiResponseAdditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable SuccessWithJsonApiResponseAdditionalProperties instance = null;
        public static SuccessWithJsonApiResponseAdditionalProperties getInstance() {
            if (instance == null) {
                instance = new SuccessWithJsonApiResponseAdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap extends FrozenMap<@Nullable Object> {
        protected SuccessWithJsonApiResponseHeadersSchemaMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "int32",
            "ref-content-schema-header",
            "ref-schema-header",
            "stringHeader"
        );
        public static final Set<String> optionalKeys = Set.of(
            "numberHeader"
        );
        public static SuccessWithJsonApiResponseHeadersSchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return SuccessWithJsonApiResponseHeadersSchema1.getInstance().validate(arg, configuration);
        }
        
        public Number int32() {
                        @Nullable Object value = get("int32");
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for int32");
            }
            return (Number) value;
        }
        
        public String stringHeader() {
                        @Nullable Object value = get("stringHeader");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for stringHeader");
            }
            return (String) value;
        }
        
        public String numberHeader() throws UnsetPropertyException {
            String key = "numberHeader";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for numberHeader");
            }
            return (String) value;
        }
    }
    
    public interface SetterForSuccessWithJsonApiResponseInt32 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSuccessWithJsonApiResponseInt32(Map<String, @Nullable Object> instance);
        
        default T int32(int value) {
            var instance = getInstance();
            instance.put("int32", value);
            return getBuilderAfterSuccessWithJsonApiResponseInt32(instance);
        }
        
        default T int32(float value) {
            var instance = getInstance();
            instance.put("int32", value);
            return getBuilderAfterSuccessWithJsonApiResponseInt32(instance);
        }
    }
    
    public interface SetterForSuccessWithJsonApiResponseRefcontentschemaheader <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSuccessWithJsonApiResponseRefcontentschemaheader(Map<String, @Nullable Object> instance);
        
        default T refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) {
            var instance = getInstance();
            instance.put("ref-content-schema-header", value);
            return getBuilderAfterSuccessWithJsonApiResponseRefcontentschemaheader(instance);
        }
    }
    
    public interface SetterForSuccessWithJsonApiResponseRefschemaheader <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSuccessWithJsonApiResponseRefschemaheader(Map<String, @Nullable Object> instance);
        
        default T refHyphenMinusSchemaHyphenMinusHeader(String value) {
            var instance = getInstance();
            instance.put("ref-schema-header", value);
            return getBuilderAfterSuccessWithJsonApiResponseRefschemaheader(instance);
        }
    }
    
    public interface SetterForSuccessWithJsonApiResponseStringHeader <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSuccessWithJsonApiResponseStringHeader(Map<String, @Nullable Object> instance);
        
        default T stringHeader(String value) {
            var instance = getInstance();
            instance.put("stringHeader", value);
            return getBuilderAfterSuccessWithJsonApiResponseStringHeader(instance);
        }
    }
    
    public interface SetterForSuccessWithJsonApiResponseNumberHeader <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSuccessWithJsonApiResponseNumberHeader(Map<String, @Nullable Object> instance);
        
        default T numberHeader(String value) {
            var instance = getInstance();
            instance.put("numberHeader", value);
            return getBuilderAfterSuccessWithJsonApiResponseNumberHeader(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap0000Builder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForSuccessWithJsonApiResponseNumberHeader<SuccessWithJsonApiResponseHeadersSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "int32",
            "ref-content-schema-header",
            "ref-schema-header",
            "stringHeader",
            "numberHeader"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0000Builder getBuilderAfterSuccessWithJsonApiResponseNumberHeader(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap0001Builder implements SetterForSuccessWithJsonApiResponseStringHeader<SuccessWithJsonApiResponseHeadersSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap0001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0000Builder getBuilderAfterSuccessWithJsonApiResponseStringHeader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0000Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap0010Builder implements SetterForSuccessWithJsonApiResponseRefschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap0010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0000Builder getBuilderAfterSuccessWithJsonApiResponseRefschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0000Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap0011Builder implements SetterForSuccessWithJsonApiResponseRefschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap0001Builder>, SetterForSuccessWithJsonApiResponseStringHeader<SuccessWithJsonApiResponseHeadersSchemaMap0010Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap0011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0001Builder getBuilderAfterSuccessWithJsonApiResponseRefschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0001Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0010Builder getBuilderAfterSuccessWithJsonApiResponseStringHeader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0010Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap0100Builder implements SetterForSuccessWithJsonApiResponseRefcontentschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap0100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0000Builder getBuilderAfterSuccessWithJsonApiResponseRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0000Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap0101Builder implements SetterForSuccessWithJsonApiResponseRefcontentschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap0001Builder>, SetterForSuccessWithJsonApiResponseStringHeader<SuccessWithJsonApiResponseHeadersSchemaMap0100Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap0101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0001Builder getBuilderAfterSuccessWithJsonApiResponseRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0001Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0100Builder getBuilderAfterSuccessWithJsonApiResponseStringHeader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0100Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap0110Builder implements SetterForSuccessWithJsonApiResponseRefcontentschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap0010Builder>, SetterForSuccessWithJsonApiResponseRefschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap0100Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap0110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0010Builder getBuilderAfterSuccessWithJsonApiResponseRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0010Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0100Builder getBuilderAfterSuccessWithJsonApiResponseRefschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0100Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap0111Builder implements SetterForSuccessWithJsonApiResponseRefcontentschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap0011Builder>, SetterForSuccessWithJsonApiResponseRefschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap0101Builder>, SetterForSuccessWithJsonApiResponseStringHeader<SuccessWithJsonApiResponseHeadersSchemaMap0110Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap0111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0011Builder getBuilderAfterSuccessWithJsonApiResponseRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0011Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0101Builder getBuilderAfterSuccessWithJsonApiResponseRefschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0101Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0110Builder getBuilderAfterSuccessWithJsonApiResponseStringHeader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0110Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap1000Builder implements SetterForSuccessWithJsonApiResponseInt32<SuccessWithJsonApiResponseHeadersSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap1000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0000Builder getBuilderAfterSuccessWithJsonApiResponseInt32(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0000Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap1001Builder implements SetterForSuccessWithJsonApiResponseInt32<SuccessWithJsonApiResponseHeadersSchemaMap0001Builder>, SetterForSuccessWithJsonApiResponseStringHeader<SuccessWithJsonApiResponseHeadersSchemaMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap1001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0001Builder getBuilderAfterSuccessWithJsonApiResponseInt32(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0001Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap1000Builder getBuilderAfterSuccessWithJsonApiResponseStringHeader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap1000Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap1010Builder implements SetterForSuccessWithJsonApiResponseInt32<SuccessWithJsonApiResponseHeadersSchemaMap0010Builder>, SetterForSuccessWithJsonApiResponseRefschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap1010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0010Builder getBuilderAfterSuccessWithJsonApiResponseInt32(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0010Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap1000Builder getBuilderAfterSuccessWithJsonApiResponseRefschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap1000Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap1011Builder implements SetterForSuccessWithJsonApiResponseInt32<SuccessWithJsonApiResponseHeadersSchemaMap0011Builder>, SetterForSuccessWithJsonApiResponseRefschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap1001Builder>, SetterForSuccessWithJsonApiResponseStringHeader<SuccessWithJsonApiResponseHeadersSchemaMap1010Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap1011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0011Builder getBuilderAfterSuccessWithJsonApiResponseInt32(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0011Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap1001Builder getBuilderAfterSuccessWithJsonApiResponseRefschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap1001Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap1010Builder getBuilderAfterSuccessWithJsonApiResponseStringHeader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap1010Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap1100Builder implements SetterForSuccessWithJsonApiResponseInt32<SuccessWithJsonApiResponseHeadersSchemaMap0100Builder>, SetterForSuccessWithJsonApiResponseRefcontentschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap1100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0100Builder getBuilderAfterSuccessWithJsonApiResponseInt32(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0100Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap1000Builder getBuilderAfterSuccessWithJsonApiResponseRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap1000Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap1101Builder implements SetterForSuccessWithJsonApiResponseInt32<SuccessWithJsonApiResponseHeadersSchemaMap0101Builder>, SetterForSuccessWithJsonApiResponseRefcontentschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap1001Builder>, SetterForSuccessWithJsonApiResponseStringHeader<SuccessWithJsonApiResponseHeadersSchemaMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap1101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0101Builder getBuilderAfterSuccessWithJsonApiResponseInt32(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0101Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap1001Builder getBuilderAfterSuccessWithJsonApiResponseRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap1001Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap1100Builder getBuilderAfterSuccessWithJsonApiResponseStringHeader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap1100Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMap1110Builder implements SetterForSuccessWithJsonApiResponseInt32<SuccessWithJsonApiResponseHeadersSchemaMap0110Builder>, SetterForSuccessWithJsonApiResponseRefcontentschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap1010Builder>, SetterForSuccessWithJsonApiResponseRefschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMap1110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0110Builder getBuilderAfterSuccessWithJsonApiResponseInt32(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0110Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap1010Builder getBuilderAfterSuccessWithJsonApiResponseRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap1010Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap1100Builder getBuilderAfterSuccessWithJsonApiResponseRefschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap1100Builder(instance);
        }
    }
    
    public static class SuccessWithJsonApiResponseHeadersSchemaMapBuilder implements SetterForSuccessWithJsonApiResponseInt32<SuccessWithJsonApiResponseHeadersSchemaMap0111Builder>, SetterForSuccessWithJsonApiResponseRefcontentschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap1011Builder>, SetterForSuccessWithJsonApiResponseRefschemaheader<SuccessWithJsonApiResponseHeadersSchemaMap1101Builder>, SetterForSuccessWithJsonApiResponseStringHeader<SuccessWithJsonApiResponseHeadersSchemaMap1110Builder> {
        private final Map<String, @Nullable Object> instance;
        public SuccessWithJsonApiResponseHeadersSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap0111Builder getBuilderAfterSuccessWithJsonApiResponseInt32(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap0111Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap1011Builder getBuilderAfterSuccessWithJsonApiResponseRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap1011Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap1101Builder getBuilderAfterSuccessWithJsonApiResponseRefschemaheader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap1101Builder(instance);
        }
        public SuccessWithJsonApiResponseHeadersSchemaMap1110Builder getBuilderAfterSuccessWithJsonApiResponseStringHeader(Map<String, @Nullable Object> instance) {
            return new SuccessWithJsonApiResponseHeadersSchemaMap1110Builder(instance);
        }
    }
    
    
    public sealed interface SuccessWithJsonApiResponseHeadersSchema1Boxed permits SuccessWithJsonApiResponseHeadersSchema1BoxedMap {
        @Nullable Object getData();
    }
    
    public record SuccessWithJsonApiResponseHeadersSchema1BoxedMap(SuccessWithJsonApiResponseHeadersSchemaMap data) implements SuccessWithJsonApiResponseHeadersSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class SuccessWithJsonApiResponseHeadersSchema1 extends JsonSchema<SuccessWithJsonApiResponseHeadersSchema1Boxed> implements MapSchemaValidator<SuccessWithJsonApiResponseHeadersSchemaMap, SuccessWithJsonApiResponseHeadersSchema1BoxedMap> {
        private static @Nullable SuccessWithJsonApiResponseHeadersSchema1 instance = null;
    
        protected SuccessWithJsonApiResponseHeadersSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("ref-schema-header", StringWithValidation.StringWithValidation1.class),
                    new PropertyEntry("int32", Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1.class),
                    new PropertyEntry("ref-content-schema-header", StringWithValidation.StringWithValidation1.class),
                    new PropertyEntry("stringHeader", StringHeaderSchema.StringHeaderSchema1.class),
                    new PropertyEntry("numberHeader", NumberHeaderSchema.NumberHeaderSchema1.class)
                ))
                .required(Set.of(
                    "int32",
                    "ref-content-schema-header",
                    "ref-schema-header",
                    "stringHeader"
                ))
                .additionalProperties(SuccessWithJsonApiResponseAdditionalProperties.class)
            );
        }
    
        public static SuccessWithJsonApiResponseHeadersSchema1 getInstance() {
            if (instance == null) {
                instance = new SuccessWithJsonApiResponseHeadersSchema1();
            }
            return instance;
        }
        
        public SuccessWithJsonApiResponseHeadersSchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
                LinkedHashMap<JsonSchema<?>, Nothing?> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new SuccessWithJsonApiResponseHeadersSchemaMap(castProperties);
        }
        
        public SuccessWithJsonApiResponseHeadersSchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public SuccessWithJsonApiResponseHeadersSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new SuccessWithJsonApiResponseHeadersSchema1BoxedMap(validate(arg, configuration));
        }
        @Override
        public SuccessWithJsonApiResponseHeadersSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
