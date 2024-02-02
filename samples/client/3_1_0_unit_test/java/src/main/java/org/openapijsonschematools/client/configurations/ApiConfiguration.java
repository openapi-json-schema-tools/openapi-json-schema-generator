package org.openapijsonschematools.client.configurations;

import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.RootServerInfo;
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

        public ServerInfo() {
            rootServerInfo = new RootServerInfo();
        }

        public ServerInfo(
            @Nullable RootServerInfo rootServerInfo
        ) {
            this.rootServerInfo = Objects.requireNonNullElseGet(rootServerInfo, RootServerInfo::new);
        }
    }

    public Server getServer(RootServerInfo. @Nullable ServerIndex serverIndex) {
        return serverInfo.rootServerInfo.getServer(serverIndex);
    }
}