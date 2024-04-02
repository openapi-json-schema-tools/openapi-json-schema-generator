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

public class Code200ResponseHeadersSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Code200ResponseAdditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable Code200ResponseAdditionalProperties instance = null;
        public static Code200ResponseAdditionalProperties getInstance() {
            if (instance == null) {
                instance = new Code200ResponseAdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class Code200ResponseHeadersSchemaMap extends FrozenMap<@Nullable Object> {
        protected Code200ResponseHeadersSchemaMap(FrozenMap<@Nullable Object> m) {
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
        public static Code200ResponseHeadersSchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return Code200ResponseHeadersSchema1.getInstance().validate(arg, configuration);
        }
        
        public Number int32() {
                        @Nullable Object value = get("int32");
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for int32");
            }
            return (Number) value;
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
    
    public interface SetterForCode200ResponseXRateLimit <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCode200ResponseXRateLimit(Map<String, @Nullable Object> instance);
        
        default T xHyphenMinusRateHyphenMinusLimit(int value) {
            var instance = getInstance();
            instance.put("X-Rate-Limit", value);
            return getBuilderAfterCode200ResponseXRateLimit(instance);
        }
        
        default T xHyphenMinusRateHyphenMinusLimit(float value) {
            var instance = getInstance();
            instance.put("X-Rate-Limit", value);
            return getBuilderAfterCode200ResponseXRateLimit(instance);
        }
    }
    
    public interface SetterForCode200ResponseInt32 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCode200ResponseInt32(Map<String, @Nullable Object> instance);
        
        default T int32(int value) {
            var instance = getInstance();
            instance.put("int32", value);
            return getBuilderAfterCode200ResponseInt32(instance);
        }
        
        default T int32(float value) {
            var instance = getInstance();
            instance.put("int32", value);
            return getBuilderAfterCode200ResponseInt32(instance);
        }
    }
    
    public interface SetterForCode200ResponseRefcontentschemaheader <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCode200ResponseRefcontentschemaheader(Map<String, @Nullable Object> instance);
        
        default T refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) {
            var instance = getInstance();
            instance.put("ref-content-schema-header", value);
            return getBuilderAfterCode200ResponseRefcontentschemaheader(instance);
        }
    }
    
    public interface SetterForCode200ResponseXExpiresAfter <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCode200ResponseXExpiresAfter(Map<String, @Nullable Object> instance);
        
        default T xHyphenMinusExpiresHyphenMinusAfter(String value) {
            var instance = getInstance();
            instance.put("X-Expires-After", value);
            return getBuilderAfterCode200ResponseXExpiresAfter(instance);
        }
    }
    
    public interface SetterForCode200ResponseNumberHeader <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCode200ResponseNumberHeader(Map<String, @Nullable Object> instance);
        
        default T numberHeader(String value) {
            var instance = getInstance();
            instance.put("numberHeader", value);
            return getBuilderAfterCode200ResponseNumberHeader(instance);
        }
    }
    
    public static class Code200ResponseHeadersSchemaMap000Builder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForCode200ResponseXExpiresAfter<Code200ResponseHeadersSchemaMap000Builder>, SetterForCode200ResponseNumberHeader<Code200ResponseHeadersSchemaMap000Builder> {
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
        public Code200ResponseHeadersSchemaMap000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Code200ResponseHeadersSchemaMap000Builder getBuilderAfterCode200ResponseXExpiresAfter(Map<String, @Nullable Object> instance) {
            return this;
        }
        public Code200ResponseHeadersSchemaMap000Builder getBuilderAfterCode200ResponseNumberHeader(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class Code200ResponseHeadersSchemaMap001Builder implements SetterForCode200ResponseRefcontentschemaheader<Code200ResponseHeadersSchemaMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Code200ResponseHeadersSchemaMap001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Code200ResponseHeadersSchemaMap000Builder getBuilderAfterCode200ResponseRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new Code200ResponseHeadersSchemaMap000Builder(instance);
        }
    }
    
    public static class Code200ResponseHeadersSchemaMap010Builder implements SetterForCode200ResponseInt32<Code200ResponseHeadersSchemaMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Code200ResponseHeadersSchemaMap010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Code200ResponseHeadersSchemaMap000Builder getBuilderAfterCode200ResponseInt32(Map<String, @Nullable Object> instance) {
            return new Code200ResponseHeadersSchemaMap000Builder(instance);
        }
    }
    
    public static class Code200ResponseHeadersSchemaMap011Builder implements SetterForCode200ResponseInt32<Code200ResponseHeadersSchemaMap001Builder>, SetterForCode200ResponseRefcontentschemaheader<Code200ResponseHeadersSchemaMap010Builder> {
        private final Map<String, @Nullable Object> instance;
        public Code200ResponseHeadersSchemaMap011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Code200ResponseHeadersSchemaMap001Builder getBuilderAfterCode200ResponseInt32(Map<String, @Nullable Object> instance) {
            return new Code200ResponseHeadersSchemaMap001Builder(instance);
        }
        public Code200ResponseHeadersSchemaMap010Builder getBuilderAfterCode200ResponseRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new Code200ResponseHeadersSchemaMap010Builder(instance);
        }
    }
    
    public static class Code200ResponseHeadersSchemaMap100Builder implements SetterForCode200ResponseXRateLimit<Code200ResponseHeadersSchemaMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public Code200ResponseHeadersSchemaMap100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Code200ResponseHeadersSchemaMap000Builder getBuilderAfterCode200ResponseXRateLimit(Map<String, @Nullable Object> instance) {
            return new Code200ResponseHeadersSchemaMap000Builder(instance);
        }
    }
    
    public static class Code200ResponseHeadersSchemaMap101Builder implements SetterForCode200ResponseXRateLimit<Code200ResponseHeadersSchemaMap001Builder>, SetterForCode200ResponseRefcontentschemaheader<Code200ResponseHeadersSchemaMap100Builder> {
        private final Map<String, @Nullable Object> instance;
        public Code200ResponseHeadersSchemaMap101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Code200ResponseHeadersSchemaMap001Builder getBuilderAfterCode200ResponseXRateLimit(Map<String, @Nullable Object> instance) {
            return new Code200ResponseHeadersSchemaMap001Builder(instance);
        }
        public Code200ResponseHeadersSchemaMap100Builder getBuilderAfterCode200ResponseRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new Code200ResponseHeadersSchemaMap100Builder(instance);
        }
    }
    
    public static class Code200ResponseHeadersSchemaMap110Builder implements SetterForCode200ResponseXRateLimit<Code200ResponseHeadersSchemaMap010Builder>, SetterForCode200ResponseInt32<Code200ResponseHeadersSchemaMap100Builder> {
        private final Map<String, @Nullable Object> instance;
        public Code200ResponseHeadersSchemaMap110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Code200ResponseHeadersSchemaMap010Builder getBuilderAfterCode200ResponseXRateLimit(Map<String, @Nullable Object> instance) {
            return new Code200ResponseHeadersSchemaMap010Builder(instance);
        }
        public Code200ResponseHeadersSchemaMap100Builder getBuilderAfterCode200ResponseInt32(Map<String, @Nullable Object> instance) {
            return new Code200ResponseHeadersSchemaMap100Builder(instance);
        }
    }
    
    public static class Code200ResponseHeadersSchemaMapBuilder implements SetterForCode200ResponseXRateLimit<Code200ResponseHeadersSchemaMap011Builder>, SetterForCode200ResponseInt32<Code200ResponseHeadersSchemaMap101Builder>, SetterForCode200ResponseRefcontentschemaheader<Code200ResponseHeadersSchemaMap110Builder> {
        private final Map<String, @Nullable Object> instance;
        public Code200ResponseHeadersSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public Code200ResponseHeadersSchemaMap011Builder getBuilderAfterCode200ResponseXRateLimit(Map<String, @Nullable Object> instance) {
            return new Code200ResponseHeadersSchemaMap011Builder(instance);
        }
        public Code200ResponseHeadersSchemaMap101Builder getBuilderAfterCode200ResponseInt32(Map<String, @Nullable Object> instance) {
            return new Code200ResponseHeadersSchemaMap101Builder(instance);
        }
        public Code200ResponseHeadersSchemaMap110Builder getBuilderAfterCode200ResponseRefcontentschemaheader(Map<String, @Nullable Object> instance) {
            return new Code200ResponseHeadersSchemaMap110Builder(instance);
        }
    }
    
    
    public sealed interface Code200ResponseHeadersSchema1Boxed permits Code200ResponseHeadersSchema1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Code200ResponseHeadersSchema1BoxedMap(Code200ResponseHeadersSchemaMap data) implements Code200ResponseHeadersSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Code200ResponseHeadersSchema1 extends JsonSchema<Code200ResponseHeadersSchema1Boxed> implements MapSchemaValidator<Code200ResponseHeadersSchemaMap, Code200ResponseHeadersSchema1BoxedMap> {
        private static @Nullable Code200ResponseHeadersSchema1 instance = null;
    
        protected Code200ResponseHeadersSchema1() {
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
                .additionalProperties(Code200ResponseAdditionalProperties.class)
            );
        }
    
        public static Code200ResponseHeadersSchema1 getInstance() {
            if (instance == null) {
                instance = new Code200ResponseHeadersSchema1();
            }
            return instance;
        }
        
        public Code200ResponseHeadersSchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new Code200ResponseHeadersSchemaMap(castProperties);
        }
        
        public Code200ResponseHeadersSchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public Code200ResponseHeadersSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Code200ResponseHeadersSchema1BoxedMap(validate(arg, configuration));
        }
        @Override
        public Code200ResponseHeadersSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
