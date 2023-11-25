# Address
org.openapijsonschematools.components.schemas.Address.java
public class Address

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Address.AdditionalProperties<br> schema class |
| static class | Address.AddressMap<br> output class for Map payloads |
| static class | Address.Address1<br> schema class |

## Address1
public class Address1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AddressMap | validate(Map<String, Long> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | long | any string name can be used but the value must be the correct type | [optional]

## AddressMap
public class AddressMap
extends FrozenMap<String, Long>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AddressMap | of(Map<String, Long> arg, SchemaConfiguration configuration) |
| long | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
