package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.LinkedHashMap;

public class LinkedHashMapWithContext<V> extends LinkedHashMap<CodegenKey, V> implements InlineContext {
    private boolean internalallAreInline = false;
    private CodegenKey internalJsonPathPiece = null;

    public boolean allAreInline() {
        return internalallAreInline;
    }

    public boolean hasValidKey() {
        if (this.isEmpty()) {
            return false;
        }
        for (CodegenKey key: this.keySet()) {
            if (key.isValid) {
                return true;
            }
        }
        return false;
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
