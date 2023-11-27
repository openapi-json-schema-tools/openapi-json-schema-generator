# ObjectModelWithRefProps
org.openapijsonschematools.components.schemas.ObjectModelWithRefProps.java
public class ObjectModelWithRefProps

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjectModelWithRefProps.ObjectModelWithRefProps1<br> schema class |
| static class | ObjectModelWithRefProps.ObjectModelWithRefPropsMap<br> output class for Map payloads |

## ObjectModelWithRefProps1
public class ObjectModelWithRefProps1
extends JsonSchema

A schema class that validates payloads

## Description
a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectModelWithRefPropsMap](#objectmodelwithrefpropsmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectModelWithRefPropsMap
public class ObjectModelWithRefPropsMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectModelWithRefPropsMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | myNumber()<br>[optional] |
| String | myString()<br>[optional] |
| boolean | myBoolean()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
