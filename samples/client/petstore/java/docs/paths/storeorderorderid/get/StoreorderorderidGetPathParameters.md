# StoreorderorderidGetPathParameters
public class StoreorderorderidGetPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters1Boxed](#storeorderorderidgetpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters1BoxedMap](#storeorderorderidgetpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters1](#storeorderorderidgetpathparameters1)<br> schema class |
| static class | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters8](#storeorderorderidgetpathparameters8)<br> builder for Map payloads |
| static class | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters9](#storeorderorderidgetpathparameters9)<br> output class for Map payloads |
| sealed interface | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters4Boxed](#storeorderorderidgetpathparameters4boxed)<br> sealed interface for validated payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters4BoxedVoid](#storeorderorderidgetpathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters4BoxedBoolean](#storeorderorderidgetpathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters4BoxedNumber](#storeorderorderidgetpathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters4BoxedString](#storeorderorderidgetpathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters4BoxedList](#storeorderorderidgetpathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters4BoxedMap](#storeorderorderidgetpathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters4](#storeorderorderidgetpathparameters4)<br> schema class |

## StoreorderorderidGetPathParameters1Boxed
public sealed interface StoreorderorderidGetPathParameters1Boxed<br>
permits<br>
[StoreorderorderidGetPathParameters1BoxedMap](#storeorderorderidgetpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## StoreorderorderidGetPathParameters1BoxedMap
public record StoreorderorderidGetPathParameters1BoxedMap<br>
implements [StoreorderorderidGetPathParameters1Boxed](#storeorderorderidgetpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetPathParameters1BoxedMap([StoreorderorderidGetPathParameters9](#storeorderorderidgetpathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderorderidGetPathParameters9](#storeorderorderidgetpathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetPathParameters1
public static class StoreorderorderidGetPathParameters1<br>
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
import org.openapijsonschematools.client.paths.storeorderorderid.get.StoreorderorderidGetPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters9 validatedPayload =
    StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters1.validate(
    new StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters8()
        .order_id(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("order_id", [Schema0.Schema01.class](../../../paths/storeorderorderid/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"order_id"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [StoreorderorderidGetPathParameters4.class](#storeorderorderidgetpathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderorderidGetPathParameters9](#storeorderorderidgetpathparameters9) | validate([Map&lt;?, ?&gt;](#storeorderorderidgetpathparameters8) arg, SchemaConfiguration configuration) |
| [StoreorderorderidGetPathParameters1BoxedMap](#storeorderorderidgetpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#storeorderorderidgetpathparameters8) arg, SchemaConfiguration configuration) |
| [StoreorderorderidGetPathParameters1Boxed](#storeorderorderidgetpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StoreorderorderidGetPathParameters10
public class StoreorderorderidGetPathParameters10<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetPathParameters10(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## StoreorderorderidGetPathParameters8
public class StoreorderorderidGetPathParameters8<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetPathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderorderidGetPathParameters10](#storeorderorderidgetpathparameters10) | order_id(int value) |
| [StoreorderorderidGetPathParameters10](#storeorderorderidgetpathparameters10) | order_id(float value) |
| [StoreorderorderidGetPathParameters10](#storeorderorderidgetpathparameters10) | order_id(long value) |
| [StoreorderorderidGetPathParameters10](#storeorderorderidgetpathparameters10) | order_id(double value) |

## StoreorderorderidGetPathParameters9
public static class StoreorderorderidGetPathParameters9<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [StoreorderorderidGetPathParameters9](#storeorderorderidgetpathparameters9) | of([Map<String, Number>](#storeorderorderidgetpathparameters8) arg, SchemaConfiguration configuration) |
| Number | order_id()<br> |

## StoreorderorderidGetPathParameters4Boxed
public sealed interface StoreorderorderidGetPathParameters4Boxed<br>
permits<br>
[StoreorderorderidGetPathParameters4BoxedVoid](#storeorderorderidgetpathparameters4boxedvoid),
[StoreorderorderidGetPathParameters4BoxedBoolean](#storeorderorderidgetpathparameters4boxedboolean),
[StoreorderorderidGetPathParameters4BoxedNumber](#storeorderorderidgetpathparameters4boxednumber),
[StoreorderorderidGetPathParameters4BoxedString](#storeorderorderidgetpathparameters4boxedstring),
[StoreorderorderidGetPathParameters4BoxedList](#storeorderorderidgetpathparameters4boxedlist),
[StoreorderorderidGetPathParameters4BoxedMap](#storeorderorderidgetpathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## StoreorderorderidGetPathParameters4BoxedVoid
public record StoreorderorderidGetPathParameters4BoxedVoid<br>
implements [StoreorderorderidGetPathParameters4Boxed](#storeorderorderidgetpathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetPathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetPathParameters4BoxedBoolean
public record StoreorderorderidGetPathParameters4BoxedBoolean<br>
implements [StoreorderorderidGetPathParameters4Boxed](#storeorderorderidgetpathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetPathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetPathParameters4BoxedNumber
public record StoreorderorderidGetPathParameters4BoxedNumber<br>
implements [StoreorderorderidGetPathParameters4Boxed](#storeorderorderidgetpathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetPathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetPathParameters4BoxedString
public record StoreorderorderidGetPathParameters4BoxedString<br>
implements [StoreorderorderidGetPathParameters4Boxed](#storeorderorderidgetpathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetPathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetPathParameters4BoxedList
public record StoreorderorderidGetPathParameters4BoxedList<br>
implements [StoreorderorderidGetPathParameters4Boxed](#storeorderorderidgetpathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetPathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetPathParameters4BoxedMap
public record StoreorderorderidGetPathParameters4BoxedMap<br>
implements [StoreorderorderidGetPathParameters4Boxed](#storeorderorderidgetpathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetPathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetPathParameters4
public static class StoreorderorderidGetPathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
