# ItemsDoesNotLookInApplicatorsValidCase
org.openapijsonschematools.client.components.schemas.ItemsDoesNotLookInApplicatorsValidCase.java
public class ItemsDoesNotLookInApplicatorsValidCase

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1Boxed](#itemsdoesnotlookinapplicatorsvalidcase1boxed)<br> abstract sealed validated payload class |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1BoxedList](#itemsdoesnotlookinapplicatorsvalidcase1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1](#itemsdoesnotlookinapplicatorsvalidcase1)<br> schema class |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseListBuilder](#itemsdoesnotlookinapplicatorsvalidcaselistbuilder)<br> builder for List payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist)<br> output class for List payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxed](#itemsboxed)<br> abstract sealed validated payload class |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ItemsDoesNotLookInApplicatorsValidCase.Items](#items)<br> schema class |

## ItemsDoesNotLookInApplicatorsValidCase1Boxed
public static abstract sealed class ItemsDoesNotLookInApplicatorsValidCase1Boxed<br>
permits<br>
[ItemsDoesNotLookInApplicatorsValidCase1BoxedList](#itemsdoesnotlookinapplicatorsvalidcase1boxedlist)

abstract sealed class that stores validated payloads using boxed classes

## ItemsDoesNotLookInApplicatorsValidCase1BoxedList
public static final class ItemsDoesNotLookInApplicatorsValidCase1BoxedList<br>
extends [ItemsDoesNotLookInApplicatorsValidCase1Boxed](#itemsdoesnotlookinapplicatorsvalidcase1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsDoesNotLookInApplicatorsValidCase1BoxedList([ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist) | data<br>validated payload |

## ItemsDoesNotLookInApplicatorsValidCase1
public static class ItemsDoesNotLookInApplicatorsValidCase1<br>
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
