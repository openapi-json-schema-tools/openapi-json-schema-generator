package org.openapijsonschematools.codegen.model;

import org.openapijsonschematools.codegen.SchemaTestCase;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;

public class CodegenMediaType {
    public final CodegenSchema schema;
    public final LinkedHashMap<String, CodegenEncoding> encoding;
    public final HashMap<String, SchemaTestCase> testCases;

    public CodegenMediaType(CodegenSchema schema, LinkedHashMap<String, CodegenEncoding> encoding, HashMap<String, SchemaTestCase> testCases) {
        this.schema = schema;
        this.encoding = encoding;
        this.testCases = testCases;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenMediaType{");
        sb.append("schema=").append(schema);
        sb.append(", encoding=").append(encoding);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenMediaType that = (CodegenMediaType) o;
        return Objects.equals(schema,that.schema) &&
                Objects.equals(encoding, that.encoding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schema, encoding);
    }
}


