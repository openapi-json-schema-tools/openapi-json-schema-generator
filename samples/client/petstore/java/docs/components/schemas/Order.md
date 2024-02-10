# Order
org.openapijsonschematools.client.components.schemas.Order.java
public class Order

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Order.Order1Boxed](#order1boxed)<br> abstract sealed validated payload class |
| static class | [Order.Order1BoxedMap](#order1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Order.Order1](#order1)<br> schema class |
| static class | [Order.OrderMapBuilder](#ordermapbuilder)<br> builder for Map payloads |
| static class | [Order.OrderMap](#ordermap)<br> output class for Map payloads |
| static class | [Order.CompleteBoxed](#completeboxed)<br> abstract sealed validated payload class |
| static class | [Order.CompleteBoxedBoolean](#completeboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Order.Complete](#complete)<br> schema class |
| static class | [Order.StatusBoxed](#statusboxed)<br> abstract sealed validated payload class |
| static class | [Order.StatusBoxedString](#statusboxedstring)<br> boxed class to store validated String payloads |
| static class | [Order.Status](#status)<br> schema class |
| enum | [Order.StringStatusEnums](#stringstatusenums)<br>String enum |
| static class | [Order.ShipDateBoxed](#shipdateboxed)<br> abstract sealed validated payload class |
| static class | [Order.ShipDateBoxedString](#shipdateboxedstring)<br> boxed class to store validated String payloads |
| static class | [Order.ShipDate](#shipdate)<br> schema class |
| static class | [Order.QuantityBoxed](#quantityboxed)<br> abstract sealed validated payload class |
| static class | [Order.QuantityBoxedNumber](#quantityboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Order.Quantity](#quantity)<br> schema class |
| static class | [Order.PetIdBoxed](#petidboxed)<br> abstract sealed validated payload class |
| static class | [Order.PetIdBoxedNumber](#petidboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Order.PetId](#petid)<br> schema class |
| static class | [Order.IdBoxed](#idboxed)<br> abstract sealed validated payload class |
| static class | [Order.IdBoxedNumber](#idboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Order.Id](#id)<br> schema class |

## Order1Boxed
public static abstract sealed class Order1Boxed<br>
permits<br>
[Order1BoxedMap](#order1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Order1BoxedMap
public static final class Order1BoxedMap<br>
extends [Order1Boxed](#order1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Order1BoxedMap([OrderMap](#ordermap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [OrderMap](#ordermap) | data<br>validated payload |

## Order1
public static class Order1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
Order.OrderMap validatedPayload =
    Order.Order1.validate(
    new Order.OrderMapBuilder()
        .id(1L)

        .petId(1L)

        .quantity(1)

        .shipDate("1970-01-01T00:00:00.00Z")

        .status("placed")

        .complete(true)

    .build(),
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
| [OrderMap](#ordermap) | validate([Map&lt;?, ?&gt;](#ordermapbuilder) arg, SchemaConfiguration configuration) |
| [Order1BoxedMap](#order1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#ordermapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## OrderMapBuilder
public class OrderMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| OrderMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [OrderMapBuilder](#ordermapbuilder) | id(int value) |
| [OrderMapBuilder](#ordermapbuilder) | id(float value) |
| [OrderMapBuilder](#ordermapbuilder) | id(long value) |
| [OrderMapBuilder](#ordermapbuilder) | id(double value) |
| [OrderMapBuilder](#ordermapbuilder) | petId(int value) |
| [OrderMapBuilder](#ordermapbuilder) | petId(float value) |
| [OrderMapBuilder](#ordermapbuilder) | petId(long value) |
| [OrderMapBuilder](#ordermapbuilder) | petId(double value) |
| [OrderMapBuilder](#ordermapbuilder) | quantity(int value) |
| [OrderMapBuilder](#ordermapbuilder) | quantity(float value) |
| [OrderMapBuilder](#ordermapbuilder) | shipDate(String value) |
| [OrderMapBuilder](#ordermapbuilder) | status(String value) |
| [OrderMapBuilder](#ordermapbuilder) | status([StringStatusEnums](#stringstatusenums) value) |
| [OrderMapBuilder](#ordermapbuilder) | complete(boolean value) |
| [OrderMapBuilder](#ordermapbuilder) | additionalProperty(String key, Void value) |
| [OrderMapBuilder](#ordermapbuilder) | additionalProperty(String key, boolean value) |
| [OrderMapBuilder](#ordermapbuilder) | additionalProperty(String key, String value) |
| [OrderMapBuilder](#ordermapbuilder) | additionalProperty(String key, int value) |
| [OrderMapBuilder](#ordermapbuilder) | additionalProperty(String key, float value) |
| [OrderMapBuilder](#ordermapbuilder) | additionalProperty(String key, long value) |
| [OrderMapBuilder](#ordermapbuilder) | additionalProperty(String key, double value) |
| [OrderMapBuilder](#ordermapbuilder) | additionalProperty(String key, List<?> value) |
| [OrderMapBuilder](#ordermapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## OrderMap
public static class OrderMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [OrderMap](#ordermap) | of([Map<String, ? extends @Nullable Object>](#ordermapbuilder) arg, SchemaConfiguration configuration) |
| Number | id()<br>[optional] value must be a 64 bit integer |
| Number | petId()<br>[optional] value must be a 64 bit integer |
| Number | quantity()<br>[optional] value must be a 32 bit integer |
| String | shipDate()<br>[optional] value must conform to RFC-3339 date-time |
| String | status()<br>[optional] must be one of ["placed", "approved", "delivered"] |
| boolean | complete()<br>[optional] if omitted the server will use the default value of false |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## CompleteBoxed
public static abstract sealed class CompleteBoxed<br>
permits<br>
[CompleteBoxedBoolean](#completeboxedboolean)

abstract sealed class that stores validated payloads using boxed classes

## CompleteBoxedBoolean
public static final class CompleteBoxedBoolean<br>
extends [CompleteBoxed](#completeboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CompleteBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Complete
public static class Complete<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## StatusBoxed
public static abstract sealed class StatusBoxed<br>
permits<br>
[StatusBoxedString](#statusboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## StatusBoxedString
public static final class StatusBoxedString<br>
extends [StatusBoxed](#statusboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StatusBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
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
| [StatusBoxedString](#statusboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
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

## ShipDateBoxed
public static abstract sealed class ShipDateBoxed<br>
permits<br>
[ShipDateBoxedString](#shipdateboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## ShipDateBoxedString
public static final class ShipDateBoxedString<br>
extends [ShipDateBoxed](#shipdateboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShipDateBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ShipDate
public static class ShipDate<br>
extends DateTimeJsonSchema.DateTimeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateTimeJsonSchema.DateTimeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## QuantityBoxed
public static abstract sealed class QuantityBoxed<br>
permits<br>
[QuantityBoxedNumber](#quantityboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## QuantityBoxedNumber
public static final class QuantityBoxedNumber<br>
extends [QuantityBoxed](#quantityboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuantityBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Quantity
public static class Quantity<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## PetIdBoxed
public static abstract sealed class PetIdBoxed<br>
permits<br>
[PetIdBoxedNumber](#petidboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## PetIdBoxedNumber
public static final class PetIdBoxedNumber<br>
extends [PetIdBoxed](#petidboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetIdBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## PetId
public static class PetId<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## IdBoxed
public static abstract sealed class IdBoxed<br>
permits<br>
[IdBoxedNumber](#idboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## IdBoxedNumber
public static final class IdBoxedNumber<br>
extends [IdBoxed](#idboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Id
public static class Id<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
