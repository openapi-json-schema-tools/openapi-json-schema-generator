package org.openapijsonschematools.codegen.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class EnumValue {
    public final String type; // null (unset) "integer" "number" "string" "object" "array" "boolean" "null"
    public final Object value;
    public final String description;

    public EnumValue(Object value, String type, String description) {
        this.value = value;
        this.type = type;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnumValue that = (EnumValue) o;
        return Objects.equals(value, that.value) &&
                Objects.equals(type, that.type) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type, description);
    }
}

