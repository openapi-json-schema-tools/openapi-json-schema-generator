# ArrayTypeMatchesArrays
org.openapijsonschematools.client.components.schemas.ArrayTypeMatchesArrays.java
public class ArrayTypeMatchesArrays

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1](#arraytypematchesarrays1)<br> schema class |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArraysListInput](#arraytypematchesarrayslistinput)<br> builder for List payloads |
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items.class](#items)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayTypeMatchesArraysList](#arraytypematchesarrayslist) | validate([List<Object>](#arraytypematchesarrayslistinput) arg, SchemaConfiguration configuration) |

## ArrayTypeMatchesArraysListInput
public class ArrayTypeMatchesArraysListInput<br>
builder for `List<Object>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Object |  |

## ArrayTypeMatchesArraysList
public class ArrayTypeMatchesArraysList<br>
extends `FrozenList<Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayTypeMatchesArraysList](#arraytypematchesarrayslist) | of([List<Object>](#arraytypematchesarrayslistinput) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
