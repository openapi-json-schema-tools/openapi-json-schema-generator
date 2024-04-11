package org.openapijsonschematools.client.configurations;

import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.paths.foo.get.FooGetServerInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.PetfindbystatusServerInfo;
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.fake.post.FakePostSecurityInfo;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.FakeclassnametestPatchSecurityInfo;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.FakemultiplesecuritiesGetSecurityInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostSecurityInfo;
import org.openapijsonschematools.client.paths.pet.post.PetPostSecurityInfo;
import org.openapijsonschematools.client.paths.pet.put.PetPutSecurityInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.get.PetfindbystatusGetSecurityInfo;
import org.openapijsonschematools.client.paths.petfindbytags.get.PetfindbytagsGetSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.get.PetpetidGetSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.post.PetpetidPostSecurityInfo;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostSecurityInfo;
import org.openapijsonschematools.client.paths.storeinventory.get.StoreinventoryGetSecurityInfo;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.HashMap;

public class ApiConfiguration {
    private final ServerInfo serverInfo;
    private final ServerIndexInfo serverIndexInfo;
    private final SecurityInfo securityInfo;
    private final SecurityIndexInfo securityIndexInfo;
    private final @Nullable Duration timeout;
    private final Map<Class<? extends SecurityScheme>, SecurityScheme> securitySchemeInfo;
    private final Map<String, List< String>> defaultHeaders;

    public ApiConfiguration() {
        serverInfo = new ServerInfoBuilder().build();
        serverIndexInfo = new ServerIndexInfoBuilder().build();
        securityInfo = new SecurityInfo();
        securityIndexInfo = new SecurityIndexInfoBuilder().build();
        securitySchemeInfo = new HashMap<>();
        timeout = null;
        defaultHeaders = new HashMap<>();
    }

    public ApiConfiguration(ServerInfo serverInfo, ServerIndexInfo serverIndexInfo, List<SecurityScheme> securitySchemes, SecurityIndexInfo securityIndexInfo, Duration timeout, Map<String, List< String>> defaultHeaders) {
        this.serverInfo = serverInfo;
        this.serverIndexInfo = serverIndexInfo;
        this.securityInfo = new SecurityInfo();
        this.securityIndexInfo = securityIndexInfo;
        securitySchemeInfo = new HashMap<>();
        for (SecurityScheme securityScheme: securitySchemes) {
            securitySchemeInfo.put(securityScheme.getClass(), securityScheme);
        }
        this.timeout = timeout;
        this.defaultHeaders = defaultHeaders;
    }

    public static class ServerInfo {
        final FooGetServerInfo.FooGetServerInfo1 fooGetServerInfo;
        final PetfindbystatusServerInfo.PetfindbystatusServerInfo1 petfindbystatusServerInfo;
        final ServerInfo.ServerInfo1 serverInfo;

        ServerInfo(
            FooGetServerInfo. @Nullable FooGetServerInfo1 fooGetServerInfo,
            PetfindbystatusServerInfo. @Nullable PetfindbystatusServerInfo1 petfindbystatusServerInfo,
            ServerInfo. @Nullable ServerInfo1 serverInfo
        ) {
            this.fooGetServerInfo = Objects.requireNonNullElse(fooGetServerInfo, new FooGetServerInfo.FooGetServerInfoBuilder().build());
            this.petfindbystatusServerInfo = Objects.requireNonNullElse(petfindbystatusServerInfo, new PetfindbystatusServerInfo.PetfindbystatusServerInfoBuilder().build());
            this.serverInfo = Objects.requireNonNullElse(serverInfo, new ServerInfo.ServerInfoBuilder().build());
        }
    }

    public static class ServerInfoBuilder {
        private FooGetServerInfo. @Nullable FooGetServerInfo1 fooGetServerInfo;
        private PetfindbystatusServerInfo. @Nullable PetfindbystatusServerInfo1 petfindbystatusServerInfo;
        private ServerInfo. @Nullable ServerInfo1 serverInfo;
        public ServerInfoBuilder() {}

