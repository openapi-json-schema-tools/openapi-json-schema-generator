# ArrayTypeMatchesArrays
org.openapijsonschematools.client.components.schemas.ArrayTypeMatchesArrays.java
public class ArrayTypeMatchesArrays

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1Boxed](#arraytypematchesarrays1boxed)<br> abstract sealed validated payload class |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1BoxedList](#arraytypematchesarrays1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1](#arraytypematchesarrays1)<br> schema class |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArraysListBuilder](#arraytypematchesarrayslistbuilder)<br> builder for List payloads |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArraysList](#arraytypematchesarrayslist)<br> output class for List payloads |
| static class | [ArrayTypeMatchesArrays.ItemsBoxed](#itemsboxed)<br> abstract sealed validated payload class |
| static class | [ArrayTypeMatchesArrays.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ArrayTypeMatchesArrays.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ArrayTypeMatchesArrays.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ArrayTypeMatchesArrays.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [ArrayTypeMatchesArrays.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayTypeMatchesArrays.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ArrayTypeMatchesArrays.Items](#items)<br> schema class |

## ArrayTypeMatchesArrays1Boxed
public static abstract sealed class ArrayTypeMatchesArrays1Boxed<br>
permits<br>
[ArrayTypeMatchesArrays1BoxedList](#arraytypematchesarrays1boxedlist)

abstract sealed class that stores validated payloads using boxed classes

## ArrayTypeMatchesArrays1BoxedList
public static final class ArrayTypeMatchesArrays1BoxedList<br>
extends [ArrayTypeMatchesArrays1Boxed](#arraytypematchesarrays1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayTypeMatchesArrays1BoxedList([ArrayTypeMatchesArraysList](#arraytypematchesarrayslist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ArrayTypeMatchesArraysList](#arraytypematchesarrayslist) | data<br>validated payload |

## ArrayTypeMatchesArrays1
public static class ArrayTypeMatchesArrays1<br>
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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

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
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items.class](#items) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayTypeMatchesArraysList](#arraytypematchesarrayslist) | validate([List<?>](#arraytypematchesarrayslistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayTypeMatchesArrays1BoxedList](#arraytypematchesarrays1boxedlist) | validateAndBox([List<?>](#arraytypematchesarrayslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayTypeMatchesArraysListBuilder
public class ArrayTypeMatchesArraysListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayTypeMatchesArraysListBuilder()<br>Creates an empty list |
| ArrayTypeMatchesArraysListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayTypeMatchesArraysListBuilder | add(Void item) |
| ArrayTypeMatchesArraysListBuilder | add(boolean item) |
| ArrayTypeMatchesArraysListBuilder | add(String item) |
| ArrayTypeMatchesArraysListBuilder | add(int item) |
| ArrayTypeMatchesArraysListBuilder | add(float item) |
| ArrayTypeMatchesArraysListBuilder | add(long item) |
| ArrayTypeMatchesArraysListBuilder | add(double item) |
| ArrayTypeMatchesArraysListBuilder | add(List<?> item) |
| ArrayTypeMatchesArraysListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayTypeMatchesArraysList
public class ArrayTypeMatchesArraysList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayTypeMatchesArraysList](#arraytypematchesarrayslist) | of([List<? extends @Nullable Object>](#arraytypematchesarrayslistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
public static abstract sealed class ItemsBoxed<br>
permits<br>
[ItemsBoxedVoid](#itemsboxedvoid),
[ItemsBoxedBoolean](#itemsboxedboolean),
[ItemsBoxedNumber](#itemsboxednumber),
[ItemsBoxedString](#itemsboxedstring),
[ItemsBoxedList](#itemsboxedlist),
[ItemsBoxedMap](#itemsboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ItemsBoxedVoid
public static final class ItemsBoxedVoid<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ItemsBoxedBoolean
public static final class ItemsBoxedBoolean<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ItemsBoxedNumber
public static final class ItemsBoxedNumber<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ItemsBoxedString
public static final class ItemsBoxedString<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ItemsBoxedList
public static final class ItemsBoxedList<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ItemsBoxedMap
public static final class ItemsBoxedMap<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Items
public static class Items<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
