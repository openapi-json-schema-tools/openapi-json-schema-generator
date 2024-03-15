package org.openapijsonschematools.client.paths.pet;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.pet.post.PetPostSecurityInfo;
import org.openapijsonschematools.client.paths.pet.post.RequestBody;
import org.openapijsonschematools.client.paths.pet.post.Responses;

public class Post {
    public static class PostCallData {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetPostSecurityInfo.@Nullable SecurityIndex securityIndex;
        public RequestBody.@Nullable SealedRequestBody requestBody;
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
        default T securityIndex(PetPostSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
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
