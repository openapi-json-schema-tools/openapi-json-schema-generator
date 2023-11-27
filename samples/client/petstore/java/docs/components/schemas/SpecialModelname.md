# SpecialModelname
org.openapijsonschematools.components.schemas.SpecialModelname.java
public class SpecialModelname

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | SpecialModelname.SpecialModelname1<br> schema class |
| static class | SpecialModelname.SpecialModelnameMap<br> output class for Map payloads |
| static class | SpecialModelname.A<br> schema class |

## SpecialModelname1
public class SpecialModelname1
extends JsonSchema

A schema class that validates payloads

## Description
model with an invalid class name for python

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SpecialModelnameMap](#specialmodelnamemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## SpecialModelnameMap
public class SpecialModelnameMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SpecialModelnameMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | a()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**a** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## A
public class A
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
