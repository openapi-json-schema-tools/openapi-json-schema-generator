package org.openapijsonschematools.codegen.model;

import java.util.List;
import java.util.TreeMap;

public class CodegenPathItem {
    public final String summary;
    public final String description;
    public final TreeMap<CodegenKey, CodegenOperation> operations;
    public final List<CodegenServer> servers;
    public final List<CodegenParameter> parameters;

    public CodegenPathItem(String summary, String description, TreeMap<CodegenKey, CodegenOperation> operations, List<CodegenServer> servers, List<CodegenParameter> parameters) {
        this.summary = summary;
        this.description = description;
        this.operations = operations;
        this.servers = servers;
        this.parameters = parameters;
    }
}
