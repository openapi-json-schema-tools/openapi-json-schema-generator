package org.openapijsonschematools.client.components.responses.headerswithnobody;

import org.openapijsonschematools.client.response.HeadersDeserializer;
import org.openapijsonschematools.client.components.responses.headerswithnobody.headers.Location;

import java.util.Map;
import java.util.AbstractMap;

public class Headers extends HeadersDeserializer<HeadersSchema.HeadersSchemaMap> {
    public Headers() {
        super(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>("location", new Location.Location1())
            ),
            HeadersSchema.HeadersSchema1.getInstance()
        );
    }
}