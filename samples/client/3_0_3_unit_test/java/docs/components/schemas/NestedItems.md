# NestedItems
org.openapijsonschematools.client.components.schemas.NestedItems.java
public class NestedItems

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to store list input interfaces, extends List

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NestedItems.NestedItems1](#nesteditems1)<br> schema class |
| static class | [NestedItems.NestedItemsListInput](#nesteditemslistinput)<br> input class for List payloads |
| static class | [NestedItems.NestedItemsList](#nesteditemslist)<br> output class for List payloads |
| static class | [NestedItems.Items](#items)<br> schema class |
| static class | [NestedItems.ItemsListInput2](#itemslistinput2)<br> input class for List payloads |
| static class | [NestedItems.ItemsList2](#itemslist2)<br> output class for List payloads |
| static class | [NestedItems.Items1](#items1)<br> schema class |
| static class | [NestedItems.ItemsListInput1](#itemslistinput1)<br> input class for List payloads |
| static class | [NestedItems.ItemsList1](#itemslist1)<br> output class for List payloads |
| static class | [NestedItems.Items2](#items2)<br> schema class |
| static class | [NestedItems.ItemsListInput](#itemslistinput)<br> input class for List payloads |
| static class | [NestedItems.ItemsList](#itemslist)<br> output class for List payloads |
| static class | [NestedItems.Items3](#items3)<br> schema class |

## NestedItems1
public static class NestedItems1<br>
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
NestedItems.NestedItemsList validatedPayload =
    NestedItems.NestedItems1.validate(
    Arrays.asList(
        Arrays.asList(
            Arrays.asList(
                Arrays.asList(
                    1
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items.class](#items)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NestedItemsList](#nesteditemslist) | validate(List<List<List<List<Number>>>> arg, SchemaConfiguration configuration) |

## NestedItemsListInput
public interface NestedItemsListInput<br>
extends `List<List<List<List<Number>>>>`

A class that describes the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List<List<List<Number>>> |  |

## NestedItemsList
public class NestedItemsList<br>
extends `FrozenList<ItemsList2>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NestedItemsList](#nesteditemslist) | of(List<List<List<List<Number>>>> arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
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
NestedItems.ItemsList2 validatedPayload =
    NestedItems.Items.validate(
    Arrays.asList(
        Arrays.asList(
            Arrays.asList(
                1
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items1.class](#items1)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList2](#itemslist2) | validate(List<List<List<Number>>> arg, SchemaConfiguration configuration) |

## ItemsListInput2
public interface ItemsListInput2<br>
extends `List<List<List<Number>>>`

A class that describes the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List<List<Number>> |  |

## ItemsList2
public class ItemsList2<br>
extends `FrozenList<ItemsList1>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList2](#itemslist2) | of(List<List<List<Number>>> arg, SchemaConfiguration configuration) |

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
NestedItems.ItemsList1 validatedPayload =
    NestedItems.Items1.validate(
    Arrays.asList(
        Arrays.asList(
            1
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items2.class](#items2)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList1](#itemslist1) | validate(List<List<Number>> arg, SchemaConfiguration configuration) |

## ItemsListInput1
public interface ItemsListInput1<br>
extends `List<List<Number>>`

A class that describes the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List<Number> |  |

## ItemsList1
public class ItemsList1<br>
extends `FrozenList<ItemsList>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList1](#itemslist1) | of(List<List<Number>> arg, SchemaConfiguration configuration) |

## Items2
public static class Items2<br>
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
NestedItems.ItemsList validatedPayload =
    NestedItems.Items2.validate(
    Arrays.asList(
        1
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items3.class](#items3)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | validate(List<Number> arg, SchemaConfiguration configuration) |

## ItemsListInput
public interface ItemsListInput<br>
extends `List<Number>`

A class that describes the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Number |  |

## ItemsList
public class ItemsList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | of(List<Number> arg, SchemaConfiguration configuration) |

## Items3
public static class Items3<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
