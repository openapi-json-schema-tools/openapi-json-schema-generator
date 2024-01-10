# FormatTest
org.openapijsonschematools.client.components.schemas.FormatTest.java
public class FormatTest

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [FormatTest.FormatTest1](#formattest1)<br> schema class |
| static class | [FormatTest.FormatTestMapBuilder](#formattestmapbuilder)<br> builder for Map payloads |
| static class | [FormatTest.FormatTestMap](#formattestmap)<br> output class for Map payloads |
| static class | [FormatTest.NoneProp](#noneprop)<br> schema class |
| static class | [FormatTest.PatternWithDigitsAndDelimiter](#patternwithdigitsanddelimiter)<br> schema class |
| static class | [FormatTest.PatternWithDigits](#patternwithdigits)<br> schema class |
| static class | [FormatTest.Password](#password)<br> schema class |
| static class | [FormatTest.UuidNoExample](#uuidnoexample)<br> schema class |
| static class | [FormatTest.UuidSchema](#uuidschema)<br> schema class |
| static class | [FormatTest.DateTime](#datetime)<br> schema class |
| static class | [FormatTest.Date](#date)<br> schema class |
| static class | [FormatTest.Binary](#binary)<br> schema class |
| static class | [FormatTest.ByteSchema](#byteschema)<br> schema class |
| static class | [FormatTest.StringSchema](#stringschema)<br> schema class |
| static class | [FormatTest.ArrayWithUniqueItems](#arraywithuniqueitems)<br> schema class |
| static class | [FormatTest.ArrayWithUniqueItemsListBuilder](#arraywithuniqueitemslistbuilder)<br> builder for List payloads |
| static class | [FormatTest.ArrayWithUniqueItemsList](#arraywithuniqueitemslist)<br> output class for List payloads |
| static class | [FormatTest.Items](#items)<br> schema class |
| static class | [FormatTest.Float64](#float64)<br> schema class |
| static class | [FormatTest.DoubleSchema](#doubleschema)<br> schema class |
| static class | [FormatTest.Float32](#float32)<br> schema class |
| static class | [FormatTest.FloatSchema](#floatschema)<br> schema class |
| static class | [FormatTest.NumberSchema](#numberschema)<br> schema class |
| static class | [FormatTest.Int64](#int64)<br> schema class |
| static class | [FormatTest.Int32withValidations](#int32withvalidations)<br> schema class |
| static class | [FormatTest.Int32](#int32)<br> schema class |
| static class | [FormatTest.IntegerSchema](#integerschema)<br> schema class |

## FormatTest1
public static class FormatTest1<br>
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
FormatTest.FormatTestMap validatedPayload =
    FormatTest.FormatTest1.validate(
    new FormatTest.FormatTestMapBuilder()
        .setByte("a")

        .date("2020-12-13")

        .setNumber(1)

        .password("a")

        .setInteger(1)

        .int32(1)

        .int32withValidations(1)

        .int64(1L)

        .setFloat(3.14f)

        .float32(3.14f)

        .setDouble(3.14d)

        .float64(3.14d)

        .arrayWithUniqueItems(
            Arrays.asList(
                1
            )
        )
        .setString("A")

        .binary("a")

        .dateTime("1970-01-01T00:00:00.00Z")

        .setUuid("046b6c7f-0b8a-43b9-b35d-6489e6daee91")

        .uuidNoExample("046b6c7f-0b8a-43b9-b35d-6489e6daee91")

        .pattern_with_digits("0480728880")

        .pattern_with_digits_and_delimiter("IMage_88")

        .noneProp(null)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("integer", [IntegerSchema.class](#integerschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Int32.class](#int32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32withValidations", [Int32withValidations.class](#int32withvalidations))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int64", [Int64.class](#int64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number", [NumberSchema.class](#numberschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float", [FloatSchema.class](#floatschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float32", [Float32.class](#float32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("double", [DoubleSchema.class](#doubleschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float64", [Float64.class](#float64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("arrayWithUniqueItems", [ArrayWithUniqueItems.class](#arraywithuniqueitems))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("string", [StringSchema.class](#stringschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("byte", [ByteSchema.class](#byteschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("binary", [Binary.class](#binary))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date", [Date.class](#date))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("dateTime", [DateTime.class](#datetime))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("uuid", [UuidSchema.class](#uuidschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("uuidNoExample", [UuidNoExample.class](#uuidnoexample))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("password", [Password.class](#password))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pattern_with_digits", [PatternWithDigits.class](#patternwithdigits))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pattern_with_digits_and_delimiter", [PatternWithDigitsAndDelimiter.class](#patternwithdigitsanddelimiter))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("noneProp", [NoneProp.class](#noneprop)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"byte",<br>&nbsp;&nbsp;&nbsp;&nbsp;"date",<br>&nbsp;&nbsp;&nbsp;&nbsp;"number",<br>&nbsp;&nbsp;&nbsp;&nbsp;"password"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap](#formattestmap) | validate([Map&lt;?, ?&gt;](#formattestmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FormatTestMap0000Builder
public class FormatTestMap0000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap0000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setInteger(int value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setInteger(float value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setInteger(long value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setInteger(double value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | int32(int value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | int32(float value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | int32withValidations(int value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | int32withValidations(float value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | int64(int value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | int64(float value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | int64(long value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | int64(double value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setFloat(int value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setFloat(float value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setFloat(long value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setFloat(double value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | float32(int value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | float32(float value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | float32(long value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | float32(double value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setDouble(int value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setDouble(float value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setDouble(long value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setDouble(double value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | float64(int value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | float64(float value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | float64(long value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | float64(double value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | arrayWithUniqueItems(List<Number> value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setString(String value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | binary(String value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | dateTime(String value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setUuid(String value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | uuidNoExample(String value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | pattern_with_digits(String value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | pattern_with_digits_and_delimiter(String value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | noneProp(Void value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | additionalProperty(String key, Void value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | additionalProperty(String key, boolean value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | additionalProperty(String key, String value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | additionalProperty(String key, int value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | additionalProperty(String key, float value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | additionalProperty(String key, long value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | additionalProperty(String key, double value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | additionalProperty(String key, List<?> value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | additionalProperty(String key, Map<String, ?> value) |

## FormatTestMap0001Builder
public class FormatTestMap0001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap0001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0000Builder](#formattestmap0000builder) | password(String value) |

## FormatTestMap0010Builder
public class FormatTestMap0010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap0010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setNumber(int value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setNumber(float value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setNumber(long value) |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setNumber(double value) |

## FormatTestMap0011Builder
public class FormatTestMap0011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap0011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0001Builder](#formattestmap0001builder) | setNumber(int value) |
| [FormatTestMap0001Builder](#formattestmap0001builder) | setNumber(float value) |
| [FormatTestMap0001Builder](#formattestmap0001builder) | setNumber(long value) |
| [FormatTestMap0001Builder](#formattestmap0001builder) | setNumber(double value) |
| [FormatTestMap0010Builder](#formattestmap0010builder) | password(String value) |

## FormatTestMap0100Builder
public class FormatTestMap0100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap0100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0000Builder](#formattestmap0000builder) | date(String value) |

## FormatTestMap0101Builder
public class FormatTestMap0101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap0101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0001Builder](#formattestmap0001builder) | date(String value) |
| [FormatTestMap0100Builder](#formattestmap0100builder) | password(String value) |

## FormatTestMap0110Builder
public class FormatTestMap0110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap0110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0010Builder](#formattestmap0010builder) | date(String value) |
| [FormatTestMap0100Builder](#formattestmap0100builder) | setNumber(int value) |
| [FormatTestMap0100Builder](#formattestmap0100builder) | setNumber(float value) |
| [FormatTestMap0100Builder](#formattestmap0100builder) | setNumber(long value) |
| [FormatTestMap0100Builder](#formattestmap0100builder) | setNumber(double value) |

## FormatTestMap0111Builder
public class FormatTestMap0111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap0111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0011Builder](#formattestmap0011builder) | date(String value) |
| [FormatTestMap0101Builder](#formattestmap0101builder) | setNumber(int value) |
| [FormatTestMap0101Builder](#formattestmap0101builder) | setNumber(float value) |
| [FormatTestMap0101Builder](#formattestmap0101builder) | setNumber(long value) |
| [FormatTestMap0101Builder](#formattestmap0101builder) | setNumber(double value) |
| [FormatTestMap0110Builder](#formattestmap0110builder) | password(String value) |

## FormatTestMap1000Builder
public class FormatTestMap1000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap1000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0000Builder](#formattestmap0000builder) | setByte(String value) |

## FormatTestMap1001Builder
public class FormatTestMap1001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap1001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0001Builder](#formattestmap0001builder) | setByte(String value) |
| [FormatTestMap1000Builder](#formattestmap1000builder) | password(String value) |

## FormatTestMap1010Builder
public class FormatTestMap1010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap1010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0010Builder](#formattestmap0010builder) | setByte(String value) |
| [FormatTestMap1000Builder](#formattestmap1000builder) | setNumber(int value) |
| [FormatTestMap1000Builder](#formattestmap1000builder) | setNumber(float value) |
| [FormatTestMap1000Builder](#formattestmap1000builder) | setNumber(long value) |
| [FormatTestMap1000Builder](#formattestmap1000builder) | setNumber(double value) |

## FormatTestMap1011Builder
public class FormatTestMap1011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap1011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0011Builder](#formattestmap0011builder) | setByte(String value) |
| [FormatTestMap1001Builder](#formattestmap1001builder) | setNumber(int value) |
| [FormatTestMap1001Builder](#formattestmap1001builder) | setNumber(float value) |
| [FormatTestMap1001Builder](#formattestmap1001builder) | setNumber(long value) |
| [FormatTestMap1001Builder](#formattestmap1001builder) | setNumber(double value) |
| [FormatTestMap1010Builder](#formattestmap1010builder) | password(String value) |

## FormatTestMap1100Builder
public class FormatTestMap1100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap1100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0100Builder](#formattestmap0100builder) | setByte(String value) |
| [FormatTestMap1000Builder](#formattestmap1000builder) | date(String value) |

## FormatTestMap1101Builder
public class FormatTestMap1101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap1101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0101Builder](#formattestmap0101builder) | setByte(String value) |
| [FormatTestMap1001Builder](#formattestmap1001builder) | date(String value) |
| [FormatTestMap1100Builder](#formattestmap1100builder) | password(String value) |

## FormatTestMap1110Builder
public class FormatTestMap1110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMap1110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0110Builder](#formattestmap0110builder) | setByte(String value) |
| [FormatTestMap1010Builder](#formattestmap1010builder) | date(String value) |
| [FormatTestMap1100Builder](#formattestmap1100builder) | setNumber(int value) |
| [FormatTestMap1100Builder](#formattestmap1100builder) | setNumber(float value) |
| [FormatTestMap1100Builder](#formattestmap1100builder) | setNumber(long value) |
| [FormatTestMap1100Builder](#formattestmap1100builder) | setNumber(double value) |

## FormatTestMapBuilder
public class FormatTestMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FormatTestMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FormatTestMap0111Builder](#formattestmap0111builder) | setByte(String value) |
| [FormatTestMap1011Builder](#formattestmap1011builder) | date(String value) |
| [FormatTestMap1101Builder](#formattestmap1101builder) | setNumber(int value) |
| [FormatTestMap1101Builder](#formattestmap1101builder) | setNumber(float value) |
| [FormatTestMap1101Builder](#formattestmap1101builder) | setNumber(long value) |
| [FormatTestMap1101Builder](#formattestmap1101builder) | setNumber(double value) |
| [FormatTestMap1110Builder](#formattestmap1110builder) | password(String value) |

## FormatTestMap
public static class FormatTestMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FormatTestMap](#formattestmap) | of([Map<String, ? extends @Nullable Object>](#formattestmapbuilder) arg, SchemaConfiguration configuration) |
| String | date()<br> value must conform to RFC-3339 full-date YYYY-MM-DD |
| String | password()<br> |
| Number | int32()<br>[optional] value must be a 32 bit integer |
| Number | int32withValidations()<br>[optional] value must be a 32 bit integer |
| Number | int64()<br>[optional] value must be a 64 bit integer |
| Number | float32()<br>[optional] value must be a 32 bit float |
| Number | float64()<br>[optional] value must be a 64 bit float |
| [ArrayWithUniqueItemsList](#arraywithuniqueitemslist) | arrayWithUniqueItems()<br>[optional] |
| String | binary()<br>[optional] |
| String | dateTime()<br>[optional] value must conform to RFC-3339 date-time |
| String | uuidNoExample()<br>[optional] value must be a uuid |
| String | pattern_with_digits()<br>[optional] |
| String | pattern_with_digits_and_delimiter()<br>[optional] |
| Void | noneProp()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["byte"], instance["number"], instance["integer"], instance["float"], instance["double"], instance["string"], instance["uuid"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## NoneProp
public static class NoneProp<br>
extends NullJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## PatternWithDigitsAndDelimiter
public static class PatternWithDigitsAndDelimiter<br>
extends JsonSchema

A schema class that validates payloads

## Description
A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01.

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
String validatedPayload = FormatTest.PatternWithDigitsAndDelimiter.validate(
    "IMage_88",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern =<br>&nbsp;&nbsp;&nbsp;&nbsp;"^image_\\d{1,3}$",<br>&nbsp;&nbsp;&nbsp;&nbsp;Pattern.CASE_INSENSITIVE<br>)))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## PatternWithDigits
public static class PatternWithDigits<br>
extends JsonSchema

A schema class that validates payloads

## Description
A string that is a 10 digit number. Can have leading zeros.

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
String validatedPayload = FormatTest.PatternWithDigits.validate(
    "0480728880",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern =<br>&nbsp;&nbsp;&nbsp;&nbsp;"^\\d{10}$"<br>)))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Password
public static class Password<br>
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

// String validation
String validatedPayload = FormatTest.Password.validate(
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## UuidNoExample
public static class UuidNoExample<br>
extends UuidJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.UuidJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## UuidSchema
public static class UuidSchema<br>
extends UuidJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.UuidJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## DateTime
public static class DateTime<br>
extends DateTimeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateTimeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Date
public static class Date<br>
extends DateJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Binary
public static class Binary<br>
extends JsonSchema

A schema class that validates payloads

## ByteSchema
public static class ByteSchema<br>
extends StringJsonSchema

A schema class that validates payloads

## StringSchema
public static class StringSchema<br>
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

// String validation
String validatedPayload = FormatTest.StringSchema.validate(
    "A",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern =<br>&nbsp;&nbsp;&nbsp;&nbsp;"[a-z]",<br>&nbsp;&nbsp;&nbsp;&nbsp;Pattern.CASE_INSENSITIVE<br>)))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayWithUniqueItems
public static class ArrayWithUniqueItems<br>
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

// List validation
FormatTest.ArrayWithUniqueItemsList validatedPayload =
    FormatTest.ArrayWithUniqueItems.validate(
    new FormatTest.ArrayWithUniqueItemsListBuilder()
        .add(1)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items.class](#items) |
| Boolean | uniqueItems = true |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayWithUniqueItemsList](#arraywithuniqueitemslist) | validate([List<?>](#arraywithuniqueitemslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayWithUniqueItemsListBuilder
public class ArrayWithUniqueItemsListBuilder<br>
builder for `List<Number>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayWithUniqueItemsListBuilder()<br>Creates an empty list |
| ArrayWithUniqueItemsListBuilder(List<Number> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayWithUniqueItemsListBuilder | add(int item) |
| ArrayWithUniqueItemsListBuilder | add(float item) |
| ArrayWithUniqueItemsListBuilder | add(long item) |
| ArrayWithUniqueItemsListBuilder | add(double item) |
| List<Number> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayWithUniqueItemsList
public class ArrayWithUniqueItemsList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayWithUniqueItemsList](#arraywithuniqueitemslist) | of([List<Number>](#arraywithuniqueitemslistbuilder) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Float64
public static class Float64<br>
extends DoubleJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DoubleJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## DoubleSchema
public static class DoubleSchema<br>
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

// double validation
double validatedPayload = FormatTest.DoubleSchema.validate(
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Float32
public static class Float32<br>
extends FloatJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.FloatJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## FloatSchema
public static class FloatSchema<br>
extends JsonSchema

A schema class that validates payloads

## Description
this is a reserved python keyword

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
float validatedPayload = FormatTest.FloatSchema.validate(
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
| Number | minimum = 54.3 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| float | validate(float arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NumberSchema
public static class NumberSchema<br>
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

// int validation
int validatedPayload = FormatTest.NumberSchema.validate(
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
| BigDecimal | multipleOf = new BigDecimal("32.5") |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Int64
public static class Int64<br>
extends Int64JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Int32withValidations
public static class Int32withValidations<br>
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

// int validation
int validatedPayload = FormatTest.Int32withValidations.validate(
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Int32
public static class Int32<br>
extends Int32JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## IntegerSchema
public static class IntegerSchema<br>
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

// int validation
int validatedPayload = FormatTest.IntegerSchema.validate(
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
| BigDecimal | multipleOf = new BigDecimal("2") |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
