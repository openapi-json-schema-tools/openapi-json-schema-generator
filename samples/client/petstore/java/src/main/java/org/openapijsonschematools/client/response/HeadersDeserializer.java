package org.openapijsonschematools.client.response;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.header.Header;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;

import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class HeadersDeserializer<OutType> {
    private final Map<String, Header> headers;
    final private MapSchemaValidator<OutType, ?> headersSchema;
    public HeadersDeserializer(Map<String, Header> headers, MapSchemaValidator<OutType, ?> headersSchema) {
        this.headers = headers;
        this.headersSchema = headersSchema;
    }

    public OutType deserialize(HttpHeaders responseHeaders, SchemaConfiguration configuration) throws ValidationException, NotImplementedException {
        Map<String, @Nullable Object> headersToValidate = new HashMap<>();
        for (Map.Entry<String, List<String>> entry: responseHeaders.map().entrySet()) {
            String headerName = entry.getKey();
            Header headerDeserializer = headers.get(headerName);
            if (headerDeserializer == null) {
                // todo put this data in headersToValidate, if only one item in list load it in, otherwise join them with commas
                continue;
            }
            @Nullable Object headerValue = headerDeserializer.deserialize(entry.getValue(), false, configuration);
            headersToValidate.put(headerName, headerValue);
        }
        return headersSchema.validate(headersToValidate, configuration);
    }
}
