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
import org.openapijsonschematools.client.schemas.BaseBuilder;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Capitalization {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SmallCamel extends StringJsonSchema {
        private static @Nullable SmallCamel instance = null;
        public static SmallCamel getInstance() {
            if (instance == null) {
                instance = new SmallCamel();
            }
            return instance;
        }
    }
    
    
    public static class CapitalCamel extends StringJsonSchema {
        private static @Nullable CapitalCamel instance = null;
        public static CapitalCamel getInstance() {
            if (instance == null) {
                instance = new CapitalCamel();
            }
            return instance;
        }
    }
    
    
    public static class SmallSnake extends StringJsonSchema {
        private static @Nullable SmallSnake instance = null;
        public static SmallSnake getInstance() {
            if (instance == null) {
                instance = new SmallSnake();
            }
            return instance;
        }
    }
    
    
    public static class CapitalSnake extends StringJsonSchema {
        private static @Nullable CapitalSnake instance = null;
        public static CapitalSnake getInstance() {
            if (instance == null) {
                instance = new CapitalSnake();
            }
            return instance;
        }
    }
    
    
    public static class SCAETHFlowPoints extends StringJsonSchema {
        private static @Nullable SCAETHFlowPoints instance = null;
        public static SCAETHFlowPoints getInstance() {
            if (instance == null) {
                instance = new SCAETHFlowPoints();
            }
            return instance;
        }
    }
    
    
    public static class ATTNAME extends StringJsonSchema {
        private static @Nullable ATTNAME instance = null;
        public static ATTNAME getInstance() {
            if (instance == null) {
                instance = new ATTNAME();
            }
            return instance;
        }
    }
    
    
    public static class CapitalizationMap extends FrozenMap<@Nullable Object> {
        protected CapitalizationMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "smallCamel",
            "CapitalCamel",
            "small_Snake",
            "Capital_Snake",
            "SCA_ETH_Flow_Points",
            "ATT_NAME"
        );
        public static CapitalizationMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Capitalization1.getInstance().validate(arg, configuration);
        }
        
        public String smallCamel() throws UnsetPropertyException {
            String key = "smallCamel";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for smallCamel");
            }
            return (String) value;
        }
        
        public String CapitalCamel() throws UnsetPropertyException {
            String key = "CapitalCamel";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for CapitalCamel");
            }
            return (String) value;
        }
        
        public String small_Snake() throws UnsetPropertyException {
            String key = "small_Snake";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for small_Snake");
            }
            return (String) value;
        }
        
        public String Capital_Snake() throws UnsetPropertyException {
            String key = "Capital_Snake";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for Capital_Snake");
            }
            return (String) value;
        }
        
        public String SCA_ETH_Flow_Points() throws UnsetPropertyException {
            String key = "SCA_ETH_Flow_Points";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for SCA_ETH_Flow_Points");
            }
            return (String) value;
        }
        
        public String ATT_NAME() throws UnsetPropertyException {
            String key = "ATT_NAME";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for ATT_NAME");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForSmallCamel <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSmallCamel(Map<String, @Nullable Object> instance);
        
        default T smallCamel(String value) {
            var instance = getInstance();
            instance.put("smallCamel", value);
            return getBuilderAfterSmallCamel(instance);
        }
    }
    
    public interface SetterForCapitalCamel <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCapitalCamel(Map<String, @Nullable Object> instance);
        
        default T CapitalCamel(String value) {
            var instance = getInstance();
            instance.put("CapitalCamel", value);
            return getBuilderAfterCapitalCamel(instance);
        }
    }
    
    public interface SetterForSmallSnake <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSmallSnake(Map<String, @Nullable Object> instance);
        
        default T small_Snake(String value) {
            var instance = getInstance();
            instance.put("small_Snake", value);
            return getBuilderAfterSmallSnake(instance);
        }
    }
    
    public interface SetterForCapitalSnake <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCapitalSnake(Map<String, @Nullable Object> instance);
        
        default T Capital_Snake(String value) {
            var instance = getInstance();
            instance.put("Capital_Snake", value);
            return getBuilderAfterCapitalSnake(instance);
        }
    }
    
    public interface SetterForSCAETHFlowPoints <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSCAETHFlowPoints(Map<String, @Nullable Object> instance);
        
        default T SCA_ETH_Flow_Points(String value) {
            var instance = getInstance();
            instance.put("SCA_ETH_Flow_Points", value);
            return getBuilderAfterSCAETHFlowPoints(instance);
        }
    }
    
    public interface SetterForATTNAME <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterATTNAME(Map<String, @Nullable Object> instance);
        
        default T ATT_NAME(String value) {
            var instance = getInstance();
            instance.put("ATT_NAME", value);
            return getBuilderAfterATTNAME(instance);
        }
    }
    
    public static class CapitalizationMapBuilder extends UnsetAddPropsSetter<CapitalizationMapBuilder> implements BaseBuilder<@Nullable Object>, SetterForSmallCamel<CapitalizationMapBuilder>, SetterForCapitalCamel<CapitalizationMapBuilder>, SetterForSmallSnake<CapitalizationMapBuilder>, SetterForCapitalSnake<CapitalizationMapBuilder>, SetterForSCAETHFlowPoints<CapitalizationMapBuilder>, SetterForATTNAME<CapitalizationMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "smallCamel",
            "CapitalCamel",
            "small_Snake",
            "Capital_Snake",
            "SCA_ETH_Flow_Points",
            "ATT_NAME"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public CapitalizationMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public CapitalizationMapBuilder getBuilderAfterSmallCamel(Map<String, @Nullable Object> instance) {
            return new CapitalizationMapBuilder(instance);
        }
        public CapitalizationMapBuilder getBuilderAfterCapitalCamel(Map<String, @Nullable Object> instance) {
            return new CapitalizationMapBuilder(instance);
        }
        public CapitalizationMapBuilder getBuilderAfterSmallSnake(Map<String, @Nullable Object> instance) {
            return new CapitalizationMapBuilder(instance);
        }
        public CapitalizationMapBuilder getBuilderAfterCapitalSnake(Map<String, @Nullable Object> instance) {
            return new CapitalizationMapBuilder(instance);
        }
        public CapitalizationMapBuilder getBuilderAfterSCAETHFlowPoints(Map<String, @Nullable Object> instance) {
            return new CapitalizationMapBuilder(instance);
        }
        public CapitalizationMapBuilder getBuilderAfterATTNAME(Map<String, @Nullable Object> instance) {
            return new CapitalizationMapBuilder(instance);
        }
        public CapitalizationMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public static class Capitalization1 extends JsonSchema implements MapSchemaValidator<CapitalizationMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable Capitalization1 instance = null;
    
        protected Capitalization1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("smallCamel", SmallCamel.class),
                    new PropertyEntry("CapitalCamel", CapitalCamel.class),
                    new PropertyEntry("small_Snake", SmallSnake.class),
                    new PropertyEntry("Capital_Snake", CapitalSnake.class),
                    new PropertyEntry("SCA_ETH_Flow_Points", SCAETHFlowPoints.class),
                    new PropertyEntry("ATT_NAME", ATTNAME.class)
                ))
            );
        }
    
        public static Capitalization1 getInstance() {
            if (instance == null) {
                instance = new Capitalization1();
            }
            return instance;
        }
        
        public CapitalizationMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new CapitalizationMap(castProperties);
        }
        
        public CapitalizationMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
