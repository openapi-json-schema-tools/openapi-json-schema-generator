# PetpetidDeletePathParameters
public class PetpetidDeletePathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetpetidDeletePathParameters.PetpetidDeletePathParameters1Boxed](#petpetiddeletepathparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeletePathParameters1BoxedMap](#petpetiddeletepathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidDeletePathParameters.PetpetidDeletePathParameters1](#petpetiddeletepathparameters1)<br> schema class |
| static class | [PetpetidDeletePathParameters.PetpetidDeletePathParameters8](#petpetiddeletepathparameters8)<br> builder for Map payloads |
| static class | [PetpetidDeletePathParameters.PetpetidDeletePathParameters9](#petpetiddeletepathparameters9)<br> output class for Map payloads |
| sealed interface | [PetpetidDeletePathParameters.PetpetidDeletePathParameters4Boxed](#petpetiddeletepathparameters4boxed)<br> sealed interface for validated payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeletePathParameters4BoxedVoid](#petpetiddeletepathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeletePathParameters4BoxedBoolean](#petpetiddeletepathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeletePathParameters4BoxedNumber](#petpetiddeletepathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeletePathParameters4BoxedString](#petpetiddeletepathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeletePathParameters4BoxedList](#petpetiddeletepathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeletePathParameters4BoxedMap](#petpetiddeletepathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidDeletePathParameters.PetpetidDeletePathParameters4](#petpetiddeletepathparameters4)<br> schema class |

## PetpetidDeletePathParameters1Boxed
public sealed interface PetpetidDeletePathParameters1Boxed<br>
permits<br>
[PetpetidDeletePathParameters1BoxedMap](#petpetiddeletepathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidDeletePathParameters1BoxedMap
public record PetpetidDeletePathParameters1BoxedMap<br>
implements [PetpetidDeletePathParameters1Boxed](#petpetiddeletepathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeletePathParameters1BoxedMap([PetpetidDeletePathParameters9](#petpetiddeletepathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidDeletePathParameters9](#petpetiddeletepathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeletePathParameters1
public static class PetpetidDeletePathParameters1<br>
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
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeletePathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetpetidDeletePathParameters.PetpetidDeletePathParameters9 validatedPayload =
    PetpetidDeletePathParameters.PetpetidDeletePathParameters1.validate(
    new PetpetidDeletePathParameters.PetpetidDeletePathParameters8()
        .petId(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("petId", [Schema1.Schema11.class](../../../paths/petpetid/delete/parameters/parameter1/Schema1.md#schema11))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"petId"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetpetidDeletePathParameters4.class](#petpetiddeletepathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidDeletePathParameters9](#petpetiddeletepathparameters9) | validate([Map&lt;?, ?&gt;](#petpetiddeletepathparameters8) arg, SchemaConfiguration configuration) |
| [PetpetidDeletePathParameters1BoxedMap](#petpetiddeletepathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petpetiddeletepathparameters8) arg, SchemaConfiguration configuration) |
| [PetpetidDeletePathParameters1Boxed](#petpetiddeletepathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetpetidDeletePathParameters10
public class PetpetidDeletePathParameters10<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeletePathParameters10(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## PetpetidDeletePathParameters8
public class PetpetidDeletePathParameters8<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeletePathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidDeletePathParameters10](#petpetiddeletepathparameters10) | petId(int value) |
| [PetpetidDeletePathParameters10](#petpetiddeletepathparameters10) | petId(float value) |
| [PetpetidDeletePathParameters10](#petpetiddeletepathparameters10) | petId(long value) |
| [PetpetidDeletePathParameters10](#petpetiddeletepathparameters10) | petId(double value) |

## PetpetidDeletePathParameters9
public static class PetpetidDeletePathParameters9<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetpetidDeletePathParameters9](#petpetiddeletepathparameters9) | of([Map<String, Number>](#petpetiddeletepathparameters8) arg, SchemaConfiguration configuration) |
| Number | petId()<br> |

## PetpetidDeletePathParameters4Boxed
public sealed interface PetpetidDeletePathParameters4Boxed<br>
permits<br>
[PetpetidDeletePathParameters4BoxedVoid](#petpetiddeletepathparameters4boxedvoid),
[PetpetidDeletePathParameters4BoxedBoolean](#petpetiddeletepathparameters4boxedboolean),
[PetpetidDeletePathParameters4BoxedNumber](#petpetiddeletepathparameters4boxednumber),
[PetpetidDeletePathParameters4BoxedString](#petpetiddeletepathparameters4boxedstring),
[PetpetidDeletePathParameters4BoxedList](#petpetiddeletepathparameters4boxedlist),
[PetpetidDeletePathParameters4BoxedMap](#petpetiddeletepathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidDeletePathParameters4BoxedVoid
public record PetpetidDeletePathParameters4BoxedVoid<br>
implements [PetpetidDeletePathParameters4Boxed](#petpetiddeletepathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeletePathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeletePathParameters4BoxedBoolean
public record PetpetidDeletePathParameters4BoxedBoolean<br>
implements [PetpetidDeletePathParameters4Boxed](#petpetiddeletepathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeletePathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeletePathParameters4BoxedNumber
public record PetpetidDeletePathParameters4BoxedNumber<br>
implements [PetpetidDeletePathParameters4Boxed](#petpetiddeletepathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeletePathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeletePathParameters4BoxedString
public record PetpetidDeletePathParameters4BoxedString<br>
implements [PetpetidDeletePathParameters4Boxed](#petpetiddeletepathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeletePathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeletePathParameters4BoxedList
public record PetpetidDeletePathParameters4BoxedList<br>
implements [PetpetidDeletePathParameters4Boxed](#petpetiddeletepathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeletePathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeletePathParameters4BoxedMap
public record PetpetidDeletePathParameters4BoxedMap<br>
implements [PetpetidDeletePathParameters4Boxed](#petpetiddeletepathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeletePathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeletePathParameters4
public static class PetpetidDeletePathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
