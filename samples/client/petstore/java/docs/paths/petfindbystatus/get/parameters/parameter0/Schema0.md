# Schema0
org.openapijsonschematools.paths.petfindbystatus.get.parameters.parameter0.Schema0.java
public class Schema0

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema0.Schema01<br> schema class |
| static class | Schema0.SchemaList0<br> output class for List payloads |
| static class | Schema0.Items0<br> schema class |

## Schema01
public class Schema01
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList0](#schemalist0) | validate(List<String> arg, SchemaConfiguration configuration) |

## SchemaList0
public class SchemaList0
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
String |  | must be one of ["available", "pending", "sold"] if omitted the server will use the default value of available

## Items0
public class Items0
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
