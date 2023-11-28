# QuadrilateralInterface
org.openapijsonschematools.components.schemas.QuadrilateralInterface.java
public class QuadrilateralInterface

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [QuadrilateralInterface.QuadrilateralInterface1](#quadrilateralinterface1)<br> schema class |
| static class | [QuadrilateralInterface.QuadrilateralInterfaceMap](#quadrilateralinterfacemap)<br> output class for Map payloads |
| static class | [QuadrilateralInterface.QuadrilateralType](#quadrilateraltype)<br> schema class |
| static class | [QuadrilateralInterface.ShapeType](#shapetype)<br> schema class |

## QuadrilateralInterface1
public static class QuadrilateralInterface1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
    new PropertyEntry("shapeType", ShapeType.class),
    new PropertyEntry("quadrilateralType", QuadrilateralType.class)
))),
new KeywordEntry("required", new RequiredValidator(Set.of(
    "quadrilateralType",
    "shapeType"
)))
));</code> |

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
| static [QuadrilateralInterfaceMap](#quadrilateralinterfacemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## QuadrilateralInterfaceMap
public static class QuadrilateralInterfaceMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [QuadrilateralInterfaceMap](#quadrilateralinterfacemap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | quadrilateralType()<br> |
| String | shapeType()<br> must be one of ["Quadrilateral"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **quadrilateralType** | String |  | |
| **shapeType** | String |  | must be one of ["Quadrilateral"] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## QuadrilateralType
public static class QuadrilateralType<br>
extends StringJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## ShapeType
public static class ShapeType<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(
    String.class
)))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
