# Schema1
org.openapijsonschematools.paths.petpetiduploadimage.post.requestbody.content.multipartformdata.Schema.java
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
**additionalMetadata** | String | Additional data to pass to server | [optional]
**file** | String | file to upload | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | additionalMetadata()<br>[optional] |
| String | file()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |
