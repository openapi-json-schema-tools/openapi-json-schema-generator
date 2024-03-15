package org.openapijsonschematools.client.paths.fakerefsstring;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakerefsstring.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakerefsstring.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RequestBody.SealedRequestBody requestBody;
        public @Nullable RootServerInfo.ServerIndex serverIndex;
    }
}
