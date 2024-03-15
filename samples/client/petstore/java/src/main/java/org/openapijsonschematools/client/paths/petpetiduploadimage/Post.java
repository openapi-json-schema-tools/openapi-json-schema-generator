package org.openapijsonschematools.client.paths.petpetiduploadimage;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostSecurityInfo;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PathParameters;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.Parameters;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.Responses;

public class Post {

    public static class PostRequest {
        public PathParameters.PathParametersMap pathParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetpetiduploadimagePostSecurityInfo.@Nullable SecurityIndex securityIndex;

        public PostRequest(
            PathParameters.PathParametersMap pathParameters,
            RequestBody.@Nullable SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            PetpetiduploadimagePostSecurityInfo.@Nullable SecurityIndex securityIndex
        ) {
            this.pathParameters = pathParameters;
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
        }
    }

    public static class PostNullableRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetpetiduploadimagePostSecurityInfo.@Nullable SecurityIndex securityIndex;
        public PathParameters.@Nullable PathParametersMap pathParameters;
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
        default T securityIndex(PetpetiduploadimagePostSecurityInfo.SecurityIndex securityIndex) {
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
