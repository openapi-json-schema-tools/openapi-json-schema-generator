package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

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

        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayWithItemsSchema.class, arg, configuration);
        }
    }

    public static class ArrayWithOutputClsSchemaList extends FrozenList<String> {
        ArrayWithOutputClsSchemaList(FrozenList<? extends String> m) {
            super(m);
        }

        public static ArrayWithOutputClsSchemaList of(List<Object> arg, SchemaConfiguration configuration) {
            return ArrayWithOutputClsSchema.validate(arg, configuration);
        }
    }

    public class ArrayWithOutputClsSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(StringJsonSchema.class))
        ));

        protected static ArrayWithOutputClsSchemaList getListOutputInstance(FrozenList<? extends String> arg) {
            return new ArrayWithOutputClsSchemaList(arg);
        }

        public static ArrayWithOutputClsSchemaList validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayWithOutputClsSchema.class, arg, configuration);
        }
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(RuntimeException.class, () -> JsonSchema.validateObject(
                ArrayWithItemsSchema.class, (Void) null, configuration
        ));
    }

    @Test
    public void testValidateArrayWithItemsSchema() {
        // map with only item works
        List<Object> inList = new ArrayList<>();
        inList.add("abc");
        FrozenList<Object> validatedValue = ArrayWithItemsSchema.validate(inList, configuration);
        List<Object> outList = new ArrayList<>();
        outList.add("abc");
        Assert.assertEquals(validatedValue, outList);

        // map with no items works
        inList = new ArrayList<>();
        validatedValue = ArrayWithItemsSchema.validate(inList, configuration);
        outList = new ArrayList<>();
        Assert.assertEquals(validatedValue, outList);

        // invalid prop type fails
        inList = new ArrayList<>();
        inList.add(1);
        List<Object> finalInList = inList;
        Assert.assertThrows(RuntimeException.class, () -> ArrayWithItemsSchema.validate(
                finalInList, configuration
        ));
    }

    @Test
    public void testValidateArrayWithOutputClsSchema() {
        // map with only item works
        List<Object> inList = new ArrayList<>();
        inList.add("abc");
        ArrayWithOutputClsSchemaList validatedValue = ArrayWithOutputClsSchema.validate(inList, configuration);
        List<Object> outList = new ArrayList<>();
        outList.add("abc");
        Assert.assertEquals(validatedValue, outList);

        // map with no items works
        inList = new ArrayList<>();
        validatedValue = ArrayWithOutputClsSchema.validate(inList, configuration);
        outList = new ArrayList<>();
        Assert.assertEquals(validatedValue, outList);

        // invalid prop type fails
        inList = new ArrayList<>();
        inList.add(1);
        List<Object> finalInList = inList;
        Assert.assertThrows(RuntimeException.class, () -> ArrayWithOutputClsSchema.validate(
                finalInList, configuration
        ));
    }

//    @Test
//    public void testValidateList() {
//        int schemaQty = 1000;
//        List<Object> inList = new ArrayList<>(schemaQty-1);
//        Long loops = 100L;
//        Double mSecPerSchemaMax = null;
//        Double mSecPerSchemaMin = null;
//        Double mSecPerSchemaTotal = 0d;
//        int loop = loops.intValue();
//        while (loop > 0) {
//            int i = 0;
//            while (i < schemaQty) {
//                inList.add(i, "a");
//                i += 1;
//            }
//            long start = System.currentTimeMillis();
//            FrozenList<Object> validatedValue = ArrayWithItemsSchema.validate(inList, configuration);
//            long finish = System.currentTimeMillis();
//            long timeElapsed = finish - start;
//            double mSecPerSchema = Double.longBitsToDouble (timeElapsed) / Double.longBitsToDouble(schemaQty);
//            mSecPerSchemaTotal += mSecPerSchema;
//            if (mSecPerSchemaMax == null) {
//                mSecPerSchemaMax = mSecPerSchema;
//            } else if (mSecPerSchemaMax < mSecPerSchema) {
//                mSecPerSchemaMax = mSecPerSchema;
//            }
//            if (mSecPerSchemaMin == null) {
//                mSecPerSchemaMin = mSecPerSchema;
//            } else if (mSecPerSchema < mSecPerSchemaMin) {
//                mSecPerSchemaMin = mSecPerSchema;
//            }
//            loop -= 1;
//        }
//        System.Logger logger = System.getLogger("");
//        logger.log(System.Logger.Level.INFO, "loops "+loops);
//        logger.log(System.Logger.Level.INFO, "mSecPerSchemaMax "+mSecPerSchemaMax);
//        logger.log(System.Logger.Level.INFO, "mSecPerSchemaMin "+mSecPerSchemaMin);
//        logger.log(System.Logger.Level.INFO, "mSecPerSchemaTotal "+mSecPerSchemaTotal);
//        double mSecPerSchemaAvg = mSecPerSchemaTotal / loops.doubleValue();
//        /*
//        100 loop, max 0.732, min 0.042, avg 0.183 msec per schema
//        100 loop, max 1.008, min 0.088, avg 0.314 msec per schema
//        100 loop, max 1.192, min 0.041, avg 0.283 msec per schema
//        100 loop, max 0.779, min 0.062, avg 0.270 msec per schema
//        100 loop, max 1.167, min 0.052, avg 0.292 msec per schema
//         */
//        logger.log(System.Logger.Level.INFO, "mSecPerSchemaAvg "+mSecPerSchemaAvg);
//        Assert.assertEquals(mSecPerSchemaAvg, 0d, 0.0000001);
//    }
}
