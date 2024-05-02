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
| static class | [FakeobjinqueryGetQueryParameters.QueryParametersMapBuilder](#queryparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakeobjinqueryGetQueryParameters.QueryParametersMap](#queryparametersmap)<br> output class for Map payloads |
| sealed interface | [FakeobjinqueryGetQueryParameters.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakeobjinqueryGetQueryParameters.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeobjinqueryGetQueryParameters.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeobjinqueryGetQueryParameters.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeobjinqueryGetQueryParameters.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakeobjinqueryGetQueryParameters.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakeobjinqueryGetQueryParameters.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeobjinqueryGetQueryParameters.AdditionalProperties](#additionalproperties)<br> schema class |

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
| FakeobjinqueryGetQueryParameters1BoxedMap([QueryParametersMap](#queryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap](#queryparametersmap) | data()<br>validated payload |
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
FakeobjinqueryGetQueryParameters.QueryParametersMap validatedPayload =
    FakeobjinqueryGetQueryParameters.FakeobjinqueryGetQueryParameters1.validate(
    new FakeobjinqueryGetQueryParameters.QueryParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap](#queryparametersmap) | validate([Map&lt;?, ?&gt;](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeobjinqueryGetQueryParameters1BoxedMap](#fakeobjinquerygetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeobjinqueryGetQueryParameters1Boxed](#fakeobjinquerygetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## QueryParametersMapBuilder
public class QueryParametersMapBuilder<br>
builder for `Map<String, Map<String, @Nullable Object>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Map<String, @Nullable Object>> | build()<br>Returns map input that should be used with Schema.validate |
| [QueryParametersMapBuilder](#queryparametersmapbuilder) | mapBean(Map<String, @Nullable Object> value) |

## QueryParametersMap
public static class QueryParametersMap<br>
extends FrozenMap<String, Schema0.SchemaMap0>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [QueryParametersMap](#queryparametersmap) | of([Map<String, Map<String, ? extends @Nullable Object>>](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Schema0.SchemaMap0](../../../paths/fakeobjinquery/get/parameters/parameter0/Schema0.md#schemamap0) | mapBean()<br>[optional] |

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
