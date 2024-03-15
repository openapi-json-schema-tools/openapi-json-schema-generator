package org.openapijsonschematools.client.paths.foo;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.foo.get.FooGetServerInfo;
import org.openapijsonschematools.client.paths.foo.get.Responses;

public class Get {

    public static class GetRequest {
        public FooGetServerInfo.@Nullable ServerIndex serverIndex;
    }

    public interface SetterForServerIndex <T> {
        GetRequest getInstance();
        T getBuilderAfterServerIndex(GetRequest instance);
        default T serverIndex(FooGetServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public static class GetRequestBuilder implements SetterForServerIndex<GetRequestBuilder> {
        private final GetRequest instance;

        public GetRequestBuilder() {
            this.instance = new GetRequest();
        }

        public GetRequest build() {
            return instance;
        }

        public GetRequest getInstance() {
            return instance;
        }

        public GetRequestBuilder getBuilderAfterServerIndex(GetRequest instance) {
            return this;
        }
    }
}
