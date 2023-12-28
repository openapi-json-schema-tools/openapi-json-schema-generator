# Drawing
org.openapijsonschematools.client.components.schemas.Drawing.java
public class Drawing

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Drawing.Drawing1](#drawing1)<br> schema class |
| static class | [Drawing.DrawingMapInput](#drawingmapinput)<br> builder for Map payloads |
| static class | [Drawing.DrawingMap](#drawingmap)<br> output class for Map payloads |
| static class | [Drawing.Shapes](#shapes)<br> schema class |
| static class | [Drawing.ShapesListInput](#shapeslistinput)<br> builder for List payloads |
| static class | [Drawing.ShapesList](#shapeslist)<br> output class for List payloads |

## Drawing1
public static class Drawing1<br>
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

// Map validation
Drawing.DrawingMap validatedPayload =
    Drawing.Drawing1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "shapes",
            Arrays.asList(
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("mainShape", [Shape.Shape1.class](../../components/schemas/Shape.md#shape1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("shapeOrNull", [ShapeOrNull.ShapeOrNull1.class](../../components/schemas/ShapeOrNull.md#shapeornull1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("nullableShape", [NullableShape.NullableShape1.class](../../components/schemas/NullableShape.md#nullableshape1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("shapes", [Shapes.class](#shapes)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [Fruit.Fruit1.class](../../components/schemas/Fruit.md#fruit1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [DrawingMap](#drawingmap) | validate([Map<?, ?>](#drawingmapinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DrawingMapInput
public class DrawingMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **mainShape** | ? extends @Nullable Object |  | [optional] |
| **shapeOrNull** | ? extends @Nullable Object |  | [optional] |
| **nullableShape** | ? extends @Nullable Object |  | [optional] |
| **shapes** | List<? extends @Nullable Object> |  | [optional] |
| **anyStringName** | ? extends @Nullable Object | any string name can be used but the value must be the correct type | [optional] |

## DrawingMap
public static class DrawingMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DrawingMap](#drawingmap) | of([Map<String, ? extends @Nullable Object>](#drawingmapinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | mainShape()<br>[optional] |
| @Nullable Object | shapeOrNull()<br>[optional] |
| @Nullable Object | nullableShape()<br>[optional] |
| [ShapesList](#shapeslist) | shapes()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Shapes
public static class Shapes<br>
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

// List validation
Drawing.ShapesList validatedPayload =
    Drawing.Shapes.validate(
    Arrays.asList(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Shape.Shape1.class](../../components/schemas/Shape.md#shape1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ShapesList](#shapeslist) | validate([List<?>](#shapeslistinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ShapesListInput
public class ShapesListInput<br>
builder for `List<? extends @Nullable Object>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
? extends @Nullable Object |  |

## ShapesList
public class ShapesList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ShapesList](#shapeslist) | of([List<? extends @Nullable Object>](#shapeslistinput) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
