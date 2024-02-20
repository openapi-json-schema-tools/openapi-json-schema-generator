# Schema5
public class Schema5<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema5.Schema51Boxed](#schema51boxed)<br> abstract sealed validated payload class |
| record | [Schema5.Schema51BoxedNumber](#schema51boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema5.Schema51](#schema51)<br> schema class |

## Schema51Boxed
public sealed interface Schema51Boxed<br>
permits<br>
[Schema51BoxedNumber](#schema51boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema51BoxedNumber
public record Schema51BoxedNumber<br>
implements [Schema51Boxed](#schema51boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema51BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema51
public static class Schema51<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
