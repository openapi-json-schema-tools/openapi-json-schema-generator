# ComposedArray
org.openapijsonschematools.client.components.schemas.ComposedArray.java
public class ComposedArray

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ComposedArray.ComposedArray1Boxed](#composedarray1boxed)<br> sealed validated payload class |
| static class | [ComposedArray.ComposedArray1](#composedarray1)<br> schema class |
| static class | [ComposedArray.ComposedArrayListBuilder](#composedarraylistbuilder)<br> builder for List payloads |
| static class | [ComposedArray.ComposedArrayList](#composedarraylist)<br> output class for List payloads |
| static class | [ComposedArray.ItemsBoxed](#itemsboxed)<br> sealed validated payload class |
| static class | [ComposedArray.Items](#items)<br> schema class |

## ComposedArray1Boxed
public static abstract sealed class ComposedArray1Boxed<br>
permits<br>
[ComposedArray1BoxedList](#composedarray1boxedlist)

A sealed class that stores validated payloads using boxed classes

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
public static abstract sealed class ItemsBoxed<br>
permits<br>
[ItemsBoxedVoid](#itemsboxedvoid),
[ItemsBoxedBoolean](#itemsboxedboolean),
[ItemsBoxedNumber](#itemsboxednumber),
[ItemsBoxedString](#itemsboxedstring),
[ItemsBoxedList](#itemsboxedlist),
[ItemsBoxedMap](#itemsboxedmap)

A sealed class that stores validated payloads using boxed classes

## Items
public static class Items<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
