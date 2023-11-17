package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


public class AnyTypeJsonSchema implements JsonSchema {
    public static Void validate(Void arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static Integer validate(Integer arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static Long validate(Long arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static Float validate(Float arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static Double validate(Double arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static String validate(String arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static String validate(LocalDate arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }
}
