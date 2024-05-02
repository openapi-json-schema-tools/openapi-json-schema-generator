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
| static class | [FakebodywithqueryparamsPutQueryParameters.QueryParametersMapBuilder](#queryparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakebodywithqueryparamsPutQueryParameters.QueryParametersMap](#queryparametersmap)<br> output class for Map payloads |
| sealed interface | [FakebodywithqueryparamsPutQueryParameters.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakebodywithqueryparamsPutQueryParameters.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakebodywithqueryparamsPutQueryParameters.AdditionalProperties](#additionalproperties)<br> schema class |

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
| FakebodywithqueryparamsPutQueryParameters1BoxedMap([QueryParametersMap](#queryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap](#queryparametersmap) | data()<br>validated payload |
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
FakebodywithqueryparamsPutQueryParameters.QueryParametersMap validatedPayload =
    FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters1.validate(
    new FakebodywithqueryparamsPutQueryParameters.QueryParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap](#queryparametersmap) | validate([Map&lt;?, ?&gt;](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakebodywithqueryparamsPutQueryParameters1BoxedMap](#fakebodywithqueryparamsputqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakebodywithqueryparamsPutQueryParameters1Boxed](#fakebodywithqueryparamsputqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## QueryParametersMap0Builder
public class QueryParametersMap0Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap0Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## QueryParametersMapBuilder
public class QueryParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap0Builder](#queryparametersmap0builder) | query(String value) |

## QueryParametersMap
public static class QueryParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [QueryParametersMap](#queryparametersmap) | of([Map<String, String>](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | query()<br> |

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
