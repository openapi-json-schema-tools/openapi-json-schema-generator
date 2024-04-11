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
| static class | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParametersMapBuilder](#fakerefobjinquerygetqueryparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParametersMap](#fakerefobjinquerygetqueryparametersmap)<br> output class for Map payloads |
| sealed interface | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetadditionalPropertiesBoxed](#fakerefobjinquerygetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetadditionalPropertiesBoxedVoid](#fakerefobjinquerygetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetadditionalPropertiesBoxedBoolean](#fakerefobjinquerygetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetadditionalPropertiesBoxedNumber](#fakerefobjinquerygetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetadditionalPropertiesBoxedString](#fakerefobjinquerygetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetadditionalPropertiesBoxedList](#fakerefobjinquerygetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetadditionalPropertiesBoxedMap](#fakerefobjinquerygetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetadditionalProperties](#fakerefobjinquerygetadditionalproperties)<br> schema class |

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
| FakerefobjinqueryGetQueryParameters1BoxedMap([FakerefobjinqueryGetQueryParametersMap](#fakerefobjinquerygetqueryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakerefobjinqueryGetQueryParametersMap](#fakerefobjinquerygetqueryparametersmap) | data()<br>validated payload |
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
FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParametersMap validatedPayload =
    FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParameters1.validate(
    new FakerefobjinqueryGetQueryParameters.FakerefobjinqueryGetQueryParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [FakerefobjinqueryGetadditionalProperties.class](#fakerefobjinquerygetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakerefobjinqueryGetQueryParametersMap](#fakerefobjinquerygetqueryparametersmap) | validate([Map&lt;?, ?&gt;](#fakerefobjinquerygetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakerefobjinqueryGetQueryParameters1BoxedMap](#fakerefobjinquerygetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakerefobjinquerygetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakerefobjinqueryGetQueryParameters1Boxed](#fakerefobjinquerygetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakerefobjinqueryGetQueryParametersMapBuilder
public class FakerefobjinqueryGetQueryParametersMapBuilder<br>
builder for `Map<String, Map<String, @Nullable Object>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Map<String, @Nullable Object>> | build()<br>Returns map input that should be used with Schema.validate |
| [FakerefobjinqueryGetQueryParametersMapBuilder](#fakerefobjinquerygetqueryparametersmapbuilder) | mapBean(Map<String, @Nullable Object> value) |

## FakerefobjinqueryGetQueryParametersMap
public static class FakerefobjinqueryGetQueryParametersMap<br>
extends FrozenMap<String, Foo.FooMap>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakerefobjinqueryGetQueryParametersMap](#fakerefobjinquerygetqueryparametersmap) | of([Map<String, Map<String, ? extends @Nullable Object>>](#fakerefobjinquerygetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Foo.FooMap](../../../components/schemas/Foo.md#foomap) | mapBean()<br>[optional] |

## FakerefobjinqueryGetadditionalPropertiesBoxed
public sealed interface FakerefobjinqueryGetadditionalPropertiesBoxed<br>
permits<br>
[FakerefobjinqueryGetadditionalPropertiesBoxedVoid](#fakerefobjinquerygetadditionalpropertiesboxedvoid),
[FakerefobjinqueryGetadditionalPropertiesBoxedBoolean](#fakerefobjinquerygetadditionalpropertiesboxedboolean),
[FakerefobjinqueryGetadditionalPropertiesBoxedNumber](#fakerefobjinquerygetadditionalpropertiesboxednumber),
[FakerefobjinqueryGetadditionalPropertiesBoxedString](#fakerefobjinquerygetadditionalpropertiesboxedstring),
[FakerefobjinqueryGetadditionalPropertiesBoxedList](#fakerefobjinquerygetadditionalpropertiesboxedlist),
[FakerefobjinqueryGetadditionalPropertiesBoxedMap](#fakerefobjinquerygetadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## FakerefobjinqueryGetadditionalPropertiesBoxedVoid
public record FakerefobjinqueryGetadditionalPropertiesBoxedVoid<br>
implements [FakerefobjinqueryGetadditionalPropertiesBoxed](#fakerefobjinquerygetadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetadditionalPropertiesBoxedBoolean
public record FakerefobjinqueryGetadditionalPropertiesBoxedBoolean<br>
implements [FakerefobjinqueryGetadditionalPropertiesBoxed](#fakerefobjinquerygetadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetadditionalPropertiesBoxedNumber
public record FakerefobjinqueryGetadditionalPropertiesBoxedNumber<br>
implements [FakerefobjinqueryGetadditionalPropertiesBoxed](#fakerefobjinquerygetadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetadditionalPropertiesBoxedString
public record FakerefobjinqueryGetadditionalPropertiesBoxedString<br>
implements [FakerefobjinqueryGetadditionalPropertiesBoxed](#fakerefobjinquerygetadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetadditionalPropertiesBoxedList
public record FakerefobjinqueryGetadditionalPropertiesBoxedList<br>
implements [FakerefobjinqueryGetadditionalPropertiesBoxed](#fakerefobjinquerygetadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetadditionalPropertiesBoxedMap
public record FakerefobjinqueryGetadditionalPropertiesBoxedMap<br>
implements [FakerefobjinqueryGetadditionalPropertiesBoxed](#fakerefobjinquerygetadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefobjinqueryGetadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakerefobjinqueryGetadditionalProperties
public static class FakerefobjinqueryGetadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