        public ServerInfoBuilder fooGetServerInfo(FooGetServerInfo.FooGetServerInfo1 fooGetServerInfo) {
            this.fooGetServerInfo = fooGetServerInfo;
            return this;
        }

        public ServerInfoBuilder petfindbystatusServerInfo(PetfindbystatusServerInfo.PetfindbystatusServerInfo1 petfindbystatusServerInfo) {
            this.petfindbystatusServerInfo = petfindbystatusServerInfo;
            return this;
        }

        public ServerInfoBuilder serverInfo(ServerInfo.ServerInfo1 serverInfo) {
            this.serverInfo = serverInfo;
            return this;
        }

        public ServerInfo build() {
            return new ServerInfo(
                fooGetServerInfo,
                petfindbystatusServerInfo,
                serverInfo
            );
        }
    }

    public static class ServerIndexInfo {
        final FooGetServerInfo.ServerIndex fooGetServerInfoServerIndex;
        final PetfindbystatusServerInfo.ServerIndex petfindbystatusServerInfoServerIndex;
        final ServerInfo.ServerIndex serverInfoServerIndex;

        ServerIndexInfo(
            FooGetServerInfo. @Nullable ServerIndex fooGetServerInfoServerIndex,
            PetfindbystatusServerInfo. @Nullable ServerIndex petfindbystatusServerInfoServerIndex,
            ServerInfo. @Nullable ServerIndex serverInfoServerIndex
        ) {
            this.fooGetServerInfoServerIndex = Objects.requireNonNullElse(fooGetServerInfoServerIndex, FooGetServerInfo.ServerIndex.SERVER_0);
            this.petfindbystatusServerInfoServerIndex = Objects.requireNonNullElse(petfindbystatusServerInfoServerIndex, PetfindbystatusServerInfo.ServerIndex.SERVER_0);
            this.serverInfoServerIndex = Objects.requireNonNullElse(serverInfoServerIndex, ServerInfo.ServerIndex.SERVER_0);
        }
    }

    public static class ServerIndexInfoBuilder {
        private FooGetServerInfo. @Nullable ServerIndex fooGetServerInfoServerIndex;
        private PetfindbystatusServerInfo. @Nullable ServerIndex petfindbystatusServerInfoServerIndex;
        private ServerInfo. @Nullable ServerIndex serverInfoServerIndex;
        public ServerIndexInfoBuilder() {}

        public ServerIndexInfoBuilder fooGetServerInfoServerIndex(FooGetServerInfo.ServerIndex serverIndex) {
            this.fooGetServerInfoServerIndex = serverIndex;
            return this;
        }

        public ServerIndexInfoBuilder petfindbystatusServerInfoServerIndex(PetfindbystatusServerInfo.ServerIndex serverIndex) {
            this.petfindbystatusServerInfoServerIndex = serverIndex;
            return this;
        }

        public ServerIndexInfoBuilder serverInfoServerIndex(ServerInfo.ServerIndex serverIndex) {
            this.serverInfoServerIndex = serverIndex;
            return this;
        }

        public ServerIndexInfo build() {
            return new ServerIndexInfo(
                fooGetServerInfoServerIndex,
                petfindbystatusServerInfoServerIndex,
                serverInfoServerIndex
            );
        }
    }

    public Server getServer(FooGetServerInfo. @Nullable ServerIndex serverIndex) {
        var serverProvider = serverInfo.fooGetServerInfo;
        if (serverIndex == null) {
            FooGetServerInfo.ServerIndex configServerIndex = serverIndexInfo.fooGetServerInfoServerIndex;
            return serverProvider.getServer(configServerIndex);
        }
        return serverProvider.getServer(serverIndex);
    }

    public Server getServer(PetfindbystatusServerInfo. @Nullable ServerIndex serverIndex) {
        var serverProvider = serverInfo.petfindbystatusServerInfo;
        if (serverIndex == null) {
            PetfindbystatusServerInfo.ServerIndex configServerIndex = serverIndexInfo.petfindbystatusServerInfoServerIndex;
            return serverProvider.getServer(configServerIndex);
        }
        return serverProvider.getServer(serverIndex);
    }

