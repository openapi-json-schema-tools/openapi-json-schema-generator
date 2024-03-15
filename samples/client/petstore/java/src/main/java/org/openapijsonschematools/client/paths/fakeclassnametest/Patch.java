package org.openapijsonschematools.client.paths.fakeclassnametest;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.FakeclassnametestPatchSecurityInfo;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.RequestBody;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.Responses;

public class Patch {
    public static class PatchCallData {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakeclassnametestPatchSecurityInfo.@Nullable SecurityIndex securityIndex;
        public RequestBody.@Nullable SealedRequestBody requestBody;
    }

    public interface SetterForServerIndex <T> {
        PatchCallData getInstance();
        T getBuilderAfterServerIndex(PatchCallData instance);
        default T serverIndex(ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        PatchCallData getInstance();
        T getBuilderAfterSecurityIndex(PatchCallData instance);
        default T securityIndex(SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        PatchCallData getInstance();
        T getBuilderAfterRequestBody(PatchCallData instance);
        default T requestBody(SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Patch0RequestBuilder {
        private final PatchCallData instance;

        public Patch0RequestBuilderPatchCallData instance) {
            this.instance = instance;
        }
    }
    public static class PatchRequestBuilder {
        private final PatchCallData instance;

        public PatchRequestBuilder() {
            this.instance = new PatchCallData();
        }
    }
}
