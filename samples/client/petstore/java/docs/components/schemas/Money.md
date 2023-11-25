# Money
org.openapijsonschematools.components.schemas.Money.java
public class Money

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Money.AdditionalProperties<br> schema class |
| static class | Money.Amount<br> schema class |
| static class | Money.MoneyMap<br> output class for Map payloads |
| static class | Money.Money1<br> schema class |

## Money1
public class Money1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MoneyMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | String |  | value must be int or float numeric
**currency** | String |  |

## MoneyMap
public class MoneyMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MoneyMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | amount()<br> value must be int or float numeric |
| String | currency()<br> |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
