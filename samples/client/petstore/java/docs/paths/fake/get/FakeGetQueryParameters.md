# FakeGetQueryParameters
public class FakeGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakeGetQueryParameters.FakeGetQueryParameters1Boxed](#fakegetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakeGetQueryParameters.FakeGetQueryParameters1BoxedMap](#fakegetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeGetQueryParameters.FakeGetQueryParameters1](#fakegetqueryparameters1)<br> schema class |
| static class | [FakeGetQueryParameters.FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakeGetQueryParameters.FakeGetQueryParametersMap](#fakegetqueryparametersmap)<br> output class for Map payloads |
| sealed interface | [FakeGetQueryParameters.FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakeGetQueryParameters.FakeGetadditionalPropertiesBoxedVoid](#fakegetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeGetQueryParameters.FakeGetadditionalPropertiesBoxedBoolean](#fakegetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeGetQueryParameters.FakeGetadditionalPropertiesBoxedNumber](#fakegetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeGetQueryParameters.FakeGetadditionalPropertiesBoxedString](#fakegetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakeGetQueryParameters.FakeGetadditionalPropertiesBoxedList](#fakegetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakeGetQueryParameters.FakeGetadditionalPropertiesBoxedMap](#fakegetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeGetQueryParameters.FakeGetadditionalProperties](#fakegetadditionalproperties)<br> schema class |

## FakeGetQueryParameters1Boxed
public sealed interface FakeGetQueryParameters1Boxed<br>
permits<br>
[FakeGetQueryParameters1BoxedMap](#fakegetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeGetQueryParameters1BoxedMap
public record FakeGetQueryParameters1BoxedMap<br>
implements [FakeGetQueryParameters1Boxed](#fakegetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetQueryParameters1BoxedMap([FakeGetQueryParametersMap](#fakegetqueryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeGetQueryParametersMap](#fakegetqueryparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetQueryParameters1
public static class FakeGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.fake.get.FakeGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakeGetQueryParameters.FakeGetQueryParametersMap validatedPayload =
    FakeGetQueryParameters.FakeGetQueryParameters1.validate(
    new FakeGetQueryParameters.FakeGetQueryParametersMapBuilder()
        .enum_query_double(3.14d)

        .enum_query_string("_abc")

        .enum_query_integer(1)

        .enum_query_string_array(
            Arrays.asList(
                ">"
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_query_double", [Schema5.Schema51.class](../../../paths/fake/get/parameters/parameter5/Schema5.md#schema51)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_query_string", [Schema3.Schema31.class](../../../paths/fake/get/parameters/parameter3/Schema3.md#schema31)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_query_integer", [Schema4.Schema41.class](../../../paths/fake/get/parameters/parameter4/Schema4.md#schema41)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_query_string_array", [Schema2.Schema21.class](../../../paths/fake/get/parameters/parameter2/Schema2.md#schema21))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakeGetadditionalProperties.class](#fakegetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeGetQueryParametersMap](#fakegetqueryparametersmap) | validate([Map&lt;?, ?&gt;](#fakegetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeGetQueryParameters1BoxedMap](#fakegetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakegetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeGetQueryParameters1Boxed](#fakegetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakeGetQueryParametersMapBuilder
public class FakeGetQueryParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_double(int value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_double(float value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_double(long value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_double(double value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_double([Schema5.DoubleSchemaEnums5](../../../paths/fake/get/parameters/parameter5/Schema5.md#doubleschemaenums5) value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_double([Schema5.FloatSchemaEnums5](../../../paths/fake/get/parameters/parameter5/Schema5.md#floatschemaenums5) value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_string(String value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_string([Schema3.StringSchemaEnums3](../../../paths/fake/get/parameters/parameter3/Schema3.md#stringschemaenums3) value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_integer(int value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_integer(float value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_integer([Schema4.IntegerSchemaEnums4](../../../paths/fake/get/parameters/parameter4/Schema4.md#integerschemaenums4) value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_integer([Schema4.LongSchemaEnums4](../../../paths/fake/get/parameters/parameter4/Schema4.md#longschemaenums4) value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_integer([Schema4.FloatSchemaEnums4](../../../paths/fake/get/parameters/parameter4/Schema4.md#floatschemaenums4) value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_integer([Schema4.DoubleSchemaEnums4](../../../paths/fake/get/parameters/parameter4/Schema4.md#doubleschemaenums4) value) |
| [FakeGetQueryParametersMapBuilder](#fakegetqueryparametersmapbuilder) | enum_query_string_array(List<String> value) |

## FakeGetQueryParametersMap
public static class FakeGetQueryParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakeGetQueryParametersMap](#fakegetqueryparametersmap) | of([Map<String, ? extends @Nullable Object>](#fakegetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| Number | enum_query_double()<br>[optional] |
| String | enum_query_string()<br>[optional] |
| Number | enum_query_integer()<br>[optional] |
| [Schema2.SchemaList2](../../../paths/fake/get/parameters/parameter2/Schema2.md#schemalist2) | enum_query_string_array()<br>[optional] |

## FakeGetadditionalPropertiesBoxed
public sealed interface FakeGetadditionalPropertiesBoxed<br>
permits<br>
[FakeGetadditionalPropertiesBoxedVoid](#fakegetadditionalpropertiesboxedvoid),
[FakeGetadditionalPropertiesBoxedBoolean](#fakegetadditionalpropertiesboxedboolean),
[FakeGetadditionalPropertiesBoxedNumber](#fakegetadditionalpropertiesboxednumber),
[FakeGetadditionalPropertiesBoxedString](#fakegetadditionalpropertiesboxedstring),
[FakeGetadditionalPropertiesBoxedList](#fakegetadditionalpropertiesboxedlist),
[FakeGetadditionalPropertiesBoxedMap](#fakegetadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeGetadditionalPropertiesBoxedVoid
public record FakeGetadditionalPropertiesBoxedVoid<br>
implements [FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetadditionalPropertiesBoxedBoolean
public record FakeGetadditionalPropertiesBoxedBoolean<br>
implements [FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetadditionalPropertiesBoxedNumber
public record FakeGetadditionalPropertiesBoxedNumber<br>
implements [FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetadditionalPropertiesBoxedString
public record FakeGetadditionalPropertiesBoxedString<br>
implements [FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetadditionalPropertiesBoxedList
public record FakeGetadditionalPropertiesBoxedList<br>
implements [FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetadditionalPropertiesBoxedMap
public record FakeGetadditionalPropertiesBoxedMap<br>
implements [FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetadditionalProperties
public static class FakeGetadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
