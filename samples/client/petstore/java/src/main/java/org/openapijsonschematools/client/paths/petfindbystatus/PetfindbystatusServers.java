package org.openapijsonschematools.client.paths.petfindbystatus.servers;

import org.openapijsonschematools.client.paths.petfindbystatus.servers.PetfindbystatusServer0;
import org.openapijsonschematools.client.paths.petfindbystatus.servers.PetfindbystatusServer1;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class PetfindbystatusServers {
    final private PetfindbystatusServer0 server0;
    final private PetfindbystatusServer1 server1;

    public PetfindbystatusServers() {
        server0 = new PetfindbystatusServer0();
        server1 = new PetfindbystatusServer1();
    }

    public PetfindbystatusServers(
        @Nullable PetfindbystatusServer0 server0,
        @Nullable PetfindbystatusServer1 server1
    ) {
        this.server0 = Objects.requireNonNullElseGet(server0, () -> new PetfindbystatusServer0();
        this.server1 = Objects.requireNonNullElseGet(server1, () -> new PetfindbystatusServer1();
    }

}