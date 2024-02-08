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
import org.checkerframework.checker.nullness.qual.Nullable;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class AnyTypeJsonSchema extends JsonSchema implements NullSchemaValidator, BooleanSchemaValidator, NumberSchemaValidator, StringSchemaValidator, ListSchemaValidator<FrozenList<@Nullable Object>>, MapSchemaValidator<FrozenMap<@Nullable Object>> {
    private static @Nullable AnyTypeJsonSchema instance = null;

    protected AnyTypeJsonSchema() {
        super(new JsonSchemaInfo());
    }

    public static AnyTypeJsonSchema getInstance() {
        if (instance == null) {
            instance = new AnyTypeJsonSchema();
        }
        return instance;
    }

    @Override
    public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = List.of("args[0]");
        Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    @Override
    public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = List.of("args[0]");
        boolean castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    @Override
    public Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = List.of("args[0]");
        Number castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    public int validate(int arg, SchemaConfiguration configuration) {
        return (int) validate((Number) arg, configuration);
    }

    public long validate(long arg, SchemaConfiguration configuration) {
        return (long) validate((Number) arg, configuration);
    }

    public float validate(float arg, SchemaConfiguration configuration) {
        return (float) validate((Number) arg, configuration);
    }

    public double validate(double arg, SchemaConfiguration configuration) {
        return (double) validate((Number) arg, configuration);
    }

    @Override
    public String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = List.of("args[0]");
        String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
        return validate(arg.toString(), configuration);
    }

    public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
        return validate(arg.toString(), configuration);
    }

    public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
        return validate(arg.toString(), configuration);
    }

    @Override
    public FrozenList<@Nullable Object> getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        List<@Nullable Object> items = new ArrayList<>();
        int i = 0;
        for (Object item: arg) {
            List<Object> itemPathToItem = new ArrayList<>(pathToItem);
            itemPathToItem.add(i);
            LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
            if (schemas == null) {
                throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
            }
            JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
            @Nullable Object castItem = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
            items.add(castItem);
            i += 1;
        }
        return new FrozenList<>(items);
    }

    public FrozenList<@Nullable Object> validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = List.of("args[0]");
        List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    @Override
    public FrozenMap<@Nullable Object> getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
        for(Map.Entry<?, ?> entry: arg.entrySet()) {
            @Nullable Object entryKey = entry.getKey();
            if (!(entryKey instanceof String)) {
                throw new InvalidTypeException("Invalid non-string key value");
            }
            String propertyName = (String) entryKey;
            List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
            propertyPathToItem.add(propertyName);
            Object value = entry.getValue();
            LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
            if (schemas == null) {
                throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
            }
            JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
            @Nullable Object castValue = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
            properties.put(propertyName, castValue);
        }
        return new FrozenMap<>(properties);
    }

    public FrozenMap<@Nullable Object> validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        Set<List<Object>> pathSet = new HashSet<>();
        List<Object> pathToItem = List.of("args[0]");
        Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
        SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
        PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
        ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, new LinkedHashSet<>());
        PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
        return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
    }

    @Override
    public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        if (arg == null) {
            return getNewInstance((Void) null, pathToItem, pathToSchemas);
        } else if (arg instanceof Boolean) {
            boolean boolArg = (Boolean) arg;
            return getNewInstance(boolArg, pathToItem, pathToSchemas);
        } else if (arg instanceof Number) {
            return getNewInstance((Number) arg, pathToItem, pathToSchemas);
        } else if (arg instanceof String) {
            return getNewInstance((String) arg, pathToItem, pathToSchemas);
        } else if (arg instanceof List) {
            return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
        } else if (arg instanceof Map) {
            return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
        }
        throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
    }

    @Override
    public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        if (arg == null) {
            return validate((Void) null, configuration);
        } else if (arg instanceof Boolean) {
            boolean boolArg = (Boolean) arg;
            return validate(boolArg, configuration);
        } else if (arg instanceof Number) {
            return validate((Number) arg, configuration);
        } else if (arg instanceof String) {
            return validate((String) arg, configuration);
        } else if (arg instanceof List) {
            return validate((List<?>) arg, configuration);
        } else if (arg instanceof Map) {
            return validate((Map<?, ?>) arg, configuration);
        }
        throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
    }

    public static abstract sealed class AnyTypeBoxed permits AnyTypeBoxedVoid, AnyTypeBoxedBoolean, AnyTypeBoxedNumber, AnyTypeBoxedString, AnyTypeBoxedList, AnyTypeBoxedMap {
    }
    public static final class AnyTypeBoxedVoid extends AnyTypeBoxed {
        public final Void data;
        private AnyTypeBoxedVoid(Void data) {
            this.data = data;
        }
    }
    public static final class AnyTypeBoxedBoolean extends AnyTypeBoxed {
        public final boolean data;
        private AnyTypeBoxedBoolean(boolean data) {
            this.data = data;
        }
    }
    public static final class AnyTypeBoxedNumber extends AnyTypeBoxed {
        public final Number data;
        private AnyTypeBoxedNumber(Number data) {
            this.data = data;
        }
    }
    public static final class AnyTypeBoxedString extends AnyTypeBoxed {
        public final String data;
        private AnyTypeBoxedString(String data) {
            this.data = data;
        }
    }
    public static final class AnyTypeBoxedList extends AnyTypeBoxed {
        public final FrozenList<@Nullable Object> data;
        private AnyTypeBoxedList(FrozenList<@Nullable Object> data) {
            this.data = data;
        }
    }
    public static final class AnyTypeBoxedMap extends AnyTypeBoxed {
        public final FrozenMap<@Nullable Object> data;
        private AnyTypeBoxedMap(FrozenMap<@Nullable Object> data) {
            this.data = data;
        }
    }
    public AnyTypeBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
        if (arg == null) {
            return new AnyTypeBoxedVoid(validate((Void) null, configuration));
        } else if (arg instanceof Boolean) {
            boolean boolArg = (Boolean) arg;
            return new AnyTypeBoxedBoolean(validate(boolArg, configuration));
        } else if (arg instanceof Number) {
            return new AnyTypeBoxedNumber(validate((Number) arg, configuration));
        } else if (arg instanceof String) {
            return new AnyTypeBoxedString(validate((String) arg, configuration));
        } else if (arg instanceof List) {
            return new AnyTypeBoxedList(validate((List<?>) arg, configuration));
        } else if (arg instanceof Map) {
            return new AnyTypeBoxedMap(validate((Map<?, ?>) arg, configuration));
        }
        throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
    }
}