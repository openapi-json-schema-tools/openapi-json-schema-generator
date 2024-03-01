package org.openapijsonschematools.client.components.responses.successwithjsonapiresponse;

import org.openapijsonschematools.client.response.HeadersDeserializer;
import org.openapijsonschematools.client.components.responses.successwithjsonapiresponse.headers.Refschemaheader;
import org.openapijsonschematools.client.components.responses.successwithjsonapiresponse.headers.Int32;
import org.openapijsonschematools.client.components.responses.successwithjsonapiresponse.headers.Refcontentschemaheader;
import org.openapijsonschematools.client.components.responses.successwithjsonapiresponse.headers.StringHeader;
import org.openapijsonschematools.client.components.responses.successwithjsonapiresponse.headers.NumberHeader;

import java.util.Map;
import java.util.AbstractMap;

public class Headers extends HeadersDeserializer<HeadersSchema.HeadersSchemaMap> {
    public Headers() {
        super(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>("ref-schema-header", new Refschemaheader.Refschemaheader1()),
                new AbstractMap.SimpleEntry<>("int32", new Int32.Int321()),
                new AbstractMap.SimpleEntry<>("ref-content-schema-header", new Refcontentschemaheader.Refcontentschemaheader1()),
                new AbstractMap.SimpleEntry<>("stringHeader", new StringHeader.StringHeader1()),
                new AbstractMap.SimpleEntry<>("numberHeader", new NumberHeader.NumberHeader1())
            ),
            HeadersSchema.HeadersSchema1.getInstance()
        );
    }
}