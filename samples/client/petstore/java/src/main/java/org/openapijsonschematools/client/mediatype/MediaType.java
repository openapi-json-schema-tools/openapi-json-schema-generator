package org.openapijsonschematools.client.mediatype;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;

public interface MediaType<T extends JsonSchema<?>, U> {
    /*
    * Used to store request and response body schema information
    * encoding:
    *     A map between a property name and its encoding information.
    *     The key, being the property name, MUST exist in the schema as a property.
    *     The encoding object SHALL only apply to requestBody objects when the media type is
    *     multipart or application/x-www-form-urlencoded.
    */
    T schema();
    U encoding();
}