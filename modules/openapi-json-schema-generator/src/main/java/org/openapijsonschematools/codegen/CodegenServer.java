package org.openapijsonschematools.codegen;

import java.util.List;
import java.util.Objects;

public class CodegenServer {
    public final String url;
    public final String description;
    public final List<CodegenServerVariable> variables;

    public CodegenServer(String url, String description, List<CodegenServerVariable> variables) {
        this.url = url;
        this.description = description;
        this.variables = variables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenServer that = (CodegenServer) o;
        return Objects.equals(url, that.url) &&
                Objects.equals(description, that.description) &&
                Objects.equals(variables, that.variables);
    }

    @Override
    public int hashCode() {

        return Objects.hash(url, description, variables);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CodegenServer{");
        sb.append("url='").append(url).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", variables=").append(variables);
        sb.append('}');
        return sb.toString();
    }
}
