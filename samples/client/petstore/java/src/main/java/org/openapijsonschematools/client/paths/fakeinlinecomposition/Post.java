package org.openapijsonschematools.client.paths.fakeinlinecomposition;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.RequestBody;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.QueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.Parameters;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RequestBody.SealedRequestBody requestBody;
        public @Nullable QueryParameters.QueryParameters1 queryParameters;
        public @Nullable RootServerInfo.ServerIndex serverIndex;
    }
}
