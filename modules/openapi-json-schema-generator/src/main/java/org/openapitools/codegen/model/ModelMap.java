package org.openapitools.codegen.model;

import java.util.HashMap;
import java.util.Map;

import org.openapitools.codegen.CodegenSchema;

public class ModelMap extends HashMap<String, Object> {

    public ModelMap() {

    }

    public ModelMap(Map<String, Object> init) {
        putAll(init);
    }

    public void setModel(CodegenSchema model) {
        put("model", model);
    }

    public CodegenSchema getModel() {
        return (CodegenSchema) get("model");
    }
}
