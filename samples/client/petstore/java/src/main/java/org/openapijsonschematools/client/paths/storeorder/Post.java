package org.openapijsonschematools.client.paths.storeorder;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.storeorder.post.RequestBody;
import org.openapijsonschematools.client.paths.storeorder.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RootServerInfo.ServerIndex rootServerInfo;
        public @Nullable RequestBody.SealedRequestBody ;
    }
}
