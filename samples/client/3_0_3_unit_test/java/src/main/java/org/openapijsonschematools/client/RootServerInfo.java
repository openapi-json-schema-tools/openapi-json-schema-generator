package org.openapijsonschematools.client;

import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.servers.ServerProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class RootServerInfo {
    public static class RootServerInfo1 implements ServerProvider<ServerIndex> {
        public final Server0 server0;

        public RootServerInfo1() {
            server0 = new Server0();
        }

        public RootServerInfo1(
            @Nullable Server0 server0
        ) {
            this.server0 = Objects.requireNonNullElseGet(server0, Server0::new);
        }

        @Override
        public Server getServer(ServerIndex serverIndex) {
            return server0;
        }
    }

    public enum ServerIndex {
        SERVER_0
    }
}