# Schema
org.openapijsonschematools.paths.fake.post.requestbody.content.applicationxwwwformurlencoded.Schema.java
public class Schema

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema.Schema1<br> schema class |
| static class | Schema.SchemaMap<br> output class for Map payloads |
| static class | Schema.Callback<br> schema class |
| static class | Schema.Password<br> schema class |
| static class | Schema.DateTime<br> schema class |
| static class | Schema.Date<br> schema class |
| static class | Schema.Binary<br> schema class |
| static class | Schema.ByteSchema<br> schema class |
| static class | Schema.PatternWithoutDelimiter<br> schema class |
| static class | Schema.StringSchema<br> schema class |
| static class | Schema.DoubleSchema<br> schema class |
| static class | Schema.FloatSchema<br> schema class |
| static class | Schema.NumberSchema<br> schema class |
| static class | Schema.Int64<br> schema class |
| static class | Schema.Int32<br> schema class |
| static class | Schema.IntegerSchema<br> schema class |

## Schema1
public class Schema1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## SchemaMap
public class SchemaMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | pattern_without_delimiter()<br> |
| int | int32()<br>[optional] value must be a 32 bit integer |
| long | int64()<br>[optional] value must be a 64 bit integer |
| String | binary()<br>[optional] |
| String | date()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| String | dateTime()<br>[optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time |
| String | password()<br>[optional] |
| String | callback()<br>[optional] |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["byte"], instance["double"], instance["number"], instance["integer"], instance["float"], instance["string"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**byte** | String | None |
**double** | double | None | value must be a 64 bit float
**number** | Number | None |
**pattern_without_delimiter** | String | None |
**integer** | long | None | [optional]
**int32** | int | None | [optional] value must be a 32 bit integer
**int64** | long | None | [optional] value must be a 64 bit integer
**float** | float | None | [optional] value must be a 32 bit float
**string** | String | None | [optional]
**binary** | String | None | [optional]
**date** | String | None | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**dateTime** | String | None | [optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time
**password** | String | None | [optional]
**callback** | String | None | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## Callback
public class Callback
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Password
public class Password
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## DateTime
public class DateTime
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Date
public class Date
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Binary
public class Binary
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static BinaryString | validate(BinaryString arg, SchemaConfiguration configuration) |

## ByteSchema
public class ByteSchema
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## PatternWithoutDelimiter
public class PatternWithoutDelimiter
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## StringSchema
public class StringSchema
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## DoubleSchema
public class DoubleSchema
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static double | validate(double arg, SchemaConfiguration configuration) |

## FloatSchema
public class FloatSchema
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static float | validate(float arg, SchemaConfiguration configuration) |

## NumberSchema
public class NumberSchema
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## Int64
public class Int64
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

## Int32
public class Int32
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static int | validate(int arg, SchemaConfiguration configuration) |

## IntegerSchema
public class IntegerSchema
extends JsonSchema

A schema class that validates payloads

## Description
None
## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |
