# SelfReferencingArrayModel
org.openapijsonschematools.client.components.schemas.SelfReferencingArrayModel.java
public class SelfReferencingArrayModel

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to store list input interfaces, extends List

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SelfReferencingArrayModel.SelfReferencingArrayModel1](#selfreferencingarraymodel1)<br> schema class |
| static class | [SelfReferencingArrayModel.SelfReferencingArrayModelListInput](#selfreferencingarraymodellistinput)<br> input class for List payloads |
| static class | [SelfReferencingArrayModel.SelfReferencingArrayModelList](#selfreferencingarraymodellist)<br> output class for List payloads |

## SelfReferencingArrayModel1
public static class SelfReferencingArrayModel1<br>
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
SelfReferencingArrayModel.SelfReferencingArrayModelList validatedPayload =
    SelfReferencingArrayModel.SelfReferencingArrayModel1.validate(
    Arrays.asList(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([SelfReferencingArrayModel1.class](#selfreferencingarraymodel1)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SelfReferencingArrayModelList](#selfreferencingarraymodellist) | validate([SelfReferencingArrayModelListInput](#selfreferencingarraymodellistinput) arg, SchemaConfiguration configuration) |

## SelfReferencingArrayModelListInput
public interface SelfReferencingArrayModelListInput<br>
extends `List<List>`

A class that describes the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List |  |

## SelfReferencingArrayModelList
public class SelfReferencingArrayModelList<br>
extends `FrozenList<SelfReferencingArrayModelList>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SelfReferencingArrayModelList](#selfreferencingarraymodellist) | of([SelfReferencingArrayModelListInput](#selfreferencingarraymodellistinput) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
