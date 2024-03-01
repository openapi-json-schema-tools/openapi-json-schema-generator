# Order
org.openapijsonschematools.client.components.schemas.Order.java
public class Order<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Order.Order1Boxed](#order1boxed)<br> sealed interface for validated payloads |
| record | [Order.Order1BoxedMap](#order1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Order.Order1](#order1)<br> schema class |
| static class | [Order.OrderMapBuilder](#ordermapbuilder)<br> builder for Map payloads |
| static class | [Order.OrderMap](#ordermap)<br> output class for Map payloads |
| sealed interface | [Order.CompleteBoxed](#completeboxed)<br> sealed interface for validated payloads |
| record | [Order.CompleteBoxedBoolean](#completeboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Order.Complete](#complete)<br> schema class |
| sealed interface | [Order.StatusBoxed](#statusboxed)<br> sealed interface for validated payloads |
| record | [Order.StatusBoxedString](#statusboxedstring)<br> boxed class to store validated String payloads |
| static class | [Order.Status](#status)<br> schema class |
| enum | [Order.StringStatusEnums](#stringstatusenums)<br>String enum |
| sealed interface | [Order.ShipDateBoxed](#shipdateboxed)<br> sealed interface for validated payloads |
| record | [Order.ShipDateBoxedString](#shipdateboxedstring)<br> boxed class to store validated String payloads |
| static class | [Order.ShipDate](#shipdate)<br> schema class |
| sealed interface | [Order.QuantityBoxed](#quantityboxed)<br> sealed interface for validated payloads |
| record | [Order.QuantityBoxedNumber](#quantityboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Order.Quantity](#quantity)<br> schema class |
| sealed interface | [Order.PetIdBoxed](#petidboxed)<br> sealed interface for validated payloads |
| record | [Order.PetIdBoxedNumber](#petidboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Order.PetId](#petid)<br> schema class |
| sealed interface | [Order.IdBoxed](#idboxed)<br> sealed interface for validated payloads |
| record | [Order.IdBoxedNumber](#idboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Order.Id](#id)<br> schema class |

## Order1Boxed
public sealed interface Order1Boxed<br>
permits<br>
[Order1BoxedMap](#order1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Order1BoxedMap
public record Order1BoxedMap<br>
implements [Order1Boxed](#order1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Order1BoxedMap([OrderMap](#ordermap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [OrderMap](#ordermap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.Order;

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
| [Order1Boxed](#order1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface CompleteBoxed<br>
permits<br>
[CompleteBoxedBoolean](#completeboxedboolean)

sealed interface that stores validated payloads using boxed classes

## CompleteBoxedBoolean
public record CompleteBoxedBoolean<br>
implements [CompleteBoxed](#completeboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CompleteBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Complete
public static class Complete<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## StatusBoxed
public sealed interface StatusBoxed<br>
permits<br>
[StatusBoxedString](#statusboxedstring)

sealed interface that stores validated payloads using boxed classes

## StatusBoxedString
public record StatusBoxedString<br>
implements [StatusBoxed](#statusboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StatusBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.Order;

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
| [StatusBoxed](#statusboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface ShipDateBoxed<br>
permits<br>
[ShipDateBoxedString](#shipdateboxedstring)

sealed interface that stores validated payloads using boxed classes

## ShipDateBoxedString
public record ShipDateBoxedString<br>
implements [ShipDateBoxed](#shipdateboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ShipDateBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ShipDate
public static class ShipDate<br>
extends DateTimeJsonSchema.DateTimeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateTimeJsonSchema.DateTimeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## QuantityBoxed
public sealed interface QuantityBoxed<br>
permits<br>
[QuantityBoxedNumber](#quantityboxednumber)

sealed interface that stores validated payloads using boxed classes

## QuantityBoxedNumber
public record QuantityBoxedNumber<br>
implements [QuantityBoxed](#quantityboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QuantityBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Quantity
public static class Quantity<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## PetIdBoxed
public sealed interface PetIdBoxed<br>
permits<br>
[PetIdBoxedNumber](#petidboxednumber)

sealed interface that stores validated payloads using boxed classes

## PetIdBoxedNumber
public record PetIdBoxedNumber<br>
implements [PetIdBoxed](#petidboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetIdBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetId
public static class PetId<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## IdBoxed
public sealed interface IdBoxed<br>
permits<br>
[IdBoxedNumber](#idboxednumber)

sealed interface that stores validated payloads using boxed classes

## IdBoxedNumber
public record IdBoxedNumber<br>
implements [IdBoxed](#idboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Id
public static class Id<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
