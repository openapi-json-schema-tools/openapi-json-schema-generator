# Address
org.openapijsonschematools.components.schemas.Address.java
public class Address

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Address.Address1](#address1)<br> schema class |
| static class | [Address.AddressMap](#addressmap)<br> output class for Map payloads |
| static class | [Address.AdditionalProperties](#additionalproperties)<br> schema class |

## Address1
public static class Address1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))<br>
)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AddressMap](#addressmap) | validate(Map<String, Long> arg, SchemaConfiguration configuration) |

## AddressMap
public static class AddressMap<br>
extends FrozenMap<String, Long>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AddressMap](#addressmap) | of(Map<String, Long> arg, SchemaConfiguration configuration) |
| long | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | long | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties
public static class AdditionalProperties<br>
extends IntJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
