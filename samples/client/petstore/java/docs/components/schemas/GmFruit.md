# GmFruit
org.openapijsonschematools.client.components.schemas.GmFruit.java
public class GmFruit<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [GmFruit.GmFruit1Boxed](#gmfruit1boxed)<br> abstract sealed validated payload class |
| static class | [GmFruit.GmFruit1BoxedVoid](#gmfruit1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [GmFruit.GmFruit1BoxedBoolean](#gmfruit1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [GmFruit.GmFruit1BoxedNumber](#gmfruit1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [GmFruit.GmFruit1BoxedString](#gmfruit1boxedstring)<br> boxed class to store validated String payloads |
| static class | [GmFruit.GmFruit1BoxedList](#gmfruit1boxedlist)<br> boxed class to store validated List payloads |
| static class | [GmFruit.GmFruit1BoxedMap](#gmfruit1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [GmFruit.GmFruit1](#gmfruit1)<br> schema class |
| static class | [GmFruit.GmFruitMapBuilder](#gmfruitmapbuilder)<br> builder for Map payloads |
| static class | [GmFruit.GmFruitMap](#gmfruitmap)<br> output class for Map payloads |
| static class | [GmFruit.ColorBoxed](#colorboxed)<br> abstract sealed validated payload class |
| static class | [GmFruit.ColorBoxedString](#colorboxedstring)<br> boxed class to store validated String payloads |
| static class | [GmFruit.Color](#color)<br> schema class |

## GmFruit1Boxed
public sealed interface GmFruit1Boxed<br>
permits<br>
[GmFruit1BoxedVoid](#gmfruit1boxedvoid),
[GmFruit1BoxedBoolean](#gmfruit1boxedboolean),
[GmFruit1BoxedNumber](#gmfruit1boxednumber),
[GmFruit1BoxedString](#gmfruit1boxedstring),
[GmFruit1BoxedList](#gmfruit1boxedlist),
[GmFruit1BoxedMap](#gmfruit1boxedmap)

sealed interface that stores validated payloads using boxed classes

## GmFruit1BoxedVoid
public static final class GmFruit1BoxedVoid<br>
implements [GmFruit1Boxed](#gmfruit1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| GmFruit1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## GmFruit1BoxedBoolean
public static final class GmFruit1BoxedBoolean<br>
implements [GmFruit1Boxed](#gmfruit1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| GmFruit1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## GmFruit1BoxedNumber
public static final class GmFruit1BoxedNumber<br>
implements [GmFruit1Boxed](#gmfruit1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| GmFruit1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## GmFruit1BoxedString
public static final class GmFruit1BoxedString<br>
implements [GmFruit1Boxed](#gmfruit1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| GmFruit1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## GmFruit1BoxedList
public static final class GmFruit1BoxedList<br>
implements [GmFruit1Boxed](#gmfruit1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| GmFruit1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## GmFruit1BoxedMap
public static final class GmFruit1BoxedMap<br>
implements [GmFruit1Boxed](#gmfruit1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| GmFruit1BoxedMap([GmFruitMap](#gmfruitmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [GmFruitMap](#gmfruitmap) | data<br>validated payload |

## GmFruit1
public static class GmFruit1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("color", [Color.class](#color)))<br>)<br> |
| List<Class<? extends JsonSchema>> | anyOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Apple.Apple1.class](../../components/schemas/Apple.md#apple1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Banana.Banana1.class](../../components/schemas/Banana.md#banana1)<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [GmFruitMap](#gmfruitmap) | validate([Map&lt;?, ?&gt;](#gmfruitmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [GmFruit1BoxedString](#gmfruit1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [GmFruit1BoxedVoid](#gmfruit1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [GmFruit1BoxedNumber](#gmfruit1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [GmFruit1BoxedBoolean](#gmfruit1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [GmFruit1BoxedMap](#gmfruit1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#gmfruitmapbuilder) arg, SchemaConfiguration configuration) |
| [GmFruit1BoxedList](#gmfruit1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## GmFruitMapBuilder
public class GmFruitMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| GmFruitMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [GmFruitMapBuilder](#gmfruitmapbuilder) | color(String value) |
| [GmFruitMapBuilder](#gmfruitmapbuilder) | additionalProperty(String key, Void value) |
| [GmFruitMapBuilder](#gmfruitmapbuilder) | additionalProperty(String key, boolean value) |
| [GmFruitMapBuilder](#gmfruitmapbuilder) | additionalProperty(String key, String value) |
| [GmFruitMapBuilder](#gmfruitmapbuilder) | additionalProperty(String key, int value) |
| [GmFruitMapBuilder](#gmfruitmapbuilder) | additionalProperty(String key, float value) |
| [GmFruitMapBuilder](#gmfruitmapbuilder) | additionalProperty(String key, long value) |
| [GmFruitMapBuilder](#gmfruitmapbuilder) | additionalProperty(String key, double value) |
| [GmFruitMapBuilder](#gmfruitmapbuilder) | additionalProperty(String key, List<?> value) |
| [GmFruitMapBuilder](#gmfruitmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## GmFruitMap
public static class GmFruitMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [GmFruitMap](#gmfruitmap) | of([Map<String, ? extends @Nullable Object>](#gmfruitmapbuilder) arg, SchemaConfiguration configuration) |
| String | color()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ColorBoxed
public sealed interface ColorBoxed<br>
permits<br>
[ColorBoxedString](#colorboxedstring)

sealed interface that stores validated payloads using boxed classes

## ColorBoxedString
public static final class ColorBoxedString<br>
implements [ColorBoxed](#colorboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ColorBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Color
public static class Color<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
