package org.openapijsonschematools.components.schemas;
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
public class ArrayTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Items(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Items withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Items(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items.class, arg, configuration);
        }
    }    
    
    public record Items3() implements JsonSchema {
        public static Int64Schema withDefaults() {
            return Int64Schema.withDefaults();
        }
    
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int64Schema.class, Long.valueOf(arg), configuration);
        }
    
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int64Schema.class, Long.parseLong(arg.toString()), configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int64Schema.class, arg, configuration);
        }
    
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int64Schema.class, Long.parseLong(arg.toString()), configuration);
        }
    }
}
