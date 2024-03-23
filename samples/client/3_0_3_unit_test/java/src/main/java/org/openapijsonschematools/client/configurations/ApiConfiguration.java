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
    private final @Nullable Duration timeout;

    public ApiConfiguration() {
        serverInfo = new ServerInfo();
        timeout = null;
    }

    public ApiConfiguration(ServerInfo serverInfo, Duration timeout) {
        this.serverInfo = serverInfo;
        this.timeout = timeout;
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

    public Map<String, List< String>> getDefaultHeaders() {
        return new HashMap<>();
    }

    public@Nullable Duration getTimeout() {
        return timeout;
    }
}