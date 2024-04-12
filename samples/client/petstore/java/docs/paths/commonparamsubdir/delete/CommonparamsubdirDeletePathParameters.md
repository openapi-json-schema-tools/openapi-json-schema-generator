# CommonparamsubdirDeletePathParameters
public class CommonparamsubdirDeletePathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters1Boxed](#commonparamsubdirdeletepathparameters1boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters1BoxedMap](#commonparamsubdirdeletepathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters1](#commonparamsubdirdeletepathparameters1)<br> schema class |
| static class | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters8](#commonparamsubdirdeletepathparameters8)<br> builder for Map payloads |
| static class | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters9](#commonparamsubdirdeletepathparameters9)<br> output class for Map payloads |
| sealed interface | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters4Boxed](#commonparamsubdirdeletepathparameters4boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters4BoxedVoid](#commonparamsubdirdeletepathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters4BoxedBoolean](#commonparamsubdirdeletepathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters4BoxedNumber](#commonparamsubdirdeletepathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters4BoxedString](#commonparamsubdirdeletepathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters4BoxedList](#commonparamsubdirdeletepathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters4BoxedMap](#commonparamsubdirdeletepathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters4](#commonparamsubdirdeletepathparameters4)<br> schema class |

## CommonparamsubdirDeletePathParameters1Boxed
public sealed interface CommonparamsubdirDeletePathParameters1Boxed<br>
permits<br>
[CommonparamsubdirDeletePathParameters1BoxedMap](#commonparamsubdirdeletepathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirDeletePathParameters1BoxedMap
public record CommonparamsubdirDeletePathParameters1BoxedMap<br>
implements [CommonparamsubdirDeletePathParameters1Boxed](#commonparamsubdirdeletepathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeletePathParameters1BoxedMap([CommonparamsubdirDeletePathParameters9](#commonparamsubdirdeletepathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirDeletePathParameters9](#commonparamsubdirdeletepathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeletePathParameters1
public static class CommonparamsubdirDeletePathParameters1<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.CommonparamsubdirDeletePathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters9 validatedPayload =
    CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters1.validate(
    new CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters8()
        .subDir("c")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("subDir", [Schema1.Schema11.class](../../../paths/commonparamsubdir/delete/parameters/parameter1/Schema1.md#schema11))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"subDir"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [CommonparamsubdirDeletePathParameters4.class](#commonparamsubdirdeletepathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirDeletePathParameters9](#commonparamsubdirdeletepathparameters9) | validate([Map&lt;?, ?&gt;](#commonparamsubdirdeletepathparameters8) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirDeletePathParameters1BoxedMap](#commonparamsubdirdeletepathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#commonparamsubdirdeletepathparameters8) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirDeletePathParameters1Boxed](#commonparamsubdirdeletepathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## CommonparamsubdirDeletePathParameters10
public class CommonparamsubdirDeletePathParameters10<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeletePathParameters10(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## CommonparamsubdirDeletePathParameters8
public class CommonparamsubdirDeletePathParameters8<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeletePathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirDeletePathParameters10](#commonparamsubdirdeletepathparameters10) | subDir(String value) |
| [CommonparamsubdirDeletePathParameters10](#commonparamsubdirdeletepathparameters10) | subDir([Schema1.StringSchemaEnums1](../../../paths/commonparamsubdir/delete/parameters/parameter1/Schema1.md#stringschemaenums1) value) |

## CommonparamsubdirDeletePathParameters9
public static class CommonparamsubdirDeletePathParameters9<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CommonparamsubdirDeletePathParameters9](#commonparamsubdirdeletepathparameters9) | of([Map<String, String>](#commonparamsubdirdeletepathparameters8) arg, SchemaConfiguration configuration) |
| String | subDir()<br> |

## CommonparamsubdirDeletePathParameters4Boxed
public sealed interface CommonparamsubdirDeletePathParameters4Boxed<br>
permits<br>
[CommonparamsubdirDeletePathParameters4BoxedVoid](#commonparamsubdirdeletepathparameters4boxedvoid),
[CommonparamsubdirDeletePathParameters4BoxedBoolean](#commonparamsubdirdeletepathparameters4boxedboolean),
[CommonparamsubdirDeletePathParameters4BoxedNumber](#commonparamsubdirdeletepathparameters4boxednumber),
[CommonparamsubdirDeletePathParameters4BoxedString](#commonparamsubdirdeletepathparameters4boxedstring),
[CommonparamsubdirDeletePathParameters4BoxedList](#commonparamsubdirdeletepathparameters4boxedlist),
[CommonparamsubdirDeletePathParameters4BoxedMap](#commonparamsubdirdeletepathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirDeletePathParameters4BoxedVoid
public record CommonparamsubdirDeletePathParameters4BoxedVoid<br>
implements [CommonparamsubdirDeletePathParameters4Boxed](#commonparamsubdirdeletepathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeletePathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeletePathParameters4BoxedBoolean
public record CommonparamsubdirDeletePathParameters4BoxedBoolean<br>
implements [CommonparamsubdirDeletePathParameters4Boxed](#commonparamsubdirdeletepathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeletePathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeletePathParameters4BoxedNumber
public record CommonparamsubdirDeletePathParameters4BoxedNumber<br>
implements [CommonparamsubdirDeletePathParameters4Boxed](#commonparamsubdirdeletepathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeletePathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeletePathParameters4BoxedString
public record CommonparamsubdirDeletePathParameters4BoxedString<br>
implements [CommonparamsubdirDeletePathParameters4Boxed](#commonparamsubdirdeletepathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeletePathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeletePathParameters4BoxedList
public record CommonparamsubdirDeletePathParameters4BoxedList<br>
implements [CommonparamsubdirDeletePathParameters4Boxed](#commonparamsubdirdeletepathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeletePathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeletePathParameters4BoxedMap
public record CommonparamsubdirDeletePathParameters4BoxedMap<br>
implements [CommonparamsubdirDeletePathParameters4Boxed](#commonparamsubdirdeletepathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeletePathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeletePathParameters4
public static class CommonparamsubdirDeletePathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
