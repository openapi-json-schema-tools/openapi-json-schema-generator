package org.openapijsonschematools.client.paths.fakeinlinecomposition;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.RequestBody;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.QueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.Parameters;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.Responses;

public class Post {
    public static class PostCallData {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public QueryParameters.@Nullable QueryParameters1 queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
    }

    public interface SetterForRequestBody <T> {
        PostCallData getInstance();
        T getBuilderAfterRequestBody(PostCallData instance);
        default T requestBody(SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        PostCallData getInstance();
        T getBuilderAfterQueryParameters(PostCallData instance);
        default T queryParameters(QueryParameters1 queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        PostCallData getInstance();
        T getBuilderAfterServerIndex(PostCallData instance);
        default T serverIndex(ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public static class PostRequestBuilder {
        private final PostCallData instance;

        public PostRequestBuilder() {
            this.instance = new PostCallData();
        }
    }
}
