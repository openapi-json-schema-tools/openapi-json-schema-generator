package org.openapijsonschematools.client.paths.pet;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.pet.post.PetPostSecurityInfo;
import org.openapijsonschematools.client.paths.pet.post.RequestBody;
import org.openapijsonschematools.client.paths.pet.post.Responses;

public class Post {
    public static class PostCallData {
        public @Nullable RootServerInfo.ServerIndex rootServerInfo;
        public @Nullable PetPostSecurityInfo.SecurityIndex petPostSecurityInfo;
        public @Nullable RequestBody.SealedRequestBody ;
    }
}
