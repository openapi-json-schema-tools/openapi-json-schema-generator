# SimpleQuadrilateral
org.openapijsonschematools.components.schemas.SimpleQuadrilateral.java
public class SimpleQuadrilateral

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | SimpleQuadrilateral.SimpleQuadrilateral1<br> schema class |
| static class | SimpleQuadrilateral.Schema1<br> schema class |
| static class | SimpleQuadrilateral.Schema1Map<br> output class for Map payloads |
| static class | SimpleQuadrilateral.QuadrilateralType<br> schema class |

## SimpleQuadrilateral1
public class SimpleQuadrilateral1
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
**quadrilateralType** | String |  | [optional] must be one of ["SimpleQuadrilateral"]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## Schema1Map
public class Schema1Map
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Schema1Map | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | quadrilateralType()<br>[optional] must be one of ["SimpleQuadrilateral"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## QuadrilateralType
public class QuadrilateralType
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
