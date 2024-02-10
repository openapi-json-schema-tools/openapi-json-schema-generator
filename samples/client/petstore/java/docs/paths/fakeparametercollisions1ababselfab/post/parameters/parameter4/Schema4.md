# Schema4
public class Schema4

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema4.Schema41Boxed](#schema41boxed)<br> sealed validated payload class |
| static class | [Schema4.Schema41](#schema41)<br> schema class |

## Schema41Boxed
public static abstract sealed class Schema41Boxed<br>
permits<br>
[Schema41BoxedString](#schema41boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema41
public static class Schema41<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
