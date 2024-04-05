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
        serverInfo = new ServerInfo();
        serverIndexInfo = new ServerIndexInfo();
        timeout = null;
    }

    public ApiConfiguration(ServerInfo serverInfo, ServerIndexInfo serverIndexInfo, Duration timeout) {
        this.serverInfo = serverInfo;
        this.serverIndexInfo = serverIndexInfo;
        this.timeout = timeout;
    }

    public static class ServerInfo {
        protected final RootServerInfo.RootServerInfo1 rootServerInfo;

        public ServerInfo() {
            rootServerInfo = new RootServerInfo.RootServerInfo1();
        }

        public ServerInfo(
            RootServerInfo. @Nullable RootServerInfo1 rootServerInfo
        ) {
            this.rootServerInfo = Objects.requireNonNullElseGet(rootServerInfo, RootServerInfo.RootServerInfo1::new);
        }
    }

    public static class ServerIndexInfo {
        protected RootServerInfo. @Nullable ServerIndex rootServerInfoServerIndex;
        public ServerIndexInfo() {}

        public ServerIndexInfo rootServerInfoServerIndex(RootServerInfo.ServerIndex serverIndex) {
            this.rootServerInfoServerIndex = serverIndex;
            return this;
        }
    }

    public Server getServer(RootServerInfo. @Nullable ServerIndex serverIndex) {
        var serverProvider = serverInfo.rootServerInfo;
        if (serverIndex == null) {
            RootServerInfo. @Nullable ServerIndex configServerIndex = serverIndexInfo.rootServerInfoServerIndex;
            if (configServerIndex == null) {
                throw new RuntimeException("rootServerInfoServerIndex is unset");
            }
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