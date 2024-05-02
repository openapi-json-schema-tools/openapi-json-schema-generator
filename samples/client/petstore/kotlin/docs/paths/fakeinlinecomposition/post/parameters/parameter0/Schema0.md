# Schema0
public class Schema0<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema0.Schema01Boxed](#schema01boxed)<br> sealed interface for validated payloads |
| record | [Schema0.Schema01BoxedVoid](#schema01boxedvoid)<br> boxed class to store validated null payloads |
| record | [Schema0.Schema01BoxedBoolean](#schema01boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Schema0.Schema01BoxedNumber](#schema01boxednumber)<br> boxed class to store validated Number payloads |
| record | [Schema0.Schema01BoxedString](#schema01boxedstring)<br> boxed class to store validated String payloads |
| record | [Schema0.Schema01BoxedList](#schema01boxedlist)<br> boxed class to store validated List payloads |
| record | [Schema0.Schema01BoxedMap](#schema01boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Schema0.Schema01](#schema01)<br> schema class |
| sealed interface | [Schema0.Schema00Boxed](#schema00boxed)<br> sealed interface for validated payloads |
| record | [Schema0.Schema00BoxedString](#schema00boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema0.Schema00](#schema00)<br> schema class |

## Schema01Boxed
public sealed interface Schema01Boxed<br>
permits<br>
[Schema01BoxedVoid](#schema01boxedvoid),
[Schema01BoxedBoolean](#schema01boxedboolean),
[Schema01BoxedNumber](#schema01boxednumber),
[Schema01BoxedString](#schema01boxedstring),
[Schema01BoxedList](#schema01boxedlist),
[Schema01BoxedMap](#schema01boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema01BoxedVoid
public record Schema01BoxedVoid<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01BoxedBoolean
public record Schema01BoxedBoolean<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01BoxedNumber
public record Schema01BoxedNumber<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01BoxedString
public record Schema01BoxedString<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01BoxedList
public record Schema01BoxedList<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01BoxedMap
public record Schema01BoxedMap<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema01
public static class Schema01<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema00.class](#schema00)<br>;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Schema01BoxedString](#schema01boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema01BoxedVoid](#schema01boxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [Schema01BoxedNumber](#schema01boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema01BoxedBoolean](#schema01boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema01BoxedMap](#schema01boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema01BoxedList](#schema01boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Schema01Boxed](#schema01boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema00Boxed
public sealed interface Schema00Boxed<br>
permits<br>
[Schema00BoxedString](#schema00boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema00BoxedString
public record Schema00BoxedString<br>
implements [Schema00Boxed](#schema00boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema00BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema00
public static class Schema00<br>
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
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.parameter0.Schema0;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = Schema0.Schema00.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Integer | minLength = 1 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [Schema00BoxedString](#schema00boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema00Boxed](#schema00boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
