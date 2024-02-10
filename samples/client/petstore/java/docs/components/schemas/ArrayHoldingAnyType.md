# ArrayHoldingAnyType
org.openapijsonschematools.client.components.schemas.ArrayHoldingAnyType.java
public class ArrayHoldingAnyType

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayHoldingAnyType.ArrayHoldingAnyType1Boxed](#arrayholdinganytype1boxed)<br> sealed validated payload class |
| static class | [ArrayHoldingAnyType.ArrayHoldingAnyType1](#arrayholdinganytype1)<br> schema class |
| static class | [ArrayHoldingAnyType.ArrayHoldingAnyTypeListBuilder](#arrayholdinganytypelistbuilder)<br> builder for List payloads |
| static class | [ArrayHoldingAnyType.ArrayHoldingAnyTypeList](#arrayholdinganytypelist)<br> output class for List payloads |
| static class | [ArrayHoldingAnyType.ItemsBoxed](#itemsboxed)<br> sealed validated payload class |
| static class | [ArrayHoldingAnyType.Items](#items)<br> schema class |

## ArrayHoldingAnyType1Boxed
public static abstract sealed class ArrayHoldingAnyType1Boxed<br>
permits<br>
[ArrayHoldingAnyType1BoxedList](#arrayholdinganytype1boxedlist)

A sealed class that stores validated payloads using boxed classes

## ArrayHoldingAnyType1BoxedList
public static final class ArrayHoldingAnyType1BoxedList<br>
extends ArrayHoldingAnyType1Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayHoldingAnyType1BoxedList(ArrayHoldingAnyTypeList data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| ArrayHoldingAnyTypeList | data<br>validated payload |

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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

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
| ArrayHoldingAnyTypeListBuilder | add(Void item) |
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
public static abstract sealed class ItemsBoxed<br>
permits<br>
[ItemsBoxedVoid](#itemsboxedvoid),
[ItemsBoxedBoolean](#itemsboxedboolean),
[ItemsBoxedNumber](#itemsboxednumber),
[ItemsBoxedString](#itemsboxedstring),
[ItemsBoxedList](#itemsboxedlist),
[ItemsBoxedMap](#itemsboxedmap)

A sealed class that stores validated payloads using boxed classes

## ItemsBoxedVoid
public static final class ItemsBoxedVoid<br>
extends ItemsBoxed

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
extends ItemsBoxed

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
extends ItemsBoxed

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
extends ItemsBoxed

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
extends ItemsBoxed

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
extends ItemsBoxed

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

## Description
any type can be stored here

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
