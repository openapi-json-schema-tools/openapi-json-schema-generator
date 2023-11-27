# AnyTypeAndFormat
org.openapijsonschematools.components.schemas.AnyTypeAndFormat.java
public class AnyTypeAndFormat

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AnyTypeAndFormat.AnyTypeAndFormat1](#anytypeandformat1)<br> schema class |
| static class | [AnyTypeAndFormat.AnyTypeAndFormatMap](#anytypeandformatmap)<br> output class for Map payloads |
| static class | [AnyTypeAndFormat.FloatSchema](#floatschema)<br> schema class |
| static class | [AnyTypeAndFormat.DoubleSchema](#doubleschema)<br> schema class |
| static class | [AnyTypeAndFormat.Int64](#int64)<br> schema class |
| static class | [AnyTypeAndFormat.Int32](#int32)<br> schema class |
| static class | [AnyTypeAndFormat.Binary](#binary)<br> schema class |
| static class | [AnyTypeAndFormat.NumberSchema](#numberschema)<br> schema class |
| static class | [AnyTypeAndFormat.Datetime](#datetime)<br> schema class |
| static class | [AnyTypeAndFormat.Date](#date)<br> schema class |
| static class | [AnyTypeAndFormat.UuidSchema](#uuidschema)<br> schema class |

## AnyTypeAndFormat1
public static class AnyTypeAndFormat1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AnyTypeAndFormatMap](#anytypeandformatmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## AnyTypeAndFormatMap
public static class AnyTypeAndFormatMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AnyTypeAndFormatMap](#anytypeandformatmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | date()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| Object | binary()<br>[optional] |
| Object | int32()<br>[optional] value must be a 32 bit integer |
| Object | int64()<br>[optional] value must be a 64 bit integer |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["uuid"], instance["date-time"], instance["number"], instance["double"], instance["float"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **uuid** | Object |  | [optional] value must be a uuid |
| **date** | Object |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| **date-time** | Object |  | [optional] value must conform to RFC-3339 date-time |
| **number** | Object |  | [optional] value must be int or float numeric |
| **binary** | Object |  | [optional] |
| **int32** | Object |  | [optional] value must be a 32 bit integer |
| **int64** | Object |  | [optional] value must be a 64 bit integer |
| **double** | Object |  | [optional] value must be a 64 bit float |
| **float** | Object |  | [optional] value must be a 32 bit float |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## FloatSchema
public static class FloatSchema
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## DoubleSchema
public static class DoubleSchema
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## Int64
public static class Int64
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## Int32
public static class Int32
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## Binary
public static class Binary
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## NumberSchema
public static class NumberSchema
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## Datetime
public static class Datetime
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## Date
public static class Date
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## UuidSchema
public static class UuidSchema
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
