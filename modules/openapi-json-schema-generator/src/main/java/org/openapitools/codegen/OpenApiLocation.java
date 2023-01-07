package org.openapitools.codegen;

public interface OpenApiLocation<T> {
    // stores location info about a jsonPath location

    // set only if the instance is at the json path of a component
    String getComponentModule();

    void setComponentModule(String componentModule);

    CodegenRefInfo<T> getRef();

    void setRef(CodegenRefInfo<T> ref);

    String getRefModule();

    void setRefModule(String refModule);

    String getRefClass();

    void setRefClass(String refClass);
}
