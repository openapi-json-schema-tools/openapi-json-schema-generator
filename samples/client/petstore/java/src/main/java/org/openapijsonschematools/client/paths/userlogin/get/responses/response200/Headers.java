package org.openapijsonschematools.client.paths.userlogin.get.responses.response200;
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
import org.openapijsonschematools.client.components.schemas.StringWithValidation;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.userlogin.get.responses.response200.headers.xexpiresafter.XExpiresAfterSchema;
import org.openapijsonschematools.client.paths.userlogin.get.responses.response200.headers.xratelimit.content.applicationjson.XRateLimitSchema;
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
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {
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
            "X-Rate-Limit",
            "int32",
            "ref-content-schema-header"
        );
        public static final Set<String> optionalKeys = Set.of(
            "X-Expires-After",
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
    
    public interface SetterForXRateLimit <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterXRateLimit(Map<String, @Nullable Object> instance);
        
        default T setXHyphenMinusRateHyphenMinusLimit(int value) {
            var instance = getInstance();
            instance.put("X-Rate-Limit", value);
            return getBuilderAfterXRateLimit(instance);
        }
        
        default T setXHyphenMinusRateHyphenMinusLimit(float value) {
            var instance = getInstance();
            instance.put("X-Rate-Limit", value);
            return getBuilderAfterXRateLimit(instance);
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
    
    public interface SetterForXExpiresAfter <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterXExpiresAfter(Map<String, @Nullable Object> instance);
        
        default T setXHyphenMinusExpiresHyphenMinusAfter(String value) {
            var instance = getInstance();
            instance.put("X-Expires-After", value);
            return getBuilderAfterXExpiresAfter(instance);
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
    
    public static class HeadersMap000Builder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForXExpiresAfter<HeadersMap000Builder>, SetterForNumberHeader<HeadersMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "X-Rate-Limit",
            "int32",
            "ref-content-schema-header",
            "X-Expires-After",
            "numberHeader"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public HeadersMap000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap000Builder getBuilderAfterXExpiresAfter(Map<String, @Nullable Object> instance) {
            return this;
        }
        public HeadersMap000Builder getBuilderAfterNumberHeader(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class HeadersMap001Builder implements SetterForRefcontentschemaheader<HeadersMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap000Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap000Builder(instance);
        }
    }
    
    public static class HeadersMap010Builder implements SetterForInt32<HeadersMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap000Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersMap000Builder(instance);
        }
    }
    
    public static class HeadersMap011Builder implements SetterForInt32<HeadersMap001Builder>, SetterForRefcontentschemaheader<HeadersMap010Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap001Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersMap001Builder(instance);
        }
        public HeadersMap010Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap010Builder(instance);
        }
    }
    
    public static class HeadersMap100Builder implements SetterForXRateLimit<HeadersMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap000Builder getBuilderAfterXRateLimit(Map<String, @Nullable Object> instance) {
            return new HeadersMap000Builder(instance);
        }
    }
    
    public static class HeadersMap101Builder implements SetterForXRateLimit<HeadersMap001Builder>, SetterForRefcontentschemaheader<HeadersMap100Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap001Builder getBuilderAfterXRateLimit(Map<String, @Nullable Object> instance) {
            return new HeadersMap001Builder(instance);
        }
        public HeadersMap100Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap100Builder(instance);
        }
    }
    
    public static class HeadersMap110Builder implements SetterForXRateLimit<HeadersMap010Builder>, SetterForInt32<HeadersMap100Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMap110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap010Builder getBuilderAfterXRateLimit(Map<String, @Nullable Object> instance) {
            return new HeadersMap010Builder(instance);
        }
        public HeadersMap100Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersMap100Builder(instance);
        }
    }
    
    public static class HeadersMapBuilder implements SetterForXRateLimit<HeadersMap011Builder>, SetterForInt32<HeadersMap101Builder>, SetterForRefcontentschemaheader<HeadersMap110Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersMap011Builder getBuilderAfterXRateLimit(Map<String, @Nullable Object> instance) {
            return new HeadersMap011Builder(instance);
        }
        public HeadersMap101Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersMap101Builder(instance);
        }
        public HeadersMap110Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersMap110Builder(instance);
        }
    }
    
    
    public static class Headers1 extends JsonSchema implements MapSchemaValidator<HeadersMap> {
        private static @Nullable Headers1 instance = null;
    
        protected Headers1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("X-Rate-Limit", XRateLimitSchema.XRateLimitSchema1.class),
                    new PropertyEntry("int32", Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1.class),
                    new PropertyEntry("X-Expires-After", XExpiresAfterSchema.XExpiresAfterSchema1.class),
                    new PropertyEntry("ref-content-schema-header", StringWithValidation.StringWithValidation1.class),
                    new PropertyEntry("numberHeader", NumberHeaderSchema.NumberHeaderSchema1.class)
                ))
                .required(Set.of(
                    "X-Rate-Limit",
                    "int32",
                    "ref-content-schema-header"
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
    }

}
