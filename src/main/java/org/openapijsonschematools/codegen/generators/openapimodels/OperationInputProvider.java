package org.openapijsonschematools.codegen.generators.openapimodels;

public interface OperationInputProvider extends PathFromDocRootProvider {
    CodegenKey operationInputClassName();
    String operationInputVariableName();
}
