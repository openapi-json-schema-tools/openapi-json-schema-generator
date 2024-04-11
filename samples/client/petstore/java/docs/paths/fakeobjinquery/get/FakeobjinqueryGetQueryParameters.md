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
| static class | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParametersMapBuilder](#fakeobjinquerygetqueryparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParametersMap](#fakeobjinquerygetqueryparametersmap)<br> output class for Map payloads |
| sealed interface | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetadditionalPropertiesBoxed](#fakeobjinquerygetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetadditionalPropertiesBoxedVoid](#fakeobjinquerygetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetadditionalPropertiesBoxedBoolean](#fakeobjinquerygetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetadditionalPropertiesBoxedNumber](#fakeobjinquerygetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetadditionalPropertiesBoxedString](#fakeobjinquerygetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetadditionalPropertiesBoxedList](#fakeobjinquerygetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetadditionalPropertiesBoxedMap](#fakeobjinquerygetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeobjinqueryGetQueryParameters.FakeobjinqueryGetadditionalProperties](#fakeobjinquerygetadditionalproperties)<br> schema class |

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
| FakeobjinqueryGetQueryParameters1BoxedMap([FakeobjinqueryGetQueryParametersMap](#fakeobjinquerygetqueryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeobjinqueryGetQueryParametersMap](#fakeobjinquerygetqueryparametersmap) | data()<br>validated payload |
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
FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParametersMap validatedPayload =
    FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters1.validate(
    new FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [FakeobjinqueryGetadditionalProperties.class](#fakeobjinquerygetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeobjinqueryGetQueryParametersMap](#fakeobjinquerygetqueryparametersmap) | validate([Map&lt;?, ?&gt;](#fakeobjinquerygetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeobjinqueryGetQueryParameters1BoxedMap](#fakeobjinquerygetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakeobjinquerygetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeobjinqueryGetQueryParameters1Boxed](#fakeobjinquerygetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakeobjinqueryGetQueryParametersMapBuilder
public class FakeobjinqueryGetQueryParametersMapBuilder<br>
builder for `Map<String, Map<String, @Nullable Object>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Map<String, @Nullable Object>> | build()<br>Returns map input that should be used with Schema.validate |
| [FakeobjinqueryGetQueryParametersMapBuilder](#fakeobjinquerygetqueryparametersmapbuilder) | mapBean(Map<String, @Nullable Object> value) |

## FakeobjinqueryGetQueryParametersMap
public static class FakeobjinqueryGetQueryParametersMap<br>
extends FrozenMap<String, Schema0.SchemaMap0>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakeobjinqueryGetQueryParametersMap](#fakeobjinquerygetqueryparametersmap) | of([Map<String, Map<String, ? extends @Nullable Object>>](#fakeobjinquerygetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Schema0.SchemaMap0](../../../paths/fakeobjinquery/get/parameters/parameter0/Schema0.md#schemamap0) | mapBean()<br>[optional] |

## FakeobjinqueryGetadditionalPropertiesBoxed
public sealed interface FakeobjinqueryGetadditionalPropertiesBoxed<br>
permits<br>
[FakeobjinqueryGetadditionalPropertiesBoxedVoid](#fakeobjinquerygetadditionalpropertiesboxedvoid),
[FakeobjinqueryGetadditionalPropertiesBoxedBoolean](#fakeobjinquerygetadditionalpropertiesboxedboolean),
[FakeobjinqueryGetadditionalPropertiesBoxedNumber](#fakeobjinquerygetadditionalpropertiesboxednumber),
[FakeobjinqueryGetadditionalPropertiesBoxedString](#fakeobjinquerygetadditionalpropertiesboxedstring),
[FakeobjinqueryGetadditionalPropertiesBoxedList](#fakeobjinquerygetadditionalpropertiesboxedlist),
[FakeobjinqueryGetadditionalPropertiesBoxedMap](#fakeobjinquerygetadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeobjinqueryGetadditionalPropertiesBoxedVoid
public record FakeobjinqueryGetadditionalPropertiesBoxedVoid<br>
implements [FakeobjinqueryGetadditionalPropertiesBoxed](#fakeobjinquerygetadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetadditionalPropertiesBoxedBoolean
public record FakeobjinqueryGetadditionalPropertiesBoxedBoolean<br>
implements [FakeobjinqueryGetadditionalPropertiesBoxed](#fakeobjinquerygetadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetadditionalPropertiesBoxedNumber
public record FakeobjinqueryGetadditionalPropertiesBoxedNumber<br>
implements [FakeobjinqueryGetadditionalPropertiesBoxed](#fakeobjinquerygetadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetadditionalPropertiesBoxedString
public record FakeobjinqueryGetadditionalPropertiesBoxedString<br>
implements [FakeobjinqueryGetadditionalPropertiesBoxed](#fakeobjinquerygetadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetadditionalPropertiesBoxedList
public record FakeobjinqueryGetadditionalPropertiesBoxedList<br>
implements [FakeobjinqueryGetadditionalPropertiesBoxed](#fakeobjinquerygetadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetadditionalPropertiesBoxedMap
public record FakeobjinqueryGetadditionalPropertiesBoxedMap<br>
implements [FakeobjinqueryGetadditionalPropertiesBoxed](#fakeobjinquerygetadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeobjinqueryGetadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeobjinqueryGetadditionalProperties
public static class FakeobjinqueryGetadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
