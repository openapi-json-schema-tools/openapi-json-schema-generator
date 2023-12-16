package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Map;
import java.util.Objects;

public class NotAnyTypeJsonSchema extends JsonSchema implements NullSchemaValidator, BooleanSchemaValidator, NumberSchemaValidator, StringSchemaValidator, ListSchemaValidator<Object, FrozenList<Object>>, MapSchemaValidator<Object, FrozenMap<Object>> {
    private static NotAnyTypeJsonSchema instance;

    protected NotAnyTypeJsonSchema() {
        super(new JsonSchemaInfo()
            .not(AnyTypeJsonSchema.class)
        );
    }

    public static NotAnyTypeJsonSchema getInstance() {
        if (instance == null) {
            instance = new NotAnyTypeJsonSchema();
        }
        return instance;
    }

    public Void getNewInstance(Void arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    @Override
    public boolean getNewInstance(boolean arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    @Override
    public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    @Override
    public Number getNewInstance(Number arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    @Override
    public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    @Override
    public String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    @Override
    public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    @Override
    public FrozenList<Object> getNewInstance(FrozenList<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return (FrozenList<Object>) arg;
    }

    @Override
    public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        FrozenList<Object> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    @Override
    public FrozenMap<Object> getNewInstance(FrozenMap<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return (FrozenMap<Object>) arg;
    }

    @Override
    public FrozenMap<Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        FrozenMap<Object> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    @Override
    public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        if (arg == null) {
            return getNewInstance((Void) null, pathToItem, pathToSchemas);
        } else if (arg instanceof Boolean) {
            boolean boolArg = (Boolean) arg;
            return getNewInstance(boolArg, pathToItem, pathToSchemas);
        } else if (arg instanceof Number) {
            return getNewInstance((Number) arg, pathToItem, pathToSchemas);
        } else if (arg instanceof String) {
            return getNewInstance((String) arg, pathToItem, pathToSchemas);
        } else if (arg instanceof FrozenList) {
            @SuppressWarnings("unchecked") FrozenList<Object> castArg = (FrozenList<Object>) arg;
            return getNewInstance(castArg, pathToItem, pathToSchemas);
        } else if (arg instanceof FrozenMap) {
            @SuppressWarnings("unchecked") FrozenMap<Object> castArg = (FrozenMap<Object>) arg;
            return getNewInstance(castArg, pathToItem, pathToSchemas);
        }
        throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
    }
}