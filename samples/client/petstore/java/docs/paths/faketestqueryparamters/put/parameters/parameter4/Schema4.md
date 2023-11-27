# Schema4
org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter4.Schema4.java
public class Schema4

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema4.Schema41](#schema41)<br> schema class |
| static class | [Schema4.SchemaList4](#schemalist4)<br> output class for List payloads |
| static class | [Schema4.Items4](#items4)<br> schema class |

## Schema41
public class Schema41
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList4](#schemalist4) | validate(List<String> arg, SchemaConfiguration configuration) |

## SchemaList4
public class SchemaList4
extends FrozenList<String>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaList4 | of(List<String> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<String>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  |

## Items4
public class Items4
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
