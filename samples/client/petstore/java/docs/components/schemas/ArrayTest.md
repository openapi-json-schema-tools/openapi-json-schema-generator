# ArrayTest
org.openapijsonschematools.client.components.schemas.ArrayTest.java
public class ArrayTest

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayTest.ArrayTest1](#arraytest1)<br> schema class |
| static class | [ArrayTest.ArrayTestMapBuilder](#arraytestmapbuilder)<br> builder for Map payloads |
| static class | [ArrayTest.ArrayTestMap](#arraytestmap)<br> output class for Map payloads |
| static class | [ArrayTest.ArrayArrayOfModel](#arrayarrayofmodel)<br> schema class |
| static class | [ArrayTest.ArrayArrayOfModelListBuilder](#arrayarrayofmodellistbuilder)<br> builder for List payloads |
| static class | [ArrayTest.ArrayArrayOfModelList](#arrayarrayofmodellist)<br> output class for List payloads |
| static class | [ArrayTest.Items3](#items3)<br> schema class |
| static class | [ArrayTest.ItemsListBuilder1](#itemslistbuilder1)<br> builder for List payloads |
| static class | [ArrayTest.ItemsList1](#itemslist1)<br> output class for List payloads |
| static class | [ArrayTest.ArrayArrayOfInteger](#arrayarrayofinteger)<br> schema class |
| static class | [ArrayTest.ArrayArrayOfIntegerListBuilder](#arrayarrayofintegerlistbuilder)<br> builder for List payloads |
| static class | [ArrayTest.ArrayArrayOfIntegerList](#arrayarrayofintegerlist)<br> output class for List payloads |
| static class | [ArrayTest.Items1](#items1)<br> schema class |
| static class | [ArrayTest.ItemsListBuilder](#itemslistbuilder)<br> builder for List payloads |
| static class | [ArrayTest.ItemsList](#itemslist)<br> output class for List payloads |
| static class | [ArrayTest.Items2](#items2)<br> schema class |
| static class | [ArrayTest.ArrayOfString](#arrayofstring)<br> schema class |
| static class | [ArrayTest.ArrayOfStringListBuilder](#arrayofstringlistbuilder)<br> builder for List payloads |
| static class | [ArrayTest.ArrayOfStringList](#arrayofstringlist)<br> output class for List payloads |
| static class | [ArrayTest.Items](#items)<br> schema class |

## ArrayTest1
public static class ArrayTest1<br>
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

// Map validation
ArrayTest.ArrayTestMap validatedPayload =
    ArrayTest.ArrayTest1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, List<?>>(
            "array_of_string",
            Arrays.asList(
                "a"
            )
        ),
        new AbstractMap.SimpleEntry<String, List<?>>(
            "array_array_of_integer",
            Arrays.asList(
                Arrays.asList(
                    1L
                )
            )
        ),
        new AbstractMap.SimpleEntry<String, List<?>>(
            "array_array_of_model",
            Arrays.asList(
                Arrays.asList(
                    MapMaker.makeMap(
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
    ),
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
| [ArrayTestMap](#arraytestmap) | validate([Map<?, ?>](#arraytestmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayTestMapBuilder
public class ArrayTestMapBuilder<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **array_of_string** | List<String> |  | [optional] |
| **array_array_of_integer** | List<List<Number>> |  | [optional] |
| **array_array_of_model** | List<List<Map<String, ? extends @Nullable Object>>> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

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
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ArrayArrayOfModel
public static class ArrayArrayOfModel<br>
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
ArrayTest.ArrayArrayOfModelList validatedPayload =
    ArrayTest.ArrayArrayOfModel.validate(
    Arrays.asList(
        Arrays.asList(
            MapMaker.makeMap(
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
    ),
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
builder for `List<List<Map<String, ? extends @Nullable Object>>>`

A class that builds the List input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayArrayOfModelListBuilder()<br>Creates an empty list |
| ArrayArrayOfModelListBuilder(List<List<Map<String, @Nullable Object>>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| List<List<Map<String, ? extends @Nullable Object>>> | build()<br>Returns list input that should be used with Schema.validate |

## Input List Items
| List Item Type | Description | Notes |
| -------------- | ----------- | ----- |
| List<Map<String, ? extends @Nullable Object>> |  | |

## ArrayArrayOfModelList
public class ArrayArrayOfModelList<br>
extends `FrozenList<ItemsList1>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayArrayOfModelList](#arrayarrayofmodellist) | of([List<List<Map<String, ? extends @Nullable Object>>>](#arrayarrayofmodellistbuilder) arg, SchemaConfiguration configuration) |

## Items3
public static class Items3<br>
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
ArrayTest.ItemsList1 validatedPayload =
    ArrayTest.Items3.validate(
    Arrays.asList(
        MapMaker.makeMap(
            new AbstractMap.SimpleEntry<String, String>(
                "bar",
                "a"
            ),
            new AbstractMap.SimpleEntry<String, String>(
                "baz",
                "a"
            )
        )
    ),
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
builder for `List<Map<String, ? extends @Nullable Object>>`

A class that builds the List input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsListBuilder1()<br>Creates an empty list |
| ItemsListBuilder1(List<Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| List<Map<String, ? extends @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## Input List Items
| List Item Type | Description | Notes |
| -------------- | ----------- | ----- |
| Map<String, ? extends @Nullable Object> |  | |

## ItemsList1
public class ItemsList1<br>
extends `FrozenList<ReadOnlyFirst.ReadOnlyFirstMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList1](#itemslist1) | of([List<Map<String, ? extends @Nullable Object>>](#itemslistbuilder1) arg, SchemaConfiguration configuration) |

## ArrayArrayOfInteger
public static class ArrayArrayOfInteger<br>
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
ArrayTest.ArrayArrayOfIntegerList validatedPayload =
    ArrayTest.ArrayArrayOfInteger.validate(
    Arrays.asList(
        Arrays.asList(
            1L
        )
    ),
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

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayArrayOfIntegerListBuilder()<br>Creates an empty list |
| ArrayArrayOfIntegerListBuilder(List<List<Number>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| List<List<Number>> | build()<br>Returns list input that should be used with Schema.validate |

## Input List Items
| List Item Type | Description | Notes |
| -------------- | ----------- | ----- |
| List<Number> |  | |

## ArrayArrayOfIntegerList
public class ArrayArrayOfIntegerList<br>
extends `FrozenList<ItemsList>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayArrayOfIntegerList](#arrayarrayofintegerlist) | of([List<List<Number>>](#arrayarrayofintegerlistbuilder) arg, SchemaConfiguration configuration) |

## Items1
public static class Items1<br>
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
ArrayTest.ItemsList validatedPayload =
    ArrayTest.Items1.validate(
    Arrays.asList(
        1L
    ),
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

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsListBuilder()<br>Creates an empty list |
| ItemsListBuilder(List<Number> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| List<Number> | build()<br>Returns list input that should be used with Schema.validate |

## Input List Items
| List Item Type | Description | Notes |
| -------------- | ----------- | ----- |
| Number |  | value must be a 64 bit integer |

## ItemsList
public class ItemsList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | of([List<Number>](#itemslistbuilder) arg, SchemaConfiguration configuration) |

## Items2
public static class Items2<br>
extends Int64JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## ArrayOfString
public static class ArrayOfString<br>
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
ArrayTest.ArrayOfStringList validatedPayload =
    ArrayTest.ArrayOfString.validate(
    Arrays.asList(
        "a"
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
| [ArrayOfStringList](#arrayofstringlist) | validate([List<?>](#arrayofstringlistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayOfStringListBuilder
public class ArrayOfStringListBuilder<br>
builder for `List<String>`

A class that builds the List input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayOfStringListBuilder()<br>Creates an empty list |
| ArrayOfStringListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## Input List Items
| List Item Type | Description | Notes |
| -------------- | ----------- | ----- |
| String |  | |

## ArrayOfStringList
public class ArrayOfStringList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfStringList](#arrayofstringlist) | of([List<String>](#arrayofstringlistbuilder) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
