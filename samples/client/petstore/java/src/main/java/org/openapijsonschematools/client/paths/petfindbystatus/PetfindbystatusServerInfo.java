package org.openapijsonschematools.client.paths.petfindbystatus;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.petfindbystatus.servers.PetfindbystatusServer0;
import org.openapijsonschematools.client.paths.petfindbystatus.servers.PetfindbystatusServer1;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.servers.ServerProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class PetfindbystatusServerInfo {
    public static class PetfindbystatusServerInfo1 implements ServerProvider<ServerIndex> {
        public final PetfindbystatusServer0 server0;
        public final PetfindbystatusServer1 server1;

        public PetfindbystatusServerInfo1() {
            server0 = new PetfindbystatusServer0();
            server1 = new PetfindbystatusServer1();
        }

        public PetfindbystatusServerInfo1(
            @Nullable PetfindbystatusServer0 server0,
            @Nullable PetfindbystatusServer1 server1
        ) {
            this.server0 = Objects.requireNonNullElseGet(server0, PetfindbystatusServer0::new);
            this.server1 = Objects.requireNonNullElseGet(server1, PetfindbystatusServer1::new);
        }

        public Server getServer(ServerIndex serverIndex) {
            switch (serverIndex) {
                case SERVER_0:
                    return server0;
                default:
                    return server1;
            }
        }
    }

    public enum ServerIndex {
        SERVER_0,
        SERVER_1
    }
}