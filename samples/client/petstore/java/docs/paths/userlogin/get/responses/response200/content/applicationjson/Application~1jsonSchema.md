# Application~1jsonSchema
public class Application~1jsonSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application~1jsonSchema.Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedString](#application~1jsonschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1](#application~1jsonschema1)<br> schema class |

## Application~1jsonSchema1Boxed
public static abstract sealed class Application~1jsonSchema1Boxed<br>
permits<br>
[Application~1jsonSchema1BoxedString](#application~1jsonschema1boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1jsonSchema1BoxedString
public static final class Application~1jsonSchema1BoxedString<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1jsonSchema1
public static class Application~1jsonSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
