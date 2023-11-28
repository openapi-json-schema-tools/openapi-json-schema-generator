# AppleReq
org.openapijsonschematools.components.schemas.AppleReq.java
public class AppleReq

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AppleReq.AppleReq1](#applereq1)<br> schema class |
| static class | [AppleReq.AppleReqMap](#applereqmap)<br> output class for Map payloads |
| static class | [AppleReq.Mealy](#mealy)<br> schema class |
| static class | [AppleReq.Cultivar](#cultivar)<br> schema class |
| static class | [AppleReq.AdditionalProperties](#additionalproperties)<br> schema class |

## AppleReq1
public static class AppleReq1<br>
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AppleReqMap](#applereqmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## AppleReqMap
public static class AppleReqMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AppleReqMap](#applereqmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | cultivar()<br> |
| boolean | mealy()<br>[optional] |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **cultivar** | String |  | |
| **mealy** | boolean |  | [optional] |

## Mealy
public static class Mealy<br>
extends BooleanJsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |

## Cultivar
public static class Cultivar<br>
extends StringJsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema
    // NotAnyTypeSchema

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
