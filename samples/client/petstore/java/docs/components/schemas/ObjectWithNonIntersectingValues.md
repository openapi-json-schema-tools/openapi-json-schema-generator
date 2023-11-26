# ObjectWithNonIntersectingValues
org.openapijsonschematools.components.schemas.ObjectWithNonIntersectingValues.java
public class ObjectWithNonIntersectingValues

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValues1<br> schema class |
| static class | ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValuesMap<br> output class for Map payloads |
| static class | ObjectWithNonIntersectingValues.A<br> schema class |
| static class | ObjectWithNonIntersectingValues.AdditionalProperties<br> schema class |

## ObjectWithNonIntersectingValues1
public class ObjectWithNonIntersectingValues1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithNonIntersectingValuesMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithNonIntersectingValuesMap
public class ObjectWithNonIntersectingValuesMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithNonIntersectingValuesMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | a()<br>[optional] |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**a** | Number |  | [optional]
**anyStringName** | String | any string name can be used but the value must be the correct type | [optional]

## A
public class A
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## AdditionalProperties
public class AdditionalProperties
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