    public Server getServer(ServerInfo. @Nullable ServerIndex serverIndex) {
        var serverProvider = serverInfo.serverInfo;
        if (serverIndex == null) {
            ServerInfo.ServerIndex configServerIndex = serverIndexInfo.serverInfoServerIndex;
            return serverProvider.getServer(configServerIndex);
        }
        return serverProvider.getServer(serverIndex);
    }

    public static class SecurityInfo {
        protected final FakeDeleteSecurityInfo.FakeDeleteSecurityInfo1 fakeDeleteSecurityInfo;
        protected final FakePostSecurityInfo.FakePostSecurityInfo1 fakePostSecurityInfo;
        protected final FakeclassnametestPatchSecurityInfo.FakeclassnametestPatchSecurityInfo1 fakeclassnametestPatchSecurityInfo;
        protected final FakemultiplesecuritiesGetSecurityInfo.FakemultiplesecuritiesGetSecurityInfo1 fakemultiplesecuritiesGetSecurityInfo;
        protected final FakepetiduploadimagewithrequiredfilePostSecurityInfo.FakepetiduploadimagewithrequiredfilePostSecurityInfo1 fakepetiduploadimagewithrequiredfilePostSecurityInfo;
        protected final PetPostSecurityInfo.PetPostSecurityInfo1 petPostSecurityInfo;
        protected final PetPutSecurityInfo.PetPutSecurityInfo1 petPutSecurityInfo;
        protected final PetfindbystatusGetSecurityInfo.PetfindbystatusGetSecurityInfo1 petfindbystatusGetSecurityInfo;
        protected final PetfindbytagsGetSecurityInfo.PetfindbytagsGetSecurityInfo1 petfindbytagsGetSecurityInfo;
        protected final PetpetidDeleteSecurityInfo.PetpetidDeleteSecurityInfo1 petpetidDeleteSecurityInfo;
        protected final PetpetidGetSecurityInfo.PetpetidGetSecurityInfo1 petpetidGetSecurityInfo;
        protected final PetpetidPostSecurityInfo.PetpetidPostSecurityInfo1 petpetidPostSecurityInfo;
        protected final PetpetiduploadimagePostSecurityInfo.PetpetiduploadimagePostSecurityInfo1 petpetiduploadimagePostSecurityInfo;
        protected final StoreinventoryGetSecurityInfo.StoreinventoryGetSecurityInfo1 storeinventoryGetSecurityInfo;

        public SecurityInfo() {
            this.fakeDeleteSecurityInfo = new FakeDeleteSecurityInfo.FakeDeleteSecurityInfo1();
            this.fakePostSecurityInfo = new FakePostSecurityInfo.FakePostSecurityInfo1();
            this.fakeclassnametestPatchSecurityInfo = new FakeclassnametestPatchSecurityInfo.FakeclassnametestPatchSecurityInfo1();
            this.fakemultiplesecuritiesGetSecurityInfo = new FakemultiplesecuritiesGetSecurityInfo.FakemultiplesecuritiesGetSecurityInfo1();
            this.fakepetiduploadimagewithrequiredfilePostSecurityInfo = new FakepetiduploadimagewithrequiredfilePostSecurityInfo.FakepetiduploadimagewithrequiredfilePostSecurityInfo1();
            this.petPostSecurityInfo = new PetPostSecurityInfo.PetPostSecurityInfo1();
            this.petPutSecurityInfo = new PetPutSecurityInfo.PetPutSecurityInfo1();
            this.petfindbystatusGetSecurityInfo = new PetfindbystatusGetSecurityInfo.PetfindbystatusGetSecurityInfo1();
            this.petfindbytagsGetSecurityInfo = new PetfindbytagsGetSecurityInfo.PetfindbytagsGetSecurityInfo1();
            this.petpetidDeleteSecurityInfo = new PetpetidDeleteSecurityInfo.PetpetidDeleteSecurityInfo1();
            this.petpetidGetSecurityInfo = new PetpetidGetSecurityInfo.PetpetidGetSecurityInfo1();
            this.petpetidPostSecurityInfo = new PetpetidPostSecurityInfo.PetpetidPostSecurityInfo1();
            this.petpetiduploadimagePostSecurityInfo = new PetpetiduploadimagePostSecurityInfo.PetpetiduploadimagePostSecurityInfo1();
            this.storeinventoryGetSecurityInfo = new StoreinventoryGetSecurityInfo.StoreinventoryGetSecurityInfo1();
        }
    }

