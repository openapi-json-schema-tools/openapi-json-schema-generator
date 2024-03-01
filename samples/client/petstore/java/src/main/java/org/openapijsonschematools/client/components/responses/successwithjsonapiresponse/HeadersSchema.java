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

public class HeadersSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class HeadersSchemaMap extends FrozenMap<@Nullable Object> {
        protected HeadersSchemaMap(FrozenMap<@Nullable Object> m) {
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
        public static HeadersSchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return HeadersSchema1.getInstance().validate(arg, configuration);
        }
        
        public Number int32() {
                        @Nullable Object value = get("int32");
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for int32");
            }
            return (Number) value;
        }
        
        public String stringHeader() {
                        @Nullable Object value = get("stringHeader");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for stringHeader");
            }
            return (String) value;
        }
        
        public String numberHeader() throws UnsetPropertyException {
            String key = "numberHeader";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for numberHeader");
            }
            return (String) value;
        }
    }
    
    public interface SetterForInt32 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterInt32(Map<String, @Nullable Object> instance);
        
        default T int32(int value) {
            var instance = getInstance();
            instance.put("int32", value);
            return getBuilderAfterInt32(instance);
        }
        
        default T int32(float value) {
            var instance = getInstance();
            instance.put("int32", value);
            return getBuilderAfterInt32(instance);
        }
    }
    
    public interface SetterForRefcontentschemaheader <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance);
        
        default T setRefHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) {
            var instance = getInstance();
            instance.put("ref-content-schema-header", value);
            return getBuilderAfterRefcontentschemaheader(instance);
        }
    }
    
    public interface SetterForRefschemaheader <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance);
        
        default T setRefHyphenMinusSchemaHyphenMinusHeader(String value) {
            var instance = getInstance();
            instance.put("ref-schema-header", value);
            return getBuilderAfterRefschemaheader(instance);
        }
    }
    
    public interface SetterForStringHeader <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterStringHeader(Map<String, @Nullable Object> instance);
        
        default T stringHeader(String value) {
            var instance = getInstance();
            instance.put("stringHeader", value);
            return getBuilderAfterStringHeader(instance);
        }
    }
    
    public interface SetterForNumberHeader <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterNumberHeader(Map<String, @Nullable Object> instance);
        
        default T numberHeader(String value) {
            var instance = getInstance();
            instance.put("numberHeader", value);
            return getBuilderAfterNumberHeader(instance);
        }
    }
    
    public static class HeadersSchemaMap0000Builder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForNumberHeader<HeadersSchemaMap0000Builder> {
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
        public HeadersSchemaMap0000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0000Builder getBuilderAfterNumberHeader(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class HeadersSchemaMap0001Builder implements SetterForStringHeader<HeadersSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap0001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0000Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0000Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap0010Builder implements SetterForRefschemaheader<HeadersSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap0010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0000Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0000Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap0011Builder implements SetterForRefschemaheader<HeadersSchemaMap0001Builder>, SetterForStringHeader<HeadersSchemaMap0010Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap0011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0001Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0001Builder(instance);
        }
        public HeadersSchemaMap0010Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0010Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap0100Builder implements SetterForRefcontentschemaheader<HeadersSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap0100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0000Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0000Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap0101Builder implements SetterForRefcontentschemaheader<HeadersSchemaMap0001Builder>, SetterForStringHeader<HeadersSchemaMap0100Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap0101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0001Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0001Builder(instance);
        }
        public HeadersSchemaMap0100Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0100Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap0110Builder implements SetterForRefcontentschemaheader<HeadersSchemaMap0010Builder>, SetterForRefschemaheader<HeadersSchemaMap0100Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap0110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0010Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0010Builder(instance);
        }
        public HeadersSchemaMap0100Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0100Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap0111Builder implements SetterForRefcontentschemaheader<HeadersSchemaMap0011Builder>, SetterForRefschemaheader<HeadersSchemaMap0101Builder>, SetterForStringHeader<HeadersSchemaMap0110Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap0111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0011Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0011Builder(instance);
        }
        public HeadersSchemaMap0101Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0101Builder(instance);
        }
        public HeadersSchemaMap0110Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0110Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap1000Builder implements SetterForInt32<HeadersSchemaMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap1000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0000Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0000Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap1001Builder implements SetterForInt32<HeadersSchemaMap0001Builder>, SetterForStringHeader<HeadersSchemaMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap1001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0001Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0001Builder(instance);
        }
        public HeadersSchemaMap1000Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap1000Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap1010Builder implements SetterForInt32<HeadersSchemaMap0010Builder>, SetterForRefschemaheader<HeadersSchemaMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap1010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0010Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0010Builder(instance);
        }
        public HeadersSchemaMap1000Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap1000Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap1011Builder implements SetterForInt32<HeadersSchemaMap0011Builder>, SetterForRefschemaheader<HeadersSchemaMap1001Builder>, SetterForStringHeader<HeadersSchemaMap1010Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap1011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0011Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0011Builder(instance);
        }
        public HeadersSchemaMap1001Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap1001Builder(instance);
        }
        public HeadersSchemaMap1010Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap1010Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap1100Builder implements SetterForInt32<HeadersSchemaMap0100Builder>, SetterForRefcontentschemaheader<HeadersSchemaMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap1100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0100Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0100Builder(instance);
        }
        public HeadersSchemaMap1000Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap1000Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap1101Builder implements SetterForInt32<HeadersSchemaMap0101Builder>, SetterForRefcontentschemaheader<HeadersSchemaMap1001Builder>, SetterForStringHeader<HeadersSchemaMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap1101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0101Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0101Builder(instance);
        }
        public HeadersSchemaMap1001Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap1001Builder(instance);
        }
        public HeadersSchemaMap1100Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap1100Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap1110Builder implements SetterForInt32<HeadersSchemaMap0110Builder>, SetterForRefcontentschemaheader<HeadersSchemaMap1010Builder>, SetterForRefschemaheader<HeadersSchemaMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap1110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0110Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0110Builder(instance);
        }
        public HeadersSchemaMap1010Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap1010Builder(instance);
        }
        public HeadersSchemaMap1100Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap1100Builder(instance);
        }
    }
    
    public static class HeadersSchemaMapBuilder implements SetterForInt32<HeadersSchemaMap0111Builder>, SetterForRefcontentschemaheader<HeadersSchemaMap1011Builder>, SetterForRefschemaheader<HeadersSchemaMap1101Builder>, SetterForStringHeader<HeadersSchemaMap1110Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap0111Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap0111Builder(instance);
        }
        public HeadersSchemaMap1011Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap1011Builder(instance);
        }
        public HeadersSchemaMap1101Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap1101Builder(instance);
        }
        public HeadersSchemaMap1110Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap1110Builder(instance);
        }
    }
    
    
    public sealed interface HeadersSchema1Boxed permits HeadersSchema1BoxedMap {
        @Nullable Object getData();
    }
    
    public record HeadersSchema1BoxedMap(HeadersSchemaMap data) implements HeadersSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class HeadersSchema1 extends JsonSchema<HeadersSchema1Boxed> implements MapSchemaValidator<HeadersSchemaMap, HeadersSchema1BoxedMap> {
        private static @Nullable HeadersSchema1 instance = null;
    
        protected HeadersSchema1() {
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
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static HeadersSchema1 getInstance() {
            if (instance == null) {
                instance = new HeadersSchema1();
            }
            return instance;
        }
        
        public HeadersSchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
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
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new HeadersSchemaMap(castProperties);
        }
        
        public HeadersSchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public HeadersSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new HeadersSchema1BoxedMap(validate(arg, configuration));
        }
        @Override
        public HeadersSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
