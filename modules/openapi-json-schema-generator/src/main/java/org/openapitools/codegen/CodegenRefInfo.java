package org.openapitools.codegen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"ref"})
public class CodegenRefInfo<T> {
    private T ref;
    private String refClass;
    private String refModule;

    protected void addInstanceInfo(StringBuilder sb) {
        sb.append("refModule=").append(refModule);
        sb.append(", refClass=").append(refClass);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenRefInfo{");
        addInstanceInfo(sb);
        sb.append('}');
        return sb.toString();
    }

    public CodegenRefInfo(T ref, String refClass, String refModule) {
        this.ref = ref;
        this.refClass = refClass;
        this.refModule = refModule ;
    }

    public T getRef() { return ref; }
    public String getRefClass() { return refClass; }
    public String getRefModule() { return refModule; }
}
