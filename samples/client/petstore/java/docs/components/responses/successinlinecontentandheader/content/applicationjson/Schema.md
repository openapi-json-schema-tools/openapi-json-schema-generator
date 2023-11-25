# Schema
org.openapijsonschematools.components.responses.successinlinecontentandheader.content.applicationjson.Schema.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema.AdditionalProperties<br> schema class |
| static class | Schema.SchemaMap<br> output class for Map payloads |
| static class | Schema.Schema1<br> schema class |

## Schema1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | validate(Map<String, Integer> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | int | any string name can be used but the value must be the correct type | [optional] value must be a 32 bit integer

## SchemaMap
```
base class: FrozenMap<String, Integer>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | of(Map<String, Integer> arg, SchemaConfiguration configuration) |
| int | getAdditionalProperty(String name)<br>provides type safety for additional properties |
