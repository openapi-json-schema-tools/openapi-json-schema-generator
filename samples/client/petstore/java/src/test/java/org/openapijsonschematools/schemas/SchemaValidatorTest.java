package org.openapijsonschematools.schemas;

import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

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
        ValidationMetadata validationMetadata = new ValidationMetadata(
                new ArrayList<>(),
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        SomeSchema._validate(
                "hi",
                validationMetadata
        );
    }
}
