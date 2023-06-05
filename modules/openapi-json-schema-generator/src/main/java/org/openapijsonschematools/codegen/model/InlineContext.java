package org.openapijsonschematools.codegen.model;

public interface InlineContext {
    public boolean getAllAreInline();

    public void setAllAreInline(boolean allAreInline);

    public CodegenKey getJsonPathPiece();

    public void setJsonPathPiece(CodegenKey jsonPathPiece);
}
