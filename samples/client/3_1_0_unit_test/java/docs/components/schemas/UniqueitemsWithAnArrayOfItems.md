# UniqueitemsWithAnArrayOfItems
org.openapijsonschematools.client.components.schemas.UniqueitemsWithAnArrayOfItems.java
public class UniqueitemsWithAnArrayOfItems

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1](#uniqueitemswithanarrayofitems1)<br> schema class |
| static class | [UniqueitemsWithAnArrayOfItems.Schema1](#schema1)<br> schema class |
| static class | [UniqueitemsWithAnArrayOfItems.Schema0](#schema0)<br> schema class |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItemsListBuilder](#uniqueitemswithanarrayofitemslistbuilder)<br> builder for List payloads |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItemsList](#uniqueitemswithanarrayofitemslist)<br> output class for List payloads |

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
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UniqueitemsWithAnArrayOfItemsList](#uniqueitemswithanarrayofitemslist) | validate([List<?>](#uniqueitemswithanarrayofitemslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1
public static class Schema1<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema0
public static class Schema0<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

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
