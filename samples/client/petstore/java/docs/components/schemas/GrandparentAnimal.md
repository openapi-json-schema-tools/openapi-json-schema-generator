# GrandparentAnimal
org.openapijsonschematools.components.schemas.GrandparentAnimal.java
public class GrandparentAnimal

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [GrandparentAnimal.GrandparentAnimal1](#grandparentanimal1)<br> schema class |
| static class | [GrandparentAnimal.GrandparentAnimalMap](#grandparentanimalmap)<br> output class for Map payloads |
| static class | [GrandparentAnimal.PetType](#pettype)<br> schema class |

## GrandparentAnimal1
public static class GrandparentAnimal1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [GrandparentAnimalMap](#grandparentanimalmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## GrandparentAnimalMap
public static class GrandparentAnimalMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [GrandparentAnimalMap](#grandparentanimalmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | pet_type()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**pet_type** | String |  |
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## PetType
public static class PetType
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
