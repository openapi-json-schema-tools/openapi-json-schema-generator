package org.openapijsonschematools.codegen.model;

import java.util.ArrayList;
import java.util.TreeSet;

public class CodegenSecurityRequirementValue {
    public final TreeSet<String> imports;
    public final CodegenRefInfo<CodegenSecurityScheme> refInfo;
    public final ArrayList<String> scopeNames;

    public CodegenSecurityRequirementValue(TreeSet<String> imports, CodegenRefInfo<CodegenSecurityScheme> refInfo, ArrayList<String> scopeNames) {
        this.imports = imports;
        this.refInfo = refInfo;
        this.scopeNames = scopeNames;
    }
}
