package org.openapijsonschematools.client

import org.openapijsonschematools.client.servers.RootServer0
import org.openapijsonschematools.client.servers.Server
import org.openapijsonschematools.client.servers.ServerProvider

class RootServerInfo {
    class RootServerInfo1(
        private val server0: RootServer0 = RootServer0()
    ) : ServerProvider<ServerIndex> {

        override fun getServer(serverIndex: ServerIndex): Server {
            return server0
        }
    }

    enum class ServerIndex {
        SERVER_0
    }
}