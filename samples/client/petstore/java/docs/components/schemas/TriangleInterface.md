# TriangleInterface
org.openapijsonschematools.components.schemas.TriangleInterface.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | TriangleInterface.ShapeType<br> schema class |
| static class | TriangleInterface.TriangleType<br> schema class |
| static class | TriangleInterface.TriangleInterfaceMap<br> output class for Map payloads |
| static class | TriangleInterface.TriangleInterface1<br> schema class |

## TriangleInterface1
```
type: JsonSchema
```

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
| static TriangleInterfaceMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**shapeType** | String |  | must be one of ["Triangle"]
**triangleType** | String |  |
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## TriangleInterfaceMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static TriangleInterfaceMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | shapeType()<br> must be one of ["Triangle"] |
| String | triangleType()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
