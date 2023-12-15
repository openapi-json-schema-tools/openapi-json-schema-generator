package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;
import java.util.Set;

public interface BooleanSchemaValidator {
    boolean castToAllowedTypes(boolean arg, List<Object> pathToItem, Set<List<Object>> pathSet);
    boolean getNewInstance(boolean arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas);
    boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException;
}