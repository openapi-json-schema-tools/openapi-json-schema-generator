package org.openapijsonschematools.client.paths.fake;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fake.patch.RequestBody;
import org.openapijsonschematools.client.paths.fake.patch.Responses;

public class Patch {
    public static class PatchCallData {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public RequestBody.@Nullable SealedRequestBody requestBody;
    }

    public interface SetterForServerIndex <T> {
        PatchCallData getInstance();
        T getBuilderAfterServerIndex(PatchCallData instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        PatchCallData getInstance();
        T getBuilderAfterRequestBody(PatchCallData instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
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
