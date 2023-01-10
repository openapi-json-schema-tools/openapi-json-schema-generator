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
abstract class CodegenRequestBodyBase {
    protected String description, unescapedDescription;

    protected String example; // example value (x-example)
    protected String jsonSchema;
    protected Map<String, Object> vendorExtensions = new HashMap<String, Object>();
    /**
     * Determines whether this parameter is mandatory. If the parameter is in "path",
     * this property is required and its value MUST be true. Otherwise, the property
     * MAY be included and its default value is false.
     */
    protected boolean required;
    protected LinkedHashMap<CodegenKey, CodegenMediaType> content;
    protected Set<String> imports = new HashSet<String>();
    protected String componentModule;
    protected CodegenKey name;

    public String getComponentModule() {
        return componentModule;
    }

    public void setComponentModule(String componentModule) {
        this.componentModule = componentModule;
    }

    // always set
    // used for spec name (name.getName)
    // module name (name.getSnakeCaseName)
    // class name (name.getCamelCaseName)
    // used when instances are defined inline and do not $ref another location
    public CodegenKey getName() { return name; }

    public void setName(CodegenKey name) { this.name = name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenRequestBodyBase)) return false;
        CodegenRequestBodyBase that = (CodegenRequestBodyBase) o;
        return required == that.required &&
                Objects.equals(name, that.name) &&
                Objects.equals(componentModule, that.componentModule) &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(content, that.getContent()) &&
                Objects.equals(description, that.description) &&
                Objects.equals(unescapedDescription, that.unescapedDescription) &&
                Objects.equals(example, that.example) &&
                Objects.equals(jsonSchema, that.jsonSchema) &&
                Objects.equals(vendorExtensions, that.vendorExtensions);
    }

    protected void addInstanceInfo(StringBuilder sb) {
        sb.append(", description='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", unescapedDescription='").append(unescapedDescription).append('\'');
        sb.append(", example='").append(example).append('\'');
        sb.append(", jsonSchema='").append(jsonSchema).append('\'');
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", required=").append(required);
        sb.append(", content=").append(content);
        sb.append(", imports=").append(imports);
        sb.append(", componentModule=").append(componentModule);
    }

    public LinkedHashMap<CodegenKey, CodegenMediaType> getContent() {
        return content;
    }

    public void setContent(LinkedHashMap<CodegenKey, CodegenMediaType> content) {
        this.content = content;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description=description; }

    public String getExample() { return example; }

    public void setExample(String example) { this.example=example; }

    public Map<String, Object> getVendorExtensions() { return vendorExtensions; }

    public void setVendorExtensions(Map<String, Object> vendorExtensions) { this.vendorExtensions = vendorExtensions; }
}

