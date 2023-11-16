package org.openapijsonschematools.components.headers.refschemaheader;
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
import org.openapijsonschematools.components.schemas.StringWithValidation;

public class RefSchemaHeaderSchema {
    // $refed class
    
    
    public record RefSchemaHeaderSchema1() implements JsonSchema {
        public static StringWithValidation.StringWithValidation1 withDefaults() {
            return StringWithValidation.StringWithValidation1.withDefaults();
        }
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringWithValidation.StringWithValidation1.class, arg, configuration);
        }
    }
}
