package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class EnumTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class EnumString implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumString.class, arg, configuration);
        }
    }    
    
    public class EnumStringRequired implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumStringRequired.class, arg, configuration);
        }
    }    
    
    public class EnumInteger implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        ));
        static final String format = "int32";
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumInteger.class, Long.valueOf(arg), configuration);
        }
        
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumInteger.class, Long.parseLong(arg.toString()), configuration);
        }
        
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumInteger.class, arg, configuration);
        }
        
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumInteger.class, Long.parseLong(arg.toString()), configuration);
        }
    }    
    
    public class EnumNumber implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        ));
        static final String format = "double";
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumNumber.class, arg, configuration);
        }
    }    
    
    public class EnumTest1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("enum_string", EnumString.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("enum_string_required", EnumStringRequired.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("enum_integer", EnumInteger.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("enum_number", EnumNumber.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("stringEnum", StringEnum.StringEnum1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("IntegerEnum", IntegerEnum.IntegerEnum1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("StringEnumWithDefaultValue", StringEnumWithDefaultValue.StringEnumWithDefaultValue1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("IntegerEnumWithDefaultValue", IntegerEnumWithDefaultValue.IntegerEnumWithDefaultValue1.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("IntegerEnumOneValue", IntegerEnumOneValue.IntegerEnumOneValue1.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "enum_string_required"
        ));
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumTest1.class, arg, configuration);
        }
    }
}
