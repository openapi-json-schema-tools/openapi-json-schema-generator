# UserusernameGetPathParameters
public class UserusernameGetPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UserusernameGetPathParameters.UserusernameGetPathParameters1Boxed](#userusernamegetpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [UserusernameGetPathParameters.UserusernameGetPathParameters1BoxedMap](#userusernamegetpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserusernameGetPathParameters.UserusernameGetPathParameters1](#userusernamegetpathparameters1)<br> schema class |
| static class | [UserusernameGetPathParameters.UserusernameGetPathParameters8](#userusernamegetpathparameters8)<br> builder for Map payloads |
| static class | [UserusernameGetPathParameters.UserusernameGetPathParameters9](#userusernamegetpathparameters9)<br> output class for Map payloads |
| sealed interface | [UserusernameGetPathParameters.UserusernameGetPathParameters4Boxed](#userusernamegetpathparameters4boxed)<br> sealed interface for validated payloads |
| record | [UserusernameGetPathParameters.UserusernameGetPathParameters4BoxedVoid](#userusernamegetpathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [UserusernameGetPathParameters.UserusernameGetPathParameters4BoxedBoolean](#userusernamegetpathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UserusernameGetPathParameters.UserusernameGetPathParameters4BoxedNumber](#userusernamegetpathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [UserusernameGetPathParameters.UserusernameGetPathParameters4BoxedString](#userusernamegetpathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [UserusernameGetPathParameters.UserusernameGetPathParameters4BoxedList](#userusernamegetpathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [UserusernameGetPathParameters.UserusernameGetPathParameters4BoxedMap](#userusernamegetpathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserusernameGetPathParameters.UserusernameGetPathParameters4](#userusernamegetpathparameters4)<br> schema class |

## UserusernameGetPathParameters1Boxed
public sealed interface UserusernameGetPathParameters1Boxed<br>
permits<br>
[UserusernameGetPathParameters1BoxedMap](#userusernamegetpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UserusernameGetPathParameters1BoxedMap
public record UserusernameGetPathParameters1BoxedMap<br>
implements [UserusernameGetPathParameters1Boxed](#userusernamegetpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetPathParameters1BoxedMap([UserusernameGetPathParameters9](#userusernamegetpathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameGetPathParameters9](#userusernamegetpathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetPathParameters1
public static class UserusernameGetPathParameters1<br>
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
import org.openapijsonschematools.client.paths.userusername.get.UserusernameGetPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
UserusernameGetPathParameters.UserusernameGetPathParameters9 validatedPayload =
    UserusernameGetPathParameters.UserusernameGetPathParameters1.validate(
    new UserusernameGetPathParameters.UserusernameGetPathParameters8()
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
| Class<? extends JsonSchema> | additionalProperties = [UserusernameGetPathParameters4.class](#userusernamegetpathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameGetPathParameters9](#userusernamegetpathparameters9) | validate([Map&lt;?, ?&gt;](#userusernamegetpathparameters8) arg, SchemaConfiguration configuration) |
| [UserusernameGetPathParameters1BoxedMap](#userusernamegetpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#userusernamegetpathparameters8) arg, SchemaConfiguration configuration) |
| [UserusernameGetPathParameters1Boxed](#userusernamegetpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UserusernameGetPathParameters10
public class UserusernameGetPathParameters10<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetPathParameters10(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## UserusernameGetPathParameters8
public class UserusernameGetPathParameters8<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetPathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameGetPathParameters10](#userusernamegetpathparameters10) | username(String value) |

## UserusernameGetPathParameters9
public static class UserusernameGetPathParameters9<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UserusernameGetPathParameters9](#userusernamegetpathparameters9) | of([Map<String, String>](#userusernamegetpathparameters8) arg, SchemaConfiguration configuration) |
| String | username()<br> |

## UserusernameGetPathParameters4Boxed
public sealed interface UserusernameGetPathParameters4Boxed<br>
permits<br>
[UserusernameGetPathParameters4BoxedVoid](#userusernamegetpathparameters4boxedvoid),
[UserusernameGetPathParameters4BoxedBoolean](#userusernamegetpathparameters4boxedboolean),
[UserusernameGetPathParameters4BoxedNumber](#userusernamegetpathparameters4boxednumber),
[UserusernameGetPathParameters4BoxedString](#userusernamegetpathparameters4boxedstring),
[UserusernameGetPathParameters4BoxedList](#userusernamegetpathparameters4boxedlist),
[UserusernameGetPathParameters4BoxedMap](#userusernamegetpathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## UserusernameGetPathParameters4BoxedVoid
public record UserusernameGetPathParameters4BoxedVoid<br>
implements [UserusernameGetPathParameters4Boxed](#userusernamegetpathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetPathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetPathParameters4BoxedBoolean
public record UserusernameGetPathParameters4BoxedBoolean<br>
implements [UserusernameGetPathParameters4Boxed](#userusernamegetpathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetPathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetPathParameters4BoxedNumber
public record UserusernameGetPathParameters4BoxedNumber<br>
implements [UserusernameGetPathParameters4Boxed](#userusernamegetpathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetPathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetPathParameters4BoxedString
public record UserusernameGetPathParameters4BoxedString<br>
implements [UserusernameGetPathParameters4Boxed](#userusernamegetpathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetPathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetPathParameters4BoxedList
public record UserusernameGetPathParameters4BoxedList<br>
implements [UserusernameGetPathParameters4Boxed](#userusernamegetpathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetPathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetPathParameters4BoxedMap
public record UserusernameGetPathParameters4BoxedMap<br>
implements [UserusernameGetPathParameters4Boxed](#userusernamegetpathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetPathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetPathParameters4
public static class UserusernameGetPathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
