# ObjectModelWithRefProps
org.openapijsonschematools.components.schemas.ObjectModelWithRefProps.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjectModelWithRefProps.ObjectModelWithRefPropsMap<br> output class for Map payloads |
| static class | ObjectModelWithRefProps.ObjectModelWithRefProps1<br> schema class |

## ObjectModelWithRefProps1
```
type: JsonSchema
```

## Description
a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectModelWithRefPropsMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**myNumber** | Number |  | [optional]
**myString** | String |  | [optional]
**myBoolean** | boolean |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectModelWithRefPropsMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectModelWithRefPropsMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | myNumber()<br>[optional] |
| String | myString()<br>[optional] |
| boolean | myBoolean()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
