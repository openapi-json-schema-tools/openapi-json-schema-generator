# ArrayTypeMatchesArrays
org.openapijsonschematools.client.components.schemas.ArrayTypeMatchesArrays.java
class ArrayTypeMatchesArrays<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1Boxed](#arraytypematchesarrays1boxed)<br> sealed interface for validated payloads |
| record | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1BoxedList](#arraytypematchesarrays1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1](#arraytypematchesarrays1)<br> schema class |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArraysListBuilder](#arraytypematchesarrayslistbuilder)<br> builder for List payloads |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArraysList](#arraytypematchesarrayslist)<br> output class for List payloads |
| sealed interface | [ArrayTypeMatchesArrays.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| record | [ArrayTypeMatchesArrays.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| record | [ArrayTypeMatchesArrays.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ArrayTypeMatchesArrays.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| record | [ArrayTypeMatchesArrays.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| record | [ArrayTypeMatchesArrays.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| record | [ArrayTypeMatchesArrays.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ArrayTypeMatchesArrays.Items](#items)<br> schema class |

## ArrayTypeMatchesArrays1Boxed
sealed interface ArrayTypeMatchesArrays1Boxed<br>
permits<br>
[ArrayTypeMatchesArrays1BoxedList](#arraytypematchesarrays1boxedlist)

sealed interface that stores validated payloads using boxed classes

## ArrayTypeMatchesArrays1BoxedList
data class ArrayTypeMatchesArrays1BoxedList<br>
implements [ArrayTypeMatchesArrays1Boxed](#arraytypematchesarrays1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayTypeMatchesArrays1BoxedList([ArrayTypeMatchesArraysList](#arraytypematchesarrayslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayTypeMatchesArraysList](#arraytypematchesarrayslist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ArrayTypeMatchesArrays1
class ArrayTypeMatchesArrays1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.components.schemas.ArrayTypeMatchesArrays;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// List validation
ArrayTypeMatchesArrays.ArrayTypeMatchesArraysList validatedPayload =
    ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.validate(
    new ArrayTypeMatchesArrays.ArrayTypeMatchesArraysListBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(List::class.java) |
| Class<? extends JsonSchema> | items = [Items::class.java](#items) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayTypeMatchesArraysList](#arraytypematchesarrayslist) | validate(arg: [List<*>](#arraytypematchesarrayslistbuilder), configuration: SchemaConfiguration) |
| [ArrayTypeMatchesArrays1BoxedList](#arraytypematchesarrays1boxedlist) | validateAndBox([List<*>](#arraytypematchesarrayslistbuilder), configuration: SchemaConfiguration) |
| [ArrayTypeMatchesArrays1Boxed](#arraytypematchesarrays1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ArrayTypeMatchesArraysListBuilder
class ArrayTypeMatchesArraysListBuilder<br>
builder for `List<Any?>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayTypeMatchesArraysListBuilder()<br>Creates an empty list |
| ArrayTypeMatchesArraysListBuilder(List<Any?> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayTypeMatchesArraysListBuilder | add(item: Nothing?) |
| ArrayTypeMatchesArraysListBuilder | add(item: Boolean) |
| ArrayTypeMatchesArraysListBuilder | add(item: String) |
| ArrayTypeMatchesArraysListBuilder | add(item: Int) |
| ArrayTypeMatchesArraysListBuilder | add(item: Float) |
| ArrayTypeMatchesArraysListBuilder | add(item: Long) |
| ArrayTypeMatchesArraysListBuilder | add(item: Double) |
| ArrayTypeMatchesArraysListBuilder | add(item: List<Any?>) |
| ArrayTypeMatchesArraysListBuilder | add(item: Map<String, Any?>) |
| List<Any?> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayTypeMatchesArraysList
class ArrayTypeMatchesArraysList<br>
extends `FrozenList<Any?>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayTypeMatchesArraysList](#arraytypematchesarrayslist) | of([List<Any?>](#arraytypematchesarrayslistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
sealed interface ItemsBoxed<br>
permits<br>
[ItemsBoxedVoid](#itemsboxedvoid),
[ItemsBoxedBoolean](#itemsboxedboolean),
[ItemsBoxedNumber](#itemsboxednumber),
[ItemsBoxedString](#itemsboxedstring),
[ItemsBoxedList](#itemsboxedlist),
[ItemsBoxedMap](#itemsboxedmap)

sealed interface that stores validated payloads using boxed classes

## ItemsBoxedVoid
data class ItemsBoxedVoid<br>
implements [ItemsBoxed](#itemsboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsBoxedBoolean
data class ItemsBoxedBoolean<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsBoxedNumber
data class ItemsBoxedNumber<br>
implements [ItemsBoxed](#itemsboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsBoxedString
data class ItemsBoxedString<br>
implements [ItemsBoxed](#itemsboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsBoxedList
data class ItemsBoxedList<br>
implements [ItemsBoxed](#itemsboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsBoxedMap
data class ItemsBoxedMap<br>
implements [ItemsBoxed](#itemsboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Items
class Items<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
