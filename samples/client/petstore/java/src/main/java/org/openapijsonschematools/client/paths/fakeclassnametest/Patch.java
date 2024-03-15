package org.openapijsonschematools.client.paths.fakeclassnametest;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.FakeclassnametestPatchSecurityInfo;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.RequestBody;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.Responses;

public class Patch {
    public static class PatchCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable FakeclassnametestPatchSecurityInfo.SecurityIndex securityIndex;
        public @Nullable RequestBody.SealedRequestBody requestBody;
    }
}
