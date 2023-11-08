package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(RuntimeException.class, () -> Schema.validate(
                MapSchema.class, (Void) null, configuration
        ));
    }

    @Test
    public void testValidateMap() {
        Map<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("today", LocalDate.of(2017, 7, 21));
        FrozenMap<String, Object> validatedValue = MapSchema.validate(inMap, configuration);
        LinkedHashMap<String, String> outMap = new LinkedHashMap<>();
        outMap.put("today", "2017-07-21");
        Assert.assertEquals(validatedValue, outMap);
    }
}
