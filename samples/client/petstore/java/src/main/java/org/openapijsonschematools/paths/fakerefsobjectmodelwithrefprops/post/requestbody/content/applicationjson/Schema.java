package org.openapijsonschematools.paths.fakerefsobjectmodelwithrefprops.post.requestbody.content.applicationjson;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.JsonSchemas;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Schema {
    // $refed class
    
    
    public record Schema1() implements JsonSchema {
        public static ObjectModelWithRefProps.ObjectModelWithRefProps1 withDefaults() {
            return ObjectModelWithRefProps.ObjectModelWithRefProps1.withDefaults();
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectModelWithRefProps.ObjectModelWithRefProps1.class, arg, configuration);
        }
    }
}
