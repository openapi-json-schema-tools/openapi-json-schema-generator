# UserusernameDeletePathParameters
public class UserusernameDeletePathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UserusernameDeletePathParameters.UserusernameDeletePathParameters1Boxed](#userusernamedeletepathparameters1boxed)<br> sealed interface for validated payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeletePathParameters1BoxedMap](#userusernamedeletepathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserusernameDeletePathParameters.UserusernameDeletePathParameters1](#userusernamedeletepathparameters1)<br> schema class |
| static class | [UserusernameDeletePathParameters.UserusernameDeletePathParameters8](#userusernamedeletepathparameters8)<br> builder for Map payloads |
| static class | [UserusernameDeletePathParameters.UserusernameDeletePathParameters9](#userusernamedeletepathparameters9)<br> output class for Map payloads |
| sealed interface | [UserusernameDeletePathParameters.UserusernameDeletePathParameters4Boxed](#userusernamedeletepathparameters4boxed)<br> sealed interface for validated payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeletePathParameters4BoxedVoid](#userusernamedeletepathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeletePathParameters4BoxedBoolean](#userusernamedeletepathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeletePathParameters4BoxedNumber](#userusernamedeletepathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeletePathParameters4BoxedString](#userusernamedeletepathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeletePathParameters4BoxedList](#userusernamedeletepathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeletePathParameters4BoxedMap](#userusernamedeletepathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserusernameDeletePathParameters.UserusernameDeletePathParameters4](#userusernamedeletepathparameters4)<br> schema class |

## UserusernameDeletePathParameters1Boxed
public sealed interface UserusernameDeletePathParameters1Boxed<br>
permits<br>
[UserusernameDeletePathParameters1BoxedMap](#userusernamedeletepathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UserusernameDeletePathParameters1BoxedMap
public record UserusernameDeletePathParameters1BoxedMap<br>
implements [UserusernameDeletePathParameters1Boxed](#userusernamedeletepathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeletePathParameters1BoxedMap([UserusernameDeletePathParameters9](#userusernamedeletepathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameDeletePathParameters9](#userusernamedeletepathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeletePathParameters1
public static class UserusernameDeletePathParameters1<br>
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
import org.openapijsonschematools.client.paths.userusername.delete.UserusernameDeletePathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
UserusernameDeletePathParameters.UserusernameDeletePathParameters9 validatedPayload =
    UserusernameDeletePathParameters.UserusernameDeletePathParameters1.validate(
    new UserusernameDeletePathParameters.UserusernameDeletePathParameters8()
        .username("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("username", [Schema.Schema1.class](../../../components/parameters/pathusername/Schema.md#schema1))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"username"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [UserusernameDeletePathParameters4.class](#userusernamedeletepathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameDeletePathParameters9](#userusernamedeletepathparameters9) | validate([Map&lt;?, ?&gt;](#userusernamedeletepathparameters8) arg, SchemaConfiguration configuration) |
| [UserusernameDeletePathParameters1BoxedMap](#userusernamedeletepathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#userusernamedeletepathparameters8) arg, SchemaConfiguration configuration) |
| [UserusernameDeletePathParameters1Boxed](#userusernamedeletepathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UserusernameDeletePathParameters10
public class UserusernameDeletePathParameters10<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeletePathParameters10(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## UserusernameDeletePathParameters8
public class UserusernameDeletePathParameters8<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeletePathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameDeletePathParameters10](#userusernamedeletepathparameters10) | username(String value) |

## UserusernameDeletePathParameters9
public static class UserusernameDeletePathParameters9<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UserusernameDeletePathParameters9](#userusernamedeletepathparameters9) | of([Map<String, String>](#userusernamedeletepathparameters8) arg, SchemaConfiguration configuration) |
| String | username()<br> |

## UserusernameDeletePathParameters4Boxed
public sealed interface UserusernameDeletePathParameters4Boxed<br>
permits<br>
[UserusernameDeletePathParameters4BoxedVoid](#userusernamedeletepathparameters4boxedvoid),
[UserusernameDeletePathParameters4BoxedBoolean](#userusernamedeletepathparameters4boxedboolean),
[UserusernameDeletePathParameters4BoxedNumber](#userusernamedeletepathparameters4boxednumber),
[UserusernameDeletePathParameters4BoxedString](#userusernamedeletepathparameters4boxedstring),
[UserusernameDeletePathParameters4BoxedList](#userusernamedeletepathparameters4boxedlist),
[UserusernameDeletePathParameters4BoxedMap](#userusernamedeletepathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## UserusernameDeletePathParameters4BoxedVoid
public record UserusernameDeletePathParameters4BoxedVoid<br>
implements [UserusernameDeletePathParameters4Boxed](#userusernamedeletepathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeletePathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeletePathParameters4BoxedBoolean
public record UserusernameDeletePathParameters4BoxedBoolean<br>
implements [UserusernameDeletePathParameters4Boxed](#userusernamedeletepathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeletePathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeletePathParameters4BoxedNumber
public record UserusernameDeletePathParameters4BoxedNumber<br>
implements [UserusernameDeletePathParameters4Boxed](#userusernamedeletepathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeletePathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeletePathParameters4BoxedString
public record UserusernameDeletePathParameters4BoxedString<br>
implements [UserusernameDeletePathParameters4Boxed](#userusernamedeletepathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeletePathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeletePathParameters4BoxedList
public record UserusernameDeletePathParameters4BoxedList<br>
implements [UserusernameDeletePathParameters4Boxed](#userusernamedeletepathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeletePathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeletePathParameters4BoxedMap
public record UserusernameDeletePathParameters4BoxedMap<br>
implements [UserusernameDeletePathParameters4Boxed](#userusernamedeletepathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeletePathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeletePathParameters4
public static class UserusernameDeletePathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
