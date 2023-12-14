package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.SchemaStringValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class DateJsonSchema extends JsonSchema implements SchemaStringValidator {
    private static DateJsonSchema instance;

    private DateJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(String.class))),
                new KeywordEntry("format", new FormatValidator("date"))
        )));
    }

    public static DateJsonSchema getInstance() {
        if (instance == null) {
            instance = new DateJsonSchema();
        }
        return instance;
    }

    @Override
    public String castToAllowedTypes(String arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        return castToAllowedStringTypes(arg, pathToItem, pathSet);
    }

    @Override
    public String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    @Override
    public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = List.of("args[0");
        String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
        return validate(arg.toString(), configuration);
    }

    @Override
    public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        if (arg instanceof String) {
            return getNewInstance((String) arg, pathToItem, pathToSchemas);
        }
        throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
    }
}
