# Schema
public class Schema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1](#schema1)<br> schema class |

## Schema1
public static class Schema1<br>
extends [ObjectModelWithRefProps.ObjectModelWithRefProps1](../../../../../../../../components/schemas/ObjectModelWithRefProps.md#objectmodelwithrefprops1)

A schema class that validates payloads
