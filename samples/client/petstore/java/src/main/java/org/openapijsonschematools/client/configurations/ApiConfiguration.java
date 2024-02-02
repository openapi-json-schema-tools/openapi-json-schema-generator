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
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Objects;

public class ApiConfiguration {
    private final ServerInfo serverInfo;
    private final SecurityInfo securityInfo;

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
    }

    public ApiConfiguration(ServerInfo serverInfo, SecurityInfo securityInfo) {
        this.serverInfo = serverInfo;
        this.securityInfo = securityInfo;
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
        protected final @Nullable FakeDeleteSecurityInfo fakeDeleteSecurityInfo;
        protected final @Nullable FakePostSecurityInfo fakePostSecurityInfo;
        protected final @Nullable FakemultiplesecuritiesGetSecurityInfo fakemultiplesecuritiesGetSecurityInfo;
        protected final @Nullable FakepetiduploadimagewithrequiredfilePostSecurityInfo fakepetiduploadimagewithrequiredfilePostSecurityInfo;
        protected final @Nullable FakeclassnametestPatchSecurityInfo fakeclassnametestPatchSecurityInfo;
        protected final @Nullable PetPostSecurityInfo petPostSecurityInfo;
        protected final @Nullable PetPutSecurityInfo petPutSecurityInfo;
        protected final @Nullable PetfindbystatusGetSecurityInfo petfindbystatusGetSecurityInfo;
        protected final @Nullable PetfindbytagsGetSecurityInfo petfindbytagsGetSecurityInfo;
        protected final @Nullable PetpetidDeleteSecurityInfo petpetidDeleteSecurityInfo;
        protected final @Nullable PetpetidGetSecurityInfo petpetidGetSecurityInfo;
        protected final @Nullable PetpetidPostSecurityInfo petpetidPostSecurityInfo;
        protected final @Nullable PetpetiduploadimagePostSecurityInfo petpetiduploadimagePostSecurityInfo;
        protected final @Nullable StoreinventoryGetSecurityInfo storeinventoryGetSecurityInfo;

        public SecurityInfo(
            @Nullable FakeDeleteSecurityInfo fakeDeleteSecurityInfo,
            @Nullable FakePostSecurityInfo fakePostSecurityInfo,
            @Nullable FakemultiplesecuritiesGetSecurityInfo fakemultiplesecuritiesGetSecurityInfo,
            @Nullable FakepetiduploadimagewithrequiredfilePostSecurityInfo fakepetiduploadimagewithrequiredfilePostSecurityInfo,
            @Nullable FakeclassnametestPatchSecurityInfo fakeclassnametestPatchSecurityInfo,
            @Nullable PetPostSecurityInfo petPostSecurityInfo,
            @Nullable PetPutSecurityInfo petPutSecurityInfo,
            @Nullable PetfindbystatusGetSecurityInfo petfindbystatusGetSecurityInfo,
            @Nullable PetfindbytagsGetSecurityInfo petfindbytagsGetSecurityInfo,
            @Nullable PetpetidDeleteSecurityInfo petpetidDeleteSecurityInfo,
            @Nullable PetpetidGetSecurityInfo petpetidGetSecurityInfo,
            @Nullable PetpetidPostSecurityInfo petpetidPostSecurityInfo,
            @Nullable PetpetiduploadimagePostSecurityInfo petpetiduploadimagePostSecurityInfo,
            @Nullable StoreinventoryGetSecurityInfo storeinventoryGetSecurityInfo
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
}