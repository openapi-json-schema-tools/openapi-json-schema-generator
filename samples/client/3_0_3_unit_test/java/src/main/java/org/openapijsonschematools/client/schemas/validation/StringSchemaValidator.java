package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;
import java.util.Set;

public interface StringSchemaValidator {
    String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas);
    String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException;
}