package org.openapijsonschematools.paths.fakeuploadfile.post.requestbody.content.multipartformdata;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalMetadata(LinkedHashSet<Class<?>> type) implements Schema {
        public static AdditionalMetadata withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new AdditionalMetadata(type);
        }
    }    
    
    public record ModelFile(LinkedHashSet<Class<?>> type) implements Schema {
        public static ModelFile withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            // FileIO,
            // bytes,
            return new ModelFile(type);
        }
    }}
