# ObjectModelWithRefProps
org.openapijsonschematools.components.schemas.ObjectModelWithRefProps.java
public class ObjectModelWithRefProps

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectModelWithRefProps.ObjectModelWithRefProps1](#objectmodelwithrefprops1)<br> schema class |
| static class | [ObjectModelWithRefProps.ObjectModelWithRefPropsMap](#objectmodelwithrefpropsmap)<br> output class for Map payloads |

## ObjectModelWithRefProps1
public static class ObjectModelWithRefProps1<br>
extends JsonSchema

A schema class that validates payloads

## Description
a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>
        new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
<br/>
        new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
        new PropertyEntry("myNumber", NumberWithValidations.NumberWithValidations1.class),
        new PropertyEntry("myString", StringSchema.StringSchema1.class),
        new PropertyEntry("myBoolean", BooleanSchema.BooleanSchema1.class)
    )))
<br/>
));</code>

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectModelWithRefPropsMap](#objectmodelwithrefpropsmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectModelWithRefPropsMap
public static class ObjectModelWithRefPropsMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectModelWithRefPropsMap](#objectmodelwithrefpropsmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | myNumber()<br>[optional] |
| String | myString()<br>[optional] |
| boolean | myBoolean()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **myNumber** | Number |  | [optional] |
| **myString** | String |  | [optional] |
| **myBoolean** | boolean |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
