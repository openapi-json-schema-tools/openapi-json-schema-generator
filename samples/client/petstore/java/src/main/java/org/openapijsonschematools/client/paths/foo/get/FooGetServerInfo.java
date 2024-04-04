package org.openapijsonschematools.client.paths.foo.get;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.foo.get.servers.FooGetServer0;
import org.openapijsonschematools.client.paths.foo.get.servers.FooGetServer1;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.servers.ServerProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.EnumMap;

public class FooGetServerInfo implements ServerProvider<FooGetServerInfo.ServerIndex> {
    final private Servers servers;
    final private ServerIndex serverIndex;

    public FooGetServerInfo() {
        this.servers = new Servers();
        this.serverIndex = ServerIndex.SERVER_0;
    }

    public FooGetServerInfo(Servers servers, ServerIndex serverIndex) {
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
                        new FooGetServer0()
                    ),
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_1,
                        new FooGetServer1()
                    )
                )
            );
        }

        public Servers(
            @Nullable FooGetServer0 server0,
            @Nullable FooGetServer1 server1
        ) {
            servers = new EnumMap<>(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_0,
                        Objects.requireNonNullElseGet(server0, FooGetServer0::new)
                    ),
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_1,
                        Objects.requireNonNullElseGet(server1, FooGetServer1::new)
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
        SERVER_1
    }

    public Server getServer(@Nullable ServerIndex serverIndex) {
        if (serverIndex == null) {
            return servers.get(this.serverIndex);
        }
        return servers.get(serverIndex);
    }
}