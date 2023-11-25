# Schema
org.openapijsonschematools.paths.fakemultiplerequestbodycontenttypes.post.requestbody.content.multipartformdata.Schema.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema.B<br> schema class |
| static class | Schema.SchemaMap<br> output class for Map payloads |
| static class | Schema.Schema1<br> schema class |

## Schema1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**b** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | b()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |
