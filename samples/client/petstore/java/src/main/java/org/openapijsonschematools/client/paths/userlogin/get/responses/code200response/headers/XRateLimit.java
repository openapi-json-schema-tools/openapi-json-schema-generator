package org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.headers;

import org.openapijsonschematools.client.header.ContentHeader;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.headers.xratelimit.content.applicationjson.XRateLimitSchema;

import java.util.AbstractMap;
import java.util.Map;

public class XRateLimit {

    public record ApplicationjsonMediaType(XRateLimitSchema.XRateLimitSchema1 schema) implements MediaType<XRateLimitSchema.XRateLimitSchema1, Void> {
        public ApplicationjsonMediaType() {
            this(XRateLimitSchema.XRateLimitSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public static class XRateLimit1 extends ContentHeader {
        public XRateLimit1() {
            super(
                true,
                null,
                false,
                new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType())
            );
        }
    }
}
