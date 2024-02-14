# Application1xmlSchema
public class Application1xmlSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application1xmlSchema.Application1xmlSchema1Boxed](#application1xmlschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application1xmlSchema.Application1xmlSchema1BoxedString](#application1xmlschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xmlSchema.Application1xmlSchema1](#application1xmlschema1)<br> schema class |

## Application1xmlSchema1Boxed
public static abstract sealed class Application1xmlSchema1Boxed<br>
permits<br>
[Application1xmlSchema1BoxedString](#application1xmlschema1boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xmlSchema1BoxedString
public static final class Application1xmlSchema1BoxedString<br>
extends [Application1xmlSchema1Boxed](#application1xmlschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xmlSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xmlSchema1
public static class Application1xmlSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
