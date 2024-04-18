package unit_test_api.schemas.validation;

import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;

import java.util.List;
import java.util.Map;

public interface MapSchemaValidator <OutType, BoxedType> {
    OutType getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws ValidationException;
    OutType validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException;
    BoxedType validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException;
}