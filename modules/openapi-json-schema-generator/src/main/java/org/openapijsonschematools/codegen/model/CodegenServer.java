package org.openapijsonschematools.codegen.model;

import java.util.LinkedHashMap;
import java.util.Objects;

public class CodegenServer {
    public final String url;
    public final String defaultUrl;
    public final String description;
    public final CodegenSchema variables;
    public final CodegenKey jsonPathPiece;
    public final boolean rootServer;

    public CodegenServer(String url, String description, CodegenSchema variables, CodegenKey jsonPathPiece, boolean rootServer) {
        this.url = url;
        this.description = description;
        this.variables = variables;
        this.jsonPathPiece = jsonPathPiece;
        this.rootServer = rootServer;
        if (this.variables == null) {
            this.defaultUrl = url;
        } else {
            String defaultUrl = url;
            for (CodegenSchema variable: variables.properties.values()) {
                defaultUrl = defaultUrl.replace("{" + variable.jsonPathPiece.original + "}", (String) variable.defaultValue.value);
            }
            this.defaultUrl = defaultUrl;
        }
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
                Objects.equals(rootServer, that.rootServer) &&
                Objects.equals(defaultUrl, that.defaultUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, description, variables, jsonPathPiece, rootServer, defaultUrl);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CodegenServer{");
        sb.append("url='").append(url).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", variables=").append(variables);
        sb.append(", jsonPathPiece=").append(jsonPathPiece);
        sb.append(", rootServer=").append(rootServer);
        sb.append(", defaultUrl=").append(defaultUrl);
        sb.append('}');
        return sb.toString();
    }
}
