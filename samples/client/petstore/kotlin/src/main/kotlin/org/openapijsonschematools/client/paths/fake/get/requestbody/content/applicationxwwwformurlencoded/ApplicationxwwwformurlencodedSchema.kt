package org.openapijsonschematools.client.paths.fake.get.requestbody.content.applicationxwwwformurlencoded;
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
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.DefaultValueMethod;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringEnumValidator;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.StringValueMethod;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ApplicationxwwwformurlencodedSchema {
    // nest classes so all schemas and input/output classes can be public
    
    public enum StringApplicationxwwwformurlencodedItemsEnums implements StringValueMethod {
        GREATER_THAN_SIGN(">"),
        DOLLAR_SIGN("$");
        private final String value;
    
        StringApplicationxwwwformurlencodedItemsEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface ApplicationxwwwformurlencodedItemsBoxed permits ApplicationxwwwformurlencodedItemsBoxedString {
        @Nullable Object getData();
    }
    
    public record ApplicationxwwwformurlencodedItemsBoxedString(String data) implements ApplicationxwwwformurlencodedItemsBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxwwwformurlencodedItems extends JsonSchema<ApplicationxwwwformurlencodedItemsBoxed> implements StringSchemaValidator<ApplicationxwwwformurlencodedItemsBoxedString>, StringEnumValidator<StringApplicationxwwwformurlencodedItemsEnums>, DefaultValueMethod<String> {
        private static @Nullable ApplicationxwwwformurlencodedItems instance = null;
    
        protected ApplicationxwwwformurlencodedItems() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    ">",
                    "$"
                ))
                .defaultValue("$")
            );
        }
    
        public static ApplicationxwwwformurlencodedItems getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedItems();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public String validate(StringApplicationxwwwformurlencodedItemsEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        public String defaultValue() throws ValidationException {
            if (defaultValue instanceof String) {
                return (String) defaultValue;
            }
            throw new ValidationException("Invalid type stored in defaultValue");
        }
        @Override
        public ApplicationxwwwformurlencodedItemsBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new ApplicationxwwwformurlencodedItemsBoxedString(validate(arg, configuration));
        }
        @Override
        public ApplicationxwwwformurlencodedItemsBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class ApplicationxwwwformurlencodedEnumFormStringArrayList extends FrozenList<String> {
        protected ApplicationxwwwformurlencodedEnumFormStringArrayList(FrozenList<String> m) {
            super(m);
        }
        public static ApplicationxwwwformurlencodedEnumFormStringArrayList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return ApplicationxwwwformurlencodedEnumFormStringArray.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder {
        // class to build List<String>
        private final List<String> list;
    
        public ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder() {
            list = new ArrayList<>();
        }
    
        public ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder(List<String> list) {
            this.list = list;
        }
        
        public ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder add(String item) {
            list.add(item);
            return this;
        }
        
        public ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder add(StringApplicationxwwwformurlencodedItemsEnums item) {
            list.add(item.value());
            return this;
        }
    
        public List<String> build() {
            return list;
        }
    }
    
    
    public sealed interface ApplicationxwwwformurlencodedEnumFormStringArrayBoxed permits ApplicationxwwwformurlencodedEnumFormStringArrayBoxedList {
        @Nullable Object getData();
    }
    
    public record ApplicationxwwwformurlencodedEnumFormStringArrayBoxedList(ApplicationxwwwformurlencodedEnumFormStringArrayList data) implements ApplicationxwwwformurlencodedEnumFormStringArrayBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxwwwformurlencodedEnumFormStringArray extends JsonSchema<ApplicationxwwwformurlencodedEnumFormStringArrayBoxed> implements ListSchemaValidator<ApplicationxwwwformurlencodedEnumFormStringArrayList, ApplicationxwwwformurlencodedEnumFormStringArrayBoxedList> {
        private static @Nullable ApplicationxwwwformurlencodedEnumFormStringArray instance = null;
    
        protected ApplicationxwwwformurlencodedEnumFormStringArray() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(ApplicationxwwwformurlencodedItems.class)
            );
        }
    
        public static ApplicationxwwwformurlencodedEnumFormStringArray getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedEnumFormStringArray();
            }
            return instance;
        }
        
        @Override
        public ApplicationxwwwformurlencodedEnumFormStringArrayList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<String> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Nothing?> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof String)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                items.add((String) itemInstance);
                i += 1;
            }
            FrozenList<String> newInstanceItems = new FrozenList<>(items);
            return new ApplicationxwwwformurlencodedEnumFormStringArrayList(newInstanceItems);
        }
        
        public ApplicationxwwwformurlencodedEnumFormStringArrayList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ApplicationxwwwformurlencodedEnumFormStringArrayBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ApplicationxwwwformurlencodedEnumFormStringArrayBoxedList(validate(arg, configuration));
        }
        @Override
        public ApplicationxwwwformurlencodedEnumFormStringArrayBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    public enum StringApplicationxwwwformurlencodedEnumFormStringEnums implements StringValueMethod {
        LOW_LINE_ABC("_abc"),
        HYPHEN_MINUS_EFG("-efg"),
        LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS("(xyz)");
        private final String value;
    
        StringApplicationxwwwformurlencodedEnumFormStringEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public sealed interface ApplicationxwwwformurlencodedEnumFormStringBoxed permits ApplicationxwwwformurlencodedEnumFormStringBoxedString {
        @Nullable Object getData();
    }
    
    public record ApplicationxwwwformurlencodedEnumFormStringBoxedString(String data) implements ApplicationxwwwformurlencodedEnumFormStringBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class ApplicationxwwwformurlencodedEnumFormString extends JsonSchema<ApplicationxwwwformurlencodedEnumFormStringBoxed> implements StringSchemaValidator<ApplicationxwwwformurlencodedEnumFormStringBoxedString>, StringEnumValidator<StringApplicationxwwwformurlencodedEnumFormStringEnums>, DefaultValueMethod<String> {
        private static @Nullable ApplicationxwwwformurlencodedEnumFormString instance = null;
    
        protected ApplicationxwwwformurlencodedEnumFormString() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "_abc",
                    "-efg",
                    "(xyz)"
                ))
                .defaultValue("-efg")
            );
        }
    
        public static ApplicationxwwwformurlencodedEnumFormString getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedEnumFormString();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public String validate(StringApplicationxwwwformurlencodedEnumFormStringEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        public String defaultValue() throws ValidationException {
            if (defaultValue instanceof String) {
                return (String) defaultValue;
            }
            throw new ValidationException("Invalid type stored in defaultValue");
        }
        @Override
        public ApplicationxwwwformurlencodedEnumFormStringBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException {
            return new ApplicationxwwwformurlencodedEnumFormStringBoxedString(validate(arg, configuration));
        }
        @Override
        public ApplicationxwwwformurlencodedEnumFormStringBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof String castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class ApplicationxwwwformurlencodedSchemaMap extends FrozenMap<@Nullable Object> {
        protected ApplicationxwwwformurlencodedSchemaMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "enum_form_string_array",
            "enum_form_string"
        );
        public static ApplicationxwwwformurlencodedSchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ApplicationxwwwformurlencodedSchema1.getInstance().validate(arg, configuration);
        }
        
        public ApplicationxwwwformurlencodedEnumFormStringArrayList enum_form_string_array() throws UnsetPropertyException {
            String key = "enum_form_string_array";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof ApplicationxwwwformurlencodedEnumFormStringArrayList)) {
                throw new RuntimeException("Invalid value stored for enum_form_string_array");
            }
            return (ApplicationxwwwformurlencodedEnumFormStringArrayList) value;
        }
        
        public String enum_form_string() throws UnsetPropertyException {
            String key = "enum_form_string";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for enum_form_string");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedEnumFormStringArray <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedEnumFormStringArray(Map<String, @Nullable Object> instance);
        
        default T enum_form_string_array(List<String> value) {
            var instance = getInstance();
            instance.put("enum_form_string_array", value);
            return getBuilderAfterApplicationxwwwformurlencodedEnumFormStringArray(instance);
        }
    }
    
    public interface SetterForApplicationxwwwformurlencodedEnumFormString <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterApplicationxwwwformurlencodedEnumFormString(Map<String, @Nullable Object> instance);
        
        default T enum_form_string(String value) {
            var instance = getInstance();
            instance.put("enum_form_string", value);
            return getBuilderAfterApplicationxwwwformurlencodedEnumFormString(instance);
        }
        
        default T enum_form_string(StringApplicationxwwwformurlencodedEnumFormStringEnums value) {
            var instance = getInstance();
            instance.put("enum_form_string", value.value());
            return getBuilderAfterApplicationxwwwformurlencodedEnumFormString(instance);
        }
    }
    
    public static class ApplicationxwwwformurlencodedSchemaMapBuilder extends UnsetAddPropsSetter<ApplicationxwwwformurlencodedSchemaMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForApplicationxwwwformurlencodedEnumFormStringArray<ApplicationxwwwformurlencodedSchemaMapBuilder>, SetterForApplicationxwwwformurlencodedEnumFormString<ApplicationxwwwformurlencodedSchemaMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "enum_form_string_array",
            "enum_form_string"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ApplicationxwwwformurlencodedSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApplicationxwwwformurlencodedSchemaMapBuilder getBuilderAfterApplicationxwwwformurlencodedEnumFormStringArray(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMapBuilder getBuilderAfterApplicationxwwwformurlencodedEnumFormString(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApplicationxwwwformurlencodedSchemaMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface ApplicationxwwwformurlencodedSchema1Boxed permits ApplicationxwwwformurlencodedSchema1BoxedMap {
        @Nullable Object getData();
    }
    
    public record ApplicationxwwwformurlencodedSchema1BoxedMap(ApplicationxwwwformurlencodedSchemaMap data) implements ApplicationxwwwformurlencodedSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ApplicationxwwwformurlencodedSchema1 extends JsonSchema<ApplicationxwwwformurlencodedSchema1Boxed> implements MapSchemaValidator<ApplicationxwwwformurlencodedSchemaMap, ApplicationxwwwformurlencodedSchema1BoxedMap> {
        private static @Nullable ApplicationxwwwformurlencodedSchema1 instance = null;
    
        protected ApplicationxwwwformurlencodedSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("enum_form_string_array", ApplicationxwwwformurlencodedEnumFormStringArray.class),
                    new PropertyEntry("enum_form_string", ApplicationxwwwformurlencodedEnumFormString.class)
                ))
            );
        }
    
        public static ApplicationxwwwformurlencodedSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationxwwwformurlencodedSchema1();
            }
            return instance;
        }
        
        public ApplicationxwwwformurlencodedSchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
                LinkedHashMap<JsonSchema<?>, Nothing?> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new ApplicationxwwwformurlencodedSchemaMap(castProperties);
        }
        
        public ApplicationxwwwformurlencodedSchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public ApplicationxwwwformurlencodedSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ApplicationxwwwformurlencodedSchema1BoxedMap(validate(arg, configuration));
        }
        @Override
        public ApplicationxwwwformurlencodedSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
