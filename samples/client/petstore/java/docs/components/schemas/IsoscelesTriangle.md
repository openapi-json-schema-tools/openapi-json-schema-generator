# IsoscelesTriangle
org.openapijsonschematools.components.schemas.IsoscelesTriangle.java
public class IsoscelesTriangle

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | IsoscelesTriangle.IsoscelesTriangle1<br> schema class |
| static class | IsoscelesTriangle.Schema1<br> schema class |
| static class | IsoscelesTriangle.Schema1Map<br> output class for Map payloads |
| static class | IsoscelesTriangle.TriangleType<br> schema class |

## IsoscelesTriangle1
public class IsoscelesTriangle1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## Schema1
public class Schema1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Schema1Map | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**triangleType** | String |  | [optional] must be one of ["IsoscelesTriangle"]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## Schema1Map
public class Schema1Map
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Schema1Map | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | triangleType()<br>[optional] must be one of ["IsoscelesTriangle"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## TriangleType
public class TriangleType
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
