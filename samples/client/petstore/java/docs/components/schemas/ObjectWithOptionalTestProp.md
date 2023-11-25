# ObjectWithOptionalTestProp
org.openapijsonschematools.components.schemas.ObjectWithOptionalTestProp.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjectWithOptionalTestProp.Test<br> schema class |
| static class | ObjectWithOptionalTestProp.ObjectWithOptionalTestPropMap<br> output class for Map payloads |
| static class | ObjectWithOptionalTestProp.ObjectWithOptionalTestProp1<br> schema class |

## ObjectWithOptionalTestProp1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithOptionalTestPropMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**test** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectWithOptionalTestPropMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithOptionalTestPropMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | test()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
