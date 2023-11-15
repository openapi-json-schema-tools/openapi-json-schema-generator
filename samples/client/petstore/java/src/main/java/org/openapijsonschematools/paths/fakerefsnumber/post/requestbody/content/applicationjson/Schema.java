package org.openapijsonschematools.paths.fakerefsnumber.post.requestbody.content.applicationjson;
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
    
    
    public record Schema2() implements JsonSchema {
        public static NumberWithValidations.NumberWithValidations2 withDefaults() {
            return NumberWithValidations.NumberWithValidations2.withDefaults();
        }
    
        public static Number validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberWithValidations.NumberWithValidations2.class, arg, configuration);
        }
        
        public static Number validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberWithValidations.NumberWithValidations2.class, arg, configuration);
        }
        
        public static Number validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberWithValidations.NumberWithValidations2.class, arg, configuration);
        }
        
        public static Number validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberWithValidations.NumberWithValidations2.class, arg, configuration);
        }
    }
}
