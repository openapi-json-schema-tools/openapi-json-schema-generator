package org.openapijsonschematools.client;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
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

public class RootServerInfo implements ServerProvider<RootServerInfo.ServerIndex> {
    final private Servers servers;

    public RootServerInfo() {
        this.servers = new Servers();
    }

    public RootServerInfo(Servers servers) {
        this.servers = servers;
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
            if (servers.containsKey(serverIndex)) {
                return get(serverIndex);
            }
            throw new UnsetPropertyException(serverIndex+" is unset");
        }
    }

    public enum ServerIndex {
        SERVER_0,
        SERVER_1,
        SERVER_2
    }

    public Server getServer(@Nullable ServerIndex serverIndex) {
        if (serverIndex == null) {
            return servers.get(this.serverIndex);
        }
        return servers.get(serverIndex);
    }
}