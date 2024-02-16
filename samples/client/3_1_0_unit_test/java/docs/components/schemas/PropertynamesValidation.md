# PropertynamesValidation
org.openapijsonschematools.client.components.schemas.PropertynamesValidation.java
public class PropertynamesValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PropertynamesValidation.PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)<br> abstract sealed validated payload class |
| static class | [PropertynamesValidation.PropertynamesValidation1BoxedVoid](#propertynamesvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [PropertynamesValidation.PropertynamesValidation1BoxedBoolean](#propertynamesvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [PropertynamesValidation.PropertynamesValidation1BoxedNumber](#propertynamesvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertynamesValidation.PropertynamesValidation1BoxedString](#propertynamesvalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [PropertynamesValidation.PropertynamesValidation1BoxedList](#propertynamesvalidation1boxedlist)<br> boxed class to store validated List payloads |
| static class | [PropertynamesValidation.PropertynamesValidation1BoxedMap](#propertynamesvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PropertynamesValidation.PropertynamesValidation1](#propertynamesvalidation1)<br> schema class |
| static class | [PropertynamesValidation.PropertyNamesBoxed](#propertynamesboxed)<br> abstract sealed validated payload class |
| static class | [PropertynamesValidation.PropertyNamesBoxedString](#propertynamesboxedstring)<br> boxed class to store validated String payloads |
| static class | [PropertynamesValidation.PropertyNames](#propertynames)<br> schema class |

## PropertynamesValidation1Boxed
public static abstract sealed class PropertynamesValidation1Boxed<br>
permits<br>
[PropertynamesValidation1BoxedVoid](#propertynamesvalidation1boxedvoid),
[PropertynamesValidation1BoxedBoolean](#propertynamesvalidation1boxedboolean),
[PropertynamesValidation1BoxedNumber](#propertynamesvalidation1boxednumber),
[PropertynamesValidation1BoxedString](#propertynamesvalidation1boxedstring),
[PropertynamesValidation1BoxedList](#propertynamesvalidation1boxedlist),
[PropertynamesValidation1BoxedMap](#propertynamesvalidation1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## PropertynamesValidation1BoxedVoid
public static final class PropertynamesValidation1BoxedVoid<br>
extends [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## PropertynamesValidation1BoxedBoolean
public static final class PropertynamesValidation1BoxedBoolean<br>
extends [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## PropertynamesValidation1BoxedNumber
public static final class PropertynamesValidation1BoxedNumber<br>
extends [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## PropertynamesValidation1BoxedString
public static final class PropertynamesValidation1BoxedString<br>
extends [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## PropertynamesValidation1BoxedList
public static final class PropertynamesValidation1BoxedList<br>
extends [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## PropertynamesValidation1BoxedMap
public static final class PropertynamesValidation1BoxedMap<br>
extends [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## PropertyNamesBoxed
public static abstract sealed class PropertyNamesBoxed<br>
permits<br>
[PropertyNamesBoxedString](#propertynamesboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## PropertyNamesBoxedString
public static final class PropertyNamesBoxedString<br>
extends [PropertyNamesBoxed](#propertynamesboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamesBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
