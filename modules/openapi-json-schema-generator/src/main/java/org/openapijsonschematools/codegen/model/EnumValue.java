package org.openapijsonschematools.codegen.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class EnumValue {
    public final String type; // null (unset) "integer" "number" "string" "object" "array" "boolean" "null"
    public final Object value;
    public final String description;

    public EnumValue(Object value, String type, String description) {
        this.value = value;
        this.type = type;
        this.description = description;
    }
}

