package org.openapijsonschematools.paths.fakeadditionalpropertieswitharrayofenums.get.responses.response200.content.applicationjson;
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
import org.openapijsonschematools.components.schemas.AdditionalPropertiesWithArrayOfEnums;

public class Schema {
    // $refed class
    
    
    public class Schema1 implements JsonSchema {
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnums1.class, arg, configuration);
        }
    }
}
