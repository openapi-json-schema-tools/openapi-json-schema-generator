# Fruit
org.openapijsonschematools.client.components.schemas.Fruit.java
public class Fruit<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Fruit.Fruit1Boxed](#fruit1boxed)<br> abstract sealed validated payload class |
| record | [Fruit.Fruit1BoxedVoid](#fruit1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Fruit.Fruit1BoxedBoolean](#fruit1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Fruit.Fruit1BoxedNumber](#fruit1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Fruit.Fruit1BoxedString](#fruit1boxedstring)<br> boxed class to store validated String payloads |
| record | [Fruit.Fruit1BoxedList](#fruit1boxedlist)<br> boxed class to store validated List payloads |
| record | [Fruit.Fruit1BoxedMap](#fruit1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fruit.Fruit1](#fruit1)<br> schema class |
| static class | [Fruit.FruitMapBuilder](#fruitmapbuilder)<br> builder for Map payloads |
| static class | [Fruit.FruitMap](#fruitmap)<br> output class for Map payloads |
| sealed interface | [Fruit.ColorBoxed](#colorboxed)<br> abstract sealed validated payload class |
| record | [Fruit.ColorBoxedString](#colorboxedstring)<br> boxed class to store validated String payloads |
| static class | [Fruit.Color](#color)<br> schema class |

## Fruit1Boxed
public sealed interface Fruit1Boxed<br>
permits<br>
[Fruit1BoxedVoid](#fruit1boxedvoid),
[Fruit1BoxedBoolean](#fruit1boxedboolean),
[Fruit1BoxedNumber](#fruit1boxednumber),
[Fruit1BoxedString](#fruit1boxedstring),
[Fruit1BoxedList](#fruit1boxedlist),
[Fruit1BoxedMap](#fruit1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Fruit1BoxedVoid
public record Fruit1BoxedVoid<br>
implements [Fruit1Boxed](#fruit1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fruit1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Fruit1BoxedBoolean
public record Fruit1BoxedBoolean<br>
implements [Fruit1Boxed](#fruit1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fruit1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Fruit1BoxedNumber
public record Fruit1BoxedNumber<br>
implements [Fruit1Boxed](#fruit1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fruit1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Fruit1BoxedString
public record Fruit1BoxedString<br>
implements [Fruit1Boxed](#fruit1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fruit1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Fruit1BoxedList
public record Fruit1BoxedList<br>
implements [Fruit1Boxed](#fruit1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fruit1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Fruit1BoxedMap
public record Fruit1BoxedMap<br>
implements [Fruit1Boxed](#fruit1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fruit1BoxedMap([FruitMap](#fruitmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FruitMap](#fruitmap) | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [FruitMap](#fruitmap) | validate([Map&lt;?, ?&gt;](#fruitmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Fruit1BoxedString](#fruit1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Fruit1BoxedVoid](#fruit1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Fruit1BoxedNumber](#fruit1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Fruit1BoxedBoolean](#fruit1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Fruit1BoxedMap](#fruit1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fruitmapbuilder) arg, SchemaConfiguration configuration) |
| [Fruit1BoxedList](#fruit1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
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
public sealed interface ColorBoxed<br>
permits<br>
[ColorBoxedString](#colorboxedstring)

sealed interface that stores validated payloads using boxed classes

## ColorBoxedString
public record ColorBoxedString<br>
implements [ColorBoxed](#colorboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ColorBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Color
public static class Color<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
