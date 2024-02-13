package org.openapijsonschematools.client.mediatype;

import package org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Map;

public class MediaType<T extends JsonSchema> {
    /*
    * Used to store request and response body schema information
    * encoding:
    *     A map between a property name and its encoding information.
    *     The key, being the property name, MUST exist in the schema as a property.
    *     The encoding object SHALL only apply to requestBody objects when the media type is
    *     multipart or application/x-www-form-urlencoded.
    */
    public final Class<T> schema;
    public final @Nullable Map<String, Encoding> encoding;

    public MediaTypeWithoutEncoding(Class<T> schema, @Nullable Map<String, Encoding> encoding) {
        this.schema = schema;
        this.encoding = encoding;
    }

    public MediaTypeWithoutEncoding(Class<T> schema) {
        this.schema = schema;
        this.encoding = null;
    }
}