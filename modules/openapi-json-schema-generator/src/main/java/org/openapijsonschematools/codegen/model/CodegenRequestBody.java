package org.openapijsonschematools.codegen.model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

/**
 * Describes a single operation parameter in the OAS specification.
 * A unique parameter is defined by a combination of a name and location.
 * Parameters may be located in a path, query, header or cookie.
 */
public class CodegenRequestBody {
    public final String description;
    public final String unescapedDescription;
    public final String jsonSchema;
    public final Map<String, Object> vendorExtensions;
    /**
     * Determines whether this parameter is mandatory. If the parameter is in "path",
     * this property is required and its value MUST be true. Otherwise, the property
     * MAY be included and its default value is false.
     */
    public final boolean required;
    public final LinkedHashMap<CodegenKey, CodegenMediaType> content;
    public final TreeSet<String> imports;
    public final String componentModule;
    public final CodegenKey jsonPathPiece;
    public final CodegenRefInfo<CodegenRequestBody> refInfo;

    public CodegenRequestBody(String description, String unescapedDescription, String jsonSchema, Map<String, Object> vendorExtensions, boolean required, LinkedHashMap<CodegenKey, CodegenMediaType> content, TreeSet<String> imports, String componentModule, CodegenKey jsonPathPiece, CodegenRefInfo<CodegenRequestBody> refInfo) {
        this.description = description;
        this.unescapedDescription = unescapedDescription;
        this.jsonSchema = jsonSchema;
        this.vendorExtensions = vendorExtensions;
        this.required = required;
        this.content = content;
        this.imports = imports;
        this.componentModule = componentModule;
        this.jsonPathPiece = jsonPathPiece;
        this.refInfo = refInfo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, unescapedDescription, jsonPathPiece, jsonSchema, vendorExtensions, required, content, refInfo, imports, componentModule);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenRequestBody)) return false;
        CodegenRequestBody that = (CodegenRequestBody) o;
        return required == that.required &&
            Objects.equals(jsonPathPiece, that.jsonPathPiece) &&
            Objects.equals(componentModule, that.componentModule) &&
            Objects.equals(imports, that.imports) &&
            Objects.equals(content, that.content) &&
            Objects.equals(description, that.description) &&
            Objects.equals(unescapedDescription, that.unescapedDescription) &&
            Objects.equals(jsonSchema, that.jsonSchema) &&
            Objects.equals(vendorExtensions, that.vendorExtensions) &&
            Objects.equals(refInfo, that.refInfo);
    }

    protected void addInstanceInfo(StringBuilder sb) {
        sb.append("name='").append(jsonPathPiece).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", unescapedDescription='").append(unescapedDescription).append('\'');
        sb.append(", jsonSchema='").append(jsonSchema).append('\'');
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", required=").append(required);
        sb.append(", content=").append(content);
        sb.append(", imports=").append(imports);
        sb.append(", componentModule=").append(componentModule);
        sb.append(", refInfo=").append(refInfo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenRequestBody{");
        addInstanceInfo(sb);
        sb.append('}');
        return sb.toString();
    }

    public CodegenRequestBody getDeepestRef() {
        if (refInfo == null) {
            return null;
        }
        CodegenRequestBody refObject = refInfo.ref;
        while (refObject.refInfo != null) {
            refObject = refObject.refInfo.ref;
        }
        return refObject;
    }
}

