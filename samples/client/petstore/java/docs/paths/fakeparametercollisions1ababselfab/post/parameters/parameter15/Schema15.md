# Schema15
public class Schema15

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema15.Schema151Boxed](#schema151boxed)<br> sealed validated payload class |
| static class | [Schema15.Schema151](#schema151)<br> schema class |

## Schema151Boxed
public static abstract sealed class Schema151Boxed<br>
permits<br>
[Schema151BoxedString](#schema151boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema151
public static class Schema151<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
