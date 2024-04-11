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
| static class | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParametersMapBuilder](#fakebodywithqueryparamsputqueryparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParametersMap](#fakebodywithqueryparamsputqueryparametersmap)<br> output class for Map payloads |
| sealed interface | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutadditionalPropertiesBoxed](#fakebodywithqueryparamsputadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutadditionalPropertiesBoxedVoid](#fakebodywithqueryparamsputadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutadditionalPropertiesBoxedBoolean](#fakebodywithqueryparamsputadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutadditionalPropertiesBoxedNumber](#fakebodywithqueryparamsputadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutadditionalPropertiesBoxedString](#fakebodywithqueryparamsputadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutadditionalPropertiesBoxedList](#fakebodywithqueryparamsputadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutadditionalPropertiesBoxedMap](#fakebodywithqueryparamsputadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutadditionalProperties](#fakebodywithqueryparamsputadditionalproperties)<br> schema class |

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
| FakebodywithqueryparamsPutQueryParameters1BoxedMap([FakebodywithqueryparamsPutQueryParametersMap](#fakebodywithqueryparamsputqueryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakebodywithqueryparamsPutQueryParametersMap](#fakebodywithqueryparamsputqueryparametersmap) | data()<br>validated payload |
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
FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParametersMap validatedPayload =
    FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters1.validate(
    new FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [FakebodywithqueryparamsPutadditionalProperties.class](#fakebodywithqueryparamsputadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakebodywithqueryparamsPutQueryParametersMap](#fakebodywithqueryparamsputqueryparametersmap) | validate([Map&lt;?, ?&gt;](#fakebodywithqueryparamsputqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakebodywithqueryparamsPutQueryParameters1BoxedMap](#fakebodywithqueryparamsputqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakebodywithqueryparamsputqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakebodywithqueryparamsPutQueryParameters1Boxed](#fakebodywithqueryparamsputqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakebodywithqueryparamsPutQueryParametersMap0Builder
public class FakebodywithqueryparamsPutQueryParametersMap0Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutQueryParametersMap0Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## FakebodywithqueryparamsPutQueryParametersMapBuilder
public class FakebodywithqueryparamsPutQueryParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakebodywithqueryparamsPutQueryParametersMap0Builder](#fakebodywithqueryparamsputqueryparametersmap0builder) | query(String value) |

## FakebodywithqueryparamsPutQueryParametersMap
public static class FakebodywithqueryparamsPutQueryParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakebodywithqueryparamsPutQueryParametersMap](#fakebodywithqueryparamsputqueryparametersmap) | of([Map<String, String>](#fakebodywithqueryparamsputqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | query()<br> |

## FakebodywithqueryparamsPutadditionalPropertiesBoxed
public sealed interface FakebodywithqueryparamsPutadditionalPropertiesBoxed<br>
permits<br>
[FakebodywithqueryparamsPutadditionalPropertiesBoxedVoid](#fakebodywithqueryparamsputadditionalpropertiesboxedvoid),
[FakebodywithqueryparamsPutadditionalPropertiesBoxedBoolean](#fakebodywithqueryparamsputadditionalpropertiesboxedboolean),
[FakebodywithqueryparamsPutadditionalPropertiesBoxedNumber](#fakebodywithqueryparamsputadditionalpropertiesboxednumber),
[FakebodywithqueryparamsPutadditionalPropertiesBoxedString](#fakebodywithqueryparamsputadditionalpropertiesboxedstring),
[FakebodywithqueryparamsPutadditionalPropertiesBoxedList](#fakebodywithqueryparamsputadditionalpropertiesboxedlist),
[FakebodywithqueryparamsPutadditionalPropertiesBoxedMap](#fakebodywithqueryparamsputadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## FakebodywithqueryparamsPutadditionalPropertiesBoxedVoid
public record FakebodywithqueryparamsPutadditionalPropertiesBoxedVoid<br>
implements [FakebodywithqueryparamsPutadditionalPropertiesBoxed](#fakebodywithqueryparamsputadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutadditionalPropertiesBoxedBoolean
public record FakebodywithqueryparamsPutadditionalPropertiesBoxedBoolean<br>
implements [FakebodywithqueryparamsPutadditionalPropertiesBoxed](#fakebodywithqueryparamsputadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutadditionalPropertiesBoxedNumber
public record FakebodywithqueryparamsPutadditionalPropertiesBoxedNumber<br>
implements [FakebodywithqueryparamsPutadditionalPropertiesBoxed](#fakebodywithqueryparamsputadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutadditionalPropertiesBoxedString
public record FakebodywithqueryparamsPutadditionalPropertiesBoxedString<br>
implements [FakebodywithqueryparamsPutadditionalPropertiesBoxed](#fakebodywithqueryparamsputadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutadditionalPropertiesBoxedList
public record FakebodywithqueryparamsPutadditionalPropertiesBoxedList<br>
implements [FakebodywithqueryparamsPutadditionalPropertiesBoxed](#fakebodywithqueryparamsputadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutadditionalPropertiesBoxedMap
public record FakebodywithqueryparamsPutadditionalPropertiesBoxedMap<br>
implements [FakebodywithqueryparamsPutadditionalPropertiesBoxed](#fakebodywithqueryparamsputadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakebodywithqueryparamsPutadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakebodywithqueryparamsPutadditionalProperties
public static class FakebodywithqueryparamsPutadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
