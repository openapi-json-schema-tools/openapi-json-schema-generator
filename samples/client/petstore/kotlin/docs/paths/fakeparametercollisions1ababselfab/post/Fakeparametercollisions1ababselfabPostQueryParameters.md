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
| static class | [Fakeparametercollisions1ababselfabPostQueryParameters.QueryParametersMapBuilder](#queryparametersmapbuilder)<br> builder for Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostQueryParameters.QueryParametersMap](#queryparametersmap)<br> output class for Map payloads |
| sealed interface | [Fakeparametercollisions1ababselfabPostQueryParameters.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [Fakeparametercollisions1ababselfabPostQueryParameters.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostQueryParameters.AdditionalProperties](#additionalproperties)<br> schema class |

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
| Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap([QueryParametersMap](#queryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap](#queryparametersmap) | data()<br>validated payload |
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
Fakeparametercollisions1ababselfabPostQueryParameters.QueryParametersMap validatedPayload =
    Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters1.validate(
    new Fakeparametercollisions1ababselfabPostQueryParameters.QueryParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap](#queryparametersmap) | validate([Map&lt;?, ?&gt;](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostQueryParameters1BoxedMap](#fakeparametercollisions1ababselfabpostqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostQueryParameters1Boxed](#fakeparametercollisions1ababselfabpostqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## QueryParametersMapBuilder
public class QueryParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [QueryParametersMapBuilder](#queryparametersmapbuilder) | positive1(String value) |
| [QueryParametersMapBuilder](#queryparametersmapbuilder) | aB(String value) |
| [QueryParametersMapBuilder](#queryparametersmapbuilder) | Ab(String value) |
| [QueryParametersMapBuilder](#queryparametersmapbuilder) | aHyphenMinusB(String value) |
| [QueryParametersMapBuilder](#queryparametersmapbuilder) | self(String value) |

## QueryParametersMap
public static class QueryParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [QueryParametersMap](#queryparametersmap) | of([Map<String, ? extends @Nullable Object>](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | aB()<br>[optional] |
| String | Ab()<br>[optional] |
| String | self()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["1"], instance["A-B"],  |

## AdditionalPropertiesBoxed
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public record AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedBoolean
public record AdditionalPropertiesBoxedBoolean<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedNumber
public record AdditionalPropertiesBoxedNumber<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedString
public record AdditionalPropertiesBoxedString<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedList
public record AdditionalPropertiesBoxedList<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedMap
public record AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
