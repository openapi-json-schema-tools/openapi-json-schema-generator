package org.openapijsonschematools.paths.fakepetiduploadimagewithrequiredfile.post.requestbody.content.multipartformdata;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.JsonSchemas;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalMetadata implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalMetadata.class, arg, configuration);
        }
    }    
    
    public class RequiredFile implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            // FileIO,
            // bytes,
        ));
        static final String format = "binary";
        // FileIO,
        // bytes,
    }    
    
    public class Schema1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("additionalMetadata", AdditionalMetadata.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("requiredFile", RequiredFile.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "requiredFile"
        ));        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }
}
