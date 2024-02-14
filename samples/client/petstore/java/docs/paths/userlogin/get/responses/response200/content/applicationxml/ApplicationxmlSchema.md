# ApplicationxmlSchema
public class ApplicationxmlSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)<br> abstract sealed validated payload class |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1BoxedString](#applicationxmlschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1](#applicationxmlschema1)<br> schema class |

## ApplicationxmlSchema1Boxed
public static abstract sealed class ApplicationxmlSchema1Boxed<br>
permits<br>
[ApplicationxmlSchema1BoxedString](#applicationxmlschema1boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## ApplicationxmlSchema1BoxedString
public static final class ApplicationxmlSchema1BoxedString<br>
extends [ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ApplicationxmlSchema1
public static class ApplicationxmlSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
