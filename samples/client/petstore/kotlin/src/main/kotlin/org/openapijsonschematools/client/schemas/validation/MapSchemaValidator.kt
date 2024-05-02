package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;
import java.util.Map;

public interface MapSchemaValidator <OutType, BoxedType> {
    OutType getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws ValidationException;
    OutType validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException;
    BoxedType validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException;
}