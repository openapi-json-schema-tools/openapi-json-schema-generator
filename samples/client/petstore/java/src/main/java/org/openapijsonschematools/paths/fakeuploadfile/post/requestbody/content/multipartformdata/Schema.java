package org.openapijsonschematools.paths.fakeuploadfile.post.requestbody.content.multipartformdata;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalMetadata(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static AdditionalMetadata withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new AdditionalMetadata(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalMetadata.class, arg, configuration);
        }
    }    
    
    public record File(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static File withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            // FileIO,
            // bytes,
            return new File(type);
        }
        // FileIO,
        // bytes,
    }}
