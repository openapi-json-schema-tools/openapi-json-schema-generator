package org.openapijsonschematools.paths.fakeinlinecomposition.post.parameters.parameter1;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.BooleanJsonSchema;
import org.openapijsonschematools.schemas.DateJsonSchema;
import org.openapijsonschematools.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.schemas.DecimalJsonSchema;
import org.openapijsonschematools.schemas.DoubleJsonSchema;
import org.openapijsonschematools.schemas.FloatJsonSchema;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.Int32JsonSchema;
import org.openapijsonschematools.schemas.Int64JsonSchema;
import org.openapijsonschematools.schemas.IntJsonSchema;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.ListJsonSchema;
import org.openapijsonschematools.schemas.MapJsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.NullJsonSchema;
import org.openapijsonschematools.schemas.NumberJsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.UnsetAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.UuidJsonSchema;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Schema1 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Schema01 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema01.class, arg, configuration);
        }
    }    
    
    public class SomeProp1 implements JsonSchema {
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
        
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SomeProp1.class, arg, configuration);
        }
    }    
    
    public class Schema11 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("someProp", SomeProp1.class)
        ));
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema11.class, arg, configuration);
        }
    }
}