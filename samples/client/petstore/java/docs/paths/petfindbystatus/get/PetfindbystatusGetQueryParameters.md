# PetfindbystatusGetQueryParameters
public class PetfindbystatusGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1Boxed](#petfindbystatusgetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1BoxedMap](#petfindbystatusgetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1](#petfindbystatusgetqueryparameters1)<br> schema class |
| static class | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters8](#petfindbystatusgetqueryparameters8)<br> builder for Map payloads |
| static class | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters9](#petfindbystatusgetqueryparameters9)<br> output class for Map payloads |
| sealed interface | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters4Boxed](#petfindbystatusgetqueryparameters4boxed)<br> sealed interface for validated payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters4BoxedVoid](#petfindbystatusgetqueryparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters4BoxedBoolean](#petfindbystatusgetqueryparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters4BoxedNumber](#petfindbystatusgetqueryparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters4BoxedString](#petfindbystatusgetqueryparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters4BoxedList](#petfindbystatusgetqueryparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters4BoxedMap](#petfindbystatusgetqueryparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters4](#petfindbystatusgetqueryparameters4)<br> schema class |

## PetfindbystatusGetQueryParameters1Boxed
public sealed interface PetfindbystatusGetQueryParameters1Boxed<br>
permits<br>
[PetfindbystatusGetQueryParameters1BoxedMap](#petfindbystatusgetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetfindbystatusGetQueryParameters1BoxedMap
public record PetfindbystatusGetQueryParameters1BoxedMap<br>
implements [PetfindbystatusGetQueryParameters1Boxed](#petfindbystatusgetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParameters1BoxedMap([PetfindbystatusGetQueryParameters9](#petfindbystatusgetqueryparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbystatusGetQueryParameters9](#petfindbystatusgetqueryparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetQueryParameters1
public static class PetfindbystatusGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.petfindbystatus.get.PetfindbystatusGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters9 validatedPayload =
    PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1.validate(
    new PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters8()
        .status(
            Arrays.asList(
                "available"
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("status", [Schema0.Schema01.class](../../../paths/petfindbystatus/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"status"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetfindbystatusGetQueryParameters4.class](#petfindbystatusgetqueryparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbystatusGetQueryParameters9](#petfindbystatusgetqueryparameters9) | validate([Map&lt;?, ?&gt;](#petfindbystatusgetqueryparameters8) arg, SchemaConfiguration configuration) |
| [PetfindbystatusGetQueryParameters1BoxedMap](#petfindbystatusgetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petfindbystatusgetqueryparameters8) arg, SchemaConfiguration configuration) |
| [PetfindbystatusGetQueryParameters1Boxed](#petfindbystatusgetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetfindbystatusGetQueryParameters10
public class PetfindbystatusGetQueryParameters10<br>
builder for `Map<String, List<String>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParameters10(Map<String, List<String>> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, List<String>> | build()<br>Returns map input that should be used with Schema.validate |

## PetfindbystatusGetQueryParameters8
public class PetfindbystatusGetQueryParameters8<br>
builder for `Map<String, List<String>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbystatusGetQueryParameters10](#petfindbystatusgetqueryparameters10) | status(List<String> value) |

## PetfindbystatusGetQueryParameters9
public static class PetfindbystatusGetQueryParameters9<br>
extends FrozenMap<String, Schema0.SchemaList0>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetfindbystatusGetQueryParameters9](#petfindbystatusgetqueryparameters9) | of([Map<String, List<String>>](#petfindbystatusgetqueryparameters8) arg, SchemaConfiguration configuration) |
| [Schema0.SchemaList0](../../../paths/petfindbystatus/get/parameters/parameter0/Schema0.md#schemalist0) | status()<br> |

## PetfindbystatusGetQueryParameters4Boxed
public sealed interface PetfindbystatusGetQueryParameters4Boxed<br>
permits<br>
[PetfindbystatusGetQueryParameters4BoxedVoid](#petfindbystatusgetqueryparameters4boxedvoid),
[PetfindbystatusGetQueryParameters4BoxedBoolean](#petfindbystatusgetqueryparameters4boxedboolean),
[PetfindbystatusGetQueryParameters4BoxedNumber](#petfindbystatusgetqueryparameters4boxednumber),
[PetfindbystatusGetQueryParameters4BoxedString](#petfindbystatusgetqueryparameters4boxedstring),
[PetfindbystatusGetQueryParameters4BoxedList](#petfindbystatusgetqueryparameters4boxedlist),
[PetfindbystatusGetQueryParameters4BoxedMap](#petfindbystatusgetqueryparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetfindbystatusGetQueryParameters4BoxedVoid
public record PetfindbystatusGetQueryParameters4BoxedVoid<br>
implements [PetfindbystatusGetQueryParameters4Boxed](#petfindbystatusgetqueryparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetQueryParameters4BoxedBoolean
public record PetfindbystatusGetQueryParameters4BoxedBoolean<br>
implements [PetfindbystatusGetQueryParameters4Boxed](#petfindbystatusgetqueryparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetQueryParameters4BoxedNumber
public record PetfindbystatusGetQueryParameters4BoxedNumber<br>
implements [PetfindbystatusGetQueryParameters4Boxed](#petfindbystatusgetqueryparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetQueryParameters4BoxedString
public record PetfindbystatusGetQueryParameters4BoxedString<br>
implements [PetfindbystatusGetQueryParameters4Boxed](#petfindbystatusgetqueryparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetQueryParameters4BoxedList
public record PetfindbystatusGetQueryParameters4BoxedList<br>
implements [PetfindbystatusGetQueryParameters4Boxed](#petfindbystatusgetqueryparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetQueryParameters4BoxedMap
public record PetfindbystatusGetQueryParameters4BoxedMap<br>
implements [PetfindbystatusGetQueryParameters4Boxed](#petfindbystatusgetqueryparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetQueryParameters4
public static class PetfindbystatusGetQueryParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
