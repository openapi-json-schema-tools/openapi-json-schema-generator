# ObjectWithDecimalProperties
org.openapijsonschematools.components.schemas.ObjectWithDecimalProperties.java
public class ObjectWithDecimalProperties

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithDecimalProperties.ObjectWithDecimalProperties1](#objectwithdecimalproperties1)<br> schema class |
| static class | [ObjectWithDecimalProperties.ObjectWithDecimalPropertiesMap](#objectwithdecimalpropertiesmap)<br> output class for Map payloads |
| static class | [ObjectWithDecimalProperties.Width](#width)<br> schema class |

## ObjectWithDecimalProperties1
public static class ObjectWithDecimalProperties1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
    new PropertyEntry("length", DecimalPayload.DecimalPayload1.class),
    new PropertyEntry("width", Width.class),
    new PropertyEntry("cost", Money.Money1.class)
)))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithDecimalPropertiesMap](#objectwithdecimalpropertiesmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithDecimalPropertiesMap
public static class ObjectWithDecimalPropertiesMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithDecimalPropertiesMap](#objectwithdecimalpropertiesmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | length()<br>[optional] |
| String | width()<br>[optional] value must be int or float numeric |
| [Money.MoneyMap](../../components/schemas/Money.md#moneymap) | cost()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **length** | String |  | [optional] |
| **width** | String |  | [optional] value must be int or float numeric |
| **cost** | Map<String, Object> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Width
public static class Width<br>
extends DecimalJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
