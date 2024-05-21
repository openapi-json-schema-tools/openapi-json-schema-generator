# MultipleTypesCanBeSpecifiedInAnArray
unit_test_api.components.schemas.MultipleTypesCanBeSpecifiedInAnArray.java
public class MultipleTypesCanBeSpecifiedInAnArray<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1Boxed](#multipletypescanbespecifiedinanarray1boxed)<br> sealed interface for validated payloads |
| record | [MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber](#multipletypescanbespecifiedinanarray1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1BoxedString](#multipletypescanbespecifiedinanarray1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1](#multipletypescanbespecifiedinanarray1)<br> schema class |

## MultipleTypesCanBeSpecifiedInAnArray1Boxed
public sealed interface MultipleTypesCanBeSpecifiedInAnArray1Boxed<br>
permits<br>
[MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber](#multipletypescanbespecifiedinanarray1boxednumber),
[MultipleTypesCanBeSpecifiedInAnArray1BoxedString](#multipletypescanbespecifiedinanarray1boxedstring)

sealed interface that stores validated payloads using boxed classes

## MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber
public record MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber<br>
implements [MultipleTypesCanBeSpecifiedInAnArray1Boxed](#multipletypescanbespecifiedinanarray1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleTypesCanBeSpecifiedInAnArray1BoxedString
public record MultipleTypesCanBeSpecifiedInAnArray1BoxedString<br>
implements [MultipleTypesCanBeSpecifiedInAnArray1Boxed](#multipletypescanbespecifiedinanarray1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleTypesCanBeSpecifiedInAnArray1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleTypesCanBeSpecifiedInAnArray1
public static class MultipleTypesCanBeSpecifiedInAnArray1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.MapUtils;
import unit_test_api.schemas.validation.FrozenList;
import unit_test_api.schemas.validation.FrozenMap;
import unit_test_api.components.schemas.MultipleTypesCanBeSpecifiedInAnArray;

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
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "int"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| [MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber](#multipletypescanbespecifiedinanarray1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| String | validate(String arg, SchemaConfiguration configuration) |
| [MultipleTypesCanBeSpecifiedInAnArray1BoxedString](#multipletypescanbespecifiedinanarray1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MultipleTypesCanBeSpecifiedInAnArray1Boxed](#multipletypescanbespecifiedinanarray1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
