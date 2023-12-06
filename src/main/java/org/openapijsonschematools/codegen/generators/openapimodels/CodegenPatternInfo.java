package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.LinkedHashSet;

public class CodegenPatternInfo {
    public final CodegenText pattern;
    public final LinkedHashSet<String> flags;

    public CodegenPatternInfo(CodegenText pattern, LinkedHashSet<String> flags) {
        this.pattern = pattern;
        this.flags = flags;
    }
}
