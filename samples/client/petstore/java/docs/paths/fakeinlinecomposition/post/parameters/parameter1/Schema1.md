# Schema1
org.openapijsonschematools.paths.fakeinlinecomposition.post.parameters.parameter1.Schema1.java
public class Schema1

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema1.Schema11<br> schema class |
| static class | Schema1.SchemaMap1<br> output class for Map payloads |
| static class | Schema1.SomeProp1<br> schema class |
| static class | Schema1.Schema01<br> schema class |

## Schema11
public class Schema11
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap1 | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**someProp** | Object |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap1
public class SchemaMap1
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap1 | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | someProp()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

