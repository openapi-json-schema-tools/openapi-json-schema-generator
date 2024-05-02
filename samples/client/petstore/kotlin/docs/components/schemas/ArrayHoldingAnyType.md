# ArrayHoldingAnyType
org.openapijsonschematools.client.components.schemas.ArrayHoldingAnyType.java
public class ArrayHoldingAnyType<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ArrayHoldingAnyType.ArrayHoldingAnyType1Boxed](#arrayholdinganytype1boxed)<br> sealed interface for validated payloads |
| record | [ArrayHoldingAnyType.ArrayHoldingAnyType1BoxedList](#arrayholdinganytype1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayHoldingAnyType.ArrayHoldingAnyType1](#arrayholdinganytype1)<br> schema class |
| static class | [ArrayHoldingAnyType.ArrayHoldingAnyTypeListBuilder](#arrayholdinganytypelistbuilder)<br> builder for List payloads |
| static class | [ArrayHoldingAnyType.ArrayHoldingAnyTypeList](#arrayholdinganytypelist)<br> output class for List payloads |
| sealed interface | [ArrayHoldingAnyType.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| record | [ArrayHoldingAnyType.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| record | [ArrayHoldingAnyType.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ArrayHoldingAnyType.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| record | [ArrayHoldingAnyType.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| record | [ArrayHoldingAnyType.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| record | [ArrayHoldingAnyType.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ArrayHoldingAnyType.Items](#items)<br> schema class |

## ArrayHoldingAnyType1Boxed
public sealed interface ArrayHoldingAnyType1Boxed<br>
permits<br>
[ArrayHoldingAnyType1BoxedList](#arrayholdinganytype1boxedlist)

sealed interface that stores validated payloads using boxed classes

## ArrayHoldingAnyType1BoxedList
public record ArrayHoldingAnyType1BoxedList<br>
implements [ArrayHoldingAnyType1Boxed](#arrayholdinganytype1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayHoldingAnyType1BoxedList([ArrayHoldingAnyTypeList](#arrayholdinganytypelist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayHoldingAnyTypeList](#arrayholdinganytypelist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ArrayHoldingAnyType1
public static class ArrayHoldingAnyType1<br>
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
import org.openapijsonschematools.client.components.schemas.ArrayHoldingAnyType;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// List validation
ArrayHoldingAnyType.ArrayHoldingAnyTypeList validatedPayload =
    ArrayHoldingAnyType.ArrayHoldingAnyType1.validate(
    new ArrayHoldingAnyType.ArrayHoldingAnyTypeListBuilder()
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
| [ArrayHoldingAnyTypeList](#arrayholdinganytypelist) | validate([List<?>](#arrayholdinganytypelistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayHoldingAnyType1BoxedList](#arrayholdinganytype1boxedlist) | validateAndBox([List<?>](#arrayholdinganytypelistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayHoldingAnyType1Boxed](#arrayholdinganytype1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ArrayHoldingAnyTypeListBuilder
public class ArrayHoldingAnyTypeListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayHoldingAnyTypeListBuilder()<br>Creates an empty list |
| ArrayHoldingAnyTypeListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayHoldingAnyTypeListBuilder | add(Nothing? item) |
| ArrayHoldingAnyTypeListBuilder | add(boolean item) |
| ArrayHoldingAnyTypeListBuilder | add(String item) |
| ArrayHoldingAnyTypeListBuilder | add(int item) |
| ArrayHoldingAnyTypeListBuilder | add(float item) |
| ArrayHoldingAnyTypeListBuilder | add(long item) |
| ArrayHoldingAnyTypeListBuilder | add(double item) |
| ArrayHoldingAnyTypeListBuilder | add(List<?> item) |
| ArrayHoldingAnyTypeListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayHoldingAnyTypeList
public class ArrayHoldingAnyTypeList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayHoldingAnyTypeList](#arrayholdinganytypelist) | of([List<? extends @Nullable Object>](#arrayholdinganytypelistbuilder) arg, SchemaConfiguration configuration) |

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
| ItemsBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
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

## Description
any type can be stored here

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
