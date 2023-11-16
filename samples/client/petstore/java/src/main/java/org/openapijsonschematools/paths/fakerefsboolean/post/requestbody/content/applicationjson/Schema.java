package org.openapijsonschematools.paths.fakerefsboolean.post.requestbody.content.applicationjson;
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
import org.openapijsonschematools.components.schemas.BooleanSchema;

public class Schema {
    // $refed class
    
    
    public record Schema1() implements JsonSchema {
        public static BooleanSchema.BooleanSchema1 withDefaults() {
            return BooleanSchema.BooleanSchema1.withDefaults();
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(BooleanSchema.BooleanSchema1.class, arg, configuration);
        }
    }
}
