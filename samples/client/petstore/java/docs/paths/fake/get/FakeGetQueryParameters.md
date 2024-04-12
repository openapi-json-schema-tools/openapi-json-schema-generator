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
| static class | [FakeGetQueryParameters.FakeGetQueryParameters11](#fakegetqueryparameters11)<br> builder for Map payloads |
| static class | [FakeGetQueryParameters.FakeGetQueryParameters12](#fakegetqueryparameters12)<br> output class for Map payloads |
| sealed interface | [FakeGetQueryParameters.FakeGetQueryParameters7Boxed](#fakegetqueryparameters7boxed)<br> sealed interface for validated payloads |
| record | [FakeGetQueryParameters.FakeGetQueryParameters7BoxedVoid](#fakegetqueryparameters7boxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeGetQueryParameters.FakeGetQueryParameters7BoxedBoolean](#fakegetqueryparameters7boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeGetQueryParameters.FakeGetQueryParameters7BoxedNumber](#fakegetqueryparameters7boxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeGetQueryParameters.FakeGetQueryParameters7BoxedString](#fakegetqueryparameters7boxedstring)<br> boxed class to store validated String payloads |
| record | [FakeGetQueryParameters.FakeGetQueryParameters7BoxedList](#fakegetqueryparameters7boxedlist)<br> boxed class to store validated List payloads |
| record | [FakeGetQueryParameters.FakeGetQueryParameters7BoxedMap](#fakegetqueryparameters7boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeGetQueryParameters.FakeGetQueryParameters7](#fakegetqueryparameters7)<br> schema class |

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
| FakeGetQueryParameters1BoxedMap([FakeGetQueryParameters12](#fakegetqueryparameters12) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeGetQueryParameters12](#fakegetqueryparameters12) | data()<br>validated payload |
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
FakeGetQueryParameters.FakeGetQueryParameters12 validatedPayload =
    FakeGetQueryParameters.FakeGetQueryParameters1.validate(
    new FakeGetQueryParameters.FakeGetQueryParameters11()
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
| Class<? extends JsonSchema> | additionalProperties = [FakeGetQueryParameters7.class](#fakegetqueryparameters7) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeGetQueryParameters12](#fakegetqueryparameters12) | validate([Map&lt;?, ?&gt;](#fakegetqueryparameters11) arg, SchemaConfiguration configuration) |
| [FakeGetQueryParameters1BoxedMap](#fakegetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakegetqueryparameters11) arg, SchemaConfiguration configuration) |
| [FakeGetQueryParameters1Boxed](#fakegetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakeGetQueryParameters11
public class FakeGetQueryParameters11<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetQueryParameters11()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_double(int value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_double(float value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_double(long value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_double(double value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_double([Schema5.DoubleSchemaEnums5](../../../paths/fake/get/parameters/parameter5/Schema5.md#doubleschemaenums5) value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_double([Schema5.FloatSchemaEnums5](../../../paths/fake/get/parameters/parameter5/Schema5.md#floatschemaenums5) value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_string(String value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_string([Schema3.StringSchemaEnums3](../../../paths/fake/get/parameters/parameter3/Schema3.md#stringschemaenums3) value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_integer(int value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_integer(float value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_integer([Schema4.IntegerSchemaEnums4](../../../paths/fake/get/parameters/parameter4/Schema4.md#integerschemaenums4) value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_integer([Schema4.LongSchemaEnums4](../../../paths/fake/get/parameters/parameter4/Schema4.md#longschemaenums4) value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_integer([Schema4.FloatSchemaEnums4](../../../paths/fake/get/parameters/parameter4/Schema4.md#floatschemaenums4) value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_integer([Schema4.DoubleSchemaEnums4](../../../paths/fake/get/parameters/parameter4/Schema4.md#doubleschemaenums4) value) |
| [FakeGetQueryParameters11](#fakegetqueryparameters11) | enum_query_string_array(List<String> value) |

## FakeGetQueryParameters12
public static class FakeGetQueryParameters12<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakeGetQueryParameters12](#fakegetqueryparameters12) | of([Map<String, ? extends @Nullable Object>](#fakegetqueryparameters11) arg, SchemaConfiguration configuration) |
| Number | enum_query_double()<br>[optional] |
| String | enum_query_string()<br>[optional] |
| Number | enum_query_integer()<br>[optional] |
| [Schema2.SchemaList2](../../../paths/fake/get/parameters/parameter2/Schema2.md#schemalist2) | enum_query_string_array()<br>[optional] |

## FakeGetQueryParameters7Boxed
public sealed interface FakeGetQueryParameters7Boxed<br>
permits<br>
[FakeGetQueryParameters7BoxedVoid](#fakegetqueryparameters7boxedvoid),
[FakeGetQueryParameters7BoxedBoolean](#fakegetqueryparameters7boxedboolean),
[FakeGetQueryParameters7BoxedNumber](#fakegetqueryparameters7boxednumber),
[FakeGetQueryParameters7BoxedString](#fakegetqueryparameters7boxedstring),
[FakeGetQueryParameters7BoxedList](#fakegetqueryparameters7boxedlist),
[FakeGetQueryParameters7BoxedMap](#fakegetqueryparameters7boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeGetQueryParameters7BoxedVoid
public record FakeGetQueryParameters7BoxedVoid<br>
implements [FakeGetQueryParameters7Boxed](#fakegetqueryparameters7boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetQueryParameters7BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetQueryParameters7BoxedBoolean
public record FakeGetQueryParameters7BoxedBoolean<br>
implements [FakeGetQueryParameters7Boxed](#fakegetqueryparameters7boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetQueryParameters7BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetQueryParameters7BoxedNumber
public record FakeGetQueryParameters7BoxedNumber<br>
implements [FakeGetQueryParameters7Boxed](#fakegetqueryparameters7boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetQueryParameters7BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetQueryParameters7BoxedString
public record FakeGetQueryParameters7BoxedString<br>
implements [FakeGetQueryParameters7Boxed](#fakegetqueryparameters7boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetQueryParameters7BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetQueryParameters7BoxedList
public record FakeGetQueryParameters7BoxedList<br>
implements [FakeGetQueryParameters7Boxed](#fakegetqueryparameters7boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetQueryParameters7BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetQueryParameters7BoxedMap
public record FakeGetQueryParameters7BoxedMap<br>
implements [FakeGetQueryParameters7Boxed](#fakegetqueryparameters7boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetQueryParameters7BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetQueryParameters7
public static class FakeGetQueryParameters7<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
