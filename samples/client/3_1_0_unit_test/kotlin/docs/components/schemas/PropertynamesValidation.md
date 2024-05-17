# PropertynamesValidation
org.openapijsonschematools.client.components.schemas.PropertynamesValidation.java
class PropertynamesValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
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
sealed interface PropertynamesValidation1Boxed<br>
permits<br>
[PropertynamesValidation1BoxedVoid](#propertynamesvalidation1boxedvoid),
[PropertynamesValidation1BoxedBoolean](#propertynamesvalidation1boxedboolean),
[PropertynamesValidation1BoxedNumber](#propertynamesvalidation1boxednumber),
[PropertynamesValidation1BoxedString](#propertynamesvalidation1boxedstring),
[PropertynamesValidation1BoxedList](#propertynamesvalidation1boxedlist),
[PropertynamesValidation1BoxedMap](#propertynamesvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PropertynamesValidation1BoxedVoid
data class PropertynamesValidation1BoxedVoid<br>
implements [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertynamesValidation1BoxedBoolean
data class PropertynamesValidation1BoxedBoolean<br>
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
| Any? | getData()<br>validated payload |

## PropertynamesValidation1BoxedNumber
data class PropertynamesValidation1BoxedNumber<br>
implements [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertynamesValidation1BoxedString
data class PropertynamesValidation1BoxedString<br>
implements [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertynamesValidation1BoxedList
data class PropertynamesValidation1BoxedList<br>
implements [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertynamesValidation1BoxedMap
data class PropertynamesValidation1BoxedMap<br>
implements [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertynamesValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertynamesValidation1
class PropertynamesValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | propertyNames = [PropertyNames::class.java](#propertynames) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| int | validate(arg: int, configuration: SchemaConfiguration) |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| float | validate(arg: float, configuration: SchemaConfiguration) |
| double | validate(arg: double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| boolean | validate(arg: boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [PropertynamesValidation1BoxedString](#propertynamesvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [PropertynamesValidation1BoxedVoid](#propertynamesvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [PropertynamesValidation1BoxedNumber](#propertynamesvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [PropertynamesValidation1BoxedBoolean](#propertynamesvalidation1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [PropertynamesValidation1BoxedMap](#propertynamesvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [PropertynamesValidation1BoxedList](#propertynamesvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [PropertynamesValidation1Boxed](#propertynamesvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## PropertyNamesBoxed
sealed interface PropertyNamesBoxed<br>
permits<br>
[PropertyNamesBoxedString](#propertynamesboxedstring)

sealed interface that stores validated payloads using boxed classes

## PropertyNamesBoxedString
data class PropertyNamesBoxedString<br>
implements [PropertyNamesBoxed](#propertynamesboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertyNames
class PropertyNames<br>
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

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = PropertynamesValidation.PropertyNames.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String::class.java<br/>)<br/> |
| Integer | maxLength = 3 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| [PropertyNamesBoxedString](#propertynamesboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [PropertyNamesBoxed](#propertynamesboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
