# ArrayWithValidationsInItems
org.openapijsonschematools.components.schemas.ArrayWithValidationsInItems.java
public class ArrayWithValidationsInItems

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ArrayWithValidationsInItems.ArrayWithValidationsInItems1<br> schema class |
| static class | ArrayWithValidationsInItems.ArrayWithValidationsInItemsList<br> output class for List payloads |
| static class | ArrayWithValidationsInItems.Items<br> schema class |

## ArrayWithValidationsInItems1
public class ArrayWithValidationsInItems1
extends JsonSchema

A schema class that validates payloads

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
public class ArrayWithValidationsInItemsList
extends FrozenList<Long>

A class to store validated List payloads

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | 
configuration | configurations.SchemaConfiguration

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Items
public class Items
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
