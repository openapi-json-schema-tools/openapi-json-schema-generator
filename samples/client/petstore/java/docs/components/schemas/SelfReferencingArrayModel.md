# SelfReferencingArrayModel
org.openapijsonschematools.components.schemas.SelfReferencingArrayModel.java
public class SelfReferencingArrayModel

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SelfReferencingArrayModel.SelfReferencingArrayModel1](#selfreferencingarraymodel1)<br> schema class |
| static class | [SelfReferencingArrayModel.SelfReferencingArrayModelList](#selfreferencingarraymodellist)<br> output class for List payloads |

## SelfReferencingArrayModel1
public static class SelfReferencingArrayModel1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([SelfReferencingArrayModel1.class](#selfreferencingarraymodel1)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SelfReferencingArrayModelList](#selfreferencingarraymodellist) | validate(List<List> arg, SchemaConfiguration configuration) |

## SelfReferencingArrayModelList
public class SelfReferencingArrayModelList<br>
extends FrozenList<SelfReferencingArrayModelList>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SelfReferencingArrayModelList](#selfreferencingarraymodellist) | of(List<List> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<List>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
