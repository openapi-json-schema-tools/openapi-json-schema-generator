package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EnumValue {
    public final String type; // null (unset) "integer" "number" "string" "object" "array" "boolean" "null"
    public final Object value;
    public final String description;
    public final CodegenSchema schema;
    public final String name; // the name for this enum

    private CodegenSchema toSchema() {
        CodegenSchema schema = new CodegenSchema();
        schema.types = new LinkedHashSet<>();
        schema.types.add(type);
        if (value instanceof List) {
            if (((List<?>) value).isEmpty()) {
                schema.items = new CodegenSchema();
                return schema;
            }
            CodegenSchema itemSchema = null;
            for (int i = 0; i < ((List<?>) value).size(); i++) {
                Object item = ((List<?>) value).get(i);
                if (item instanceof EnumValue) {
                    if (i == 0) {
                        itemSchema =  ((EnumValue) item).schema;
                    } else {
                        itemSchema = ((EnumValue) item).schema.add(itemSchema);
                    }
                }
            }
            schema.items = itemSchema;
        }
        if (value instanceof Map) {
            if (((Map<?, ?>) value).isEmpty()) {
                schema.mapValueSchema = new CodegenSchema();
                return schema;
            }
            CodegenSchema mapValueSchema = null;
            for (Object mapValue: ((Map<?, ?>) value).values()) {
                if (mapValue instanceof EnumValue) {
                    if (mapValueSchema == null) {
                        mapValueSchema =  ((EnumValue) mapValue).schema;
                    } else {
                        mapValueSchema = ((EnumValue) mapValue).schema.add(mapValueSchema);
                    }
                }
            }
            schema.mapValueSchema = mapValueSchema;
        }
        return schema;
    }

    public EnumValue(Object value, String type, String description, String name) {
        this.type = type;
        this.value = value;
        this.description = description;
        this.schema = toSchema();
        this.name = name;
    }

    public String javaType() {
        // Integer etc
        return this.value.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnumValue that = (EnumValue) o;
        return Objects.equals(value, that.value) &&
                Objects.equals(type, that.type) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type, description, name);
    }
}

