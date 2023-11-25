# Schema
org.openapijsonschematools.paths.fakepetiduploadimagewithrequiredfile.post.requestbody.content.multipartformdata.Schema.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Schema.AdditionalMetadata<br> schema class |
| static class | Schema.RequiredFile<br> schema class |
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
**requiredFile** | String | file to upload |
**additionalMetadata** | String | Additional data to pass to server | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | requiredFile()<br> |
| String | additionalMetadata()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |
