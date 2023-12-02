package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.EnumValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Pet {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Id extends Int64JsonSchema {}
    
    
    public static class Name extends StringJsonSchema {}
    
    
    public static class Items extends StringJsonSchema {}
    
    
    public static class PhotoUrlsList extends FrozenList<String> {
        PhotoUrlsList(FrozenList<String> m) {
            super(m);
        }
        public static PhotoUrlsList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return PhotoUrls.validate(arg, configuration);
        }
    }
    
    
    public static class PhotoUrls extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items.class))
        ));
        
        protected static PhotoUrlsList getListOutputInstance(FrozenList<String> arg) {
            return new PhotoUrlsList(arg);
        }
        public static PhotoUrlsList validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(PhotoUrls.class, arg, configuration);
        }
    }    
    
    public static class Status extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            ))),
            new KeywordEntry("enum", new EnumValidator(Set.of(
                "available",
                "pending",
                "sold"
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(Status.class, arg, configuration);
        }
    }    
    
    public static class TagsList extends FrozenList<Tag.TagMap> {
        TagsList(FrozenList<Tag.TagMap> m) {
            super(m);
        }
        public static TagsList of(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return Tags.validate(arg, configuration);
        }
    }
    
    
    public static class Tags extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Tag.Tag1.class))
        ));
        
        protected static TagsList getListOutputInstance(FrozenList<Tag.TagMap> arg) {
            return new TagsList(arg);
        }
        public static TagsList validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Tags.class, arg, configuration);
        }
    }    
    
    public static class PetMap extends FrozenMap<String, Object> {
        PetMap(FrozenMap<String, Object> m) {
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
        public static PetMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Pet1.validate(arg, configuration);
        }
        
        public String name() {
            return (String) get("name");
        }
        
        public PhotoUrlsList photoUrls() {
            return (PhotoUrlsList) get("photoUrls");
        }
        
        public long id() {
            String key = "id";
            throwIfKeyNotPresent(key);
            return (long) get(key);
        }
        
        public Category.CategoryMap category() {
            String key = "category";
            throwIfKeyNotPresent(key);
            return (Category.CategoryMap) get(key);
        }
        
        public TagsList tags() {
            String key = "tags";
            throwIfKeyNotPresent(key);
            return (TagsList) get(key);
        }
        
        public String status() {
            String key = "status";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public static class Pet1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        Pet object that needs to be added to the store
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("id", Id.class),
                new PropertyEntry("category", Category.Category1.class),
                new PropertyEntry("name", Name.class),
                new PropertyEntry("photoUrls", PhotoUrls.class),
                new PropertyEntry("tags", Tags.class),
                new PropertyEntry("status", Status.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "name",
                "photoUrls"
            )))
        ));
        
        protected static PetMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new PetMap(arg);
        }
        public static PetMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Pet1.class, arg, configuration);
        }
    }
}
