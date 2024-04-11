package org.openapijsonschematools.client;

import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.servers.ServerProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class ServerInfo {
    public static class ServerInfo1 implements ServerProvider<ServerIndex> {
        private final Server0 server0;
        private final Server1 server1;
        private final Server2 server2;

        ServerInfo1(
            @Nullable Server0 server0,
            @Nullable Server1 server1,
            @Nullable Server2 server2
        ) {
            this.server0 = Objects.requireNonNullElseGet(server0, Server0::new);
            this.server1 = Objects.requireNonNullElseGet(server1, Server1::new);
            this.server2 = Objects.requireNonNullElseGet(server2, Server2::new);
        }

        @Override
        public Server getServer(ServerIndex serverIndex) {
            switch (serverIndex) {
                case SERVER_0:
                    return server0;
                case SERVER_1:
                    return server1;
                default:
                    return server2;
            }
        }
    }

    public static class ServerInfoBuilder {
        private @Nullable Server0 server0;
        private @Nullable Server1 server1;
        private @Nullable Server2 server2;

        public ServerInfoBuilder() {}

        public ServerInfoBuilder server0(Server0 server0) {
            this.server0 = server0;
            return this;
        }

        public ServerInfoBuilder server1(Server1 server1) {
            this.server1 = server1;
            return this;
        }

        public ServerInfoBuilder server2(Server2 server2) {
            this.server2 = server2;
            return this;
        }

        public ServerInfo1 build() {
            return new ServerInfo1(
                server0,
                server1,
                server2
            );
        }
    }

    public enum ServerIndex {
        SERVER_0,
        SERVER_1,
        SERVER_2
    }
}