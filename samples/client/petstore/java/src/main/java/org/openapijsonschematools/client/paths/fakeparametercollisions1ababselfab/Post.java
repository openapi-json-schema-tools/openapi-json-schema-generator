package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.RequestBody;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.HeaderParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.QueryParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.CookieParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.PathParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Parameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Responses;

public class Post {
    public static class PostCallData {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public HeaderParameters.@Nullable HeaderParameters1 headerParameters;
        public QueryParameters.@Nullable QueryParameters1 queryParameters;
        public CookieParameters.@Nullable CookieParameters1 cookieParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
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

    public interface SetterForHeaderParameters <T> {
        PostCallData getInstance();
        T getBuilderAfterHeaderParameters(PostCallData instance);
        default T headerParameters(HeaderParameters.HeaderParameters1 headerParameters) {
            var instance = getInstance();
            instance.headerParameters = headerParameters;
            return getBuilderAfterHeaderParameters(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        PostCallData getInstance();
        T getBuilderAfterQueryParameters(PostCallData instance);
        default T queryParameters(QueryParameters.QueryParameters1 queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public interface SetterForCookieParameters <T> {
        PostCallData getInstance();
        T getBuilderAfterCookieParameters(PostCallData instance);
        default T cookieParameters(CookieParameters.CookieParameters1 cookieParameters) {
            var instance = getInstance();
            instance.cookieParameters = cookieParameters;
            return getBuilderAfterCookieParameters(instance);
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
