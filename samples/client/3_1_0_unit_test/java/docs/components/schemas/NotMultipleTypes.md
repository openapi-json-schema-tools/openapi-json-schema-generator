# NotMultipleTypes
unit_test_api.components.schemas.NotMultipleTypes.java
public class NotMultipleTypes<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NotMultipleTypes.NotMultipleTypes1Boxed](#notmultipletypes1boxed)<br> sealed interface for validated payloads |
| record | [NotMultipleTypes.NotMultipleTypes1BoxedVoid](#notmultipletypes1boxedvoid)<br> boxed class to store validated null payloads |
| record | [NotMultipleTypes.NotMultipleTypes1BoxedBoolean](#notmultipletypes1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NotMultipleTypes.NotMultipleTypes1BoxedNumber](#notmultipletypes1boxednumber)<br> boxed class to store validated Number payloads |
| record | [NotMultipleTypes.NotMultipleTypes1BoxedString](#notmultipletypes1boxedstring)<br> boxed class to store validated String payloads |
| record | [NotMultipleTypes.NotMultipleTypes1BoxedList](#notmultipletypes1boxedlist)<br> boxed class to store validated List payloads |
| record | [NotMultipleTypes.NotMultipleTypes1BoxedMap](#notmultipletypes1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NotMultipleTypes.NotMultipleTypes1](#notmultipletypes1)<br> schema class |
| sealed interface | [NotMultipleTypes.NotBoxed](#notboxed)<br> sealed interface for validated payloads |
| record | [NotMultipleTypes.NotBoxedNumber](#notboxednumber)<br> boxed class to store validated Number payloads |
| record | [NotMultipleTypes.NotBoxedBoolean](#notboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NotMultipleTypes.Not](#not)<br> schema class |

## NotMultipleTypes1Boxed
public sealed interface NotMultipleTypes1Boxed<br>
permits<br>
[NotMultipleTypes1BoxedVoid](#notmultipletypes1boxedvoid),
[NotMultipleTypes1BoxedBoolean](#notmultipletypes1boxedboolean),
[NotMultipleTypes1BoxedNumber](#notmultipletypes1boxednumber),
[NotMultipleTypes1BoxedString](#notmultipletypes1boxedstring),
[NotMultipleTypes1BoxedList](#notmultipletypes1boxedlist),
[NotMultipleTypes1BoxedMap](#notmultipletypes1boxedmap)

sealed interface that stores validated payloads using boxed classes

## NotMultipleTypes1BoxedVoid
public record NotMultipleTypes1BoxedVoid<br>
implements [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotMultipleTypes1BoxedBoolean
public record NotMultipleTypes1BoxedBoolean<br>
implements [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotMultipleTypes1BoxedNumber
public record NotMultipleTypes1BoxedNumber<br>
implements [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotMultipleTypes1BoxedString
public record NotMultipleTypes1BoxedString<br>
implements [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotMultipleTypes1BoxedList
public record NotMultipleTypes1BoxedList<br>
implements [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotMultipleTypes1BoxedMap
public record NotMultipleTypes1BoxedMap<br>
implements [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotMultipleTypes1
public static class NotMultipleTypes1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | not = [Not.class](#not) |

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
| [NotMultipleTypes1BoxedString](#notmultipletypes1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [NotMultipleTypes1BoxedVoid](#notmultipletypes1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [NotMultipleTypes1BoxedNumber](#notmultipletypes1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [NotMultipleTypes1BoxedBoolean](#notmultipletypes1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [NotMultipleTypes1BoxedMap](#notmultipletypes1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [NotMultipleTypes1BoxedList](#notmultipletypes1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [NotMultipleTypes1Boxed](#notmultipletypes1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## NotBoxed
public sealed interface NotBoxed<br>
permits<br>
[NotBoxedNumber](#notboxednumber),
[NotBoxedBoolean](#notboxedboolean)

sealed interface that stores validated payloads using boxed classes

## NotBoxedNumber
public record NotBoxedNumber<br>
implements [NotBoxed](#notboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotBoxedBoolean
public record NotBoxedBoolean<br>
implements [NotBoxed](#notboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Not
public static class Not<br>
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
import unit_test_api.components.schemas.NotMultipleTypes;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// int validation
int validatedPayload = NotMultipleTypes.Not.validate(
    1L,
    configuration
);

// boolean validation
boolean validatedPayload = NotMultipleTypes.Not.validate(
    true,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Boolean.class<br/>)<br/> |
| String | type = "int"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| [NotBoxedNumber](#notboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [NotBoxedBoolean](#notboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [NotBoxed](#notboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
