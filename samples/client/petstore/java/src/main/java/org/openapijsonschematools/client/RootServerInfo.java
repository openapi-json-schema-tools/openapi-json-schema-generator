package org.openapijsonschematools.client;

import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.servers.ServerProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class RootServerInfo {
    public static class RootServerInfo1 implements ServerProvider<ServerIndex> {
        public final Server0 server0;
        public final Server1 server1;
        public final Server2 server2;

        public RootServerInfo1() {
            server0 = new Server0();
            server1 = new Server1();
            server2 = new Server2();
        }

        public RootServerInfo1(
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

    public enum ServerIndex {
        SERVER_0,
        SERVER_1,
        SERVER_2
    }
}