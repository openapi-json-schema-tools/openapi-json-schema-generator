package org.openapijsonschematools.client.paths.anotherfakedummy;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.anotherfakedummy.patch.RequestBody;
import org.openapijsonschematools.client.paths.anotherfakedummy.patch.Responses;

public class Patch {
    public static class PatchCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable RequestBody.SealedRequestBody requestBody;
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
