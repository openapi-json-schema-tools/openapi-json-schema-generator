package org.openapitools.codegen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Describes a single operation parameter in the OAS specification.
 * A unique parameter is defined by a combination of a name and location.
 * Parameters may be located in a path, query, header or cookie.
 */
public class CodegenRequestBody implements OpenApiComponent {
    protected String description, unescapedDescription;

    protected CodegenKey name;
    protected String example; // example value (x-example)
    protected String jsonSchema;
    protected Map<String, Object> vendorExtensions = new HashMap<String, Object>();
    /**
     * Determines whether this parameter is mandatory. If the parameter is in "path",
     * this property is required and its value MUST be true. Otherwise, the property
     * MAY be included and its default value is false.
     */
    protected boolean required;
    protected LinkedHashMap<String, CodegenMediaType> content;
    protected Object ref;
    protected String refModule;
    protected Set<String> imports = new HashSet<String>();
    protected String componentModule;
    protected String refClass;

    public String getComponentModule() {
        return componentModule;
    }

    public void setComponentModule(String componentModule) {
        this.componentModule = componentModule;
    }

    public String getRefClass() {
        return refClass;
    }

    public void setRefClass(String refClass) {
        this.refClass = refClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(refClass, description, unescapedDescription, name, example, jsonSchema, vendorExtensions, required, content, ref, refModule, imports, componentModule);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenRequestBody)) return false;
        CodegenRequestBody that = (CodegenRequestBody) o;
        return required == that.required &&
                Objects.equals(refClass, that.refClass) &&
                Objects.equals(name, that.name) &&
                Objects.equals(componentModule, that.componentModule) &&
                Objects.equals(ref, that.getRef()) &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(refModule, that.getRefModule()) &&
                Objects.equals(content, that.getContent()) &&
                Objects.equals(description, that.description) &&
                Objects.equals(unescapedDescription, that.unescapedDescription) &&
                Objects.equals(example, that.example) &&
                Objects.equals(jsonSchema, that.jsonSchema) &&
                Objects.equals(vendorExtensions, that.vendorExtensions);
    }

    protected void addInstanceInfo(StringBuilder sb) {
        sb.append(", description='").append(description).append('\'');
        sb.append(", unescapedDescription='").append(unescapedDescription).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", example='").append(example).append('\'');
        sb.append(", jsonSchema='").append(jsonSchema).append('\'');
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", required=").append(required);
        sb.append(", content=").append(content);
        sb.append(", ref=").append(ref);
        sb.append(", refModule=").append(refModule);
        sb.append(", refClass=").append(refClass);
        sb.append(", imports=").append(imports);
        sb.append(", componentModule=").append(componentModule);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenRequestBody{");
        addInstanceInfo(sb);
        sb.append('}');
        return sb.toString();
    }

    public LinkedHashMap<String, CodegenMediaType> getContent() {
        return content;
    }

    public void setContent(LinkedHashMap<String, CodegenMediaType> content) {
        this.content = content;
    }

    public CodegenKey getName() { return name; }

    public void setName(CodegenKey name) { this.name=name; }

    public CodegenRequestBody getRef() { return (CodegenRequestBody) ref; }

    public void setRef(Object ref) { this.ref = ref; }

    public String getRefModule() { return refModule; }

    public void setRefModule(String refModule) { this.refModule=refModule; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description=description; }

    public String getExample() { return example; }

    public void setExample(String example) { this.example=example; }

    public Map<String, Object> getVendorExtensions() { return vendorExtensions; }

    public void setVendorExtensions(Map<String, Object> vendorExtensions) { this.vendorExtensions = vendorExtensions; }
}

