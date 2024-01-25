package org.openapijsonschematools.client.configurations;

import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.foo.get.FooGetServerInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.PetfindbystatusServerInfo;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class ApiConfiguration {
    private final ServerInfo serverInfo;

    public ApiConfiguration() {
        serverInfo = new ServerInfo();
    }

    public ApiConfiguration(ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
    }

    public static class ServerInfo {
        protected final RootServerInfo rootServerInfo;
        protected final FooGetServerInfo fooGetServerInfo;
        protected final PetfindbystatusServerInfo petfindbystatusServerInfo;

        public ServerInfo() {
            rootServerInfo = new RootServerInfo();
            fooGetServerInfo = new FooGetServerInfo();
            petfindbystatusServerInfo = new PetfindbystatusServerInfo();
        }

        public ServerInfo(
            @Nullable RootServerInfo rootServerInfo,
            @Nullable FooGetServerInfo fooGetServerInfo,
            @Nullable PetfindbystatusServerInfo petfindbystatusServerInfo
        ) {
            this.rootServerInfo = Objects.requireNonNullElseGet(rootServerInfo, RootServerInfo::new);
            this.fooGetServerInfo = Objects.requireNonNullElseGet(fooGetServerInfo, FooGetServerInfo::new);
            this.petfindbystatusServerInfo = Objects.requireNonNullElseGet(petfindbystatusServerInfo, PetfindbystatusServerInfo::new);
        }
    }

    public Server getServer(RootServerInfo. @Nullable ServerIndex serverIndex) {
        return serverInfo.rootServerInfo.getServer(serverIndex);
    }
    public Server getServer(FooGetServerInfo. @Nullable ServerIndex serverIndex) {
        return serverInfo.fooGetServerInfo.getServer(serverIndex);
    }
    public Server getServer(PetfindbystatusServerInfo. @Nullable ServerIndex serverIndex) {
        return serverInfo.petfindbystatusServerInfo.getServer(serverIndex);
    }
}