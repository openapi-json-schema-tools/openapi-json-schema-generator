# Money
org.openapijsonschematools.components.schemas.Money.java
public class Money

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Money.Money1](#money1)<br> schema class |
| static class | [Money.MoneyMap](#moneymap)<br> output class for Map payloads |
| static class | [Money.Amount](#amount)<br> schema class |
| static class | [Money.AdditionalProperties](#additionalproperties)<br> schema class |

## Money1
public static class Money1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MoneyMap](#moneymap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## MoneyMap
public static class MoneyMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MoneyMap](#moneymap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | amount()<br> value must be int or float numeric |
| String | currency()<br> |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **amount** | String |  | value must be int or float numeric |
| **currency** | String |  | |

## Amount
public static class Amount
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## AdditionalProperties
public static class AdditionalProperties
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