    public static class SecurityIndexInfo {
        final FakeDeleteSecurityInfo.SecurityIndex fakeDeleteSecurityInfoSecurityIndex;
        final FakePostSecurityInfo.SecurityIndex fakePostSecurityInfoSecurityIndex;
        final FakeclassnametestPatchSecurityInfo.SecurityIndex fakeclassnametestPatchSecurityInfoSecurityIndex;
        final FakemultiplesecuritiesGetSecurityInfo.SecurityIndex fakemultiplesecuritiesGetSecurityInfoSecurityIndex;
        final FakepetiduploadimagewithrequiredfilePostSecurityInfo.SecurityIndex fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex;
        final PetPostSecurityInfo.SecurityIndex petPostSecurityInfoSecurityIndex;
        final PetPutSecurityInfo.SecurityIndex petPutSecurityInfoSecurityIndex;
        final PetfindbystatusGetSecurityInfo.SecurityIndex petfindbystatusGetSecurityInfoSecurityIndex;
        final PetfindbytagsGetSecurityInfo.SecurityIndex petfindbytagsGetSecurityInfoSecurityIndex;
        final PetpetidDeleteSecurityInfo.SecurityIndex petpetidDeleteSecurityInfoSecurityIndex;
        final PetpetidGetSecurityInfo.SecurityIndex petpetidGetSecurityInfoSecurityIndex;
        final PetpetidPostSecurityInfo.SecurityIndex petpetidPostSecurityInfoSecurityIndex;
        final PetpetiduploadimagePostSecurityInfo.SecurityIndex petpetiduploadimagePostSecurityInfoSecurityIndex;
        final StoreinventoryGetSecurityInfo.SecurityIndex storeinventoryGetSecurityInfoSecurityIndex;

