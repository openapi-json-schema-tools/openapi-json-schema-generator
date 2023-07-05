package org.openapijsonschematools.codegen.model;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * Describes a single operation parameter in the OAS specification.
 * A unique parameter is defined by a combination of a name and location.
 * Parameters may be located in a path, query, header or cookie.
 */
public class CodegenRequestBody {
    public final String description;
    public final String unescapedDescription;
    public final Map<String, Object> vendorExtensions;
    public final Boolean required;
    public final LinkedHashMap<CodegenKey, CodegenMediaType> content;
    public final TreeSet<String> imports;
    public final boolean componentModule;
    public final CodegenKey jsonPathPiece;
    public final CodegenRefInfo<CodegenRequestBody> refInfo;

    /*
    A method that returns all content schemas
    This only works on the RequestBody that contains a CodegenMediaType with a schema definition
     */
    public Set<CodegenSchema> getContentSchemas() {
        if (content == null) {
            return null;
        }
        LinkedHashSet<CodegenSchema> schemas = new LinkedHashSet<>();
        LinkedHashSet<CodegenSchema> anyTypeSchemas = new LinkedHashSet<>();
        for (CodegenMediaType mediaType: content.values()) {
            if (mediaType == null) {
                continue;
            }
            if (mediaType.schema == null) {
                continue;
            }
            CodegenSchema schema = new CodegenSchema();
            if (mediaType.schema.refInfo != null) {
                // TODO adjust this for 3.1.0
                // in 3.1.0 ref can be combined with other constraints
                // so types and format should come from
                // the first schema then, not the deepest ref
                CodegenSchema deepest = mediaType.schema.getDeepestRef();
                schema.types = deepest.types;
                schema.format = deepest.format;
            } else {
                schema.types = mediaType.schema.types;
                schema.format = mediaType.schema.format;
            }
            if (schema.types == null && schema.format == null) {
                // return only anyType if it exists because it covers all use cases
                anyTypeSchemas.add(schema);
                return anyTypeSchemas;
            }
            schemas.add(schema);
        }
        if (schemas.isEmpty()) {
            return null;
        }
        return schemas;
    }

    public CodegenRequestBody(String description, String unescapedDescription, Map<String, Object> vendorExtensions, Boolean required, LinkedHashMap<CodegenKey, CodegenMediaType> content, TreeSet<String> imports, boolean componentModule, CodegenKey jsonPathPiece, CodegenRefInfo<CodegenRequestBody> refInfo) {
        this.description = description;
        this.unescapedDescription = unescapedDescription;
        this.vendorExtensions = vendorExtensions;
        this.required = required;
        this.content = content;
        this.imports = imports;
        this.componentModule = componentModule;
        this.jsonPathPiece = jsonPathPiece;
        this.refInfo = refInfo;
    }

    public CodegenRequestBody getSelfOrDeepestRef() {
        if (refInfo == null) {
            return this;
        }
        CodegenRequestBody refObject = refInfo.ref;
        while (refObject.refInfo != null) {
            refObject = refObject.refInfo.ref;
        }
        return refObject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, unescapedDescription, jsonPathPiece, vendorExtensions, required, content, refInfo, imports, componentModule);
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
            Objects.equals(vendorExtensions, that.vendorExtensions) &&
            Objects.equals(refInfo, that.refInfo);
    }

    protected void addInstanceInfo(StringBuilder sb) {
        sb.append("name='").append(jsonPathPiece).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", unescapedDescription='").append(unescapedDescription).append('\'');
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

