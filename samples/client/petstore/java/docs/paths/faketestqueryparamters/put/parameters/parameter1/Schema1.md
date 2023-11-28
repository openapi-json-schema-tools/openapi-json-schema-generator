# Schema1
org.openapijsonschematools.paths.faketestqueryparamters.put.parameters.parameter1.Schema1.java
public class Schema1

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema1.Schema11](#schema11)<br> schema class |
| static class | [Schema1.SchemaList1](#schemalist1)<br> output class for List payloads |
| static class | [Schema1.Items1](#items1)<br> schema class |

## Schema11
public static class Schema11<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br>new KeywordEntry("items", new ItemsValidator(Items1.class))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList1](#schemalist1) | validate(List<String> arg, SchemaConfiguration configuration) |

## SchemaList1
public class SchemaList1<br>
extends FrozenList<String>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList1](#schemalist1) | of(List<String> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<String>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  |

## Items1
public static class Items1<br>
extends StringJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
