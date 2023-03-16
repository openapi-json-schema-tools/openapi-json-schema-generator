package org.openapijsonschematools.codegen.model;

import java.util.LinkedHashMap;
import java.util.Objects;

public class CodegenServer {
    public final String url;
    public final String description;
    public final LinkedHashMap<CodegenKey, CodegenSchema> variables;
    public final CodegenKey jsonPathPiece;
    public final boolean rootServer;

    public CodegenServer(String url, String description, LinkedHashMap<CodegenKey, CodegenSchema> variables, CodegenKey jsonPathPiece, boolean rootServer) {
        this.url = url;
        this.description = description;
        this.variables = variables;
        this.jsonPathPiece = jsonPathPiece;
        this.rootServer = rootServer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenServer that = (CodegenServer) o;
        return Objects.equals(url, that.url) &&
                Objects.equals(description, that.description) &&
                Objects.equals(variables, that.variables) &&
                Objects.equals(jsonPathPiece, that.jsonPathPiece) &&
                Objects.equals(rootServer, that.rootServer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, description, variables, jsonPathPiece, rootServer);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CodegenServer{");
        sb.append("url='").append(url).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", variables=").append(variables);
        sb.append(", jsonPathPiece=").append(jsonPathPiece);
        sb.append(", rootServer=").append(rootServer);
        sb.append('}');
        return sb.toString();
    }
}
