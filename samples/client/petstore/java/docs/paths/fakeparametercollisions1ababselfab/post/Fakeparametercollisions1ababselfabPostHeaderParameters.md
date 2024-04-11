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
| static class | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParametersMapBuilder](#fakeparametercollisions1ababselfabpostheaderparametersmapbuilder)<br> builder for Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParametersMap](#fakeparametercollisions1ababselfabpostheaderparametersmap)<br> output class for Map payloads |
| sealed interface | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedVoid](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedBoolean](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedNumber](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedString](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedList](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedMap](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostadditionalProperties](#fakeparametercollisions1ababselfabpostadditionalproperties)<br> schema class |

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
| Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap([Fakeparametercollisions1ababselfabPostHeaderParametersMap](#fakeparametercollisions1ababselfabpostheaderparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostHeaderParametersMap](#fakeparametercollisions1ababselfabpostheaderparametersmap) | data()<br>validated payload |
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
Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParametersMap validatedPayload =
    Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters1.validate(
    new Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [Fakeparametercollisions1ababselfabPostadditionalProperties.class](#fakeparametercollisions1ababselfabpostadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostHeaderParametersMap](#fakeparametercollisions1ababselfabpostheaderparametersmap) | validate([Map&lt;?, ?&gt;](#fakeparametercollisions1ababselfabpostheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostHeaderParameters1BoxedMap](#fakeparametercollisions1ababselfabpostheaderparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakeparametercollisions1ababselfabpostheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostHeaderParameters1Boxed](#fakeparametercollisions1ababselfabpostheaderparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Fakeparametercollisions1ababselfabPostHeaderParametersMapBuilder
public class Fakeparametercollisions1ababselfabPostHeaderParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostHeaderParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Fakeparametercollisions1ababselfabPostHeaderParametersMapBuilder](#fakeparametercollisions1ababselfabpostheaderparametersmapbuilder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostHeaderParametersMapBuilder](#fakeparametercollisions1ababselfabpostheaderparametersmapbuilder) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostHeaderParametersMapBuilder](#fakeparametercollisions1ababselfabpostheaderparametersmapbuilder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostHeaderParametersMapBuilder](#fakeparametercollisions1ababselfabpostheaderparametersmapbuilder) | self(String value) |

## Fakeparametercollisions1ababselfabPostHeaderParametersMap
public static class Fakeparametercollisions1ababselfabPostHeaderParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Fakeparametercollisions1ababselfabPostHeaderParametersMap](#fakeparametercollisions1ababselfabpostheaderparametersmap) | of([Map<String, ? extends @Nullable Object>](#fakeparametercollisions1ababselfabpostheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | aB()<br>[optional] |
| String | self()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["1"], instance["A-B"],  |

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed
public sealed interface Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed<br>
permits<br>
[Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedVoid](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedvoid),
[Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedBoolean](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedboolean),
[Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedNumber](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxednumber),
[Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedString](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedstring),
[Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedList](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedlist),
[Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedMap](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedVoid
public record Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedVoid<br>
implements [Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedBoolean
public record Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedBoolean<br>
implements [Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedNumber
public record Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedNumber<br>
implements [Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedString
public record Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedString<br>
implements [Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedList
public record Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedList<br>
implements [Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedMap
public record Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedMap<br>
implements [Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostadditionalProperties
public static class Fakeparametercollisions1ababselfabPostadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
