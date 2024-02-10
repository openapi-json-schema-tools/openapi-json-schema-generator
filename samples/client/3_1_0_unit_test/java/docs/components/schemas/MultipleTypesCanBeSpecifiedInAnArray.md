# MultipleTypesCanBeSpecifiedInAnArray
org.openapijsonschematools.client.components.schemas.MultipleTypesCanBeSpecifiedInAnArray.java
public class MultipleTypesCanBeSpecifiedInAnArray

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1Boxed](#multipletypescanbespecifiedinanarray1boxed)<br> abstract sealed validated payload class |
| static class | [MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber](#multipletypescanbespecifiedinanarray1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1BoxedString](#multipletypescanbespecifiedinanarray1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1](#multipletypescanbespecifiedinanarray1)<br> schema class |

## MultipleTypesCanBeSpecifiedInAnArray1Boxed
public static abstract sealed class MultipleTypesCanBeSpecifiedInAnArray1Boxed<br>
permits<br>
[MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber](#multipletypescanbespecifiedinanarray1boxednumber),
[MultipleTypesCanBeSpecifiedInAnArray1BoxedString](#multipletypescanbespecifiedinanarray1boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber
public static final class MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber<br>
extends [MultipleTypesCanBeSpecifiedInAnArray1Boxed](#multipletypescanbespecifiedinanarray1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## MultipleTypesCanBeSpecifiedInAnArray1BoxedString
public static final class MultipleTypesCanBeSpecifiedInAnArray1BoxedString<br>
extends [MultipleTypesCanBeSpecifiedInAnArray1Boxed](#multipletypescanbespecifiedinanarray1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleTypesCanBeSpecifiedInAnArray1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## MultipleTypesCanBeSpecifiedInAnArray1
public static class MultipleTypesCanBeSpecifiedInAnArray1<br>
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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
