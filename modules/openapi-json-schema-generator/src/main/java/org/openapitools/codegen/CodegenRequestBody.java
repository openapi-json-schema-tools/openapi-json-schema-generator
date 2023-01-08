package org.openapitools.codegen;

import java.util.Objects;

/**
 * Describes a single operation parameter in the OAS specification.
 * A unique parameter is defined by a combination of a name and location.
 * Parameters may be located in a path, query, header or cookie.
 */
public class CodegenRequestBody extends CodegenRequestBodyBase implements OpenApiLocation<CodegenRequestBody> {
    protected CodegenRefInfo<CodegenRequestBody> refInfo;

    @Override
    public int hashCode() {
        return Objects.hash(description, unescapedDescription, name, example, jsonSchema, vendorExtensions, required, content, refInfo, imports, componentModule);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenRequestBody)) return false;
        if (! super.equals(o)) return false;
        CodegenRequestBody that = (CodegenRequestBody) o;
        return Objects.equals(refInfo, that.getRefInfo());
    }

    protected void addInstanceInfo(StringBuilder sb) {
        super.addInstanceInfo(sb);
        sb.append(", refInfo=").append(refInfo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenRequestBody{");
        addInstanceInfo(sb);
        sb.append('}');
        return sb.toString();
    }

    public CodegenRefInfo<CodegenRequestBody> getRefInfo() { return refInfo; }

    public void setRefInfo(CodegenRefInfo<CodegenRequestBody> refInfo) { this.refInfo = refInfo; }
}

