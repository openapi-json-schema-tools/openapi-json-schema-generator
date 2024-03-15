package org.openapijsonschematools.client.paths.fakeuploaddownloadfile;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeuploaddownloadfile.post.RequestBody;
import org.openapijsonschematools.client.paths.fakeuploaddownloadfile.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable RequestBody.SealedRequestBody requestBody;
    }
}
