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
        public @Nullable RequestBody.SealedRequestBody requestBody;
        public @Nullable HeaderParameters.HeaderParameters1 headerParameters;
        public @Nullable QueryParameters.QueryParameters1 queryParameters;
        public @Nullable CookieParameters.CookieParameters1 cookieParameters;
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable PathParameters.PathParameters1 pathParameters;
    }
}
