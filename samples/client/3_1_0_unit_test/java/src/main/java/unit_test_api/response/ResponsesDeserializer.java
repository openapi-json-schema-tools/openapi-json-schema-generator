package unit_test_api.response;

import unit_test_api.configurations.SchemaConfiguration;
import java.net.http.HttpResponse;
import unit_test_api.exceptions.NotImplementedException;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.exceptions.ApiException;

public interface ResponsesDeserializer<SealedResponseClass> {
    SealedResponseClass deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException;
}