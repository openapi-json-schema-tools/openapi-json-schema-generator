# Schema2
public class Schema2<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema2.Schema21Boxed](#schema21boxed)<br> abstract sealed validated payload class |
| static class | [Schema2.Schema21BoxedNumber](#schema21boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema2.Schema21](#schema21)<br> schema class |

## Schema21Boxed
public static abstract sealed class Schema21Boxed<br>
permits<br>
[Schema21BoxedNumber](#schema21boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Schema21BoxedNumber
public static final class Schema21BoxedNumber<br>
extends [Schema21Boxed](#schema21boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema21BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema21
public static class Schema21<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
