package org.openapijsonschematools.codegen.model;

import java.util.ArrayList;

/**
 * A class to store inline codegenschema definitions
 */
public class ArrayListWithContext<E> extends ArrayList<E> implements InlineContext {
    private boolean internalallAreInline = false;
    private CodegenKey internalJsonPathPiece = null;
    public boolean allAreInline() {
        return internalallAreInline;
    }

    public void setAllAreInline(boolean allAreInline) {
        this.internalallAreInline = allAreInline;
    }

    public CodegenKey jsonPathPiece() {
        return internalJsonPathPiece;
    }

    public void setJsonPathPiece(CodegenKey jsonPathPiece) {
        this.internalJsonPathPiece = jsonPathPiece;
    }
}
