# QuadrilateralInterface1
org.openapijsonschematools.components.schemas.QuadrilateralInterface.java
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
| static QuadrilateralInterfaceMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**quadrilateralType** | String |  |
**shapeType** | String |  | must be one of ["Quadrilateral"]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## QuadrilateralInterfaceMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static QuadrilateralInterfaceMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | quadrilateralType()<br> |
| String | shapeType()<br> must be one of ["Quadrilateral"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
