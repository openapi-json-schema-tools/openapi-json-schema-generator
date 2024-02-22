package org.openapijsonschematools.client.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap extends FrozenMap<@Nullable Object> {
        protected RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "__proto__",
            "constructor",
            "toString"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object constructor() {
            return getOrThrow("constructor");
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForProto <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterProto(Map<String, @Nullable Object> instance);
        
        default T setProto(Void value) {
            var instance = getInstance();
            instance.put("__proto__", null);
            return getBuilderAfterProto(instance);
        }
        
        default T setProto(boolean value) {
            var instance = getInstance();
            instance.put("__proto__", value);
            return getBuilderAfterProto(instance);
        }
        
        default T setProto(String value) {
            var instance = getInstance();
            instance.put("__proto__", value);
            return getBuilderAfterProto(instance);
        }
        
        default T setProto(int value) {
            var instance = getInstance();
            instance.put("__proto__", value);
            return getBuilderAfterProto(instance);
        }
        
        default T setProto(float value) {
            var instance = getInstance();
            instance.put("__proto__", value);
            return getBuilderAfterProto(instance);
        }
        
        default T setProto(long value) {
            var instance = getInstance();
            instance.put("__proto__", value);
            return getBuilderAfterProto(instance);
        }
        
        default T setProto(double value) {
            var instance = getInstance();
            instance.put("__proto__", value);
            return getBuilderAfterProto(instance);
        }
        
        default T setProto(List<?> value) {
            var instance = getInstance();
            instance.put("__proto__", value);
            return getBuilderAfterProto(instance);
        }
        
        default T setProto(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("__proto__", value);
            return getBuilderAfterProto(instance);
        }
    }
    
    public interface SetterForConstructor <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterConstructor(Map<String, @Nullable Object> instance);
        
        default T constructor(Void value) {
            var instance = getInstance();
            instance.put("constructor", null);
            return getBuilderAfterConstructor(instance);
        }
        
        default T constructor(boolean value) {
            var instance = getInstance();
            instance.put("constructor", value);
            return getBuilderAfterConstructor(instance);
        }
        
        default T constructor(String value) {
            var instance = getInstance();
            instance.put("constructor", value);
            return getBuilderAfterConstructor(instance);
        }
        
        default T constructor(int value) {
            var instance = getInstance();
            instance.put("constructor", value);
            return getBuilderAfterConstructor(instance);
        }
        
        default T constructor(float value) {
            var instance = getInstance();
            instance.put("constructor", value);
            return getBuilderAfterConstructor(instance);
        }
        
        default T constructor(long value) {
            var instance = getInstance();
            instance.put("constructor", value);
            return getBuilderAfterConstructor(instance);
        }
        
        default T constructor(double value) {
            var instance = getInstance();
            instance.put("constructor", value);
            return getBuilderAfterConstructor(instance);
        }
        
        default T constructor(List<?> value) {
            var instance = getInstance();
            instance.put("constructor", value);
            return getBuilderAfterConstructor(instance);
        }
        
        default T constructor(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("constructor", value);
            return getBuilderAfterConstructor(instance);
        }
    }
    
    public interface SetterForToStringSchema <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterToStringSchema(Map<String, @Nullable Object> instance);
        
        default T setToString(Void value) {
            var instance = getInstance();
            instance.put("toString", null);
            return getBuilderAfterToStringSchema(instance);
        }
        
        default T setToString(boolean value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToStringSchema(instance);
        }
        
        default T setToString(String value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToStringSchema(instance);
        }
        
        default T setToString(int value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToStringSchema(instance);
        }
        
        default T setToString(float value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToStringSchema(instance);
        }
        
        default T setToString(long value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToStringSchema(instance);
        }
        
        default T setToString(double value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToStringSchema(instance);
        }
        
        default T setToString(List<?> value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToStringSchema(instance);
        }
        
        default T setToString(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("toString", value);
            return getBuilderAfterToStringSchema(instance);
        }
    }
    
    public static class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder extends UnsetAddPropsSetter<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder> implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "__proto__",
            "constructor",
            "toString"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder implements SetterForToStringSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder getBuilderAfterToStringSchema(Map<String, @Nullable Object> instance) {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder(instance);
        }
    }
    
    public static class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder implements SetterForConstructor<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder getBuilderAfterConstructor(Map<String, @Nullable Object> instance) {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder(instance);
        }
    }
    
    public static class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder implements SetterForConstructor<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder>, SetterForToStringSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder getBuilderAfterConstructor(Map<String, @Nullable Object> instance) {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder(instance);
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder getBuilderAfterToStringSchema(Map<String, @Nullable Object> instance) {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder(instance);
        }
    }
    
    public static class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder implements SetterForProto<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder getBuilderAfterProto(Map<String, @Nullable Object> instance) {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder(instance);
        }
    }
    
    public static class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder implements SetterForProto<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder>, SetterForToStringSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder getBuilderAfterProto(Map<String, @Nullable Object> instance) {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder(instance);
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder getBuilderAfterToStringSchema(Map<String, @Nullable Object> instance) {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder(instance);
        }
    }
    
    public static class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder implements SetterForProto<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder>, SetterForConstructor<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder getBuilderAfterProto(Map<String, @Nullable Object> instance) {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder(instance);
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder getBuilderAfterConstructor(Map<String, @Nullable Object> instance) {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder(instance);
        }
    }
    
    public static class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder implements SetterForProto<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder>, SetterForConstructor<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder>, SetterForToStringSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder> {
        private final Map<String, @Nullable Object> instance;
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder getBuilderAfterProto(Map<String, @Nullable Object> instance) {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder(instance);
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder getBuilderAfterConstructor(Map<String, @Nullable Object> instance) {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder(instance);
        }
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder getBuilderAfterToStringSchema(Map<String, @Nullable Object> instance) {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder(instance);
        }
    }
    
    
    public sealed interface RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed permits RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid, RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean, RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber, RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString, RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList, RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap {
        @Nullable Object getData();
    }
    
    public record RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid(Void data) implements RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean(boolean data) implements RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber(Number data) implements RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString(String data) implements RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList(FrozenList<@Nullable Object> data) implements RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap(RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap data) implements RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1 extends JsonSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed> implements NullSchemaValidator<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid>, BooleanSchemaValidator<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean>, NumberSchemaValidator<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber>, StringSchemaValidator<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString>, ListSchemaValidator<FrozenList<@Nullable Object>, RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList>, MapSchemaValidator<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap, RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1 instance = null;
    
        protected RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1() {
            super(new JsonSchemaInfo()
                .required(Set.of(
                    "__proto__",
                    "constructor",
                    "toString"
                ))
            );
        }
    
        public static RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1 getInstance() {
            if (instance == null) {
                instance = new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public int validate(int arg, SchemaConfiguration configuration) {
            return (int) validate((Number) arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) {
            return (long) validate((Number) arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) {
            return (float) validate((Number) arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) {
            return (double) validate((Number) arg, configuration);
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.toString(), configuration);
        }
        
        @Override
        public FrozenList<@Nullable Object> getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<@Nullable Object> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(itemInstance);
                i += 1;
            }
            FrozenList<@Nullable Object> newInstanceItems = new FrozenList<>(items);
            return newInstanceItems;
        }
        
        public FrozenList<@Nullable Object> validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap(castProperties);
        }
        
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0]");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return validate(boolArg, configuration);
            } else if (arg instanceof Number) {
                return validate((Number) arg, configuration);
            } else if (arg instanceof String) {
                return validate((String) arg, configuration);
            } else if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            } else if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof Boolean) {
                boolean boolArg = (Boolean) arg;
                return getNewInstance(boolArg, pathToItem, pathToSchemas);
            } else if (arg instanceof Number) {
                return getNewInstance((Number) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            } else if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid(validate(arg, configuration));
        }
        @Override
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean(validate(arg, configuration));
        }
        @Override
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber(validate(arg, configuration));
        }
        @Override
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString(validate(arg, configuration));
        }
        @Override
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList(validate(arg, configuration));
        }
        @Override
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap(validate(arg, configuration));
        }
        @Override
        public RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Boolean booleanArg) {
                boolean castArg = booleanArg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Number castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
}
