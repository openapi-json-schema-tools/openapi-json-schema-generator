# FormatTest
org.openapijsonschematools.client.components.schemas.FormatTest.java
public class FormatTest

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to store list input interfaces, extends List

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [FormatTest.FormatTest1](#formattest1)<br> schema class |
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
| static class | [FormatTest.ArrayWithUniqueItemsListInput](#arraywithuniqueitemslistinput)<br> input class for List payloads |
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
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
FormatTest.FormatTestMap validatedPayload =
    FormatTest.FormatTest1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "byte",
            "a"
        ),
        new AbstractMap.SimpleEntry<>(
            "date",
            "2020-12-13"
        ),
        new AbstractMap.SimpleEntry<>(
            "number",
            1
        ),
        new AbstractMap.SimpleEntry<>(
            "password",
            "a"
        ),
        new AbstractMap.SimpleEntry<>(
            "integer",
            1L
        ),
        new AbstractMap.SimpleEntry<>(
            "int32",
            1
        ),
        new AbstractMap.SimpleEntry<>(
            "int32withValidations",
            1
        ),
        new AbstractMap.SimpleEntry<>(
            "int64",
            1L
        ),
        new AbstractMap.SimpleEntry<>(
            "float",
            3.14f
        ),
        new AbstractMap.SimpleEntry<>(
            "float32",
            3.14f
        ),
        new AbstractMap.SimpleEntry<>(
            "double",
            3.14d
        ),
        new AbstractMap.SimpleEntry<>(
            "float64",
            3.14d
        ),
        new AbstractMap.SimpleEntry<>(
            "arrayWithUniqueItems",
            Arrays.asList(
                1
            )
        ),
        new AbstractMap.SimpleEntry<>(
            "string",
            "A"
        ),
        new AbstractMap.SimpleEntry<>(
            "binary",
            "a"
        ),
        new AbstractMap.SimpleEntry<>(
            "dateTime",
            "1970-01-01T00:00:00.00Z"
        ),
        new AbstractMap.SimpleEntry<>(
            "uuid",
            "046b6c7f-0b8a-43b9-b35d-6489e6daee91"
        ),
        new AbstractMap.SimpleEntry<>(
            "uuidNoExample",
            "046b6c7f-0b8a-43b9-b35d-6489e6daee91"
        ),
        new AbstractMap.SimpleEntry<>(
            "pattern_with_digits",
            "0480728880"
        ),
        new AbstractMap.SimpleEntry<>(
            "pattern_with_digits_and_delimiter",
            "IMage_88"
        ),
        new AbstractMap.SimpleEntry<>(
            "noneProp",
            (Void) null
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("integer", [IntegerSchema.class](#integerschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Int32.class](#int32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32withValidations", [Int32withValidations.class](#int32withvalidations))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int64", [Int64.class](#int64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number", [NumberSchema.class](#numberschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float", [FloatSchema.class](#floatschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float32", [Float32.class](#float32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("double", [DoubleSchema.class](#doubleschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float64", [Float64.class](#float64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("arrayWithUniqueItems", [ArrayWithUniqueItems.class](#arraywithuniqueitems))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("string", [StringSchema.class](#stringschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("byte", [ByteSchema.class](#byteschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("binary", [Binary.class](#binary))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date", [Date.class](#date))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("dateTime", [DateTime.class](#datetime))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("uuid", [UuidSchema.class](#uuidschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("uuidNoExample", [UuidNoExample.class](#uuidnoexample))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("password", [Password.class](#password))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pattern_with_digits", [PatternWithDigits.class](#patternwithdigits))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pattern_with_digits_and_delimiter", [PatternWithDigitsAndDelimiter.class](#patternwithdigitsanddelimiter))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("noneProp", [NoneProp.class](#noneprop)))<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"byte",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"date",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"number",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"password"<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FormatTestMap](#formattestmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## FormatTestMap
public static class FormatTestMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FormatTestMap](#formattestmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | date()<br> value must conform to RFC-3339 full-date YYYY-MM-DD |
| String | password()<br> |
| int | int32()<br>[optional] value must be a 32 bit integer |
| int | int32withValidations()<br>[optional] value must be a 32 bit integer |
| long | int64()<br>[optional] value must be a 64 bit integer |
| float | float32()<br>[optional] value must be a 32 bit float |
| double | float64()<br>[optional] value must be a 64 bit float |
| [ArrayWithUniqueItemsList](#arraywithuniqueitemslist) | arrayWithUniqueItems()<br>[optional] |
| String | binary()<br>[optional] |
| String | dateTime()<br>[optional] value must conform to RFC-3339 date-time |
| String | uuidNoExample()<br>[optional] value must be a uuid |
| String | pattern_with_digits()<br>[optional] |
| String | pattern_with_digits_and_delimiter()<br>[optional] |
| Void | noneProp()<br>[optional] |
| Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["byte"], instance["number"], instance["integer"], instance["float"], instance["double"], instance["string"], instance["uuid"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **byte** | String |  | |
| **date** | String |  | value must conform to RFC-3339 full-date YYYY-MM-DD |
| **number** | Number |  | |
| **password** | String |  | |
| **integer** | long |  | [optional] |
| **int32** | int |  | [optional] value must be a 32 bit integer |
| **int32withValidations** | int |  | [optional] value must be a 32 bit integer |
| **int64** | long |  | [optional] value must be a 64 bit integer |
| **float** | float | this is a reserved python keyword | [optional] value must be a 32 bit float |
| **float32** | float |  | [optional] value must be a 32 bit float |
| **double** | double |  | [optional] value must be a 64 bit float |
| **float64** | double |  | [optional] value must be a 64 bit float |
| **arrayWithUniqueItems** | List<Number> |  | [optional] |
| **string** | String |  | [optional] |
| **binary** | String |  | [optional] |
| **dateTime** | String |  | [optional] value must conform to RFC-3339 date-time |
| **uuid** | String |  | [optional] value must be a uuid |
| **uuidNoExample** | String |  | [optional] value must be a uuid |
| **pattern_with_digits** | String | A string that is a 10 digit number. Can have leading zeros. | [optional] |
| **pattern_with_digits_and_delimiter** | String | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional] |
| **noneProp** | Void |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

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
import org.openapijsonschematools.client.schemas.MapMaker;
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("pattern", new PatternValidator(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"^image_\\d{1,3}$",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pattern.CASE_INSENSITIVE<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

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
import org.openapijsonschematools.client.schemas.MapMaker;
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("pattern", new PatternValidator(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"^\\d{10}$"<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Password
public static class Password<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("password")),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("maxLength", new MaxLengthValidator(64)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("minLength", new MinLengthValidator(10))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

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
import org.openapijsonschematools.client.schemas.MapMaker;
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("pattern", new PatternValidator(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"[a-z]",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pattern.CASE_INSENSITIVE<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## ArrayWithUniqueItems
public static class ArrayWithUniqueItems<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
FormatTest.ArrayWithUniqueItemsList validatedPayload =
    FormatTest.ArrayWithUniqueItems.validate(
    Arrays.asList(
        1
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items.class](#items))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("uniqueItems", new UniqueItemsValidator(true))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayWithUniqueItemsList](#arraywithuniqueitemslist) | validate([ArrayWithUniqueItemsListInput](#arraywithuniqueitemslistinput) arg, SchemaConfiguration configuration) |

## ArrayWithUniqueItemsListInput
public interface ArrayWithUniqueItemsListInput<br>
extends `List<Number>`

A class that describes the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Number |  |

## ArrayWithUniqueItemsList
public class ArrayWithUniqueItemsList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayWithUniqueItemsList](#arraywithuniqueitemslist) | of([ArrayWithUniqueItemsListInput](#arraywithuniqueitemslistinput) arg, SchemaConfiguration configuration) |

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
import org.openapijsonschematools.client.schemas.MapMaker;
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("double")),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("maximum", new MaximumValidator(123.4)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("minimum", new MinimumValidator(67.8))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static double | validate(double arg, SchemaConfiguration configuration) |

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
import org.openapijsonschematools.client.schemas.MapMaker;
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("float")),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("maximum", new MaximumValidator(987.6)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("minimum", new MinimumValidator(54.3))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static float | validate(float arg, SchemaConfiguration configuration) |

## NumberSchema
public static class NumberSchema<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("maximum", new MaximumValidator(543.2)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("minimum", new MinimumValidator(32.1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("multipleOf", new MultipleOfValidator(32.5))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

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
import org.openapijsonschematools.client.schemas.MapMaker;
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("int32")),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("maximum", new MaximumValidator(200)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("minimum", new MinimumValidator(20))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static int | validate(int arg, SchemaConfiguration configuration) |

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
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// long validation
long validatedPayload = FormatTest.IntegerSchema.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("maximum", new MaximumValidator(100)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("minimum", new MinimumValidator(10)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("multipleOf", new MultipleOfValidator(2))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
