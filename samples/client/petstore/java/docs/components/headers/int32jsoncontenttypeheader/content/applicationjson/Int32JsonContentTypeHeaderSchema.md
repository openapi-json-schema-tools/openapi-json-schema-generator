# Int32JsonContentTypeHeaderSchema
public class Int32JsonContentTypeHeaderSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1Boxed](#int32jsoncontenttypeheaderschema1boxed)<br> sealed interface for validated payloads |
| record | [Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1BoxedNumber](#int32jsoncontenttypeheaderschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1](#int32jsoncontenttypeheaderschema1)<br> schema class |

## Int32JsonContentTypeHeaderSchema1Boxed
public sealed interface Int32JsonContentTypeHeaderSchema1Boxed<br>
permits<br>
[Int32JsonContentTypeHeaderSchema1BoxedNumber](#int32jsoncontenttypeheaderschema1boxednumber)

sealed interface that stores validated payloads using boxed classes

## Int32JsonContentTypeHeaderSchema1BoxedNumber
public record Int32JsonContentTypeHeaderSchema1BoxedNumber<br>
implements [Int32JsonContentTypeHeaderSchema1Boxed](#int32jsoncontenttypeheaderschema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32JsonContentTypeHeaderSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Int32JsonContentTypeHeaderSchema1
public static class Int32JsonContentTypeHeaderSchema1<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
