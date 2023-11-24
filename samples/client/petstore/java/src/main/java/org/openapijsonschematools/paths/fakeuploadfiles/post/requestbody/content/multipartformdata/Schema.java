package org.openapijsonschematools.paths.fakeuploadfiles.post.requestbody.content.multipartformdata;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items extends JsonSchema {
        // BinarySchema
    }
    
    
    public static class FilesList extends FrozenList<String> {

        FilesList(FrozenList<String> m) {

            super(m);
        }
        public static FilesList of(List<String> arg, SchemaConfiguration configuration) {

            return Files.validate(arg, configuration);
        }
    }
    
    
    public class Files extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items.class))
        ));
        protected static FilesList getListOutputInstance(FrozenList<String> arg) {

            return new FilesList(arg);
        }
        public static FilesList validate(List<String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Files.class, arg, configuration);
        }
    }    
    
    public static class SchemaMap extends FrozenMap<String, Object> {

        SchemaMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
        );
        public static final Set<String> optionalKeys = Set.of(
            "files"
        );
        public static SchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Schema1.validate(arg, configuration);
        }
        
        public FilesList files() {

            String key = "files";
            if (!containsKey(key)) {
                throw new RuntimeException("files is unset");
            }
            return (FilesList) get(key);

        }
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
        }
    }    
    
    public class Schema1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("files", Files.class)
            )))
        ));
        protected static SchemaMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new SchemaMap(arg);
        }
        public static SchemaMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }
}
