package org.openapijsonschematools.client.components.responses.successwithjsonapiresponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.NonNull;
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
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
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
        
        public int int32() {
                        @Nullable Object value = get("int32");
            if (!(value instanceof Integer)) {
                throw new InvalidTypeException("Invalid value stored for int32");
            }
            return (int) value;
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
    public static class HeadersMapInput {
        // requiredProperties, optionalProperties, NO additionalProperties
    }
    
    
    public static class Headers1 extends JsonSchema implements MapSchemaValidator<HeadersMap> {
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
        
        public HeadersMap validate(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }

}
