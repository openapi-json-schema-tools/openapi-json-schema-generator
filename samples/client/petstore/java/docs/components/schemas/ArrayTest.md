# ArrayTest
org.openapijsonschematools.client.components.schemas.ArrayTest.java
public class ArrayTest

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayTest.ArrayTest1Boxed](#arraytest1boxed)<br> sealed validated payload class |
| static class | [ArrayTest.ArrayTest1](#arraytest1)<br> schema class |
| static class | [ArrayTest.ArrayTestMapBuilder](#arraytestmapbuilder)<br> builder for Map payloads |
| static class | [ArrayTest.ArrayTestMap](#arraytestmap)<br> output class for Map payloads |
| static class | [ArrayTest.ArrayArrayOfModelBoxed](#arrayarrayofmodelboxed)<br> sealed validated payload class |
| static class | [ArrayTest.ArrayArrayOfModel](#arrayarrayofmodel)<br> schema class |
| static class | [ArrayTest.ArrayArrayOfModelListBuilder](#arrayarrayofmodellistbuilder)<br> builder for List payloads |
| static class | [ArrayTest.ArrayArrayOfModelList](#arrayarrayofmodellist)<br> output class for List payloads |
| static class | [ArrayTest.Items3Boxed](#items3boxed)<br> sealed validated payload class |
| static class | [ArrayTest.Items3](#items3)<br> schema class |
| static class | [ArrayTest.ItemsListBuilder1](#itemslistbuilder1)<br> builder for List payloads |
| static class | [ArrayTest.ItemsList1](#itemslist1)<br> output class for List payloads |
| static class | [ArrayTest.ArrayArrayOfIntegerBoxed](#arrayarrayofintegerboxed)<br> sealed validated payload class |
| static class | [ArrayTest.ArrayArrayOfInteger](#arrayarrayofinteger)<br> schema class |
| static class | [ArrayTest.ArrayArrayOfIntegerListBuilder](#arrayarrayofintegerlistbuilder)<br> builder for List payloads |
| static class | [ArrayTest.ArrayArrayOfIntegerList](#arrayarrayofintegerlist)<br> output class for List payloads |
| static class | [ArrayTest.Items1Boxed](#items1boxed)<br> sealed validated payload class |
| static class | [ArrayTest.Items1](#items1)<br> schema class |
| static class | [ArrayTest.ItemsListBuilder](#itemslistbuilder)<br> builder for List payloads |
| static class | [ArrayTest.ItemsList](#itemslist)<br> output class for List payloads |
| static class | [ArrayTest.Items2Boxed](#items2boxed)<br> sealed validated payload class |
| static class | [ArrayTest.Items2](#items2)<br> schema class |
| static class | [ArrayTest.ArrayOfStringBoxed](#arrayofstringboxed)<br> sealed validated payload class |
| static class | [ArrayTest.ArrayOfString](#arrayofstring)<br> schema class |
| static class | [ArrayTest.ArrayOfStringListBuilder](#arrayofstringlistbuilder)<br> builder for List payloads |
| static class | [ArrayTest.ArrayOfStringList](#arrayofstringlist)<br> output class for List payloads |
| static class | [ArrayTest.ItemsBoxed](#itemsboxed)<br> sealed validated payload class |
| static class | [ArrayTest.Items](#items)<br> schema class |

## ArrayTest1Boxed
public static abstract sealed class ArrayTest1Boxed<br>
permits<br>
[ArrayTest1BoxedMap](#arraytest1boxedmap)

A sealed class that stores validated payloads using boxed classes

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
public static abstract sealed class ArrayArrayOfModelBoxed<br>
permits<br>
[ArrayArrayOfModelBoxedList](#arrayarrayofmodelboxedlist)

A sealed class that stores validated payloads using boxed classes

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
public static abstract sealed class Items3Boxed<br>
permits<br>
[Items3BoxedList](#items3boxedlist)

A sealed class that stores validated payloads using boxed classes

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
public static abstract sealed class ArrayArrayOfIntegerBoxed<br>
permits<br>
[ArrayArrayOfIntegerBoxedList](#arrayarrayofintegerboxedlist)

A sealed class that stores validated payloads using boxed classes

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
public static abstract sealed class Items1Boxed<br>
permits<br>
[Items1BoxedList](#items1boxedlist)

A sealed class that stores validated payloads using boxed classes

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
public static abstract sealed class Items2Boxed<br>
permits<br>
[Items2BoxedNumber](#items2boxednumber)

A sealed class that stores validated payloads using boxed classes

## Items2
public static class Items2<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ArrayOfStringBoxed
public static abstract sealed class ArrayOfStringBoxed<br>
permits<br>
[ArrayOfStringBoxedList](#arrayofstringboxedlist)

A sealed class that stores validated payloads using boxed classes

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
public static abstract sealed class ItemsBoxed<br>
permits<br>
[ItemsBoxedString](#itemsboxedstring)

A sealed class that stores validated payloads using boxed classes

## Items
public static class Items<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
