# Items
org.openapijsonschematools.components.schemas.Items.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Items.Items2<br> schema class |
| static class | Items.ItemsList<br> output class for List payloads |
| static class | Items.Items1<br> schema class |

## Items1
```
type: JsonSchema
```

## Description
component&#x27;s name collides with the inner schema name

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ItemsList | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## ItemsList
```
base class: FrozenList<FrozenMap<String, Object>>
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | 
configuration | configurations.SchemaConfiguration

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
