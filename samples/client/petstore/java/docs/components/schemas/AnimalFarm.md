# AnimalFarm
org.openapijsonschematools.client.components.schemas.AnimalFarm.java
public class AnimalFarm

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AnimalFarm.AnimalFarm1](#animalfarm1)<br> schema class |
| static class | [AnimalFarm.AnimalFarmList](#animalfarmlist)<br> output class for List payloads |

## AnimalFarm1
public static class AnimalFarm1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Animal.Animal1.class](../../components/schemas/Animal.md#animal1))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AnimalFarmList](#animalfarmlist) | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## AnimalFarmList
public class AnimalFarmList<br>
extends `FrozenList<Animal.AnimalMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AnimalFarmList](#animalfarmlist) | of(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
