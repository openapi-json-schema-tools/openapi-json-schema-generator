# ApplicationjsonSchema
public class ApplicationjsonSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ApplicationjsonSchema.ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)<br> sealed interface for validated payloads |
| record | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedVoid](#applicationjsonschema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedBoolean](#applicationjsonschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedNumber](#applicationjsonschema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedString](#applicationjsonschema1boxedstring)<br> boxed class to store validated String payloads |
| record | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedList](#applicationjsonschema1boxedlist)<br> boxed class to store validated List payloads |
| record | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1](#applicationjsonschema1)<br> schema class |
| sealed interface | [ApplicationjsonSchema.Applicationjson0Boxed](#applicationjson0boxed)<br> sealed interface for validated payloads |
| record | [ApplicationjsonSchema.Applicationjson0BoxedString](#applicationjson0boxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationjsonSchema.Applicationjson0](#applicationjson0)<br> schema class |

## ApplicationjsonSchema1Boxed
public sealed interface ApplicationjsonSchema1Boxed<br>
permits<br>
[ApplicationjsonSchema1BoxedVoid](#applicationjsonschema1boxedvoid),
[ApplicationjsonSchema1BoxedBoolean](#applicationjsonschema1boxedboolean),
[ApplicationjsonSchema1BoxedNumber](#applicationjsonschema1boxednumber),
[ApplicationjsonSchema1BoxedString](#applicationjsonschema1boxedstring),
[ApplicationjsonSchema1BoxedList](#applicationjsonschema1boxedlist),
[ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ApplicationjsonSchema1BoxedVoid
public record ApplicationjsonSchema1BoxedVoid<br>
implements [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationjsonSchema1BoxedBoolean
public record ApplicationjsonSchema1BoxedBoolean<br>
implements [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationjsonSchema1BoxedNumber
public record ApplicationjsonSchema1BoxedNumber<br>
implements [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationjsonSchema1BoxedString
public record ApplicationjsonSchema1BoxedString<br>
implements [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationjsonSchema1BoxedList
public record ApplicationjsonSchema1BoxedList<br>
implements [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationjsonSchema1BoxedMap
public record ApplicationjsonSchema1BoxedMap<br>
implements [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1BoxedString](#applicationjsonschema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1BoxedVoid](#applicationjsonschema1boxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1BoxedNumber](#applicationjsonschema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1BoxedBoolean](#applicationjsonschema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1BoxedList](#applicationjsonschema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Applicationjson0Boxed
public sealed interface Applicationjson0Boxed<br>
permits<br>
[Applicationjson0BoxedString](#applicationjson0boxedstring)

sealed interface that stores validated payloads using boxed classes

## Applicationjson0BoxedString
public record Applicationjson0BoxedString<br>
implements [Applicationjson0Boxed](#applicationjson0boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjson0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.responses.code200response.content.applicationjson.ApplicationjsonSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

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
| [Applicationjson0Boxed](#applicationjson0boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
