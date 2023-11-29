# RefInAdditionalproperties
org.openapijsonschematools.components.schemas.RefInAdditionalproperties.java
public class RefInAdditionalproperties

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefInAdditionalproperties.RefInAdditionalproperties1](#refinadditionalproperties1)<br> schema class |
| static class | [RefInAdditionalproperties.RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap)<br> output class for Map payloads |

## RefInAdditionalproperties1
public static class RefInAdditionalproperties1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator([PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1.class](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## RefInAdditionalpropertiesMap
public static class RefInAdditionalpropertiesMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
