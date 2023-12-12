package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AnyTypeJsonSchema extends JsonSchema<Object, Object, Object> {
    public AnyTypeJsonSchema() {
        super(null);
    }

    @Override
    protected Object castToAllowedTypes(Object arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        return castToAllowedObjectTypes(arg, pathToItem, pathSet);
    }

    @Override
    protected Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    public Void validate(Void arg, SchemaConfiguration configuration) {
        return (Void) validate((Object) arg, configuration);
    }

    public boolean validate(boolean arg, SchemaConfiguration configuration) {
        return (boolean) validate((Object) arg, configuration);
    }

    public int validate(int arg, SchemaConfiguration configuration) {
        return (int) validate((Object) arg, configuration);
    }

    public long validate(long arg, SchemaConfiguration configuration) {
        return (long) validate((Object) arg, configuration);
    }

    public float validate(float arg, SchemaConfiguration configuration) {
        return (float) validate((Object) arg, configuration);
    }

    public double validate(double arg, SchemaConfiguration configuration) {
        return (double) validate((Object) arg, configuration);
    }

    public String validate(String arg, SchemaConfiguration configuration) {
        return (String) validate((Object) arg, configuration);
    }

    public String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
        return (String) validate((Object) arg, configuration);
    }

    public String validate(LocalDate arg, SchemaConfiguration configuration) {
        return (String) validate((Object) arg, configuration);
    }

    public FrozenMap<?> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
        Object val = validate((Object) arg, configuration);
        assert val instanceof FrozenMap<?>;
        return (FrozenMap<?>) val;
    }

    public FrozenList<?> validate(List<Object> arg, SchemaConfiguration configuration) {
        Object val = validate((Object) arg, configuration);
        assert val instanceof FrozenList<?>;
        return (FrozenList<?>) val;
    }
}
