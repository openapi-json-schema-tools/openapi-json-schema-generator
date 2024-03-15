package org.openapijsonschematools.client.paths.storeorder;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.storeorder.post.RequestBody;
import org.openapijsonschematools.client.paths.storeorder.post.Responses;

public class Post {

    public static class PostRequest {
        public RequestBody.SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;

        public PostRequest(
            RequestBody.SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex
        ) {
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
        }
    }

    public static class PostNullableRequest {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public RequestBody.@Nullable SealedRequestBody requestBody;
    }

    public interface SetterForServerIndex <T> {
        PostNullableRequest getInstance();
        T getBuilderAfterServerIndex(PostNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        PostNullableRequest getInstance();
        T getBuilderAfterRequestBody(PostNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Post0RequestBuilder {
        private final PostNullableRequest instance;

        public Post0RequestBuilder(PostNullableRequest instance) {
            this.instance = instance;
        }

        public PostRequest build() {
            // todo casting code here
        }
    }
    public static class PostRequestBuilder {
        private final PostNullableRequest instance;

        public PostRequestBuilder() {
            this.instance = new PostNullableRequest();
        }
    }
}
