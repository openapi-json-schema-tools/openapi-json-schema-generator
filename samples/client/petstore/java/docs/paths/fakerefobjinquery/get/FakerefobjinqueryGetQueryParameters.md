# FakerefobjinqueryGetQueryParameters
public class FakerefobjinqueryGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters1Boxed](#fakerefobjinquerygetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters1BoxedMap](#fakerefobjinquerygetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters1](#fakerefobjinquerygetqueryparameters1)<br> schema class |
| static class | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters8](#fakerefobjinquerygetqueryparameters8)<br> builder for Map payloads |
| static class | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters9](#fakerefobjinquerygetqueryparameters9)<br> output class for Map payloads |
| sealed interface | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters4Boxed](#fakerefobjinquerygetqueryparameters4boxed)<br> sealed interface for validated payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters4BoxedVoid](#fakerefobjinquerygetqueryparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters4BoxedBoolean](#fakerefobjinquerygetqueryparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters4BoxedNumber](#fakerefobjinquerygetqueryparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters4BoxedString](#fakerefobjinquerygetqueryparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters4BoxedList](#fakerefobjinquerygetqueryparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters4BoxedMap](#fakerefobjinquerygetqueryparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters4](#fakerefobjinquerygetqueryparameters4)<br> schema class |

## FakerefobjinqueryGetQueryParameters1Boxed
public sealed interface FakerefobjinqueryGetQueryParameters1Boxed<br>
permits<br>
[FakerefobjinqueryGetQueryParameters1BoxedMap](#fakerefobjinquerygetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakerefobjinqueryGetQueryParameters1BoxedMap
public record FakerefobjinqueryGetQueryParameters1BoxedMap<br>
implements [FakerefobjinqueryGetQueryParameters1Boxed](#fakerefobjinquerygetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetQueryParameters1BoxedMap([FakerefobjinqueryGetQueryParameters9](#fakerefobjinquerygetqueryparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakerefobjinqueryGetQueryParameters9](#fakerefobjinquerygetqueryparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetQueryParameters1
public static class FakerefobjinqueryGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.fakerefobjinquery.get.FakerefobjinqueryGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters9 validatedPayload =
    FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters1.validate(
    new FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters8()
        .mapBean(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "bar",
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("mapBean", [Foo.Foo1.class](../../../components/schemas/Foo.md#foo1))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakerefobjinqueryGetQueryParameters4.class](#fakerefobjinquerygetqueryparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakerefobjinqueryGetQueryParameters9](#fakerefobjinquerygetqueryparameters9) | validate([Map&lt;?, ?&gt;](#fakerefobjinquerygetqueryparameters8) arg, SchemaConfiguration configuration) |
| [FakerefobjinqueryGetQueryParameters1BoxedMap](#fakerefobjinquerygetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakerefobjinquerygetqueryparameters8) arg, SchemaConfiguration configuration) |
| [FakerefobjinqueryGetQueryParameters1Boxed](#fakerefobjinquerygetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakerefobjinqueryGetQueryParameters8
public class FakerefobjinqueryGetQueryParameters8<br>
builder for `Map<String, Map<String, @Nullable Object>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetQueryParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Map<String, @Nullable Object>> | build()<br>Returns map input that should be used with Schema.validate |
| [FakerefobjinqueryGetQueryParameters8](#fakerefobjinquerygetqueryparameters8) | mapBean(Map<String, @Nullable Object> value) |

## FakerefobjinqueryGetQueryParameters9
public static class FakerefobjinqueryGetQueryParameters9<br>
extends FrozenMap<String, Foo.FooMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakerefobjinqueryGetQueryParameters9](#fakerefobjinquerygetqueryparameters9) | of([Map<String, Map<String, ? extends @Nullable Object>>](#fakerefobjinquerygetqueryparameters8) arg, SchemaConfiguration configuration) |
| [Foo.FooMap](../../../components/schemas/Foo.md#foomap) | mapBean()<br>[optional] |

## FakerefobjinqueryGetQueryParameters4Boxed
public sealed interface FakerefobjinqueryGetQueryParameters4Boxed<br>
permits<br>
[FakerefobjinqueryGetQueryParameters4BoxedVoid](#fakerefobjinquerygetqueryparameters4boxedvoid),
[FakerefobjinqueryGetQueryParameters4BoxedBoolean](#fakerefobjinquerygetqueryparameters4boxedboolean),
[FakerefobjinqueryGetQueryParameters4BoxedNumber](#fakerefobjinquerygetqueryparameters4boxednumber),
[FakerefobjinqueryGetQueryParameters4BoxedString](#fakerefobjinquerygetqueryparameters4boxedstring),
[FakerefobjinqueryGetQueryParameters4BoxedList](#fakerefobjinquerygetqueryparameters4boxedlist),
[FakerefobjinqueryGetQueryParameters4BoxedMap](#fakerefobjinquerygetqueryparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakerefobjinqueryGetQueryParameters4BoxedVoid
public record FakerefobjinqueryGetQueryParameters4BoxedVoid<br>
implements [FakerefobjinqueryGetQueryParameters4Boxed](#fakerefobjinquerygetqueryparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetQueryParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetQueryParameters4BoxedBoolean
public record FakerefobjinqueryGetQueryParameters4BoxedBoolean<br>
implements [FakerefobjinqueryGetQueryParameters4Boxed](#fakerefobjinquerygetqueryparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetQueryParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetQueryParameters4BoxedNumber
public record FakerefobjinqueryGetQueryParameters4BoxedNumber<br>
implements [FakerefobjinqueryGetQueryParameters4Boxed](#fakerefobjinquerygetqueryparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetQueryParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetQueryParameters4BoxedString
public record FakerefobjinqueryGetQueryParameters4BoxedString<br>
implements [FakerefobjinqueryGetQueryParameters4Boxed](#fakerefobjinquerygetqueryparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetQueryParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetQueryParameters4BoxedList
public record FakerefobjinqueryGetQueryParameters4BoxedList<br>
implements [FakerefobjinqueryGetQueryParameters4Boxed](#fakerefobjinquerygetqueryparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetQueryParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetQueryParameters4BoxedMap
public record FakerefobjinqueryGetQueryParameters4BoxedMap<br>
implements [FakerefobjinqueryGetQueryParameters4Boxed](#fakerefobjinquerygetqueryparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetQueryParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetQueryParameters4
public static class FakerefobjinqueryGetQueryParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
