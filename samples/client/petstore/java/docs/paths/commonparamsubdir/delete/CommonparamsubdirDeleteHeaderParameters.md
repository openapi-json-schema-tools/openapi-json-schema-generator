# CommonparamsubdirDeleteHeaderParameters
public class CommonparamsubdirDeleteHeaderParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters1Boxed](#commonparamsubdirdeleteheaderparameters1boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters1BoxedMap](#commonparamsubdirdeleteheaderparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters1](#commonparamsubdirdeleteheaderparameters1)<br> schema class |
| static class | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters8](#commonparamsubdirdeleteheaderparameters8)<br> builder for Map payloads |
| static class | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters9](#commonparamsubdirdeleteheaderparameters9)<br> output class for Map payloads |
| sealed interface | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters4Boxed](#commonparamsubdirdeleteheaderparameters4boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters4BoxedVoid](#commonparamsubdirdeleteheaderparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters4BoxedBoolean](#commonparamsubdirdeleteheaderparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters4BoxedNumber](#commonparamsubdirdeleteheaderparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters4BoxedString](#commonparamsubdirdeleteheaderparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters4BoxedList](#commonparamsubdirdeleteheaderparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters4BoxedMap](#commonparamsubdirdeleteheaderparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters4](#commonparamsubdirdeleteheaderparameters4)<br> schema class |

## CommonparamsubdirDeleteHeaderParameters1Boxed
public sealed interface CommonparamsubdirDeleteHeaderParameters1Boxed<br>
permits<br>
[CommonparamsubdirDeleteHeaderParameters1BoxedMap](#commonparamsubdirdeleteheaderparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirDeleteHeaderParameters1BoxedMap
public record CommonparamsubdirDeleteHeaderParameters1BoxedMap<br>
implements [CommonparamsubdirDeleteHeaderParameters1Boxed](#commonparamsubdirdeleteheaderparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteHeaderParameters1BoxedMap([CommonparamsubdirDeleteHeaderParameters9](#commonparamsubdirdeleteheaderparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirDeleteHeaderParameters9](#commonparamsubdirdeleteheaderparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteHeaderParameters1
public static class CommonparamsubdirDeleteHeaderParameters1<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.CommonparamsubdirDeleteHeaderParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters9 validatedPayload =
    CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters1.validate(
    new CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters8()
        .someHeader("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someHeader", [Schema0.Schema01.class](../../../paths/commonparamsubdir/delete/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [CommonparamsubdirDeleteHeaderParameters4.class](#commonparamsubdirdeleteheaderparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirDeleteHeaderParameters9](#commonparamsubdirdeleteheaderparameters9) | validate([Map&lt;?, ?&gt;](#commonparamsubdirdeleteheaderparameters8) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirDeleteHeaderParameters1BoxedMap](#commonparamsubdirdeleteheaderparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#commonparamsubdirdeleteheaderparameters8) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirDeleteHeaderParameters1Boxed](#commonparamsubdirdeleteheaderparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## CommonparamsubdirDeleteHeaderParameters8
public class CommonparamsubdirDeleteHeaderParameters8<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteHeaderParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [CommonparamsubdirDeleteHeaderParameters8](#commonparamsubdirdeleteheaderparameters8) | someHeader(String value) |

## CommonparamsubdirDeleteHeaderParameters9
public static class CommonparamsubdirDeleteHeaderParameters9<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CommonparamsubdirDeleteHeaderParameters9](#commonparamsubdirdeleteheaderparameters9) | of([Map<String, String>](#commonparamsubdirdeleteheaderparameters8) arg, SchemaConfiguration configuration) |
| String | someHeader()<br>[optional] |

## CommonparamsubdirDeleteHeaderParameters4Boxed
public sealed interface CommonparamsubdirDeleteHeaderParameters4Boxed<br>
permits<br>
[CommonparamsubdirDeleteHeaderParameters4BoxedVoid](#commonparamsubdirdeleteheaderparameters4boxedvoid),
[CommonparamsubdirDeleteHeaderParameters4BoxedBoolean](#commonparamsubdirdeleteheaderparameters4boxedboolean),
[CommonparamsubdirDeleteHeaderParameters4BoxedNumber](#commonparamsubdirdeleteheaderparameters4boxednumber),
[CommonparamsubdirDeleteHeaderParameters4BoxedString](#commonparamsubdirdeleteheaderparameters4boxedstring),
[CommonparamsubdirDeleteHeaderParameters4BoxedList](#commonparamsubdirdeleteheaderparameters4boxedlist),
[CommonparamsubdirDeleteHeaderParameters4BoxedMap](#commonparamsubdirdeleteheaderparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirDeleteHeaderParameters4BoxedVoid
public record CommonparamsubdirDeleteHeaderParameters4BoxedVoid<br>
implements [CommonparamsubdirDeleteHeaderParameters4Boxed](#commonparamsubdirdeleteheaderparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteHeaderParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteHeaderParameters4BoxedBoolean
public record CommonparamsubdirDeleteHeaderParameters4BoxedBoolean<br>
implements [CommonparamsubdirDeleteHeaderParameters4Boxed](#commonparamsubdirdeleteheaderparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteHeaderParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteHeaderParameters4BoxedNumber
public record CommonparamsubdirDeleteHeaderParameters4BoxedNumber<br>
implements [CommonparamsubdirDeleteHeaderParameters4Boxed](#commonparamsubdirdeleteheaderparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteHeaderParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteHeaderParameters4BoxedString
public record CommonparamsubdirDeleteHeaderParameters4BoxedString<br>
implements [CommonparamsubdirDeleteHeaderParameters4Boxed](#commonparamsubdirdeleteheaderparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteHeaderParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteHeaderParameters4BoxedList
public record CommonparamsubdirDeleteHeaderParameters4BoxedList<br>
implements [CommonparamsubdirDeleteHeaderParameters4Boxed](#commonparamsubdirdeleteheaderparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteHeaderParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteHeaderParameters4BoxedMap
public record CommonparamsubdirDeleteHeaderParameters4BoxedMap<br>
implements [CommonparamsubdirDeleteHeaderParameters4Boxed](#commonparamsubdirdeleteheaderparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteHeaderParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteHeaderParameters4
public static class CommonparamsubdirDeleteHeaderParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
