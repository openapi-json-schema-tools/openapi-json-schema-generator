# ApplicationxpemfileSchema
public class ApplicationxpemfileSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ApplicationxpemfileSchema.ApplicationxpemfileSchema1Boxed](#applicationxpemfileschema1boxed)<br> abstract sealed validated payload class |
| record | [ApplicationxpemfileSchema.ApplicationxpemfileSchema1BoxedString](#applicationxpemfileschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxpemfileSchema.ApplicationxpemfileSchema1](#applicationxpemfileschema1)<br> schema class |

## ApplicationxpemfileSchema1Boxed
public sealed interface ApplicationxpemfileSchema1Boxed<br>
permits<br>
[ApplicationxpemfileSchema1BoxedString](#applicationxpemfileschema1boxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxpemfileSchema1BoxedString
public record ApplicationxpemfileSchema1BoxedString<br>
implements [ApplicationxpemfileSchema1Boxed](#applicationxpemfileschema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxpemfileSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## ApplicationxpemfileSchema1
public static class ApplicationxpemfileSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
