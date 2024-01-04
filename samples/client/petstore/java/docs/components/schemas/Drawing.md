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
| static class | [Drawing.DrawingMapBuilder](#drawingmapbuilder)<br> builder for Map payloads |
| static class | [Drawing.DrawingMap](#drawingmap)<br> output class for Map payloads |
| static class | [Drawing.Shapes](#shapes)<br> schema class |
| static class | [Drawing.ShapesListBuilder](#shapeslistbuilder)<br> builder for List payloads |
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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
Drawing.DrawingMap validatedPayload =
    Drawing.Drawing1.validate(
    new Drawing.DrawingMapBuilder()
        .shapes(
            Arrays.asList(
)

        )
    .build(),
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
| [DrawingMap](#drawingmap) | validate([Map&lt;?, ?&gt;](#drawingmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DrawingMapBuilder
public class DrawingMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DrawingMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [DrawingMapBuilder](#drawingmapbuilder) | mainShape(Void value) |
| [DrawingMapBuilder](#drawingmapbuilder) | mainShape(boolean value) |
| [DrawingMapBuilder](#drawingmapbuilder) | mainShape(String value) |
| [DrawingMapBuilder](#drawingmapbuilder) | mainShape(int value) |
| [DrawingMapBuilder](#drawingmapbuilder) | mainShape(float value) |
| [DrawingMapBuilder](#drawingmapbuilder) | mainShape(long value) |
| [DrawingMapBuilder](#drawingmapbuilder) | mainShape(double value) |
| [DrawingMapBuilder](#drawingmapbuilder) | mainShape(List<?> value) |
| [DrawingMapBuilder](#drawingmapbuilder) | mainShape(Map<String, ?> value) |
| [DrawingMapBuilder](#drawingmapbuilder) | shapeOrNull(Void value) |
| [DrawingMapBuilder](#drawingmapbuilder) | shapeOrNull(boolean value) |
| [DrawingMapBuilder](#drawingmapbuilder) | shapeOrNull(String value) |
| [DrawingMapBuilder](#drawingmapbuilder) | shapeOrNull(int value) |
| [DrawingMapBuilder](#drawingmapbuilder) | shapeOrNull(float value) |
| [DrawingMapBuilder](#drawingmapbuilder) | shapeOrNull(long value) |
| [DrawingMapBuilder](#drawingmapbuilder) | shapeOrNull(double value) |
| [DrawingMapBuilder](#drawingmapbuilder) | shapeOrNull(List<?> value) |
| [DrawingMapBuilder](#drawingmapbuilder) | shapeOrNull(Map<String, ?> value) |
| [DrawingMapBuilder](#drawingmapbuilder) | nullableShape(Void value) |
| [DrawingMapBuilder](#drawingmapbuilder) | nullableShape(boolean value) |
| [DrawingMapBuilder](#drawingmapbuilder) | nullableShape(String value) |
| [DrawingMapBuilder](#drawingmapbuilder) | nullableShape(int value) |
| [DrawingMapBuilder](#drawingmapbuilder) | nullableShape(float value) |
| [DrawingMapBuilder](#drawingmapbuilder) | nullableShape(long value) |
| [DrawingMapBuilder](#drawingmapbuilder) | nullableShape(double value) |
| [DrawingMapBuilder](#drawingmapbuilder) | nullableShape(List<?> value) |
| [DrawingMapBuilder](#drawingmapbuilder) | nullableShape(Map<String, ?> value) |
| [DrawingMapBuilder](#drawingmapbuilder) | shapes(List<@Nullable Object> value) |
| [DrawingMapBuilder](#drawingmapbuilder) | additionalProperty(String key, Void value) |
| [DrawingMapBuilder](#drawingmapbuilder) | additionalProperty(String key, boolean value) |
| [DrawingMapBuilder](#drawingmapbuilder) | additionalProperty(String key, String value) |
| [DrawingMapBuilder](#drawingmapbuilder) | additionalProperty(String key, int value) |
| [DrawingMapBuilder](#drawingmapbuilder) | additionalProperty(String key, float value) |
| [DrawingMapBuilder](#drawingmapbuilder) | additionalProperty(String key, long value) |
| [DrawingMapBuilder](#drawingmapbuilder) | additionalProperty(String key, double value) |
| [DrawingMapBuilder](#drawingmapbuilder) | additionalProperty(String key, List<?> value) |
| [DrawingMapBuilder](#drawingmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## DrawingMap
public static class DrawingMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [DrawingMap](#drawingmap) | of([Map<String, ? extends @Nullable Object>](#drawingmapbuilder) arg, SchemaConfiguration configuration) |
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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
Drawing.ShapesList validatedPayload =
    Drawing.Shapes.validate(
    new Drawing.ShapesListBuilder()
    .build(),
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
| [ShapesList](#shapeslist) | validate([List<?>](#shapeslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ShapesListBuilder
public class ShapesListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShapesListBuilder()<br>Creates an empty list |
| ShapesListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ShapesListBuilder | add(Void item) |
| ShapesListBuilder | add(boolean item) |
| ShapesListBuilder | add(String item) |
| ShapesListBuilder | add(int item) |
| ShapesListBuilder | add(float item) |
| ShapesListBuilder | add(long item) |
| ShapesListBuilder | add(double item) |
| ShapesListBuilder | add(List<?> item) |
| ShapesListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## ShapesList
public class ShapesList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ShapesList](#shapeslist) | of([List<? extends @Nullable Object>](#shapeslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
