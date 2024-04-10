package org.openapijsonschematools.client.paths.userlogin.get.responses.code200response;

import org.openapijsonschematools.client.response.HeadersDeserializer;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.headers.XRateLimit;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.headers.Int32;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.headers.XExpiresAfter;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.headers.Refcontentschemaheader;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.headers.NumberHeader;

import java.util.Map;
import java.util.AbstractMap;

public class Headers extends HeadersDeserializer<UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchemaMap> {
    public Headers() {
        super(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>("X-Rate-Limit", new XRateLimit.XRateLimit1()),
                new AbstractMap.SimpleEntry<>("int32", new Int32.Int321()),
                new AbstractMap.SimpleEntry<>("X-Expires-After", new XExpiresAfter.XExpiresAfter1()),
                new AbstractMap.SimpleEntry<>("ref-content-schema-header", new Refcontentschemaheader.Refcontentschemaheader1()),
                new AbstractMap.SimpleEntry<>("numberHeader", new NumberHeader.NumberHeader1())
            ),
            UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchema1.getInstance()
        );
    }
}