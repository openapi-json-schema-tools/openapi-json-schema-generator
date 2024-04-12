# CommonparamsubdirPostPathParameters
public class CommonparamsubdirPostPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters1Boxed](#commonparamsubdirpostpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters1BoxedMap](#commonparamsubdirpostpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters1](#commonparamsubdirpostpathparameters1)<br> schema class |
| static class | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters8](#commonparamsubdirpostpathparameters8)<br> builder for Map payloads |
| static class | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters9](#commonparamsubdirpostpathparameters9)<br> output class for Map payloads |
| sealed interface | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters4Boxed](#commonparamsubdirpostpathparameters4boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters4BoxedVoid](#commonparamsubdirpostpathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters4BoxedBoolean](#commonparamsubdirpostpathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters4BoxedNumber](#commonparamsubdirpostpathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters4BoxedString](#commonparamsubdirpostpathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters4BoxedList](#commonparamsubdirpostpathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters4BoxedMap](#commonparamsubdirpostpathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters4](#commonparamsubdirpostpathparameters4)<br> schema class |

## CommonparamsubdirPostPathParameters1Boxed
public sealed interface CommonparamsubdirPostPathParameters1Boxed<br>
permits<br>
[CommonparamsubdirPostPathParameters1BoxedMap](#commonparamsubdirpostpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirPostPathParameters1BoxedMap
public record CommonparamsubdirPostPathParameters1BoxedMap<br>
implements [CommonparamsubdirPostPathParameters1Boxed](#commonparamsubdirpostpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostPathParameters1BoxedMap([CommonparamsubdirPostPathParameters9](#commonparamsubdirpostpathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirPostPathParameters9](#commonparamsubdirpostpathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostPathParameters1
public static class CommonparamsubdirPostPathParameters1<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.post.CommonparamsubdirPostPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters9 validatedPayload =
    CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters1.validate(
    new CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters8()
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
| Class<? extends JsonSchema> | additionalProperties = [CommonparamsubdirPostPathParameters4.class](#commonparamsubdirpostpathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirPostPathParameters9](#commonparamsubdirpostpathparameters9) | validate([Map&lt;?, ?&gt;](#commonparamsubdirpostpathparameters8) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirPostPathParameters1BoxedMap](#commonparamsubdirpostpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#commonparamsubdirpostpathparameters8) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirPostPathParameters1Boxed](#commonparamsubdirpostpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## CommonparamsubdirPostPathParameters10
public class CommonparamsubdirPostPathParameters10<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostPathParameters10(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## CommonparamsubdirPostPathParameters8
public class CommonparamsubdirPostPathParameters8<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostPathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirPostPathParameters10](#commonparamsubdirpostpathparameters10) | subDir(String value) |
| [CommonparamsubdirPostPathParameters10](#commonparamsubdirpostpathparameters10) | subDir([RouteParamSchema0.StringRouteParamSchemaEnums0](../../../paths/commonparamsubdir/parameters/routeparameter0/RouteParamSchema0.md#stringrouteparamschemaenums0) value) |

## CommonparamsubdirPostPathParameters9
public static class CommonparamsubdirPostPathParameters9<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CommonparamsubdirPostPathParameters9](#commonparamsubdirpostpathparameters9) | of([Map<String, String>](#commonparamsubdirpostpathparameters8) arg, SchemaConfiguration configuration) |
| String | subDir()<br> |

## CommonparamsubdirPostPathParameters4Boxed
public sealed interface CommonparamsubdirPostPathParameters4Boxed<br>
permits<br>
[CommonparamsubdirPostPathParameters4BoxedVoid](#commonparamsubdirpostpathparameters4boxedvoid),
[CommonparamsubdirPostPathParameters4BoxedBoolean](#commonparamsubdirpostpathparameters4boxedboolean),
[CommonparamsubdirPostPathParameters4BoxedNumber](#commonparamsubdirpostpathparameters4boxednumber),
[CommonparamsubdirPostPathParameters4BoxedString](#commonparamsubdirpostpathparameters4boxedstring),
[CommonparamsubdirPostPathParameters4BoxedList](#commonparamsubdirpostpathparameters4boxedlist),
[CommonparamsubdirPostPathParameters4BoxedMap](#commonparamsubdirpostpathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirPostPathParameters4BoxedVoid
public record CommonparamsubdirPostPathParameters4BoxedVoid<br>
implements [CommonparamsubdirPostPathParameters4Boxed](#commonparamsubdirpostpathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostPathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostPathParameters4BoxedBoolean
public record CommonparamsubdirPostPathParameters4BoxedBoolean<br>
implements [CommonparamsubdirPostPathParameters4Boxed](#commonparamsubdirpostpathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostPathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostPathParameters4BoxedNumber
public record CommonparamsubdirPostPathParameters4BoxedNumber<br>
implements [CommonparamsubdirPostPathParameters4Boxed](#commonparamsubdirpostpathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostPathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostPathParameters4BoxedString
public record CommonparamsubdirPostPathParameters4BoxedString<br>
implements [CommonparamsubdirPostPathParameters4Boxed](#commonparamsubdirpostpathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostPathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostPathParameters4BoxedList
public record CommonparamsubdirPostPathParameters4BoxedList<br>
implements [CommonparamsubdirPostPathParameters4Boxed](#commonparamsubdirpostpathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostPathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostPathParameters4BoxedMap
public record CommonparamsubdirPostPathParameters4BoxedMap<br>
implements [CommonparamsubdirPostPathParameters4Boxed](#commonparamsubdirpostpathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostPathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostPathParameters4
public static class CommonparamsubdirPostPathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
