# NestedItems
org.openapijsonschematools.client.components.schemas.NestedItems.java
public class NestedItems

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NestedItems.NestedItems1](#nesteditems1)<br> schema class |
| static class | [NestedItems.NestedItemsList](#nesteditemslist)<br> output class for List payloads |
| static class | [NestedItems.Items](#items)<br> schema class |
| static class | [NestedItems.ItemsList2](#itemslist2)<br> output class for List payloads |
| static class | [NestedItems.Items1](#items1)<br> schema class |
| static class | [NestedItems.ItemsList1](#itemslist1)<br> output class for List payloads |
| static class | [NestedItems.Items2](#items2)<br> schema class |
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
NestedItems.NestedItemsList validatedPayload = NestedItems.NestedItems1.validate(
    Arrays.asList(
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

## NestedItemsList
public class NestedItemsList<br>
extends `FrozenList<ItemsList2>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NestedItemsList](#nesteditemslist) | of(List<List<List<List<Number>>>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<List<List<List<Number>>>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List<List<List<Number>>> |  |

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
NestedItems.ItemsList2 validatedPayload = NestedItems.Items.validate(
    Arrays.asList(
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

## ItemsList2
public class ItemsList2<br>
extends `FrozenList<ItemsList1>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList2](#itemslist2) | of(List<List<List<Number>>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<List<List<Number>>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List<List<Number>> |  |

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
NestedItems.ItemsList1 validatedPayload = NestedItems.Items1.validate(
    Arrays.asList(
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

## ItemsList1
public class ItemsList1<br>
extends `FrozenList<ItemsList>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList1](#itemslist1) | of(List<List<Number>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<List<Number>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List<Number> |  |

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
NestedItems.ItemsList validatedPayload = NestedItems.Items2.validate(
    Arrays.asList(
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

## ItemsList
public class ItemsList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | of(List<Number> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Number>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Number |  |

## Items3
public static class Items3<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
