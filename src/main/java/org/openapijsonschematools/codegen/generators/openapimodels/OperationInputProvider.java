package org.openapijsonschematools.codegen.generators.openapimodels;

public interface OperationInputProvider {
    CodegenKey operationInputClassName();
    String operationInputVariableName();
    String pathFromDocRoot();
}
