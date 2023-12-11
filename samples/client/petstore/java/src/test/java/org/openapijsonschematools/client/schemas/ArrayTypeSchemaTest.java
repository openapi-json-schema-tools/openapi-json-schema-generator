package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ArrayTypeSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    public static class ArrayWithItemsSchema extends JsonSchema<Object, Object, FrozenMap<String, Object>, Object, Object, FrozenList<Object>> {
        public ArrayWithItemsSchema() {
            super(new LinkedHashMap<>(Map.ofEntries(
                    new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                    new KeywordEntry("items", new ItemsValidator(StringJsonSchema.class))
            )));
        }

        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }

        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }

        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) {
            return validateList(arg, configuration);
        }
    }

    public static class ArrayWithOutputClsSchemaList extends FrozenList<String> {
        ArrayWithOutputClsSchemaList(FrozenList<String> m) {
            super(m);
        }

        public static ArrayWithOutputClsSchemaList of(List<String> arg, SchemaConfiguration configuration) {
            return JsonSchemaFactory.getInstance(ArrayWithOutputClsSchema.class).validate(arg, configuration);
        }
    }

    public static class ArrayWithOutputClsSchema extends JsonSchema<Object, Object, FrozenMap<String, Object>, String, String, ArrayWithOutputClsSchemaList> {
        public ArrayWithOutputClsSchema() {
            super(new LinkedHashMap<>(Map.ofEntries(
                    new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                    new KeywordEntry("items", new ItemsValidator(StringJsonSchema.class))
            )));

        }

        protected ArrayWithOutputClsSchemaList getListOutputInstance(FrozenList<String> arg) {
            return new ArrayWithOutputClsSchemaList(arg);
        }

        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }

        public ArrayWithOutputClsSchemaList validate(List<String> arg, SchemaConfiguration configuration) {
            return validateList(arg, configuration);
        }
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> JsonSchemaFactory.getInstance(ArrayWithItemsSchema.class).validate(
                (Void) null, configuration
        ));
    }

    @Test
    public void testValidateArrayWithItemsSchema() {
        // map with only item works
        List<Object> inList = new ArrayList<>();
        inList.add("abc");
        FrozenList<Object> validatedValue = JsonSchemaFactory.getInstance(ArrayWithItemsSchema.class).validate(inList, configuration);
        List<Object> outList = new ArrayList<>();
        outList.add("abc");
        Assert.assertEquals(validatedValue, outList);

        // map with no items works
        inList = new ArrayList<>();
        validatedValue = JsonSchemaFactory.getInstance(ArrayWithItemsSchema.class).validate(inList, configuration);
        outList = new ArrayList<>();
        Assert.assertEquals(validatedValue, outList);

        // invalid prop type fails
        inList = new ArrayList<>();
        inList.add(1);
        List<Object> finalInList = inList;
        Assert.assertThrows(ValidationException.class, () -> JsonSchemaFactory.getInstance(ArrayWithItemsSchema.class).validate(
                finalInList, configuration
        ));
    }

    @Test
    public void testValidateArrayWithOutputClsSchema() {
        // map with only item works
        List<String> inList = new ArrayList<>();
        inList.add("abc");
        ArrayWithOutputClsSchemaList validatedValue = JsonSchemaFactory.getInstance(ArrayWithOutputClsSchema.class).validate(inList, configuration);
        List<Object> outList = new ArrayList<>();
        outList.add("abc");
        Assert.assertEquals(validatedValue, outList);

        // map with no items works
        inList = new ArrayList<>();
        validatedValue = JsonSchemaFactory.getInstance(ArrayWithOutputClsSchema.class).validate(inList, configuration);
        outList = new ArrayList<>();
        Assert.assertEquals(validatedValue, outList);

        // invalid prop type fails
        List<Integer> invalidList = Arrays.asList(1);
        Assert.assertThrows(ValidationException.class, () -> JsonSchemaFactory.getInstance(ArrayWithOutputClsSchema.class).validate(
                invalidList, configuration
        ));
    }
}
