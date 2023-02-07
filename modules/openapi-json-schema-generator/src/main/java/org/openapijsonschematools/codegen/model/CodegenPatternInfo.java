package org.openapijsonschematools.codegen.model;

import java.util.LinkedHashSet;

public class CodegenPatternInfo {
    public final String pattern;
    public final LinkedHashSet<String> flags;

    public CodegenPatternInfo(String pattern, LinkedHashSet<String> flags) {
        this.pattern = pattern;
        this.flags = flags;
    }
}
