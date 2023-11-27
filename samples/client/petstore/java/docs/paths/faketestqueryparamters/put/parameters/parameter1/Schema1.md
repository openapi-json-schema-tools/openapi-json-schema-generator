# Schema1
org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter1.Schema1.java
public class Schema1

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema1.Schema11<br> schema class |
| static class | Schema1.SchemaList1<br> output class for List payloads |
| static class | Schema1.Items1<br> schema class |

## Schema11
public class Schema11
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaList1 | validate(List<String> arg, SchemaConfiguration configuration) |

## SchemaList1
public class SchemaList1
extends FrozenList<String>

A class to store validated List payloads

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Input List Items
```
type: List<String>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  |

## Items1
public class Items1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
