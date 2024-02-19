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
import org.openapijsonschematools.client.schemas.GenericBuilder;
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

public class JSONPatchRequestRemove {
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
    
    
    public static class Path extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Path instance = null;
        public static Path getInstance() {
            if (instance == null) {
                instance = new Path();
            }
            return instance;
        }
    }
    
    public enum StringOpEnums implements StringValueMethod {
        REMOVE("remove");
        private final String value;
    
        StringOpEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface OpBoxed permits OpBoxedString {
        @Nullable Object data();
    }
    
    public static final class OpBoxedString implements OpBoxed {
        public final String data;
        private OpBoxedString(String data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class Op extends JsonSchema implements StringSchemaValidator<OpBoxedString>, StringEnumValidator<StringOpEnums> {
        private static @Nullable Op instance = null;
    
        protected Op() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "remove"
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
        @Override
        public OpBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new OpBoxedString(validate(arg, configuration));
        }
    }    
    
    public static class JSONPatchRequestRemoveMap extends FrozenMap<String> {
        protected JSONPatchRequestRemoveMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "op",
            "path"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static JSONPatchRequestRemoveMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JSONPatchRequestRemove1.getInstance().validate(arg, configuration);
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
    
    public static class JSONPatchRequestRemoveMap00Builder implements GenericBuilder<Map<String, String>> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "op",
            "path"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public JSONPatchRequestRemoveMap00Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> build() {
            return instance;
        }
    }
    
    public static class JSONPatchRequestRemoveMap01Builder implements SetterForPath<JSONPatchRequestRemoveMap00Builder> {
        private final Map<String, String> instance;
        public JSONPatchRequestRemoveMap01Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public JSONPatchRequestRemoveMap00Builder getBuilderAfterPath(Map<String, String> instance) {
            return new JSONPatchRequestRemoveMap00Builder(instance);
        }
    }
    
    public static class JSONPatchRequestRemoveMap10Builder implements SetterForOp<JSONPatchRequestRemoveMap00Builder> {
        private final Map<String, String> instance;
        public JSONPatchRequestRemoveMap10Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public JSONPatchRequestRemoveMap00Builder getBuilderAfterOp(Map<String, String> instance) {
            return new JSONPatchRequestRemoveMap00Builder(instance);
        }
    }
    
    public static class JSONPatchRequestRemoveMapBuilder implements SetterForOp<JSONPatchRequestRemoveMap01Builder>, SetterForPath<JSONPatchRequestRemoveMap10Builder> {
        private final Map<String, String> instance;
        public JSONPatchRequestRemoveMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public JSONPatchRequestRemoveMap01Builder getBuilderAfterOp(Map<String, String> instance) {
            return new JSONPatchRequestRemoveMap01Builder(instance);
        }
        public JSONPatchRequestRemoveMap10Builder getBuilderAfterPath(Map<String, String> instance) {
            return new JSONPatchRequestRemoveMap10Builder(instance);
        }
    }
    
    
    public sealed interface JSONPatchRequestRemove1Boxed permits JSONPatchRequestRemove1BoxedMap {
        @Nullable Object data();
    }
    
    public static final class JSONPatchRequestRemove1BoxedMap implements JSONPatchRequestRemove1Boxed {
        public final JSONPatchRequestRemoveMap data;
        private JSONPatchRequestRemove1BoxedMap(JSONPatchRequestRemoveMap data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    public static class JSONPatchRequestRemove1 extends JsonSchema implements MapSchemaValidator<JSONPatchRequestRemoveMap, JSONPatchRequestRemove1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable JSONPatchRequestRemove1 instance = null;
    
        protected JSONPatchRequestRemove1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("path", Path.class),
                    new PropertyEntry("op", Op.class)
                ))
                .required(Set.of(
                    "op",
                    "path"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static JSONPatchRequestRemove1 getInstance() {
            if (instance == null) {
                instance = new JSONPatchRequestRemove1();
            }
            return instance;
        }
        
        public JSONPatchRequestRemoveMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new JSONPatchRequestRemoveMap(castProperties);
        }
        
        public JSONPatchRequestRemoveMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public JSONPatchRequestRemove1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new JSONPatchRequestRemove1BoxedMap(validate(arg, configuration));
        }
    }

}
