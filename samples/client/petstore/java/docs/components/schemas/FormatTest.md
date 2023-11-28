# FormatTest
org.openapijsonschematools.components.schemas.FormatTest.java
public class FormatTest

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

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
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
    new PropertyEntry("integer", IntegerSchema.class),
    new PropertyEntry("int32", Int32.class),
    new PropertyEntry("int32withValidations", Int32withValidations.class),
    new PropertyEntry("int64", Int64.class),
    new PropertyEntry("number", NumberSchema.class),
    new PropertyEntry("float", FloatSchema.class),
    new PropertyEntry("float32", Float32.class),
    new PropertyEntry("double", DoubleSchema.class),
    new PropertyEntry("float64", Float64.class),
    new PropertyEntry("arrayWithUniqueItems", ArrayWithUniqueItems.class),
    new PropertyEntry("string", StringSchema.class),
    new PropertyEntry("byte", ByteSchema.class),
    new PropertyEntry("binary", Binary.class),
    new PropertyEntry("date", Date.class),
    new PropertyEntry("dateTime", DateTime.class),
    new PropertyEntry("uuid", UuidSchema.class),
    new PropertyEntry("uuidNoExample", UuidNoExample.class),
    new PropertyEntry("password", Password.class),
    new PropertyEntry("pattern_with_digits", PatternWithDigits.class),
    new PropertyEntry("pattern_with_digits_and_delimiter", PatternWithDigitsAndDelimiter.class),
    new PropertyEntry("noneProp", NoneProp.class)
))),
new KeywordEntry("required", new RequiredValidator(Set.of(
    "byte",
    "date",
    "number",
    "password"
)))
));</code> |

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
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["byte"], instance["number"], instance["integer"], instance["float"], instance["double"], instance["string"], instance["uuid"],  |
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
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |

## PatternWithDigitsAndDelimiter
public static class PatternWithDigitsAndDelimiter<br>
extends JsonSchema

A schema class that validates payloads

## Description
A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01.
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(    String.class<br>)))));</code> |

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
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(    String.class<br>)))));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Password
public static class Password<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(    String.class<br>))),new KeywordEntry("format", new FormatValidator("password"))<br>
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## UuidNoExample
public static class UuidNoExample<br>
extends UuidJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## UuidSchema
public static class UuidSchema<br>
extends UuidJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## DateTime
public static class DateTime<br>
extends DateTimeJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Date
public static class Date<br>
extends DateJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Binary
public static class Binary<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static BinaryString | validate(BinaryString arg, SchemaConfiguration configuration) |

## ByteSchema
public static class ByteSchema<br>
extends StringJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## StringSchema
public static class StringSchema<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(    String.class<br>)))));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## ArrayWithUniqueItems
public static class ArrayWithUniqueItems<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br>new KeywordEntry("items", new ItemsValidator(Items.class))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayWithUniqueItemsList](#arraywithuniqueitemslist) | validate(List<Number> arg, SchemaConfiguration configuration) |

## ArrayWithUniqueItemsList
public class ArrayWithUniqueItemsList<br>
extends FrozenList<Number>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayWithUniqueItemsList](#arraywithuniqueitemslist) | of(List<Number> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Number>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Number |  |

## Items
public static class Items<br>
extends NumberJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## Float64
public static class Float64<br>
extends DoubleJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static double | validate(double arg, SchemaConfiguration configuration) |

## DoubleSchema
public static class DoubleSchema<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(    Integer.class,<br>Long.class,<br>Float.class,<br>Double.class<br>))),new KeywordEntry("format", new FormatValidator("double"))<br>
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static double | validate(double arg, SchemaConfiguration configuration) |

## Float32
public static class Float32<br>
extends FloatJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static float | validate(float arg, SchemaConfiguration configuration) |

## FloatSchema
public static class FloatSchema<br>
extends JsonSchema

A schema class that validates payloads

## Description
this is a reserved python keyword
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(    Integer.class,<br>Long.class,<br>Float.class,<br>Double.class<br>))),new KeywordEntry("format", new FormatValidator("float"))<br>
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static float | validate(float arg, SchemaConfiguration configuration) |

## NumberSchema
public static class NumberSchema<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(    Integer.class,<br>Long.class,<br>Float.class,<br>Double.class<br>)))));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## Int64
public static class Int64<br>
extends Int64JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

## Int32withValidations
public static class Int32withValidations<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(    Integer.class,<br>Long.class,<br>Float.class,<br>Double.class<br>))),new KeywordEntry("format", new FormatValidator("int32"))<br>
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static int | validate(int arg, SchemaConfiguration configuration) |

## Int32
public static class Int32<br>
extends Int32JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static int | validate(int arg, SchemaConfiguration configuration) |

## IntegerSchema
public static class IntegerSchema<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(    Integer.class,<br>Long.class,<br>Float.class,<br>Double.class<br>)))));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
