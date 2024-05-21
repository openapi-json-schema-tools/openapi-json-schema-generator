package unit_test_api.header;

import org.checkerframework.checker.nullness.qual.Nullable;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.NotImplementedException;
import unit_test_api.exceptions.ValidationException;

import java.net.http.HttpHeaders;
import java.util.List;

public interface Header {
    HttpHeaders serialize(@Nullable Object inData, String name, boolean validate, SchemaConfiguration configuration) throws NotImplementedException, ValidationException;
    @Nullable Object deserialize(List<String> inData, boolean validate, SchemaConfiguration configuration) throws NotImplementedException, ValidationException;
}