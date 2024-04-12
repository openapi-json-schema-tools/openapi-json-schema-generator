# Fakeparametercollisions1ababselfabPostQueryParameters
public class Fakeparametercollisions1ababselfabPostQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters1Boxed](#fakeparametercollisions1ababselfabpostqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap](#fakeparametercollisions1ababselfabpostqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters1](#fakeparametercollisions1ababselfabpostqueryparameters1)<br> schema class |
| static class | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters12](#fakeparametercollisions1ababselfabpostqueryparameters12)<br> builder for Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters13](#fakeparametercollisions1ababselfabpostqueryparameters13)<br> output class for Map payloads |
| sealed interface | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters8Boxed](#fakeparametercollisions1ababselfabpostqueryparameters8boxed)<br> sealed interface for validated payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters8BoxedVoid](#fakeparametercollisions1ababselfabpostqueryparameters8boxedvoid)<br> boxed class to store validated null payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters8BoxedBoolean](#fakeparametercollisions1ababselfabpostqueryparameters8boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters8BoxedNumber](#fakeparametercollisions1ababselfabpostqueryparameters8boxednumber)<br> boxed class to store validated Number payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters8BoxedString](#fakeparametercollisions1ababselfabpostqueryparameters8boxedstring)<br> boxed class to store validated String payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters8BoxedList](#fakeparametercollisions1ababselfabpostqueryparameters8boxedlist)<br> boxed class to store validated List payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters8BoxedMap](#fakeparametercollisions1ababselfabpostqueryparameters8boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters8](#fakeparametercollisions1ababselfabpostqueryparameters8)<br> schema class |

## Fakeparametercollisions1ababselfabPostQueryParameters1Boxed
public sealed interface Fakeparametercollisions1ababselfabPostQueryParameters1Boxed<br>
permits<br>
[Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap](#fakeparametercollisions1ababselfabpostqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap
public record Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap<br>
implements [Fakeparametercollisions1ababselfabPostQueryParameters1Boxed](#fakeparametercollisions1ababselfabpostqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap([Fakeparametercollisions1ababselfabPostQueryParameters13](#fakeparametercollisions1ababselfabpostqueryparameters13) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostQueryParameters13](#fakeparametercollisions1ababselfabpostqueryparameters13) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostQueryParameters1
public static class Fakeparametercollisions1ababselfabPostQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters13 validatedPayload =
    Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters1.validate(
    new Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters12()
        .positive1("a")

        .aB("a")

        .Ab("a")

        .aHyphenMinusB("a")

        .self("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("1", [Schema0.Schema01.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter0/Schema0.md#schema01)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("aB", [Schema1.Schema11.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter1/Schema1.md#schema11)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("Ab", [Schema2.Schema21.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter2/Schema2.md#schema21)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("A-B", [Schema4.Schema41.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter4/Schema4.md#schema41)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("self", [Schema3.Schema31.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter3/Schema3.md#schema31))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [Fakeparametercollisions1ababselfabPostQueryParameters8.class](#fakeparametercollisions1ababselfabpostqueryparameters8) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostQueryParameters13](#fakeparametercollisions1ababselfabpostqueryparameters13) | validate([Map&lt;?, ?&gt;](#fakeparametercollisions1ababselfabpostqueryparameters12) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap](#fakeparametercollisions1ababselfabpostqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakeparametercollisions1ababselfabpostqueryparameters12) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostQueryParameters1Boxed](#fakeparametercollisions1ababselfabpostqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Fakeparametercollisions1ababselfabPostQueryParameters12
public class Fakeparametercollisions1ababselfabPostQueryParameters12<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostQueryParameters12()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Fakeparametercollisions1ababselfabPostQueryParameters12](#fakeparametercollisions1ababselfabpostqueryparameters12) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostQueryParameters12](#fakeparametercollisions1ababselfabpostqueryparameters12) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostQueryParameters12](#fakeparametercollisions1ababselfabpostqueryparameters12) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostQueryParameters12](#fakeparametercollisions1ababselfabpostqueryparameters12) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostQueryParameters12](#fakeparametercollisions1ababselfabpostqueryparameters12) | self(String value) |

## Fakeparametercollisions1ababselfabPostQueryParameters13
public static class Fakeparametercollisions1ababselfabPostQueryParameters13<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Fakeparametercollisions1ababselfabPostQueryParameters13](#fakeparametercollisions1ababselfabpostqueryparameters13) | of([Map<String, ? extends @Nullable Object>](#fakeparametercollisions1ababselfabpostqueryparameters12) arg, SchemaConfiguration configuration) |
| String | aB()<br>[optional] |
| String | Ab()<br>[optional] |
| String | self()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["1"], instance["A-B"],  |

## Fakeparametercollisions1ababselfabPostQueryParameters8Boxed
public sealed interface Fakeparametercollisions1ababselfabPostQueryParameters8Boxed<br>
permits<br>
[Fakeparametercollisions1ababselfabPostQueryParameters8BoxedVoid](#fakeparametercollisions1ababselfabpostqueryparameters8boxedvoid),
[Fakeparametercollisions1ababselfabPostQueryParameters8BoxedBoolean](#fakeparametercollisions1ababselfabpostqueryparameters8boxedboolean),
[Fakeparametercollisions1ababselfabPostQueryParameters8BoxedNumber](#fakeparametercollisions1ababselfabpostqueryparameters8boxednumber),
[Fakeparametercollisions1ababselfabPostQueryParameters8BoxedString](#fakeparametercollisions1ababselfabpostqueryparameters8boxedstring),
[Fakeparametercollisions1ababselfabPostQueryParameters8BoxedList](#fakeparametercollisions1ababselfabpostqueryparameters8boxedlist),
[Fakeparametercollisions1ababselfabPostQueryParameters8BoxedMap](#fakeparametercollisions1ababselfabpostqueryparameters8boxedmap)

sealed interface that stores validated payloads using boxed classes

## Fakeparametercollisions1ababselfabPostQueryParameters8BoxedVoid
public record Fakeparametercollisions1ababselfabPostQueryParameters8BoxedVoid<br>
implements [Fakeparametercollisions1ababselfabPostQueryParameters8Boxed](#fakeparametercollisions1ababselfabpostqueryparameters8boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostQueryParameters8BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostQueryParameters8BoxedBoolean
public record Fakeparametercollisions1ababselfabPostQueryParameters8BoxedBoolean<br>
implements [Fakeparametercollisions1ababselfabPostQueryParameters8Boxed](#fakeparametercollisions1ababselfabpostqueryparameters8boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostQueryParameters8BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostQueryParameters8BoxedNumber
public record Fakeparametercollisions1ababselfabPostQueryParameters8BoxedNumber<br>
implements [Fakeparametercollisions1ababselfabPostQueryParameters8Boxed](#fakeparametercollisions1ababselfabpostqueryparameters8boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostQueryParameters8BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostQueryParameters8BoxedString
public record Fakeparametercollisions1ababselfabPostQueryParameters8BoxedString<br>
implements [Fakeparametercollisions1ababselfabPostQueryParameters8Boxed](#fakeparametercollisions1ababselfabpostqueryparameters8boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostQueryParameters8BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostQueryParameters8BoxedList
public record Fakeparametercollisions1ababselfabPostQueryParameters8BoxedList<br>
implements [Fakeparametercollisions1ababselfabPostQueryParameters8Boxed](#fakeparametercollisions1ababselfabpostqueryparameters8boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostQueryParameters8BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostQueryParameters8BoxedMap
public record Fakeparametercollisions1ababselfabPostQueryParameters8BoxedMap<br>
implements [Fakeparametercollisions1ababselfabPostQueryParameters8Boxed](#fakeparametercollisions1ababselfabpostqueryparameters8boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostQueryParameters8BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostQueryParameters8
public static class Fakeparametercollisions1ababselfabPostQueryParameters8<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
