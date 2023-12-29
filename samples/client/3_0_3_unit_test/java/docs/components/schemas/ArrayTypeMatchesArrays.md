# ArrayTypeMatchesArrays
org.openapijsonschematools.client.components.schemas.ArrayTypeMatchesArrays.java
public class ArrayTypeMatchesArrays

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1](#arraytypematchesarrays1)<br> schema class |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArraysListBuilder](#arraytypematchesarrayslistbuilder)<br> builder for List payloads |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArraysList](#arraytypematchesarrayslist)<br> output class for List payloads |
| static class | [ArrayTypeMatchesArrays.Items](#items)<br> schema class |

## ArrayTypeMatchesArrays1
public static class ArrayTypeMatchesArrays1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
ArrayTypeMatchesArrays.ArrayTypeMatchesArraysList validatedPayload =
    ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.validate(
    Arrays.asList(
    ),
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayTypeMatchesArraysListBuilder
public class ArrayTypeMatchesArraysListBuilder<br>
builder for `List<? extends @Nullable Object>`

A class that builds the List input type

## Constructor Summary
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
| List<? extends @Nullable Object> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayTypeMatchesArraysList
public class ArrayTypeMatchesArraysList<br>
extends `FrozenList<@Nullable Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayTypeMatchesArraysList](#arraytypematchesarrayslist) | of([List<? extends @Nullable Object>](#arraytypematchesarrayslistbuilder) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
