# FakeDeleteQueryParameters
public class FakeDeleteQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakeDeleteQueryParameters.FakeDeleteQueryParameters1Boxed](#fakedeletequeryparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteQueryParameters1BoxedMap](#fakedeletequeryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeDeleteQueryParameters.FakeDeleteQueryParameters1](#fakedeletequeryparameters1)<br> schema class |
| static class | [FakeDeleteQueryParameters.FakeDeleteQueryParametersMapBuilder](#fakedeletequeryparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakeDeleteQueryParameters.FakeDeleteQueryParametersMap](#fakedeletequeryparametersmap)<br> output class for Map payloads |
| sealed interface | [FakeDeleteQueryParameters.FakeDeleteadditionalPropertiesBoxed](#fakedeleteadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteadditionalPropertiesBoxedVoid](#fakedeleteadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteadditionalPropertiesBoxedBoolean](#fakedeleteadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteadditionalPropertiesBoxedNumber](#fakedeleteadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteadditionalPropertiesBoxedString](#fakedeleteadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteadditionalPropertiesBoxedList](#fakedeleteadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteadditionalPropertiesBoxedMap](#fakedeleteadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeDeleteQueryParameters.FakeDeleteadditionalProperties](#fakedeleteadditionalproperties)<br> schema class |

## FakeDeleteQueryParameters1Boxed
public sealed interface FakeDeleteQueryParameters1Boxed<br>
permits<br>
[FakeDeleteQueryParameters1BoxedMap](#fakedeletequeryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeDeleteQueryParameters1BoxedMap
public record FakeDeleteQueryParameters1BoxedMap<br>
implements [FakeDeleteQueryParameters1Boxed](#fakedeletequeryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParameters1BoxedMap([FakeDeleteQueryParametersMap](#fakedeletequeryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteQueryParametersMap](#fakedeletequeryparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteQueryParameters1
public static class FakeDeleteQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakeDeleteQueryParameters.FakeDeleteQueryParametersMap validatedPayload =
    FakeDeleteQueryParameters.FakeDeleteQueryParameters1.validate(
    new FakeDeleteQueryParameters.FakeDeleteQueryParametersMapBuilder()
        .required_int64_group(1L)

        .required_string_group("a")

        .int64_group(1L)

        .string_group("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("required_string_group", [Schema0.Schema01.class](../../../paths/fake/delete/parameters/parameter0/Schema0.md#schema01)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int64_group", [Schema5.Schema51.class](../../../paths/fake/delete/parameters/parameter5/Schema5.md#schema51)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("string_group", [Schema3.Schema31.class](../../../paths/fake/delete/parameters/parameter3/Schema3.md#schema31)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("required_int64_group", [Schema2.Schema21.class](../../../paths/fake/delete/parameters/parameter2/Schema2.md#schema21))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"required_int64_group",<br>&nbsp;&nbsp;&nbsp;&nbsp;"required_string_group"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakeDeleteadditionalProperties.class](#fakedeleteadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteQueryParametersMap](#fakedeletequeryparametersmap) | validate([Map&lt;?, ?&gt;](#fakedeletequeryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeDeleteQueryParameters1BoxedMap](#fakedeletequeryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakedeletequeryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeDeleteQueryParameters1Boxed](#fakedeletequeryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakeDeleteQueryParametersMap00Builder
public class FakeDeleteQueryParametersMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParametersMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FakeDeleteQueryParametersMap00Builder](#fakedeletequeryparametersmap00builder) | int64_group(int value) |
| [FakeDeleteQueryParametersMap00Builder](#fakedeletequeryparametersmap00builder) | int64_group(float value) |
| [FakeDeleteQueryParametersMap00Builder](#fakedeletequeryparametersmap00builder) | int64_group(long value) |
| [FakeDeleteQueryParametersMap00Builder](#fakedeletequeryparametersmap00builder) | int64_group(double value) |
| [FakeDeleteQueryParametersMap00Builder](#fakedeletequeryparametersmap00builder) | string_group(String value) |

## FakeDeleteQueryParametersMap01Builder
public class FakeDeleteQueryParametersMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParametersMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteQueryParametersMap00Builder](#fakedeletequeryparametersmap00builder) | required_string_group(String value) |

## FakeDeleteQueryParametersMap10Builder
public class FakeDeleteQueryParametersMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParametersMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteQueryParametersMap00Builder](#fakedeletequeryparametersmap00builder) | required_int64_group(int value) |
| [FakeDeleteQueryParametersMap00Builder](#fakedeletequeryparametersmap00builder) | required_int64_group(float value) |
| [FakeDeleteQueryParametersMap00Builder](#fakedeletequeryparametersmap00builder) | required_int64_group(long value) |
| [FakeDeleteQueryParametersMap00Builder](#fakedeletequeryparametersmap00builder) | required_int64_group(double value) |

## FakeDeleteQueryParametersMapBuilder
public class FakeDeleteQueryParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteQueryParametersMap01Builder](#fakedeletequeryparametersmap01builder) | required_int64_group(int value) |
| [FakeDeleteQueryParametersMap01Builder](#fakedeletequeryparametersmap01builder) | required_int64_group(float value) |
| [FakeDeleteQueryParametersMap01Builder](#fakedeletequeryparametersmap01builder) | required_int64_group(long value) |
| [FakeDeleteQueryParametersMap01Builder](#fakedeletequeryparametersmap01builder) | required_int64_group(double value) |
| [FakeDeleteQueryParametersMap10Builder](#fakedeletequeryparametersmap10builder) | required_string_group(String value) |

## FakeDeleteQueryParametersMap
public static class FakeDeleteQueryParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakeDeleteQueryParametersMap](#fakedeletequeryparametersmap) | of([Map<String, ? extends @Nullable Object>](#fakedeletequeryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| Number | required_int64_group()<br> |
| String | required_string_group()<br> |
| Number | int64_group()<br>[optional] |
| String | string_group()<br>[optional] |

## FakeDeleteadditionalPropertiesBoxed
public sealed interface FakeDeleteadditionalPropertiesBoxed<br>
permits<br>
[FakeDeleteadditionalPropertiesBoxedVoid](#fakedeleteadditionalpropertiesboxedvoid),
[FakeDeleteadditionalPropertiesBoxedBoolean](#fakedeleteadditionalpropertiesboxedboolean),
[FakeDeleteadditionalPropertiesBoxedNumber](#fakedeleteadditionalpropertiesboxednumber),
[FakeDeleteadditionalPropertiesBoxedString](#fakedeleteadditionalpropertiesboxedstring),
[FakeDeleteadditionalPropertiesBoxedList](#fakedeleteadditionalpropertiesboxedlist),
[FakeDeleteadditionalPropertiesBoxedMap](#fakedeleteadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeDeleteadditionalPropertiesBoxedVoid
public record FakeDeleteadditionalPropertiesBoxedVoid<br>
implements [FakeDeleteadditionalPropertiesBoxed](#fakedeleteadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteadditionalPropertiesBoxedBoolean
public record FakeDeleteadditionalPropertiesBoxedBoolean<br>
implements [FakeDeleteadditionalPropertiesBoxed](#fakedeleteadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteadditionalPropertiesBoxedNumber
public record FakeDeleteadditionalPropertiesBoxedNumber<br>
implements [FakeDeleteadditionalPropertiesBoxed](#fakedeleteadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteadditionalPropertiesBoxedString
public record FakeDeleteadditionalPropertiesBoxedString<br>
implements [FakeDeleteadditionalPropertiesBoxed](#fakedeleteadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteadditionalPropertiesBoxedList
public record FakeDeleteadditionalPropertiesBoxedList<br>
implements [FakeDeleteadditionalPropertiesBoxed](#fakedeleteadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteadditionalPropertiesBoxedMap
public record FakeDeleteadditionalPropertiesBoxedMap<br>
implements [FakeDeleteadditionalPropertiesBoxed](#fakedeleteadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteadditionalProperties
public static class FakeDeleteadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