        SecurityIndexInfo(
            FakeDeleteSecurityInfo. @Nullable SecurityIndex fakeDeleteSecurityInfoSecurityIndex,
            FakePostSecurityInfo. @Nullable SecurityIndex fakePostSecurityInfoSecurityIndex,
            FakeclassnametestPatchSecurityInfo. @Nullable SecurityIndex fakeclassnametestPatchSecurityInfoSecurityIndex,
            FakemultiplesecuritiesGetSecurityInfo. @Nullable SecurityIndex fakemultiplesecuritiesGetSecurityInfoSecurityIndex,
            FakepetiduploadimagewithrequiredfilePostSecurityInfo. @Nullable SecurityIndex fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex,
            PetPostSecurityInfo. @Nullable SecurityIndex petPostSecurityInfoSecurityIndex,
            PetPutSecurityInfo. @Nullable SecurityIndex petPutSecurityInfoSecurityIndex,
            PetfindbystatusGetSecurityInfo. @Nullable SecurityIndex petfindbystatusGetSecurityInfoSecurityIndex,
            PetfindbytagsGetSecurityInfo. @Nullable SecurityIndex petfindbytagsGetSecurityInfoSecurityIndex,
            PetpetidDeleteSecurityInfo. @Nullable SecurityIndex petpetidDeleteSecurityInfoSecurityIndex,
            PetpetidGetSecurityInfo. @Nullable SecurityIndex petpetidGetSecurityInfoSecurityIndex,
            PetpetidPostSecurityInfo. @Nullable SecurityIndex petpetidPostSecurityInfoSecurityIndex,
            PetpetiduploadimagePostSecurityInfo. @Nullable SecurityIndex petpetiduploadimagePostSecurityInfoSecurityIndex,
            StoreinventoryGetSecurityInfo. @Nullable SecurityIndex storeinventoryGetSecurityInfoSecurityIndex
        ) {
            this.fakeDeleteSecurityInfoSecurityIndex = Objects.requireNonNullElse(fakeDeleteSecurityInfoSecurityIndex, FakeDeleteSecurityInfo.SecurityIndex.SECURITY_0);
            this.fakePostSecurityInfoSecurityIndex = Objects.requireNonNullElse(fakePostSecurityInfoSecurityIndex, FakePostSecurityInfo.SecurityIndex.SECURITY_0);
            this.fakeclassnametestPatchSecurityInfoSecurityIndex = Objects.requireNonNullElse(fakeclassnametestPatchSecurityInfoSecurityIndex, FakeclassnametestPatchSecurityInfo.SecurityIndex.SECURITY_0);
            this.fakemultiplesecuritiesGetSecurityInfoSecurityIndex = Objects.requireNonNullElse(fakemultiplesecuritiesGetSecurityInfoSecurityIndex, FakemultiplesecuritiesGetSecurityInfo.SecurityIndex.SECURITY_0);
            this.fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex = Objects.requireNonNullElse(fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex, FakepetiduploadimagewithrequiredfilePostSecurityInfo.SecurityIndex.SECURITY_0);
            this.petPostSecurityInfoSecurityIndex = Objects.requireNonNullElse(petPostSecurityInfoSecurityIndex, PetPostSecurityInfo.SecurityIndex.SECURITY_0);
            this.petPutSecurityInfoSecurityIndex = Objects.requireNonNullElse(petPutSecurityInfoSecurityIndex, PetPutSecurityInfo.SecurityIndex.SECURITY_0);
            this.petfindbystatusGetSecurityInfoSecurityIndex = Objects.requireNonNullElse(petfindbystatusGetSecurityInfoSecurityIndex, PetfindbystatusGetSecurityInfo.SecurityIndex.SECURITY_0);
            this.petfindbytagsGetSecurityInfoSecurityIndex = Objects.requireNonNullElse(petfindbytagsGetSecurityInfoSecurityIndex, PetfindbytagsGetSecurityInfo.SecurityIndex.SECURITY_0);
            this.petpetidDeleteSecurityInfoSecurityIndex = Objects.requireNonNullElse(petpetidDeleteSecurityInfoSecurityIndex, PetpetidDeleteSecurityInfo.SecurityIndex.SECURITY_0);
            this.petpetidGetSecurityInfoSecurityIndex = Objects.requireNonNullElse(petpetidGetSecurityInfoSecurityIndex, PetpetidGetSecurityInfo.SecurityIndex.SECURITY_0);
            this.petpetidPostSecurityInfoSecurityIndex = Objects.requireNonNullElse(petpetidPostSecurityInfoSecurityIndex, PetpetidPostSecurityInfo.SecurityIndex.SECURITY_0);
            this.petpetiduploadimagePostSecurityInfoSecurityIndex = Objects.requireNonNullElse(petpetiduploadimagePostSecurityInfoSecurityIndex, PetpetiduploadimagePostSecurityInfo.SecurityIndex.SECURITY_0);
            this.storeinventoryGetSecurityInfoSecurityIndex = Objects.requireNonNullElse(storeinventoryGetSecurityInfoSecurityIndex, StoreinventoryGetSecurityInfo.SecurityIndex.SECURITY_0);
        }
    }

