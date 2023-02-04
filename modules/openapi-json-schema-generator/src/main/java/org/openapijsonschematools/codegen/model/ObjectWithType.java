package org.openapijsonschematools.codegen.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ObjectWithType {
    public String type; // null (unset) "integer" "number" "string" "object" "array" "boolean" "null"
    public Object value;

    /**
     * A wrapper class that is used to store payloads to be ingested by schemas
     * This class includes the payload value in the value property
     * Other booleans: isUnboundedInteger/isNumber/isString/isMap/isArray/isBoolean/isNull
     * allow generator templates to decide how to render each payload into code
     * based upon what type it is. The booleans isX describe the value in value.
     * @param value the input payload that is stored
     */
    public ObjectWithType(Object value) {
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
            LinkedHashMap<String, Object> castValue = (LinkedHashMap<String, Object>) value;
            LinkedHashMap<ObjectWithType, ObjectWithType> castMap = new LinkedHashMap<>();
            for (Map.Entry entry: castValue.entrySet()) {
                ObjectWithType entryKey = new ObjectWithType(entry.getKey());
                ObjectWithType entryValue = new ObjectWithType(entry.getValue());
                castMap.put(entryKey, entryValue);
            }
            this.type = "object";
            this.value = castMap;
        } else if (value instanceof ArrayList) {
            ArrayList<ObjectWithType> castList = new ArrayList<>();
            for (Object item: (ArrayList<Object>) value) {
                castList.add(new ObjectWithType(item));
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

