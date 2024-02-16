# ItemsContains
org.openapijsonschematools.client.components.schemas.ItemsContains.java
public class ItemsContains<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ItemsContains.ItemsContains1Boxed](#itemscontains1boxed)<br> abstract sealed validated payload class |
| static class | [ItemsContains.ItemsContains1BoxedList](#itemscontains1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ItemsContains.ItemsContains1](#itemscontains1)<br> schema class |
| static class | [ItemsContains.ItemsContainsListBuilder](#itemscontainslistbuilder)<br> builder for List payloads |
| static class | [ItemsContains.ItemsContainsList](#itemscontainslist)<br> output class for List payloads |
| static class | [ItemsContains.ItemsBoxed](#itemsboxed)<br> abstract sealed validated payload class |
| static class | [ItemsContains.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ItemsContains.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ItemsContains.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ItemsContains.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [ItemsContains.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| static class | [ItemsContains.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ItemsContains.Items](#items)<br> schema class |
| static class | [ItemsContains.ContainsBoxed](#containsboxed)<br> abstract sealed validated payload class |
| static class | [ItemsContains.ContainsBoxedVoid](#containsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ItemsContains.ContainsBoxedBoolean](#containsboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ItemsContains.ContainsBoxedNumber](#containsboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ItemsContains.ContainsBoxedString](#containsboxedstring)<br> boxed class to store validated String payloads |
| static class | [ItemsContains.ContainsBoxedList](#containsboxedlist)<br> boxed class to store validated List payloads |
| static class | [ItemsContains.ContainsBoxedMap](#containsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ItemsContains.Contains](#contains)<br> schema class |

## ItemsContains1Boxed
public static abstract sealed class ItemsContains1Boxed<br>
permits<br>
[ItemsContains1BoxedList](#itemscontains1boxedlist)

abstract sealed class that stores validated payloads using boxed classes

## ItemsContains1BoxedList
public static final class ItemsContains1BoxedList<br>
extends [ItemsContains1Boxed](#itemscontains1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsContains1BoxedList([ItemsContainsList](#itemscontainslist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ItemsContainsList](#itemscontainslist) | data<br>validated payload |

## ItemsContains1
public static class ItemsContains1<br>
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
ItemsContains.ItemsContainsList validatedPayload =
    ItemsContains.ItemsContains1.validate(
    new ItemsContains.ItemsContainsListBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items.class](#items) |
| Class<? extends JsonSchema> | contains = [Contains.class](#contains) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsContainsList](#itemscontainslist) | validate([List<?>](#itemscontainslistbuilder) arg, SchemaConfiguration configuration) |
| [ItemsContains1BoxedList](#itemscontains1boxedlist) | validateAndBox([List<?>](#itemscontainslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ItemsContainsListBuilder
public class ItemsContainsListBuilder<br>
builder for `List<@Nullable Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsContainsListBuilder()<br>Creates an empty list |
| ItemsContainsListBuilder(List<@Nullable Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsContainsListBuilder | add(Void item) |
| ItemsContainsListBuilder | add(boolean item) |
| ItemsContainsListBuilder | add(String item) |
| ItemsContainsListBuilder | add(int item) |
| ItemsContainsListBuilder | add(float item) |
| ItemsContainsListBuilder | add(long item) |
| ItemsContainsListBuilder | add(double item) |
| ItemsContainsListBuilder | add(List<?> item) |
| ItemsContainsListBuilder | add(Map<String, ?> item) |
| List<@Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsContainsList
public class ItemsContainsList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsContainsList](#itemscontainslist) | of([List<? extends @Nullable Object>](#itemscontainslistbuilder) arg, SchemaConfiguration configuration) |

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
| BigDecimal | multipleOf = new BigDecimal("2") |

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
## ContainsBoxed
public static abstract sealed class ContainsBoxed<br>
permits<br>
[ContainsBoxedVoid](#containsboxedvoid),
[ContainsBoxedBoolean](#containsboxedboolean),
[ContainsBoxedNumber](#containsboxednumber),
[ContainsBoxedString](#containsboxedstring),
[ContainsBoxedList](#containsboxedlist),
[ContainsBoxedMap](#containsboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ContainsBoxedVoid
public static final class ContainsBoxedVoid<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ContainsBoxedBoolean
public static final class ContainsBoxedBoolean<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ContainsBoxedNumber
public static final class ContainsBoxedNumber<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ContainsBoxedString
public static final class ContainsBoxedString<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ContainsBoxedList
public static final class ContainsBoxedList<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ContainsBoxedMap
public static final class ContainsBoxedMap<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Contains
public static class Contains<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = new BigDecimal("3") |

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
| [ContainsBoxedString](#containsboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ContainsBoxedVoid](#containsboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ContainsBoxedNumber](#containsboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ContainsBoxedBoolean](#containsboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ContainsBoxedMap](#containsboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ContainsBoxedList](#containsboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
