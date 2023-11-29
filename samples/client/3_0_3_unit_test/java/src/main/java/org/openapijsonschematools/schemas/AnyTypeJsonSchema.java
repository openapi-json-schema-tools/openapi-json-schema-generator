package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public class AnyTypeJsonSchema extends JsonSchema {
    public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }

    public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(AnyTypeJsonSchema.class, arg, configuration);
    }
}
