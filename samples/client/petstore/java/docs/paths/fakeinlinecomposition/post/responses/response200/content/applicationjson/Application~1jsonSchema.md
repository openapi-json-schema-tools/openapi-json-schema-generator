# Application~1jsonSchema
public class Application~1jsonSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application~1jsonSchema.Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedVoid](#application~1jsonschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedBoolean](#application~1jsonschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedNumber](#application~1jsonschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedString](#application~1jsonschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedList](#application~1jsonschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedMap](#application~1jsonschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1](#application~1jsonschema1)<br> schema class |
| static class | [Application~1jsonSchema.Application~1json0Boxed](#application~1json0boxed)<br> abstract sealed validated payload class |
| static class | [Application~1jsonSchema.Application~1json0BoxedString](#application~1json0boxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1jsonSchema.Application~1json0](#application~1json0)<br> schema class |

## Application~1jsonSchema1Boxed
public static abstract sealed class Application~1jsonSchema1Boxed<br>
permits<br>
[Application~1jsonSchema1BoxedVoid](#application~1jsonschema1boxedvoid),
[Application~1jsonSchema1BoxedBoolean](#application~1jsonschema1boxedboolean),
[Application~1jsonSchema1BoxedNumber](#application~1jsonschema1boxednumber),
[Application~1jsonSchema1BoxedString](#application~1jsonschema1boxedstring),
[Application~1jsonSchema1BoxedList](#application~1jsonschema1boxedlist),
[Application~1jsonSchema1BoxedMap](#application~1jsonschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application~1jsonSchema1BoxedVoid
public static final class Application~1jsonSchema1BoxedVoid<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Application~1jsonSchema1BoxedBoolean
public static final class Application~1jsonSchema1BoxedBoolean<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Application~1jsonSchema1BoxedNumber
public static final class Application~1jsonSchema1BoxedNumber<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application~1jsonSchema1BoxedString
public static final class Application~1jsonSchema1BoxedString<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1jsonSchema1BoxedList
public static final class Application~1jsonSchema1BoxedList<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Application~1jsonSchema1BoxedMap
public static final class Application~1jsonSchema1BoxedMap<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Application~1jsonSchema1
public static class Application~1jsonSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Application~1json0.class](#application~1json0)<br>;)<br> |

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
| [Application~1jsonSchema1BoxedString](#application~1jsonschema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Application~1jsonSchema1BoxedVoid](#application~1jsonschema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Application~1jsonSchema1BoxedNumber](#application~1jsonschema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Application~1jsonSchema1BoxedBoolean](#application~1jsonschema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Application~1jsonSchema1BoxedMap](#application~1jsonschema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Application~1jsonSchema1BoxedList](#application~1jsonschema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1json0Boxed
public static abstract sealed class Application~1json0Boxed<br>
permits<br>
[Application~1json0BoxedString](#application~1json0boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1json0BoxedString
public static final class Application~1json0BoxedString<br>
extends [Application~1json0Boxed](#application~1json0boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1json0BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1json0
public static class Application~1json0<br>
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
String validatedPayload = Application~1jsonSchema.Application~1json0.validate(
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
| [Application~1json0BoxedString](#application~1json0boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |