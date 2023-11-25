# ArrayHoldingAnyType
org.openapijsonschematools.components.schemas.ArrayHoldingAnyType.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ArrayHoldingAnyType.Items<br> schema class |
| static class | ArrayHoldingAnyType.ArrayHoldingAnyTypeList<br> output class for List payloads |
| static class | ArrayHoldingAnyType.ArrayHoldingAnyType1<br> schema class |

## ArrayHoldingAnyType1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayHoldingAnyTypeList | validate(List<Object> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Object>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Object | any type can be stored here |

## ArrayHoldingAnyTypeList
```
base class: FrozenList<Object>
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
