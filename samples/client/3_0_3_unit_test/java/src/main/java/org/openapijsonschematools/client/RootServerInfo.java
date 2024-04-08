package org.openapijsonschematools.client;

import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.servers.ServerProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class RootServerInfo {
    public static class RootServerInfo1 implements ServerProvider<ServerIndex> {
        private final Server0 server0;

        RootServerInfo1(
            @Nullable Server0 server0
        ) {
            this.server0 = Objects.requireNonNullElseGet(server0, Server0::new);
        }

        @Override
        public Server getServer(ServerIndex serverIndex) {
            return server0;
        }
    }

    public static class RootServerInfoBuilder {
        private @Nullable Server0 server0;

        public RootServerInfoBuilder() {}

        public RootServerInfoBuilder server0(Server0 server0) {
            this.server0 = server0;
            return this;
        }

        public RootServerInfo1 build() {
            return new RootServerInfo1(
                server0
            );
        }
    }

    public enum ServerIndex {
        SERVER_0
    }
}