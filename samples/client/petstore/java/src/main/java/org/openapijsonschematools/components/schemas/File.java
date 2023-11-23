package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class File {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class SourceURI extends StringJsonSchema {}
    
    
    public static class FileMap extends FrozenMap<String, Object> {
        FileMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static FileMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return File1.validate(arg, configuration);
        }
    }    
    
    public class File1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        Must be named `File` for test.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("sourceURI", SourceURI.class)
            )))
        ));
        protected static FileMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new FileMap(arg);
        }
        public static FileMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(File1.class, arg, configuration);
        }
    }
}
