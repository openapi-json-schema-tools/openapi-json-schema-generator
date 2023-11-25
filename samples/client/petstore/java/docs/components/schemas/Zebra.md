# Zebra1
org.openapijsonschematools.components.schemas.Zebra.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ZebraMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | String |  | must be one of ["zebra"]
**type** | String |  | [optional] must be one of ["plains", "mountain", "grevys"]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ZebraMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ZebraMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["zebra"] |
| String | type()<br>[optional] must be one of ["plains", "mountain", "grevys"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
