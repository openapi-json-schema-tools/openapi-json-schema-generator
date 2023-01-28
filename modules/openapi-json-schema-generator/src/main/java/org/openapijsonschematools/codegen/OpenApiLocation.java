package org.openapijsonschematools.codegen;

import org.openapijsonschematools.codegen.model.CodegenKey;
import org.openapijsonschematools.codegen.model.CodegenRefInfo;

public interface OpenApiLocation<T> {
    // stores location info about a jsonPath location

    // set only if the instance is at the json path of a component
    String componentModule();

    void setComponentModule(String componentModule);

    CodegenRefInfo<T> refInfo();

    void setRefInfo(CodegenRefInfo<T> refInfo);

    // always set
    // used for spec name (name.getName)
    // module name (name.getSnakeCaseName)
    // class name (name.getCamelCaseName)
    // used when instances are defined inline and do not $ref another location
    CodegenKey name();

    void setName(CodegenKey name);

}
