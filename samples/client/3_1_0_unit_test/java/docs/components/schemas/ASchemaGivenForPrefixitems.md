# ASchemaGivenForPrefixitems
unit_test_api.components.schemas.ASchemaGivenForPrefixitems.java
public class ASchemaGivenForPrefixitems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)<br> sealed interface for validated payloads |
| record | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedVoid](#aschemagivenforprefixitems1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedBoolean](#aschemagivenforprefixitems1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedNumber](#aschemagivenforprefixitems1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedString](#aschemagivenforprefixitems1boxedstring)<br> boxed class to store validated String payloads |
| record | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedList](#aschemagivenforprefixitems1boxedlist)<br> boxed class to store validated List payloads |
| record | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedMap](#aschemagivenforprefixitems1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1](#aschemagivenforprefixitems1)<br> schema class |
| sealed interface | [ASchemaGivenForPrefixitems.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [ASchemaGivenForPrefixitems.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ASchemaGivenForPrefixitems.Schema1](#schema1)<br> schema class |
| sealed interface | [ASchemaGivenForPrefixitems.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [ASchemaGivenForPrefixitems.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ASchemaGivenForPrefixitems.Schema0](#schema0)<br> schema class |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitemsListBuilder](#aschemagivenforprefixitemslistbuilder)<br> builder for List payloads |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist)<br> output class for List payloads |

## ASchemaGivenForPrefixitems1Boxed
public sealed interface ASchemaGivenForPrefixitems1Boxed<br>
permits<br>
[ASchemaGivenForPrefixitems1BoxedVoid](#aschemagivenforprefixitems1boxedvoid),
[ASchemaGivenForPrefixitems1BoxedBoolean](#aschemagivenforprefixitems1boxedboolean),
[ASchemaGivenForPrefixitems1BoxedNumber](#aschemagivenforprefixitems1boxednumber),
[ASchemaGivenForPrefixitems1BoxedString](#aschemagivenforprefixitems1boxedstring),
[ASchemaGivenForPrefixitems1BoxedList](#aschemagivenforprefixitems1boxedlist),
[ASchemaGivenForPrefixitems1BoxedMap](#aschemagivenforprefixitems1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ASchemaGivenForPrefixitems1BoxedVoid
public record ASchemaGivenForPrefixitems1BoxedVoid<br>
implements [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedBoolean
public record ASchemaGivenForPrefixitems1BoxedBoolean<br>
implements [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedNumber
public record ASchemaGivenForPrefixitems1BoxedNumber<br>
implements [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedString
public record ASchemaGivenForPrefixitems1BoxedString<br>
implements [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedList
public record ASchemaGivenForPrefixitems1BoxedList<br>
implements [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedList([ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedMap
public record ASchemaGivenForPrefixitems1BoxedMap<br>
implements [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist) | validate([List<?>](#aschemagivenforprefixitemslistbuilder) arg, SchemaConfiguration configuration) |
| [ASchemaGivenForPrefixitems1BoxedString](#aschemagivenforprefixitems1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ASchemaGivenForPrefixitems1BoxedVoid](#aschemagivenforprefixitems1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ASchemaGivenForPrefixitems1BoxedNumber](#aschemagivenforprefixitems1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ASchemaGivenForPrefixitems1BoxedBoolean](#aschemagivenforprefixitems1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ASchemaGivenForPrefixitems1BoxedMap](#aschemagivenforprefixitems1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ASchemaGivenForPrefixitems1BoxedList](#aschemagivenforprefixitems1boxedlist) | validateAndBox([List<?>](#aschemagivenforprefixitemslistbuilder) arg, SchemaConfiguration configuration) |
| [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedString](#schema1boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedString
public record Schema1BoxedString<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1
public static class Schema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

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
