package org.openapijsonschematools.client.paths.petpetiduploadimage;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostSecurityInfo;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PathParameters;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.Parameters;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RequestBody.SealedRequestBody requestBody;
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable PetpetiduploadimagePostSecurityInfo.SecurityIndex securityIndex;
        public @Nullable PathParameters.PathParameters1 pathParameters;
    }
}
