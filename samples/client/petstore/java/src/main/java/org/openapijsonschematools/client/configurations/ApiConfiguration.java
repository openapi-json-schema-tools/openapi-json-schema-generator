package org.openapijsonschematools.client.configurations;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.servers.Server;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.foo.get.FooGetServerInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.PetfindbystatusServerInfo;
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.fake.post.FakePostSecurityInfo;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.FakemultiplesecuritiesGetSecurityInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostSecurityInfo;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.FakeclassnametestPatchSecurityInfo;
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
    private final SecurityInfo securityInfo;
    private final SecurityIndexInfo securityIndexInfo;
    private final @Nullable Duration timeout;
    private final Map<Class<? extends SecurityScheme>, SecurityScheme> securitySchemeInfo;

    public ApiConfiguration() {
        serverInfo = new ServerInfo();
        securityInfo = new SecurityInfo();
        securityIndexInfo = new SecurityIndexInfo();
        securitySchemeInfo = new HashMap<>();
        timeout = null;
    }

    public ApiConfiguration(ServerInfo serverInfo, SecurityIndexInfo securityIndexInfo, List<SecurityScheme> securitySchemes, Duration timeout) {
        this.serverInfo = serverInfo;
        this.securityInfo = new SecurityInfo();
        this.securityIndexInfo = securityIndexInfo;
        securitySchemeInfo = new HashMap<>();
        for (SecurityScheme securityScheme: securitySchemes) {
            securitySchemeInfo.put(securityScheme.getClass(), securityScheme);
        }
        this.timeout = timeout;
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

    public static class SecurityInfo {
        protected final FakeDeleteSecurityInfo.FakeDeleteSecurityInfo1 fakeDeleteSecurityInfo;
        protected final FakePostSecurityInfo.FakePostSecurityInfo1 fakePostSecurityInfo;
        protected final FakemultiplesecuritiesGetSecurityInfo.FakemultiplesecuritiesGetSecurityInfo1 fakemultiplesecuritiesGetSecurityInfo;
        protected final FakepetiduploadimagewithrequiredfilePostSecurityInfo.FakepetiduploadimagewithrequiredfilePostSecurityInfo1 fakepetiduploadimagewithrequiredfilePostSecurityInfo;
        protected final FakeclassnametestPatchSecurityInfo.FakeclassnametestPatchSecurityInfo1 fakeclassnametestPatchSecurityInfo;
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
            this.fakemultiplesecuritiesGetSecurityInfo = new FakemultiplesecuritiesGetSecurityInfo.FakemultiplesecuritiesGetSecurityInfo1();
            this.fakepetiduploadimagewithrequiredfilePostSecurityInfo = new FakepetiduploadimagewithrequiredfilePostSecurityInfo.FakepetiduploadimagewithrequiredfilePostSecurityInfo1();
            this.fakeclassnametestPatchSecurityInfo = new FakeclassnametestPatchSecurityInfo.FakeclassnametestPatchSecurityInfo1();
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
        protected FakeDeleteSecurityInfo. @Nullable SecurityIndex fakeDeleteSecurityInfoSecurityIndex;
        protected FakePostSecurityInfo. @Nullable SecurityIndex fakePostSecurityInfoSecurityIndex;
        protected FakemultiplesecuritiesGetSecurityInfo. @Nullable SecurityIndex fakemultiplesecuritiesGetSecurityInfoSecurityIndex;
        protected FakepetiduploadimagewithrequiredfilePostSecurityInfo. @Nullable SecurityIndex fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex;
        protected FakeclassnametestPatchSecurityInfo. @Nullable SecurityIndex fakeclassnametestPatchSecurityInfoSecurityIndex;
        protected PetPostSecurityInfo. @Nullable SecurityIndex petPostSecurityInfoSecurityIndex;
        protected PetPutSecurityInfo. @Nullable SecurityIndex petPutSecurityInfoSecurityIndex;
        protected PetfindbystatusGetSecurityInfo. @Nullable SecurityIndex petfindbystatusGetSecurityInfoSecurityIndex;
        protected PetfindbytagsGetSecurityInfo. @Nullable SecurityIndex petfindbytagsGetSecurityInfoSecurityIndex;
        protected PetpetidDeleteSecurityInfo. @Nullable SecurityIndex petpetidDeleteSecurityInfoSecurityIndex;
        protected PetpetidGetSecurityInfo. @Nullable SecurityIndex petpetidGetSecurityInfoSecurityIndex;
        protected PetpetidPostSecurityInfo. @Nullable SecurityIndex petpetidPostSecurityInfoSecurityIndex;
        protected PetpetiduploadimagePostSecurityInfo. @Nullable SecurityIndex petpetiduploadimagePostSecurityInfoSecurityIndex;
        protected StoreinventoryGetSecurityInfo. @Nullable SecurityIndex storeinventoryGetSecurityInfoSecurityIndex;

        public SecurityIndexInfo() {}

        public SecurityIndexInfo fakeDeleteSecurityInfoSecurityIndex(FakeDeleteSecurityInfo.SecurityIndex securityIndex) {
            this.fakeDeleteSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo fakePostSecurityInfoSecurityIndex(FakePostSecurityInfo.SecurityIndex securityIndex) {
            this.fakePostSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo fakemultiplesecuritiesGetSecurityInfoSecurityIndex(FakemultiplesecuritiesGetSecurityInfo.SecurityIndex securityIndex) {
            this.fakemultiplesecuritiesGetSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex(FakepetiduploadimagewithrequiredfilePostSecurityInfo.SecurityIndex securityIndex) {
            this.fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo fakeclassnametestPatchSecurityInfoSecurityIndex(FakeclassnametestPatchSecurityInfo.SecurityIndex securityIndex) {
            this.fakeclassnametestPatchSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo petPostSecurityInfoSecurityIndex(PetPostSecurityInfo.SecurityIndex securityIndex) {
            this.petPostSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo petPutSecurityInfoSecurityIndex(PetPutSecurityInfo.SecurityIndex securityIndex) {
            this.petPutSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo petfindbystatusGetSecurityInfoSecurityIndex(PetfindbystatusGetSecurityInfo.SecurityIndex securityIndex) {
            this.petfindbystatusGetSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo petfindbytagsGetSecurityInfoSecurityIndex(PetfindbytagsGetSecurityInfo.SecurityIndex securityIndex) {
            this.petfindbytagsGetSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo petpetidDeleteSecurityInfoSecurityIndex(PetpetidDeleteSecurityInfo.SecurityIndex securityIndex) {
            this.petpetidDeleteSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo petpetidGetSecurityInfoSecurityIndex(PetpetidGetSecurityInfo.SecurityIndex securityIndex) {
            this.petpetidGetSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo petpetidPostSecurityInfoSecurityIndex(PetpetidPostSecurityInfo.SecurityIndex securityIndex) {
            this.petpetidPostSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo petpetiduploadimagePostSecurityInfoSecurityIndex(PetpetiduploadimagePostSecurityInfo.SecurityIndex securityIndex) {
            this.petpetiduploadimagePostSecurityInfoSecurityIndex = securityIndex;
            return this;
        }

        public SecurityIndexInfo storeinventoryGetSecurityInfoSecurityIndex(StoreinventoryGetSecurityInfo.SecurityIndex securityIndex) {
            this.storeinventoryGetSecurityInfoSecurityIndex = securityIndex;
            return this;
        }
    }

    public SecurityRequirementObject getSecurityRequirementObject(FakeDeleteSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.fakeDeleteSecurityInfo;
        if (securityIndex == null) {
            FakeDeleteSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.fakeDeleteSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("fakeDeleteSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(FakePostSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.fakePostSecurityInfo;
        if (securityIndex == null) {
            FakePostSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.fakePostSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("fakePostSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(FakemultiplesecuritiesGetSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.fakemultiplesecuritiesGetSecurityInfo;
        if (securityIndex == null) {
            FakemultiplesecuritiesGetSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.fakemultiplesecuritiesGetSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("fakemultiplesecuritiesGetSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(FakepetiduploadimagewithrequiredfilePostSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.fakepetiduploadimagewithrequiredfilePostSecurityInfo;
        if (securityIndex == null) {
            FakepetiduploadimagewithrequiredfilePostSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("fakepetiduploadimagewithrequiredfilePostSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(FakeclassnametestPatchSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.fakeclassnametestPatchSecurityInfo;
        if (securityIndex == null) {
            FakeclassnametestPatchSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.fakeclassnametestPatchSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("fakeclassnametestPatchSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetPostSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petPostSecurityInfo;
        if (securityIndex == null) {
            PetPostSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.petPostSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("petPostSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetPutSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petPutSecurityInfo;
        if (securityIndex == null) {
            PetPutSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.petPutSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("petPutSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetfindbystatusGetSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petfindbystatusGetSecurityInfo;
        if (securityIndex == null) {
            PetfindbystatusGetSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.petfindbystatusGetSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("petfindbystatusGetSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetfindbytagsGetSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petfindbytagsGetSecurityInfo;
        if (securityIndex == null) {
            PetfindbytagsGetSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.petfindbytagsGetSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("petfindbytagsGetSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetpetidDeleteSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petpetidDeleteSecurityInfo;
        if (securityIndex == null) {
            PetpetidDeleteSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.petpetidDeleteSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("petpetidDeleteSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetpetidGetSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petpetidGetSecurityInfo;
        if (securityIndex == null) {
            PetpetidGetSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.petpetidGetSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("petpetidGetSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetpetidPostSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petpetidPostSecurityInfo;
        if (securityIndex == null) {
            PetpetidPostSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.petpetidPostSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("petpetidPostSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetpetiduploadimagePostSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petpetiduploadimagePostSecurityInfo;
        if (securityIndex == null) {
            PetpetiduploadimagePostSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.petpetiduploadimagePostSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("petpetiduploadimagePostSecurityInfoSecurityIndex is unset");
            }
            return securityInfoInstance.getSecurityRequirementObject(configSecurityIndex);
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(StoreinventoryGetSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.storeinventoryGetSecurityInfo;
        if (securityIndex == null) {
            StoreinventoryGetSecurityInfo. @Nullable SecurityIndex configSecurityIndex = securityIndexInfo.storeinventoryGetSecurityInfoSecurityIndex;
            if (configSecurityIndex == null) {
                throw new UnsetPropertyException("storeinventoryGetSecurityInfoSecurityIndex is unset");
            }
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

    public@Nullable Duration getTimeout() {
        return timeout;
    }
}