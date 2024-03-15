package org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostSecurityInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.PathParameters;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.Parameters;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.Responses;

public class Post {

    public static class PostRequest {
        public PathParameters.PathParametersMap pathParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakepetiduploadimagewithrequiredfilePostSecurityInfo.@Nullable SecurityIndex securityIndex;

        public PostRequest(
            PathParameters.PathParametersMap pathParameters,
            RequestBody.@Nullable SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            FakepetiduploadimagewithrequiredfilePostSecurityInfo.@Nullable SecurityIndex securityIndex
        ) {
            this.pathParameters = pathParameters;
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
        }
    }

    public static class PostNullableRequest {
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakepetiduploadimagewithrequiredfilePostSecurityInfo.@Nullable SecurityIndex securityIndex;
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

    public interface SetterForServerIndex <T> {
        PostNullableRequest getInstance();
        T getBuilderAfterServerIndex(PostNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        PostNullableRequest getInstance();
        T getBuilderAfterSecurityIndex(PostNullableRequest instance);
        default T securityIndex(FakepetiduploadimagewithrequiredfilePostSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        PostNullableRequest getInstance();
        T getBuilderAfterPathParameters(PostNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Post0RequestBuilder implements SetterForRequestBody<Post0RequestBuilder>, SetterForServerIndex<Post0RequestBuilder>, SetterForSecurityIndex<Post0RequestBuilder> {
        private final PostNullableRequest instance;

        public Post0RequestBuilder(PostNullableRequest instance) {
            this.instance = instance;
        }

        public PostRequest build() {
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new PostRequest(
                pathParameters,
                instance.requestBody,
                instance.serverIndex,
                instance.securityIndex
            );
        }

        public PostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterRequestBody(PostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterServerIndex(PostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterSecurityIndex(PostNullableRequest instance) {
            return this;
        }
    }
    public static class PostRequestBuilder implements SetterForPathParameters<Post0RequestBuilder> {
        private final PostNullableRequest instance;

        public PostRequestBuilder() {
            this.instance = new PostNullableRequest();
        }

        public PostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterPathParameters(PostNullableRequest instance) {
            return new Post0RequestBuilder(instance);
        }
    }
}
