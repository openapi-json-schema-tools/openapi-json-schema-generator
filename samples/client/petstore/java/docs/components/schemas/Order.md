# Order
org.openapijsonschematools.components.schemas.Order.java
public class Order

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Order.Order1](#order1)<br> schema class |
| static class | [Order.OrderMap](#ordermap)<br> output class for Map payloads |
| static class | [Order.Complete](#complete)<br> schema class |
| static class | [Order.Status](#status)<br> schema class |
| static class | [Order.ShipDate](#shipdate)<br> schema class |
| static class | [Order.Quantity](#quantity)<br> schema class |
| static class | [Order.PetId](#petid)<br> schema class |
| static class | [Order.Id](#id)<br> schema class |

## Order1
public static class Order1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>
        new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
<br/>
        new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
        new PropertyEntry("id", Id.class),
        new PropertyEntry("petId", PetId.class),
        new PropertyEntry("quantity", Quantity.class),
        new PropertyEntry("shipDate", ShipDate.class),
        new PropertyEntry("status", Status.class),
        new PropertyEntry("complete", Complete.class)
    )))
<br/>
));</code>

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [OrderMap](#ordermap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## OrderMap
public static class OrderMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [OrderMap](#ordermap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| long | id()<br>[optional] value must be a 64 bit integer |
| long | petId()<br>[optional] value must be a 64 bit integer |
| int | quantity()<br>[optional] value must be a 32 bit integer |
| String | shipDate()<br>[optional] value must conform to RFC-3339 date-time |
| String | status()<br>[optional] must be one of ["placed", "approved", "delivered"] |
| boolean | complete()<br>[optional] if omitted the server will use the default value of false |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **id** | long |  | [optional] value must be a 64 bit integer |
| **petId** | long |  | [optional] value must be a 64 bit integer |
| **quantity** | int |  | [optional] value must be a 32 bit integer |
| **shipDate** | String |  | [optional] value must conform to RFC-3339 date-time |
| **status** | String | Order Status | [optional] must be one of ["placed", "approved", "delivered"] |
| **complete** | boolean |  | [optional] if omitted the server will use the default value of false |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Complete
public static class Complete<br>
extends BooleanJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |

## Status
public static class Status<br>
extends JsonSchema

A schema class that validates payloads

## Description
Order Status
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>
        new KeywordEntry("type", new TypeValidator(Set.of(
        String.class
    )))
<br/>
));</code>

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## ShipDate
public static class ShipDate<br>
extends DateTimeJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Quantity
public static class Quantity<br>
extends Int32JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static int | validate(int arg, SchemaConfiguration configuration) |

## PetId
public static class PetId<br>
extends Int64JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

## Id
public static class Id<br>
extends Int64JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
