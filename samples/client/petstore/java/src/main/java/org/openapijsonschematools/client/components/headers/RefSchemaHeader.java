package org.openapijsonschematools.client.components.headers;

import org.openapijsonschematools.client.header.SchemaHeader;
import org.openapijsonschematools.client.components.headers.refschemaheader.RefSchemaHeaderSchema;

public class RefSchemaHeader {

    public static class RefSchemaHeader1 extends SchemaHeader {
        public RefSchemaHeader1() {
            super(
                true,
                null,
                false,
                RefSchemaHeaderSchema.RefSchemaHeaderSchema1.getInstance()
            );
        }
    }
}
