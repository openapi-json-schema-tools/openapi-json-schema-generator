package org.openapijsonschematools.client.paths.commonparamsubdir;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.commonparamsubdir.post.HeaderParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.commonparamsubdir.post.PathParameters;
import org.openapijsonschematools.client.paths.commonparamsubdir.post.Parameters;
import org.openapijsonschematools.client.paths.commonparamsubdir.post.Responses;

public class Post {
    public static class PostCallData {
        public HeaderParameters.@Nullable HeaderParameters1 headerParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PathParameters.@Nullable PathParameters1 pathParameters;
    }

    public interface SetterForHeaderParameters <T> {
        PostCallData getInstance();
        T getBuilderAfterHeaderParameters(PostCallData instance);
        default T headerParameters(HeaderParameters.HeaderParameters1 headerParameters) {
            var instance = getInstance();
            instance.headerParameters = headerParameters;
            return getBuilderAfterHeaderParameters(instance);
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
