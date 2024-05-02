package org.openapijsonschematools.client.servers;

public interface ServerProvider<T> {
    Server getServer(T serverIndex);
}

