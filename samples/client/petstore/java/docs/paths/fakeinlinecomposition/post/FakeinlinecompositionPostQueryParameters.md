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
| static class | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters9](#fakeinlinecompositionpostqueryparameters9)<br> builder for Map payloads |
| static class | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters10](#fakeinlinecompositionpostqueryparameters10)<br> output class for Map payloads |
| sealed interface | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters5Boxed](#fakeinlinecompositionpostqueryparameters5boxed)<br> sealed interface for validated payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters5BoxedVoid](#fakeinlinecompositionpostqueryparameters5boxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters5BoxedBoolean](#fakeinlinecompositionpostqueryparameters5boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters5BoxedNumber](#fakeinlinecompositionpostqueryparameters5boxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters5BoxedString](#fakeinlinecompositionpostqueryparameters5boxedstring)<br> boxed class to store validated String payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters5BoxedList](#fakeinlinecompositionpostqueryparameters5boxedlist)<br> boxed class to store validated List payloads |
| record | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters5BoxedMap](#fakeinlinecompositionpostqueryparameters5boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters5](#fakeinlinecompositionpostqueryparameters5)<br> schema class |

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
| FakeinlinecompositionPostQueryParameters1BoxedMap([FakeinlinecompositionPostQueryParameters10](#fakeinlinecompositionpostqueryparameters10) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeinlinecompositionPostQueryParameters10](#fakeinlinecompositionpostqueryparameters10) | data()<br>validated payload |
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
FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters10 validatedPayload =
    FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters1.validate(
    new FakeinlinecompositionPostQueryParameters.FakeinlinecompositionPostQueryParameters9()
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
| Class<? extends JsonSchema> | additionalProperties = [FakeinlinecompositionPostQueryParameters5.class](#fakeinlinecompositionpostqueryparameters5) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeinlinecompositionPostQueryParameters10](#fakeinlinecompositionpostqueryparameters10) | validate([Map&lt;?, ?&gt;](#fakeinlinecompositionpostqueryparameters9) arg, SchemaConfiguration configuration) |
| [FakeinlinecompositionPostQueryParameters1BoxedMap](#fakeinlinecompositionpostqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakeinlinecompositionpostqueryparameters9) arg, SchemaConfiguration configuration) |
| [FakeinlinecompositionPostQueryParameters1Boxed](#fakeinlinecompositionpostqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakeinlinecompositionPostQueryParameters9
public class FakeinlinecompositionPostQueryParameters9<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostQueryParameters9()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FakeinlinecompositionPostQueryParameters9](#fakeinlinecompositionpostqueryparameters9) | compositionAtRoot(Void value) |
| [FakeinlinecompositionPostQueryParameters9](#fakeinlinecompositionpostqueryparameters9) | compositionAtRoot(boolean value) |
| [FakeinlinecompositionPostQueryParameters9](#fakeinlinecompositionpostqueryparameters9) | compositionAtRoot(String value) |
| [FakeinlinecompositionPostQueryParameters9](#fakeinlinecompositionpostqueryparameters9) | compositionAtRoot(int value) |
| [FakeinlinecompositionPostQueryParameters9](#fakeinlinecompositionpostqueryparameters9) | compositionAtRoot(float value) |
| [FakeinlinecompositionPostQueryParameters9](#fakeinlinecompositionpostqueryparameters9) | compositionAtRoot(long value) |
| [FakeinlinecompositionPostQueryParameters9](#fakeinlinecompositionpostqueryparameters9) | compositionAtRoot(double value) |
| [FakeinlinecompositionPostQueryParameters9](#fakeinlinecompositionpostqueryparameters9) | compositionAtRoot(List<?> value) |
| [FakeinlinecompositionPostQueryParameters9](#fakeinlinecompositionpostqueryparameters9) | compositionAtRoot(Map<String, ?> value) |
| [FakeinlinecompositionPostQueryParameters9](#fakeinlinecompositionpostqueryparameters9) | compositionInProperty(Map<String, @Nullable Object> value) |

## FakeinlinecompositionPostQueryParameters10
public static class FakeinlinecompositionPostQueryParameters10<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakeinlinecompositionPostQueryParameters10](#fakeinlinecompositionpostqueryparameters10) | of([Map<String, ? extends @Nullable Object>](#fakeinlinecompositionpostqueryparameters9) arg, SchemaConfiguration configuration) |
| @Nullable Object | compositionAtRoot()<br>[optional] |
| [Schema1.SchemaMap1](../../../paths/fakeinlinecomposition/post/parameters/parameter1/Schema1.md#schemamap1) | compositionInProperty()<br>[optional] |

## FakeinlinecompositionPostQueryParameters5Boxed
public sealed interface FakeinlinecompositionPostQueryParameters5Boxed<br>
permits<br>
[FakeinlinecompositionPostQueryParameters5BoxedVoid](#fakeinlinecompositionpostqueryparameters5boxedvoid),
[FakeinlinecompositionPostQueryParameters5BoxedBoolean](#fakeinlinecompositionpostqueryparameters5boxedboolean),
[FakeinlinecompositionPostQueryParameters5BoxedNumber](#fakeinlinecompositionpostqueryparameters5boxednumber),
[FakeinlinecompositionPostQueryParameters5BoxedString](#fakeinlinecompositionpostqueryparameters5boxedstring),
[FakeinlinecompositionPostQueryParameters5BoxedList](#fakeinlinecompositionpostqueryparameters5boxedlist),
[FakeinlinecompositionPostQueryParameters5BoxedMap](#fakeinlinecompositionpostqueryparameters5boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeinlinecompositionPostQueryParameters5BoxedVoid
public record FakeinlinecompositionPostQueryParameters5BoxedVoid<br>
implements [FakeinlinecompositionPostQueryParameters5Boxed](#fakeinlinecompositionpostqueryparameters5boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostQueryParameters5BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostQueryParameters5BoxedBoolean
public record FakeinlinecompositionPostQueryParameters5BoxedBoolean<br>
implements [FakeinlinecompositionPostQueryParameters5Boxed](#fakeinlinecompositionpostqueryparameters5boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostQueryParameters5BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostQueryParameters5BoxedNumber
public record FakeinlinecompositionPostQueryParameters5BoxedNumber<br>
implements [FakeinlinecompositionPostQueryParameters5Boxed](#fakeinlinecompositionpostqueryparameters5boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostQueryParameters5BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostQueryParameters5BoxedString
public record FakeinlinecompositionPostQueryParameters5BoxedString<br>
implements [FakeinlinecompositionPostQueryParameters5Boxed](#fakeinlinecompositionpostqueryparameters5boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostQueryParameters5BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostQueryParameters5BoxedList
public record FakeinlinecompositionPostQueryParameters5BoxedList<br>
implements [FakeinlinecompositionPostQueryParameters5Boxed](#fakeinlinecompositionpostqueryparameters5boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostQueryParameters5BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostQueryParameters5BoxedMap
public record FakeinlinecompositionPostQueryParameters5BoxedMap<br>
implements [FakeinlinecompositionPostQueryParameters5Boxed](#fakeinlinecompositionpostqueryparameters5boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostQueryParameters5BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeinlinecompositionPostQueryParameters5
public static class FakeinlinecompositionPostQueryParameters5<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
