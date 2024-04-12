# StoreorderorderidDeletePathParameters
public class StoreorderorderidDeletePathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters1Boxed](#storeorderorderiddeletepathparameters1boxed)<br> sealed interface for validated payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters1BoxedMap](#storeorderorderiddeletepathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters1](#storeorderorderiddeletepathparameters1)<br> schema class |
| static class | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters8](#storeorderorderiddeletepathparameters8)<br> builder for Map payloads |
| static class | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters9](#storeorderorderiddeletepathparameters9)<br> output class for Map payloads |
| sealed interface | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters4Boxed](#storeorderorderiddeletepathparameters4boxed)<br> sealed interface for validated payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters4BoxedVoid](#storeorderorderiddeletepathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters4BoxedBoolean](#storeorderorderiddeletepathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters4BoxedNumber](#storeorderorderiddeletepathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters4BoxedString](#storeorderorderiddeletepathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters4BoxedList](#storeorderorderiddeletepathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters4BoxedMap](#storeorderorderiddeletepathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters4](#storeorderorderiddeletepathparameters4)<br> schema class |

## StoreorderorderidDeletePathParameters1Boxed
public sealed interface StoreorderorderidDeletePathParameters1Boxed<br>
permits<br>
[StoreorderorderidDeletePathParameters1BoxedMap](#storeorderorderiddeletepathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## StoreorderorderidDeletePathParameters1BoxedMap
public record StoreorderorderidDeletePathParameters1BoxedMap<br>
implements [StoreorderorderidDeletePathParameters1Boxed](#storeorderorderiddeletepathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeletePathParameters1BoxedMap([StoreorderorderidDeletePathParameters9](#storeorderorderiddeletepathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderorderidDeletePathParameters9](#storeorderorderiddeletepathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeletePathParameters1
public static class StoreorderorderidDeletePathParameters1<br>
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
import org.openapijsonschematools.client.paths.storeorderorderid.delete.StoreorderorderidDeletePathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters9 validatedPayload =
    StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters1.validate(
    new StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters8()
        .order_id("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("order_id", [Schema0.Schema01.class](../../../paths/storeorderorderid/delete/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"order_id"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [StoreorderorderidDeletePathParameters4.class](#storeorderorderiddeletepathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderorderidDeletePathParameters9](#storeorderorderiddeletepathparameters9) | validate([Map&lt;?, ?&gt;](#storeorderorderiddeletepathparameters8) arg, SchemaConfiguration configuration) |
| [StoreorderorderidDeletePathParameters1BoxedMap](#storeorderorderiddeletepathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#storeorderorderiddeletepathparameters8) arg, SchemaConfiguration configuration) |
| [StoreorderorderidDeletePathParameters1Boxed](#storeorderorderiddeletepathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StoreorderorderidDeletePathParameters10
public class StoreorderorderidDeletePathParameters10<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeletePathParameters10(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## StoreorderorderidDeletePathParameters8
public class StoreorderorderidDeletePathParameters8<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeletePathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderorderidDeletePathParameters10](#storeorderorderiddeletepathparameters10) | order_id(String value) |

## StoreorderorderidDeletePathParameters9
public static class StoreorderorderidDeletePathParameters9<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [StoreorderorderidDeletePathParameters9](#storeorderorderiddeletepathparameters9) | of([Map<String, String>](#storeorderorderiddeletepathparameters8) arg, SchemaConfiguration configuration) |
| String | order_id()<br> |

## StoreorderorderidDeletePathParameters4Boxed
public sealed interface StoreorderorderidDeletePathParameters4Boxed<br>
permits<br>
[StoreorderorderidDeletePathParameters4BoxedVoid](#storeorderorderiddeletepathparameters4boxedvoid),
[StoreorderorderidDeletePathParameters4BoxedBoolean](#storeorderorderiddeletepathparameters4boxedboolean),
[StoreorderorderidDeletePathParameters4BoxedNumber](#storeorderorderiddeletepathparameters4boxednumber),
[StoreorderorderidDeletePathParameters4BoxedString](#storeorderorderiddeletepathparameters4boxedstring),
[StoreorderorderidDeletePathParameters4BoxedList](#storeorderorderiddeletepathparameters4boxedlist),
[StoreorderorderidDeletePathParameters4BoxedMap](#storeorderorderiddeletepathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## StoreorderorderidDeletePathParameters4BoxedVoid
public record StoreorderorderidDeletePathParameters4BoxedVoid<br>
implements [StoreorderorderidDeletePathParameters4Boxed](#storeorderorderiddeletepathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeletePathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeletePathParameters4BoxedBoolean
public record StoreorderorderidDeletePathParameters4BoxedBoolean<br>
implements [StoreorderorderidDeletePathParameters4Boxed](#storeorderorderiddeletepathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeletePathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeletePathParameters4BoxedNumber
public record StoreorderorderidDeletePathParameters4BoxedNumber<br>
implements [StoreorderorderidDeletePathParameters4Boxed](#storeorderorderiddeletepathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeletePathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeletePathParameters4BoxedString
public record StoreorderorderidDeletePathParameters4BoxedString<br>
implements [StoreorderorderidDeletePathParameters4Boxed](#storeorderorderiddeletepathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeletePathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeletePathParameters4BoxedList
public record StoreorderorderidDeletePathParameters4BoxedList<br>
implements [StoreorderorderidDeletePathParameters4Boxed](#storeorderorderiddeletepathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeletePathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeletePathParameters4BoxedMap
public record StoreorderorderidDeletePathParameters4BoxedMap<br>
implements [StoreorderorderidDeletePathParameters4Boxed](#storeorderorderiddeletepathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeletePathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeletePathParameters4
public static class StoreorderorderidDeletePathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
