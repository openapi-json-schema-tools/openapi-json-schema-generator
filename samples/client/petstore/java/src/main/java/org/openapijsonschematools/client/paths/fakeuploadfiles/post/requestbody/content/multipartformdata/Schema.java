package org.openapijsonschematools.client.paths.fakeuploadfiles.post.requestbody.content.multipartformdata;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items extends StringJsonSchema {
        // BinarySchema
    }
    
    
    public static class FilesList extends FrozenList<String> {
        FilesList(FrozenList<String> m) {
            super(m);
        }
        public static FilesList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Files.class).validate(arg, configuration);
        }
    }
    
    public class FilesListInput {
        // class to build List<String>
    }
    
    
    public static class Files extends JsonSchema<Object, FrozenMap<String, Object>, String, FilesList> {
        public Files() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items.class))
            )));
        }
        
        @Override
        protected FilesList getListOutputInstance(FrozenList<?> arg) {
            return new FilesList((FrozenList<String>) arg);
        }
        public FilesList validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class SchemaMap extends FrozenMap<String, Object> {
        SchemaMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "files"
        );
        public static SchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Schema1.class).validate(arg, configuration);
        }
        
        public FilesList files() {
            String key = "files";
            throwIfKeyNotPresent(key);
            return (FilesList) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class SchemaMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class Schema1 extends JsonSchema<Object, SchemaMap, Object, FrozenList<Object>> {
        public Schema1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("files", Files.class)
                )))
            )));
        }
        
        @Override
        protected SchemaMap getMapOutputInstance(FrozenMap<String, ?> arg) {
            return new SchemaMap((FrozenMap<String, Object>) arg);
        }
        public SchemaMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
