# Schema01
org.openapijsonschematools.paths.fakeobjinquery.get.parameters.parameter0.Schema0.java
```
type: JsonSchema
```

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
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap0 | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | keyword()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |
