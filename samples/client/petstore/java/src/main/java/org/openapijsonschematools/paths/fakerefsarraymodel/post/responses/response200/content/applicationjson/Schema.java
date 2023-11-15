package org.openapijsonschematools.paths.fakerefsarraymodel.post.responses.response200.content.applicationjson;
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
public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static AnimalFarm.AnimalFarm2 withDefaults() {
            return AnimalFarm.AnimalFarm2.withDefaults();
        }
    
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnimalFarm.AnimalFarm2.class, arg, configuration);
        }
    }
}
