package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.AbstractList;
import java.util.List;

/**
 * A class to store inline codegenschema definitions
 */
public class CodegenList <T> extends AbstractList<T> implements OperationInputProvider, Comparable<CodegenList> {
    public final List<T> items;
    public final CodegenKey jsonPathPiece;
    public final String subpackage;
    public final CodegenKey operationInputClassName;
    public final String operationInputVariableName;
    public final String pathFromDocRoot;

    public CodegenList(List<T> items, CodegenKey jsonPathPiece, String subpackage, CodegenKey operationInputClassName, String operationInputVariableName, String pathFromDocRoot) {
        this.items = items;
        this.jsonPathPiece = jsonPathPiece;
        this.subpackage = subpackage;
        this.operationInputClassName = operationInputClassName;
        this.operationInputVariableName = operationInputVariableName;
        this.pathFromDocRoot = pathFromDocRoot;
    }

    @Override
    public T get(int index) {
        return this.items.get(index);
    }

    @Override
    public int size() {
        return this.items.size();
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

    @Override
    public int compareTo(CodegenList o) {
        return jsonPathPiece.pascalCase.compareTo(o.jsonPathPiece.pascalCase);
    }
}
