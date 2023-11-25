# JSONPatchRequest
org.openapijsonschematools.components.schemas.JSONPatchRequest.java
public class JSONPatchRequest

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | JSONPatchRequest.Items<br> schema class |
| static class | JSONPatchRequest.JSONPatchRequestList<br> output class for List payloads |
| static class | JSONPatchRequest.JSONPatchRequest1<br> schema class |

## JSONPatchRequest1
public class JSONPatchRequest1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static JSONPatchRequestList | validate(List<Object> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Object>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Object |  |

## JSONPatchRequestList
public class JSONPatchRequestList
extends FrozenList<Object>

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


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
