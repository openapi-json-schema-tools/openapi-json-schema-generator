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
| static class | [FakeDeleteQueryParameters.FakeDeleteQueryParameters13](#fakedeletequeryparameters13)<br> builder for Map payloads |
| static class | [FakeDeleteQueryParameters.FakeDeleteQueryParameters14](#fakedeletequeryparameters14)<br> output class for Map payloads |
| sealed interface | [FakeDeleteQueryParameters.FakeDeleteQueryParameters7Boxed](#fakedeletequeryparameters7boxed)<br> sealed interface for validated payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteQueryParameters7BoxedVoid](#fakedeletequeryparameters7boxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteQueryParameters7BoxedBoolean](#fakedeletequeryparameters7boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteQueryParameters7BoxedNumber](#fakedeletequeryparameters7boxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteQueryParameters7BoxedString](#fakedeletequeryparameters7boxedstring)<br> boxed class to store validated String payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteQueryParameters7BoxedList](#fakedeletequeryparameters7boxedlist)<br> boxed class to store validated List payloads |
| record | [FakeDeleteQueryParameters.FakeDeleteQueryParameters7BoxedMap](#fakedeletequeryparameters7boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeDeleteQueryParameters.FakeDeleteQueryParameters7](#fakedeletequeryparameters7)<br> schema class |

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
| FakeDeleteQueryParameters1BoxedMap([FakeDeleteQueryParameters14](#fakedeletequeryparameters14) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteQueryParameters14](#fakedeletequeryparameters14) | data()<br>validated payload |
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
FakeDeleteQueryParameters.FakeDeleteQueryParameters14 validatedPayload =
    FakeDeleteQueryParameters.FakeDeleteQueryParameters1.validate(
    new FakeDeleteQueryParameters.FakeDeleteQueryParameters13()
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
| Class<? extends JsonSchema> | additionalProperties = [FakeDeleteQueryParameters7.class](#fakedeletequeryparameters7) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteQueryParameters14](#fakedeletequeryparameters14) | validate([Map&lt;?, ?&gt;](#fakedeletequeryparameters13) arg, SchemaConfiguration configuration) |
| [FakeDeleteQueryParameters1BoxedMap](#fakedeletequeryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakedeletequeryparameters13) arg, SchemaConfiguration configuration) |
| [FakeDeleteQueryParameters1Boxed](#fakedeletequeryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakeDeleteQueryParameters15
public class FakeDeleteQueryParameters15<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParameters15(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FakeDeleteQueryParameters15](#fakedeletequeryparameters15) | int64_group(int value) |
| [FakeDeleteQueryParameters15](#fakedeletequeryparameters15) | int64_group(float value) |
| [FakeDeleteQueryParameters15](#fakedeletequeryparameters15) | int64_group(long value) |
| [FakeDeleteQueryParameters15](#fakedeletequeryparameters15) | int64_group(double value) |
| [FakeDeleteQueryParameters15](#fakedeletequeryparameters15) | string_group(String value) |

## FakeDeleteQueryParameters16
public class FakeDeleteQueryParameters16<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParameters16(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteQueryParameters15](#fakedeletequeryparameters15) | required_string_group(String value) |

## FakeDeleteQueryParameters17
public class FakeDeleteQueryParameters17<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParameters17(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteQueryParameters15](#fakedeletequeryparameters15) | required_int64_group(int value) |
| [FakeDeleteQueryParameters15](#fakedeletequeryparameters15) | required_int64_group(float value) |
| [FakeDeleteQueryParameters15](#fakedeletequeryparameters15) | required_int64_group(long value) |
| [FakeDeleteQueryParameters15](#fakedeletequeryparameters15) | required_int64_group(double value) |

## FakeDeleteQueryParameters13
public class FakeDeleteQueryParameters13<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParameters13()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteQueryParameters16](#fakedeletequeryparameters16) | required_int64_group(int value) |
| [FakeDeleteQueryParameters16](#fakedeletequeryparameters16) | required_int64_group(float value) |
| [FakeDeleteQueryParameters16](#fakedeletequeryparameters16) | required_int64_group(long value) |
| [FakeDeleteQueryParameters16](#fakedeletequeryparameters16) | required_int64_group(double value) |
| [FakeDeleteQueryParameters17](#fakedeletequeryparameters17) | required_string_group(String value) |

## FakeDeleteQueryParameters14
public static class FakeDeleteQueryParameters14<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakeDeleteQueryParameters14](#fakedeletequeryparameters14) | of([Map<String, ? extends @Nullable Object>](#fakedeletequeryparameters13) arg, SchemaConfiguration configuration) |
| Number | required_int64_group()<br> |
| String | required_string_group()<br> |
| Number | int64_group()<br>[optional] |
| String | string_group()<br>[optional] |

## FakeDeleteQueryParameters7Boxed
public sealed interface FakeDeleteQueryParameters7Boxed<br>
permits<br>
[FakeDeleteQueryParameters7BoxedVoid](#fakedeletequeryparameters7boxedvoid),
[FakeDeleteQueryParameters7BoxedBoolean](#fakedeletequeryparameters7boxedboolean),
[FakeDeleteQueryParameters7BoxedNumber](#fakedeletequeryparameters7boxednumber),
[FakeDeleteQueryParameters7BoxedString](#fakedeletequeryparameters7boxedstring),
[FakeDeleteQueryParameters7BoxedList](#fakedeletequeryparameters7boxedlist),
[FakeDeleteQueryParameters7BoxedMap](#fakedeletequeryparameters7boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeDeleteQueryParameters7BoxedVoid
public record FakeDeleteQueryParameters7BoxedVoid<br>
implements [FakeDeleteQueryParameters7Boxed](#fakedeletequeryparameters7boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParameters7BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteQueryParameters7BoxedBoolean
public record FakeDeleteQueryParameters7BoxedBoolean<br>
implements [FakeDeleteQueryParameters7Boxed](#fakedeletequeryparameters7boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParameters7BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteQueryParameters7BoxedNumber
public record FakeDeleteQueryParameters7BoxedNumber<br>
implements [FakeDeleteQueryParameters7Boxed](#fakedeletequeryparameters7boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParameters7BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteQueryParameters7BoxedString
public record FakeDeleteQueryParameters7BoxedString<br>
implements [FakeDeleteQueryParameters7Boxed](#fakedeletequeryparameters7boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParameters7BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteQueryParameters7BoxedList
public record FakeDeleteQueryParameters7BoxedList<br>
implements [FakeDeleteQueryParameters7Boxed](#fakedeletequeryparameters7boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParameters7BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteQueryParameters7BoxedMap
public record FakeDeleteQueryParameters7BoxedMap<br>
implements [FakeDeleteQueryParameters7Boxed](#fakedeletequeryparameters7boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteQueryParameters7BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteQueryParameters7
public static class FakeDeleteQueryParameters7<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
