# Schema1
public class Schema1<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema1.Schema11Boxed](#schema11boxed)<br> abstract sealed validated payload class |
| static class | [Schema1.Schema11BoxedNumber](#schema11boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema1.Schema11](#schema11)<br> schema class |

## Schema11Boxed
public static abstract sealed class Schema11Boxed<br>
permits<br>
[Schema11BoxedNumber](#schema11boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Schema11BoxedNumber
public static final class Schema11BoxedNumber<br>
extends [Schema11Boxed](#schema11boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema11BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema11
public static class Schema11<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
