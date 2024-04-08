package org.openapijsonschematools.client.paths.petfindbystatus;

import org.openapijsonschematools.client.paths.petfindbystatus.servers.PetfindbystatusServer0;
import org.openapijsonschematools.client.paths.petfindbystatus.servers.PetfindbystatusServer1;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.servers.ServerProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class PetfindbystatusServerInfo {
    public static class PetfindbystatusServerInfo1 implements ServerProvider<ServerIndex> {
        private final PetfindbystatusServer0 server0;
        private final PetfindbystatusServer1 server1;

        PetfindbystatusServerInfo1(
            @Nullable PetfindbystatusServer0 server0,
            @Nullable PetfindbystatusServer1 server1
        ) {
            this.server0 = Objects.requireNonNullElseGet(server0, PetfindbystatusServer0::new);
            this.server1 = Objects.requireNonNullElseGet(server1, PetfindbystatusServer1::new);
        }

        @Override
        public Server getServer(ServerIndex serverIndex) {
            switch (serverIndex) {
                case SERVER_0:
                    return server0;
                default:
                    return server1;
            }
        }
    }

    public static class PetfindbystatusServerInfoBuilder {
        private @Nullable PetfindbystatusServer0 server0;
        private @Nullable PetfindbystatusServer1 server1;

        public PetfindbystatusServerInfoBuilder() {}

        public PetfindbystatusServerInfoBuilder petfindbystatusServer0(PetfindbystatusServer0 server0) {
            this.server0 = server0;
            return this;
        }

        public PetfindbystatusServerInfoBuilder petfindbystatusServer1(PetfindbystatusServer1 server1) {
            this.server1 = server1;
            return this;
        }

        public PetfindbystatusServerInfo1 build() {
            return new PetfindbystatusServerInfo1(
                server0,
                server1
            );
        }
    }

    public enum ServerIndex {
        SERVER_0,
        SERVER_1
    }
}