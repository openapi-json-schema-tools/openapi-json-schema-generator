# BananaReq
org.openapijsonschematools.components.schemas.BananaReq.java
public class BananaReq

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [BananaReq.BananaReq1](#bananareq1)<br> schema class |
| static class | [BananaReq.BananaReqMap](#bananareqmap)<br> output class for Map payloads |
| static class | [BananaReq.Sweet](#sweet)<br> schema class |
| static class | [BananaReq.LengthCm](#lengthcm)<br> schema class |
| static class | [BananaReq.AdditionalProperties](#additionalproperties)<br> schema class |

## BananaReq1
public static class BananaReq1<br>
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BananaReqMap](#bananareqmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## BananaReqMap
public static class BananaReqMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BananaReqMap](#bananareqmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | lengthCm()<br> |
| boolean | sweet()<br>[optional] |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **lengthCm** | Number |  | |
| **sweet** | boolean |  | [optional] |

## Sweet
public static class Sweet<br>
extends BooleanJsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |

## LengthCm
public static class LengthCm<br>
extends NumberJsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

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
