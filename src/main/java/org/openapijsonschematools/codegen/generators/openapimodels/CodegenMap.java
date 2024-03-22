package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A class to store inline operation definitions
 */
public class CodegenMap<T> extends AbstractMap<String, T> {
    public final Map<String, T> map;
    public final CodegenKey jsonPathPiece;
    public final String subpackage;
    public final String pathFromDocRoot;

    public CodegenMap(Map<String, T> map, CodegenKey jsonPathPiece, String subpackage, String pathFromDocRoot) {
        this.map = map;
        this.jsonPathPiece = jsonPathPiece;
        this.subpackage = subpackage;
        this.pathFromDocRoot = pathFromDocRoot;
    }

    @Override
    public Set<Entry<String, T>> entrySet() {
        return this.map.entrySet();
    }
}
