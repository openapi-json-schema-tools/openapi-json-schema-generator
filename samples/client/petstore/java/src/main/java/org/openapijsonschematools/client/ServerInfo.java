package org.openapijsonschematools.client;

import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.servers.ServerProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.EnumMap;

public class ServerInfo implements ServerProvider<ServerInfo.ServerIndex> {
    final private Servers servers;
    final private ServerIndex serverIndex;

    public ServerInfo() {
        this.servers = new Servers();
        this.serverIndex = ServerIndex.SERVER_0;
    }

    public ServerInfo(Servers servers, ServerIndex serverIndex) {
        this.servers = servers;
        this.serverIndex = serverIndex;
    }

    public static class Servers {
        private final EnumMap<ServerIndex, Server> servers;

        public Servers() {
            servers = new EnumMap<>(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_0,
                        new Server0()
                    ),
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_1,
                        new Server1()
                    ),
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_2,
                        new Server2()
                    )
                )
            );
        }

        public Servers(
            @Nullable Server0 server0,
            @Nullable Server1 server1,
            @Nullable Server2 server2
        ) {
            servers = new EnumMap<>(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_0,
                        Objects.requireNonNullElseGet(server0, Server0::new)
                    ),
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_1,
                        Objects.requireNonNullElseGet(server1, Server1::new)
                    ),
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_2,
                        Objects.requireNonNullElseGet(server2, Server2::new)
                    )
                )
            );
        }

        public Server get(ServerIndex serverIndex) {
            return servers.get(serverIndex);
        }
    }

    public enum ServerIndex {
        SERVER_0,
        SERVER_1,
        SERVER_2
    }

    public Server get(@Nullable ServerIndex serverIndex) {
        if (serverIndex == null) {
            return servers.get(this.serverIndex);
        }
        return servers.get(serverIndex);
    }
}