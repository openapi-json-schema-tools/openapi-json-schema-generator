package org.openapijsonschematools.client;

import org.openapijsonschematools.client.paths.petfindbystatus.servers.PetfindbystatusServer0;
import org.openapijsonschematools.client.paths.petfindbystatus.servers.PetfindbystatusServer1;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.servers.ServerProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.EnumMap;

public class PetfindbystatusServerInfo implements ServerProvider<PetfindbystatusServerInfo.ServerIndex> {
    final private Servers servers;
    final private ServerIndex serverIndex;

    public PetfindbystatusServerInfo() {
        this.servers = new Servers();
        this.serverIndex = ServerIndex.SERVER_0;
    }

    public PetfindbystatusServerInfo(Servers servers, ServerIndex serverIndex) {
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
                        new PetfindbystatusServer0()
                    ),
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_1,
                        new PetfindbystatusServer1()
                    )
                )
            );
        }

        public Servers(
            @Nullable PetfindbystatusServer0 server0,
            @Nullable PetfindbystatusServer1 server1
        ) {
            servers = new EnumMap<>(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_0,
                        Objects.requireNonNullElseGet(server0, PetfindbystatusServer0::new)
                    ),
                    new AbstractMap.SimpleEntry<>(
                        ServerIndex.SERVER_1,
                        Objects.requireNonNullElseGet(server1, PetfindbystatusServer1::new)
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
        SERVER_1
    }

    public Server get(@Nullable ServerIndex serverIndex) {
        if (serverIndex == null) {
            return servers.get(this.serverIndex);
        }
        return servers.get(serverIndex);
    }
}