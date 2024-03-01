package org.openapijsonschematools.client.paths.userlogin.get.responses.code200response;
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
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.headers.xexpiresafter.XExpiresAfterSchema;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.headers.xratelimit.content.applicationjson.XRateLimitSchema;
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
            "X-Rate-Limit",
            "int32",
            "ref-content-schema-header"
        );
        public static final Set<String> optionalKeys = Set.of(
            "X-Expires-After",
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
    
    public static class HeadersSchemaMap000Builder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForXExpiresAfter<HeadersSchemaMap000Builder>, SetterForNumberHeader<HeadersSchemaMap000Builder> {
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
        public HeadersSchemaMap000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap000Builder getBuilderAfterXExpiresAfter(Map<String, @Nullable Object> instance) {
            return this;
        }
        public HeadersSchemaMap000Builder getBuilderAfterNumberHeader(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class HeadersSchemaMap001Builder implements SetterForRefcontentschemaheader<HeadersSchemaMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap000Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap000Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap010Builder implements SetterForInt32<HeadersSchemaMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap000Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap000Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap011Builder implements SetterForInt32<HeadersSchemaMap001Builder>, SetterForRefcontentschemaheader<HeadersSchemaMap010Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap001Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap001Builder(instance);
        }
        public HeadersSchemaMap010Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap010Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap100Builder implements SetterForXRateLimit<HeadersSchemaMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap000Builder getBuilderAfterXRateLimit(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap000Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap101Builder implements SetterForXRateLimit<HeadersSchemaMap001Builder>, SetterForRefcontentschemaheader<HeadersSchemaMap100Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap001Builder getBuilderAfterXRateLimit(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap001Builder(instance);
        }
        public HeadersSchemaMap100Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap100Builder(instance);
        }
    }
    
    public static class HeadersSchemaMap110Builder implements SetterForXRateLimit<HeadersSchemaMap010Builder>, SetterForInt32<HeadersSchemaMap100Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMap110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap010Builder getBuilderAfterXRateLimit(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap010Builder(instance);
        }
        public HeadersSchemaMap100Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap100Builder(instance);
        }
    }
    
    public static class HeadersSchemaMapBuilder implements SetterForXRateLimit<HeadersSchemaMap011Builder>, SetterForInt32<HeadersSchemaMap101Builder>, SetterForRefcontentschemaheader<HeadersSchemaMap110Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeadersSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeadersSchemaMap011Builder getBuilderAfterXRateLimit(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap011Builder(instance);
        }
        public HeadersSchemaMap101Builder getBuilderAfterInt32(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap101Builder(instance);
        }
        public HeadersSchemaMap110Builder getBuilderAfterRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new HeadersSchemaMap110Builder(instance);
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
