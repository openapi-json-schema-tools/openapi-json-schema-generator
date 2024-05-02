package org.openapijsonschematools.client.components.headers;

import org.openapijsonschematools.client.header.SchemaHeader;
import org.openapijsonschematools.client.components.headers.stringheader.StringHeaderSchema;

public class StringHeader {

    public static class StringHeader1 extends SchemaHeader {
        public StringHeader1() {
            super(
                true,
                null,
                false,
                StringHeaderSchema.StringHeaderSchema1.getInstance()
            );
        }
    }
}
