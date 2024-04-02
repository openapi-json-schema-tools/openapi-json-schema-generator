package org.openapijsonschematools.client.schemas;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;


public class AnyTypeSchemaTest {
    static final AnyTypeJsonSchema.AnyTypeJsonSchema1 schema = AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance();
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @SuppressWarnings("nullness")
    private Void assertNull(@Nullable Object object) {
        Assert.assertNull(object);
        return null;
    }

    @Test
    public void testValidateNull() throws ValidationException, InvalidTypeException {
        Void validatedValue = schema.validate((Void) null, configuration);
        assertNull(validatedValue);
    }

    @Test
    public void testValidateBoolean() throws ValidationException, InvalidTypeException {
        boolean trueValue = schema.validate(true, configuration);
        Assert.assertTrue(trueValue);

        boolean falseValue = schema.validate(false, configuration);
        Assert.assertFalse(falseValue);
    }

    @Test
    public void testValidateInteger() throws ValidationException, InvalidTypeException {
        int validatedValue = schema.validate(1, configuration);
        Assert.assertEquals(validatedValue, 1);
    }

    @Test
    public void testValidateLong() throws ValidationException, InvalidTypeException {
        long validatedValue = schema.validate(1L, configuration);
        Assert.assertEquals(validatedValue, 1L);
    }

    @Test
    public void testValidateFloat() throws ValidationException, InvalidTypeException {
        float validatedValue = schema.validate(3.14f, configuration);
        Assert.assertEquals(Float.compare(validatedValue, 3.14f), 0);
    }

    @Test
    public void testValidateDouble() throws ValidationException, InvalidTypeException {
        double validatedValue = schema.validate(70.6458763d, configuration);
        Assert.assertEquals(Double.compare(validatedValue, 70.6458763d), 0);
    }

    @Test
    public void testValidateString() throws ValidationException, InvalidTypeException {
        String validatedValue = schema.validate("a", configuration);
        Assert.assertEquals(validatedValue, "a");
    }

    @Test
    public void testValidateZonedDateTime() throws ValidationException, InvalidTypeException {
        String validatedValue = schema.validate(ZonedDateTime.of(2017, 7, 21, 17, 32, 28, 0, ZoneId.of("Z")), configuration);
        Assert.assertEquals(validatedValue, "2017-07-21T17:32:28Z");
    }

    @Test
    public void testValidateLocalDate() throws ValidationException, InvalidTypeException {
        String validatedValue = schema.validate(LocalDate.of(2017, 7, 21), configuration);
        Assert.assertEquals(validatedValue, "2017-07-21");
    }

    @Test
    public void testValidateMap() throws ValidationException, InvalidTypeException {
        LinkedHashMap<String, Object> inMap = new LinkedHashMap<>();
        inMap.put("today", LocalDate.of(2017, 7, 21));
        FrozenMap<?> validatedValue = schema.validate(inMap, configuration);
        LinkedHashMap<String, Object> outMap = new LinkedHashMap<>();
        outMap.put("today", "2017-07-21");
        Assert.assertEquals(validatedValue, outMap);
    }

    @Test
    public void testValidateList() throws ValidationException, InvalidTypeException {
        ArrayList<Object> inList = new ArrayList<>();
        inList.add(LocalDate.of(2017, 7, 21));
        FrozenList<?> validatedValue = schema.validate(inList, configuration);
        ArrayList<Object> outList = new ArrayList<>();
        outList.add( "2017-07-21");
        Assert.assertEquals(validatedValue, outList);
    }
}

