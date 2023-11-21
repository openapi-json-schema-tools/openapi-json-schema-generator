package org.openapijsonschematools.paths.fakeuploadfile.post.requestbody.content.multipartformdata;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalMetadata extends StringJsonSchema {}
    
    
    public class File extends JsonSchema {
        // BinarySchema
    }
    
    
    public static class SchemaMap extends FrozenMap<String, Object> {
        SchemaMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static SchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Schema1.validate(arg, configuration);
        }
    }    
    
    public class Schema1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("additionalMetadata", AdditionalMetadata.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("file", File.class)
        ));
        public static final Set<String> required = new LinkedHashSet<>(Set.of(
            "file"
        ));
        protected static SchemaMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new SchemaMap(arg);
        }
        public static SchemaMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }
}
