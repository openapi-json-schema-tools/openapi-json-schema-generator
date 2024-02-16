# SomeHeaderSchema
public class SomeHeaderSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SomeHeaderSchema.SomeHeaderSchema1Boxed](#someheaderschema1boxed)<br> abstract sealed validated payload class |
| static class | [SomeHeaderSchema.SomeHeaderSchema1BoxedString](#someheaderschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [SomeHeaderSchema.SomeHeaderSchema1](#someheaderschema1)<br> schema class |

## SomeHeaderSchema1Boxed
public static abstract sealed class SomeHeaderSchema1Boxed<br>
permits<br>
[SomeHeaderSchema1BoxedString](#someheaderschema1boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## SomeHeaderSchema1BoxedString
public static final class SomeHeaderSchema1BoxedString<br>
extends [SomeHeaderSchema1Boxed](#someheaderschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeHeaderSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## SomeHeaderSchema1
public static class SomeHeaderSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
