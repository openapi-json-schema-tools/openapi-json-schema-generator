# Schema2
public class Schema2<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema2.Schema21Boxed](#schema21boxed)<br> abstract sealed validated payload class |
| record | [Schema2.Schema21BoxedNumber](#schema21boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema2.Schema21](#schema21)<br> schema class |

## Schema21Boxed
public sealed interface Schema21Boxed<br>
permits<br>
[Schema21BoxedNumber](#schema21boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema21BoxedNumber
public record Schema21BoxedNumber<br>
implements [Schema21Boxed](#schema21boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema21BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema21
public static class Schema21<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
