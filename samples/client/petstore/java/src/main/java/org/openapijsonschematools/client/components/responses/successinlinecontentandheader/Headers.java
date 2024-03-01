package org.openapijsonschematools.client.components.responses.successinlinecontentandheader;

import org.openapijsonschematools.client.response.HeadersDeserializer;
import org.openapijsonschematools.client.components.responses.successinlinecontentandheader.headers.SomeHeader;

import java.util.Map;
import java.util.AbstractMap;

public class Headers extends HeadersDeserializer<SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchemaMap> {
    public Headers() {
        super(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>("someHeader", new SomeHeader.SomeHeader1())
            ),
            SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchema1.getInstance()
        );
    }
}