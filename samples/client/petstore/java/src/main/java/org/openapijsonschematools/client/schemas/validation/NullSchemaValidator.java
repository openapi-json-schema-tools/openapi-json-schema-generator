package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;
import java.util.Set;

public interface NullSchemaValidator {
    Void castToAllowedTypes(Void arg, List<Object> pathToItem, Set<List<Object>> pathSet);
    Void getNewInstance(Void arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas);
    Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException;
}