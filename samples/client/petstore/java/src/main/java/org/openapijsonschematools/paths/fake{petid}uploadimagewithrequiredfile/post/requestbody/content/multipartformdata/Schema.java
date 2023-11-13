package org.openapijsonschematools.paths.fake{petid}uploadimagewithrequiredfile.post.requestbody.content.multipartformdata;
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
    
    public record RequiredFile(LinkedHashSet<Class<?>> type) implements Schema {
        public static RequiredFile withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            // FileIO,
            // bytes,
            return new RequiredFile(type);
        }
    }}
