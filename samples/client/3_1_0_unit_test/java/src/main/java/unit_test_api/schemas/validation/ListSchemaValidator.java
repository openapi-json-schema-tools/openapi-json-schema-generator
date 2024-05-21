package unit_test_api.schemas.validation;

import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;

import java.util.List;

public interface ListSchemaValidator <OutType, BoxedType> {
    OutType getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws ValidationException;
    OutType validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException;
    BoxedType validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException;
}