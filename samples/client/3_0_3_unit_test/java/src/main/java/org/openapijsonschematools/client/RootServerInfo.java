package org.openapijsonschematools.client;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.servers.ServerProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.EnumMap;

public class RootServerInfo implements ServerProvider<RootServerInfo.ServerIndex> {
    final private Servers servers;
    final private ServerIndex serverIndex;

    public RootServerInfo() {
        this.servers = new Servers();
        this.serverIndex = ServerIndex.SERVER_0;
    }

    public RootServerInfo(Servers servers, ServerIndex serverIndex) {
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
                    )
                )
            );
        }

        public Servers(
            @Nullable Server0 server0
        ) {
            servers = new EnumMap<>(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_0,
                        Objects.requireNonNullElseGet(server0, Server0::new)
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
        SERVER_0
    }

    public Server getServer(@Nullable ServerIndex serverIndex) {
        if (serverIndex == null) {
            return servers.get(this.serverIndex);
        }
        return servers.get(serverIndex);
    }
}