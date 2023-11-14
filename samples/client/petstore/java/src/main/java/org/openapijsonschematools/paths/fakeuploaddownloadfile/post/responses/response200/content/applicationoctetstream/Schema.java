package org.openapijsonschematools.paths.fakeuploaddownloadfile.post.responses.response200.content.applicationoctetstream;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Schema(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Schema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            // FileIO,
            // bytes,
            return new Schema(type);
        }
    }}
