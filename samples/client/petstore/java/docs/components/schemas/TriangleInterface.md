# TriangleInterface
org.openapijsonschematools.client.components.schemas.TriangleInterface.java
public class TriangleInterface

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [TriangleInterface.TriangleInterface1](#triangleinterface1)<br> schema class |
| static class | [TriangleInterface.TriangleInterfaceMapInput](#triangleinterfacemapinput)<br> builder for Map payloads |
| static class | [TriangleInterface.TriangleInterfaceMap](#triangleinterfacemap)<br> output class for Map payloads |
| static class | [TriangleInterface.TriangleType](#triangletype)<br> schema class |
| static class | [TriangleInterface.ShapeType](#shapetype)<br> schema class |
| enum | [TriangleInterface.StringShapeTypeEnums](#stringshapetypeenums)<br>String enum |

## TriangleInterface1
public static class TriangleInterface1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("shapeType", [ShapeType.class](#shapetype))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("triangleType", [TriangleType.class](#triangletype)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"shapeType",<br>&nbsp;&nbsp;&nbsp;&nbsp;"triangleType"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [TriangleInterfaceMap](#triangleinterfacemap) | validate([Map<?, ?>](#triangleinterfacemapinput) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## TriangleInterfaceMapInput
public class TriangleInterfaceMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **shapeType** | String |  | must be one of ["Triangle"] |
| **triangleType** | String |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## TriangleInterfaceMap
public static class TriangleInterfaceMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TriangleInterfaceMap](#triangleinterfacemap) | of([Map<String, ? extends @Nullable Object>](#triangleinterfacemapinput) arg, SchemaConfiguration configuration) |
| String | shapeType()<br> must be one of ["Triangle"] |
| String | triangleType()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## TriangleType
public static class TriangleType<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## ShapeType
public static class ShapeType<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = TriangleInterface.ShapeType.validate(
    "Triangle",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"Triangle"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringShapeTypeEnums](#stringshapetypeenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringShapeTypeEnums
public enum StringShapeTypeEnums<br>
extends `Enum<StringShapeTypeEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| TRIANGLE | value = "Triangle" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
