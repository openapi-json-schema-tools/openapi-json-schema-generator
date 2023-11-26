# SelfReferencingArrayModel
org.openapijsonschematools.components.schemas.SelfReferencingArrayModel.java
public class SelfReferencingArrayModel

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | SelfReferencingArrayModel.SelfReferencingArrayModel1<br> schema class |
| static class | SelfReferencingArrayModel.SelfReferencingArrayModelList<br> output class for List payloads |

## SelfReferencingArrayModel1
public class SelfReferencingArrayModel1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SelfReferencingArrayModelList | validate(List<List> arg, SchemaConfiguration configuration) |

## SelfReferencingArrayModelList
public class SelfReferencingArrayModelList
extends FrozenList<SelfReferencingArrayModelList>

A class to store validated List payloads

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Input List Items
```
type: List<List>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
