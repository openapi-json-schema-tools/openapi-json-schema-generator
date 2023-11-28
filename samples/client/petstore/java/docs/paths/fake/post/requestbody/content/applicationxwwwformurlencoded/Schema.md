# Schema
org.openapijsonschematools.paths.fake.post.requestbody.content.applicationxwwwformurlencoded.Schema.java
public class Schema

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1](#schema1)<br> schema class |
| static class | [Schema.SchemaMap](#schemamap)<br> output class for Map payloads |
| static class | [Schema.Callback](#callback)<br> schema class |
| static class | [Schema.Password](#password)<br> schema class |
| static class | [Schema.DateTime](#datetime)<br> schema class |
| static class | [Schema.Date](#date)<br> schema class |
| static class | [Schema.Binary](#binary)<br> schema class |
| static class | [Schema.ByteSchema](#byteschema)<br> schema class |
| static class | [Schema.PatternWithoutDelimiter](#patternwithoutdelimiter)<br> schema class |
| static class | [Schema.StringSchema](#stringschema)<br> schema class |
| static class | [Schema.DoubleSchema](#doubleschema)<br> schema class |
| static class | [Schema.FloatSchema](#floatschema)<br> schema class |
| static class | [Schema.NumberSchema](#numberschema)<br> schema class |
| static class | [Schema.Int64](#int64)<br> schema class |
| static class | [Schema.Int32](#int32)<br> schema class |
| static class | [Schema.IntegerSchema](#integerschema)<br> schema class |

## Schema1
public static class Schema1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("integer", [IntegerSchema.class](#integerschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Int32.class](#int32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int64", [Int64.class](#int64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number", [NumberSchema.class](#numberschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float", [FloatSchema.class](#floatschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("double", [DoubleSchema.class](#doubleschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("string", [StringSchema.class](#stringschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pattern_without_delimiter", [PatternWithoutDelimiter.class](#patternwithoutdelimiter))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("byte", [ByteSchema.class](#byteschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("binary", [Binary.class](#binary))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date", [Date.class](#date))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("dateTime", [DateTime.class](#datetime))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("password", [Password.class](#password))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("callback", [Callback.class](#callback)))<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"byte",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"double",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"number",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"pattern_without_delimiter"<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap](#schemamap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## SchemaMap
public static class SchemaMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap](#schemamap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | pattern_without_delimiter()<br> |
| int | int32()<br>[optional] value must be a 32 bit integer |
| long | int64()<br>[optional] value must be a 64 bit integer |
| String | binary()<br>[optional] |
| String | date()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| String | dateTime()<br>[optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time |
| String | password()<br>[optional] |
| String | callback()<br>[optional] |
| Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["byte"], instance["double"], instance["number"], instance["integer"], instance["float"], instance["string"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **byte** | String | None | |
| **double** | double | None | value must be a 64 bit float |
| **number** | Number | None | |
| **pattern_without_delimiter** | String | None | |
| **integer** | long | None | [optional] |
| **int32** | int | None | [optional] value must be a 32 bit integer |
| **int64** | long | None | [optional] value must be a 64 bit integer |
| **float** | float | None | [optional] value must be a 32 bit float |
| **string** | String | None | [optional] |
| **binary** | String | None | [optional] |
| **date** | String | None | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| **dateTime** | String | None | [optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time |
| **password** | String | None | [optional] |
| **callback** | String | None | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Callback
public static class Callback<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Password
public static class Password<br>
extends JsonSchema

A schema class that validates payloads

## Description
None
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("password"))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## DateTime
public static class DateTime<br>
extends JsonSchema

A schema class that validates payloads

## Description
None
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("date-time"))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Date
public static class Date<br>
extends DateJsonSchema

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.schemas.DateJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Binary
public static class Binary<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

## ByteSchema
public static class ByteSchema<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
None

## PatternWithoutDelimiter
public static class PatternWithoutDelimiter<br>
extends JsonSchema

A schema class that validates payloads

## Description
None
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## StringSchema
public static class StringSchema<br>
extends JsonSchema

A schema class that validates payloads

## Description
None
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## DoubleSchema
public static class DoubleSchema<br>
extends JsonSchema

A schema class that validates payloads

## Description
None
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("double"))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static double | validate(double arg, SchemaConfiguration configuration) |

## FloatSchema
public static class FloatSchema<br>
extends JsonSchema

A schema class that validates payloads

## Description
None
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("float"))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static float | validate(float arg, SchemaConfiguration configuration) |

## NumberSchema
public static class NumberSchema<br>
extends JsonSchema

A schema class that validates payloads

## Description
None
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## Int64
public static class Int64<br>
extends Int64JsonSchema

A schema class that validates payloads

## Description
None

## Int32
public static class Int32<br>
extends JsonSchema

A schema class that validates payloads

## Description
None
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("int32"))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static int | validate(int arg, SchemaConfiguration configuration) |

## IntegerSchema
public static class IntegerSchema<br>
extends JsonSchema

A schema class that validates payloads

## Description
None
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |
