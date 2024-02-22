# XRateLimitSchema
public class XRateLimitSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [XRateLimitSchema.XRateLimitSchema1Boxed](#xratelimitschema1boxed)<br> sealed interface for validated payloads |
| record | [XRateLimitSchema.XRateLimitSchema1BoxedNumber](#xratelimitschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [XRateLimitSchema.XRateLimitSchema1](#xratelimitschema1)<br> schema class |

## XRateLimitSchema1Boxed
public sealed interface XRateLimitSchema1Boxed<br>
permits<br>
[XRateLimitSchema1BoxedNumber](#xratelimitschema1boxednumber)

sealed interface that stores validated payloads using boxed classes

## XRateLimitSchema1BoxedNumber
public record XRateLimitSchema1BoxedNumber<br>
implements [XRateLimitSchema1Boxed](#xratelimitschema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| XRateLimitSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## XRateLimitSchema1
public static class XRateLimitSchema1<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
