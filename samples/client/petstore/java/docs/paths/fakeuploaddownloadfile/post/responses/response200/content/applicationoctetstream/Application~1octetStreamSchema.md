# Application~1octetStreamSchema
public class Application~1octetStreamSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application~1octetStreamSchema.Application~1octetStreamSchema1Boxed](#application~1octetstreamschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application~1octetStreamSchema.Application~1octetStreamSchema1](#application~1octetstreamschema1)<br> schema class |

## Application~1octetStreamSchema1Boxed
public static abstract sealed class Application~1octetStreamSchema1Boxed<br>
permits<br>

abstract sealed class that stores validated payloads using boxed classes

## Application~1octetStreamSchema1
public static class Application~1octetStreamSchema1<br>
extends JsonSchema

A schema class that validates payloads

## Description
file to download
