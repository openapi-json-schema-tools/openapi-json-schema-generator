# FormatTest
org.openapijsonschematools.components.schemas.FormatTest.java
public class FormatTest

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | FormatTest.FormatTest1<br> schema class |
| static class | FormatTest.FormatTestMap<br> output class for Map payloads |
| static class | FormatTest.NoneProp<br> schema class |
| static class | FormatTest.PatternWithDigitsAndDelimiter<br> schema class |
| static class | FormatTest.PatternWithDigits<br> schema class |
| static class | FormatTest.Password<br> schema class |
| static class | FormatTest.UuidNoExample<br> schema class |
| static class | FormatTest.UuidSchema<br> schema class |
| static class | FormatTest.DateTime<br> schema class |
| static class | FormatTest.Date<br> schema class |
| static class | FormatTest.Binary<br> schema class |
| static class | FormatTest.ByteSchema<br> schema class |
| static class | FormatTest.StringSchema<br> schema class |
| static class | FormatTest.ArrayWithUniqueItems<br> schema class |
| static class | FormatTest.ArrayWithUniqueItemsList<br> output class for List payloads |
| static class | FormatTest.Items<br> schema class |
| static class | FormatTest.Float64<br> schema class |
| static class | FormatTest.DoubleSchema<br> schema class |
| static class | FormatTest.Float32<br> schema class |
| static class | FormatTest.FloatSchema<br> schema class |
| static class | FormatTest.NumberSchema<br> schema class |
| static class | FormatTest.Int64<br> schema class |
| static class | FormatTest.Int32withValidations<br> schema class |
| static class | FormatTest.Int32<br> schema class |
| static class | FormatTest.IntegerSchema<br> schema class |

## FormatTest1
public class FormatTest1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FormatTestMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**byte** | String |  |
**date** | String |  | value must conform to RFC-3339 full-date YYYY-MM-DD
**number** | Number |  |
**password** | String |  |
**integer** | long |  | [optional]
**int32** | int |  | [optional] value must be a 32 bit integer
**int32withValidations** | int |  | [optional] value must be a 32 bit integer
**int64** | long |  | [optional] value must be a 64 bit integer
**float** | float | this is a reserved python keyword | [optional] value must be a 32 bit float
**float32** | float |  | [optional] value must be a 32 bit float
**double** | double |  | [optional] value must be a 64 bit float
**float64** | double |  | [optional] value must be a 64 bit float
**arrayWithUniqueItems** | List<Number> |  | [optional]
**string** | String |  | [optional]
**binary** | String |  | [optional]
**dateTime** | String |  | [optional] value must conform to RFC-3339 date-time
**uuid** | String |  | [optional] value must be a uuid
**uuidNoExample** | String |  | [optional] value must be a uuid
**pattern_with_digits** | String | A string that is a 10 digit number. Can have leading zeros. | [optional]
**pattern_with_digits_and_delimiter** | String | A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01. | [optional]
**noneProp** | Void |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## FormatTestMap
public class FormatTestMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FormatTestMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | date()<br> value must conform to RFC-3339 full-date YYYY-MM-DD |
| String | password()<br> |
| int | int32()<br>[optional] value must be a 32 bit integer |
| int | int32withValidations()<br>[optional] value must be a 32 bit integer |
| long | int64()<br>[optional] value must be a 64 bit integer |
| float | float32()<br>[optional] value must be a 32 bit float |
| double | float64()<br>[optional] value must be a 64 bit float |
| ArrayWithUniqueItemsList | arrayWithUniqueItems()<br>[optional] |
| String | binary()<br>[optional] |
| String | dateTime()<br>[optional] value must conform to RFC-3339 date-time |
| String | uuidNoExample()<br>[optional] value must be a uuid |
| String | pattern_with_digits()<br>[optional] |
| String | pattern_with_digits_and_delimiter()<br>[optional] |
| Void | noneProp()<br>[optional] |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["byte"], instance["number"], instance["integer"], instance["float"], instance["double"], instance["string"], instance["uuid"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## NoneProp
public class NoneProp
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |

## PatternWithDigitsAndDelimiter
public class PatternWithDigitsAndDelimiter
extends JsonSchema

A schema class that validates payloads

## Description
A string starting with &#x27;image_&#x27; (case insensitive) and one to three digits following i.e. Image_01.
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## PatternWithDigits
public class PatternWithDigits
extends JsonSchema

A schema class that validates payloads

## Description
A string that is a 10 digit number. Can have leading zeros.
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Password
public class Password
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## UuidNoExample
public class UuidNoExample
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## UuidSchema
public class UuidSchema
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## DateTime
public class DateTime
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Date
public class Date
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Binary
public class Binary
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static BinaryString | validate(BinaryString arg, SchemaConfiguration configuration) |

## ByteSchema
public class ByteSchema
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## StringSchema
public class StringSchema
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## ArrayWithUniqueItems
public class ArrayWithUniqueItems
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayWithUniqueItemsList | validate(List<Number> arg, SchemaConfiguration configuration) |

## ArrayWithUniqueItemsList
public class ArrayWithUniqueItemsList
extends FrozenList<Number>

A class to store validated List payloads

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Input List Items
```
type: List<Number>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Number |  |

## Items
public class Items
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## Float64
public class Float64
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static double | validate(double arg, SchemaConfiguration configuration) |

## DoubleSchema
public class DoubleSchema
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static double | validate(double arg, SchemaConfiguration configuration) |

## Float32
public class Float32
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static float | validate(float arg, SchemaConfiguration configuration) |

## FloatSchema
public class FloatSchema
extends JsonSchema

A schema class that validates payloads

## Description
this is a reserved python keyword
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static float | validate(float arg, SchemaConfiguration configuration) |

## NumberSchema
public class NumberSchema
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## Int64
public class Int64
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

## Int32withValidations
public class Int32withValidations
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static int | validate(int arg, SchemaConfiguration configuration) |

## Int32
public class Int32
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static int | validate(int arg, SchemaConfiguration configuration) |

## IntegerSchema
public class IntegerSchema
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
