package org.openapijsonschematools.codegen.generators.openapimodels;

public class OperationInput implements OperationInputProvider {
    public final CodegenKey operationInputClassName;
    public final String operationInputVariableName;
    public final String pathFromDocRoot;

    public OperationInput(CodegenKey operationInputClassName, String operationInputVariableName, String pathFromDocRoot) {
        this.operationInputClassName = operationInputClassName;
        this.operationInputVariableName = operationInputVariableName;
        this.pathFromDocRoot = pathFromDocRoot;
    }
    @Override
    public CodegenKey operationInputClassName() {
        return operationInputClassName;
    }

    @Override
    public String operationInputVariableName() {
        return operationInputVariableName;
    }

    @Override
    public String pathFromDocRoot() {
        return pathFromDocRoot;
    }
}
