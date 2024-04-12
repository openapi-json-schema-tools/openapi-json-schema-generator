# FakeobjinqueryGetQueryParameters
public class FakeobjinqueryGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters1Boxed](#fakeobjinquerygetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters1BoxedMap](#fakeobjinquerygetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters1](#fakeobjinquerygetqueryparameters1)<br> schema class |
| static class | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters8](#fakeobjinquerygetqueryparameters8)<br> builder for Map payloads |
| static class | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters9](#fakeobjinquerygetqueryparameters9)<br> output class for Map payloads |
| sealed interface | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters4Boxed](#fakeobjinquerygetqueryparameters4boxed)<br> sealed interface for validated payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters4BoxedVoid](#fakeobjinquerygetqueryparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters4BoxedBoolean](#fakeobjinquerygetqueryparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters4BoxedNumber](#fakeobjinquerygetqueryparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters4BoxedString](#fakeobjinquerygetqueryparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters4BoxedList](#fakeobjinquerygetqueryparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters4BoxedMap](#fakeobjinquerygetqueryparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters4](#fakeobjinquerygetqueryparameters4)<br> schema class |

## FakeobjinqueryGetQueryParameters1Boxed
public sealed interface FakeobjinqueryGetQueryParameters1Boxed<br>
permits<br>
[FakeobjinqueryGetQueryParameters1BoxedMap](#fakeobjinquerygetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeobjinqueryGetQueryParameters1BoxedMap
public record FakeobjinqueryGetQueryParameters1BoxedMap<br>
implements [FakeobjinqueryGetQueryParameters1Boxed](#fakeobjinquerygetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetQueryParameters1BoxedMap([FakeobjinqueryGetQueryParameters9](#fakeobjinquerygetqueryparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeobjinqueryGetQueryParameters9](#fakeobjinquerygetqueryparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetQueryParameters1
public static class FakeobjinqueryGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.fakeobjinquery.get.FakeobjinqueryGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters9 validatedPayload =
    FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters1.validate(
    new FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters8()
        .mapBean(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "keyword",
                    "a"
                )
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("mapBean", [Schema0.Schema01.class](../../../paths/fakeobjinquery/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakeobjinqueryGetQueryParameters4.class](#fakeobjinquerygetqueryparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeobjinqueryGetQueryParameters9](#fakeobjinquerygetqueryparameters9) | validate([Map&lt;?, ?&gt;](#fakeobjinquerygetqueryparameters8) arg, SchemaConfiguration configuration) |
| [FakeobjinqueryGetQueryParameters1BoxedMap](#fakeobjinquerygetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakeobjinquerygetqueryparameters8) arg, SchemaConfiguration configuration) |
| [FakeobjinqueryGetQueryParameters1Boxed](#fakeobjinquerygetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakeobjinqueryGetQueryParameters8
public class FakeobjinqueryGetQueryParameters8<br>
builder for `Map<String, Map<String, @Nullable Object>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetQueryParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Map<String, @Nullable Object>> | build()<br>Returns map input that should be used with Schema.validate |
| [FakeobjinqueryGetQueryParameters8](#fakeobjinquerygetqueryparameters8) | mapBean(Map<String, @Nullable Object> value) |

## FakeobjinqueryGetQueryParameters9
public static class FakeobjinqueryGetQueryParameters9<br>
extends FrozenMap<String, Schema0.SchemaMap0>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakeobjinqueryGetQueryParameters9](#fakeobjinquerygetqueryparameters9) | of([Map<String, Map<String, ? extends @Nullable Object>>](#fakeobjinquerygetqueryparameters8) arg, SchemaConfiguration configuration) |
| [Schema0.SchemaMap0](../../../paths/fakeobjinquery/get/parameters/parameter0/Schema0.md#schemamap0) | mapBean()<br>[optional] |

## FakeobjinqueryGetQueryParameters4Boxed
public sealed interface FakeobjinqueryGetQueryParameters4Boxed<br>
permits<br>
[FakeobjinqueryGetQueryParameters4BoxedVoid](#fakeobjinquerygetqueryparameters4boxedvoid),
[FakeobjinqueryGetQueryParameters4BoxedBoolean](#fakeobjinquerygetqueryparameters4boxedboolean),
[FakeobjinqueryGetQueryParameters4BoxedNumber](#fakeobjinquerygetqueryparameters4boxednumber),
[FakeobjinqueryGetQueryParameters4BoxedString](#fakeobjinquerygetqueryparameters4boxedstring),
[FakeobjinqueryGetQueryParameters4BoxedList](#fakeobjinquerygetqueryparameters4boxedlist),
[FakeobjinqueryGetQueryParameters4BoxedMap](#fakeobjinquerygetqueryparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeobjinqueryGetQueryParameters4BoxedVoid
public record FakeobjinqueryGetQueryParameters4BoxedVoid<br>
implements [FakeobjinqueryGetQueryParameters4Boxed](#fakeobjinquerygetqueryparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetQueryParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetQueryParameters4BoxedBoolean
public record FakeobjinqueryGetQueryParameters4BoxedBoolean<br>
implements [FakeobjinqueryGetQueryParameters4Boxed](#fakeobjinquerygetqueryparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetQueryParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetQueryParameters4BoxedNumber
public record FakeobjinqueryGetQueryParameters4BoxedNumber<br>
implements [FakeobjinqueryGetQueryParameters4Boxed](#fakeobjinquerygetqueryparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetQueryParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetQueryParameters4BoxedString
public record FakeobjinqueryGetQueryParameters4BoxedString<br>
implements [FakeobjinqueryGetQueryParameters4Boxed](#fakeobjinquerygetqueryparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetQueryParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetQueryParameters4BoxedList
public record FakeobjinqueryGetQueryParameters4BoxedList<br>
implements [FakeobjinqueryGetQueryParameters4Boxed](#fakeobjinquerygetqueryparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetQueryParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetQueryParameters4BoxedMap
public record FakeobjinqueryGetQueryParameters4BoxedMap<br>
implements [FakeobjinqueryGetQueryParameters4Boxed](#fakeobjinquerygetqueryparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetQueryParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetQueryParameters4
public static class FakeobjinqueryGetQueryParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
