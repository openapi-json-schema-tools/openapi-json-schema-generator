package org.openapijsonschematools.codegen.model;

import java.util.LinkedHashMap;
import java.util.List;

public class CodegenPathItem {
    public final String summary;
    public final String description;
    public final LinkedHashMap<CodegenKey, CodegenOperation> operations;
    public final List<CodegenServer> servers;
    public final List<CodegenParameter> parameters;

    public CodegenPathItem(String summary, String description, LinkedHashMap<CodegenKey, CodegenOperation> operations, List<CodegenServer> servers, List<CodegenParameter> parameters) {
        this.summary = summary;
        this.description = description;
        this.operations = operations;
        this.servers = servers;
        this.parameters = parameters;
    }
}
