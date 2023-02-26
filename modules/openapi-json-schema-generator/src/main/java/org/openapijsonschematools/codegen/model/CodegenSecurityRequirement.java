package org.openapijsonschematools.codegen.model;

import java.util.ArrayList;
import java.util.TreeSet;

public class CodegenSecurityRequirement {
    public final TreeSet<String> imports;
    public final CodegenKey jsonPathPiece;
    public final CodegenRefInfo<CodegenSecurityScheme> refInfo;
    public final ArrayList<String> scopeNames;

    public CodegenSecurityRequirement(TreeSet<String> imports, CodegenKey jsonPathPiece, CodegenRefInfo<CodegenSecurityScheme> refInfo, ArrayList<String> scopeNames) {
        this.imports = imports;
        this.jsonPathPiece = jsonPathPiece;
        this.refInfo = refInfo;
        this.scopeNames = scopeNames;
    }
}
