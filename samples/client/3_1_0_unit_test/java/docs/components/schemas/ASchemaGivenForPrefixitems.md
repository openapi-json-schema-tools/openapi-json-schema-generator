# ASchemaGivenForPrefixitems
org.openapijsonschematools.client.components.schemas.ASchemaGivenForPrefixitems.java
public class ASchemaGivenForPrefixitems

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)<br> abstract sealed validated payload class |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedVoid](#aschemagivenforprefixitems1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedBoolean](#aschemagivenforprefixitems1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedNumber](#aschemagivenforprefixitems1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedString](#aschemagivenforprefixitems1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedList](#aschemagivenforprefixitems1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedMap](#aschemagivenforprefixitems1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1](#aschemagivenforprefixitems1)<br> schema class |
| static class | [ASchemaGivenForPrefixitems.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [ASchemaGivenForPrefixitems.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ASchemaGivenForPrefixitems.Schema1](#schema1)<br> schema class |
| static class | [ASchemaGivenForPrefixitems.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [ASchemaGivenForPrefixitems.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ASchemaGivenForPrefixitems.Schema0](#schema0)<br> schema class |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitemsListBuilder](#aschemagivenforprefixitemslistbuilder)<br> builder for List payloads |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist)<br> output class for List payloads |

## ASchemaGivenForPrefixitems1Boxed
public static abstract sealed class ASchemaGivenForPrefixitems1Boxed<br>
permits<br>
[ASchemaGivenForPrefixitems1BoxedVoid](#aschemagivenforprefixitems1boxedvoid),
[ASchemaGivenForPrefixitems1BoxedBoolean](#aschemagivenforprefixitems1boxedboolean),
[ASchemaGivenForPrefixitems1BoxedNumber](#aschemagivenforprefixitems1boxednumber),
[ASchemaGivenForPrefixitems1BoxedString](#aschemagivenforprefixitems1boxedstring),
[ASchemaGivenForPrefixitems1BoxedList](#aschemagivenforprefixitems1boxedlist),
[ASchemaGivenForPrefixitems1BoxedMap](#aschemagivenforprefixitems1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ASchemaGivenForPrefixitems1BoxedVoid
public static final class ASchemaGivenForPrefixitems1BoxedVoid<br>
extends [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedBoolean
public static final class ASchemaGivenForPrefixitems1BoxedBoolean<br>
extends [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedNumber
public static final class ASchemaGivenForPrefixitems1BoxedNumber<br>
extends [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedString
public static final class ASchemaGivenForPrefixitems1BoxedString<br>
extends [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedList
public static final class ASchemaGivenForPrefixitems1BoxedList<br>
extends [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedList([ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist) | data<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedMap
public static final class ASchemaGivenForPrefixitems1BoxedMap<br>
extends [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedString](#schema1boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema1BoxedString
public static final class Schema1BoxedString<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema1
public static class Schema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedNumber](#schema0boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Schema0BoxedNumber
public static final class Schema0BoxedNumber<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema0
public static class Schema0<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
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
