package org.openapijsonschematools.paths.petpetiduploadimage.post.requestbody.content.multipartformdata;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.JsonSchemas;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
    
    public record File(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static File withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            // FileIO,
            // bytes,
            String format = "binary";
            return new File(type, format);
        }
        // FileIO,
        // bytes,
    }}
