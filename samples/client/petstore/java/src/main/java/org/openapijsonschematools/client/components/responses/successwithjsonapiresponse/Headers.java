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

public class Headers {
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
    
    
    public static class HeadersMap extends FrozenMap<@Nullable Object> {
        protected HeadersMap(FrozenMap<@Nullable Object> m) {
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
        public static HeadersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Headers1.getInstance().validate(arg, configuration);
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
    
    public static class HeadersMap0000Builder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForNumberHeader<HeadersMap0000Builder> {
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
        public HeadersMap0000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0000Builder getBuilderAfterNumberHeader(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class HeadersMap0001Builder implements SetterForStringHeader<HeadersMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap0001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0000Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersMap0000Builder(instance);
        }
    }
    
    public static class HeadersMap0010Builder implements SetterForRefschemaheader<HeadersMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap0010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0000Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap0000Builder(instance);
        }
    }
    
    public static class HeadersMap0011Builder implements SetterForRefschemaheader<HeadersMap0001Builder>, SetterForStringHeader<HeadersMap0010Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap0011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0001Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap0001Builder(instance);
        }
        public HeadersMap0010Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersMap0010Builder(instance);
        }
    }
    
    public static class HeadersMap0100Builder implements SetterForRefcontentschemaheader<HeadersMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap0100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0000Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap0000Builder(instance);
        }
    }
    
    public static class HeadersMap0101Builder implements SetterForRefcontentschemaheader<HeadersMap0001Builder>, SetterForStringHeader<HeadersMap0100Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap0101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0001Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap0001Builder(instance);
        }
        public HeadersMap0100Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersMap0100Builder(instance);
        }
    }
    
    public static class HeadersMap0110Builder implements SetterForRefcontentschemaheader<HeadersMap0010Builder>, SetterForRefschemaheader<HeadersMap0100Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap0110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0010Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap0010Builder(instance);
        }
        public HeadersMap0100Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap0100Builder(instance);
        }
    }
    
    public static class HeadersMap0111Builder implements SetterForRefcontentschemaheader<HeadersMap0011Builder>, SetterForRefschemaheader<HeadersMap0101Builder>, SetterForStringHeader<HeadersMap0110Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap0111Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0011Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap0011Builder(instance);
        }
        public HeadersMap0101Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap0101Builder(instance);
        }
        public HeadersMap0110Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersMap0110Builder(instance);
        }
    }
    
    public static class HeadersMap1000Builder implements SetterForInt32<HeadersMap0000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap1000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0000Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersMap0000Builder(instance);
        }
    }
    
    public static class HeadersMap1001Builder implements SetterForInt32<HeadersMap0001Builder>, SetterForStringHeader<HeadersMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap1001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0001Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersMap0001Builder(instance);
        }
        public HeadersMap1000Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersMap1000Builder(instance);
        }
    }
    
    public static class HeadersMap1010Builder implements SetterForInt32<HeadersMap0010Builder>, SetterForRefschemaheader<HeadersMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap1010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0010Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersMap0010Builder(instance);
        }
        public HeadersMap1000Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap1000Builder(instance);
        }
    }
    
    public static class HeadersMap1011Builder implements SetterForInt32<HeadersMap0011Builder>, SetterForRefschemaheader<HeadersMap1001Builder>, SetterForStringHeader<HeadersMap1010Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap1011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0011Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersMap0011Builder(instance);
        }
        public HeadersMap1001Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap1001Builder(instance);
        }
        public HeadersMap1010Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersMap1010Builder(instance);
        }
    }
    
    public static class HeadersMap1100Builder implements SetterForInt32<HeadersMap0100Builder>, SetterForRefcontentschemaheader<HeadersMap1000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap1100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0100Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersMap0100Builder(instance);
        }
        public HeadersMap1000Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap1000Builder(instance);
        }
    }
    
    public static class HeadersMap1101Builder implements SetterForInt32<HeadersMap0101Builder>, SetterForRefcontentschemaheader<HeadersMap1001Builder>, SetterForStringHeader<HeadersMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap1101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0101Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersMap0101Builder(instance);
        }
        public HeadersMap1001Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap1001Builder(instance);
        }
        public HeadersMap1100Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersMap1100Builder(instance);
        }
    }
    
    public static class HeadersMap1110Builder implements SetterForInt32<HeadersMap0110Builder>, SetterForRefcontentschemaheader<HeadersMap1010Builder>, SetterForRefschemaheader<HeadersMap1100Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap1110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0110Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersMap0110Builder(instance);
        }
        public HeadersMap1010Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap1010Builder(instance);
        }
        public HeadersMap1100Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap1100Builder(instance);
        }
    }
    
    public static class HeadersMapBuilder implements SetterForInt32<HeadersMap0111Builder>, SetterForRefcontentschemaheader<HeadersMap1011Builder>, SetterForRefschemaheader<HeadersMap1101Builder>, SetterForStringHeader<HeadersMap1110Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap0111Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersMap0111Builder(instance);
        }
        public HeadersMap1011Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap1011Builder(instance);
        }
        public HeadersMap1101Builder getBuilderAfterRefschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap1101Builder(instance);
        }
        public HeadersMap1110Builder getBuilderAfterStringHeader(Map<String, @Nullable Object> instance) {
            return new HeadersMap1110Builder(instance);
        }
    }
    
    
    public static abstract sealed class Headers1Boxed permits Headers1BoxedMap {}
    public static final class Headers1BoxedMap extends Headers1Boxed {
        public final HeadersMap data;
        private Headers1BoxedMap(HeadersMap data) {
            this.data = data;
        }
    }
    
    
    public static class Headers1 extends JsonSchema implements MapSchemaValidator<HeadersMap, Headers1BoxedMap> {
        private static @Nullable Headers1 instance = null;
    
        protected Headers1() {
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
    
        public static Headers1 getInstance() {
            if (instance == null) {
                instance = new Headers1();
            }
            return instance;
        }
        
        public HeadersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new HeadersMap(castProperties);
        }
        
        public HeadersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public Headers1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Headers1BoxedMap(validate(arg, configuration));
        }
    }

}
