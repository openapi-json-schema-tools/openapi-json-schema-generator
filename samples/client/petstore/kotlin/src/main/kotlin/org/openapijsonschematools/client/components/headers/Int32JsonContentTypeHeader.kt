package org.openapijsonschematools.client.components.headers;

import org.openapijsonschematools.client.header.ContentHeader;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.components.headers.int32jsoncontenttypeheader.content.applicationjson.Int32JsonContentTypeHeaderSchema;

import java.util.AbstractMap;

public class Int32JsonContentTypeHeader {

    public record ApplicationjsonMediaType(Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1 schema) implements MediaType<Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1, Nothing?> {
        public ApplicationjsonMediaType() {
            this(Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1.getInstance());
        }
        @Override
        public Nothing? encoding() {
            return null;
        }
    }

    public static class Int32JsonContentTypeHeader1 extends ContentHeader {
        public Int32JsonContentTypeHeader1() {
            super(
                true,
                null,
                false,
                new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType())
            );
        }
    }
}
