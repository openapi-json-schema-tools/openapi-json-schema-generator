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
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ObjWithRequiredPropsBase {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class B extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable B instance = null;
        public static B getInstance() {
            if (instance == null) {
                instance = new B();
            }
            return instance;
        }
    }
    
    
    public static class ObjWithRequiredPropsBaseMap extends FrozenMap<@Nullable Object> {
        protected ObjWithRequiredPropsBaseMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "b"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static ObjWithRequiredPropsBaseMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjWithRequiredPropsBase1.getInstance().validate(arg, configuration);
        }
        
        public String b() {
                        @Nullable Object value = get("b");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for b");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForB <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterB(Map<String, @Nullable Object> instance);
        
        default T b(String value) {
            var instance = getInstance();
            instance.put("b", value);
            return getBuilderAfterB(instance);
        }
    }
    
    public static class ObjWithRequiredPropsBaseMap0Builder extends UnsetAddPropsSetter<ObjWithRequiredPropsBaseMap0Builder> implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "b"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ObjWithRequiredPropsBaseMap0Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjWithRequiredPropsBaseMap0Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class ObjWithRequiredPropsBaseMapBuilder implements SetterForB<ObjWithRequiredPropsBaseMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        public ObjWithRequiredPropsBaseMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjWithRequiredPropsBaseMap0Builder getBuilderAfterB(Map<String, @Nullable Object> instance) {
            return new ObjWithRequiredPropsBaseMap0Builder(instance);
        }
    }
    
    
    public sealed interface ObjWithRequiredPropsBase1Boxed permits ObjWithRequiredPropsBase1BoxedMap {
        @Nullable Object getData();
    }
    
    public record ObjWithRequiredPropsBase1BoxedMap(ObjWithRequiredPropsBaseMap data) implements ObjWithRequiredPropsBase1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ObjWithRequiredPropsBase1 extends JsonSchema implements MapSchemaValidator<ObjWithRequiredPropsBaseMap, ObjWithRequiredPropsBase1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ObjWithRequiredPropsBase1 instance = null;
    
        protected ObjWithRequiredPropsBase1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("b", B.class)
                ))
                .required(Set.of(
                    "b"
                ))
            );
        }
    
        public static ObjWithRequiredPropsBase1 getInstance() {
            if (instance == null) {
                instance = new ObjWithRequiredPropsBase1();
            }
            return instance;
        }
        
        public ObjWithRequiredPropsBaseMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ObjWithRequiredPropsBaseMap(castProperties);
        }
        
        public ObjWithRequiredPropsBaseMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public ObjWithRequiredPropsBase1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ObjWithRequiredPropsBase1BoxedMap(validate(arg, configuration));
        }
    }

}
