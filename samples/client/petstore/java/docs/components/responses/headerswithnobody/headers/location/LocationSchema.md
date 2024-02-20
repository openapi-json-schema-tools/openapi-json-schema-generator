# LocationSchema
public class LocationSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [LocationSchema.LocationSchema1Boxed](#locationschema1boxed)<br> abstract sealed validated payload class |
| record | [LocationSchema.LocationSchema1BoxedString](#locationschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [LocationSchema.LocationSchema1](#locationschema1)<br> schema class |

## LocationSchema1Boxed
public sealed interface LocationSchema1Boxed<br>
permits<br>
[LocationSchema1BoxedString](#locationschema1boxedstring)

sealed interface that stores validated payloads using boxed classes

## LocationSchema1BoxedString
public record LocationSchema1BoxedString<br>
implements [LocationSchema1Boxed](#locationschema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| LocationSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## LocationSchema1
public static class LocationSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
