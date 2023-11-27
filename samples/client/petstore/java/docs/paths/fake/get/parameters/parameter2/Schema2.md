# Schema2
org.openapijsonschematools.paths.fake.get.parameters.parameter2.Schema2.java
public class Schema2

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema2.Schema21<br> schema class |
| static class | Schema2.SchemaList2<br> output class for List payloads |
| static class | Schema2.Items2<br> schema class |

## Schema21
public class Schema21
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList2](#schemalist2) | validate(List<String> arg, SchemaConfiguration configuration) |

## SchemaList2
public class SchemaList2
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
String |  | must be one of [">", "$"] if omitted the server will use the default value of $

## Items2
public class Items2
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
