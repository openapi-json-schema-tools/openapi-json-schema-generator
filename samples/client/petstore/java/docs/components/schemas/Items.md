# Items
org.openapijsonschematools.components.schemas.Items.java
public class Items

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Items.Items1](#items1)<br> schema class |
| static class | [Items.ItemsList](#itemslist)<br> output class for List payloads |
| static class | [Items.Items2](#items2)<br> schema class |

## Items1
public static class Items1<br>
extends JsonSchema

A schema class that validates payloads

## Description
component&#x27;s name collides with the inner schema name

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## ItemsList
public class ItemsList<br>
extends FrozenList<FrozenMap<String, Object>>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | of(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## Items2
public static class Items2<br>
extends MapJsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
