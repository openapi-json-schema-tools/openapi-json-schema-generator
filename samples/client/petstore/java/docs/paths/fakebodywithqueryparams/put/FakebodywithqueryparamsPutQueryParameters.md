# FakebodywithqueryparamsPutQueryParameters
public class FakebodywithqueryparamsPutQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters1Boxed](#fakebodywithqueryparamsputqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters1BoxedMap](#fakebodywithqueryparamsputqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters1](#fakebodywithqueryparamsputqueryparameters1)<br> schema class |
| static class | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters8](#fakebodywithqueryparamsputqueryparameters8)<br> builder for Map payloads |
| static class | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters9](#fakebodywithqueryparamsputqueryparameters9)<br> output class for Map payloads |
| sealed interface | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters4Boxed](#fakebodywithqueryparamsputqueryparameters4boxed)<br> sealed interface for validated payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters4BoxedVoid](#fakebodywithqueryparamsputqueryparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters4BoxedBoolean](#fakebodywithqueryparamsputqueryparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters4BoxedNumber](#fakebodywithqueryparamsputqueryparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters4BoxedString](#fakebodywithqueryparamsputqueryparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters4BoxedList](#fakebodywithqueryparamsputqueryparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters4BoxedMap](#fakebodywithqueryparamsputqueryparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters4](#fakebodywithqueryparamsputqueryparameters4)<br> schema class |

## FakebodywithqueryparamsPutQueryParameters1Boxed
public sealed interface FakebodywithqueryparamsPutQueryParameters1Boxed<br>
permits<br>
[FakebodywithqueryparamsPutQueryParameters1BoxedMap](#fakebodywithqueryparamsputqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakebodywithqueryparamsPutQueryParameters1BoxedMap
public record FakebodywithqueryparamsPutQueryParameters1BoxedMap<br>
implements [FakebodywithqueryparamsPutQueryParameters1Boxed](#fakebodywithqueryparamsputqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutQueryParameters1BoxedMap([FakebodywithqueryparamsPutQueryParameters9](#fakebodywithqueryparamsputqueryparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakebodywithqueryparamsPutQueryParameters9](#fakebodywithqueryparamsputqueryparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutQueryParameters1
public static class FakebodywithqueryparamsPutQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.FakebodywithqueryparamsPutQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters9 validatedPayload =
    FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters1.validate(
    new FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters8()
        .query("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("query", [Schema0.Schema01.class](../../../paths/fakebodywithqueryparams/put/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"query"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakebodywithqueryparamsPutQueryParameters4.class](#fakebodywithqueryparamsputqueryparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakebodywithqueryparamsPutQueryParameters9](#fakebodywithqueryparamsputqueryparameters9) | validate([Map&lt;?, ?&gt;](#fakebodywithqueryparamsputqueryparameters8) arg, SchemaConfiguration configuration) |
| [FakebodywithqueryparamsPutQueryParameters1BoxedMap](#fakebodywithqueryparamsputqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakebodywithqueryparamsputqueryparameters8) arg, SchemaConfiguration configuration) |
| [FakebodywithqueryparamsPutQueryParameters1Boxed](#fakebodywithqueryparamsputqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakebodywithqueryparamsPutQueryParameters10
public class FakebodywithqueryparamsPutQueryParameters10<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutQueryParameters10(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## FakebodywithqueryparamsPutQueryParameters8
public class FakebodywithqueryparamsPutQueryParameters8<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutQueryParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakebodywithqueryparamsPutQueryParameters10](#fakebodywithqueryparamsputqueryparameters10) | query(String value) |

## FakebodywithqueryparamsPutQueryParameters9
public static class FakebodywithqueryparamsPutQueryParameters9<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakebodywithqueryparamsPutQueryParameters9](#fakebodywithqueryparamsputqueryparameters9) | of([Map<String, String>](#fakebodywithqueryparamsputqueryparameters8) arg, SchemaConfiguration configuration) |
| String | query()<br> |

## FakebodywithqueryparamsPutQueryParameters4Boxed
public sealed interface FakebodywithqueryparamsPutQueryParameters4Boxed<br>
permits<br>
[FakebodywithqueryparamsPutQueryParameters4BoxedVoid](#fakebodywithqueryparamsputqueryparameters4boxedvoid),
[FakebodywithqueryparamsPutQueryParameters4BoxedBoolean](#fakebodywithqueryparamsputqueryparameters4boxedboolean),
[FakebodywithqueryparamsPutQueryParameters4BoxedNumber](#fakebodywithqueryparamsputqueryparameters4boxednumber),
[FakebodywithqueryparamsPutQueryParameters4BoxedString](#fakebodywithqueryparamsputqueryparameters4boxedstring),
[FakebodywithqueryparamsPutQueryParameters4BoxedList](#fakebodywithqueryparamsputqueryparameters4boxedlist),
[FakebodywithqueryparamsPutQueryParameters4BoxedMap](#fakebodywithqueryparamsputqueryparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakebodywithqueryparamsPutQueryParameters4BoxedVoid
public record FakebodywithqueryparamsPutQueryParameters4BoxedVoid<br>
implements [FakebodywithqueryparamsPutQueryParameters4Boxed](#fakebodywithqueryparamsputqueryparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutQueryParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutQueryParameters4BoxedBoolean
public record FakebodywithqueryparamsPutQueryParameters4BoxedBoolean<br>
implements [FakebodywithqueryparamsPutQueryParameters4Boxed](#fakebodywithqueryparamsputqueryparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutQueryParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutQueryParameters4BoxedNumber
public record FakebodywithqueryparamsPutQueryParameters4BoxedNumber<br>
implements [FakebodywithqueryparamsPutQueryParameters4Boxed](#fakebodywithqueryparamsputqueryparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutQueryParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutQueryParameters4BoxedString
public record FakebodywithqueryparamsPutQueryParameters4BoxedString<br>
implements [FakebodywithqueryparamsPutQueryParameters4Boxed](#fakebodywithqueryparamsputqueryparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutQueryParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutQueryParameters4BoxedList
public record FakebodywithqueryparamsPutQueryParameters4BoxedList<br>
implements [FakebodywithqueryparamsPutQueryParameters4Boxed](#fakebodywithqueryparamsputqueryparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutQueryParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutQueryParameters4BoxedMap
public record FakebodywithqueryparamsPutQueryParameters4BoxedMap<br>
implements [FakebodywithqueryparamsPutQueryParameters4Boxed](#fakebodywithqueryparamsputqueryparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutQueryParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutQueryParameters4
public static class FakebodywithqueryparamsPutQueryParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
