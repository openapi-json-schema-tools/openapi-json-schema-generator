# Schema200Schema
public class Schema200Schema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema200Schema.Schema200Schema1Boxed](#schema200schema1boxed)<br> sealed interface for validated payloads |
| record | [Schema200Schema.Schema200Schema1BoxedNumber](#schema200schema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema200Schema.Schema200Schema1](#schema200schema1)<br> schema class |

## Schema200Schema1Boxed
public sealed interface Schema200Schema1Boxed<br>
permits<br>
[Schema200Schema1BoxedNumber](#schema200schema1boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema200Schema1BoxedNumber
public record Schema200Schema1BoxedNumber<br>
implements [Schema200Schema1Boxed](#schema200schema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema200Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema200Schema1
public static class Schema200Schema1<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
