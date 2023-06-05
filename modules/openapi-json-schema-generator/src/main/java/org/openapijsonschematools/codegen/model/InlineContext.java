package org.openapijsonschematools.codegen.model;

public interface InlineContext {
    public boolean allAreInline();

    public void setAllAreInline(boolean allAreInline);

    public CodegenKey jsonPathPiece();

    public void setJsonPathPiece(CodegenKey jsonPathPiece);
}
