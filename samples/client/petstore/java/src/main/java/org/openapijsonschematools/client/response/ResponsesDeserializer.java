package org.openapijsonschematools.client.response;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import java.net.http.HttpResponse;

public interface ResponsesDeserializer<SealedResponseClass> {
    SealedResponseClass deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration);
}