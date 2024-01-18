# UniqueitemsFalseWithAnArrayOfItems
org.openapijsonschematools.client.components.schemas.UniqueitemsFalseWithAnArrayOfItems.java
public class UniqueitemsFalseWithAnArrayOfItems

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1](#uniqueitemsfalsewithanarrayofitems1)<br> schema class |
| static class | [UniqueitemsFalseWithAnArrayOfItems.Schema1](#schema1)<br> schema class |
| static class | [UniqueitemsFalseWithAnArrayOfItems.Schema0](#schema0)<br> schema class |
| static class | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder](#uniqueitemsfalsewithanarrayofitemslistbuilder)<br> builder for List payloads |
| static class | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsList](#uniqueitemsfalsewithanarrayofitemslist)<br> output class for List payloads |

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
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseWithAnArrayOfItemsList](#uniqueitemsfalsewithanarrayofitemslist) | validate([List<?>](#uniqueitemsfalsewithanarrayofitemslistbuilder) arg, SchemaConfiguration configuration) |
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
