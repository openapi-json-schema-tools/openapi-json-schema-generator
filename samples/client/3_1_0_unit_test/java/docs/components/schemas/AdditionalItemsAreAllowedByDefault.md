# AdditionalItemsAreAllowedByDefault
unit_test_api.components.schemas.AdditionalItemsAreAllowedByDefault.java
public class AdditionalItemsAreAllowedByDefault<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1BoxedVoid](#additionalitemsareallowedbydefault1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1BoxedBoolean](#additionalitemsareallowedbydefault1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1BoxedNumber](#additionalitemsareallowedbydefault1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1BoxedString](#additionalitemsareallowedbydefault1boxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1BoxedList](#additionalitemsareallowedbydefault1boxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1BoxedMap](#additionalitemsareallowedbydefault1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1](#additionalitemsareallowedbydefault1)<br> schema class |
| sealed interface | [AdditionalItemsAreAllowedByDefault.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [AdditionalItemsAreAllowedByDefault.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AdditionalItemsAreAllowedByDefault.Schema0](#schema0)<br> schema class |
| static class | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefaultListBuilder](#additionalitemsareallowedbydefaultlistbuilder)<br> builder for List payloads |
| static class | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefaultList](#additionalitemsareallowedbydefaultlist)<br> output class for List payloads |

## AdditionalItemsAreAllowedByDefault1Boxed
public sealed interface AdditionalItemsAreAllowedByDefault1Boxed<br>
permits<br>
[AdditionalItemsAreAllowedByDefault1BoxedVoid](#additionalitemsareallowedbydefault1boxedvoid),
[AdditionalItemsAreAllowedByDefault1BoxedBoolean](#additionalitemsareallowedbydefault1boxedboolean),
[AdditionalItemsAreAllowedByDefault1BoxedNumber](#additionalitemsareallowedbydefault1boxednumber),
[AdditionalItemsAreAllowedByDefault1BoxedString](#additionalitemsareallowedbydefault1boxedstring),
[AdditionalItemsAreAllowedByDefault1BoxedList](#additionalitemsareallowedbydefault1boxedlist),
[AdditionalItemsAreAllowedByDefault1BoxedMap](#additionalitemsareallowedbydefault1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalItemsAreAllowedByDefault1BoxedVoid
public record AdditionalItemsAreAllowedByDefault1BoxedVoid<br>
implements [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefault1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalItemsAreAllowedByDefault1BoxedBoolean
public record AdditionalItemsAreAllowedByDefault1BoxedBoolean<br>
implements [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefault1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalItemsAreAllowedByDefault1BoxedNumber
public record AdditionalItemsAreAllowedByDefault1BoxedNumber<br>
implements [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefault1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalItemsAreAllowedByDefault1BoxedString
public record AdditionalItemsAreAllowedByDefault1BoxedString<br>
implements [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefault1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalItemsAreAllowedByDefault1BoxedList
public record AdditionalItemsAreAllowedByDefault1BoxedList<br>
implements [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefault1BoxedList([AdditionalItemsAreAllowedByDefaultList](#additionalitemsareallowedbydefaultlist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalItemsAreAllowedByDefaultList](#additionalitemsareallowedbydefaultlist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalItemsAreAllowedByDefault1BoxedMap
public record AdditionalItemsAreAllowedByDefault1BoxedMap<br>
implements [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefault1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalItemsAreAllowedByDefault1
public static class AdditionalItemsAreAllowedByDefault1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | prefixItems = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0)<br>)<br> |

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
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AdditionalItemsAreAllowedByDefaultList](#additionalitemsareallowedbydefaultlist) | validate([List<?>](#additionalitemsareallowedbydefaultlistbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalItemsAreAllowedByDefault1BoxedString](#additionalitemsareallowedbydefault1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AdditionalItemsAreAllowedByDefault1BoxedVoid](#additionalitemsareallowedbydefault1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AdditionalItemsAreAllowedByDefault1BoxedNumber](#additionalitemsareallowedbydefault1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AdditionalItemsAreAllowedByDefault1BoxedBoolean](#additionalitemsareallowedbydefault1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AdditionalItemsAreAllowedByDefault1BoxedMap](#additionalitemsareallowedbydefault1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AdditionalItemsAreAllowedByDefault1BoxedList](#additionalitemsareallowedbydefault1boxedlist) | validateAndBox([List<?>](#additionalitemsareallowedbydefaultlistbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema0Boxed
public sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedNumber](#schema0boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedNumber
public record Schema0BoxedNumber<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0
public static class Schema0<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalItemsAreAllowedByDefaultListBuilder
public class AdditionalItemsAreAllowedByDefaultListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefaultListBuilder()<br>Creates an empty list |
| AdditionalItemsAreAllowedByDefaultListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(Void item) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(boolean item) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(String item) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(int item) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(float item) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(long item) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(double item) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(List<?> item) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## AdditionalItemsAreAllowedByDefaultList
public class AdditionalItemsAreAllowedByDefaultList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalItemsAreAllowedByDefaultList](#additionalitemsareallowedbydefaultlist) | of([List<? extends @Nullable Object>](#additionalitemsareallowedbydefaultlistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
