# Schema2
public class Schema2

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema2.Schema21Boxed](#schema21boxed)<br> sealed validated payload class |
| static class | [Schema2.Schema21](#schema21)<br> schema class |

## Schema21Boxed
public static abstract sealed class Schema21Boxed<br>
permits<br>
[Schema21BoxedNumber](#schema21boxednumber)

A sealed class that stores validated payloads using boxed classes

## Schema21
public static class Schema21<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
