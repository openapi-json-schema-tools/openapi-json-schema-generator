# Schema
org.openapijsonschematools.components.responses.successfulxmlandjsonarrayofpet.content.applicationxml.Schema.java
public class Schema

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1](#schema1)<br> schema class |
| static class | [Schema.SchemaList](#schemalist)<br> output class for List payloads |

## Schema1
public static class Schema1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br>new KeywordEntry("items", new ItemsValidator(Pet.Pet1.class))
)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList](#schemalist) | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## SchemaList
public class SchemaList<br>
extends FrozenList<Pet.PetMap>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList](#schemalist) | of(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |
