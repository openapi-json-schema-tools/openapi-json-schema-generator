# PropertynamesValidation
org.openapijsonschematools.client.components.schemas.PropertynamesValidation.java
public class PropertynamesValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PropertynamesValidation.PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)<br> sealed interface for validated payloads |
| record | [PropertynamesValidation.PropertynamesValidation1BoxedVoid](#propertynamesvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [PropertynamesValidation.PropertynamesValidation1BoxedBoolean](#propertynamesvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PropertynamesValidation.PropertynamesValidation1BoxedNumber](#propertynamesvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [PropertynamesValidation.PropertynamesValidation1BoxedString](#propertynamesvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [PropertynamesValidation.PropertynamesValidation1BoxedList](#propertynamesvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [PropertynamesValidation.PropertynamesValidation1BoxedMap](#propertynamesvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PropertynamesValidation.PropertynamesValidation1](#propertynamesvalidation1)<br> schema class |
| sealed interface | [PropertynamesValidation.PropertyNamesBoxed](#propertynamesboxed)<br> sealed interface for validated payloads |
| record | [PropertynamesValidation.PropertyNamesBoxedString](#propertynamesboxedstring)<br> boxed class to store validated String payloads |
| static class | [PropertynamesValidation.PropertyNames](#propertynames)<br> schema class |

## PropertynamesValidation1Boxed
public sealed interface PropertynamesValidation1Boxed<br>
permits<br>
[PropertynamesValidation1BoxedVoid](#propertynamesvalidation1boxedvoid),
[PropertynamesValidation1BoxedBoolean](#propertynamesvalidation1boxedboolean),
[PropertynamesValidation1BoxedNumber](#propertynamesvalidation1boxednumber),
[PropertynamesValidation1BoxedString](#propertynamesvalidation1boxedstring),
[PropertynamesValidation1BoxedList](#propertynamesvalidation1boxedlist),
[PropertynamesValidation1BoxedMap](#propertynamesvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PropertynamesValidation1BoxedVoid
public record PropertynamesValidation1BoxedVoid<br>
implements [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertynamesValidation1BoxedBoolean
public record PropertynamesValidation1BoxedBoolean<br>
implements [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertynamesValidation1BoxedNumber
public record PropertynamesValidation1BoxedNumber<br>
implements [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertynamesValidation1BoxedString
public record PropertynamesValidation1BoxedString<br>
implements [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertynamesValidation1BoxedList
public record PropertynamesValidation1BoxedList<br>
implements [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertynamesValidation1BoxedMap
public record PropertynamesValidation1BoxedMap<br>
implements [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertynamesValidation1
public static class PropertynamesValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | propertyNames = [PropertyNames.class](#propertynames) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [PropertynamesValidation1BoxedString](#propertynamesvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PropertynamesValidation1BoxedVoid](#propertynamesvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [PropertynamesValidation1BoxedNumber](#propertynamesvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [PropertynamesValidation1BoxedBoolean](#propertynamesvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [PropertynamesValidation1BoxedMap](#propertynamesvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [PropertynamesValidation1BoxedList](#propertynamesvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PropertyNamesBoxed
public sealed interface PropertyNamesBoxed<br>
permits<br>
[PropertyNamesBoxedString](#propertynamesboxedstring)

sealed interface that stores validated payloads using boxed classes

## PropertyNamesBoxedString
public record PropertyNamesBoxedString<br>
implements [PropertyNamesBoxed](#propertynamesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertyNames
public static class PropertyNames<br>
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
import org.openapijsonschematools.client.components.schemas.PropertynamesValidation;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = PropertynamesValidation.PropertyNames.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Integer | maxLength = 3 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [PropertyNamesBoxedString](#propertynamesboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PropertyNamesBoxed](#propertynamesboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
