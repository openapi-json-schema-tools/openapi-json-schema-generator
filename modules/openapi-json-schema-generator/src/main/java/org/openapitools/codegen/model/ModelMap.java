package org.openapitools.codegen.model;

import java.util.HashMap;
import java.util.Map;

import org.openapitools.codegen.CodegenProperty;

public class ModelMap extends HashMap<String, Object> {

    public ModelMap() {

    }

    public ModelMap(Map<String, Object> init) {
        putAll(init);
    }

    public void setModel(CodegenProperty model) {
        put("model", model);
    }

    public CodegenProperty getModel() {
        return (CodegenProperty) get("model");
    }
}
