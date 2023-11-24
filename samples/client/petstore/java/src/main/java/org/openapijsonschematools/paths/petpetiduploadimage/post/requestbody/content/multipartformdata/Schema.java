package org.openapijsonschematools.paths.petpetiduploadimage.post.requestbody.content.multipartformdata;
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

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalMetadata extends StringJsonSchema {}
    
    
    public class File extends JsonSchema {
        // BinarySchema
    }
    
    
    public static class SchemaMap extends FrozenMap<String, Object> {


        SchemaMap(FrozenMap<String, Object> m) {


            super(m);
        }
        public static SchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Schema1.validate(arg, configuration);
        }
        
        public String:

            val = self.get("additionalMetadata", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                String,

                val
            )
        
        public String:

            val = self.get("file", schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                String,

                val
            )
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
    }    
    
    public class Schema1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("additionalMetadata", AdditionalMetadata.class),
                new PropertyEntry("file", File.class)
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
