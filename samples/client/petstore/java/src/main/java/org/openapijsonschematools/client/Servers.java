package org.openapijsonschematools.client.servers;

import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class Servers {
    final private Server0 server0;
    final private Server1 server1;
    final private Server2 server2;

    public Servers() {
        server0 = new Server0();
        server1 = new Server1();
        server2 = new Server2();
    }

    public Servers(
        @Nullable Server0 server0,
        @Nullable Server1 server1,
        @Nullable Server2 server2
    ) {
        this.server0 = Objects.requireNonNullElseGet(server0, Server0::new);
        this.server1 = Objects.requireNonNullElseGet(server1, Server1::new);
        this.server2 = Objects.requireNonNullElseGet(server2, Server2::new);
    }

}