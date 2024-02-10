# LocationSchema
public class LocationSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [LocationSchema.LocationSchema1Boxed](#locationschema1boxed)<br> sealed validated payload class |
| static class | [LocationSchema.LocationSchema1](#locationschema1)<br> schema class |

## LocationSchema1Boxed
public static abstract sealed class LocationSchema1Boxed<br>
permits<br>
[LocationSchema1BoxedString](#locationschema1boxedstring)

A sealed class that stores validated payloads using boxed classes

## LocationSchema1
public static class LocationSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
