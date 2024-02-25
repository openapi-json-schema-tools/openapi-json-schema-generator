# ComposedArray
org.openapijsonschematools.client.components.schemas.ComposedArray.java
public class ComposedArray<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ComposedArray.ComposedArray1Boxed](#composedarray1boxed)<br> sealed interface for validated payloads |
| record | [ComposedArray.ComposedArray1BoxedList](#composedarray1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ComposedArray.ComposedArray1](#composedarray1)<br> schema class |
| static class | [ComposedArray.ComposedArrayListBuilder](#composedarraylistbuilder)<br> builder for List payloads |
| static class | [ComposedArray.ComposedArrayList](#composedarraylist)<br> output class for List payloads |
| sealed interface | [ComposedArray.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| record | [ComposedArray.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| record | [ComposedArray.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ComposedArray.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| record | [ComposedArray.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| record | [ComposedArray.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| record | [ComposedArray.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ComposedArray.Items](#items)<br> schema class |

## ComposedArray1Boxed
public sealed interface ComposedArray1Boxed<br>
permits<br>
[ComposedArray1BoxedList](#composedarray1boxedlist)

sealed interface that stores validated payloads using boxed classes

## ComposedArray1BoxedList
public record ComposedArray1BoxedList<br>
implements [ComposedArray1Boxed](#composedarray1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedArray1BoxedList([ComposedArrayList](#composedarraylist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ComposedArrayList](#composedarraylist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ComposedArray1
public static class ComposedArray1<br>
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
ComposedArray.ComposedArrayList validatedPayload =
    ComposedArray.ComposedArray1.validate(
    new ComposedArray.ComposedArrayListBuilder()
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
| [ComposedArrayList](#composedarraylist) | validate([List<?>](#composedarraylistbuilder) arg, SchemaConfiguration configuration) |
| [ComposedArray1BoxedList](#composedarray1boxedlist) | validateAndBox([List<?>](#composedarraylistbuilder) arg, SchemaConfiguration configuration) |
| [ComposedArray1Boxed](#composedarray1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ComposedArrayListBuilder
public class ComposedArrayListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ComposedArrayListBuilder()<br>Creates an empty list |
| ComposedArrayListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ComposedArrayListBuilder | add(Void item) |
| ComposedArrayListBuilder | add(boolean item) |
| ComposedArrayListBuilder | add(String item) |
| ComposedArrayListBuilder | add(int item) |
| ComposedArrayListBuilder | add(float item) |
| ComposedArrayListBuilder | add(long item) |
| ComposedArrayListBuilder | add(double item) |
| ComposedArrayListBuilder | add(List<?> item) |
| ComposedArrayListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## ComposedArrayList
public class ComposedArrayList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ComposedArrayList](#composedarraylist) | of([List<? extends @Nullable Object>](#composedarraylistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
public sealed interface ItemsBoxed<br>
permits<br>
[ItemsBoxedVoid](#itemsboxedvoid),
[ItemsBoxedBoolean](#itemsboxedboolean),
[ItemsBoxedNumber](#itemsboxednumber),
[ItemsBoxedString](#itemsboxedstring),
[ItemsBoxedList](#itemsboxedlist),
[ItemsBoxedMap](#itemsboxedmap)

sealed interface that stores validated payloads using boxed classes

## ItemsBoxedVoid
public record ItemsBoxedVoid<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ItemsBoxedBoolean
public record ItemsBoxedBoolean<br>
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
| @Nullable Object | getData()<br>validated payload |

## ItemsBoxedNumber
public record ItemsBoxedNumber<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ItemsBoxedString
public record ItemsBoxedString<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ItemsBoxedList
public record ItemsBoxedList<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ItemsBoxedMap
public record ItemsBoxedMap<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Items
public static class Items<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
