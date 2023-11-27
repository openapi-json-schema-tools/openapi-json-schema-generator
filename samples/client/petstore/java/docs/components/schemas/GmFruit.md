# GmFruit
org.openapijsonschematools.components.schemas.GmFruit.java
public class GmFruit

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [GmFruit.GmFruit1](#gmfruit1)<br> schema class |
| static class | [GmFruit.GmFruitMap](#gmfruitmap)<br> output class for Map payloads |
| static class | [GmFruit.Color](#color)<br> schema class |

## GmFruit1
public static class GmFruit1
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
| static [GmFruitMap](#gmfruitmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## GmFruitMap
public static class GmFruitMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [GmFruitMap](#gmfruitmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | color()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **color** | String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Color
public static class Color
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
