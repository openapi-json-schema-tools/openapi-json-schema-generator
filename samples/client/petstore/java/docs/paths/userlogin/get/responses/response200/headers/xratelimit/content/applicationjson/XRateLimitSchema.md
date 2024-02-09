# XRateLimitSchema
public class XRateLimitSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [XRateLimitSchema.XRateLimitSchema1Boxed](#xratelimitschema1boxed)<br> sealed validated payload class |
| static class | [XRateLimitSchema.XRateLimitSchema1](#xratelimitschema1)<br> schema class |

## XRateLimitSchema1Boxed
public static abstract sealed class XRateLimitSchema1Boxed<br>

## XRateLimitSchema1
public static class XRateLimitSchema1<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
