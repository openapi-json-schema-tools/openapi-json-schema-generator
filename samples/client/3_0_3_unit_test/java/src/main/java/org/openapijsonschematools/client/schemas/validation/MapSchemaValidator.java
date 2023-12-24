package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface MapSchemaValidator <OutType> {
    OutType getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas);
    // OutType validate(Map<String, InType> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException;
}