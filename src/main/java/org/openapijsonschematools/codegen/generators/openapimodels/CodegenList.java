package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.AbstractList;
import java.util.List;

/**
 * A class to store inline codegenschema definitions
 */
public class CodegenList <T> extends AbstractList<T> implements VariableNameProvider {
    public final List<T> items;
    public final CodegenKey jsonPathPiece;
    public final String subpackage;
    public final List<MapBuilder<T>> builders;
    public final String operationInputClass;

    public CodegenList(List<T> items, CodegenKey jsonPathPiece, String subpackage, List<MapBuilder<T>> builders, String operationInputClass) {
        this.items = items;
        this.jsonPathPiece = jsonPathPiece;
        this.subpackage = subpackage;
        this.builders = builders;
        this.operationInputClass = operationInputClass;
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
    public CodegenKey variableName() {
        return jsonPathPiece;
    }
}
