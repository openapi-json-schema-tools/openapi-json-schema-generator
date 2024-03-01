package org.openapijsonschematools.client.components.headers;

import org.openapijsonschematools.client.header.SchemaHeader;
import org.openapijsonschematools.client.components.headers.numberheader.NumberHeaderSchema;

public class NumberHeader {

    public static class NumberHeader1 extends SchemaHeader {
        public NumberHeader1() {
            super(
                false,
                null,
                false,
                NumberHeaderSchema.NumberHeaderSchema1.getInstance()
            );
        }
    }
}
