# NotMultipleTypes
org.openapijsonschematools.client.components.schemas.NotMultipleTypes.java
public class NotMultipleTypes

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NotMultipleTypes.NotMultipleTypes1Boxed](#notmultipletypes1boxed)<br> abstract sealed validated payload class |
| static class | [NotMultipleTypes.NotMultipleTypes1BoxedVoid](#notmultipletypes1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NotMultipleTypes.NotMultipleTypes1BoxedBoolean](#notmultipletypes1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NotMultipleTypes.NotMultipleTypes1BoxedNumber](#notmultipletypes1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NotMultipleTypes.NotMultipleTypes1BoxedString](#notmultipletypes1boxedstring)<br> boxed class to store validated String payloads |
| static class | [NotMultipleTypes.NotMultipleTypes1BoxedList](#notmultipletypes1boxedlist)<br> boxed class to store validated List payloads |
| static class | [NotMultipleTypes.NotMultipleTypes1BoxedMap](#notmultipletypes1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NotMultipleTypes.NotMultipleTypes1](#notmultipletypes1)<br> schema class |
| static class | [NotMultipleTypes.NotBoxed](#notboxed)<br> abstract sealed validated payload class |
| static class | [NotMultipleTypes.NotBoxedNumber](#notboxednumber)<br> boxed class to store validated Number payloads |
| static class | [NotMultipleTypes.NotBoxedBoolean](#notboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NotMultipleTypes.Not](#not)<br> schema class |

## NotMultipleTypes1Boxed
public static abstract sealed class NotMultipleTypes1Boxed<br>
permits<br>
[NotMultipleTypes1BoxedVoid](#notmultipletypes1boxedvoid),
[NotMultipleTypes1BoxedBoolean](#notmultipletypes1boxedboolean),
[NotMultipleTypes1BoxedNumber](#notmultipletypes1boxednumber),
[NotMultipleTypes1BoxedString](#notmultipletypes1boxedstring),
[NotMultipleTypes1BoxedList](#notmultipletypes1boxedlist),
[NotMultipleTypes1BoxedMap](#notmultipletypes1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## NotMultipleTypes1BoxedVoid
public static final class NotMultipleTypes1BoxedVoid<br>
extends [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## NotMultipleTypes1BoxedBoolean
public static final class NotMultipleTypes1BoxedBoolean<br>
extends [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## NotMultipleTypes1BoxedNumber
public static final class NotMultipleTypes1BoxedNumber<br>
extends [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## NotMultipleTypes1BoxedString
public static final class NotMultipleTypes1BoxedString<br>
extends [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## NotMultipleTypes1BoxedList
public static final class NotMultipleTypes1BoxedList<br>
extends [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## NotMultipleTypes1BoxedMap
public static final class NotMultipleTypes1BoxedMap<br>
extends [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NotBoxed
public static abstract sealed class NotBoxed<br>
permits<br>
[NotBoxedNumber](#notboxednumber),
[NotBoxedBoolean](#notboxedboolean)

abstract sealed class that stores validated payloads using boxed classes

## NotBoxedNumber
public static final class NotBoxedNumber<br>
extends [NotBoxed](#notboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## NotBoxedBoolean
public static final class NotBoxedBoolean<br>
extends [NotBoxed](#notboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Not
public static class Not<br>
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
