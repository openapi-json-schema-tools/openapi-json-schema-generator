package org.openapijsonschematools.client.paths.fakejsonwithcharset;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakejsonwithcharset.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakejsonwithcharset.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RequestBody.SealedRequestBody ;
        public @Nullable RootServerInfo.ServerIndex rootServerInfo;
    }
}
