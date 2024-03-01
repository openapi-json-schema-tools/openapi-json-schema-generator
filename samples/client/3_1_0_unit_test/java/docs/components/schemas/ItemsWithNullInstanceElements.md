# ItemsWithNullInstanceElements
org.openapijsonschematools.client.components.schemas.ItemsWithNullInstanceElements.java
public class ItemsWithNullInstanceElements<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElements1Boxed](#itemswithnullinstanceelements1boxed)<br> sealed interface for validated payloads |
| record | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElements1BoxedList](#itemswithnullinstanceelements1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElements1](#itemswithnullinstanceelements1)<br> schema class |
| static class | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsListBuilder](#itemswithnullinstanceelementslistbuilder)<br> builder for List payloads |
| static class | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist)<br> output class for List payloads |
| sealed interface | [ItemsWithNullInstanceElements.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| record | [ItemsWithNullInstanceElements.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ItemsWithNullInstanceElements.Items](#items)<br> schema class |

## ItemsWithNullInstanceElements1Boxed
public sealed interface ItemsWithNullInstanceElements1Boxed<br>
permits<br>
[ItemsWithNullInstanceElements1BoxedList](#itemswithnullinstanceelements1boxedlist)

sealed interface that stores validated payloads using boxed classes

## ItemsWithNullInstanceElements1BoxedList
public record ItemsWithNullInstanceElements1BoxedList<br>
implements [ItemsWithNullInstanceElements1Boxed](#itemswithnullinstanceelements1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsWithNullInstanceElements1BoxedList([ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ItemsWithNullInstanceElements1
public static class ItemsWithNullInstanceElements1<br>
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
import org.openapijsonschematools.client.components.schemas.ItemsWithNullInstanceElements;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsList validatedPayload =
    ItemsWithNullInstanceElements.ItemsWithNullInstanceElements1.validate(
    new ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsListBuilder()
        .add((Void) null)

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
| [ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist) | validate([List<?>](#itemswithnullinstanceelementslistbuilder) arg, SchemaConfiguration configuration) |
| [ItemsWithNullInstanceElements1BoxedList](#itemswithnullinstanceelements1boxedlist) | validateAndBox([List<?>](#itemswithnullinstanceelementslistbuilder) arg, SchemaConfiguration configuration) |
| [ItemsWithNullInstanceElements1Boxed](#itemswithnullinstanceelements1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ItemsWithNullInstanceElementsListBuilder
public class ItemsWithNullInstanceElementsListBuilder<br>
builder for `List<Void>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsWithNullInstanceElementsListBuilder()<br>Creates an empty list |
| ItemsWithNullInstanceElementsListBuilder(List<Void> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsWithNullInstanceElementsListBuilder | add(Void item) |
| List<Void> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsWithNullInstanceElementsList
public class ItemsWithNullInstanceElementsList<br>
extends `FrozenList<Void>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist) | of([List<Void>](#itemswithnullinstanceelementslistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
public sealed interface ItemsBoxed<br>
permits<br>
[ItemsBoxedVoid](#itemsboxedvoid)

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

## Items
public static class Items<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
