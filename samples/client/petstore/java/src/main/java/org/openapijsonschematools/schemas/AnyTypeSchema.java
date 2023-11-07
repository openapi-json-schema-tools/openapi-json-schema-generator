package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

record AnyTypeSchema() implements Schema {
    public static AnyTypeSchema withDefaults() {
        return new AnyTypeSchema();
    }

    public static Void validate(Void arg, SchemaConfiguration configuration) {
        return Schema.validate(AnyTypeSchema.class, arg, configuration);
    }

    public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
        return Schema.validate(AnyTypeSchema.class, arg, configuration);
    }

    public static Integer validate(Integer arg, SchemaConfiguration configuration) {
        return Schema.validate(AnyTypeSchema.class, arg, configuration);
    }

    public static Long validate(Long arg, SchemaConfiguration configuration) {
        return Schema.validate(AnyTypeSchema.class, arg, configuration);
    }

    public static Float validate(Float arg, SchemaConfiguration configuration) {
        return Schema.validate(AnyTypeSchema.class, arg, configuration);
    }

    public static Double validate(Double arg, SchemaConfiguration configuration) {
        return Schema.validate(AnyTypeSchema.class, arg, configuration);
    }

    public static String validate(String arg, SchemaConfiguration configuration) {
        return Schema.validate(AnyTypeSchema.class, arg, configuration);
    }

    public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
        return Schema.validate(AnyTypeSchema.class, arg, configuration);
    }

    public static String validate(LocalDate arg, SchemaConfiguration configuration) {
        return Schema.validate(AnyTypeSchema.class, arg, configuration);
    }

    public static <T extends Map> T validate(T arg, SchemaConfiguration configuration) {
        return Schema.validate(AnyTypeSchema.class, arg, configuration);
    }

    public static <U extends List> U validate(U arg, SchemaConfiguration configuration) {
        return Schema.validate(AnyTypeSchema.class, arg, configuration);
    }
}
