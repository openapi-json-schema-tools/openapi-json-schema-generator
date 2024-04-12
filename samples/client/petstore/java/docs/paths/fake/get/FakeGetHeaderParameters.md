# FakeGetHeaderParameters
public class FakeGetHeaderParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakeGetHeaderParameters.FakeGetHeaderParameters1Boxed](#fakegetheaderparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakeGetHeaderParameters.FakeGetHeaderParameters1BoxedMap](#fakegetheaderparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeGetHeaderParameters.FakeGetHeaderParameters1](#fakegetheaderparameters1)<br> schema class |
| static class | [FakeGetHeaderParameters.FakeGetHeaderParameters9](#fakegetheaderparameters9)<br> builder for Map payloads |
| static class | [FakeGetHeaderParameters.FakeGetHeaderParameters10](#fakegetheaderparameters10)<br> output class for Map payloads |
| sealed interface | [FakeGetHeaderParameters.FakeGetHeaderParameters5Boxed](#fakegetheaderparameters5boxed)<br> sealed interface for validated payloads |
| record | [FakeGetHeaderParameters.FakeGetHeaderParameters5BoxedVoid](#fakegetheaderparameters5boxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeGetHeaderParameters.FakeGetHeaderParameters5BoxedBoolean](#fakegetheaderparameters5boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeGetHeaderParameters.FakeGetHeaderParameters5BoxedNumber](#fakegetheaderparameters5boxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeGetHeaderParameters.FakeGetHeaderParameters5BoxedString](#fakegetheaderparameters5boxedstring)<br> boxed class to store validated String payloads |
| record | [FakeGetHeaderParameters.FakeGetHeaderParameters5BoxedList](#fakegetheaderparameters5boxedlist)<br> boxed class to store validated List payloads |
| record | [FakeGetHeaderParameters.FakeGetHeaderParameters5BoxedMap](#fakegetheaderparameters5boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeGetHeaderParameters.FakeGetHeaderParameters5](#fakegetheaderparameters5)<br> schema class |

## FakeGetHeaderParameters1Boxed
public sealed interface FakeGetHeaderParameters1Boxed<br>
permits<br>
[FakeGetHeaderParameters1BoxedMap](#fakegetheaderparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeGetHeaderParameters1BoxedMap
public record FakeGetHeaderParameters1BoxedMap<br>
implements [FakeGetHeaderParameters1Boxed](#fakegetheaderparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetHeaderParameters1BoxedMap([FakeGetHeaderParameters10](#fakegetheaderparameters10) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeGetHeaderParameters10](#fakegetheaderparameters10) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetHeaderParameters1
public static class FakeGetHeaderParameters1<br>
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
import org.openapijsonschematools.client.paths.fake.get.FakeGetHeaderParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakeGetHeaderParameters.FakeGetHeaderParameters10 validatedPayload =
    FakeGetHeaderParameters.FakeGetHeaderParameters1.validate(
    new FakeGetHeaderParameters.FakeGetHeaderParameters9()
        .enum_header_string("_abc")

        .enum_header_string_array(
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_header_string", [Schema1.Schema11.class](../../../paths/fake/get/parameters/parameter1/Schema1.md#schema11)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_header_string_array", [Schema0.Schema01.class](../../../paths/fake/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakeGetHeaderParameters5.class](#fakegetheaderparameters5) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeGetHeaderParameters10](#fakegetheaderparameters10) | validate([Map&lt;?, ?&gt;](#fakegetheaderparameters9) arg, SchemaConfiguration configuration) |
| [FakeGetHeaderParameters1BoxedMap](#fakegetheaderparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakegetheaderparameters9) arg, SchemaConfiguration configuration) |
| [FakeGetHeaderParameters1Boxed](#fakegetheaderparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakeGetHeaderParameters9
public class FakeGetHeaderParameters9<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetHeaderParameters9()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FakeGetHeaderParameters9](#fakegetheaderparameters9) | enum_header_string(String value) |
| [FakeGetHeaderParameters9](#fakegetheaderparameters9) | enum_header_string([Schema1.StringSchemaEnums1](../../../paths/fake/get/parameters/parameter1/Schema1.md#stringschemaenums1) value) |
| [FakeGetHeaderParameters9](#fakegetheaderparameters9) | enum_header_string_array(List<String> value) |

## FakeGetHeaderParameters10
public static class FakeGetHeaderParameters10<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakeGetHeaderParameters10](#fakegetheaderparameters10) | of([Map<String, ? extends @Nullable Object>](#fakegetheaderparameters9) arg, SchemaConfiguration configuration) |
| String | enum_header_string()<br>[optional] |
| [Schema0.SchemaList0](../../../paths/fake/get/parameters/parameter0/Schema0.md#schemalist0) | enum_header_string_array()<br>[optional] |

## FakeGetHeaderParameters5Boxed
public sealed interface FakeGetHeaderParameters5Boxed<br>
permits<br>
[FakeGetHeaderParameters5BoxedVoid](#fakegetheaderparameters5boxedvoid),
[FakeGetHeaderParameters5BoxedBoolean](#fakegetheaderparameters5boxedboolean),
[FakeGetHeaderParameters5BoxedNumber](#fakegetheaderparameters5boxednumber),
[FakeGetHeaderParameters5BoxedString](#fakegetheaderparameters5boxedstring),
[FakeGetHeaderParameters5BoxedList](#fakegetheaderparameters5boxedlist),
[FakeGetHeaderParameters5BoxedMap](#fakegetheaderparameters5boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeGetHeaderParameters5BoxedVoid
public record FakeGetHeaderParameters5BoxedVoid<br>
implements [FakeGetHeaderParameters5Boxed](#fakegetheaderparameters5boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetHeaderParameters5BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetHeaderParameters5BoxedBoolean
public record FakeGetHeaderParameters5BoxedBoolean<br>
implements [FakeGetHeaderParameters5Boxed](#fakegetheaderparameters5boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetHeaderParameters5BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetHeaderParameters5BoxedNumber
public record FakeGetHeaderParameters5BoxedNumber<br>
implements [FakeGetHeaderParameters5Boxed](#fakegetheaderparameters5boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetHeaderParameters5BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetHeaderParameters5BoxedString
public record FakeGetHeaderParameters5BoxedString<br>
implements [FakeGetHeaderParameters5Boxed](#fakegetheaderparameters5boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetHeaderParameters5BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetHeaderParameters5BoxedList
public record FakeGetHeaderParameters5BoxedList<br>
implements [FakeGetHeaderParameters5Boxed](#fakegetheaderparameters5boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetHeaderParameters5BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetHeaderParameters5BoxedMap
public record FakeGetHeaderParameters5BoxedMap<br>
implements [FakeGetHeaderParameters5Boxed](#fakegetheaderparameters5boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetHeaderParameters5BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetHeaderParameters5
public static class FakeGetHeaderParameters5<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
