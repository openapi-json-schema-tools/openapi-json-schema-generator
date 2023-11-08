package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

record UnsetAnyTypeSchema() implements Schema {
    static UnsetAnyTypeSchema withDefaults() {
        return new UnsetAnyTypeSchema();
    }

    static Void validate(Void arg, SchemaConfiguration configuration) {
        return Schema.validate(UnsetAnyTypeSchema.class, arg, configuration);
    }

    static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
        return Schema.validate(UnsetAnyTypeSchema.class, arg, configuration);
    }

    static Integer validate(Integer arg, SchemaConfiguration configuration) {
        return Schema.validate(UnsetAnyTypeSchema.class, arg, configuration);
    }

    public static Long validate(Long arg, SchemaConfiguration configuration) {
        return Schema.validate(UnsetAnyTypeSchema.class, arg, configuration);
    }

    static Float validate(Float arg, SchemaConfiguration configuration) {
        return Schema.validate(UnsetAnyTypeSchema.class, arg, configuration);
    }

    static Double validate(Double arg, SchemaConfiguration configuration) {
        return Schema.validate(UnsetAnyTypeSchema.class, arg, configuration);
    }

    static String validate(String arg, SchemaConfiguration configuration) {
        return Schema.validate(UnsetAnyTypeSchema.class, arg, configuration);
    }

    static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
        return Schema.validate(UnsetAnyTypeSchema.class, arg, configuration);
    }

    static String validate(LocalDate arg, SchemaConfiguration configuration) {
        return Schema.validate(UnsetAnyTypeSchema.class, arg, configuration);
    }

    static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
        return Schema.validate(UnsetAnyTypeSchema.class, arg, configuration);
    }

    static <U extends List> U validate(List<Object> arg, SchemaConfiguration configuration) {
        return Schema.validate(UnsetAnyTypeSchema.class, arg, configuration);
    }
}
