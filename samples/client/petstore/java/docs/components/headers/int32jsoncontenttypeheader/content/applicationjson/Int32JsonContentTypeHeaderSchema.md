# Int32JsonContentTypeHeaderSchema
public class Int32JsonContentTypeHeaderSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1Boxed](#int32jsoncontenttypeheaderschema1boxed)<br> abstract sealed validated payload class |
| static class | [Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1BoxedNumber](#int32jsoncontenttypeheaderschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1](#int32jsoncontenttypeheaderschema1)<br> schema class |

## Int32JsonContentTypeHeaderSchema1Boxed
public static abstract sealed class Int32JsonContentTypeHeaderSchema1Boxed<br>
permits<br>
[Int32JsonContentTypeHeaderSchema1BoxedNumber](#int32jsoncontenttypeheaderschema1boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Int32JsonContentTypeHeaderSchema1BoxedNumber
public static final class Int32JsonContentTypeHeaderSchema1BoxedNumber<br>
extends [Int32JsonContentTypeHeaderSchema1Boxed](#int32jsoncontenttypeheaderschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32JsonContentTypeHeaderSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Int32JsonContentTypeHeaderSchema1
public static class Int32JsonContentTypeHeaderSchema1<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
