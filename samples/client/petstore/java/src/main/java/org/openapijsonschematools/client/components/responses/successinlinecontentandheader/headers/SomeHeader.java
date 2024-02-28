package org.openapijsonschematools.client.components.responses.successinlinecontentandheader.headers;

import org.openapijsonschematools.client.header.SchemaHeader;
import org.openapijsonschematools.client.components.responses.successinlinecontentandheader.headers.someheader.SomeHeaderSchema;

public class SomeHeader {

    public static class SomeHeader1 extends SchemaHeader {
        public SomeHeader1() {
            super(
                false,
                null,
                false,
                SomeHeaderSchema.SomeHeaderSchema1.getInstance()
            );
        }
    }
}
