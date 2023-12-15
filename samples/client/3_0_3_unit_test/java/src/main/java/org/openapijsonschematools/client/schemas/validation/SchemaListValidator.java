package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;
import java.util.Set;

public interface SchemaListValidator <InType, CastType, OutType> {
    FrozenList<CastType> castToAllowedTypes(List<InType> arg, List<Object> pathToItem, Set<List<Object>> pathSet);
    OutType getNewInstance(FrozenList<CastType> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas);
    OutType validate(List<InType> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException;
}