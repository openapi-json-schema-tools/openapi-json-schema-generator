package org.openapijsonschematools.client.components.responses.headerswithnobody.headers;

import org.openapijsonschematools.client.header.SchemaHeader;
import org.openapijsonschematools.client.components.responses.headerswithnobody.headers.location.LocationSchema;

public class Location {

    public static class Location1 extends SchemaHeader {
        public Location1() {
            super(
                false,
                null,
                false,
                LocationSchema.LocationSchema1.getInstance()
            );
        }
    }
}
