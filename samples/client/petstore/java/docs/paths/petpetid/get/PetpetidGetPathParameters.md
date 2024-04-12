# PetpetidGetPathParameters
public class PetpetidGetPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetpetidGetPathParameters.PetpetidGetPathParameters1Boxed](#petpetidgetpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetpetidGetPathParameters.PetpetidGetPathParameters1BoxedMap](#petpetidgetpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidGetPathParameters.PetpetidGetPathParameters1](#petpetidgetpathparameters1)<br> schema class |
| static class | [PetpetidGetPathParameters.PetpetidGetPathParameters8](#petpetidgetpathparameters8)<br> builder for Map payloads |
| static class | [PetpetidGetPathParameters.PetpetidGetPathParameters9](#petpetidgetpathparameters9)<br> output class for Map payloads |
| sealed interface | [PetpetidGetPathParameters.PetpetidGetPathParameters4Boxed](#petpetidgetpathparameters4boxed)<br> sealed interface for validated payloads |
| record | [PetpetidGetPathParameters.PetpetidGetPathParameters4BoxedVoid](#petpetidgetpathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [PetpetidGetPathParameters.PetpetidGetPathParameters4BoxedBoolean](#petpetidgetpathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetpetidGetPathParameters.PetpetidGetPathParameters4BoxedNumber](#petpetidgetpathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [PetpetidGetPathParameters.PetpetidGetPathParameters4BoxedString](#petpetidgetpathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [PetpetidGetPathParameters.PetpetidGetPathParameters4BoxedList](#petpetidgetpathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [PetpetidGetPathParameters.PetpetidGetPathParameters4BoxedMap](#petpetidgetpathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidGetPathParameters.PetpetidGetPathParameters4](#petpetidgetpathparameters4)<br> schema class |

## PetpetidGetPathParameters1Boxed
public sealed interface PetpetidGetPathParameters1Boxed<br>
permits<br>
[PetpetidGetPathParameters1BoxedMap](#petpetidgetpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidGetPathParameters1BoxedMap
public record PetpetidGetPathParameters1BoxedMap<br>
implements [PetpetidGetPathParameters1Boxed](#petpetidgetpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetPathParameters1BoxedMap([PetpetidGetPathParameters9](#petpetidgetpathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidGetPathParameters9](#petpetidgetpathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetPathParameters1
public static class PetpetidGetPathParameters1<br>
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
import org.openapijsonschematools.client.paths.petpetid.get.PetpetidGetPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetpetidGetPathParameters.PetpetidGetPathParameters9 validatedPayload =
    PetpetidGetPathParameters.PetpetidGetPathParameters1.validate(
    new PetpetidGetPathParameters.PetpetidGetPathParameters8()
        .petId(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("petId", [Schema0.Schema01.class](../../../paths/petpetid/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"petId"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetpetidGetPathParameters4.class](#petpetidgetpathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidGetPathParameters9](#petpetidgetpathparameters9) | validate([Map&lt;?, ?&gt;](#petpetidgetpathparameters8) arg, SchemaConfiguration configuration) |
| [PetpetidGetPathParameters1BoxedMap](#petpetidgetpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petpetidgetpathparameters8) arg, SchemaConfiguration configuration) |
| [PetpetidGetPathParameters1Boxed](#petpetidgetpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetpetidGetPathParameters10
public class PetpetidGetPathParameters10<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetPathParameters10(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## PetpetidGetPathParameters8
public class PetpetidGetPathParameters8<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetPathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidGetPathParameters10](#petpetidgetpathparameters10) | petId(int value) |
| [PetpetidGetPathParameters10](#petpetidgetpathparameters10) | petId(float value) |
| [PetpetidGetPathParameters10](#petpetidgetpathparameters10) | petId(long value) |
| [PetpetidGetPathParameters10](#petpetidgetpathparameters10) | petId(double value) |

## PetpetidGetPathParameters9
public static class PetpetidGetPathParameters9<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetpetidGetPathParameters9](#petpetidgetpathparameters9) | of([Map<String, Number>](#petpetidgetpathparameters8) arg, SchemaConfiguration configuration) |
| Number | petId()<br> |

## PetpetidGetPathParameters4Boxed
public sealed interface PetpetidGetPathParameters4Boxed<br>
permits<br>
[PetpetidGetPathParameters4BoxedVoid](#petpetidgetpathparameters4boxedvoid),
[PetpetidGetPathParameters4BoxedBoolean](#petpetidgetpathparameters4boxedboolean),
[PetpetidGetPathParameters4BoxedNumber](#petpetidgetpathparameters4boxednumber),
[PetpetidGetPathParameters4BoxedString](#petpetidgetpathparameters4boxedstring),
[PetpetidGetPathParameters4BoxedList](#petpetidgetpathparameters4boxedlist),
[PetpetidGetPathParameters4BoxedMap](#petpetidgetpathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidGetPathParameters4BoxedVoid
public record PetpetidGetPathParameters4BoxedVoid<br>
implements [PetpetidGetPathParameters4Boxed](#petpetidgetpathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetPathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetPathParameters4BoxedBoolean
public record PetpetidGetPathParameters4BoxedBoolean<br>
implements [PetpetidGetPathParameters4Boxed](#petpetidgetpathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetPathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetPathParameters4BoxedNumber
public record PetpetidGetPathParameters4BoxedNumber<br>
implements [PetpetidGetPathParameters4Boxed](#petpetidgetpathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetPathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetPathParameters4BoxedString
public record PetpetidGetPathParameters4BoxedString<br>
implements [PetpetidGetPathParameters4Boxed](#petpetidgetpathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetPathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetPathParameters4BoxedList
public record PetpetidGetPathParameters4BoxedList<br>
implements [PetpetidGetPathParameters4Boxed](#petpetidgetpathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetPathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetPathParameters4BoxedMap
public record PetpetidGetPathParameters4BoxedMap<br>
implements [PetpetidGetPathParameters4Boxed](#petpetidgetpathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetPathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetPathParameters4
public static class PetpetidGetPathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
