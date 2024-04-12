# CommonparamsubdirGetPathParameters
public class CommonparamsubdirGetPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters1Boxed](#commonparamsubdirgetpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters1BoxedMap](#commonparamsubdirgetpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters1](#commonparamsubdirgetpathparameters1)<br> schema class |
| static class | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters8](#commonparamsubdirgetpathparameters8)<br> builder for Map payloads |
| static class | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters9](#commonparamsubdirgetpathparameters9)<br> output class for Map payloads |
| sealed interface | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters4Boxed](#commonparamsubdirgetpathparameters4boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters4BoxedVoid](#commonparamsubdirgetpathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters4BoxedBoolean](#commonparamsubdirgetpathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters4BoxedNumber](#commonparamsubdirgetpathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters4BoxedString](#commonparamsubdirgetpathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters4BoxedList](#commonparamsubdirgetpathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters4BoxedMap](#commonparamsubdirgetpathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters4](#commonparamsubdirgetpathparameters4)<br> schema class |

## CommonparamsubdirGetPathParameters1Boxed
public sealed interface CommonparamsubdirGetPathParameters1Boxed<br>
permits<br>
[CommonparamsubdirGetPathParameters1BoxedMap](#commonparamsubdirgetpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirGetPathParameters1BoxedMap
public record CommonparamsubdirGetPathParameters1BoxedMap<br>
implements [CommonparamsubdirGetPathParameters1Boxed](#commonparamsubdirgetpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetPathParameters1BoxedMap([CommonparamsubdirGetPathParameters9](#commonparamsubdirgetpathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirGetPathParameters9](#commonparamsubdirgetpathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetPathParameters1
public static class CommonparamsubdirGetPathParameters1<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.get.CommonparamsubdirGetPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters9 validatedPayload =
    CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters1.validate(
    new CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters8()
        .subDir("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("subDir", [RouteParamSchema0.RouteParamSchema01.class](../../../paths/commonparamsubdir/parameters/routeparameter0/RouteParamSchema0.md#routeparamschema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"subDir"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [CommonparamsubdirGetPathParameters4.class](#commonparamsubdirgetpathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirGetPathParameters9](#commonparamsubdirgetpathparameters9) | validate([Map&lt;?, ?&gt;](#commonparamsubdirgetpathparameters8) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirGetPathParameters1BoxedMap](#commonparamsubdirgetpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#commonparamsubdirgetpathparameters8) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirGetPathParameters1Boxed](#commonparamsubdirgetpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## CommonparamsubdirGetPathParameters10
public class CommonparamsubdirGetPathParameters10<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetPathParameters10(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## CommonparamsubdirGetPathParameters8
public class CommonparamsubdirGetPathParameters8<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetPathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirGetPathParameters10](#commonparamsubdirgetpathparameters10) | subDir(String value) |
| [CommonparamsubdirGetPathParameters10](#commonparamsubdirgetpathparameters10) | subDir([RouteParamSchema0.StringRouteParamSchemaEnums0](../../../paths/commonparamsubdir/parameters/routeparameter0/RouteParamSchema0.md#stringrouteparamschemaenums0) value) |

## CommonparamsubdirGetPathParameters9
public static class CommonparamsubdirGetPathParameters9<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CommonparamsubdirGetPathParameters9](#commonparamsubdirgetpathparameters9) | of([Map<String, String>](#commonparamsubdirgetpathparameters8) arg, SchemaConfiguration configuration) |
| String | subDir()<br> |

## CommonparamsubdirGetPathParameters4Boxed
public sealed interface CommonparamsubdirGetPathParameters4Boxed<br>
permits<br>
[CommonparamsubdirGetPathParameters4BoxedVoid](#commonparamsubdirgetpathparameters4boxedvoid),
[CommonparamsubdirGetPathParameters4BoxedBoolean](#commonparamsubdirgetpathparameters4boxedboolean),
[CommonparamsubdirGetPathParameters4BoxedNumber](#commonparamsubdirgetpathparameters4boxednumber),
[CommonparamsubdirGetPathParameters4BoxedString](#commonparamsubdirgetpathparameters4boxedstring),
[CommonparamsubdirGetPathParameters4BoxedList](#commonparamsubdirgetpathparameters4boxedlist),
[CommonparamsubdirGetPathParameters4BoxedMap](#commonparamsubdirgetpathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirGetPathParameters4BoxedVoid
public record CommonparamsubdirGetPathParameters4BoxedVoid<br>
implements [CommonparamsubdirGetPathParameters4Boxed](#commonparamsubdirgetpathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetPathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetPathParameters4BoxedBoolean
public record CommonparamsubdirGetPathParameters4BoxedBoolean<br>
implements [CommonparamsubdirGetPathParameters4Boxed](#commonparamsubdirgetpathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetPathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetPathParameters4BoxedNumber
public record CommonparamsubdirGetPathParameters4BoxedNumber<br>
implements [CommonparamsubdirGetPathParameters4Boxed](#commonparamsubdirgetpathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetPathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetPathParameters4BoxedString
public record CommonparamsubdirGetPathParameters4BoxedString<br>
implements [CommonparamsubdirGetPathParameters4Boxed](#commonparamsubdirgetpathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetPathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetPathParameters4BoxedList
public record CommonparamsubdirGetPathParameters4BoxedList<br>
implements [CommonparamsubdirGetPathParameters4Boxed](#commonparamsubdirgetpathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetPathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetPathParameters4BoxedMap
public record CommonparamsubdirGetPathParameters4BoxedMap<br>
implements [CommonparamsubdirGetPathParameters4Boxed](#commonparamsubdirgetpathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetPathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetPathParameters4
public static class CommonparamsubdirGetPathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
