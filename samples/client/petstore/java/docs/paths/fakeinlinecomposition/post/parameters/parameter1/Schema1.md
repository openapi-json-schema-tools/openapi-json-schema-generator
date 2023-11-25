# Schema11
org.openapijsonschematools.paths.fakeinlinecomposition.post.parameters.parameter1.Schema1.java
```
type: JsonSchema
```

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
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SchemaMap1 | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | someProp()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

