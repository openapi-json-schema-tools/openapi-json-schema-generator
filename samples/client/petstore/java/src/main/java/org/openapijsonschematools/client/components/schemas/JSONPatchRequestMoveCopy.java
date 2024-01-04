package org.openapijsonschematools.client.components.schemas;
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
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.BaseBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringEnumValidator;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.StringValueMethod;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class JSONPatchRequestMoveCopy {
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
    
    
    public static class From extends StringJsonSchema {
        private static @Nullable From instance = null;
        public static From getInstance() {
            if (instance == null) {
                instance = new From();
            }
            return instance;
        }
    }
    
    
    public static class Path extends StringJsonSchema {
        private static @Nullable Path instance = null;
        public static Path getInstance() {
            if (instance == null) {
                instance = new Path();
            }
            return instance;
        }
    }
    
    public enum StringOpEnums implements StringValueMethod {
        MOVE("move"),
        COPY("copy");
        private final String value;
    
        StringOpEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public static class Op extends JsonSchema implements StringSchemaValidator, StringEnumValidator<StringOpEnums> {
        private static @Nullable Op instance = null;
    
        protected Op() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "move",
                    "copy"
                ))
            );
        }
    
        public static Op getInstance() {
            if (instance == null) {
                instance = new Op();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public String validate(StringOpEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class JSONPatchRequestMoveCopyMap extends FrozenMap<String> {
        protected JSONPatchRequestMoveCopyMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "from",
            "op",
            "path"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static JSONPatchRequestMoveCopyMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JSONPatchRequestMoveCopy1.getInstance().validate(arg, configuration);
        }
        
        public String from() {
            return getOrThrow("from");
        }
        
        public String op() {
                        String value = get("op");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for op");
            }
            return (String) value;
        }
        
        public String path() {
            return getOrThrow("path");
        }
    }
    
    public interface SetterForFrom <T> {
        Map<String, String> getInstance();
        T getBuilderAfterFrom(Map<String, String> instance);
        
        default T from(String value) {
            var instance = getInstance();
            instance.put("from", value);
            return getBuilderAfterFrom(instance);
        }
    }
    
    public interface SetterForOp <T> {
        Map<String, String> getInstance();
        T getBuilderAfterOp(Map<String, String> instance);
        
        default T op(String value) {
            var instance = getInstance();
            instance.put("op", value);
            return getBuilderAfterOp(instance);
        }
        
        default T op(StringOpEnums value) {
            var instance = getInstance();
            instance.put("op", value.value());
            return getBuilderAfterOp(instance);
        }
    }
    
    public interface SetterForPath <T> {
        Map<String, String> getInstance();
        T getBuilderAfterPath(Map<String, String> instance);
        
        default T path(String value) {
            var instance = getInstance();
            instance.put("path", value);
            return getBuilderAfterPath(instance);
        }
    }
    
    public static class JSONPatchRequestMoveCopyMap000Builder implements BaseBuilder<String> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "from",
            "op",
            "path"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public JSONPatchRequestMoveCopyMap000Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> build() {
            return instance;
        }
    }
    
    public static class JSONPatchRequestMoveCopyMap001Builder implements SetterForPath<JSONPatchRequestMoveCopyMap000Builder> {
        private final Map<String, String> instance;
        public JSONPatchRequestMoveCopyMap001Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public JSONPatchRequestMoveCopyMap000Builder getBuilderAfterPath(Map<String, String> instance) {
            return new JSONPatchRequestMoveCopyMap000Builder(instance);
        }
    }
    
    public static class JSONPatchRequestMoveCopyMap010Builder implements SetterForOp<JSONPatchRequestMoveCopyMap000Builder> {
        private final Map<String, String> instance;
        public JSONPatchRequestMoveCopyMap010Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public JSONPatchRequestMoveCopyMap000Builder getBuilderAfterOp(Map<String, String> instance) {
            return new JSONPatchRequestMoveCopyMap000Builder(instance);
        }
    }
    
    public static class JSONPatchRequestMoveCopyMap011Builder implements SetterForOp<JSONPatchRequestMoveCopyMap001Builder>, SetterForPath<JSONPatchRequestMoveCopyMap010Builder> {
        private final Map<String, String> instance;
        public JSONPatchRequestMoveCopyMap011Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public JSONPatchRequestMoveCopyMap001Builder getBuilderAfterOp(Map<String, String> instance) {
            return new JSONPatchRequestMoveCopyMap001Builder(instance);
        }
        public JSONPatchRequestMoveCopyMap010Builder getBuilderAfterPath(Map<String, String> instance) {
            return new JSONPatchRequestMoveCopyMap010Builder(instance);
        }
    }
    
    public static class JSONPatchRequestMoveCopyMap100Builder implements SetterForFrom<JSONPatchRequestMoveCopyMap000Builder> {
        private final Map<String, String> instance;
        public JSONPatchRequestMoveCopyMap100Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public JSONPatchRequestMoveCopyMap000Builder getBuilderAfterFrom(Map<String, String> instance) {
            return new JSONPatchRequestMoveCopyMap000Builder(instance);
        }
    }
    
    public static class JSONPatchRequestMoveCopyMap101Builder implements SetterForFrom<JSONPatchRequestMoveCopyMap001Builder>, SetterForPath<JSONPatchRequestMoveCopyMap100Builder> {
        private final Map<String, String> instance;
        public JSONPatchRequestMoveCopyMap101Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public JSONPatchRequestMoveCopyMap001Builder getBuilderAfterFrom(Map<String, String> instance) {
            return new JSONPatchRequestMoveCopyMap001Builder(instance);
        }
        public JSONPatchRequestMoveCopyMap100Builder getBuilderAfterPath(Map<String, String> instance) {
            return new JSONPatchRequestMoveCopyMap100Builder(instance);
        }
    }
    
    public static class JSONPatchRequestMoveCopyMap110Builder implements SetterForFrom<JSONPatchRequestMoveCopyMap010Builder>, SetterForOp<JSONPatchRequestMoveCopyMap100Builder> {
        private final Map<String, String> instance;
        public JSONPatchRequestMoveCopyMap110Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public JSONPatchRequestMoveCopyMap010Builder getBuilderAfterFrom(Map<String, String> instance) {
            return new JSONPatchRequestMoveCopyMap010Builder(instance);
        }
        public JSONPatchRequestMoveCopyMap100Builder getBuilderAfterOp(Map<String, String> instance) {
            return new JSONPatchRequestMoveCopyMap100Builder(instance);
        }
    }
    
    public static class JSONPatchRequestMoveCopyMapBuilder implements SetterForFrom<JSONPatchRequestMoveCopyMap011Builder>, SetterForOp<JSONPatchRequestMoveCopyMap101Builder>, SetterForPath<JSONPatchRequestMoveCopyMap110Builder> {
        private final Map<String, String> instance;
        public JSONPatchRequestMoveCopyMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public JSONPatchRequestMoveCopyMap011Builder getBuilderAfterFrom(Map<String, String> instance) {
            return new JSONPatchRequestMoveCopyMap011Builder(instance);
        }
        public JSONPatchRequestMoveCopyMap101Builder getBuilderAfterOp(Map<String, String> instance) {
            return new JSONPatchRequestMoveCopyMap101Builder(instance);
        }
        public JSONPatchRequestMoveCopyMap110Builder getBuilderAfterPath(Map<String, String> instance) {
            return new JSONPatchRequestMoveCopyMap110Builder(instance);
        }
    }
    
    
    public static class JSONPatchRequestMoveCopy1 extends JsonSchema implements MapSchemaValidator<JSONPatchRequestMoveCopyMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable JSONPatchRequestMoveCopy1 instance = null;
    
        protected JSONPatchRequestMoveCopy1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("from", From.class),
                    new PropertyEntry("path", Path.class),
                    new PropertyEntry("op", Op.class)
                ))
                .required(Set.of(
                    "from",
                    "op",
                    "path"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static JSONPatchRequestMoveCopy1 getInstance() {
            if (instance == null) {
                instance = new JSONPatchRequestMoveCopy1();
            }
            return instance;
        }
        
        public JSONPatchRequestMoveCopyMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                if (!(propertyInstance instanceof String)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (String) propertyInstance);
            }
            FrozenMap<String> castProperties = new FrozenMap<>(properties);
            return new JSONPatchRequestMoveCopyMap(castProperties);
        }
        
        public JSONPatchRequestMoveCopyMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
