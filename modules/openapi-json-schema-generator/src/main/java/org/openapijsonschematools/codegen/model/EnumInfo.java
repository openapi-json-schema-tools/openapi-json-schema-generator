package org.openapijsonschematools.codegen.model;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class EnumInfo {
    public LinkedHashMapWithContext<EnumValue, String> valueToName; // enum info
    public HashMap<String, List<EnumValue>> typeToValues;

    public EnumInfo(LinkedHashMapWithContext<EnumValue, String> valueToName, HashMap<String, List<EnumValue>> typeToValues) {
        this.valueToName = valueToName;
        this.typeToValues = typeToValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnumInfo that = (EnumInfo) o;
        return Objects.equals(valueToName, that.valueToName) &&
                Objects.equals(typeToValues, that.typeToValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueToName, typeToValues);
    }
}
