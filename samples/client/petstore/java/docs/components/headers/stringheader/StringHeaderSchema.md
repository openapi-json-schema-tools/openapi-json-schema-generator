# StringHeaderSchema
public class StringHeaderSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [StringHeaderSchema.StringHeaderSchema1Boxed](#stringheaderschema1boxed)<br> abstract sealed validated payload class |
| static class | [StringHeaderSchema.StringHeaderSchema1BoxedString](#stringheaderschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [StringHeaderSchema.StringHeaderSchema1](#stringheaderschema1)<br> schema class |

## StringHeaderSchema1Boxed
public sealed interface StringHeaderSchema1Boxed<br>
permits<br>
[StringHeaderSchema1BoxedString](#stringheaderschema1boxedstring)

sealed interface that stores validated payloads using boxed classes

## StringHeaderSchema1BoxedString
public static final class StringHeaderSchema1BoxedString<br>
implements [StringHeaderSchema1Boxed](#stringheaderschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringHeaderSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## StringHeaderSchema1
public static class StringHeaderSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
