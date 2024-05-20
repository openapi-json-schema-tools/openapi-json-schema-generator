package org.openapijsonschematools.client.servers;

interface ServerProvider<T> {
    fun getServer(serverIndex: T): Server
}

