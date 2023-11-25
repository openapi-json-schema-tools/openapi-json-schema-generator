# ArrayWithValidationsInItems
org.openapijsonschematools.components.schemas.ArrayWithValidationsInItems.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ArrayWithValidationsInItems.Items<br> schema class |
| static class | ArrayWithValidationsInItems.ArrayWithValidationsInItemsList<br> output class for List payloads |
| static class | ArrayWithValidationsInItems.ArrayWithValidationsInItems1<br> schema class |

## ArrayWithValidationsInItems1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayWithValidationsInItemsList | validate(List<Long> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Long>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Long |  | value must be a 64 bit integer

## ArrayWithValidationsInItemsList
```
base class: FrozenList<Long>
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
