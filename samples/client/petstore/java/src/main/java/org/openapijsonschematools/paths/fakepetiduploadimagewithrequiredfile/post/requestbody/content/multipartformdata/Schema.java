package org.openapijsonschematools.paths.fakepetiduploadimagewithrequiredfile.post.requestbody.content.multipartformdata;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalMetadata extends StringJsonSchema {
    }
    
    
    public class RequiredFile implements JsonSchema {
        // BinarySchema
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
