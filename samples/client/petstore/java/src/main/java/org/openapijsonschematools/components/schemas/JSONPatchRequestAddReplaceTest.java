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
public class JSONPatchRequestAddReplaceTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties() implements JsonSchema {
        public static NotAnyTypeSchema withDefaults() {
            return NotAnyTypeSchema.withDefaults();
        }
    
        // NotAnyTypeSchema
    }
    
    
    public record Path(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Path withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Path(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Path.class, arg, configuration);
        }
    }    
    
    public record Op(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Op withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Op(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Op.class, arg, configuration);
        }
    }}
