# Application1octetstreamSchema
public class Application1octetstreamSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application1octetstreamSchema.Application1octetstreamSchema1Boxed](#application1octetstreamschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application1octetstreamSchema.Application1octetstreamSchema1](#application1octetstreamschema1)<br> schema class |

## Application1octetstreamSchema1Boxed
public static abstract sealed class Application1octetstreamSchema1Boxed<br>
permits<br>

abstract sealed class that stores validated payloads using boxed classes

## Application1octetstreamSchema1
public static class Application1octetstreamSchema1<br>
extends JsonSchema

A schema class that validates payloads

## Description
file to download
