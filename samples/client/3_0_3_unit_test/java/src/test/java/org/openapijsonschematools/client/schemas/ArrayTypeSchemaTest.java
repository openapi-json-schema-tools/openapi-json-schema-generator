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
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ArrayTypeSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    public class ArrayWithItemsSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(StringJsonSchema.class))
        ));

        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) {
            return validateList(arg, configuration);
        }
    }

    public static class ArrayWithOutputClsSchemaList extends FrozenList<String> {
        ArrayWithOutputClsSchemaList(FrozenList<? extends String> m) {
            super(m);
        }

        public static ArrayWithOutputClsSchemaList of(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchemaFactory.getInstance(ArrayWithOutputClsSchema.class).validate(arg, configuration);
        }
    }

    public class ArrayWithOutputClsSchema extends JsonSchema<FrozenMap, ArrayWithOutputClsSchemaList> {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(StringJsonSchema.class))
        ));

        protected ArrayWithOutputClsSchemaList getListOutputInstance(FrozenList<?> arg) {
            return new ArrayWithOutputClsSchemaList((FrozenList<? extends String>) arg);
        }

        public ArrayWithOutputClsSchemaList validate(List<Object> arg, SchemaConfiguration configuration) {
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
        List<Object> inList = new ArrayList<>();
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
        inList = new ArrayList<>();
        inList.add(1);
        List<Object> finalInList = inList;
        Assert.assertThrows(ValidationException.class, () -> JsonSchemaFactory.getInstance(ArrayWithOutputClsSchema.class).validate(
                finalInList, configuration
        ));
    }
}
