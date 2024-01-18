# AdditionalItemsAreAllowedByDefault
org.openapijsonschematools.client.components.schemas.AdditionalItemsAreAllowedByDefault.java
public class AdditionalItemsAreAllowedByDefault

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1](#additionalitemsareallowedbydefault1)<br> schema class |
| static class | [AdditionalItemsAreAllowedByDefault.Schema0](#schema0)<br> schema class |
| static class | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefaultListBuilder](#additionalitemsareallowedbydefaultlistbuilder)<br> builder for List payloads |
| static class | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefaultList](#additionalitemsareallowedbydefaultlist)<br> output class for List payloads |

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
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AdditionalItemsAreAllowedByDefaultList](#additionalitemsareallowedbydefaultlist) | validate([List<?>](#additionalitemsareallowedbydefaultlistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0
public static class Schema0<br>
extends IntJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

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
