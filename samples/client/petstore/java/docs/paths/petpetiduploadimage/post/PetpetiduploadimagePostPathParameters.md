# PetpetiduploadimagePostPathParameters
public class PetpetiduploadimagePostPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters1Boxed](#petpetiduploadimagepostpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters1BoxedMap](#petpetiduploadimagepostpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters1](#petpetiduploadimagepostpathparameters1)<br> schema class |
| static class | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters8](#petpetiduploadimagepostpathparameters8)<br> builder for Map payloads |
| static class | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters9](#petpetiduploadimagepostpathparameters9)<br> output class for Map payloads |
| sealed interface | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters4Boxed](#petpetiduploadimagepostpathparameters4boxed)<br> sealed interface for validated payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters4BoxedVoid](#petpetiduploadimagepostpathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters4BoxedBoolean](#petpetiduploadimagepostpathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters4BoxedNumber](#petpetiduploadimagepostpathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters4BoxedString](#petpetiduploadimagepostpathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters4BoxedList](#petpetiduploadimagepostpathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters4BoxedMap](#petpetiduploadimagepostpathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters4](#petpetiduploadimagepostpathparameters4)<br> schema class |

## PetpetiduploadimagePostPathParameters1Boxed
public sealed interface PetpetiduploadimagePostPathParameters1Boxed<br>
permits<br>
[PetpetiduploadimagePostPathParameters1BoxedMap](#petpetiduploadimagepostpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetiduploadimagePostPathParameters1BoxedMap
public record PetpetiduploadimagePostPathParameters1BoxedMap<br>
implements [PetpetiduploadimagePostPathParameters1Boxed](#petpetiduploadimagepostpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostPathParameters1BoxedMap([PetpetiduploadimagePostPathParameters9](#petpetiduploadimagepostpathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetiduploadimagePostPathParameters9](#petpetiduploadimagepostpathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostPathParameters1
public static class PetpetiduploadimagePostPathParameters1<br>
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
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters9 validatedPayload =
    PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters1.validate(
    new PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters8()
        .petId(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("petId", [Schema0.Schema01.class](../../../paths/petpetiduploadimage/post/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"petId"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetpetiduploadimagePostPathParameters4.class](#petpetiduploadimagepostpathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetiduploadimagePostPathParameters9](#petpetiduploadimagepostpathparameters9) | validate([Map&lt;?, ?&gt;](#petpetiduploadimagepostpathparameters8) arg, SchemaConfiguration configuration) |
| [PetpetiduploadimagePostPathParameters1BoxedMap](#petpetiduploadimagepostpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petpetiduploadimagepostpathparameters8) arg, SchemaConfiguration configuration) |
| [PetpetiduploadimagePostPathParameters1Boxed](#petpetiduploadimagepostpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetpetiduploadimagePostPathParameters10
public class PetpetiduploadimagePostPathParameters10<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostPathParameters10(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## PetpetiduploadimagePostPathParameters8
public class PetpetiduploadimagePostPathParameters8<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostPathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetiduploadimagePostPathParameters10](#petpetiduploadimagepostpathparameters10) | petId(int value) |
| [PetpetiduploadimagePostPathParameters10](#petpetiduploadimagepostpathparameters10) | petId(float value) |
| [PetpetiduploadimagePostPathParameters10](#petpetiduploadimagepostpathparameters10) | petId(long value) |
| [PetpetiduploadimagePostPathParameters10](#petpetiduploadimagepostpathparameters10) | petId(double value) |

## PetpetiduploadimagePostPathParameters9
public static class PetpetiduploadimagePostPathParameters9<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetpetiduploadimagePostPathParameters9](#petpetiduploadimagepostpathparameters9) | of([Map<String, Number>](#petpetiduploadimagepostpathparameters8) arg, SchemaConfiguration configuration) |
| Number | petId()<br> |

## PetpetiduploadimagePostPathParameters4Boxed
public sealed interface PetpetiduploadimagePostPathParameters4Boxed<br>
permits<br>
[PetpetiduploadimagePostPathParameters4BoxedVoid](#petpetiduploadimagepostpathparameters4boxedvoid),
[PetpetiduploadimagePostPathParameters4BoxedBoolean](#petpetiduploadimagepostpathparameters4boxedboolean),
[PetpetiduploadimagePostPathParameters4BoxedNumber](#petpetiduploadimagepostpathparameters4boxednumber),
[PetpetiduploadimagePostPathParameters4BoxedString](#petpetiduploadimagepostpathparameters4boxedstring),
[PetpetiduploadimagePostPathParameters4BoxedList](#petpetiduploadimagepostpathparameters4boxedlist),
[PetpetiduploadimagePostPathParameters4BoxedMap](#petpetiduploadimagepostpathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetiduploadimagePostPathParameters4BoxedVoid
public record PetpetiduploadimagePostPathParameters4BoxedVoid<br>
implements [PetpetiduploadimagePostPathParameters4Boxed](#petpetiduploadimagepostpathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostPathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostPathParameters4BoxedBoolean
public record PetpetiduploadimagePostPathParameters4BoxedBoolean<br>
implements [PetpetiduploadimagePostPathParameters4Boxed](#petpetiduploadimagepostpathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostPathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostPathParameters4BoxedNumber
public record PetpetiduploadimagePostPathParameters4BoxedNumber<br>
implements [PetpetiduploadimagePostPathParameters4Boxed](#petpetiduploadimagepostpathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostPathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostPathParameters4BoxedString
public record PetpetiduploadimagePostPathParameters4BoxedString<br>
implements [PetpetiduploadimagePostPathParameters4Boxed](#petpetiduploadimagepostpathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostPathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostPathParameters4BoxedList
public record PetpetiduploadimagePostPathParameters4BoxedList<br>
implements [PetpetiduploadimagePostPathParameters4Boxed](#petpetiduploadimagepostpathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostPathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostPathParameters4BoxedMap
public record PetpetiduploadimagePostPathParameters4BoxedMap<br>
implements [PetpetiduploadimagePostPathParameters4Boxed](#petpetiduploadimagepostpathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostPathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostPathParameters4
public static class PetpetiduploadimagePostPathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
