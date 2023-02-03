package org.openapijsonschematools.codegen.model;

public class CodegenXml {
    public final String name;
    public final String namespace;
    public final String prefix;
    public final Boolean attribute;
    public final Boolean wrapped;

    public CodegenXml(String name, String namespace, String prefix, Boolean attribute, Boolean wrapped) {
        this.name = name;
        this.namespace = namespace;
        this.prefix = prefix;
        this.attribute = attribute;
        this.wrapped = wrapped;
    }
}
