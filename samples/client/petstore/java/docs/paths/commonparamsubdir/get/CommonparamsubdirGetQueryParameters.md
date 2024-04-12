# CommonparamsubdirGetQueryParameters
public class CommonparamsubdirGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters1Boxed](#commonparamsubdirgetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters1BoxedMap](#commonparamsubdirgetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters1](#commonparamsubdirgetqueryparameters1)<br> schema class |
| static class | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters8](#commonparamsubdirgetqueryparameters8)<br> builder for Map payloads |
| static class | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters9](#commonparamsubdirgetqueryparameters9)<br> output class for Map payloads |
| sealed interface | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters4Boxed](#commonparamsubdirgetqueryparameters4boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters4BoxedVoid](#commonparamsubdirgetqueryparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters4BoxedBoolean](#commonparamsubdirgetqueryparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters4BoxedNumber](#commonparamsubdirgetqueryparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters4BoxedString](#commonparamsubdirgetqueryparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters4BoxedList](#commonparamsubdirgetqueryparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters4BoxedMap](#commonparamsubdirgetqueryparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters4](#commonparamsubdirgetqueryparameters4)<br> schema class |

## CommonparamsubdirGetQueryParameters1Boxed
public sealed interface CommonparamsubdirGetQueryParameters1Boxed<br>
permits<br>
[CommonparamsubdirGetQueryParameters1BoxedMap](#commonparamsubdirgetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirGetQueryParameters1BoxedMap
public record CommonparamsubdirGetQueryParameters1BoxedMap<br>
implements [CommonparamsubdirGetQueryParameters1Boxed](#commonparamsubdirgetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetQueryParameters1BoxedMap([CommonparamsubdirGetQueryParameters9](#commonparamsubdirgetqueryparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirGetQueryParameters9](#commonparamsubdirgetqueryparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetQueryParameters1
public static class CommonparamsubdirGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.get.CommonparamsubdirGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters9 validatedPayload =
    CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters1.validate(
    new CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters8()
        .searchStr("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("searchStr", [Schema0.Schema01.class](../../../paths/commonparamsubdir/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [CommonparamsubdirGetQueryParameters4.class](#commonparamsubdirgetqueryparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirGetQueryParameters9](#commonparamsubdirgetqueryparameters9) | validate([Map&lt;?, ?&gt;](#commonparamsubdirgetqueryparameters8) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirGetQueryParameters1BoxedMap](#commonparamsubdirgetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#commonparamsubdirgetqueryparameters8) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirGetQueryParameters1Boxed](#commonparamsubdirgetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## CommonparamsubdirGetQueryParameters8
public class CommonparamsubdirGetQueryParameters8<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetQueryParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [CommonparamsubdirGetQueryParameters8](#commonparamsubdirgetqueryparameters8) | searchStr(String value) |

## CommonparamsubdirGetQueryParameters9
public static class CommonparamsubdirGetQueryParameters9<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CommonparamsubdirGetQueryParameters9](#commonparamsubdirgetqueryparameters9) | of([Map<String, String>](#commonparamsubdirgetqueryparameters8) arg, SchemaConfiguration configuration) |
| String | searchStr()<br>[optional] |

## CommonparamsubdirGetQueryParameters4Boxed
public sealed interface CommonparamsubdirGetQueryParameters4Boxed<br>
permits<br>
[CommonparamsubdirGetQueryParameters4BoxedVoid](#commonparamsubdirgetqueryparameters4boxedvoid),
[CommonparamsubdirGetQueryParameters4BoxedBoolean](#commonparamsubdirgetqueryparameters4boxedboolean),
[CommonparamsubdirGetQueryParameters4BoxedNumber](#commonparamsubdirgetqueryparameters4boxednumber),
[CommonparamsubdirGetQueryParameters4BoxedString](#commonparamsubdirgetqueryparameters4boxedstring),
[CommonparamsubdirGetQueryParameters4BoxedList](#commonparamsubdirgetqueryparameters4boxedlist),
[CommonparamsubdirGetQueryParameters4BoxedMap](#commonparamsubdirgetqueryparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirGetQueryParameters4BoxedVoid
public record CommonparamsubdirGetQueryParameters4BoxedVoid<br>
implements [CommonparamsubdirGetQueryParameters4Boxed](#commonparamsubdirgetqueryparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetQueryParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetQueryParameters4BoxedBoolean
public record CommonparamsubdirGetQueryParameters4BoxedBoolean<br>
implements [CommonparamsubdirGetQueryParameters4Boxed](#commonparamsubdirgetqueryparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetQueryParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetQueryParameters4BoxedNumber
public record CommonparamsubdirGetQueryParameters4BoxedNumber<br>
implements [CommonparamsubdirGetQueryParameters4Boxed](#commonparamsubdirgetqueryparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetQueryParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetQueryParameters4BoxedString
public record CommonparamsubdirGetQueryParameters4BoxedString<br>
implements [CommonparamsubdirGetQueryParameters4Boxed](#commonparamsubdirgetqueryparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetQueryParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetQueryParameters4BoxedList
public record CommonparamsubdirGetQueryParameters4BoxedList<br>
implements [CommonparamsubdirGetQueryParameters4Boxed](#commonparamsubdirgetqueryparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetQueryParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetQueryParameters4BoxedMap
public record CommonparamsubdirGetQueryParameters4BoxedMap<br>
implements [CommonparamsubdirGetQueryParameters4Boxed](#commonparamsubdirgetqueryparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetQueryParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetQueryParameters4
public static class CommonparamsubdirGetQueryParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
