# Order
org.openapijsonschematools.client.components.schemas.Order.java
public class Order

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Order.Order1](#order1)<br> schema class |
| static class | [Order.OrderMapInput](#ordermapinput)<br> builder for Map payloads |
| static class | [Order.OrderMap](#ordermap)<br> output class for Map payloads |
| static class | [Order.Complete](#complete)<br> schema class |
| static class | [Order.Status](#status)<br> schema class |
| enum | [Order.StringStatusEnums](#stringstatusenums)<br>String enum |
| static class | [Order.ShipDate](#shipdate)<br> schema class |
| static class | [Order.Quantity](#quantity)<br> schema class |
| static class | [Order.PetId](#petid)<br> schema class |
| static class | [Order.Id](#id)<br> schema class |

## Order1
public static class Order1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
Order.OrderMap validatedPayload =
    Order.Order1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "id",
            1L
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "petId",
            1L
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "quantity",
            1
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "shipDate",
            "1970-01-01T00:00:00.00Z"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "status",
            "placed"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "complete",
            true
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("id", [Id.class](#id))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("petId", [PetId.class](#petid))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("quantity", [Quantity.class](#quantity))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("shipDate", [ShipDate.class](#shipdate))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("status", [Status.class](#status))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("complete", [Complete.class](#complete)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [OrderMap](#ordermap) | validate([Map<?, ?>](#ordermapinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## OrderMapInput
public class OrderMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **id** | long |  | [optional] value must be a 64 bit integer |
| **petId** | long |  | [optional] value must be a 64 bit integer |
| **quantity** | int |  | [optional] value must be a 32 bit integer |
| **shipDate** | String |  | [optional] value must conform to RFC-3339 date-time |
| **status** | String | Order Status | [optional] must be one of ["placed", "approved", "delivered"] |
| **complete** | boolean |  | [optional] if omitted the server will use the default value of false |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## OrderMap
public static class OrderMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [OrderMap](#ordermap) | of([Map<String, ? extends @Nullable Object>](#ordermapinput) arg, SchemaConfiguration configuration) |
| long | id()<br>[optional] value must be a 64 bit integer |
| long | petId()<br>[optional] value must be a 64 bit integer |
| int | quantity()<br>[optional] value must be a 32 bit integer |
| String | shipDate()<br>[optional] value must conform to RFC-3339 date-time |
| String | status()<br>[optional] must be one of ["placed", "approved", "delivered"] |
| boolean | complete()<br>[optional] if omitted the server will use the default value of false |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Complete
public static class Complete<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Status
public static class Status<br>
extends JsonSchema

A schema class that validates payloads

## Description
Order Status

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = Order.Status.validate(
    "placed",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"placed",<br>&nbsp;&nbsp;&nbsp;&nbsp;"approved",<br>&nbsp;&nbsp;&nbsp;&nbsp;"delivered"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringStatusEnums](#stringstatusenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringStatusEnums
public enum StringStatusEnums<br>
extends `Enum<StringStatusEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| PLACED | value = "placed" |
| APPROVED | value = "approved" |
| DELIVERED | value = "delivered" |

## ShipDate
public static class ShipDate<br>
extends DateTimeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateTimeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Quantity
public static class Quantity<br>
extends Int32JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## PetId
public static class PetId<br>
extends Int64JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Id
public static class Id<br>
extends Int64JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
