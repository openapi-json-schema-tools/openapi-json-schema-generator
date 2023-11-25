# Schema3
org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter3.Schema3.java
public class Schema3

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema3.Items3<br> schema class |
| static class | Schema3.SchemaList3<br> output class for List payloads |
| static class | Schema3.Schema31<br> schema class |

## Schema31
public class Schema31
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaList3 | validate(List<String> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<String>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  |

## SchemaList3
public class SchemaList3
extends FrozenList<String>

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
