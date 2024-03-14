package org.openapijsonschematools.client.paths.petpetid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petpetid.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetid.post.PetpetidPostSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.post.PathParameters;
import org.openapijsonschematools.client.paths.petpetid.post.Parameters;
import org.openapijsonschematools.client.paths.petpetid.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RequestBody.SealedRequestBody ;
        public @Nullable RootServerInfo.ServerIndex rootServerInfo;
        public @Nullable PetpetidPostSecurityInfo.SecurityIndex petpetidPostSecurityInfo;
        public @Nullable PathParameters.PathParameters1 pathParameters;
    }
}
