package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;

public interface ListSchemaValidator <OutType, BoxedType> {
    OutType getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws ValidationException;
    OutType validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException;
    BoxedType validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException;
}