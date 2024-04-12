package org.openapijsonschematools.client;

import org.openapijsonschematools.client.servers.RootServer0;
import org.openapijsonschematools.client.servers.RootServer1;
import org.openapijsonschematools.client.servers.RootServer2;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.servers.ServerProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class RootServerInfo {
    public static class RootServerInfo1 implements ServerProvider<ServerIndex> {
        private final RootServer0 server0;
        private final RootServer1 server1;
        private final RootServer2 server2;

        RootServerInfo1(
            @Nullable RootServer0 server0,
            @Nullable RootServer1 server1,
            @Nullable RootServer2 server2
        ) {
            this.server0 = Objects.requireNonNullElseGet(server0, RootServer0::new);
            this.server1 = Objects.requireNonNullElseGet(server1, RootServer1::new);
            this.server2 = Objects.requireNonNullElseGet(server2, RootServer2::new);
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

    public static class RootServerInfoBuilder {
        private @Nullable RootServer0 server0;
        private @Nullable RootServer1 server1;
        private @Nullable RootServer2 server2;

        public RootServerInfoBuilder() {}

        public RootServerInfoBuilder rootServer0(RootServer0 server0) {
            this.server0 = server0;
            return this;
        }

        public RootServerInfoBuilder rootServer1(RootServer1 server1) {
            this.server1 = server1;
            return this;
        }

        public RootServerInfoBuilder rootServer2(RootServer2 server2) {
            this.server2 = server2;
            return this;
        }

        public RootServerInfo1 build() {
            return new RootServerInfo1(
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