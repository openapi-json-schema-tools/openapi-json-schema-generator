package org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostSecurityInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.PathParameters;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.Parameters;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RequestBody.SealedRequestBody requestBody;
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable FakepetiduploadimagewithrequiredfilePostSecurityInfo.SecurityIndex securityIndex;
        public @Nullable PathParameters.PathParameters1 pathParameters;
    }
}
