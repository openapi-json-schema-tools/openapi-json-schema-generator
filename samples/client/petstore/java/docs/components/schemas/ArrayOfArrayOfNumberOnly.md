# ArrayOfArrayOfNumberOnly
org.openapijsonschematools.client.components.schemas.ArrayOfArrayOfNumberOnly.java
public class ArrayOfArrayOfNumberOnly<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnly1Boxed](#arrayofarrayofnumberonly1boxed)<br> sealed interface for validated payloads |
| record | [ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnly1BoxedMap](#arrayofarrayofnumberonly1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnly1](#arrayofarrayofnumberonly1)<br> schema class |
| static class | [ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnlyMapBuilder](#arrayofarrayofnumberonlymapbuilder)<br> builder for Map payloads |
| static class | [ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnlyMap](#arrayofarrayofnumberonlymap)<br> output class for Map payloads |
| sealed interface | [ArrayOfArrayOfNumberOnly.ArrayArrayNumberBoxed](#arrayarraynumberboxed)<br> sealed interface for validated payloads |
| record | [ArrayOfArrayOfNumberOnly.ArrayArrayNumberBoxedList](#arrayarraynumberboxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayOfArrayOfNumberOnly.ArrayArrayNumber](#arrayarraynumber)<br> schema class |
| static class | [ArrayOfArrayOfNumberOnly.ArrayArrayNumberListBuilder](#arrayarraynumberlistbuilder)<br> builder for List payloads |
| static class | [ArrayOfArrayOfNumberOnly.ArrayArrayNumberList](#arrayarraynumberlist)<br> output class for List payloads |
| sealed interface | [ArrayOfArrayOfNumberOnly.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| record | [ArrayOfArrayOfNumberOnly.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayOfArrayOfNumberOnly.Items](#items)<br> schema class |
| static class | [ArrayOfArrayOfNumberOnly.ItemsListBuilder](#itemslistbuilder)<br> builder for List payloads |
| static class | [ArrayOfArrayOfNumberOnly.ItemsList](#itemslist)<br> output class for List payloads |
| sealed interface | [ArrayOfArrayOfNumberOnly.Items1Boxed](#items1boxed)<br> sealed interface for validated payloads |
| record | [ArrayOfArrayOfNumberOnly.Items1BoxedNumber](#items1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ArrayOfArrayOfNumberOnly.Items1](#items1)<br> schema class |

## ArrayOfArrayOfNumberOnly1Boxed
public sealed interface ArrayOfArrayOfNumberOnly1Boxed<br>
permits<br>
[ArrayOfArrayOfNumberOnly1BoxedMap](#arrayofarrayofnumberonly1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ArrayOfArrayOfNumberOnly1BoxedMap
public record ArrayOfArrayOfNumberOnly1BoxedMap<br>
implements [ArrayOfArrayOfNumberOnly1Boxed](#arrayofarrayofnumberonly1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayOfArrayOfNumberOnly1BoxedMap([ArrayOfArrayOfNumberOnlyMap](#arrayofarrayofnumberonlymap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayOfArrayOfNumberOnlyMap](#arrayofarrayofnumberonlymap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ArrayOfArrayOfNumberOnly1
public static class ArrayOfArrayOfNumberOnly1<br>
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
import org.openapijsonschematools.client.components.schemas.ArrayOfArrayOfNumberOnly;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnlyMap validatedPayload =
    ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnly1.validate(
    new ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnlyMapBuilder()
        .ArrayArrayNumber(
            Arrays.asList(
                Arrays.asList(
                    1
                )
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("ArrayArrayNumber", [ArrayArrayNumber.class](#arrayarraynumber)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayOfArrayOfNumberOnlyMap](#arrayofarrayofnumberonlymap) | validate([Map&lt;?, ?&gt;](#arrayofarrayofnumberonlymapbuilder) arg, SchemaConfiguration configuration) |
| [ArrayOfArrayOfNumberOnly1BoxedMap](#arrayofarrayofnumberonly1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#arrayofarrayofnumberonlymapbuilder) arg, SchemaConfiguration configuration) |
| [ArrayOfArrayOfNumberOnly1Boxed](#arrayofarrayofnumberonly1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ArrayOfArrayOfNumberOnlyMapBuilder
public class ArrayOfArrayOfNumberOnlyMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayOfArrayOfNumberOnlyMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ArrayOfArrayOfNumberOnlyMapBuilder](#arrayofarrayofnumberonlymapbuilder) | ArrayArrayNumber(List<List<Number>> value) |
| [ArrayOfArrayOfNumberOnlyMapBuilder](#arrayofarrayofnumberonlymapbuilder) | additionalProperty(String key, Void value) |
| [ArrayOfArrayOfNumberOnlyMapBuilder](#arrayofarrayofnumberonlymapbuilder) | additionalProperty(String key, boolean value) |
| [ArrayOfArrayOfNumberOnlyMapBuilder](#arrayofarrayofnumberonlymapbuilder) | additionalProperty(String key, String value) |
| [ArrayOfArrayOfNumberOnlyMapBuilder](#arrayofarrayofnumberonlymapbuilder) | additionalProperty(String key, int value) |
| [ArrayOfArrayOfNumberOnlyMapBuilder](#arrayofarrayofnumberonlymapbuilder) | additionalProperty(String key, float value) |
| [ArrayOfArrayOfNumberOnlyMapBuilder](#arrayofarrayofnumberonlymapbuilder) | additionalProperty(String key, long value) |
| [ArrayOfArrayOfNumberOnlyMapBuilder](#arrayofarrayofnumberonlymapbuilder) | additionalProperty(String key, double value) |
| [ArrayOfArrayOfNumberOnlyMapBuilder](#arrayofarrayofnumberonlymapbuilder) | additionalProperty(String key, List<?> value) |
| [ArrayOfArrayOfNumberOnlyMapBuilder](#arrayofarrayofnumberonlymapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ArrayOfArrayOfNumberOnlyMap
public static class ArrayOfArrayOfNumberOnlyMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfArrayOfNumberOnlyMap](#arrayofarrayofnumberonlymap) | of([Map<String, ? extends @Nullable Object>](#arrayofarrayofnumberonlymapbuilder) arg, SchemaConfiguration configuration) |
| [ArrayArrayNumberList](#arrayarraynumberlist) | ArrayArrayNumber()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ArrayArrayNumberBoxed
public sealed interface ArrayArrayNumberBoxed<br>
permits<br>
[ArrayArrayNumberBoxedList](#arrayarraynumberboxedlist)

sealed interface that stores validated payloads using boxed classes

## ArrayArrayNumberBoxedList
public record ArrayArrayNumberBoxedList<br>
implements [ArrayArrayNumberBoxed](#arrayarraynumberboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayArrayNumberBoxedList([ArrayArrayNumberList](#arrayarraynumberlist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayArrayNumberList](#arrayarraynumberlist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ArrayArrayNumber
public static class ArrayArrayNumber<br>
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
import org.openapijsonschematools.client.components.schemas.ArrayOfArrayOfNumberOnly;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
ArrayOfArrayOfNumberOnly.ArrayArrayNumberList validatedPayload =
    ArrayOfArrayOfNumberOnly.ArrayArrayNumber.validate(
    new ArrayOfArrayOfNumberOnly.ArrayArrayNumberListBuilder()
        .add(
            Arrays.asList(
                1
            )
        )
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
| [ArrayArrayNumberList](#arrayarraynumberlist) | validate([List<?>](#arrayarraynumberlistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayArrayNumberBoxedList](#arrayarraynumberboxedlist) | validateAndBox([List<?>](#arrayarraynumberlistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayArrayNumberBoxed](#arrayarraynumberboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ArrayArrayNumberListBuilder
public class ArrayArrayNumberListBuilder<br>
builder for `List<List<Number>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayArrayNumberListBuilder()<br>Creates an empty list |
| ArrayArrayNumberListBuilder(List<List<Number>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayArrayNumberListBuilder | add(List<Number> item) |
| List<List<Number>> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayArrayNumberList
public class ArrayArrayNumberList<br>
extends `FrozenList<ItemsList>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayArrayNumberList](#arrayarraynumberlist) | of([List<List<Number>>](#arrayarraynumberlistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
public sealed interface ItemsBoxed<br>
permits<br>
[ItemsBoxedList](#itemsboxedlist)

sealed interface that stores validated payloads using boxed classes

## ItemsBoxedList
public record ItemsBoxedList<br>
implements [ItemsBoxed](#itemsboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedList([ItemsList](#itemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList](#itemslist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Items
public static class Items<br>
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
import org.openapijsonschematools.client.components.schemas.ArrayOfArrayOfNumberOnly;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
ArrayOfArrayOfNumberOnly.ItemsList validatedPayload =
    ArrayOfArrayOfNumberOnly.Items.validate(
    new ArrayOfArrayOfNumberOnly.ItemsListBuilder()
        .add(1)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items1.class](#items1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList](#itemslist) | validate([List<?>](#itemslistbuilder) arg, SchemaConfiguration configuration) |
| [ItemsBoxedList](#itemsboxedlist) | validateAndBox([List<?>](#itemslistbuilder) arg, SchemaConfiguration configuration) |
| [ItemsBoxed](#itemsboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ItemsListBuilder
public class ItemsListBuilder<br>
builder for `List<Number>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsListBuilder()<br>Creates an empty list |
| ItemsListBuilder(List<Number> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsListBuilder | add(int item) |
| ItemsListBuilder | add(float item) |
| ItemsListBuilder | add(long item) |
| ItemsListBuilder | add(double item) |
| List<Number> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsList
public class ItemsList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | of([List<Number>](#itemslistbuilder) arg, SchemaConfiguration configuration) |

## Items1Boxed
public sealed interface Items1Boxed<br>
permits<br>
[Items1BoxedNumber](#items1boxednumber)

sealed interface that stores validated payloads using boxed classes

## Items1BoxedNumber
public record Items1BoxedNumber<br>
implements [Items1Boxed](#items1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Items1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Items1
public static class Items1<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
