# PetpetidPostPathParameters
public class PetpetidPostPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetpetidPostPathParameters.PetpetidPostPathParameters1Boxed](#petpetidpostpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetpetidPostPathParameters.PetpetidPostPathParameters1BoxedMap](#petpetidpostpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidPostPathParameters.PetpetidPostPathParameters1](#petpetidpostpathparameters1)<br> schema class |
| static class | [PetpetidPostPathParameters.PetpetidPostPathParameters8](#petpetidpostpathparameters8)<br> builder for Map payloads |
| static class | [PetpetidPostPathParameters.PetpetidPostPathParameters9](#petpetidpostpathparameters9)<br> output class for Map payloads |
| sealed interface | [PetpetidPostPathParameters.PetpetidPostPathParameters4Boxed](#petpetidpostpathparameters4boxed)<br> sealed interface for validated payloads |
| record | [PetpetidPostPathParameters.PetpetidPostPathParameters4BoxedVoid](#petpetidpostpathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [PetpetidPostPathParameters.PetpetidPostPathParameters4BoxedBoolean](#petpetidpostpathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetpetidPostPathParameters.PetpetidPostPathParameters4BoxedNumber](#petpetidpostpathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [PetpetidPostPathParameters.PetpetidPostPathParameters4BoxedString](#petpetidpostpathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [PetpetidPostPathParameters.PetpetidPostPathParameters4BoxedList](#petpetidpostpathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [PetpetidPostPathParameters.PetpetidPostPathParameters4BoxedMap](#petpetidpostpathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidPostPathParameters.PetpetidPostPathParameters4](#petpetidpostpathparameters4)<br> schema class |

## PetpetidPostPathParameters1Boxed
public sealed interface PetpetidPostPathParameters1Boxed<br>
permits<br>
[PetpetidPostPathParameters1BoxedMap](#petpetidpostpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidPostPathParameters1BoxedMap
public record PetpetidPostPathParameters1BoxedMap<br>
implements [PetpetidPostPathParameters1Boxed](#petpetidpostpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostPathParameters1BoxedMap([PetpetidPostPathParameters9](#petpetidpostpathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidPostPathParameters9](#petpetidpostpathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostPathParameters1
public static class PetpetidPostPathParameters1<br>
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
import org.openapijsonschematools.client.paths.petpetid.post.PetpetidPostPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetpetidPostPathParameters.PetpetidPostPathParameters9 validatedPayload =
    PetpetidPostPathParameters.PetpetidPostPathParameters1.validate(
    new PetpetidPostPathParameters.PetpetidPostPathParameters8()
        .petId(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("petId", [Schema0.Schema01.class](../../../paths/petpetid/post/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"petId"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetpetidPostPathParameters4.class](#petpetidpostpathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidPostPathParameters9](#petpetidpostpathparameters9) | validate([Map&lt;?, ?&gt;](#petpetidpostpathparameters8) arg, SchemaConfiguration configuration) |
| [PetpetidPostPathParameters1BoxedMap](#petpetidpostpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petpetidpostpathparameters8) arg, SchemaConfiguration configuration) |
| [PetpetidPostPathParameters1Boxed](#petpetidpostpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetpetidPostPathParameters10
public class PetpetidPostPathParameters10<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostPathParameters10(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## PetpetidPostPathParameters8
public class PetpetidPostPathParameters8<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostPathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidPostPathParameters10](#petpetidpostpathparameters10) | petId(int value) |
| [PetpetidPostPathParameters10](#petpetidpostpathparameters10) | petId(float value) |
| [PetpetidPostPathParameters10](#petpetidpostpathparameters10) | petId(long value) |
| [PetpetidPostPathParameters10](#petpetidpostpathparameters10) | petId(double value) |

## PetpetidPostPathParameters9
public static class PetpetidPostPathParameters9<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetpetidPostPathParameters9](#petpetidpostpathparameters9) | of([Map<String, Number>](#petpetidpostpathparameters8) arg, SchemaConfiguration configuration) |
| Number | petId()<br> |

## PetpetidPostPathParameters4Boxed
public sealed interface PetpetidPostPathParameters4Boxed<br>
permits<br>
[PetpetidPostPathParameters4BoxedVoid](#petpetidpostpathparameters4boxedvoid),
[PetpetidPostPathParameters4BoxedBoolean](#petpetidpostpathparameters4boxedboolean),
[PetpetidPostPathParameters4BoxedNumber](#petpetidpostpathparameters4boxednumber),
[PetpetidPostPathParameters4BoxedString](#petpetidpostpathparameters4boxedstring),
[PetpetidPostPathParameters4BoxedList](#petpetidpostpathparameters4boxedlist),
[PetpetidPostPathParameters4BoxedMap](#petpetidpostpathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidPostPathParameters4BoxedVoid
public record PetpetidPostPathParameters4BoxedVoid<br>
implements [PetpetidPostPathParameters4Boxed](#petpetidpostpathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostPathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostPathParameters4BoxedBoolean
public record PetpetidPostPathParameters4BoxedBoolean<br>
implements [PetpetidPostPathParameters4Boxed](#petpetidpostpathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostPathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostPathParameters4BoxedNumber
public record PetpetidPostPathParameters4BoxedNumber<br>
implements [PetpetidPostPathParameters4Boxed](#petpetidpostpathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostPathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostPathParameters4BoxedString
public record PetpetidPostPathParameters4BoxedString<br>
implements [PetpetidPostPathParameters4Boxed](#petpetidpostpathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostPathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostPathParameters4BoxedList
public record PetpetidPostPathParameters4BoxedList<br>
implements [PetpetidPostPathParameters4Boxed](#petpetidpostpathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostPathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostPathParameters4BoxedMap
public record PetpetidPostPathParameters4BoxedMap<br>
implements [PetpetidPostPathParameters4Boxed](#petpetidpostpathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostPathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostPathParameters4
public static class PetpetidPostPathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
