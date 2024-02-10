# Fruit
org.openapijsonschematools.client.components.schemas.Fruit.java
public class Fruit

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Fruit.Fruit1Boxed](#fruit1boxed)<br> sealed validated payload class |
| static class | [Fruit.Fruit1](#fruit1)<br> schema class |
| static class | [Fruit.FruitMapBuilder](#fruitmapbuilder)<br> builder for Map payloads |
| static class | [Fruit.FruitMap](#fruitmap)<br> output class for Map payloads |
| static class | [Fruit.ColorBoxed](#colorboxed)<br> sealed validated payload class |
| static class | [Fruit.Color](#color)<br> schema class |

## Fruit1Boxed
public static abstract sealed class Fruit1Boxed<br>
permits<br>
[Fruit1BoxedVoid](#fruit1boxedvoid),
[Fruit1BoxedBoolean](#fruit1boxedboolean),
[Fruit1BoxedNumber](#fruit1boxednumber),
[Fruit1BoxedString](#fruit1boxedstring),
[Fruit1BoxedList](#fruit1boxedlist),
[Fruit1BoxedMap](#fruit1boxedmap)

A sealed class that stores validated payloads using boxed classes

## Fruit1
public static class Fruit1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("color", [Color.class](#color)))<br>)<br> |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Apple.Apple1.class](../../components/schemas/Apple.md#apple1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Banana.Banana1.class](../../components/schemas/Banana.md#banana1)<br>))<br> |

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
| [FruitMap](#fruitmap) | validate([Map&lt;?, ?&gt;](#fruitmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FruitMapBuilder
public class FruitMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FruitMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FruitMapBuilder](#fruitmapbuilder) | color(String value) |
| [FruitMapBuilder](#fruitmapbuilder) | additionalProperty(String key, Void value) |
| [FruitMapBuilder](#fruitmapbuilder) | additionalProperty(String key, boolean value) |
| [FruitMapBuilder](#fruitmapbuilder) | additionalProperty(String key, String value) |
| [FruitMapBuilder](#fruitmapbuilder) | additionalProperty(String key, int value) |
| [FruitMapBuilder](#fruitmapbuilder) | additionalProperty(String key, float value) |
| [FruitMapBuilder](#fruitmapbuilder) | additionalProperty(String key, long value) |
| [FruitMapBuilder](#fruitmapbuilder) | additionalProperty(String key, double value) |
| [FruitMapBuilder](#fruitmapbuilder) | additionalProperty(String key, List<?> value) |
| [FruitMapBuilder](#fruitmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## FruitMap
public static class FruitMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FruitMap](#fruitmap) | of([Map<String, ? extends @Nullable Object>](#fruitmapbuilder) arg, SchemaConfiguration configuration) |
| String | color()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ColorBoxed
public static abstract sealed class ColorBoxed<br>
permits<br>
[ColorBoxedString](#colorboxedstring)

A sealed class that stores validated payloads using boxed classes

## Color
public static class Color<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
