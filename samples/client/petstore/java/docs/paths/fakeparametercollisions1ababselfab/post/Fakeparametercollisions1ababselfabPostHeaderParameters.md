# Fakeparametercollisions1ababselfabPostHeaderParameters
public class Fakeparametercollisions1ababselfabPostHeaderParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters1Boxed](#fakeparametercollisions1ababselfabpostheaderparameters1boxed)<br> sealed interface for validated payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap](#fakeparametercollisions1ababselfabpostheaderparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters1](#fakeparametercollisions1ababselfabpostheaderparameters1)<br> schema class |
| static class | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters11](#fakeparametercollisions1ababselfabpostheaderparameters11)<br> builder for Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters12](#fakeparametercollisions1ababselfabpostheaderparameters12)<br> output class for Map payloads |
| sealed interface | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters7Boxed](#fakeparametercollisions1ababselfabpostheaderparameters7boxed)<br> sealed interface for validated payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedVoid](#fakeparametercollisions1ababselfabpostheaderparameters7boxedvoid)<br> boxed class to store validated null payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedBoolean](#fakeparametercollisions1ababselfabpostheaderparameters7boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedNumber](#fakeparametercollisions1ababselfabpostheaderparameters7boxednumber)<br> boxed class to store validated Number payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedString](#fakeparametercollisions1ababselfabpostheaderparameters7boxedstring)<br> boxed class to store validated String payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedList](#fakeparametercollisions1ababselfabpostheaderparameters7boxedlist)<br> boxed class to store validated List payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedMap](#fakeparametercollisions1ababselfabpostheaderparameters7boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters7](#fakeparametercollisions1ababselfabpostheaderparameters7)<br> schema class |

## Fakeparametercollisions1ababselfabPostHeaderParameters1Boxed
public sealed interface Fakeparametercollisions1ababselfabPostHeaderParameters1Boxed<br>
permits<br>
[Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap](#fakeparametercollisions1ababselfabpostheaderparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap
public record Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap<br>
implements [Fakeparametercollisions1ababselfabPostHeaderParameters1Boxed](#fakeparametercollisions1ababselfabpostheaderparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap([Fakeparametercollisions1ababselfabPostHeaderParameters12](#fakeparametercollisions1ababselfabpostheaderparameters12) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostHeaderParameters12](#fakeparametercollisions1ababselfabpostheaderparameters12) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostHeaderParameters1
public static class Fakeparametercollisions1ababselfabPostHeaderParameters1<br>
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
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostHeaderParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters12 validatedPayload =
    Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters1.validate(
    new Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters11()
        .positive1("a")

        .aB("a")

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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("1", [Schema5.Schema51.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter5/Schema5.md#schema51)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("aB", [Schema6.Schema61.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter6/Schema6.md#schema61)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("A-B", [Schema8.Schema81.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter8/Schema8.md#schema81)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("self", [Schema7.Schema71.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter7/Schema7.md#schema71))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [Fakeparametercollisions1ababselfabPostHeaderParameters7.class](#fakeparametercollisions1ababselfabpostheaderparameters7) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostHeaderParameters12](#fakeparametercollisions1ababselfabpostheaderparameters12) | validate([Map&lt;?, ?&gt;](#fakeparametercollisions1ababselfabpostheaderparameters11) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap](#fakeparametercollisions1ababselfabpostheaderparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakeparametercollisions1ababselfabpostheaderparameters11) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostHeaderParameters1Boxed](#fakeparametercollisions1ababselfabpostheaderparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Fakeparametercollisions1ababselfabPostHeaderParameters11
public class Fakeparametercollisions1ababselfabPostHeaderParameters11<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostHeaderParameters11()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Fakeparametercollisions1ababselfabPostHeaderParameters11](#fakeparametercollisions1ababselfabpostheaderparameters11) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostHeaderParameters11](#fakeparametercollisions1ababselfabpostheaderparameters11) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostHeaderParameters11](#fakeparametercollisions1ababselfabpostheaderparameters11) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostHeaderParameters11](#fakeparametercollisions1ababselfabpostheaderparameters11) | self(String value) |

## Fakeparametercollisions1ababselfabPostHeaderParameters12
public static class Fakeparametercollisions1ababselfabPostHeaderParameters12<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Fakeparametercollisions1ababselfabPostHeaderParameters12](#fakeparametercollisions1ababselfabpostheaderparameters12) | of([Map<String, ? extends @Nullable Object>](#fakeparametercollisions1ababselfabpostheaderparameters11) arg, SchemaConfiguration configuration) |
| String | aB()<br>[optional] |
| String | self()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["1"], instance["A-B"],  |

## Fakeparametercollisions1ababselfabPostHeaderParameters7Boxed
public sealed interface Fakeparametercollisions1ababselfabPostHeaderParameters7Boxed<br>
permits<br>
[Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedVoid](#fakeparametercollisions1ababselfabpostheaderparameters7boxedvoid),
[Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedBoolean](#fakeparametercollisions1ababselfabpostheaderparameters7boxedboolean),
[Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedNumber](#fakeparametercollisions1ababselfabpostheaderparameters7boxednumber),
[Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedString](#fakeparametercollisions1ababselfabpostheaderparameters7boxedstring),
[Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedList](#fakeparametercollisions1ababselfabpostheaderparameters7boxedlist),
[Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedMap](#fakeparametercollisions1ababselfabpostheaderparameters7boxedmap)

sealed interface that stores validated payloads using boxed classes

## Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedVoid
public record Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedVoid<br>
implements [Fakeparametercollisions1ababselfabPostHeaderParameters7Boxed](#fakeparametercollisions1ababselfabpostheaderparameters7boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedBoolean
public record Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedBoolean<br>
implements [Fakeparametercollisions1ababselfabPostHeaderParameters7Boxed](#fakeparametercollisions1ababselfabpostheaderparameters7boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedNumber
public record Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedNumber<br>
implements [Fakeparametercollisions1ababselfabPostHeaderParameters7Boxed](#fakeparametercollisions1ababselfabpostheaderparameters7boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedString
public record Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedString<br>
implements [Fakeparametercollisions1ababselfabPostHeaderParameters7Boxed](#fakeparametercollisions1ababselfabpostheaderparameters7boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedList
public record Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedList<br>
implements [Fakeparametercollisions1ababselfabPostHeaderParameters7Boxed](#fakeparametercollisions1ababselfabpostheaderparameters7boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedMap
public record Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedMap<br>
implements [Fakeparametercollisions1ababselfabPostHeaderParameters7Boxed](#fakeparametercollisions1ababselfabpostheaderparameters7boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostHeaderParameters7BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostHeaderParameters7
public static class Fakeparametercollisions1ababselfabPostHeaderParameters7<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
