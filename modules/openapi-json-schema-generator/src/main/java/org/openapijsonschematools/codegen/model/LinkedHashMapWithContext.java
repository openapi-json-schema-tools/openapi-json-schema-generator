package org.openapijsonschematools.codegen.model;

import java.util.LinkedHashMap;

public class LinkedHashMapWithContext<K, V> extends LinkedHashMap<K, V> implements InlineContext {
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
