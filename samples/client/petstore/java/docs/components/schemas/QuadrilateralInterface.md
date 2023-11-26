# QuadrilateralInterface
org.openapijsonschematools.components.schemas.QuadrilateralInterface.java
public class QuadrilateralInterface

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | QuadrilateralInterface.QuadrilateralInterface1<br> schema class |
| static class | QuadrilateralInterface.QuadrilateralInterfaceMap<br> output class for Map payloads |
| static class | QuadrilateralInterface.QuadrilateralType<br> schema class |
| static class | QuadrilateralInterface.ShapeType<br> schema class |

## QuadrilateralInterface1
public class QuadrilateralInterface1
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
public class QuadrilateralInterfaceMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static QuadrilateralInterfaceMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | quadrilateralType()<br> |
| String | shapeType()<br> must be one of ["Quadrilateral"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## QuadrilateralType
public class QuadrilateralType
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## ShapeType
public class ShapeType
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
