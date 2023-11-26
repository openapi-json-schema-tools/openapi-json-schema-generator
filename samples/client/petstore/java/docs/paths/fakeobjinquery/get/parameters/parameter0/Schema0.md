# Schema0
org.openapijsonschematools.paths.fakeobjinquery.get.parameters.parameter0.Schema0.java
public class Schema0

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema0.Schema01<br> schema class |
| static class | Schema0.SchemaMap0<br> output class for Map payloads |
| static class | Schema0.Keyword0<br> schema class |

## Schema01
public class Schema01
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap0 | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**keyword** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap0
public class SchemaMap0
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap0 | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | keyword()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |
