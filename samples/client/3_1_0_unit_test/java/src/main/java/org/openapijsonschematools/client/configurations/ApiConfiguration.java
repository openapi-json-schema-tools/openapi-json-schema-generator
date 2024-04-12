package org.openapijsonschematools.client.configurations;

import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.ServerInfo;
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
    private final Map<String, List< String>> defaultHeaders;

    public ApiConfiguration() {
        serverInfo = new ServerInfoBuilder().build();
        serverIndexInfo = new ServerIndexInfoBuilder().build();
        timeout = null;
        defaultHeaders = new HashMap<>();
    }

    public ApiConfiguration(ServerInfo serverInfo, ServerIndexInfo serverIndexInfo, Duration timeout, Map<String, List< String>> defaultHeaders) {
        this.serverInfo = serverInfo;
        this.serverIndexInfo = serverIndexInfo;
        this.timeout = timeout;
        this.defaultHeaders = defaultHeaders;
    }

    public static class ServerInfo {
        final ServerInfo.ServerInfo1 serverInfo;

        ServerInfo(
            ServerInfo. @Nullable ServerInfo1 serverInfo
        ) {
            this.serverInfo = Objects.requireNonNullElse(serverInfo, new ServerInfo.ServerInfoBuilder().build());
        }
    }

    public static class ServerInfoBuilder {
        private ServerInfo. @Nullable ServerInfo1 serverInfo;
        public ServerInfoBuilder() {}

        public ServerInfoBuilder serverInfo(ServerInfo.ServerInfo1 serverInfo) {
            this.serverInfo = serverInfo;
            return this;
        }

        public ServerInfo build() {
            return new ServerInfo(
                serverInfo
            );
        }
    }

    public static class ServerIndexInfo {
        final ServerInfo.ServerIndex serverInfoServerIndex;

        ServerIndexInfo(
            ServerInfo. @Nullable ServerIndex serverInfoServerIndex
        ) {
            this.serverInfoServerIndex = Objects.requireNonNullElse(serverInfoServerIndex, ServerInfo.ServerIndex.SERVER_0);
        }
    }

    public static class ServerIndexInfoBuilder {
        private ServerInfo. @Nullable ServerIndex serverInfoServerIndex;
        public ServerIndexInfoBuilder() {}

        public ServerIndexInfoBuilder serverInfoServerIndex(ServerInfo.ServerIndex serverIndex) {
            this.serverInfoServerIndex = serverIndex;
            return this;
        }

        public ServerIndexInfo build() {
            return new ServerIndexInfo(
                serverInfoServerIndex
            );
        }
    }

    public Server getServer(ServerInfo. @Nullable ServerIndex serverIndex) {
        var serverProvider = serverInfo.serverInfo;
        if (serverIndex == null) {
            ServerInfo.ServerIndex configServerIndex = serverIndexInfo.serverInfoServerIndex;
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