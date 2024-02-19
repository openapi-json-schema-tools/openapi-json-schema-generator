# Schema0
public class Schema0<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema0.Schema01Boxed](#schema01boxed)<br> abstract sealed validated payload class |
| static class | [Schema0.Schema01BoxedNumber](#schema01boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema0.Schema01](#schema01)<br> schema class |

## Schema01Boxed
public sealed interface Schema01Boxed<br>
permits<br>
[Schema01BoxedNumber](#schema01boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema01BoxedNumber
public static final class Schema01BoxedNumber<br>
implements [Schema01Boxed](#schema01boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema01
public static class Schema01<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
