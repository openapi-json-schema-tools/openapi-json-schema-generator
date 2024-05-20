# MultipleTypesCanBeSpecifiedInAnArray
org.openapijsonschematools.client.components.schemas.MultipleTypesCanBeSpecifiedInAnArray.java
class MultipleTypesCanBeSpecifiedInAnArray<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1Boxed](#multipletypescanbespecifiedinanarray1boxed)<br> sealed interface for validated payloads |
| record | [MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber](#multipletypescanbespecifiedinanarray1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1BoxedString](#multipletypescanbespecifiedinanarray1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1](#multipletypescanbespecifiedinanarray1)<br> schema class |

## MultipleTypesCanBeSpecifiedInAnArray1Boxed
sealed interface MultipleTypesCanBeSpecifiedInAnArray1Boxed<br>
permits<br>
[MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber](#multipletypescanbespecifiedinanarray1boxednumber),
[MultipleTypesCanBeSpecifiedInAnArray1BoxedString](#multipletypescanbespecifiedinanarray1boxedstring)

sealed interface that stores validated payloads using boxed classes

## MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber
data class MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber<br>
implements [MultipleTypesCanBeSpecifiedInAnArray1Boxed](#multipletypescanbespecifiedinanarray1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleTypesCanBeSpecifiedInAnArray1BoxedString
data class MultipleTypesCanBeSpecifiedInAnArray1BoxedString<br>
implements [MultipleTypesCanBeSpecifiedInAnArray1Boxed](#multipletypescanbespecifiedinanarray1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleTypesCanBeSpecifiedInAnArray1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleTypesCanBeSpecifiedInAnArray1
class MultipleTypesCanBeSpecifiedInAnArray1<br>
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
import org.openapijsonschematools.client.components.schemas.MultipleTypesCanBeSpecifiedInAnArray;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// int validation
int validatedPayload = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.validate(
    1L,
    configuration
);

// String validation
String validatedPayload = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Int::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;String::class.java<br/>)<br/> |
| String | type = "int"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| [MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber](#multipletypescanbespecifiedinanarray1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| [MultipleTypesCanBeSpecifiedInAnArray1BoxedString](#multipletypescanbespecifiedinanarray1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MultipleTypesCanBeSpecifiedInAnArray1Boxed](#multipletypescanbespecifiedinanarray1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
