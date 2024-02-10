# XExpiresAfterSchema
public class XExpiresAfterSchema

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [XExpiresAfterSchema.XExpiresAfterSchema1Boxed](#xexpiresafterschema1boxed)<br> sealed validated payload class |
| static class | [XExpiresAfterSchema.XExpiresAfterSchema1BoxedString](#xexpiresafterschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [XExpiresAfterSchema.XExpiresAfterSchema1](#xexpiresafterschema1)<br> schema class |

## XExpiresAfterSchema1Boxed
public static abstract sealed class XExpiresAfterSchema1Boxed<br>
permits<br>
[XExpiresAfterSchema1BoxedString](#xexpiresafterschema1boxedstring)

A sealed class that stores validated payloads using boxed classes

## XExpiresAfterSchema1BoxedString
public static final class XExpiresAfterSchema1BoxedString<br>
extends XExpiresAfterSchema1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| XExpiresAfterSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## XExpiresAfterSchema1
public static class XExpiresAfterSchema1<br>
extends DateTimeJsonSchema.DateTimeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateTimeJsonSchema.DateTimeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
