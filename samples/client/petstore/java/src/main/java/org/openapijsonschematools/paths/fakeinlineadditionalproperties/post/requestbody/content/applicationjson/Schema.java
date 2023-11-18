package org.openapijsonschematools.paths.fakeinlineadditionalproperties.post.requestbody.content.applicationjson;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends StringJsonSchema {}
    
    
    public class Schema1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }
}
