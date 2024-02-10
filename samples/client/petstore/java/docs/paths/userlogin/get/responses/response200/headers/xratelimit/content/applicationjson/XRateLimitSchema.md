# XRateLimitSchema
public class XRateLimitSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [XRateLimitSchema.XRateLimitSchema1Boxed](#xratelimitschema1boxed)<br> abstract sealed validated payload class |
| static class | [XRateLimitSchema.XRateLimitSchema1BoxedNumber](#xratelimitschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [XRateLimitSchema.XRateLimitSchema1](#xratelimitschema1)<br> schema class |

## XRateLimitSchema1Boxed
public static abstract sealed class XRateLimitSchema1Boxed<br>
permits<br>
[XRateLimitSchema1BoxedNumber](#xratelimitschema1boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## XRateLimitSchema1BoxedNumber
public static final class XRateLimitSchema1BoxedNumber<br>
extends [XRateLimitSchema1Boxed](#xratelimitschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| XRateLimitSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## XRateLimitSchema1
public static class XRateLimitSchema1<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
