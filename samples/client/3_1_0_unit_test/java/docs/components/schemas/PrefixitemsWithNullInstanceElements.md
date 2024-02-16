# PrefixitemsWithNullInstanceElements
org.openapijsonschematools.client.components.schemas.PrefixitemsWithNullInstanceElements.java
public class PrefixitemsWithNullInstanceElements<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)<br> abstract sealed validated payload class |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1BoxedVoid](#prefixitemswithnullinstanceelements1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1BoxedBoolean](#prefixitemswithnullinstanceelements1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1BoxedNumber](#prefixitemswithnullinstanceelements1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1BoxedString](#prefixitemswithnullinstanceelements1boxedstring)<br> boxed class to store validated String payloads |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1BoxedList](#prefixitemswithnullinstanceelements1boxedlist)<br> boxed class to store validated List payloads |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1BoxedMap](#prefixitemswithnullinstanceelements1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1](#prefixitemswithnullinstanceelements1)<br> schema class |
| static class | [PrefixitemsWithNullInstanceElements.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [PrefixitemsWithNullInstanceElements.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [PrefixitemsWithNullInstanceElements.Schema0](#schema0)<br> schema class |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElementsListBuilder](#prefixitemswithnullinstanceelementslistbuilder)<br> builder for List payloads |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElementsList](#prefixitemswithnullinstanceelementslist)<br> output class for List payloads |

## PrefixitemsWithNullInstanceElements1Boxed
public static abstract sealed class PrefixitemsWithNullInstanceElements1Boxed<br>
permits<br>
[PrefixitemsWithNullInstanceElements1BoxedVoid](#prefixitemswithnullinstanceelements1boxedvoid),
[PrefixitemsWithNullInstanceElements1BoxedBoolean](#prefixitemswithnullinstanceelements1boxedboolean),
[PrefixitemsWithNullInstanceElements1BoxedNumber](#prefixitemswithnullinstanceelements1boxednumber),
[PrefixitemsWithNullInstanceElements1BoxedString](#prefixitemswithnullinstanceelements1boxedstring),
[PrefixitemsWithNullInstanceElements1BoxedList](#prefixitemswithnullinstanceelements1boxedlist),
[PrefixitemsWithNullInstanceElements1BoxedMap](#prefixitemswithnullinstanceelements1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## PrefixitemsWithNullInstanceElements1BoxedVoid
public static final class PrefixitemsWithNullInstanceElements1BoxedVoid<br>
extends [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElements1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## PrefixitemsWithNullInstanceElements1BoxedBoolean
public static final class PrefixitemsWithNullInstanceElements1BoxedBoolean<br>
extends [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElements1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## PrefixitemsWithNullInstanceElements1BoxedNumber
public static final class PrefixitemsWithNullInstanceElements1BoxedNumber<br>
extends [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElements1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## PrefixitemsWithNullInstanceElements1BoxedString
public static final class PrefixitemsWithNullInstanceElements1BoxedString<br>
extends [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElements1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## PrefixitemsWithNullInstanceElements1BoxedList
public static final class PrefixitemsWithNullInstanceElements1BoxedList<br>
extends [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElements1BoxedList([PrefixitemsWithNullInstanceElementsList](#prefixitemswithnullinstanceelementslist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [PrefixitemsWithNullInstanceElementsList](#prefixitemswithnullinstanceelementslist) | data<br>validated payload |

## PrefixitemsWithNullInstanceElements1BoxedMap
public static final class PrefixitemsWithNullInstanceElements1BoxedMap<br>
extends [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElements1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [PrefixitemsWithNullInstanceElementsList](#prefixitemswithnullinstanceelementslist) | validate([List<?>](#prefixitemswithnullinstanceelementslistbuilder) arg, SchemaConfiguration configuration) |
| [PrefixitemsWithNullInstanceElements1BoxedString](#prefixitemswithnullinstanceelements1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PrefixitemsWithNullInstanceElements1BoxedVoid](#prefixitemswithnullinstanceelements1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [PrefixitemsWithNullInstanceElements1BoxedNumber](#prefixitemswithnullinstanceelements1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [PrefixitemsWithNullInstanceElements1BoxedBoolean](#prefixitemswithnullinstanceelements1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [PrefixitemsWithNullInstanceElements1BoxedMap](#prefixitemswithnullinstanceelements1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [PrefixitemsWithNullInstanceElements1BoxedList](#prefixitemswithnullinstanceelements1boxedlist) | validateAndBox([List<?>](#prefixitemswithnullinstanceelementslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid)

abstract sealed class that stores validated payloads using boxed classes

## Schema0BoxedVoid
public static final class Schema0BoxedVoid<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema0
public static class Schema0<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

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
