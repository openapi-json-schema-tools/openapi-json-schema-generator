# Schema1
org.openapijsonschematools.paths.fakejsonformdata.get.requestbody.content.applicationxwwwformurlencoded.Schema.java
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
**param** | String | field1 |
**param2** | String | field2 |
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## SchemaMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | param()<br> |
| String | param2()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |
