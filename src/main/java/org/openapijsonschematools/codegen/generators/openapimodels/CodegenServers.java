package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

/**
 * A class to store inline codegenschema definitions
 */
public class CodegenServers extends AbstractList<CodegenServer> {
    public final List<CodegenServer> servers;
    public final CodegenKey jsonPathPiece;
    public final String subPackage;

    public CodegenServers(List<CodegenServer> servers, CodegenKey jsonPathPiece, String subPackage) {
        this.servers = servers;
        this.jsonPathPiece = jsonPathPiece;
        this.subPackage = subPackage;
    }

    @Override
    public CodegenServer get(int index) {
        return this.servers.get(index);
    }

    @Override
    public int size() {
        return this.servers.size();
    }
}
