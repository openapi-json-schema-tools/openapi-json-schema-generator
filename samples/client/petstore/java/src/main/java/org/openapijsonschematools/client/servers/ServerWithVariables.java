package org.openapijsonschematools.client.servers;

import java.util.Map;

public abstract class ServerWithVariables<T extends Map<String, String>> implements Server {
    public final String url;
    public final T variables;

    protected ServerWithVariables(String url, T variables) {
        this.variables = variables;
        for (Map.Entry<String, String> entry: variables.entrySet()) {
            url = url.replace("{" + entry.getKey() + "}", entry.getValue());
        }
        this.url = url;
    }

    public String url(){
        return url;
    }
}

