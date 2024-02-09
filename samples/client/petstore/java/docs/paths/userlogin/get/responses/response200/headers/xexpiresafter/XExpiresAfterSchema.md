# XExpiresAfterSchema
public class XExpiresAfterSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [XExpiresAfterSchema.XExpiresAfterSchema1Boxed](#xexpiresafterschema1boxed)<br> sealed validated payload class |
| static class | [XExpiresAfterSchema.XExpiresAfterSchema1](#xexpiresafterschema1)<br> schema class |

## XExpiresAfterSchema1Boxed
public static abstract sealed class XExpiresAfterSchema1Boxed<br>

## XExpiresAfterSchema1
public static class XExpiresAfterSchema1<br>
extends DateTimeJsonSchema.DateTimeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateTimeJsonSchema.DateTimeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
