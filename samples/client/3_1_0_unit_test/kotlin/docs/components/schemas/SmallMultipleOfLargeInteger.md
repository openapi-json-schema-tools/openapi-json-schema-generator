# SmallMultipleOfLargeInteger
org.openapijsonschematools.client.components.schemas.SmallMultipleOfLargeInteger.java
class SmallMultipleOfLargeInteger<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [SmallMultipleOfLargeInteger.SmallMultipleOfLargeInteger1Boxed](#smallmultipleoflargeinteger1boxed)<br> sealed interface for validated payloads |
| record | [SmallMultipleOfLargeInteger.SmallMultipleOfLargeInteger1BoxedNumber](#smallmultipleoflargeinteger1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [SmallMultipleOfLargeInteger.SmallMultipleOfLargeInteger1](#smallmultipleoflargeinteger1)<br> schema class |

## SmallMultipleOfLargeInteger1Boxed
sealed interface SmallMultipleOfLargeInteger1Boxed<br>
permits<br>
[SmallMultipleOfLargeInteger1BoxedNumber](#smallmultipleoflargeinteger1boxednumber)

sealed interface that stores validated payloads using boxed classes

## SmallMultipleOfLargeInteger1BoxedNumber
data class SmallMultipleOfLargeInteger1BoxedNumber<br>
implements [SmallMultipleOfLargeInteger1Boxed](#smallmultipleoflargeinteger1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SmallMultipleOfLargeInteger1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## SmallMultipleOfLargeInteger1
class SmallMultipleOfLargeInteger1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.components.schemas.SmallMultipleOfLargeInteger;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// int validation
int validatedPayload = SmallMultipleOfLargeInteger.SmallMultipleOfLargeInteger1.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Int::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double::class.java<br/>)<br/> |
| String | type = "int"; |
| BigDecimal | multipleOf = BigDecimal("1.0E-8") |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| [SmallMultipleOfLargeInteger1BoxedNumber](#smallmultipleoflargeinteger1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [SmallMultipleOfLargeInteger1Boxed](#smallmultipleoflargeinteger1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
