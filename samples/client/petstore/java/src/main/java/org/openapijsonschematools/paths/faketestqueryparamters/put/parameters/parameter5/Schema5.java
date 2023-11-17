package org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter5;
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
import org.openapijsonschematools.components.schemas.StringWithValidation;

public class Schema5 {
    // $refed class
    
    
    public class Schema51 implements JsonSchema {
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringWithValidation.StringWithValidation1.class, arg, configuration);
        }
    }
}
