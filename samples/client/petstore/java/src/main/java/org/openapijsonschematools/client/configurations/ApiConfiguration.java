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
    private final @Nullable Duration timeout;
    private final Map<Class<? extends SecurityScheme>, SecurityScheme> securitySchemeInfo;

    public ApiConfiguration() {
        serverInfo = new ServerInfo();
        securityInfo = new SecurityInfo(
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );
        securitySchemeInfo = new HashMap<>();
        timeout = null;
    }

    public ApiConfiguration(ServerInfo serverInfo, SecurityInfo securityInfo, List<SecurityScheme> securitySchemes, Duration timeout) {
        this.serverInfo = serverInfo;
        this.securityInfo = securityInfo;
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
        protected final @Nullable FakeDeleteSecurityInfo.FakeDeleteSecurityInfo1 fakeDeleteSecurityInfo;
        protected final @Nullable FakePostSecurityInfo.FakePostSecurityInfo1 fakePostSecurityInfo;
        protected final @Nullable FakemultiplesecuritiesGetSecurityInfo.FakemultiplesecuritiesGetSecurityInfo1 fakemultiplesecuritiesGetSecurityInfo;
        protected final @Nullable FakepetiduploadimagewithrequiredfilePostSecurityInfo.FakepetiduploadimagewithrequiredfilePostSecurityInfo1 fakepetiduploadimagewithrequiredfilePostSecurityInfo;
        protected final @Nullable FakeclassnametestPatchSecurityInfo.FakeclassnametestPatchSecurityInfo1 fakeclassnametestPatchSecurityInfo;
        protected final @Nullable PetPostSecurityInfo.PetPostSecurityInfo1 petPostSecurityInfo;
        protected final @Nullable PetPutSecurityInfo.PetPutSecurityInfo1 petPutSecurityInfo;
        protected final @Nullable PetfindbystatusGetSecurityInfo.PetfindbystatusGetSecurityInfo1 petfindbystatusGetSecurityInfo;
        protected final @Nullable PetfindbytagsGetSecurityInfo.PetfindbytagsGetSecurityInfo1 petfindbytagsGetSecurityInfo;
        protected final @Nullable PetpetidDeleteSecurityInfo.PetpetidDeleteSecurityInfo1 petpetidDeleteSecurityInfo;
        protected final @Nullable PetpetidGetSecurityInfo.PetpetidGetSecurityInfo1 petpetidGetSecurityInfo;
        protected final @Nullable PetpetidPostSecurityInfo.PetpetidPostSecurityInfo1 petpetidPostSecurityInfo;
        protected final @Nullable PetpetiduploadimagePostSecurityInfo.PetpetiduploadimagePostSecurityInfo1 petpetiduploadimagePostSecurityInfo;
        protected final @Nullable StoreinventoryGetSecurityInfo.StoreinventoryGetSecurityInfo1 storeinventoryGetSecurityInfo;

        public SecurityInfo(
            @Nullable FakeDeleteSecurityInfo.FakeDeleteSecurityInfo1 fakeDeleteSecurityInfo,
            @Nullable FakePostSecurityInfo.FakePostSecurityInfo1 fakePostSecurityInfo,
            @Nullable FakemultiplesecuritiesGetSecurityInfo.FakemultiplesecuritiesGetSecurityInfo1 fakemultiplesecuritiesGetSecurityInfo,
            @Nullable FakepetiduploadimagewithrequiredfilePostSecurityInfo.FakepetiduploadimagewithrequiredfilePostSecurityInfo1 fakepetiduploadimagewithrequiredfilePostSecurityInfo,
            @Nullable FakeclassnametestPatchSecurityInfo.FakeclassnametestPatchSecurityInfo1 fakeclassnametestPatchSecurityInfo,
            @Nullable PetPostSecurityInfo.PetPostSecurityInfo1 petPostSecurityInfo,
            @Nullable PetPutSecurityInfo.PetPutSecurityInfo1 petPutSecurityInfo,
            @Nullable PetfindbystatusGetSecurityInfo.PetfindbystatusGetSecurityInfo1 petfindbystatusGetSecurityInfo,
            @Nullable PetfindbytagsGetSecurityInfo.PetfindbytagsGetSecurityInfo1 petfindbytagsGetSecurityInfo,
            @Nullable PetpetidDeleteSecurityInfo.PetpetidDeleteSecurityInfo1 petpetidDeleteSecurityInfo,
            @Nullable PetpetidGetSecurityInfo.PetpetidGetSecurityInfo1 petpetidGetSecurityInfo,
            @Nullable PetpetidPostSecurityInfo.PetpetidPostSecurityInfo1 petpetidPostSecurityInfo,
            @Nullable PetpetiduploadimagePostSecurityInfo.PetpetiduploadimagePostSecurityInfo1 petpetiduploadimagePostSecurityInfo,
            @Nullable StoreinventoryGetSecurityInfo.StoreinventoryGetSecurityInfo1 storeinventoryGetSecurityInfo
        ) {
            this.fakeDeleteSecurityInfo = fakeDeleteSecurityInfo;
            this.fakePostSecurityInfo = fakePostSecurityInfo;
            this.fakemultiplesecuritiesGetSecurityInfo = fakemultiplesecuritiesGetSecurityInfo;
            this.fakepetiduploadimagewithrequiredfilePostSecurityInfo = fakepetiduploadimagewithrequiredfilePostSecurityInfo;
            this.fakeclassnametestPatchSecurityInfo = fakeclassnametestPatchSecurityInfo;
            this.petPostSecurityInfo = petPostSecurityInfo;
            this.petPutSecurityInfo = petPutSecurityInfo;
            this.petfindbystatusGetSecurityInfo = petfindbystatusGetSecurityInfo;
            this.petfindbytagsGetSecurityInfo = petfindbytagsGetSecurityInfo;
            this.petpetidDeleteSecurityInfo = petpetidDeleteSecurityInfo;
            this.petpetidGetSecurityInfo = petpetidGetSecurityInfo;
            this.petpetidPostSecurityInfo = petpetidPostSecurityInfo;
            this.petpetiduploadimagePostSecurityInfo = petpetiduploadimagePostSecurityInfo;
            this.storeinventoryGetSecurityInfo = storeinventoryGetSecurityInfo;
        }
    }

    public SecurityRequirementObject getSecurityRequirementObject(FakeDeleteSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.fakeDeleteSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the FakeDeleteSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(FakePostSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.fakePostSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the FakePostSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(FakemultiplesecuritiesGetSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.fakemultiplesecuritiesGetSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the FakemultiplesecuritiesGetSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(FakepetiduploadimagewithrequiredfilePostSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.fakepetiduploadimagewithrequiredfilePostSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the FakepetiduploadimagewithrequiredfilePostSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(FakeclassnametestPatchSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.fakeclassnametestPatchSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the FakeclassnametestPatchSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetPostSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petPostSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the PetPostSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetPutSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petPutSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the PetPutSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetfindbystatusGetSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petfindbystatusGetSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the PetfindbystatusGetSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetfindbytagsGetSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petfindbytagsGetSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the PetfindbytagsGetSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetpetidDeleteSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petpetidDeleteSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the PetpetidDeleteSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetpetidGetSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petpetidGetSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the PetpetidGetSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetpetidPostSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petpetidPostSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the PetpetidPostSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(PetpetiduploadimagePostSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.petpetiduploadimagePostSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the PetpetiduploadimagePostSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
        }
        return securityInfoInstance.getSecurityRequirementObject(securityIndex);
    }
    public SecurityRequirementObject getSecurityRequirementObject(StoreinventoryGetSecurityInfo. @Nullable SecurityIndex securityIndex) throws UnsetPropertyException {
        var securityInfoInstance = securityInfo.storeinventoryGetSecurityInfo;
        if (securityInfoInstance == null) {
            throw new UnsetPropertyException("SecurityRequirementObject cannot be returned because the StoreinventoryGetSecurityInfo is unset in the SecurityInfo class. Pass it in when instantiating SecurityInfo to fix this.");
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