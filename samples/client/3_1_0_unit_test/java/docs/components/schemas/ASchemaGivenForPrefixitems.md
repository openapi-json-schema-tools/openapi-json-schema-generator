# ASchemaGivenForPrefixitems
org.openapijsonschematools.client.components.schemas.ASchemaGivenForPrefixitems.java
public class ASchemaGivenForPrefixitems

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1](#aschemagivenforprefixitems1)<br> schema class |
| static class | [ASchemaGivenForPrefixitems.Schema1](#schema1)<br> schema class |
| static class | [ASchemaGivenForPrefixitems.Schema0](#schema0)<br> schema class |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitemsListBuilder](#aschemagivenforprefixitemslistbuilder)<br> builder for List payloads |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist)<br> output class for List payloads |

## ASchemaGivenForPrefixitems1
public static class ASchemaGivenForPrefixitems1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
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
| [ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist) | validate([List<?>](#aschemagivenforprefixitemslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1
public static class Schema1<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema0
public static class Schema0<br>
extends IntJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## ASchemaGivenForPrefixitemsListBuilder
public class ASchemaGivenForPrefixitemsListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitemsListBuilder()<br>Creates an empty list |
| ASchemaGivenForPrefixitemsListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ASchemaGivenForPrefixitemsListBuilder | add(Void item) |
| ASchemaGivenForPrefixitemsListBuilder | add(boolean item) |
| ASchemaGivenForPrefixitemsListBuilder | add(String item) |
| ASchemaGivenForPrefixitemsListBuilder | add(int item) |
| ASchemaGivenForPrefixitemsListBuilder | add(float item) |
| ASchemaGivenForPrefixitemsListBuilder | add(long item) |
| ASchemaGivenForPrefixitemsListBuilder | add(double item) |
| ASchemaGivenForPrefixitemsListBuilder | add(List<?> item) |
| ASchemaGivenForPrefixitemsListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## ASchemaGivenForPrefixitemsList
public class ASchemaGivenForPrefixitemsList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist) | of([List<? extends @Nullable Object>](#aschemagivenforprefixitemslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
