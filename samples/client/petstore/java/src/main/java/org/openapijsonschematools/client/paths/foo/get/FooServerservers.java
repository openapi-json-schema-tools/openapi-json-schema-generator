package org.openapijsonschematools.client.paths.foo.get.servers;

import org.openapijsonschematools.client.paths.foo.get.servers.FooGetServer0;
import org.openapijsonschematools.client.paths.foo.get.servers.FooGetServer1;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class FooServerservers {
    final private FooGetServer0 server0;
    final private FooGetServer1 server1;

    public FooServerservers() {
        server0 = new FooGetServer0();
        server1 = new FooGetServer1();
    }

    public FooServerservers(
        @Nullable FooGetServer0 server0,
        @Nullable FooGetServer1 server1
    ) {
        this.server0 = Objects.requireNonNullElseGet(server0, () -> new FooGetServer0();
        this.server1 = Objects.requireNonNullElseGet(server1, () -> new FooGetServer1();
    }

}