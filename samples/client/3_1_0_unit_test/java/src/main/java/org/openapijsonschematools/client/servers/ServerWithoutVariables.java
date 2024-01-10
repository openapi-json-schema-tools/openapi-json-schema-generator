package org.openapijsonschematools.client.servers;

public abstract class ServerWithoutVariables {
    public final String url;

    protected ServerWithoutVariables(String url) {
        this.url = url;
    }
}

