package org.openapijsonschematools.codegen.generators.models;

import java.util.Collections;
import java.util.List;

public enum VendorExtension {

    X_ENUM_VARNAMES("x-enum-varnames", ExtensionLevel.SCHEMA, "A list of strings that defines the enum variable names, must be adjacent to enums", "[]"),
    X_ENUM_DESCRIPTIONS("x-enum-descriptions", ExtensionLevel.SCHEMA, "A list of strings that defines the enum descriptions, must be adjacent to enums", "[]"),
    ;

    private final String name;
    private final List<ExtensionLevel> levels;
    private final String description;
    private final String defaultValue;

    VendorExtension(final String name, final List<ExtensionLevel> levels, final String description, final String defaultValue) {
        this.name = name;
        this.levels = levels;
        this.description = description;
        this.defaultValue = defaultValue;
    }

    VendorExtension(final String name, final ExtensionLevel level, final String description, final String defaultValue) {
        this(name, Collections.singletonList(level), description, defaultValue);
    }

    public String getName() {
        return name;
    }

    public List<ExtensionLevel> getLevels() {
        return levels;
    }

    public String getDescription() {
        return description;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public enum ExtensionLevel {
        PROPERTY,
        SCHEMA,
        OPERATION
    }

}
