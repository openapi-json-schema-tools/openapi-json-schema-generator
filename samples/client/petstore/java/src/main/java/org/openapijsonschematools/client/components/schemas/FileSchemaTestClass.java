package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
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

public class FileSchemaTestClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class FilesList extends FrozenList<File.FileMap> {
        FilesList(FrozenList<File.FileMap> m) {
            super(m);
        }
        public static FilesList of(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Files.class).validate(arg, configuration);
        }
    }
    
    public class FilesListInput {
        // class to build List<Map<String, Object>>
    }
    
    
    public static class Files extends JsonSchema<Object, Object, FrozenMap<String, Object>, Map<String, Object>, File.FileMap, FilesList> {
        public Files() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(File.File1.class))
            )));
        }
        
        @Override
        protected FilesList getListOutputInstance(FrozenList<File.FileMap> arg) {
            return new FilesList(arg);
        }
        public FilesList validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class FileSchemaTestClassMap extends FrozenMap<String, Object> {
        FileSchemaTestClassMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "file",
            "files"
        );
        public static FileSchemaTestClassMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(FileSchemaTestClass1.class).validate(arg, configuration);
        }
        
        public File.FileMap file() {
            String key = "file";
            throwIfKeyNotPresent(key);
            return (File.FileMap) get(key);
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
    public class FileSchemaTestClassMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class FileSchemaTestClass1 extends JsonSchema<Object, Object, FileSchemaTestClassMap, Object, Object, FrozenList<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public FileSchemaTestClass1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("file", File.File1.class),
                    new PropertyEntry("files", Files.class)
                )))
            )));
        }
        
        @Override
        protected FileSchemaTestClassMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new FileSchemaTestClassMap(arg);
        }
        public FileSchemaTestClassMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
