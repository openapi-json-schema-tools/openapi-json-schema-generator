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
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
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

public class Pet {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Id extends Int64JsonSchema.Int64JsonSchema1 {
        private static @Nullable Id instance = null;
        public static Id getInstance() {
            if (instance == null) {
                instance = new Id();
            }
            return instance;
        }
    }
    
    
    public static class Name extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Name instance = null;
        public static Name getInstance() {
            if (instance == null) {
                instance = new Name();
            }
            return instance;
        }
    }
    
    
    public static class Items extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Items instance = null;
        public static Items getInstance() {
            if (instance == null) {
                instance = new Items();
            }
            return instance;
        }
    }
    
    
    public static class PhotoUrlsList extends FrozenList<String> {
        protected PhotoUrlsList(FrozenList<String> m) {
            super(m);
        }
        public static PhotoUrlsList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return PhotoUrls.getInstance().validate(arg, configuration);
        }
    }
    
    public static class PhotoUrlsListBuilder {
        // class to build List<String>
        private final List<String> list;
    
        public PhotoUrlsListBuilder() {
            list = new ArrayList<>();
        }
    
        public PhotoUrlsListBuilder(List<String> list) {
            this.list = list;
        }
        
        public PhotoUrlsListBuilder add(String item) {
            list.add(item);
            return this;
        }
    
        public List<String> build() {
            return list;
        }
    }
    
    
    public static abstract sealed class PhotoUrlsBoxed permits PhotoUrlsBoxedList {}
    public static final class PhotoUrlsBoxedList extends PhotoUrlsBoxed {
        public final PhotoUrlsList data;
        private PhotoUrlsBoxedList(PhotoUrlsList data) {
            this.data = data;
        }
    }
    
    
    public static class PhotoUrls extends JsonSchema implements ListSchemaValidator<PhotoUrlsList, PhotoUrlsBoxedList> {
        private static @Nullable PhotoUrls instance = null;
    
        protected PhotoUrls() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items.class)
            );
        }
    
        public static PhotoUrls getInstance() {
            if (instance == null) {
                instance = new PhotoUrls();
            }
            return instance;
        }
        
        @Override
        public PhotoUrlsList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new PhotoUrlsList(newInstanceItems);
        }
        
        public PhotoUrlsList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public PhotoUrlsBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new PhotoUrlsBoxedList(validate(arg, configuration));
        }
    }    
    public enum StringStatusEnums implements StringValueMethod {
        AVAILABLE("available"),
        PENDING("pending"),
        SOLD("sold");
        private final String value;
    
        StringStatusEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public static abstract sealed class StatusBoxed permits StatusBoxedString {}
    public static final class StatusBoxedString extends StatusBoxed {
        public final String data;
        private StatusBoxedString(String data) {
            this.data = data;
        }
    }
    
    
    public static class Status extends JsonSchema implements StringSchemaValidator<StatusBoxedString>, StringEnumValidator<StringStatusEnums> {
        private static @Nullable Status instance = null;
    
        protected Status() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "available",
                    "pending",
                    "sold"
                ))
            );
        }
    
        public static Status getInstance() {
            if (instance == null) {
                instance = new Status();
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
        public String validate(StringStatusEnums arg,SchemaConfiguration configuration) throws ValidationException {
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
        public StatusBoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new StatusBoxedString(validate(arg, configuration));
        }
    }    
    
    public static class TagsList extends FrozenList<Tag.TagMap> {
        protected TagsList(FrozenList<Tag.TagMap> m) {
            super(m);
        }
        public static TagsList of(List<Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return Tags.getInstance().validate(arg, configuration);
        }
    }
    
    public static class TagsListBuilder {
        // class to build List<Map<String, @Nullable Object>>
        private final List<Map<String, @Nullable Object>> list;
    
        public TagsListBuilder() {
            list = new ArrayList<>();
        }
    
        public TagsListBuilder(List<Map<String, @Nullable Object>> list) {
            this.list = list;
        }
        
        public TagsListBuilder add(Map<String, @Nullable Object> item) {
            list.add(item);
            return this;
        }
    
        public List<Map<String, @Nullable Object>> build() {
            return list;
        }
    }
    
    
    public static abstract sealed class TagsBoxed permits TagsBoxedList {}
    public static final class TagsBoxedList extends TagsBoxed {
        public final TagsList data;
        private TagsBoxedList(TagsList data) {
            this.data = data;
        }
    }
    
    
    public static class Tags extends JsonSchema implements ListSchemaValidator<TagsList, TagsBoxedList> {
        private static @Nullable Tags instance = null;
    
        protected Tags() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Tag.Tag1.class)
            );
        }
    
        public static Tags getInstance() {
            if (instance == null) {
                instance = new Tags();
            }
            return instance;
        }
        
        @Override
        public TagsList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<Tag.TagMap> items = new ArrayList<>();
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
                if (!(itemInstance instanceof Tag.TagMap)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((Tag.TagMap) itemInstance);
                i += 1;
            }
            FrozenList<Tag.TagMap> newInstanceItems = new FrozenList<>(items);
            return new TagsList(newInstanceItems);
        }
        
        public TagsList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public TagsBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new TagsBoxedList(validate(arg, configuration));
        }
    }    
    
    public static class PetMap extends FrozenMap<@Nullable Object> {
        protected PetMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "name",
            "photoUrls"
        );
        public static final Set<String> optionalKeys = Set.of(
            "id",
            "category",
            "tags",
            "status"
        );
        public static PetMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Pet1.getInstance().validate(arg, configuration);
        }
        
        public String name() {
                        @Nullable Object value = get("name");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for name");
            }
            return (String) value;
        }
        
        public PhotoUrlsList photoUrls() {
                        @Nullable Object value = get("photoUrls");
            if (!(value instanceof PhotoUrlsList)) {
                throw new InvalidTypeException("Invalid value stored for photoUrls");
            }
            return (PhotoUrlsList) value;
        }
        
        public Number id() throws UnsetPropertyException {
            String key = "id";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for id");
            }
            return (Number) value;
        }
        
        public Category.CategoryMap category() throws UnsetPropertyException {
            String key = "category";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Category.CategoryMap)) {
                throw new InvalidTypeException("Invalid value stored for category");
            }
            return (Category.CategoryMap) value;
        }
        
        public TagsList tags() throws UnsetPropertyException {
            String key = "tags";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof TagsList)) {
                throw new InvalidTypeException("Invalid value stored for tags");
            }
            return (TagsList) value;
        }
        
        public String status() throws UnsetPropertyException {
            String key = "status";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for status");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForName <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterName(Map<String, @Nullable Object> instance);
        
        default T name(String value) {
            var instance = getInstance();
            instance.put("name", value);
            return getBuilderAfterName(instance);
        }
    }
    
    public interface SetterForPhotoUrls <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterPhotoUrls(Map<String, @Nullable Object> instance);
        
        default T photoUrls(List<String> value) {
            var instance = getInstance();
            instance.put("photoUrls", value);
            return getBuilderAfterPhotoUrls(instance);
        }
    }
    
    public interface SetterForId <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterId(Map<String, @Nullable Object> instance);
        
        default T id(int value) {
            var instance = getInstance();
            instance.put("id", value);
            return getBuilderAfterId(instance);
        }
        
        default T id(float value) {
            var instance = getInstance();
            instance.put("id", value);
            return getBuilderAfterId(instance);
        }
        
        default T id(long value) {
            var instance = getInstance();
            instance.put("id", value);
            return getBuilderAfterId(instance);
        }
        
        default T id(double value) {
            var instance = getInstance();
            instance.put("id", value);
            return getBuilderAfterId(instance);
        }
    }
    
    public interface SetterForCategory <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCategory(Map<String, @Nullable Object> instance);
        
        default T category(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("category", value);
            return getBuilderAfterCategory(instance);
        }
    }
    
    public interface SetterForTags <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterTags(Map<String, @Nullable Object> instance);
        
        default T tags(List<Map<String, @Nullable Object>> value) {
            var instance = getInstance();
            instance.put("tags", value);
            return getBuilderAfterTags(instance);
        }
    }
    
    public interface SetterForStatus <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterStatus(Map<String, @Nullable Object> instance);
        
        default T status(String value) {
            var instance = getInstance();
            instance.put("status", value);
            return getBuilderAfterStatus(instance);
        }
        
        default T status(StringStatusEnums value) {
            var instance = getInstance();
            instance.put("status", value.value());
            return getBuilderAfterStatus(instance);
        }
    }
    
    public static class PetMap00Builder extends UnsetAddPropsSetter<PetMap00Builder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForId<PetMap00Builder>, SetterForCategory<PetMap00Builder>, SetterForTags<PetMap00Builder>, SetterForStatus<PetMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "name",
            "photoUrls",
            "id",
            "category",
            "tags",
            "status"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public PetMap00Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PetMap00Builder getBuilderAfterId(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PetMap00Builder getBuilderAfterCategory(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PetMap00Builder getBuilderAfterTags(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PetMap00Builder getBuilderAfterStatus(Map<String, @Nullable Object> instance) {
            return this;
        }
        public PetMap00Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class PetMap01Builder implements SetterForPhotoUrls<PetMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public PetMap01Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PetMap00Builder getBuilderAfterPhotoUrls(Map<String, @Nullable Object> instance) {
            return new PetMap00Builder(instance);
        }
    }
    
    public static class PetMap10Builder implements SetterForName<PetMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public PetMap10Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PetMap00Builder getBuilderAfterName(Map<String, @Nullable Object> instance) {
            return new PetMap00Builder(instance);
        }
    }
    
    public static class PetMapBuilder implements SetterForName<PetMap01Builder>, SetterForPhotoUrls<PetMap10Builder> {
        private final Map<String, @Nullable Object> instance;
        public PetMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public PetMap01Builder getBuilderAfterName(Map<String, @Nullable Object> instance) {
            return new PetMap01Builder(instance);
        }
        public PetMap10Builder getBuilderAfterPhotoUrls(Map<String, @Nullable Object> instance) {
            return new PetMap10Builder(instance);
        }
    }
    
    
    public static abstract sealed class Pet1Boxed permits Pet1BoxedMap {}
    public static final class Pet1BoxedMap extends Pet1Boxed {
        public final PetMap data;
        private Pet1BoxedMap(PetMap data) {
            this.data = data;
        }
    }
    
    
    public static class Pet1 extends JsonSchema implements MapSchemaValidator<PetMap, Pet1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        Pet object that needs to be added to the store
        */
        private static @Nullable Pet1 instance = null;
    
        protected Pet1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("id", Id.class),
                    new PropertyEntry("category", Category.Category1.class),
                    new PropertyEntry("name", Name.class),
                    new PropertyEntry("photoUrls", PhotoUrls.class),
                    new PropertyEntry("tags", Tags.class),
                    new PropertyEntry("status", Status.class)
                ))
                .required(Set.of(
                    "name",
                    "photoUrls"
                ))
            );
        }
    
        public static Pet1 getInstance() {
            if (instance == null) {
                instance = new Pet1();
            }
            return instance;
        }
        
        public PetMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new PetMap(castProperties);
        }
        
        public PetMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public Pet1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Pet1BoxedMap(validate(arg, configuration));
        }
    }

}
