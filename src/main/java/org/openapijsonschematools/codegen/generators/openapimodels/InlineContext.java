package org.openapijsonschematools.codegen.generators.openapimodels;

public interface InlineContext {
    public boolean allAreInline();

    public void setAllAreInline(boolean allAreInline);

    public CodegenKey jsonPathPiece();

    public void setJsonPathPiece(CodegenKey jsonPathPiece);
}
