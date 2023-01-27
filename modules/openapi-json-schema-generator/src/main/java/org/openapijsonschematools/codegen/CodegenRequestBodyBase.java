package org.openapijsonschematools.codegen;

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
    protected String description;
    protected String unescapedDescription;
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

    // getters, no get prefixes to keep template access simple
    public String description() { return description; }
    public String unescapedDescription() { return unescapedDescription; }
    public String example() { return example; }
    public String jsonSchema() { return jsonSchema; }
    public Map<String, Object> vendorExtensions() { return vendorExtensions; }
    public boolean required() { return required; }
    public LinkedHashMap<CodegenKey, CodegenMediaType> content() { return content; }
    public Set<String> imports() { return imports; }
    public String componentModule() { return componentModule; }
    public CodegenKey name() { return name; }

    public void setComponentModule(String componentModule) {
        this.componentModule = componentModule;
    }

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
                Objects.equals(content, that.content) &&
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

    public void setContent(LinkedHashMap<CodegenKey, CodegenMediaType> content) {
        this.content = content;
    }

    public void setDescription(String description) { this.description=description; }

    public String getExample() { return example; }

    public void setExample(String example) { this.example=example; }

    public Map<String, Object> getVendorExtensions() { return vendorExtensions; }

    public void setVendorExtensions(Map<String, Object> vendorExtensions) { this.vendorExtensions = vendorExtensions; }
}

