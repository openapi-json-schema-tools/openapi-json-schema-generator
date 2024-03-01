package org.openapijsonschematools.client.components.responses.successinlinecontentandheader;

import org.openapijsonschematools.client.response.HeadersDeserializer;
import org.openapijsonschematools.client.components.responses.successinlinecontentandheader.headers.SomeHeader;

import java.util.Map;
import java.util.AbstractMap;

public class Headers extends HeadersDeserializer<HeadersSchema.HeadersSchemaMap> {
    public Headers() {
        super(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>("someHeader", new SomeHeader.SomeHeader1())
            ),
            HeadersSchema.HeadersSchema1.getInstance()
        );
    }
}