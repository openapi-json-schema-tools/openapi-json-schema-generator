package org.openapijsonschematools.client.configurations;

import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.RootServerInfo;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.HashMap;

public class ApiConfiguration {
    private final ServerInfo serverInfo;
    private final ServerIndexInfo serverIndexInfo;
    private final @Nullable Duration timeout;

    public ApiConfiguration() {
        serverInfo = new ServerInfoBuilder().build();
        serverIndexInfo = new ServerIndexInfoBuilder().build();
        timeout = null;
    }

    public ApiConfiguration(ServerInfo serverInfo, ServerIndexInfo serverIndexInfo, Duration timeout) {
        this.serverInfo = serverInfo;
        this.serverIndexInfo = serverIndexInfo;
        this.timeout = timeout;
    }

    public static class ServerInfo {
        final RootServerInfo.RootServerInfo1 rootServerInfo;

        ServerInfo(
            RootServerInfo. @Nullable RootServerInfo1 rootServerInfo
        ) {
            this.rootServerInfo = Objects.requireNonNullElse(rootServerInfo, new RootServerInfo.RootServerInfoBuilder().build());
        }
    }

    public static class ServerInfoBuilder {
        private RootServerInfo. @Nullable RootServerInfo1 rootServerInfo;
        public ServerInfoBuilder() {}

        public ServerInfoBuilder rootServerInfo(RootServerInfo.RootServerInfo1 rootServerInfo) {
            this.rootServerInfo = rootServerInfo;
            return this;
        }

        public ServerInfo build() {
            return new ServerInfo(
                rootServerInfo
            );
        }
    }

    public static class ServerIndexInfo {
        final RootServerInfo.ServerIndex rootServerInfoServerIndex;

        ServerIndexInfo(
            RootServerInfo. @Nullable ServerIndex rootServerInfoServerIndex
        ) {
            this.rootServerInfoServerIndex = Objects.requireNonNullElse(rootServerInfoServerIndex, RootServerInfo.ServerIndex.SERVER_0);
        }
    }

    public static class ServerIndexInfoBuilder {
        private RootServerInfo. @Nullable ServerIndex rootServerInfoServerIndex;
        public ServerIndexInfoBuilder() {}

        public ServerIndexInfoBuilder rootServerInfoServerIndex(RootServerInfo.ServerIndex serverIndex) {
            this.rootServerInfoServerIndex = serverIndex;
            return this;
        }

        public ServerIndexInfo build() {
            return new ServerIndexInfo(
                rootServerInfoServerIndex
            );
        }
    }

    public Server getServer(RootServerInfo. @Nullable ServerIndex serverIndex) {
        var serverProvider = serverInfo.rootServerInfo;
        if (serverIndex == null) {
            RootServerInfo.ServerIndex configServerIndex = serverIndexInfo.rootServerInfoServerIndex;
            return serverProvider.getServer(configServerIndex);
        }
        return serverProvider.getServer(serverIndex);
    }

    public Map<String, List< String>> getDefaultHeaders() {
        return new HashMap<>();
    }

    public @Nullable Duration getTimeout() {
        return timeout;
    }
}