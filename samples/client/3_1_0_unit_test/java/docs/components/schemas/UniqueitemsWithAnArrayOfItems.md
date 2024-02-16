# UniqueitemsWithAnArrayOfItems
org.openapijsonschematools.client.components.schemas.UniqueitemsWithAnArrayOfItems.java
public class UniqueitemsWithAnArrayOfItems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)<br> abstract sealed validated payload class |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1BoxedVoid](#uniqueitemswithanarrayofitems1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1BoxedBoolean](#uniqueitemswithanarrayofitems1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1BoxedNumber](#uniqueitemswithanarrayofitems1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1BoxedString](#uniqueitemswithanarrayofitems1boxedstring)<br> boxed class to store validated String payloads |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1BoxedList](#uniqueitemswithanarrayofitems1boxedlist)<br> boxed class to store validated List payloads |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1BoxedMap](#uniqueitemswithanarrayofitems1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1](#uniqueitemswithanarrayofitems1)<br> schema class |
| static class | [UniqueitemsWithAnArrayOfItems.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [UniqueitemsWithAnArrayOfItems.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UniqueitemsWithAnArrayOfItems.Schema1](#schema1)<br> schema class |
| static class | [UniqueitemsWithAnArrayOfItems.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [UniqueitemsWithAnArrayOfItems.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UniqueitemsWithAnArrayOfItems.Schema0](#schema0)<br> schema class |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItemsListBuilder](#uniqueitemswithanarrayofitemslistbuilder)<br> builder for List payloads |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItemsList](#uniqueitemswithanarrayofitemslist)<br> output class for List payloads |

## UniqueitemsWithAnArrayOfItems1Boxed
public static abstract sealed class UniqueitemsWithAnArrayOfItems1Boxed<br>
permits<br>
[UniqueitemsWithAnArrayOfItems1BoxedVoid](#uniqueitemswithanarrayofitems1boxedvoid),
[UniqueitemsWithAnArrayOfItems1BoxedBoolean](#uniqueitemswithanarrayofitems1boxedboolean),
[UniqueitemsWithAnArrayOfItems1BoxedNumber](#uniqueitemswithanarrayofitems1boxednumber),
[UniqueitemsWithAnArrayOfItems1BoxedString](#uniqueitemswithanarrayofitems1boxedstring),
[UniqueitemsWithAnArrayOfItems1BoxedList](#uniqueitemswithanarrayofitems1boxedlist),
[UniqueitemsWithAnArrayOfItems1BoxedMap](#uniqueitemswithanarrayofitems1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## UniqueitemsWithAnArrayOfItems1BoxedVoid
public static final class UniqueitemsWithAnArrayOfItems1BoxedVoid<br>
extends [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItems1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## UniqueitemsWithAnArrayOfItems1BoxedBoolean
public static final class UniqueitemsWithAnArrayOfItems1BoxedBoolean<br>
extends [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItems1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## UniqueitemsWithAnArrayOfItems1BoxedNumber
public static final class UniqueitemsWithAnArrayOfItems1BoxedNumber<br>
extends [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItems1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## UniqueitemsWithAnArrayOfItems1BoxedString
public static final class UniqueitemsWithAnArrayOfItems1BoxedString<br>
extends [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItems1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UniqueitemsWithAnArrayOfItems1BoxedList
public static final class UniqueitemsWithAnArrayOfItems1BoxedList<br>
extends [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItems1BoxedList([UniqueitemsWithAnArrayOfItemsList](#uniqueitemswithanarrayofitemslist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [UniqueitemsWithAnArrayOfItemsList](#uniqueitemswithanarrayofitemslist) | data<br>validated payload |

## UniqueitemsWithAnArrayOfItems1BoxedMap
public static final class UniqueitemsWithAnArrayOfItems1BoxedMap<br>
extends [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItems1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## UniqueitemsWithAnArrayOfItems1
public static class UniqueitemsWithAnArrayOfItems1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Boolean | uniqueItems = true |
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
| [UniqueitemsWithAnArrayOfItemsList](#uniqueitemswithanarrayofitemslist) | validate([List<?>](#uniqueitemswithanarrayofitemslistbuilder) arg, SchemaConfiguration configuration) |
| [UniqueitemsWithAnArrayOfItems1BoxedString](#uniqueitemswithanarrayofitems1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UniqueitemsWithAnArrayOfItems1BoxedVoid](#uniqueitemswithanarrayofitems1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UniqueitemsWithAnArrayOfItems1BoxedNumber](#uniqueitemswithanarrayofitems1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UniqueitemsWithAnArrayOfItems1BoxedBoolean](#uniqueitemswithanarrayofitems1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UniqueitemsWithAnArrayOfItems1BoxedMap](#uniqueitemswithanarrayofitems1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UniqueitemsWithAnArrayOfItems1BoxedList](#uniqueitemswithanarrayofitems1boxedlist) | validateAndBox([List<?>](#uniqueitemswithanarrayofitemslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedBoolean](#schema1boxedboolean)

abstract sealed class that stores validated payloads using boxed classes

## Schema1BoxedBoolean
public static final class Schema1BoxedBoolean<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema1
public static class Schema1<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedBoolean](#schema0boxedboolean)

abstract sealed class that stores validated payloads using boxed classes

## Schema0BoxedBoolean
public static final class Schema0BoxedBoolean<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema0
public static class Schema0<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## UniqueitemsWithAnArrayOfItemsListBuilder
public class UniqueitemsWithAnArrayOfItemsListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItemsListBuilder()<br>Creates an empty list |
| UniqueitemsWithAnArrayOfItemsListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(Void item) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(boolean item) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(String item) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(int item) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(float item) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(long item) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(double item) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(List<?> item) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## UniqueitemsWithAnArrayOfItemsList
public class UniqueitemsWithAnArrayOfItemsList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UniqueitemsWithAnArrayOfItemsList](#uniqueitemswithanarrayofitemslist) | of([List<? extends @Nullable Object>](#uniqueitemswithanarrayofitemslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
