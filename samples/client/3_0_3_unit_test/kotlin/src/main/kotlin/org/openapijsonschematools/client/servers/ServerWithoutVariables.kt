package org.openapijsonschematools.client.servers;

abstract class ServerWithoutVariables protected constructor(val url: String) : Server {
    override fun url(): String {
        return url
    }
}

