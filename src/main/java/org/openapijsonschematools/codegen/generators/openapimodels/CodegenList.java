package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.AbstractList;
import java.util.List;

/**
 * A class to store inline codegenschema definitions
 */
public class CodegenList <T> extends AbstractList<T> {
    public final List<T> items;
    public final CodegenKey jsonPathPiece;
    public final String subpackage;
    public final List<MapBuilder<T>> builders;

    public CodegenList(List<T> items, CodegenKey jsonPathPiece, String subpackage, List<MapBuilder<T>> builders) {
        this.items = items;
        this.jsonPathPiece = jsonPathPiece;
        this.subpackage = subpackage;
        this.builders = builders;
    }

    @Override
    public T get(int index) {
        return this.items.get(index);
    }

    @Override
    public int size() {
        return this.items.size();
    }
}
