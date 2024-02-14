# SchemaSchema
public class SchemaSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SchemaSchema.SchemaSchema1Boxed](#schemaschema1boxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.SchemaSchema1BoxedMap](#schemaschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SchemaSchema.SchemaSchema1](#schemaschema1)<br> schema class |
| static class | [SchemaSchema.SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder)<br> builder for Map payloads |
| static class | [SchemaSchema.SchemaMapSchemaMap](#schemamapschemamap)<br> output class for Map payloads |
| static class | [SchemaSchema.CallbackCallbackBoxed](#callbackcallbackboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.CallbackCallbackBoxedString](#callbackcallbackboxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.CallbackCallback](#callbackcallback)<br> schema class |
| static class | [SchemaSchema.PasswordPasswordBoxed](#passwordpasswordboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.PasswordPasswordBoxedString](#passwordpasswordboxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.PasswordPassword](#passwordpassword)<br> schema class |
| static class | [SchemaSchema.DateTimeDateTimeBoxed](#datetimedatetimeboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.DateTimeDateTimeBoxedString](#datetimedatetimeboxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.DateTimeDateTime](#datetimedatetime)<br> schema class |
| static class | [SchemaSchema.DateDateBoxed](#datedateboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.DateDateBoxedString](#datedateboxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.DateDate](#datedate)<br> schema class |
| static class | [SchemaSchema.BinaryBinaryBoxed](#binarybinaryboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.BinaryBinary](#binarybinary)<br> schema class |
| static class | [SchemaSchema.ByteByteBoxed](#bytebyteboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.ByteByteBoxedString](#bytebyteboxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.ByteByte](#bytebyte)<br> schema class |
| static class | [SchemaSchema.PatternwithoutdelimiterPatternWithoutDelimiterBoxed](#patternwithoutdelimiterpatternwithoutdelimiterboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.PatternwithoutdelimiterPatternWithoutDelimiterBoxedString](#patternwithoutdelimiterpatternwithoutdelimiterboxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.PatternwithoutdelimiterPatternWithoutDelimiter](#patternwithoutdelimiterpatternwithoutdelimiter)<br> schema class |
| static class | [SchemaSchema.StringStringBoxed](#stringstringboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.StringStringBoxedString](#stringstringboxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.StringString](#stringstring)<br> schema class |
| static class | [SchemaSchema.DoubleDoubleBoxed](#doubledoubleboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.DoubleDoubleBoxedNumber](#doubledoubleboxednumber)<br> boxed class to store validated Number payloads |
| static class | [SchemaSchema.DoubleDouble](#doubledouble)<br> schema class |
| static class | [SchemaSchema.FloatFloatBoxed](#floatfloatboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.FloatFloatBoxedNumber](#floatfloatboxednumber)<br> boxed class to store validated Number payloads |
| static class | [SchemaSchema.FloatFloat](#floatfloat)<br> schema class |
| static class | [SchemaSchema.NumberNumberBoxed](#numbernumberboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.NumberNumberBoxedNumber](#numbernumberboxednumber)<br> boxed class to store validated Number payloads |
| static class | [SchemaSchema.NumberNumber](#numbernumber)<br> schema class |
| static class | [SchemaSchema.Int64Int64Boxed](#int64int64boxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.Int64Int64BoxedNumber](#int64int64boxednumber)<br> boxed class to store validated Number payloads |
| static class | [SchemaSchema.Int64Int64](#int64int64)<br> schema class |
| static class | [SchemaSchema.Int32Int32Boxed](#int32int32boxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.Int32Int32BoxedNumber](#int32int32boxednumber)<br> boxed class to store validated Number payloads |
| static class | [SchemaSchema.Int32Int32](#int32int32)<br> schema class |
| static class | [SchemaSchema.IntegerIntegerBoxed](#integerintegerboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.IntegerIntegerBoxedNumber](#integerintegerboxednumber)<br> boxed class to store validated Number payloads |
| static class | [SchemaSchema.IntegerInteger](#integerinteger)<br> schema class |

## SchemaSchema1Boxed
public static abstract sealed class SchemaSchema1Boxed<br>
permits<br>
[SchemaSchema1BoxedMap](#schemaschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## SchemaSchema1BoxedMap
public static final class SchemaSchema1BoxedMap<br>
extends [SchemaSchema1Boxed](#schemaschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaSchema1BoxedMap([SchemaMapSchemaMap](#schemamapschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [SchemaMapSchemaMap](#schemamapschemamap) | data<br>validated payload |

## SchemaSchema1
public static class SchemaSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
SchemaSchema.SchemaMapSchemaMap validatedPayload =
    SchemaSchema.SchemaSchema1.validate(
    new SchemaSchema.SchemaMapBuilderSchemaMapBuilder()
        .setByte("a")

        .setDouble(3.14d)

        .setNumber(1)

        .pattern_without_delimiter("AUR,rZ#UM/?R,Fp^l6$ARjbhJk C>")

        .setInteger(1)

        .int32(1)

        .int64(1L)

        .setFloat(3.14f)

        .setString("A")

        .binary("a")

        .date("2020-12-13")

        .dateTime("1970-01-01T00:00:00.00Z")

        .password("a")

        .callback("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("integer", [IntegerInteger.class](#integerinteger))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Int32Int32.class](#int32int32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int64", [Int64Int64.class](#int64int64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number", [NumberNumber.class](#numbernumber))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float", [FloatFloat.class](#floatfloat))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("double", [DoubleDouble.class](#doubledouble))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("string", [StringString.class](#stringstring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pattern_without_delimiter", [PatternwithoutdelimiterPatternWithoutDelimiter.class](#patternwithoutdelimiterpatternwithoutdelimiter))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("byte", [ByteByte.class](#bytebyte))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("binary", [BinaryBinary.class](#binarybinary))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date", [DateDate.class](#datedate))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("dateTime", [DateTimeDateTime.class](#datetimedatetime))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("password", [PasswordPassword.class](#passwordpassword))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("callback", [CallbackCallback.class](#callbackcallback)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"byte",<br>&nbsp;&nbsp;&nbsp;&nbsp;"double",<br>&nbsp;&nbsp;&nbsp;&nbsp;"number",<br>&nbsp;&nbsp;&nbsp;&nbsp;"pattern_without_delimiter"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMapSchemaMap](#schemamapschemamap) | validate([Map&lt;?, ?&gt;](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| [SchemaSchema1BoxedMap](#schemaschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMap0000BuilderSchemaMap0000Builder
public class SchemaMap0000BuilderSchemaMap0000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0000BuilderSchemaMap0000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setInteger(int value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setInteger(float value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setInteger(long value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setInteger(double value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | int32(int value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | int32(float value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | int64(int value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | int64(float value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | int64(long value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | int64(double value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setFloat(int value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setFloat(float value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setFloat(long value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setFloat(double value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setString(String value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | binary(String value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | date(String value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | dateTime(String value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | password(String value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | callback(String value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | additionalProperty(String key, Void value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | additionalProperty(String key, boolean value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | additionalProperty(String key, String value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | additionalProperty(String key, int value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | additionalProperty(String key, float value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | additionalProperty(String key, long value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | additionalProperty(String key, double value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | additionalProperty(String key, List<?> value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | additionalProperty(String key, Map<String, ?> value) |

## SchemaMap0001BuilderSchemaMap0001Builder
public class SchemaMap0001BuilderSchemaMap0001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0001BuilderSchemaMap0001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | pattern_without_delimiter(String value) |

## SchemaMap0010BuilderSchemaMap0010Builder
public class SchemaMap0010BuilderSchemaMap0010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0010BuilderSchemaMap0010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setNumber(int value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setNumber(float value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setNumber(long value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setNumber(double value) |

## SchemaMap0011BuilderSchemaMap0011Builder
public class SchemaMap0011BuilderSchemaMap0011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0011BuilderSchemaMap0011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0001BuilderSchemaMap0001Builder](#schemamap0001builderschemamap0001builder) | setNumber(int value) |
| [SchemaMap0001BuilderSchemaMap0001Builder](#schemamap0001builderschemamap0001builder) | setNumber(float value) |
| [SchemaMap0001BuilderSchemaMap0001Builder](#schemamap0001builderschemamap0001builder) | setNumber(long value) |
| [SchemaMap0001BuilderSchemaMap0001Builder](#schemamap0001builderschemamap0001builder) | setNumber(double value) |
| [SchemaMap0010BuilderSchemaMap0010Builder](#schemamap0010builderschemamap0010builder) | pattern_without_delimiter(String value) |

## SchemaMap0100BuilderSchemaMap0100Builder
public class SchemaMap0100BuilderSchemaMap0100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0100BuilderSchemaMap0100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setDouble(int value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setDouble(float value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setDouble(long value) |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setDouble(double value) |

## SchemaMap0101BuilderSchemaMap0101Builder
public class SchemaMap0101BuilderSchemaMap0101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0101BuilderSchemaMap0101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0001BuilderSchemaMap0001Builder](#schemamap0001builderschemamap0001builder) | setDouble(int value) |
| [SchemaMap0001BuilderSchemaMap0001Builder](#schemamap0001builderschemamap0001builder) | setDouble(float value) |
| [SchemaMap0001BuilderSchemaMap0001Builder](#schemamap0001builderschemamap0001builder) | setDouble(long value) |
| [SchemaMap0001BuilderSchemaMap0001Builder](#schemamap0001builderschemamap0001builder) | setDouble(double value) |
| [SchemaMap0100BuilderSchemaMap0100Builder](#schemamap0100builderschemamap0100builder) | pattern_without_delimiter(String value) |

## SchemaMap0110BuilderSchemaMap0110Builder
public class SchemaMap0110BuilderSchemaMap0110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0110BuilderSchemaMap0110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0010BuilderSchemaMap0010Builder](#schemamap0010builderschemamap0010builder) | setDouble(int value) |
| [SchemaMap0010BuilderSchemaMap0010Builder](#schemamap0010builderschemamap0010builder) | setDouble(float value) |
| [SchemaMap0010BuilderSchemaMap0010Builder](#schemamap0010builderschemamap0010builder) | setDouble(long value) |
| [SchemaMap0010BuilderSchemaMap0010Builder](#schemamap0010builderschemamap0010builder) | setDouble(double value) |
| [SchemaMap0100BuilderSchemaMap0100Builder](#schemamap0100builderschemamap0100builder) | setNumber(int value) |
| [SchemaMap0100BuilderSchemaMap0100Builder](#schemamap0100builderschemamap0100builder) | setNumber(float value) |
| [SchemaMap0100BuilderSchemaMap0100Builder](#schemamap0100builderschemamap0100builder) | setNumber(long value) |
| [SchemaMap0100BuilderSchemaMap0100Builder](#schemamap0100builderschemamap0100builder) | setNumber(double value) |

## SchemaMap0111BuilderSchemaMap0111Builder
public class SchemaMap0111BuilderSchemaMap0111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0111BuilderSchemaMap0111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0011BuilderSchemaMap0011Builder](#schemamap0011builderschemamap0011builder) | setDouble(int value) |
| [SchemaMap0011BuilderSchemaMap0011Builder](#schemamap0011builderschemamap0011builder) | setDouble(float value) |
| [SchemaMap0011BuilderSchemaMap0011Builder](#schemamap0011builderschemamap0011builder) | setDouble(long value) |
| [SchemaMap0011BuilderSchemaMap0011Builder](#schemamap0011builderschemamap0011builder) | setDouble(double value) |
| [SchemaMap0101BuilderSchemaMap0101Builder](#schemamap0101builderschemamap0101builder) | setNumber(int value) |
| [SchemaMap0101BuilderSchemaMap0101Builder](#schemamap0101builderschemamap0101builder) | setNumber(float value) |
| [SchemaMap0101BuilderSchemaMap0101Builder](#schemamap0101builderschemamap0101builder) | setNumber(long value) |
| [SchemaMap0101BuilderSchemaMap0101Builder](#schemamap0101builderschemamap0101builder) | setNumber(double value) |
| [SchemaMap0110BuilderSchemaMap0110Builder](#schemamap0110builderschemamap0110builder) | pattern_without_delimiter(String value) |

## SchemaMap1000BuilderSchemaMap1000Builder
public class SchemaMap1000BuilderSchemaMap1000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1000BuilderSchemaMap1000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0000BuilderSchemaMap0000Builder](#schemamap0000builderschemamap0000builder) | setByte(String value) |

## SchemaMap1001BuilderSchemaMap1001Builder
public class SchemaMap1001BuilderSchemaMap1001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1001BuilderSchemaMap1001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0001BuilderSchemaMap0001Builder](#schemamap0001builderschemamap0001builder) | setByte(String value) |
| [SchemaMap1000BuilderSchemaMap1000Builder](#schemamap1000builderschemamap1000builder) | pattern_without_delimiter(String value) |

## SchemaMap1010BuilderSchemaMap1010Builder
public class SchemaMap1010BuilderSchemaMap1010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1010BuilderSchemaMap1010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0010BuilderSchemaMap0010Builder](#schemamap0010builderschemamap0010builder) | setByte(String value) |
| [SchemaMap1000BuilderSchemaMap1000Builder](#schemamap1000builderschemamap1000builder) | setNumber(int value) |
| [SchemaMap1000BuilderSchemaMap1000Builder](#schemamap1000builderschemamap1000builder) | setNumber(float value) |
| [SchemaMap1000BuilderSchemaMap1000Builder](#schemamap1000builderschemamap1000builder) | setNumber(long value) |
| [SchemaMap1000BuilderSchemaMap1000Builder](#schemamap1000builderschemamap1000builder) | setNumber(double value) |

## SchemaMap1011BuilderSchemaMap1011Builder
public class SchemaMap1011BuilderSchemaMap1011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1011BuilderSchemaMap1011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0011BuilderSchemaMap0011Builder](#schemamap0011builderschemamap0011builder) | setByte(String value) |
| [SchemaMap1001BuilderSchemaMap1001Builder](#schemamap1001builderschemamap1001builder) | setNumber(int value) |
| [SchemaMap1001BuilderSchemaMap1001Builder](#schemamap1001builderschemamap1001builder) | setNumber(float value) |
| [SchemaMap1001BuilderSchemaMap1001Builder](#schemamap1001builderschemamap1001builder) | setNumber(long value) |
| [SchemaMap1001BuilderSchemaMap1001Builder](#schemamap1001builderschemamap1001builder) | setNumber(double value) |
| [SchemaMap1010BuilderSchemaMap1010Builder](#schemamap1010builderschemamap1010builder) | pattern_without_delimiter(String value) |

## SchemaMap1100BuilderSchemaMap1100Builder
public class SchemaMap1100BuilderSchemaMap1100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1100BuilderSchemaMap1100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0100BuilderSchemaMap0100Builder](#schemamap0100builderschemamap0100builder) | setByte(String value) |
| [SchemaMap1000BuilderSchemaMap1000Builder](#schemamap1000builderschemamap1000builder) | setDouble(int value) |
| [SchemaMap1000BuilderSchemaMap1000Builder](#schemamap1000builderschemamap1000builder) | setDouble(float value) |
| [SchemaMap1000BuilderSchemaMap1000Builder](#schemamap1000builderschemamap1000builder) | setDouble(long value) |
| [SchemaMap1000BuilderSchemaMap1000Builder](#schemamap1000builderschemamap1000builder) | setDouble(double value) |

## SchemaMap1101BuilderSchemaMap1101Builder
public class SchemaMap1101BuilderSchemaMap1101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1101BuilderSchemaMap1101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0101BuilderSchemaMap0101Builder](#schemamap0101builderschemamap0101builder) | setByte(String value) |
| [SchemaMap1001BuilderSchemaMap1001Builder](#schemamap1001builderschemamap1001builder) | setDouble(int value) |
| [SchemaMap1001BuilderSchemaMap1001Builder](#schemamap1001builderschemamap1001builder) | setDouble(float value) |
| [SchemaMap1001BuilderSchemaMap1001Builder](#schemamap1001builderschemamap1001builder) | setDouble(long value) |
| [SchemaMap1001BuilderSchemaMap1001Builder](#schemamap1001builderschemamap1001builder) | setDouble(double value) |
| [SchemaMap1100BuilderSchemaMap1100Builder](#schemamap1100builderschemamap1100builder) | pattern_without_delimiter(String value) |

## SchemaMap1110BuilderSchemaMap1110Builder
public class SchemaMap1110BuilderSchemaMap1110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1110BuilderSchemaMap1110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0110BuilderSchemaMap0110Builder](#schemamap0110builderschemamap0110builder) | setByte(String value) |
| [SchemaMap1010BuilderSchemaMap1010Builder](#schemamap1010builderschemamap1010builder) | setDouble(int value) |
| [SchemaMap1010BuilderSchemaMap1010Builder](#schemamap1010builderschemamap1010builder) | setDouble(float value) |
| [SchemaMap1010BuilderSchemaMap1010Builder](#schemamap1010builderschemamap1010builder) | setDouble(long value) |
| [SchemaMap1010BuilderSchemaMap1010Builder](#schemamap1010builderschemamap1010builder) | setDouble(double value) |
| [SchemaMap1100BuilderSchemaMap1100Builder](#schemamap1100builderschemamap1100builder) | setNumber(int value) |
| [SchemaMap1100BuilderSchemaMap1100Builder](#schemamap1100builderschemamap1100builder) | setNumber(float value) |
| [SchemaMap1100BuilderSchemaMap1100Builder](#schemamap1100builderschemamap1100builder) | setNumber(long value) |
| [SchemaMap1100BuilderSchemaMap1100Builder](#schemamap1100builderschemamap1100builder) | setNumber(double value) |

## SchemaMapBuilderSchemaMapBuilder
public class SchemaMapBuilderSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMapBuilderSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0111BuilderSchemaMap0111Builder](#schemamap0111builderschemamap0111builder) | setByte(String value) |
| [SchemaMap1011BuilderSchemaMap1011Builder](#schemamap1011builderschemamap1011builder) | setDouble(int value) |
| [SchemaMap1011BuilderSchemaMap1011Builder](#schemamap1011builderschemamap1011builder) | setDouble(float value) |
| [SchemaMap1011BuilderSchemaMap1011Builder](#schemamap1011builderschemamap1011builder) | setDouble(long value) |
| [SchemaMap1011BuilderSchemaMap1011Builder](#schemamap1011builderschemamap1011builder) | setDouble(double value) |
| [SchemaMap1101BuilderSchemaMap1101Builder](#schemamap1101builderschemamap1101builder) | setNumber(int value) |
| [SchemaMap1101BuilderSchemaMap1101Builder](#schemamap1101builderschemamap1101builder) | setNumber(float value) |
| [SchemaMap1101BuilderSchemaMap1101Builder](#schemamap1101builderschemamap1101builder) | setNumber(long value) |
| [SchemaMap1101BuilderSchemaMap1101Builder](#schemamap1101builderschemamap1101builder) | setNumber(double value) |
| [SchemaMap1110BuilderSchemaMap1110Builder](#schemamap1110builderschemamap1110builder) | pattern_without_delimiter(String value) |

## SchemaMapSchemaMap
public static class SchemaMapSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMapSchemaMap](#schemamapschemamap) | of([Map<String, ? extends @Nullable Object>](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | pattern_without_delimiter()<br> |
| Number | int32()<br>[optional] value must be a 32 bit integer |
| Number | int64()<br>[optional] value must be a 64 bit integer |
| String | binary()<br>[optional] |
| String | date()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| String | dateTime()<br>[optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time |
| String | password()<br>[optional] |
| String | callback()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["byte"], instance["double"], instance["number"], instance["integer"], instance["float"], instance["string"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## CallbackCallbackBoxed
public static abstract sealed class CallbackCallbackBoxed<br>
permits<br>
[CallbackCallbackBoxedString](#callbackcallbackboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## CallbackCallbackBoxedString
public static final class CallbackCallbackBoxedString<br>
extends [CallbackCallbackBoxed](#callbackcallbackboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CallbackCallbackBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## CallbackCallback
public static class CallbackCallback<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## PasswordPasswordBoxed
public static abstract sealed class PasswordPasswordBoxed<br>
permits<br>
[PasswordPasswordBoxedString](#passwordpasswordboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## PasswordPasswordBoxedString
public static final class PasswordPasswordBoxedString<br>
extends [PasswordPasswordBoxed](#passwordpasswordboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PasswordPasswordBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## PasswordPassword
public static class PasswordPassword<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = SchemaSchema.PasswordPassword.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "password"; |
| Integer | maxLength = 64 |
| Integer | minLength = 10 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [PasswordPasswordBoxedString](#passwordpasswordboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DateTimeDateTimeBoxed
public static abstract sealed class DateTimeDateTimeBoxed<br>
permits<br>
[DateTimeDateTimeBoxedString](#datetimedatetimeboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## DateTimeDateTimeBoxedString
public static final class DateTimeDateTimeBoxedString<br>
extends [DateTimeDateTimeBoxed](#datetimedatetimeboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeDateTimeBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## DateTimeDateTime
public static class DateTimeDateTime<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = SchemaSchema.DateTimeDateTime.validate(
    "1970-01-01T00:00:00.00Z",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "date-time"; |
| @Nullable Object | defaultValue = "2010-02-01T10:20:10.111110+01:00" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [DateTimeDateTimeBoxedString](#datetimedatetimeboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DateDateBoxed
public static abstract sealed class DateDateBoxed<br>
permits<br>
[DateDateBoxedString](#datedateboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## DateDateBoxedString
public static final class DateDateBoxedString<br>
extends [DateDateBoxed](#datedateboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateDateBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## DateDate
public static class DateDate<br>
extends DateJsonSchema.DateJsonSchema1

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateJsonSchema.DateJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## BinaryBinaryBoxed
public static abstract sealed class BinaryBinaryBoxed<br>
permits<br>

abstract sealed class that stores validated payloads using boxed classes

## BinaryBinary
public static class BinaryBinary<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

## ByteByteBoxed
public static abstract sealed class ByteByteBoxed<br>
permits<br>
[ByteByteBoxedString](#bytebyteboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## ByteByteBoxedString
public static final class ByteByteBoxedString<br>
extends [ByteByteBoxed](#bytebyteboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByteByteBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ByteByte
public static class ByteByte<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
None

## PatternwithoutdelimiterPatternWithoutDelimiterBoxed
public static abstract sealed class PatternwithoutdelimiterPatternWithoutDelimiterBoxed<br>
permits<br>
[PatternwithoutdelimiterPatternWithoutDelimiterBoxedString](#patternwithoutdelimiterpatternwithoutdelimiterboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## PatternwithoutdelimiterPatternWithoutDelimiterBoxedString
public static final class PatternwithoutdelimiterPatternWithoutDelimiterBoxedString<br>
extends [PatternwithoutdelimiterPatternWithoutDelimiterBoxed](#patternwithoutdelimiterpatternwithoutdelimiterboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternwithoutdelimiterPatternWithoutDelimiterBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## PatternwithoutdelimiterPatternWithoutDelimiter
public static class PatternwithoutdelimiterPatternWithoutDelimiter<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = SchemaSchema.PatternwithoutdelimiterPatternWithoutDelimiter.validate(
    "AUR,rZ#UM/?R,Fp^l6$ARjbhJk C>",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"^[A-Z].*"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [PatternwithoutdelimiterPatternWithoutDelimiterBoxedString](#patternwithoutdelimiterpatternwithoutdelimiterboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringStringBoxed
public static abstract sealed class StringStringBoxed<br>
permits<br>
[StringStringBoxedString](#stringstringboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## StringStringBoxedString
public static final class StringStringBoxedString<br>
extends [StringStringBoxed](#stringstringboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringStringBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## StringString
public static class StringString<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = SchemaSchema.StringString.validate(
    "A",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"[a-z]",<br>&nbsp;&nbsp;&nbsp;&nbsp;Pattern.CASE_INSENSITIVE<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [StringStringBoxedString](#stringstringboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DoubleDoubleBoxed
public static abstract sealed class DoubleDoubleBoxed<br>
permits<br>
[DoubleDoubleBoxedNumber](#doubledoubleboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## DoubleDoubleBoxedNumber
public static final class DoubleDoubleBoxedNumber<br>
extends [DoubleDoubleBoxed](#doubledoubleboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleDoubleBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## DoubleDouble
public static class DoubleDouble<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// double validation
double validatedPayload = SchemaSchema.DoubleDouble.validate(
    3.14d,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "double"; |
| Number | maximum = 123.4 |
| Number | minimum = 67.8 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| double | validate(double arg, SchemaConfiguration configuration) |
| [DoubleDoubleBoxedNumber](#doubledoubleboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FloatFloatBoxed
public static abstract sealed class FloatFloatBoxed<br>
permits<br>
[FloatFloatBoxedNumber](#floatfloatboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## FloatFloatBoxedNumber
public static final class FloatFloatBoxedNumber<br>
extends [FloatFloatBoxed](#floatfloatboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatFloatBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## FloatFloat
public static class FloatFloat<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// float validation
float validatedPayload = SchemaSchema.FloatFloat.validate(
    3.14f,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "float"; |
| Number | maximum = 987.6 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| float | validate(float arg, SchemaConfiguration configuration) |
| [FloatFloatBoxedNumber](#floatfloatboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NumberNumberBoxed
public static abstract sealed class NumberNumberBoxed<br>
permits<br>
[NumberNumberBoxedNumber](#numbernumberboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## NumberNumberBoxedNumber
public static final class NumberNumberBoxedNumber<br>
extends [NumberNumberBoxed](#numbernumberboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberNumberBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## NumberNumber
public static class NumberNumber<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// int validation
int validatedPayload = SchemaSchema.NumberNumber.validate(
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| Number | maximum = 543.2 |
| Number | minimum = 32.1 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| [NumberNumberBoxedNumber](#numbernumberboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Int64Int64Boxed
public static abstract sealed class Int64Int64Boxed<br>
permits<br>
[Int64Int64BoxedNumber](#int64int64boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Int64Int64BoxedNumber
public static final class Int64Int64BoxedNumber<br>
extends [Int64Int64Boxed](#int64int64boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int64Int64BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Int64Int64
public static class Int64Int64<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Int32Int32Boxed
public static abstract sealed class Int32Int32Boxed<br>
permits<br>
[Int32Int32BoxedNumber](#int32int32boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Int32Int32BoxedNumber
public static final class Int32Int32BoxedNumber<br>
extends [Int32Int32Boxed](#int32int32boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32Int32BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Int32Int32
public static class Int32Int32<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// int validation
int validatedPayload = SchemaSchema.Int32Int32.validate(
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int32"; |
| Number | maximum = 200 |
| Number | minimum = 20 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| int | validate(int arg, SchemaConfiguration configuration) |
| [Int32Int32BoxedNumber](#int32int32boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## IntegerIntegerBoxed
public static abstract sealed class IntegerIntegerBoxed<br>
permits<br>
[IntegerIntegerBoxedNumber](#integerintegerboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## IntegerIntegerBoxedNumber
public static final class IntegerIntegerBoxedNumber<br>
extends [IntegerIntegerBoxed](#integerintegerboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IntegerIntegerBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IntegerInteger
public static class IntegerInteger<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// int validation
int validatedPayload = SchemaSchema.IntegerInteger.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int"; |
| Number | maximum = 100 |
| Number | minimum = 10 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| [IntegerIntegerBoxedNumber](#integerintegerboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |