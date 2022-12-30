package org.openapitools.codegen;

public interface OpenApiComponent {
    // set only if the instance is at the json path of a component
    String getComponentModule();

    void setComponentModule(String componentModule);

    // always set
    // used for spec name (name.getName)
    // module name (name.getSnakeCaseName)
    // class name (name.getCamelCaseName)
    // used when instances are defined inline and do not $ref another location
    CodegenKey getName();

    void setName(CodegenKey name);

    String getRef();

    void setRef(String ref);

    String getRefModule();

    void setRefModule(String refModule);

    String getRefClass();

    void setRefClass(String refClass);
}
