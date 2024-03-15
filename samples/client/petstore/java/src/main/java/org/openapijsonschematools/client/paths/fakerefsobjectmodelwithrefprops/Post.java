package org.openapijsonschematools.client.paths.fakerefsobjectmodelwithrefprops;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakerefsobjectmodelwithrefprops.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakerefsobjectmodelwithrefprops.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RequestBody.SealedRequestBody requestBody;
        public @Nullable RootServerInfo.ServerIndex serverIndex;
    }

    public static class PostRequestBuilder {
        private final PostCallData instance;

        public PostRequestBuilder() {
            this.instance = new PostCallData();
        }
    }
}
