# SelfReferencingArrayModel
org.openapijsonschematools.components.schemas.SelfReferencingArrayModel.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | SelfReferencingArrayModel.SelfReferencingArrayModelList<br> output class for List payloads |
| static class | SelfReferencingArrayModel.SelfReferencingArrayModel1<br> schema class |

## SelfReferencingArrayModel1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SelfReferencingArrayModelList | validate(List<List> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<List>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List |  |

## SelfReferencingArrayModelList
```
base class: FrozenList<SelfReferencingArrayModelList>
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
