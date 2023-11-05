package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

record SomeSchema(LinkedHashSet<Class<?>> type) implements SchemaValidator {
    static SomeSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(String.class);
        return new SomeSchema(type);
    }

    static PathToSchemasMap _validate(
            Object arg,
            ValidationMetadata validationMetadata
    ) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return SchemaValidator._validate(
                SomeSchema.withDefaults(),
                arg,
                validationMetadata
        );
    }


}

public class SchemaValidatorTest {

    @Test
    public void testValidateSucceeds() throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        PathToSchemasMap pathToSchemas = SomeSchema._validate(
                "hi",
                validationMetadata
        );
        PathToSchemasMap expectedPathToSchemas = new PathToSchemasMap();
        HashMap<Class<?>, Void> validatedClasses = new HashMap<>();
        validatedClasses.put(SomeSchema.class, null);
        validatedClasses.put(String.class, null);
        expectedPathToSchemas.put(pathToItem, validatedClasses);
        Assert.assertEquals(pathToSchemas, expectedPathToSchemas);
    }
}
