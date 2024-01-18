# PrefixitemsWithNullInstanceElements
org.openapijsonschematools.client.components.schemas.PrefixitemsWithNullInstanceElements.java
public class PrefixitemsWithNullInstanceElements

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1](#prefixitemswithnullinstanceelements1)<br> schema class |
| static class | [PrefixitemsWithNullInstanceElements.Schema0](#schema0)<br> schema class |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElementsListBuilder](#prefixitemswithnullinstanceelementslistbuilder)<br> builder for List payloads |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElementsList](#prefixitemswithnullinstanceelementslist)<br> output class for List payloads |

## PrefixitemsWithNullInstanceElements1
public static class PrefixitemsWithNullInstanceElements1<br>
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
| [PrefixitemsWithNullInstanceElementsList](#prefixitemswithnullinstanceelementslist) | validate([List<?>](#prefixitemswithnullinstanceelementslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0
public static class Schema0<br>
extends NullJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## PrefixitemsWithNullInstanceElementsListBuilder
public class PrefixitemsWithNullInstanceElementsListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElementsListBuilder()<br>Creates an empty list |
| PrefixitemsWithNullInstanceElementsListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| PrefixitemsWithNullInstanceElementsListBuilder | add(Void item) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(boolean item) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(String item) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(int item) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(float item) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(long item) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(double item) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(List<?> item) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## PrefixitemsWithNullInstanceElementsList
public class PrefixitemsWithNullInstanceElementsList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PrefixitemsWithNullInstanceElementsList](#prefixitemswithnullinstanceelementslist) | of([List<? extends @Nullable Object>](#prefixitemswithnullinstanceelementslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
