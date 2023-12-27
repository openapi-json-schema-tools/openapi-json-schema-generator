package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public class EnumInfo {
    public LinkedHashMap<EnumValue, String> valueToName; // enum info
    public CodegenKey jsonPathPiece;
    public HashMap<String, LinkedHashMap<EnumValue, String>> typeToValues;

    public EnumInfo(LinkedHashMap<EnumValue, String> valueToName, HashMap<String, LinkedHashMap<EnumValue, String>> typeToValues, CodegenKey jsonPathPiece) {
        this.valueToName = valueToName;
        this.typeToValues = typeToValues;
        this.jsonPathPiece = jsonPathPiece;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnumInfo that = (EnumInfo) o;
        return Objects.equals(valueToName, that.valueToName) &&
                Objects.equals(typeToValues, that.typeToValues) &&
                Objects.equals(jsonPathPiece, that.jsonPathPiece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueToName, typeToValues, jsonPathPiece);
    }
}
