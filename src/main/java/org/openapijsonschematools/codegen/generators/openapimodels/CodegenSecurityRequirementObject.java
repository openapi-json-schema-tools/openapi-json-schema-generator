package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CodegenSecurityRequirementObject extends AbstractMap<String, CodegenSecurityRequirementValue> {
    public final TreeSet<String> imports;
    public final Map<String, CodegenSecurityRequirementValue> map;
    public final String subpackage;
    public final CodegenKey jsonPathPiece;

    public CodegenSecurityRequirementObject(TreeSet<String> imports, Map<String, CodegenSecurityRequirementValue> map, String subpackage, CodegenKey jsonPathPiece) {
        this.imports = imports;
        this.map = map;
        this.subpackage = subpackage;
        this.jsonPathPiece = jsonPathPiece;
    }

    @Override
    public Set<Entry<String, CodegenSecurityRequirementValue>> entrySet() {
        return this.map.entrySet();
    }
}
