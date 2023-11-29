# AdditionalpropertiesAllowsASchemaWhichShouldValidate
org.openapijsonschematools.components.schemas.AdditionalpropertiesAllowsASchemaWhichShouldValidate.java
public class AdditionalpropertiesAllowsASchemaWhichShouldValidate

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1](#additionalpropertiesallowsaschemawhichshouldvalidate1)<br> schema class |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidateMap](#additionalpropertiesallowsaschemawhichshouldvalidatemap)<br> output class for Map payloads |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.Bar](#bar)<br> schema class |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.Foo](#foo)<br> schema class |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesAllowsASchemaWhichShouldValidate1
public static class AdditionalpropertiesAllowsASchemaWhichShouldValidate1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator([AdditionalProperties.class](#additionalproperties)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesAllowsASchemaWhichShouldValidateMap](#additionalpropertiesallowsaschemawhichshouldvalidatemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## AdditionalpropertiesAllowsASchemaWhichShouldValidateMap
public static class AdditionalpropertiesAllowsASchemaWhichShouldValidateMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesAllowsASchemaWhichShouldValidateMap](#additionalpropertiesallowsaschemawhichshouldvalidatemap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | foo()<br>[optional] |
| Object | bar()<br>[optional] |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **foo** | Object |  | [optional] |
| **bar** | Object |  | [optional] |
| **anyStringName** | boolean | any string name can be used but the value must be the correct type | [optional] |

## Bar
public static class Bar<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foo
public static class Foo<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## AdditionalProperties
public static class AdditionalProperties<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
