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
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class AdditionalPropertiesWithArrayOfEnums {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalPropertiesList extends FrozenList<String> {
        protected AdditionalPropertiesList(FrozenList<String> m) {
            super(m);
        }
        public static AdditionalPropertiesList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return AdditionalProperties.getInstance().validate(arg, configuration);
        }
    }
    
    public static class AdditionalPropertiesListBuilder {
        // class to build List<String>
        private final List<String> list;
    
        public AdditionalPropertiesListBuilder() {
            list = new ArrayList<>();
        }
    
        public AdditionalPropertiesListBuilder(List<String> list) {
            this.list = list;
        }
        
        public AdditionalPropertiesListBuilder add(String item) {
            list.add(item);
            return this;
        }
        
        public AdditionalPropertiesListBuilder add(EnumClass.StringEnumClassEnums item) {
            list.add(item.value());
            return this;
        }
    
        public List<String> build() {
            return list;
        }
    }
    
    
    public static abstract sealed class AdditionalPropertiesBoxed permits AdditionalPropertiesBoxedList {
        public abstract @Nullable Object data();
    }
    
    public static final class AdditionalPropertiesBoxedList extends AdditionalPropertiesBoxed {
        public final AdditionalPropertiesList data;
        private AdditionalPropertiesBoxedList(AdditionalPropertiesList data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class AdditionalProperties extends JsonSchema implements ListSchemaValidator<AdditionalPropertiesList, AdditionalPropertiesBoxedList> {
        private static @Nullable AdditionalProperties instance = null;
    
        protected AdditionalProperties() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(EnumClass.EnumClass1.class)
            );
        }
    
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
        
        @Override
        public AdditionalPropertiesList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<String> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof String)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((String) itemInstance);
                i += 1;
            }
            FrozenList<String> newInstanceItems = new FrozenList<>(items);
            return new AdditionalPropertiesList(newInstanceItems);
        }
        
        public AdditionalPropertiesList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public AdditionalPropertiesBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AdditionalPropertiesBoxedList(validate(arg, configuration));
        }
    }    
    
    public static class AdditionalPropertiesWithArrayOfEnumsMap extends FrozenMap<AdditionalPropertiesList> {
        protected AdditionalPropertiesWithArrayOfEnumsMap(FrozenMap<AdditionalPropertiesList> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static AdditionalPropertiesWithArrayOfEnumsMap of(Map<String, List<String>> arg, SchemaConfiguration configuration) throws ValidationException {
            return AdditionalPropertiesWithArrayOfEnums1.getInstance().validate(arg, configuration);
        }
        
        public AdditionalPropertiesList getAdditionalProperty(String name) throws UnsetPropertyException {
            var value = getOrThrow(name);
            if (!(value instanceof AdditionalPropertiesList)) {
                throw new InvalidTypeException("Invalid value stored for " + name);
            }
            return (AdditionalPropertiesList) value;
        }
    }
    
    public interface SetterForAdditionalProperties<T> {
        Set<String> getKnownKeys();
        Map<String, List<String>> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, List<String>> instance);
        
        default T additionalProperty(String key, List<String> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class AdditionalPropertiesWithArrayOfEnumsMapBuilder implements GenericBuilder<Map<String, List<String>>>, SetterForAdditionalProperties<AdditionalPropertiesWithArrayOfEnumsMapBuilder> {
        private final Map<String, List<String>> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public AdditionalPropertiesWithArrayOfEnumsMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, List<String>> build() {
            return instance;
        }
        public Map<String, List<String>> getInstance() {
            return instance;
        }
        public AdditionalPropertiesWithArrayOfEnumsMapBuilder getBuilderAfterAdditionalProperty(Map<String, List<String>> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class AdditionalPropertiesWithArrayOfEnums1Boxed permits AdditionalPropertiesWithArrayOfEnums1BoxedMap {
        public abstract @Nullable Object data();
    }
    
    public static final class AdditionalPropertiesWithArrayOfEnums1BoxedMap extends AdditionalPropertiesWithArrayOfEnums1Boxed {
        public final AdditionalPropertiesWithArrayOfEnumsMap data;
        private AdditionalPropertiesWithArrayOfEnums1BoxedMap(AdditionalPropertiesWithArrayOfEnumsMap data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    public static class AdditionalPropertiesWithArrayOfEnums1 extends JsonSchema implements MapSchemaValidator<AdditionalPropertiesWithArrayOfEnumsMap, AdditionalPropertiesWithArrayOfEnums1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable AdditionalPropertiesWithArrayOfEnums1 instance = null;
    
        protected AdditionalPropertiesWithArrayOfEnums1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static AdditionalPropertiesWithArrayOfEnums1 getInstance() {
            if (instance == null) {
                instance = new AdditionalPropertiesWithArrayOfEnums1();
            }
            return instance;
        }
        
        public AdditionalPropertiesWithArrayOfEnumsMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, AdditionalPropertiesList> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof AdditionalPropertiesList)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (AdditionalPropertiesList) propertyInstance);
            }
            FrozenMap<AdditionalPropertiesList> castProperties = new FrozenMap<>(properties);
            return new AdditionalPropertiesWithArrayOfEnumsMap(castProperties);
        }
        
        public AdditionalPropertiesWithArrayOfEnumsMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public AdditionalPropertiesWithArrayOfEnums1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AdditionalPropertiesWithArrayOfEnums1BoxedMap(validate(arg, configuration));
        }
    }

}
