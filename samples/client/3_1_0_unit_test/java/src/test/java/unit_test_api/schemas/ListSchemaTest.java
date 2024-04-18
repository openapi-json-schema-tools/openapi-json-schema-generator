package unit_test_api.schemas;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.JsonSchema;
import unit_test_api.schemas.validation.FrozenList;
import unit_test_api.schemas.validation.PathToSchemasMap;
import unit_test_api.schemas.validation.ValidationMetadata;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ListSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
    static final ListJsonSchema.ListJsonSchema1 listJsonSchema = ListJsonSchema.ListJsonSchema1.getInstance();
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );
    
    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                listJsonSchema,
                null,
                validationMetadata
        ));
    }

    @Test
    public void testValidateList() throws ValidationException {
        List<Object> inList = new ArrayList<>();
        inList.add("today");
        FrozenList<@Nullable Object> validatedValue = listJsonSchema.validate(inList, configuration);
        ArrayList<String> outList = new ArrayList<>();
        outList.add("today");
        Assert.assertEquals(validatedValue, outList);
    }
}
