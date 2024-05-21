package unit_test_api.requestbody;

public interface GenericRequestBody<SealedSchemaOutputClass> {
    String contentType();
    SealedSchemaOutputClass body();
}