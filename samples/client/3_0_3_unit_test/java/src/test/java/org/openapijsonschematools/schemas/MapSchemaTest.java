package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.exceptions.ValidationException;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                MapJsonSchema.class, (Void) null, configuration
        ));
    }

    @Test
    public void testValidateMap() {
        Map<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("today", LocalDate.of(2017, 7, 21));
        FrozenMap<String, Object> validatedValue = MapJsonSchema.validate(inMap, configuration);
        LinkedHashMap<String, String> outMap = new LinkedHashMap<>();
        outMap.put("today", "2017-07-21");
        Assert.assertEquals(validatedValue, outMap);
    }
}
