package org.openapijsonschematools.components.headers.int32jsoncontenttypeheader.content.applicationjson;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;
import org.openapijsonschematools.schemas.BooleanSchema;
import org.openapijsonschematools.schemas.DateSchema;
import org.openapijsonschematools.schemas.DateTimeSchema;
import org.openapijsonschematools.schemas.DecimalSchema;
import org.openapijsonschematools.schemas.DoubleSchema;
import org.openapijsonschematools.schemas.FloatSchema;
import org.openapijsonschematools.schemas.Int32Schema;
import org.openapijsonschematools.schemas.Int64Schema;
import org.openapijsonschematools.schemas.IntSchema;
import org.openapijsonschematools.schemas.ListSchema;
import org.openapijsonschematools.schemas.MapSchema;
import org.openapijsonschematools.schemas.NullSchema;
import org.openapijsonschematools.schemas.NumberSchema;
import org.openapijsonschematools.schemas.StringSchema;

import java.util.LinkedHashSet;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Schema2() implements JsonSchema {
        public static Int32Schema withDefaults() {
            return Int32Schema.withDefaults();
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32Schema.class, arg, configuration);
        }
    
        public static Integer validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32Schema.class, Integer.parseInt(arg.toString()), configuration);
        }
    }
}
