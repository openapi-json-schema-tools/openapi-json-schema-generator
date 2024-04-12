# PetpetidDeleteHeaderParameters
public class PetpetidDeleteHeaderParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters1Boxed](#petpetiddeleteheaderparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters1BoxedMap](#petpetiddeleteheaderparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters1](#petpetiddeleteheaderparameters1)<br> schema class |
| static class | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters8](#petpetiddeleteheaderparameters8)<br> builder for Map payloads |
| static class | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters9](#petpetiddeleteheaderparameters9)<br> output class for Map payloads |
| sealed interface | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters4Boxed](#petpetiddeleteheaderparameters4boxed)<br> sealed interface for validated payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters4BoxedVoid](#petpetiddeleteheaderparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters4BoxedBoolean](#petpetiddeleteheaderparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters4BoxedNumber](#petpetiddeleteheaderparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters4BoxedString](#petpetiddeleteheaderparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters4BoxedList](#petpetiddeleteheaderparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters4BoxedMap](#petpetiddeleteheaderparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters4](#petpetiddeleteheaderparameters4)<br> schema class |

## PetpetidDeleteHeaderParameters1Boxed
public sealed interface PetpetidDeleteHeaderParameters1Boxed<br>
permits<br>
[PetpetidDeleteHeaderParameters1BoxedMap](#petpetiddeleteheaderparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidDeleteHeaderParameters1BoxedMap
public record PetpetidDeleteHeaderParameters1BoxedMap<br>
implements [PetpetidDeleteHeaderParameters1Boxed](#petpetiddeleteheaderparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteHeaderParameters1BoxedMap([PetpetidDeleteHeaderParameters9](#petpetiddeleteheaderparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidDeleteHeaderParameters9](#petpetiddeleteheaderparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteHeaderParameters1
public static class PetpetidDeleteHeaderParameters1<br>
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
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteHeaderParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters9 validatedPayload =
    PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters1.validate(
    new PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters8()
        .api_key("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("api_key", [Schema0.Schema01.class](../../../paths/petpetid/delete/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetpetidDeleteHeaderParameters4.class](#petpetiddeleteheaderparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidDeleteHeaderParameters9](#petpetiddeleteheaderparameters9) | validate([Map&lt;?, ?&gt;](#petpetiddeleteheaderparameters8) arg, SchemaConfiguration configuration) |
| [PetpetidDeleteHeaderParameters1BoxedMap](#petpetiddeleteheaderparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petpetiddeleteheaderparameters8) arg, SchemaConfiguration configuration) |
| [PetpetidDeleteHeaderParameters1Boxed](#petpetiddeleteheaderparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetpetidDeleteHeaderParameters8
public class PetpetidDeleteHeaderParameters8<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteHeaderParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [PetpetidDeleteHeaderParameters8](#petpetiddeleteheaderparameters8) | api_key(String value) |

## PetpetidDeleteHeaderParameters9
public static class PetpetidDeleteHeaderParameters9<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetpetidDeleteHeaderParameters9](#petpetiddeleteheaderparameters9) | of([Map<String, String>](#petpetiddeleteheaderparameters8) arg, SchemaConfiguration configuration) |
| String | api_key()<br>[optional] |

## PetpetidDeleteHeaderParameters4Boxed
public sealed interface PetpetidDeleteHeaderParameters4Boxed<br>
permits<br>
[PetpetidDeleteHeaderParameters4BoxedVoid](#petpetiddeleteheaderparameters4boxedvoid),
[PetpetidDeleteHeaderParameters4BoxedBoolean](#petpetiddeleteheaderparameters4boxedboolean),
[PetpetidDeleteHeaderParameters4BoxedNumber](#petpetiddeleteheaderparameters4boxednumber),
[PetpetidDeleteHeaderParameters4BoxedString](#petpetiddeleteheaderparameters4boxedstring),
[PetpetidDeleteHeaderParameters4BoxedList](#petpetiddeleteheaderparameters4boxedlist),
[PetpetidDeleteHeaderParameters4BoxedMap](#petpetiddeleteheaderparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidDeleteHeaderParameters4BoxedVoid
public record PetpetidDeleteHeaderParameters4BoxedVoid<br>
implements [PetpetidDeleteHeaderParameters4Boxed](#petpetiddeleteheaderparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteHeaderParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteHeaderParameters4BoxedBoolean
public record PetpetidDeleteHeaderParameters4BoxedBoolean<br>
implements [PetpetidDeleteHeaderParameters4Boxed](#petpetiddeleteheaderparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteHeaderParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteHeaderParameters4BoxedNumber
public record PetpetidDeleteHeaderParameters4BoxedNumber<br>
implements [PetpetidDeleteHeaderParameters4Boxed](#petpetiddeleteheaderparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteHeaderParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteHeaderParameters4BoxedString
public record PetpetidDeleteHeaderParameters4BoxedString<br>
implements [PetpetidDeleteHeaderParameters4Boxed](#petpetiddeleteheaderparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteHeaderParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteHeaderParameters4BoxedList
public record PetpetidDeleteHeaderParameters4BoxedList<br>
implements [PetpetidDeleteHeaderParameters4Boxed](#petpetiddeleteheaderparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteHeaderParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteHeaderParameters4BoxedMap
public record PetpetidDeleteHeaderParameters4BoxedMap<br>
implements [PetpetidDeleteHeaderParameters4Boxed](#petpetiddeleteheaderparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteHeaderParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteHeaderParameters4
public static class PetpetidDeleteHeaderParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
