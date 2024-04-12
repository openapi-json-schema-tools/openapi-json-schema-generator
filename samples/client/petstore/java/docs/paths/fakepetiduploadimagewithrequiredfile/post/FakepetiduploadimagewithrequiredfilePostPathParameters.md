# FakepetiduploadimagewithrequiredfilePostPathParameters
public class FakepetiduploadimagewithrequiredfilePostPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap](#fakepetiduploadimagewithrequiredfilepostpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters1](#fakepetiduploadimagewithrequiredfilepostpathparameters1)<br> schema class |
| static class | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters8](#fakepetiduploadimagewithrequiredfilepostpathparameters8)<br> builder for Map payloads |
| static class | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters9](#fakepetiduploadimagewithrequiredfilepostpathparameters9)<br> output class for Map payloads |
| sealed interface | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters4Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxed)<br> sealed interface for validated payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedVoid](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedBoolean](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedNumber](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedString](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedList](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedMap](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters4](#fakepetiduploadimagewithrequiredfilepostpathparameters4)<br> schema class |

## FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed
public sealed interface FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed<br>
permits<br>
[FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap](#fakepetiduploadimagewithrequiredfilepostpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap
public record FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap<br>
implements [FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap([FakepetiduploadimagewithrequiredfilePostPathParameters9](#fakepetiduploadimagewithrequiredfilepostpathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakepetiduploadimagewithrequiredfilePostPathParameters9](#fakepetiduploadimagewithrequiredfilepostpathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostPathParameters1
public static class FakepetiduploadimagewithrequiredfilePostPathParameters1<br>
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
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters9 validatedPayload =
    FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters1.validate(
    new FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters8()
        .petId(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("petId", [Schema0.Schema01.class](../../../paths/fakepetiduploadimagewithrequiredfile/post/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"petId"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakepetiduploadimagewithrequiredfilePostPathParameters4.class](#fakepetiduploadimagewithrequiredfilepostpathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakepetiduploadimagewithrequiredfilePostPathParameters9](#fakepetiduploadimagewithrequiredfilepostpathparameters9) | validate([Map&lt;?, ?&gt;](#fakepetiduploadimagewithrequiredfilepostpathparameters8) arg, SchemaConfiguration configuration) |
| [FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap](#fakepetiduploadimagewithrequiredfilepostpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakepetiduploadimagewithrequiredfilepostpathparameters8) arg, SchemaConfiguration configuration) |
| [FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakepetiduploadimagewithrequiredfilePostPathParameters10
public class FakepetiduploadimagewithrequiredfilePostPathParameters10<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostPathParameters10(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## FakepetiduploadimagewithrequiredfilePostPathParameters8
public class FakepetiduploadimagewithrequiredfilePostPathParameters8<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostPathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakepetiduploadimagewithrequiredfilePostPathParameters10](#fakepetiduploadimagewithrequiredfilepostpathparameters10) | petId(int value) |
| [FakepetiduploadimagewithrequiredfilePostPathParameters10](#fakepetiduploadimagewithrequiredfilepostpathparameters10) | petId(float value) |
| [FakepetiduploadimagewithrequiredfilePostPathParameters10](#fakepetiduploadimagewithrequiredfilepostpathparameters10) | petId(long value) |
| [FakepetiduploadimagewithrequiredfilePostPathParameters10](#fakepetiduploadimagewithrequiredfilepostpathparameters10) | petId(double value) |

## FakepetiduploadimagewithrequiredfilePostPathParameters9
public static class FakepetiduploadimagewithrequiredfilePostPathParameters9<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakepetiduploadimagewithrequiredfilePostPathParameters9](#fakepetiduploadimagewithrequiredfilepostpathparameters9) | of([Map<String, Number>](#fakepetiduploadimagewithrequiredfilepostpathparameters8) arg, SchemaConfiguration configuration) |
| Number | petId()<br> |

## FakepetiduploadimagewithrequiredfilePostPathParameters4Boxed
public sealed interface FakepetiduploadimagewithrequiredfilePostPathParameters4Boxed<br>
permits<br>
[FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedVoid](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxedvoid),
[FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedBoolean](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxedboolean),
[FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedNumber](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxednumber),
[FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedString](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxedstring),
[FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedList](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxedlist),
[FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedMap](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedVoid
public record FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedVoid<br>
implements [FakepetiduploadimagewithrequiredfilePostPathParameters4Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedBoolean
public record FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedBoolean<br>
implements [FakepetiduploadimagewithrequiredfilePostPathParameters4Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedNumber
public record FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedNumber<br>
implements [FakepetiduploadimagewithrequiredfilePostPathParameters4Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedString
public record FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedString<br>
implements [FakepetiduploadimagewithrequiredfilePostPathParameters4Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedList
public record FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedList<br>
implements [FakepetiduploadimagewithrequiredfilePostPathParameters4Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedMap
public record FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedMap<br>
implements [FakepetiduploadimagewithrequiredfilePostPathParameters4Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostPathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostPathParameters4
public static class FakepetiduploadimagewithrequiredfilePostPathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
