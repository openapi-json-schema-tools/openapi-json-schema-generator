package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.List;
import java.util.TreeMap;

public class CodegenPathItem {
    public final CodegenText summary;
    public final CodegenText description;
    public final TreeMap<CodegenKey, CodegenOperation> operations;
    public final CodegenList<CodegenServer> servers;
    public final List<CodegenParameter> parameters;

    public CodegenPathItem(CodegenText summary, CodegenText description, TreeMap<CodegenKey, CodegenOperation> operations, CodegenList<CodegenServer> servers, List<CodegenParameter> parameters) {
        this.summary = summary;
        this.description = description;
        this.operations = operations;
        this.servers = servers;
        this.parameters = parameters;
    }
}
