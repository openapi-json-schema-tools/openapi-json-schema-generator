package org.openapijsonschematools.codegen.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties({"ref"})
public class CodegenRefInfo<T> {
    final public T ref;
    final public String refClass;
    final public String refModule;
    final public String refModuleLocation;
    final public String refModuleAlias;

    protected void addInstanceInfo(StringBuilder sb) {
        sb.append("refModule=").append(refModule);
        sb.append(", refClass=").append(refClass);
        sb.append(", refModuleLocation=").append(refModuleLocation);
        sb.append(", refModuleAlias=").append(refModuleAlias);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenRefInfo{");
        addInstanceInfo(sb);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        // ref must be omitted here for generation to work
        return Objects.hash(refClass, refModule, refModuleLocation, refModuleAlias);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenRefInfo)) return false;
        CodegenRefInfo that = (CodegenRefInfo) o;
        return Objects.equals(refModule, that.refModule) &&
                Objects.equals(refClass, that.refClass) &&
                Objects.equals(ref, that.ref) &&
                Objects.equals(refModuleLocation, that.refModuleLocation) &&
                Objects.equals(refModuleAlias, that.refModuleAlias);
    }

    public CodegenRefInfo(T ref, String refClass, String refModule, String refModuleLocation, String refModuleAlias) {
        this.ref = ref;
        this.refClass = refClass;
        this.refModule = refModule;
        this.refModuleLocation = refModuleLocation;
        this.refModuleAlias = refModuleAlias;
    }
}
