package org.openapijsonschematools.client.paths.petpetiduploadimage;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostSecurityInfo;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PathParameters;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.Parameters;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.Responses;

public class Post {
    public static class PostCallData {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetpetiduploadimagePostSecurityInfo.@Nullable SecurityIndex securityIndex;
        public PathParameters.@Nullable PathParameters1 pathParameters;
    }

    public interface SetterForRequestBody <T> {
        PostCallData getInstance();
        T getBuilderAfterRequestBody(PostCallData instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        PostCallData getInstance();
        T getBuilderAfterServerIndex(PostCallData instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        PostCallData getInstance();
        T getBuilderAfterSecurityIndex(PostCallData instance);
        default T securityIndex(PetpetiduploadimagePostSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        PostCallData getInstance();
        T getBuilderAfterPathParameters(PostCallData instance);
        default T pathParameters(PathParameters.PathParameters1 pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
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
