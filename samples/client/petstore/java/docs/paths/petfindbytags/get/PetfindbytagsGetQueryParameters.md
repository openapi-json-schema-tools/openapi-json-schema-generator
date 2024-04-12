# PetfindbytagsGetQueryParameters
public class PetfindbytagsGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters1Boxed](#petfindbytagsgetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters1BoxedMap](#petfindbytagsgetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters1](#petfindbytagsgetqueryparameters1)<br> schema class |
| static class | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters8](#petfindbytagsgetqueryparameters8)<br> builder for Map payloads |
| static class | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters9](#petfindbytagsgetqueryparameters9)<br> output class for Map payloads |
| sealed interface | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters4Boxed](#petfindbytagsgetqueryparameters4boxed)<br> sealed interface for validated payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters4BoxedVoid](#petfindbytagsgetqueryparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters4BoxedBoolean](#petfindbytagsgetqueryparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters4BoxedNumber](#petfindbytagsgetqueryparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters4BoxedString](#petfindbytagsgetqueryparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters4BoxedList](#petfindbytagsgetqueryparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters4BoxedMap](#petfindbytagsgetqueryparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters4](#petfindbytagsgetqueryparameters4)<br> schema class |

## PetfindbytagsGetQueryParameters1Boxed
public sealed interface PetfindbytagsGetQueryParameters1Boxed<br>
permits<br>
[PetfindbytagsGetQueryParameters1BoxedMap](#petfindbytagsgetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetfindbytagsGetQueryParameters1BoxedMap
public record PetfindbytagsGetQueryParameters1BoxedMap<br>
implements [PetfindbytagsGetQueryParameters1Boxed](#petfindbytagsgetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetQueryParameters1BoxedMap([PetfindbytagsGetQueryParameters9](#petfindbytagsgetqueryparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbytagsGetQueryParameters9](#petfindbytagsgetqueryparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetQueryParameters1
public static class PetfindbytagsGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.petfindbytags.get.PetfindbytagsGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters9 validatedPayload =
    PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters1.validate(
    new PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters8()
        .tags(
            Arrays.asList(
                "a"
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("tags", [Schema0.Schema01.class](../../../paths/petfindbytags/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"tags"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetfindbytagsGetQueryParameters4.class](#petfindbytagsgetqueryparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbytagsGetQueryParameters9](#petfindbytagsgetqueryparameters9) | validate([Map&lt;?, ?&gt;](#petfindbytagsgetqueryparameters8) arg, SchemaConfiguration configuration) |
| [PetfindbytagsGetQueryParameters1BoxedMap](#petfindbytagsgetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petfindbytagsgetqueryparameters8) arg, SchemaConfiguration configuration) |
| [PetfindbytagsGetQueryParameters1Boxed](#petfindbytagsgetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetfindbytagsGetQueryParameters10
public class PetfindbytagsGetQueryParameters10<br>
builder for `Map<String, List<String>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetQueryParameters10(Map<String, List<String>> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, List<String>> | build()<br>Returns map input that should be used with Schema.validate |

## PetfindbytagsGetQueryParameters8
public class PetfindbytagsGetQueryParameters8<br>
builder for `Map<String, List<String>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetQueryParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbytagsGetQueryParameters10](#petfindbytagsgetqueryparameters10) | tags(List<String> value) |

## PetfindbytagsGetQueryParameters9
public static class PetfindbytagsGetQueryParameters9<br>
extends FrozenMap<String, Schema0.SchemaList0>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetfindbytagsGetQueryParameters9](#petfindbytagsgetqueryparameters9) | of([Map<String, List<String>>](#petfindbytagsgetqueryparameters8) arg, SchemaConfiguration configuration) |
| [Schema0.SchemaList0](../../../paths/petfindbytags/get/parameters/parameter0/Schema0.md#schemalist0) | tags()<br> |

## PetfindbytagsGetQueryParameters4Boxed
public sealed interface PetfindbytagsGetQueryParameters4Boxed<br>
permits<br>
[PetfindbytagsGetQueryParameters4BoxedVoid](#petfindbytagsgetqueryparameters4boxedvoid),
[PetfindbytagsGetQueryParameters4BoxedBoolean](#petfindbytagsgetqueryparameters4boxedboolean),
[PetfindbytagsGetQueryParameters4BoxedNumber](#petfindbytagsgetqueryparameters4boxednumber),
[PetfindbytagsGetQueryParameters4BoxedString](#petfindbytagsgetqueryparameters4boxedstring),
[PetfindbytagsGetQueryParameters4BoxedList](#petfindbytagsgetqueryparameters4boxedlist),
[PetfindbytagsGetQueryParameters4BoxedMap](#petfindbytagsgetqueryparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetfindbytagsGetQueryParameters4BoxedVoid
public record PetfindbytagsGetQueryParameters4BoxedVoid<br>
implements [PetfindbytagsGetQueryParameters4Boxed](#petfindbytagsgetqueryparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetQueryParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetQueryParameters4BoxedBoolean
public record PetfindbytagsGetQueryParameters4BoxedBoolean<br>
implements [PetfindbytagsGetQueryParameters4Boxed](#petfindbytagsgetqueryparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetQueryParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetQueryParameters4BoxedNumber
public record PetfindbytagsGetQueryParameters4BoxedNumber<br>
implements [PetfindbytagsGetQueryParameters4Boxed](#petfindbytagsgetqueryparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetQueryParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetQueryParameters4BoxedString
public record PetfindbytagsGetQueryParameters4BoxedString<br>
implements [PetfindbytagsGetQueryParameters4Boxed](#petfindbytagsgetqueryparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetQueryParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetQueryParameters4BoxedList
public record PetfindbytagsGetQueryParameters4BoxedList<br>
implements [PetfindbytagsGetQueryParameters4Boxed](#petfindbytagsgetqueryparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetQueryParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetQueryParameters4BoxedMap
public record PetfindbytagsGetQueryParameters4BoxedMap<br>
implements [PetfindbytagsGetQueryParameters4Boxed](#petfindbytagsgetqueryparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetQueryParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetQueryParameters4
public static class PetfindbytagsGetQueryParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
