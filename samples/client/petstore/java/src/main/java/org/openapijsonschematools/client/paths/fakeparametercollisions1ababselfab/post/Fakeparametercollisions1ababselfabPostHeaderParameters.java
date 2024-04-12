package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post;
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
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter5.Schema5;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter6.Schema6;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter7.Schema7;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.parameter8.Schema8;
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

public class Fakeparametercollisions1ababselfabPostHeaderParameters {
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
    
    
    public static class HeaderParametersMap extends FrozenMap<@Nullable Object> {
        protected HeaderParametersMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "1",
            "aB",
            "A-B",
            "self"
        );
        public static HeaderParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Fakeparametercollisions1ababselfabPostHeaderParameters1.getInstance().validate(arg, configuration);
        }
        
        public String aB() throws UnsetPropertyException {
            String key = "aB";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for aB");
            }
            return (String) value;
        }
        
        public String self() throws UnsetPropertyException {
            String key = "self";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for self");
            }
            return (String) value;
        }
    }
    
    public interface SetterForSchema1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSchema1(Map<String, @Nullable Object> instance);
        
        default T positive1(String value) {
            var instance = getInstance();
            instance.put("1", value);
            return getBuilderAfterSchema1(instance);
        }
    }
    
    public interface SetterForAB <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAB(Map<String, @Nullable Object> instance);
        
        default T aB(String value) {
            var instance = getInstance();
            instance.put("aB", value);
            return getBuilderAfterAB(instance);
        }
    }
    
    public interface SetterForAB1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAB1(Map<String, @Nullable Object> instance);
        
        default T aHyphenMinusB(String value) {
            var instance = getInstance();
            instance.put("A-B", value);
            return getBuilderAfterAB1(instance);
        }
    }
    
    public interface SetterForSelf <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSelf(Map<String, @Nullable Object> instance);
        
        default T self(String value) {
            var instance = getInstance();
            instance.put("self", value);
            return getBuilderAfterSelf(instance);
        }
    }
    
    public static class HeaderParametersMapBuilder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForSchema1<HeaderParametersMapBuilder>, SetterForAB<HeaderParametersMapBuilder>, SetterForAB1<HeaderParametersMapBuilder>, SetterForSelf<HeaderParametersMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "1",
            "aB",
            "A-B",
            "self"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public HeaderParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeaderParametersMapBuilder getBuilderAfterSchema1(Map<String, @Nullable Object> instance) {
            return this;
        }
        public HeaderParametersMapBuilder getBuilderAfterAB(Map<String, @Nullable Object> instance) {
            return this;
        }
        public HeaderParametersMapBuilder getBuilderAfterAB1(Map<String, @Nullable Object> instance) {
            return this;
        }
        public HeaderParametersMapBuilder getBuilderAfterSelf(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface Fakeparametercollisions1ababselfabPostHeaderParameters1Boxed permits Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap(HeaderParametersMap data) implements Fakeparametercollisions1ababselfabPostHeaderParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class Fakeparametercollisions1ababselfabPostHeaderParameters1 extends JsonSchema<Fakeparametercollisions1ababselfabPostHeaderParameters1Boxed> implements MapSchemaValidator<HeaderParametersMap, Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap> {
        private static @Nullable Fakeparametercollisions1ababselfabPostHeaderParameters1 instance = null;
    
        protected Fakeparametercollisions1ababselfabPostHeaderParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("1", Schema5.Schema51.class),
                    new PropertyEntry("aB", Schema6.Schema61.class),
                    new PropertyEntry("A-B", Schema8.Schema81.class),
                    new PropertyEntry("self", Schema7.Schema71.class)
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static Fakeparametercollisions1ababselfabPostHeaderParameters1 getInstance() {
            if (instance == null) {
                instance = new Fakeparametercollisions1ababselfabPostHeaderParameters1();
            }
            return instance;
        }
        
        public HeaderParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new HeaderParametersMap(castProperties);
        }
        
        public HeaderParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public Fakeparametercollisions1ababselfabPostHeaderParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
