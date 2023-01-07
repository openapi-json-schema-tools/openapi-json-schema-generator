package org.openapitools.codegen;

public class CodegenRefInfo<T> {
    private T ref;
    private String refClass;
    private String refModule;

    public CodegenRefInfo(T ref, String refClass, String refModule) {
        this.ref = ref;
        this.refClass = refClass;
        this.refModule = refModule ;
    }

    public T getRef() { return ref; }
    public String getRefClass() { return refClass; }
    public String getRefModule() { return refModule; }
}
