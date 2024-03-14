package org.openapijsonschematools.client.paths.foo;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.foo.get.FooGetServerInfo;
import org.openapijsonschematools.client.paths.foo.get.Responses;

public class Get {
    public static class GetCallData {
        public @Nullable FooGetServerInfo.ServerIndex fooGetServerInfo;
    }
}
