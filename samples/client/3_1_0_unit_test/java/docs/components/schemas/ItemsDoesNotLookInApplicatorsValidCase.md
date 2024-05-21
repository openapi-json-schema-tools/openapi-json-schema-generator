# ItemsDoesNotLookInApplicatorsValidCase
unit_test_api.components.schemas.ItemsDoesNotLookInApplicatorsValidCase.java
public class ItemsDoesNotLookInApplicatorsValidCase<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1Boxed](#itemsdoesnotlookinapplicatorsvalidcase1boxed)<br> sealed interface for validated payloads |
| record | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1BoxedList](#itemsdoesnotlookinapplicatorsvalidcase1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1](#itemsdoesnotlookinapplicatorsvalidcase1)<br> schema class |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseListBuilder](#itemsdoesnotlookinapplicatorsvalidcaselistbuilder)<br> builder for List payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist)<br> output class for List payloads |
| sealed interface | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| record | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| record | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| record | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| record | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| record | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.Items](#items)<br> schema class |

## ItemsDoesNotLookInApplicatorsValidCase1Boxed
public sealed interface ItemsDoesNotLookInApplicatorsValidCase1Boxed<br>
permits<br>
[ItemsDoesNotLookInApplicatorsValidCase1BoxedList](#itemsdoesnotlookinapplicatorsvalidcase1boxedlist)

sealed interface that stores validated payloads using boxed classes

## ItemsDoesNotLookInApplicatorsValidCase1BoxedList
public record ItemsDoesNotLookInApplicatorsValidCase1BoxedList<br>
implements [ItemsDoesNotLookInApplicatorsValidCase1Boxed](#itemsdoesnotlookinapplicatorsvalidcase1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsDoesNotLookInApplicatorsValidCase1BoxedList([ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ItemsDoesNotLookInApplicatorsValidCase1
public static class ItemsDoesNotLookInApplicatorsValidCase1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.MapUtils;
import unit_test_api.schemas.validation.FrozenList;
import unit_test_api.schemas.validation.FrozenMap;
import unit_test_api.components.schemas.ItemsDoesNotLookInApplicatorsValidCase;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// List validation
ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseList validatedPayload =
    ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1.validate(
    new ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseListBuilder()
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
| [ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist) | validate([List<?>](#itemsdoesnotlookinapplicatorsvalidcaselistbuilder) arg, SchemaConfiguration configuration) |
| [ItemsDoesNotLookInApplicatorsValidCase1BoxedList](#itemsdoesnotlookinapplicatorsvalidcase1boxedlist) | validateAndBox([List<?>](#itemsdoesnotlookinapplicatorsvalidcaselistbuilder) arg, SchemaConfiguration configuration) |
| [ItemsDoesNotLookInApplicatorsValidCase1Boxed](#itemsdoesnotlookinapplicatorsvalidcase1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ItemsDoesNotLookInApplicatorsValidCaseListBuilder
public class ItemsDoesNotLookInApplicatorsValidCaseListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder()<br>Creates an empty list |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(Void item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(boolean item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(String item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(int item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(float item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(long item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(double item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(List<?> item) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsDoesNotLookInApplicatorsValidCaseList
public class ItemsDoesNotLookInApplicatorsValidCaseList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist) | of([List<? extends @Nullable Object>](#itemsdoesnotlookinapplicatorsvalidcaselistbuilder) arg, SchemaConfiguration configuration) |

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
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = 5 |

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
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ItemsBoxedString](#itemsboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ItemsBoxedVoid](#itemsboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ItemsBoxedNumber](#itemsboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ItemsBoxedBoolean](#itemsboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ItemsBoxedMap](#itemsboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ItemsBoxedList](#itemsboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ItemsBoxed](#itemsboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