    public static class SecurityIndexInfoBuilder {
        private FakeDeleteSecurityInfo. @Nullable SecurityIndex fakeDeleteSecurityInfoSecurityIndex;
        private FakePostSecurityInfo. @Nullable SecurityIndex fakePostSecurityInfoSecurityIndex;
        private FakeclassnametestPatchSecurityInfo. @Nullable SecurityIndex fakeclassnametestPatchSecurityInfoSecurityIndex;
        private FakemultiplesecuritiesGetSecurityInfo. @Nullable SecurityIndex fakemultiplesecuritiesGetSecurityInfoSecurityIndex;
        private FakepetiduploadimagewithrequiredfilePostSecurityInfo. @Nullable SecurityIndex fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex;
        private PetPostSecurityInfo. @Nullable SecurityIndex petPostSecurityInfoSecurityIndex;
        private PetPutSecurityInfo. @Nullable SecurityIndex petPutSecurityInfoSecurityIndex;
        private PetfindbystatusGetSecurityInfo. @Nullable SecurityIndex petfindbystatusGetSecurityInfoSecurityIndex;
        private PetfindbytagsGetSecurityInfo. @Nullable SecurityIndex petfindbytagsGetSecurityInfoSecurityIndex;
        private PetpetidDeleteSecurityInfo. @Nullable SecurityIndex petpetidDeleteSecurityInfoSecurityIndex;
        private PetpetidGetSecurityInfo. @Nullable SecurityIndex petpetidGetSecurityInfoSecurityIndex;
        private PetpetidPostSecurityInfo. @Nullable SecurityIndex petpetidPostSecurityInfoSecurityIndex;
        private PetpetiduploadimagePostSecurityInfo. @Nullable SecurityIndex petpetiduploadimagePostSecurityInfoSecurityIndex;
        private StoreinventoryGetSecurityInfo. @Nullable SecurityIndex storeinventoryGetSecurityInfoSecurityIndex;
        public SecurityIndexInfoBuilder() {}

