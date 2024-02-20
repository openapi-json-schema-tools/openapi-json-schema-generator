# ArrayTest
org.openapijsonschematools.client.components.schemas.ArrayTest.java
public class ArrayTest<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ArrayTest.ArrayTest1Boxed](#arraytest1boxed)<br> abstract sealed validated payload class |
| record | [ArrayTest.ArrayTest1BoxedMap](#arraytest1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ArrayTest.ArrayTest1](#arraytest1)<br> schema class |
| static class | [ArrayTest.ArrayTestMapBuilder](#arraytestmapbuilder)<br> builder for Map payloads |
| static class | [ArrayTest.ArrayTestMap](#arraytestmap)<br> output class for Map payloads |
| sealed interface | [ArrayTest.ArrayArrayOfModelBoxed](#arrayarrayofmodelboxed)<br> abstract sealed validated payload class |
| record | [ArrayTest.ArrayArrayOfModelBoxedList](#arrayarrayofmodelboxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayTest.ArrayArrayOfModel](#arrayarrayofmodel)<br> schema class |
| static class | [ArrayTest.ArrayArrayOfModelListBuilder](#arrayarrayofmodellistbuilder)<br> builder for List payloads |
| static class | [ArrayTest.ArrayArrayOfModelList](#arrayarrayofmodellist)<br> output class for List payloads |
| sealed interface | [ArrayTest.Items3Boxed](#items3boxed)<br> abstract sealed validated payload class |
| record | [ArrayTest.Items3BoxedList](#items3boxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayTest.Items3](#items3)<br> schema class |
| static class | [ArrayTest.ItemsListBuilder1](#itemslistbuilder1)<br> builder for List payloads |
| static class | [ArrayTest.ItemsList1](#itemslist1)<br> output class for List payloads |
| sealed interface | [ArrayTest.ArrayArrayOfIntegerBoxed](#arrayarrayofintegerboxed)<br> abstract sealed validated payload class |
| record | [ArrayTest.ArrayArrayOfIntegerBoxedList](#arrayarrayofintegerboxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayTest.ArrayArrayOfInteger](#arrayarrayofinteger)<br> schema class |
| static class | [ArrayTest.ArrayArrayOfIntegerListBuilder](#arrayarrayofintegerlistbuilder)<br> builder for List payloads |
| static class | [ArrayTest.ArrayArrayOfIntegerList](#arrayarrayofintegerlist)<br> output class for List payloads |
| sealed interface | [ArrayTest.Items1Boxed](#items1boxed)<br> abstract sealed validated payload class |
| record | [ArrayTest.Items1BoxedList](#items1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayTest.Items1](#items1)<br> schema class |
| static class | [ArrayTest.ItemsListBuilder](#itemslistbuilder)<br> builder for List payloads |
| static class | [ArrayTest.ItemsList](#itemslist)<br> output class for List payloads |
| sealed interface | [ArrayTest.Items2Boxed](#items2boxed)<br> abstract sealed validated payload class |
| record | [ArrayTest.Items2BoxedNumber](#items2boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ArrayTest.Items2](#items2)<br> schema class |
| sealed interface | [ArrayTest.ArrayOfStringBoxed](#arrayofstringboxed)<br> abstract sealed validated payload class |
| record | [ArrayTest.ArrayOfStringBoxedList](#arrayofstringboxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayTest.ArrayOfString](#arrayofstring)<br> schema class |
| static class | [ArrayTest.ArrayOfStringListBuilder](#arrayofstringlistbuilder)<br> builder for List payloads |
| static class | [ArrayTest.ArrayOfStringList](#arrayofstringlist)<br> output class for List payloads |
| sealed interface | [ArrayTest.ItemsBoxed](#itemsboxed)<br> abstract sealed validated payload class |
| record | [ArrayTest.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [ArrayTest.Items](#items)<br> schema class |

## ArrayTest1Boxed
public sealed interface ArrayTest1Boxed<br>
permits<br>
[ArrayTest1BoxedMap](#arraytest1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ArrayTest1BoxedMap
public record ArrayTest1BoxedMap<br>
implements [ArrayTest1Boxed](#arraytest1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayTest1BoxedMap([ArrayTestMap](#arraytestmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayTestMap](#arraytestmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ArrayTest1
public static class ArrayTest1<br>
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

// Map validation
ArrayTest.ArrayTestMap validatedPayload =
    ArrayTest.ArrayTest1.validate(
    new ArrayTest.ArrayTestMapBuilder()
        .array_of_string(
            Arrays.asList(
                "a"
            )
        )
        .array_array_of_integer(
            Arrays.asList(
                Arrays.asList(
                    1L
                )
            )
        )
        .array_array_of_model(
            Arrays.asList(
                Arrays.asList(
                    MapUtils.makeMap(
                        new AbstractMap.SimpleEntry<String, String>(
                            "bar",
                            "a"
                        ),
                        new AbstractMap.SimpleEntry<String, String>(
                            "baz",
                            "a"
                        )
                    )
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_of_string", [ArrayOfString.class](#arrayofstring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_array_of_integer", [ArrayArrayOfInteger.class](#arrayarrayofinteger))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_array_of_model", [ArrayArrayOfModel.class](#arrayarrayofmodel)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayTestMap](#arraytestmap) | validate([Map&lt;?, ?&gt;](#arraytestmapbuilder) arg, SchemaConfiguration configuration) |
| [ArrayTest1BoxedMap](#arraytest1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#arraytestmapbuilder) arg, SchemaConfiguration configuration) |
| [ArrayTest1Boxed](#arraytest1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ArrayTestMapBuilder
public class ArrayTestMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayTestMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ArrayTestMapBuilder](#arraytestmapbuilder) | array_of_string(List<String> value) |
| [ArrayTestMapBuilder](#arraytestmapbuilder) | array_array_of_integer(List<List<Number>> value) |
| [ArrayTestMapBuilder](#arraytestmapbuilder) | array_array_of_model(List<List<Map<String, @Nullable Object>>> value) |
| [ArrayTestMapBuilder](#arraytestmapbuilder) | additionalProperty(String key, Void value) |
| [ArrayTestMapBuilder](#arraytestmapbuilder) | additionalProperty(String key, boolean value) |
| [ArrayTestMapBuilder](#arraytestmapbuilder) | additionalProperty(String key, String value) |
| [ArrayTestMapBuilder](#arraytestmapbuilder) | additionalProperty(String key, int value) |
| [ArrayTestMapBuilder](#arraytestmapbuilder) | additionalProperty(String key, float value) |
| [ArrayTestMapBuilder](#arraytestmapbuilder) | additionalProperty(String key, long value) |
| [ArrayTestMapBuilder](#arraytestmapbuilder) | additionalProperty(String key, double value) |
| [ArrayTestMapBuilder](#arraytestmapbuilder) | additionalProperty(String key, List<?> value) |
| [ArrayTestMapBuilder](#arraytestmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ArrayTestMap
public static class ArrayTestMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayTestMap](#arraytestmap) | of([Map<String, ? extends @Nullable Object>](#arraytestmapbuilder) arg, SchemaConfiguration configuration) |
| [ArrayOfStringList](#arrayofstringlist) | array_of_string()<br>[optional] |
| [ArrayArrayOfIntegerList](#arrayarrayofintegerlist) | array_array_of_integer()<br>[optional] |
| [ArrayArrayOfModelList](#arrayarrayofmodellist) | array_array_of_model()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ArrayArrayOfModelBoxed
public sealed interface ArrayArrayOfModelBoxed<br>
permits<br>
[ArrayArrayOfModelBoxedList](#arrayarrayofmodelboxedlist)

sealed interface that stores validated payloads using boxed classes

## ArrayArrayOfModelBoxedList
public record ArrayArrayOfModelBoxedList<br>
implements [ArrayArrayOfModelBoxed](#arrayarrayofmodelboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayArrayOfModelBoxedList([ArrayArrayOfModelList](#arrayarrayofmodellist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayArrayOfModelList](#arrayarrayofmodellist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ArrayArrayOfModel
public static class ArrayArrayOfModel<br>
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
ArrayTest.ArrayArrayOfModelList validatedPayload =
    ArrayTest.ArrayArrayOfModel.validate(
    new ArrayTest.ArrayArrayOfModelListBuilder()
        .add(
            Arrays.asList(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "bar",
                        "a"
                    ),
                    new AbstractMap.SimpleEntry<String, String>(
                        "baz",
                        "a"
                    )
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
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items3.class](#items3) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayArrayOfModelList](#arrayarrayofmodellist) | validate([List<?>](#arrayarrayofmodellistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayArrayOfModelBoxedList](#arrayarrayofmodelboxedlist) | validateAndBox([List<?>](#arrayarrayofmodellistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayArrayOfModelBoxed](#arrayarrayofmodelboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ArrayArrayOfModelListBuilder
public class ArrayArrayOfModelListBuilder<br>
builder for `List<List<Map<String, @Nullable Object>>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayArrayOfModelListBuilder()<br>Creates an empty list |
| ArrayArrayOfModelListBuilder(List<List<Map<String, @Nullable Object>>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayArrayOfModelListBuilder | add(List<Map<String, @Nullable Object>> item) |
| List<List<Map<String, @Nullable Object>>> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayArrayOfModelList
public class ArrayArrayOfModelList<br>
extends `FrozenList<ItemsList1>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayArrayOfModelList](#arrayarrayofmodellist) | of([List<List<Map<String, ? extends @Nullable Object>>>](#arrayarrayofmodellistbuilder) arg, SchemaConfiguration configuration) |

## Items3Boxed
public sealed interface Items3Boxed<br>
permits<br>
[Items3BoxedList](#items3boxedlist)

sealed interface that stores validated payloads using boxed classes

## Items3BoxedList
public record Items3BoxedList<br>
implements [Items3Boxed](#items3boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Items3BoxedList([ItemsList1](#itemslist1) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList1](#itemslist1) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Items3
public static class Items3<br>
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
ArrayTest.ItemsList1 validatedPayload =
    ArrayTest.Items3.validate(
    new ArrayTest.ItemsListBuilder1()
        .add(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "bar",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, String>(
                    "baz",
                    "a"
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
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [ReadOnlyFirst.ReadOnlyFirst1.class](../../components/schemas/ReadOnlyFirst.md#readonlyfirst1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList1](#itemslist1) | validate([List<?>](#itemslistbuilder1) arg, SchemaConfiguration configuration) |
| [Items3BoxedList](#items3boxedlist) | validateAndBox([List<?>](#itemslistbuilder1) arg, SchemaConfiguration configuration) |
| [Items3Boxed](#items3boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ItemsListBuilder1
public class ItemsListBuilder1<br>
builder for `List<Map<String, @Nullable Object>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsListBuilder1()<br>Creates an empty list |
| ItemsListBuilder1(List<Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsListBuilder1 | add(Map<String, @Nullable Object> item) |
| List<Map<String, @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsList1
public class ItemsList1<br>
extends `FrozenList<ReadOnlyFirst.ReadOnlyFirstMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList1](#itemslist1) | of([List<Map<String, ? extends @Nullable Object>>](#itemslistbuilder1) arg, SchemaConfiguration configuration) |

## ArrayArrayOfIntegerBoxed
public sealed interface ArrayArrayOfIntegerBoxed<br>
permits<br>
[ArrayArrayOfIntegerBoxedList](#arrayarrayofintegerboxedlist)

sealed interface that stores validated payloads using boxed classes

## ArrayArrayOfIntegerBoxedList
public record ArrayArrayOfIntegerBoxedList<br>
implements [ArrayArrayOfIntegerBoxed](#arrayarrayofintegerboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayArrayOfIntegerBoxedList([ArrayArrayOfIntegerList](#arrayarrayofintegerlist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayArrayOfIntegerList](#arrayarrayofintegerlist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ArrayArrayOfInteger
public static class ArrayArrayOfInteger<br>
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
ArrayTest.ArrayArrayOfIntegerList validatedPayload =
    ArrayTest.ArrayArrayOfInteger.validate(
    new ArrayTest.ArrayArrayOfIntegerListBuilder()
        .add(
            Arrays.asList(
                1L
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
| Class<? extends JsonSchema> | items = [Items1.class](#items1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayArrayOfIntegerList](#arrayarrayofintegerlist) | validate([List<?>](#arrayarrayofintegerlistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayArrayOfIntegerBoxedList](#arrayarrayofintegerboxedlist) | validateAndBox([List<?>](#arrayarrayofintegerlistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayArrayOfIntegerBoxed](#arrayarrayofintegerboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ArrayArrayOfIntegerListBuilder
public class ArrayArrayOfIntegerListBuilder<br>
builder for `List<List<Number>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayArrayOfIntegerListBuilder()<br>Creates an empty list |
| ArrayArrayOfIntegerListBuilder(List<List<Number>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayArrayOfIntegerListBuilder | add(List<Number> item) |
| List<List<Number>> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayArrayOfIntegerList
public class ArrayArrayOfIntegerList<br>
extends `FrozenList<ItemsList>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayArrayOfIntegerList](#arrayarrayofintegerlist) | of([List<List<Number>>](#arrayarrayofintegerlistbuilder) arg, SchemaConfiguration configuration) |

## Items1Boxed
public sealed interface Items1Boxed<br>
permits<br>
[Items1BoxedList](#items1boxedlist)

sealed interface that stores validated payloads using boxed classes

## Items1BoxedList
public record Items1BoxedList<br>
implements [Items1Boxed](#items1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Items1BoxedList([ItemsList](#itemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList](#itemslist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Items1
public static class Items1<br>
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
ArrayTest.ItemsList validatedPayload =
    ArrayTest.Items1.validate(
    new ArrayTest.ItemsListBuilder()
        .add(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items2.class](#items2) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList](#itemslist) | validate([List<?>](#itemslistbuilder) arg, SchemaConfiguration configuration) |
| [Items1BoxedList](#items1boxedlist) | validateAndBox([List<?>](#itemslistbuilder) arg, SchemaConfiguration configuration) |
| [Items1Boxed](#items1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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

## Items2Boxed
public sealed interface Items2Boxed<br>
permits<br>
[Items2BoxedNumber](#items2boxednumber)

sealed interface that stores validated payloads using boxed classes

## Items2BoxedNumber
public record Items2BoxedNumber<br>
implements [Items2Boxed](#items2boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Items2BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Items2
public static class Items2<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ArrayOfStringBoxed
public sealed interface ArrayOfStringBoxed<br>
permits<br>
[ArrayOfStringBoxedList](#arrayofstringboxedlist)

sealed interface that stores validated payloads using boxed classes

## ArrayOfStringBoxedList
public record ArrayOfStringBoxedList<br>
implements [ArrayOfStringBoxed](#arrayofstringboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayOfStringBoxedList([ArrayOfStringList](#arrayofstringlist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayOfStringList](#arrayofstringlist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ArrayOfString
public static class ArrayOfString<br>
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
ArrayTest.ArrayOfStringList validatedPayload =
    ArrayTest.ArrayOfString.validate(
    new ArrayTest.ArrayOfStringListBuilder()
        .add("a")

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
| [ArrayOfStringList](#arrayofstringlist) | validate([List<?>](#arrayofstringlistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayOfStringBoxedList](#arrayofstringboxedlist) | validateAndBox([List<?>](#arrayofstringlistbuilder) arg, SchemaConfiguration configuration) |
| [ArrayOfStringBoxed](#arrayofstringboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ArrayOfStringListBuilder
public class ArrayOfStringListBuilder<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayOfStringListBuilder()<br>Creates an empty list |
| ArrayOfStringListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayOfStringListBuilder | add(String item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayOfStringList
public class ArrayOfStringList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfStringList](#arrayofstringlist) | of([List<String>](#arrayofstringlistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
public sealed interface ItemsBoxed<br>
permits<br>
[ItemsBoxedString](#itemsboxedstring)

sealed interface that stores validated payloads using boxed classes

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

## Items
public static class Items<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
