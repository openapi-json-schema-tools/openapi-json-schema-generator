package org.openapijsonschematools.codegen.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class EnumValue {
    public String type; // null (unset) "integer" "number" "string" "object" "array" "boolean" "null"
    public Object value;
    public String description;

    /**
     * A wrapper class that is used to store payloads to be ingested by schemas
     * This class includes the payload value in the value property
     * Other booleans: isUnboundedInteger/isNumber/isString/isMap/isArray/isBoolean/isNull
     * allow generator templates to decide how to render each payload into code
     * based upon what type it is. The booleans isX describe the value in value.
     * @param value the input payload that is stored
     */
    public EnumValue(Object value, String description) {
        this.description = description;
        if (value instanceof Integer){
            this.type = "integer";
            this.value = value;
        } else if (value instanceof Double || value instanceof Float){
            this.type = "number";
            this.value = value;
        } else if (value instanceof String) {
            this.type = "string";
            this.value = value;
        } else if (value instanceof LinkedHashMap) {
            LinkedHashMap<String, EnumValue> castMap = new LinkedHashMap<>();
            for (Map.Entry entry: ((LinkedHashMap<String, Object>) value).entrySet()) {
                String entryKey = (String) entry.getKey();
                Object entryValue = entry.getValue();
                EnumValue castValue = new EnumValue(entryValue, null);
                castMap.put(entryKey, castValue);
            }
            this.type = "object";
            this.value = castMap;
        } else if (value instanceof ArrayList) {
            ArrayList<EnumValue> castList = new ArrayList<>();
            for (Object item: (ArrayList<Object>) value) {
                EnumValue castItem = new EnumValue(item, null);
                castList.add(castItem);
            }
            this.type = "array";
            this.value = castList;
        } else if (value instanceof Boolean) {
            this.type = "boolean";
            this.value = value;
        } else if (value == null) {
            this.type = "null";
            this.value = null;
        }
    }
}

