package org.openapijsonschematools.codegen.model;

import java.util.ArrayList;

/**
 * A class to store inline codegenschema definitions
 */
public class ArrayListWithContext<E> extends ArrayList<E> implements InlineContext {
    private boolean allAreInline = false;
    private CodegenKey internalJsonPathPiece = null;
    public boolean getAllAreInline() {
        return allAreInline;
    }

    public void setAllAreInline(boolean allAreInline) {
        this.allAreInline = allAreInline;
    }

    public CodegenKey jsonPathPiece() {
        return internalJsonPathPiece;
    }

    public void setJsonPathPiece(CodegenKey jsonPathPiece) {
        this.internalJsonPathPiece = jsonPathPiece;
    }
}
