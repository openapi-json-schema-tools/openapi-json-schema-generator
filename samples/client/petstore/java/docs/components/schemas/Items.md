# Items
org.openapijsonschematools.components.schemas.Items.java
public class Items

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Items.Items1<br> schema class |
| static class | Items.ItemsList<br> output class for List payloads |
| static class | Items.Items2<br> schema class |

## Items1
public class Items1
extends JsonSchema

A schema class that validates payloads

## Description
component&#x27;s name collides with the inner schema name

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ItemsList | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## ItemsList
public class ItemsList
extends FrozenList<FrozenMap<String, Object>>

A class to store validated List payloads

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## Items2
public class Items2
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [](#) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
