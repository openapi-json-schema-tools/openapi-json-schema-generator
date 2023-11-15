package org.openapijsonschematools.paths.storeorder{orderid}.get.parameters.0;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;
import org.openapijsonschematools.schemas.BooleanSchema;
import org.openapijsonschematools.schemas.DateSchema;
import org.openapijsonschematools.schemas.DateTimeSchema;
import org.openapijsonschematools.schemas.DecimalSchema;
import org.openapijsonschematools.schemas.DoubleSchema;
import org.openapijsonschematools.schemas.FloatSchema;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.Int32Schema;
import org.openapijsonschematools.schemas.Int64Schema;
import org.openapijsonschematools.schemas.IntSchema;
import org.openapijsonschematools.schemas.ListSchema;
import org.openapijsonschematools.schemas.MapSchema;
import org.openapijsonschematools.schemas.NullSchema;
import org.openapijsonschematools.schemas.NumberSchema;
import org.openapijsonschematools.schemas.StringSchema;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Schema2(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static Schema2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Integer.class);
            type.add(Long.class);
            type.add(Float.class);
            type.add(Double.class);
            String format = "int64";
            return new Schema2(type, format);
        }
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema2.class, Long.valueOf(arg), configuration);
        }
        
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema2.class, Long.parseLong(arg.toString()), configuration);
        }
        
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema2.class, arg, configuration);
        }
        
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema2.class, Long.parseLong(arg.toString()), configuration);
        }
    }}
