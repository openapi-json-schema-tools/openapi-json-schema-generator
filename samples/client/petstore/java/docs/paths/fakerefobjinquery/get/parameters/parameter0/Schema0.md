# Schema0
public class Schema0<br>
extends [Foo1](../../../components/schemas/Foo.md#foo)

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema0.Schema01](#schema01)<br> schema class |

## Schema01
public static class Schema01<br>
extends [Foo.Foo1](../../../components/schemas/Foo.md#foo1)

A schema class that validates payloads
