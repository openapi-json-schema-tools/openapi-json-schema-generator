package org.openapijsonschematools.client.paths.fakeinlineadditionalproperties;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeinlineadditionalproperties.post.RequestBody;
import org.openapijsonschematools.client.paths.fakeinlineadditionalproperties.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable RequestBody.SealedRequestBody requestBody;
    }

    public static class Post0RequestBuilder {
        private final PostCallData instance;

        public Post0RequestBuilderPostCallData instance) {
            this.instance = instance;
        }
    }
    public static class PostRequestBuilder {
        private final PostCallData instance;

        public PostRequestBuilder() {
            this.instance = new PostCallData();
        }
    }
}
