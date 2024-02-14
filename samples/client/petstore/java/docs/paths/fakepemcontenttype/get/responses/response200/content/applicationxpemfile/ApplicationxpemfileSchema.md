# ApplicationxpemfileSchema
public class ApplicationxpemfileSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ApplicationxpemfileSchema.ApplicationxpemfileSchema1Boxed](#applicationxpemfileschema1boxed)<br> abstract sealed validated payload class |
| static class | [ApplicationxpemfileSchema.ApplicationxpemfileSchema1BoxedString](#applicationxpemfileschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxpemfileSchema.ApplicationxpemfileSchema1](#applicationxpemfileschema1)<br> schema class |

## ApplicationxpemfileSchema1Boxed
public static abstract sealed class ApplicationxpemfileSchema1Boxed<br>
permits<br>
[ApplicationxpemfileSchema1BoxedString](#applicationxpemfileschema1boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## ApplicationxpemfileSchema1BoxedString
public static final class ApplicationxpemfileSchema1BoxedString<br>
extends [ApplicationxpemfileSchema1Boxed](#applicationxpemfileschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxpemfileSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ApplicationxpemfileSchema1
public static class ApplicationxpemfileSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
