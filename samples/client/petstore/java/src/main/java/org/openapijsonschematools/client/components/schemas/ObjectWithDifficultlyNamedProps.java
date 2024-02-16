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
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.IntJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ObjectWithDifficultlyNamedProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Specialpropertyname extends Int64JsonSchema.Int64JsonSchema1 {
        private static @Nullable Specialpropertyname instance = null;
        public static Specialpropertyname getInstance() {
            if (instance == null) {
                instance = new Specialpropertyname();
            }
            return instance;
        }
    }
    
    
    public static class Schema123list extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Schema123list instance = null;
        public static Schema123list getInstance() {
            if (instance == null) {
                instance = new Schema123list();
            }
            return instance;
        }
    }
    
    
    public static class Schema123Number extends IntJsonSchema.IntJsonSchema1 {
        private static @Nullable Schema123Number instance = null;
        public static Schema123Number getInstance() {
            if (instance == null) {
                instance = new Schema123Number();
            }
            return instance;
        }
    }
    
    
    public static class ObjectWithDifficultlyNamedPropsMap extends FrozenMap<@Nullable Object> {
        protected ObjectWithDifficultlyNamedPropsMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "123-list"
        );
        public static final Set<String> optionalKeys = Set.of(
            "$special[property.name]",
            "123Number"
        );
        public static ObjectWithDifficultlyNamedPropsMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectWithDifficultlyNamedProps1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForSchema123list <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSchema123list(Map<String, @Nullable Object> instance);
        
        default T set123HyphenMinusList(String value) {
            var instance = getInstance();
            instance.put("123-list", value);
            return getBuilderAfterSchema123list(instance);
        }
    }
    
    public interface SetterForSpecialpropertyname <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSpecialpropertyname(Map<String, @Nullable Object> instance);
        
        default T setDollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(int value) {
            var instance = getInstance();
            instance.put("$special[property.name]", value);
            return getBuilderAfterSpecialpropertyname(instance);
        }
        
        default T setDollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(float value) {
            var instance = getInstance();
            instance.put("$special[property.name]", value);
            return getBuilderAfterSpecialpropertyname(instance);
        }
        
        default T setDollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(long value) {
            var instance = getInstance();
            instance.put("$special[property.name]", value);
            return getBuilderAfterSpecialpropertyname(instance);
        }
        
        default T setDollarSignSpecialLeftSquareBracketPropertyFullStopNameRightSquareBracket(double value) {
            var instance = getInstance();
            instance.put("$special[property.name]", value);
            return getBuilderAfterSpecialpropertyname(instance);
        }
    }
    
    public interface SetterForSchema123Number <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSchema123Number(Map<String, @Nullable Object> instance);
        
        default T set123number(int value) {
            var instance = getInstance();
            instance.put("123Number", value);
            return getBuilderAfterSchema123Number(instance);
        }
        
        default T set123number(float value) {
            var instance = getInstance();
            instance.put("123Number", value);
            return getBuilderAfterSchema123Number(instance);
        }
        
        default T set123number(long value) {
            var instance = getInstance();
            instance.put("123Number", value);
            return getBuilderAfterSchema123Number(instance);
        }
        
        default T set123number(double value) {
            var instance = getInstance();
            instance.put("123Number", value);
            return getBuilderAfterSchema123Number(instance);
        }
    }
    
    public static class ObjectWithDifficultlyNamedPropsMap0Builder extends UnsetAddPropsSetter<ObjectWithDifficultlyNamedPropsMap0Builder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForSpecialpropertyname<ObjectWithDifficultlyNamedPropsMap0Builder>, SetterForSchema123Number<ObjectWithDifficultlyNamedPropsMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "123-list",
            "$special[property.name]",
            "123Number"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ObjectWithDifficultlyNamedPropsMap0Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectWithDifficultlyNamedPropsMap0Builder getBuilderAfterSpecialpropertyname(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ObjectWithDifficultlyNamedPropsMap0Builder getBuilderAfterSchema123Number(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ObjectWithDifficultlyNamedPropsMap0Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class ObjectWithDifficultlyNamedPropsMapBuilder implements SetterForSchema123list<ObjectWithDifficultlyNamedPropsMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        public ObjectWithDifficultlyNamedPropsMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectWithDifficultlyNamedPropsMap0Builder getBuilderAfterSchema123list(Map<String, @Nullable Object> instance) {
            return new ObjectWithDifficultlyNamedPropsMap0Builder(instance);
        }
    }
    
    
    public static abstract sealed class ObjectWithDifficultlyNamedProps1Boxed permits ObjectWithDifficultlyNamedProps1BoxedMap {
        public abstract @Nullable Object data();
    }
    
    public static final class ObjectWithDifficultlyNamedProps1BoxedMap extends ObjectWithDifficultlyNamedProps1Boxed {
        public final ObjectWithDifficultlyNamedPropsMap data;
        private ObjectWithDifficultlyNamedProps1BoxedMap(ObjectWithDifficultlyNamedPropsMap data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    public static class ObjectWithDifficultlyNamedProps1 extends JsonSchema implements MapSchemaValidator<ObjectWithDifficultlyNamedPropsMap, ObjectWithDifficultlyNamedProps1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        model with properties that have invalid names for python
        */
        private static @Nullable ObjectWithDifficultlyNamedProps1 instance = null;
    
        protected ObjectWithDifficultlyNamedProps1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("$special[property.name]", Specialpropertyname.class),
                    new PropertyEntry("123-list", Schema123list.class),
                    new PropertyEntry("123Number", Schema123Number.class)
                ))
                .required(Set.of(
                    "123-list"
                ))
            );
        }
    
        public static ObjectWithDifficultlyNamedProps1 getInstance() {
            if (instance == null) {
                instance = new ObjectWithDifficultlyNamedProps1();
            }
            return instance;
        }
        
        public ObjectWithDifficultlyNamedPropsMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ObjectWithDifficultlyNamedPropsMap(castProperties);
        }
        
        public ObjectWithDifficultlyNamedPropsMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public ObjectWithDifficultlyNamedProps1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ObjectWithDifficultlyNamedProps1BoxedMap(validate(arg, configuration));
        }
    }

}
