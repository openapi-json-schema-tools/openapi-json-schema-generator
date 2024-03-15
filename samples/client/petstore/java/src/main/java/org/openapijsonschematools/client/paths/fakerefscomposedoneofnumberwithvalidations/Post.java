package org.openapijsonschematools.client.paths.fakerefscomposedoneofnumberwithvalidations;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakerefscomposedoneofnumberwithvalidations.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakerefscomposedoneofnumberwithvalidations.post.Responses;

public class Post {

    public static class PostRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
    }

    public interface SetterForRequestBody <T> {
        PostRequest getInstance();
        T getBuilderAfterRequestBody(PostRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        PostRequest getInstance();
        T getBuilderAfterServerIndex(PostRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public static class PostRequestBuilder {
        private final PostRequest instance;

        public PostRequestBuilder() {
            this.instance = new PostRequest();
        }

        public PostRequest build() {
            return instance;
        }
    }
}