        public SecurityIndexInfoBuilder fakeDeleteSecurityInfoSecurityIndex(FakeDeleteSecurityInfo.SecurityIndex securityIndex) {
            this.fakeDeleteSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder fakePostSecurityInfoSecurityIndex(FakePostSecurityInfo.SecurityIndex securityIndex) {
            this.fakePostSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder fakeclassnametestPatchSecurityInfoSecurityIndex(FakeclassnametestPatchSecurityInfo.SecurityIndex securityIndex) {
            this.fakeclassnametestPatchSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder fakemultiplesecuritiesGetSecurityInfoSecurityIndex(FakemultiplesecuritiesGetSecurityInfo.SecurityIndex securityIndex) {
            this.fakemultiplesecuritiesGetSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex(FakepetiduploadimagewithrequiredfilePostSecurityInfo.SecurityIndex securityIndex) {
            this.fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder petPostSecurityInfoSecurityIndex(PetPostSecurityInfo.SecurityIndex securityIndex) {
            this.petPostSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder petPutSecurityInfoSecurityIndex(PetPutSecurityInfo.SecurityIndex securityIndex) {
            this.petPutSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder petfindbystatusGetSecurityInfoSecurityIndex(PetfindbystatusGetSecurityInfo.SecurityIndex securityIndex) {
            this.petfindbystatusGetSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder petfindbytagsGetSecurityInfoSecurityIndex(PetfindbytagsGetSecurityInfo.SecurityIndex securityIndex) {
            this.petfindbytagsGetSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder petpetidDeleteSecurityInfoSecurityIndex(PetpetidDeleteSecurityInfo.SecurityIndex securityIndex) {
            this.petpetidDeleteSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder petpetidGetSecurityInfoSecurityIndex(PetpetidGetSecurityInfo.SecurityIndex securityIndex) {
            this.petpetidGetSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder petpetidPostSecurityInfoSecurityIndex(PetpetidPostSecurityInfo.SecurityIndex securityIndex) {
            this.petpetidPostSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder petpetiduploadimagePostSecurityInfoSecurityIndex(PetpetiduploadimagePostSecurityInfo.SecurityIndex securityIndex) {
            this.petpetiduploadimagePostSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfoBuilder storeinventoryGetSecurityInfoSecurityIndex(StoreinventoryGetSecurityInfo.SecurityIndex securityIndex) {
            this.storeinventoryGetSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo build() {
            return new SecurityIndexInfo(
                fakeDeleteSecurityInfoSecurityIndex,
                fakePostSecurityInfoSecurityIndex,
                fakeclassnametestPatchSecurityInfoSecurityIndex,
                fakemultiplesecuritiesGetSecurityInfoSecurityIndex,
                fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex,
                petPostSecurityInfoSecurityIndex,
                petPutSecurityInfoSecurityIndex,
                petfindbystatusGetSecurityInfoSecurityIndex,
                petfindbytagsGetSecurityInfoSecurityIndex,
                petpetidDeleteSecurityInfoSecurityIndex,
                petpetidGetSecurityInfoSecurityIndex,
                petpetidPostSecurityInfoSecurityIndex,
                petpetiduploadimagePostSecurityInfoSecurityIndex,
                storeinventoryGetSecurityInfoSecurityIndex
            );
        }
    }

    public SecurityRequirementObject getSecurityRequirementObject(FakeDeleteSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.fakeDeleteSecurityInfo;
        if (securityIndex == null) {
            FakeDeleteSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.fakeDeleteSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(FakePostSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.fakePostSecurityInfo;
        if (securityIndex == null) {
            FakePostSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.fakePostSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(FakeclassnametestPatchSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.fakeclassnametestPatchSecurityInfo;
        if (securityIndex == null) {
            FakeclassnametestPatchSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.fakeclassnametestPatchSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(FakemultiplesecuritiesGetSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.fakemultiplesecuritiesGetSecurityInfo;
        if (securityIndex == null) {
            FakemultiplesecuritiesGetSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.fakemultiplesecuritiesGetSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(FakepetiduploadimagewithrequiredfilePostSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.fakepetiduploadimagewithrequiredfilePostSecurityInfo;
        if (securityIndex == null) {
            FakepetiduploadimagewithrequiredfilePostSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetPostSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.petPostSecurityInfo;
        if (securityIndex == null) {
            PetPostSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.petPostSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetPutSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.petPutSecurityInfo;
        if (securityIndex == null) {
            PetPutSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.petPutSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetfindbystatusGetSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.petfindbystatusGetSecurityInfo;
        if (securityIndex == null) {
            PetfindbystatusGetSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.petfindbystatusGetSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetfindbytagsGetSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.petfindbytagsGetSecurityInfo;
        if (securityIndex == null) {
            PetfindbytagsGetSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.petfindbytagsGetSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetpetidDeleteSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.petpetidDeleteSecurityInfo;
        if (securityIndex == null) {
            PetpetidDeleteSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.petpetidDeleteSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetpetidGetSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.petpetidGetSecurityInfo;
        if (securityIndex == null) {
            PetpetidGetSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.petpetidGetSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetpetidPostSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.petpetidPostSecurityInfo;
        if (securityIndex == null) {
            PetpetidPostSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.petpetidPostSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetpetiduploadimagePostSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.petpetiduploadimagePostSecurityInfo;
        if (securityIndex == null) {
            PetpetiduploadimagePostSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.petpetiduploadimagePostSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(StoreinventoryGetSecurityInfo. @Nullable SecurityIndex securityIndex) {
        var securityInfoInstance = securityInfo.storeinventoryGetSecurityInfo;
        if (securityIndex == null) {
            StoreinventoryGetSecurityInfo.SecurityIndex configSecurityIndex = securityIndexInfo.storeinventoryGetSecurityInfoSecurityIndex;
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }

    public SecurityScheme getSecurityScheme(Class<? extends SecurityScheme> securitySchemeClass) {
        @Nullable SecurityScheme securityScheme = securitySchemeInfo.get(securitySchemeClass);
        if (securityScheme == null) {
            throw new RuntimeException("SecurityScheme of class " + securitySchemeClass + "cannot be returned because it is unset. Pass in an instance of it in securitySchemes when instantiating ApiConfiguration.");
        }
        return securityScheme;
    }

    public Map<String, List< String>> getDefaultHeaders() {
        return new HashMap<>();
    }

    public @Nullable Duration getTimeout() {
        return timeout;
    }
}