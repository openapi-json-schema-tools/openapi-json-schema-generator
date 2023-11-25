# PublicKey
org.openapijsonschematools.components.schemas.PublicKey.java
public class PublicKey

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | PublicKey.Key<br> schema class |
| static class | PublicKey.PublicKeyMap<br> output class for Map payloads |
| static class | PublicKey.PublicKey1<br> schema class |

## PublicKey1
public class PublicKey1
extends JsonSchema

A schema class that validates payloads


## Description
schema that contains a property named key

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static PublicKeyMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**key** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## PublicKeyMap
public class PublicKeyMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static PublicKeyMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | key()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
