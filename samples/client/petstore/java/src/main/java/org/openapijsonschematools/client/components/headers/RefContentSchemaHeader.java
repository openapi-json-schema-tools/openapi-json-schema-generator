package org.openapijsonschematools.client.components.headers;

import org.openapijsonschematools.client.header.ContentHeader;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.components.headers.refcontentschemaheader.content.applicationjson.RefContentSchemaHeaderSchema;

import java.util.AbstractMap;
import java.util.Map;

public class RefContentSchemaHeader {

    public record ApplicationjsonMediaType(RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1 schema) implements MediaType<RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1, Void> {
        public ApplicationjsonMediaType() {
            this(RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public static class RefContentSchemaHeader1 extends ContentHeader {
        public RefContentSchemaHeader1() {
            super(
                true,
                null,
                false,
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType())
                )
            );
        }
    }
}
