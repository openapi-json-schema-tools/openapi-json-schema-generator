# ApplicationjsonSchema
public class ApplicationjsonSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)<br> abstract sealed validated payload class |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedVoid](#applicationjsonschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedBoolean](#applicationjsonschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedNumber](#applicationjsonschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedString](#applicationjsonschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedList](#applicationjsonschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1](#applicationjsonschema1)<br> schema class |
| static class | [ApplicationjsonSchema.Applicationjson0Boxed](#applicationjson0boxed)<br> abstract sealed validated payload class |
| static class | [ApplicationjsonSchema.Applicationjson0BoxedString](#applicationjson0boxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationjsonSchema.Applicationjson0](#applicationjson0)<br> schema class |

## ApplicationjsonSchema1Boxed
public static abstract sealed class ApplicationjsonSchema1Boxed<br>
permits<br>
[ApplicationjsonSchema1BoxedVoid](#applicationjsonschema1boxedvoid),
[ApplicationjsonSchema1BoxedBoolean](#applicationjsonschema1boxedboolean),
[ApplicationjsonSchema1BoxedNumber](#applicationjsonschema1boxednumber),
[ApplicationjsonSchema1BoxedString](#applicationjsonschema1boxedstring),
[ApplicationjsonSchema1BoxedList](#applicationjsonschema1boxedlist),
[ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ApplicationjsonSchema1BoxedVoid
public static final class ApplicationjsonSchema1BoxedVoid<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ApplicationjsonSchema1BoxedBoolean
public static final class ApplicationjsonSchema1BoxedBoolean<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ApplicationjsonSchema1BoxedNumber
public static final class ApplicationjsonSchema1BoxedNumber<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ApplicationjsonSchema1BoxedString
public static final class ApplicationjsonSchema1BoxedString<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ApplicationjsonSchema1BoxedList
public static final class ApplicationjsonSchema1BoxedList<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ApplicationjsonSchema1BoxedMap
public static final class ApplicationjsonSchema1BoxedMap<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ApplicationjsonSchema1
public static class ApplicationjsonSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Applicationjson0.class](#applicationjson0)<br>;)<br> |

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
| [ApplicationjsonSchema1BoxedString](#applicationjsonschema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1BoxedVoid](#applicationjsonschema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1BoxedNumber](#applicationjsonschema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1BoxedBoolean](#applicationjsonschema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1BoxedList](#applicationjsonschema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Applicationjson0Boxed
public static abstract sealed class Applicationjson0Boxed<br>
permits<br>
[Applicationjson0BoxedString](#applicationjson0boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Applicationjson0BoxedString
public static final class Applicationjson0BoxedString<br>
extends [Applicationjson0Boxed](#applicationjson0boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjson0BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Applicationjson0
public static class Applicationjson0<br>
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
String validatedPayload = ApplicationjsonSchema.Applicationjson0.validate(
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
| [Applicationjson0BoxedString](#applicationjson0boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |