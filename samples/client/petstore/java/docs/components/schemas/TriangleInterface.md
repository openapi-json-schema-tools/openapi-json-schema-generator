# TriangleInterface
org.openapijsonschematools.components.schemas.TriangleInterface.java
public class TriangleInterface

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [TriangleInterface.TriangleInterface1](#triangleinterface1)<br> schema class |
| static class | [TriangleInterface.TriangleInterfaceMap](#triangleinterfacemap)<br> output class for Map payloads |
| static class | [TriangleInterface.TriangleType](#triangletype)<br> schema class |
| static class | [TriangleInterface.ShapeType](#shapetype)<br> schema class |

## TriangleInterface1
public static class TriangleInterface1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("shapeType", [ShapeType.class](#shapetype))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("triangleType", [TriangleType.class](#triangletype)))<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"shapeType",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"triangleType"<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static [TriangleInterfaceMap](#triangleinterfacemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## TriangleInterfaceMap
public static class TriangleInterfaceMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TriangleInterfaceMap](#triangleinterfacemap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | shapeType()<br> must be one of ["Triangle"] |
| String | triangleType()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **shapeType** | String |  | must be one of ["Triangle"] |
| **triangleType** | String |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## TriangleType
public static class TriangleType<br>
extends StringJsonSchema

A schema class that validates payloads

## ShapeType
public static class ShapeType<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
