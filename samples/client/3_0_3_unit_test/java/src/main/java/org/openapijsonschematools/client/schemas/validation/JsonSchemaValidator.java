package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;
import java.util.Set;

public interface JsonSchemaValidator <InType, CastType, OutType> {
    CastType castToAllowedTypes(InType arg, List<Object> pathToItem, Set<List<Object>> pathSet);
    OutType getNewInstance(CastType arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas);
    OutType validate(InType arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException;
}