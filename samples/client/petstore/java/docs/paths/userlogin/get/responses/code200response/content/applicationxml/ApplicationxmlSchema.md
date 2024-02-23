# ApplicationxmlSchema
public class ApplicationxmlSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ApplicationxmlSchema.ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)<br> sealed interface for validated payloads |
| record | [ApplicationxmlSchema.ApplicationxmlSchema1BoxedString](#applicationxmlschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1](#applicationxmlschema1)<br> schema class |

## ApplicationxmlSchema1Boxed
public sealed interface ApplicationxmlSchema1Boxed<br>
permits<br>
[ApplicationxmlSchema1BoxedString](#applicationxmlschema1boxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxmlSchema1BoxedString
public record ApplicationxmlSchema1BoxedString<br>
implements [ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxmlSchema1
public static class ApplicationxmlSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
