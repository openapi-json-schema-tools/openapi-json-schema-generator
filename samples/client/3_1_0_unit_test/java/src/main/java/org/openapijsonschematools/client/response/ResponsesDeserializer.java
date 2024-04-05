package org.openapijsonschematools.client.response;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import java.net.http.HttpResponse;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.ApiException;

public interface ResponsesDeserializer<SealedResponseClass> {
    SealedResponseClass deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException;
}