# UniqueitemsFalseWithAnArrayOfItems
org.openapijsonschematools.client.components.schemas.UniqueitemsFalseWithAnArrayOfItems.java
public class UniqueitemsFalseWithAnArrayOfItems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)<br> sealed interface for validated payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1BoxedVoid](#uniqueitemsfalsewithanarrayofitems1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean](#uniqueitemsfalsewithanarrayofitems1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1BoxedNumber](#uniqueitemsfalsewithanarrayofitems1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1BoxedString](#uniqueitemsfalsewithanarrayofitems1boxedstring)<br> boxed class to store validated String payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1BoxedList](#uniqueitemsfalsewithanarrayofitems1boxedlist)<br> boxed class to store validated List payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1BoxedMap](#uniqueitemsfalsewithanarrayofitems1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1](#uniqueitemsfalsewithanarrayofitems1)<br> schema class |
| sealed interface | [UniqueitemsFalseWithAnArrayOfItems.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UniqueitemsFalseWithAnArrayOfItems.Schema1](#schema1)<br> schema class |
| sealed interface | [UniqueitemsFalseWithAnArrayOfItems.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UniqueitemsFalseWithAnArrayOfItems.Schema0](#schema0)<br> schema class |
| static class | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder](#uniqueitemsfalsewithanarrayofitemslistbuilder)<br> builder for List payloads |
| static class | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsList](#uniqueitemsfalsewithanarrayofitemslist)<br> output class for List payloads |

## UniqueitemsFalseWithAnArrayOfItems1Boxed
public sealed interface UniqueitemsFalseWithAnArrayOfItems1Boxed<br>
permits<br>
[UniqueitemsFalseWithAnArrayOfItems1BoxedVoid](#uniqueitemsfalsewithanarrayofitems1boxedvoid),
[UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean](#uniqueitemsfalsewithanarrayofitems1boxedboolean),
[UniqueitemsFalseWithAnArrayOfItems1BoxedNumber](#uniqueitemsfalsewithanarrayofitems1boxednumber),
[UniqueitemsFalseWithAnArrayOfItems1BoxedString](#uniqueitemsfalsewithanarrayofitems1boxedstring),
[UniqueitemsFalseWithAnArrayOfItems1BoxedList](#uniqueitemsfalsewithanarrayofitems1boxedlist),
[UniqueitemsFalseWithAnArrayOfItems1BoxedMap](#uniqueitemsfalsewithanarrayofitems1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UniqueitemsFalseWithAnArrayOfItems1BoxedVoid
public record UniqueitemsFalseWithAnArrayOfItems1BoxedVoid<br>
implements [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItems1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean
public record UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean<br>
implements [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsFalseWithAnArrayOfItems1BoxedNumber
public record UniqueitemsFalseWithAnArrayOfItems1BoxedNumber<br>
implements [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItems1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsFalseWithAnArrayOfItems1BoxedString
public record UniqueitemsFalseWithAnArrayOfItems1BoxedString<br>
implements [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItems1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsFalseWithAnArrayOfItems1BoxedList
public record UniqueitemsFalseWithAnArrayOfItems1BoxedList<br>
implements [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItems1BoxedList([UniqueitemsFalseWithAnArrayOfItemsList](#uniqueitemsfalsewithanarrayofitemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UniqueitemsFalseWithAnArrayOfItemsList](#uniqueitemsfalsewithanarrayofitemslist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsFalseWithAnArrayOfItems1BoxedMap
public record UniqueitemsFalseWithAnArrayOfItems1BoxedMap<br>
implements [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItems1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UniqueitemsFalseWithAnArrayOfItems1
public static class UniqueitemsFalseWithAnArrayOfItems1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Boolean | uniqueItems = false |
| List<Class<? extends JsonSchema>> | prefixItems = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>)<br> |

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
| [UniqueitemsFalseWithAnArrayOfItemsList](#uniqueitemsfalsewithanarrayofitemslist) | validate([List<?>](#uniqueitemsfalsewithanarrayofitemslistbuilder) arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseWithAnArrayOfItems1BoxedString](#uniqueitemsfalsewithanarrayofitems1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseWithAnArrayOfItems1BoxedVoid](#uniqueitemsfalsewithanarrayofitems1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseWithAnArrayOfItems1BoxedNumber](#uniqueitemsfalsewithanarrayofitems1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean](#uniqueitemsfalsewithanarrayofitems1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseWithAnArrayOfItems1BoxedMap](#uniqueitemsfalsewithanarrayofitems1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseWithAnArrayOfItems1BoxedList](#uniqueitemsfalsewithanarrayofitems1boxedlist) | validateAndBox([List<?>](#uniqueitemsfalsewithanarrayofitemslistbuilder) arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedBoolean](#schema1boxedboolean)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedBoolean
public record Schema1BoxedBoolean<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1
public static class Schema1<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema0Boxed
public sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedBoolean](#schema0boxedboolean)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedBoolean
public record Schema0BoxedBoolean<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0
public static class Schema0<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## UniqueitemsFalseWithAnArrayOfItemsListBuilder
public class UniqueitemsFalseWithAnArrayOfItemsListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder()<br>Creates an empty list |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(Void item) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(boolean item) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(String item) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(int item) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(float item) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(long item) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(double item) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(List<?> item) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## UniqueitemsFalseWithAnArrayOfItemsList
public class UniqueitemsFalseWithAnArrayOfItemsList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UniqueitemsFalseWithAnArrayOfItemsList](#uniqueitemsfalsewithanarrayofitemslist) | of([List<? extends @Nullable Object>](#uniqueitemsfalsewithanarrayofitemslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
