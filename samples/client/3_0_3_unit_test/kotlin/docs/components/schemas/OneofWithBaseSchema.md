# OneofWithBaseSchema
org.openapijsonschematools.client.components.schemas.OneofWithBaseSchema.java
class OneofWithBaseSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [OneofWithBaseSchema.OneofWithBaseSchema1Boxed](#oneofwithbaseschema1boxed)<br> sealed interface for validated payloads |
| record | [OneofWithBaseSchema.OneofWithBaseSchema1BoxedString](#oneofwithbaseschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [OneofWithBaseSchema.OneofWithBaseSchema1](#oneofwithbaseschema1)<br> schema class |
| sealed interface | [OneofWithBaseSchema.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [OneofWithBaseSchema.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [OneofWithBaseSchema.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [OneofWithBaseSchema.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [OneofWithBaseSchema.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| record | [OneofWithBaseSchema.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| record | [OneofWithBaseSchema.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [OneofWithBaseSchema.Schema1](#schema1)<br> schema class |
| sealed interface | [OneofWithBaseSchema.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [OneofWithBaseSchema.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [OneofWithBaseSchema.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [OneofWithBaseSchema.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [OneofWithBaseSchema.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [OneofWithBaseSchema.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [OneofWithBaseSchema.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [OneofWithBaseSchema.Schema0](#schema0)<br> schema class |

## OneofWithBaseSchema1Boxed
sealed interface OneofWithBaseSchema1Boxed<br>
permits<br>
[OneofWithBaseSchema1BoxedString](#oneofwithbaseschema1boxedstring)

sealed interface that stores validated payloads using boxed classes

## OneofWithBaseSchema1BoxedString
data class OneofWithBaseSchema1BoxedString<br>
implements [OneofWithBaseSchema1Boxed](#oneofwithbaseschema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| OneofWithBaseSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## OneofWithBaseSchema1
class OneofWithBaseSchema1<br>
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
import org.openapijsonschematools.client.components.schemas.OneofWithBaseSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = OneofWithBaseSchema.OneofWithBaseSchema1.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String::class.java<br/>)<br/> |
| List<Class<? extends JsonSchema>> | oneOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1::class.java](#schema1)<br>))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| [OneofWithBaseSchema1BoxedString](#oneofwithbaseschema1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [OneofWithBaseSchema1Boxed](#oneofwithbaseschema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema1Boxed
sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedVoid](#schema1boxedvoid),
[Schema1BoxedBoolean](#schema1boxedboolean),
[Schema1BoxedNumber](#schema1boxednumber),
[Schema1BoxedString](#schema1boxedstring),
[Schema1BoxedList](#schema1boxedlist),
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedVoid
data class Schema1BoxedVoid<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedBoolean
data class Schema1BoxedBoolean<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedNumber
data class Schema1BoxedNumber<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedString
data class Schema1BoxedString<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedList
data class Schema1BoxedList<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedMap
data class Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1
class Schema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | maxLength = 4 |

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
| [Schema1BoxedString](#schema1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Schema1BoxedVoid](#schema1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Schema1BoxedNumber](#schema1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Schema1BoxedBoolean](#schema1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [Schema1BoxedList](#schema1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Schema1Boxed](#schema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema0Boxed
sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedVoid
data class Schema0BoxedVoid<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedBoolean
data class Schema0BoxedBoolean<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedNumber
data class Schema0BoxedNumber<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedString
data class Schema0BoxedString<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedList
data class Schema0BoxedList<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedMap
data class Schema0BoxedMap<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0
class Schema0<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minLength = 2 |

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
| [Schema0BoxedString](#schema0boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Schema0BoxedVoid](#schema0boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Schema0BoxedNumber](#schema0boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Schema0BoxedBoolean](#schema0boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [Schema0BoxedMap](#schema0boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [Schema0BoxedList](#schema0boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Schema0Boxed](#schema0boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
