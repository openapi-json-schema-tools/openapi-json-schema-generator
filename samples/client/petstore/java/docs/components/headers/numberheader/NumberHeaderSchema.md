# NumberHeaderSchema
public class NumberHeaderSchema

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NumberHeaderSchema.NumberHeaderSchema1Boxed](#numberheaderschema1boxed)<br> sealed validated payload class |
| static class | [NumberHeaderSchema.NumberHeaderSchema1BoxedString](#numberheaderschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [NumberHeaderSchema.NumberHeaderSchema1](#numberheaderschema1)<br> schema class |

## NumberHeaderSchema1Boxed
public static abstract sealed class NumberHeaderSchema1Boxed<br>
permits<br>
[NumberHeaderSchema1BoxedString](#numberheaderschema1boxedstring)

A sealed class that stores validated payloads using boxed classes

## NumberHeaderSchema1BoxedString
public static final class NumberHeaderSchema1BoxedString<br>
extends NumberHeaderSchema1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberHeaderSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## NumberHeaderSchema1
public static class NumberHeaderSchema1<br>
extends DecimalJsonSchema.DecimalJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DecimalJsonSchema.DecimalJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
