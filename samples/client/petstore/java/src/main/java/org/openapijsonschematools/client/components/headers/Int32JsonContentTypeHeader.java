package org.openapijsonschematools.client.components.headers;

import org.openapijsonschematools.client.header.ContentHeader;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.components.headers.int32jsoncontenttypeheader.content.applicationjson.Int32JsonContentTypeHeaderSchema;

import java.util.AbstractMap;
import java.util.Map;

public class Int32JsonContentTypeHeader {

    public record ApplicationjsonMediaType(Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1 schema) implements MediaType<Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1, Void> {
        public ApplicationjsonMediaType() {
            this(Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public static class Int32JsonContentTypeHeader1 extends ContentHeader {
        public Int32JsonContentTypeHeader1() {
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
