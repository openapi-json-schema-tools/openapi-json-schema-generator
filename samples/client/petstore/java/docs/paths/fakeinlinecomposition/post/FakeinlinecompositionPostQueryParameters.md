# FakeinlinecompositionPostQueryParameters
public class FakeinlinecompositionPostQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters1Boxed](#fakeinlinecompositionpostqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters1BoxedMap](#fakeinlinecompositionpostqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters1](#fakeinlinecompositionpostqueryparameters1)<br> schema class |
| static class | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParametersMapBuilder](#fakeinlinecompositionpostqueryparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParametersMap](#fakeinlinecompositionpostqueryparametersmap)<br> output class for Map payloads |
| sealed interface | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostadditionalPropertiesBoxed](#fakeinlinecompositionpostadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostadditionalPropertiesBoxedVoid](#fakeinlinecompositionpostadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostadditionalPropertiesBoxedBoolean](#fakeinlinecompositionpostadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostadditionalPropertiesBoxedNumber](#fakeinlinecompositionpostadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostadditionalPropertiesBoxedString](#fakeinlinecompositionpostadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostadditionalPropertiesBoxedList](#fakeinlinecompositionpostadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostadditionalPropertiesBoxedMap](#fakeinlinecompositionpostadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostadditionalProperties](#fakeinlinecompositionpostadditionalproperties)<br> schema class |

## FakeinlinecompositionPostQueryParameters1Boxed
public sealed interface FakeinlinecompositionPostQueryParameters1Boxed<br>
permits<br>
[FakeinlinecompositionPostQueryParameters1BoxedMap](#fakeinlinecompositionpostqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeinlinecompositionPostQueryParameters1BoxedMap
public record FakeinlinecompositionPostQueryParameters1BoxedMap<br>
implements [FakeinlinecompositionPostQueryParameters1Boxed](#fakeinlinecompositionpostqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostQueryParameters1BoxedMap([FakeinlinecompositionPostQueryParametersMap](#fakeinlinecompositionpostqueryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeinlinecompositionPostQueryParametersMap](#fakeinlinecompositionpostqueryparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostQueryParameters1
public static class FakeinlinecompositionPostQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.FakeinlinecompositionPostQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParametersMap validatedPayload =
    FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters1.validate(
    new FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParametersMapBuilder()
        .compositionInProperty(
            MapUtils.makeMap(
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("compositionAtRoot", [Schema0.Schema01.class](../../../paths/fakeinlinecomposition/post/parameters/parameter0/Schema0.md#schema01)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("compositionInProperty", [Schema1.Schema11.class](../../../paths/fakeinlinecomposition/post/parameters/parameter1/Schema1.md#schema11))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakeinlinecompositionPostadditionalProperties.class](#fakeinlinecompositionpostadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeinlinecompositionPostQueryParametersMap](#fakeinlinecompositionpostqueryparametersmap) | validate([Map&lt;?, ?&gt;](#fakeinlinecompositionpostqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeinlinecompositionPostQueryParameters1BoxedMap](#fakeinlinecompositionpostqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakeinlinecompositionpostqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeinlinecompositionPostQueryParameters1Boxed](#fakeinlinecompositionpostqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakeinlinecompositionPostQueryParametersMapBuilder
public class FakeinlinecompositionPostQueryParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FakeinlinecompositionPostQueryParametersMapBuilder](#fakeinlinecompositionpostqueryparametersmapbuilder) | compositionAtRoot(Void value) |
| [FakeinlinecompositionPostQueryParametersMapBuilder](#fakeinlinecompositionpostqueryparametersmapbuilder) | compositionAtRoot(boolean value) |
| [FakeinlinecompositionPostQueryParametersMapBuilder](#fakeinlinecompositionpostqueryparametersmapbuilder) | compositionAtRoot(String value) |
| [FakeinlinecompositionPostQueryParametersMapBuilder](#fakeinlinecompositionpostqueryparametersmapbuilder) | compositionAtRoot(int value) |
| [FakeinlinecompositionPostQueryParametersMapBuilder](#fakeinlinecompositionpostqueryparametersmapbuilder) | compositionAtRoot(float value) |
| [FakeinlinecompositionPostQueryParametersMapBuilder](#fakeinlinecompositionpostqueryparametersmapbuilder) | compositionAtRoot(long value) |
| [FakeinlinecompositionPostQueryParametersMapBuilder](#fakeinlinecompositionpostqueryparametersmapbuilder) | compositionAtRoot(double value) |
| [FakeinlinecompositionPostQueryParametersMapBuilder](#fakeinlinecompositionpostqueryparametersmapbuilder) | compositionAtRoot(List<?> value) |
| [FakeinlinecompositionPostQueryParametersMapBuilder](#fakeinlinecompositionpostqueryparametersmapbuilder) | compositionAtRoot(Map<String, ?> value) |
| [FakeinlinecompositionPostQueryParametersMapBuilder](#fakeinlinecompositionpostqueryparametersmapbuilder) | compositionInProperty(Map<String, @Nullable Object> value) |

## FakeinlinecompositionPostQueryParametersMap
public static class FakeinlinecompositionPostQueryParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakeinlinecompositionPostQueryParametersMap](#fakeinlinecompositionpostqueryparametersmap) | of([Map<String, ? extends @Nullable Object>](#fakeinlinecompositionpostqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | compositionAtRoot()<br>[optional] |
| [Schema1.SchemaMap1](../../../paths/fakeinlinecomposition/post/parameters/parameter1/Schema1.md#schemamap1) | compositionInProperty()<br>[optional] |

## FakeinlinecompositionPostadditionalPropertiesBoxed
public sealed interface FakeinlinecompositionPostadditionalPropertiesBoxed<br>
permits<br>
[FakeinlinecompositionPostadditionalPropertiesBoxedVoid](#fakeinlinecompositionpostadditionalpropertiesboxedvoid),
[FakeinlinecompositionPostadditionalPropertiesBoxedBoolean](#fakeinlinecompositionpostadditionalpropertiesboxedboolean),
[FakeinlinecompositionPostadditionalPropertiesBoxedNumber](#fakeinlinecompositionpostadditionalpropertiesboxednumber),
[FakeinlinecompositionPostadditionalPropertiesBoxedString](#fakeinlinecompositionpostadditionalpropertiesboxedstring),
[FakeinlinecompositionPostadditionalPropertiesBoxedList](#fakeinlinecompositionpostadditionalpropertiesboxedlist),
[FakeinlinecompositionPostadditionalPropertiesBoxedMap](#fakeinlinecompositionpostadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeinlinecompositionPostadditionalPropertiesBoxedVoid
public record FakeinlinecompositionPostadditionalPropertiesBoxedVoid<br>
implements [FakeinlinecompositionPostadditionalPropertiesBoxed](#fakeinlinecompositionpostadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostadditionalPropertiesBoxedBoolean
public record FakeinlinecompositionPostadditionalPropertiesBoxedBoolean<br>
implements [FakeinlinecompositionPostadditionalPropertiesBoxed](#fakeinlinecompositionpostadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostadditionalPropertiesBoxedNumber
public record FakeinlinecompositionPostadditionalPropertiesBoxedNumber<br>
implements [FakeinlinecompositionPostadditionalPropertiesBoxed](#fakeinlinecompositionpostadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostadditionalPropertiesBoxedString
public record FakeinlinecompositionPostadditionalPropertiesBoxedString<br>
implements [FakeinlinecompositionPostadditionalPropertiesBoxed](#fakeinlinecompositionpostadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostadditionalPropertiesBoxedList
public record FakeinlinecompositionPostadditionalPropertiesBoxedList<br>
implements [FakeinlinecompositionPostadditionalPropertiesBoxed](#fakeinlinecompositionpostadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostadditionalPropertiesBoxedMap
public record FakeinlinecompositionPostadditionalPropertiesBoxedMap<br>
implements [FakeinlinecompositionPostadditionalPropertiesBoxed](#fakeinlinecompositionpostadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostadditionalProperties
public static class FakeinlinecompositionPostadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
