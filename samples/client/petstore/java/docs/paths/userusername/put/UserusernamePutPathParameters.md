# UserusernamePutPathParameters
public class UserusernamePutPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UserusernamePutPathParameters.UserusernamePutPathParameters1Boxed](#userusernameputpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [UserusernamePutPathParameters.UserusernamePutPathParameters1BoxedMap](#userusernameputpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserusernamePutPathParameters.UserusernamePutPathParameters1](#userusernameputpathparameters1)<br> schema class |
| static class | [UserusernamePutPathParameters.UserusernamePutPathParameters8](#userusernameputpathparameters8)<br> builder for Map payloads |
| static class | [UserusernamePutPathParameters.UserusernamePutPathParameters9](#userusernameputpathparameters9)<br> output class for Map payloads |
| sealed interface | [UserusernamePutPathParameters.UserusernamePutPathParameters4Boxed](#userusernameputpathparameters4boxed)<br> sealed interface for validated payloads |
| record | [UserusernamePutPathParameters.UserusernamePutPathParameters4BoxedVoid](#userusernameputpathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [UserusernamePutPathParameters.UserusernamePutPathParameters4BoxedBoolean](#userusernameputpathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UserusernamePutPathParameters.UserusernamePutPathParameters4BoxedNumber](#userusernameputpathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [UserusernamePutPathParameters.UserusernamePutPathParameters4BoxedString](#userusernameputpathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [UserusernamePutPathParameters.UserusernamePutPathParameters4BoxedList](#userusernameputpathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [UserusernamePutPathParameters.UserusernamePutPathParameters4BoxedMap](#userusernameputpathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserusernamePutPathParameters.UserusernamePutPathParameters4](#userusernameputpathparameters4)<br> schema class |

## UserusernamePutPathParameters1Boxed
public sealed interface UserusernamePutPathParameters1Boxed<br>
permits<br>
[UserusernamePutPathParameters1BoxedMap](#userusernameputpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UserusernamePutPathParameters1BoxedMap
public record UserusernamePutPathParameters1BoxedMap<br>
implements [UserusernamePutPathParameters1Boxed](#userusernameputpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutPathParameters1BoxedMap([UserusernamePutPathParameters9](#userusernameputpathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernamePutPathParameters9](#userusernameputpathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutPathParameters1
public static class UserusernamePutPathParameters1<br>
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
import org.openapijsonschematools.client.paths.userusername.put.UserusernamePutPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
UserusernamePutPathParameters.UserusernamePutPathParameters9 validatedPayload =
    UserusernamePutPathParameters.UserusernamePutPathParameters1.validate(
    new UserusernamePutPathParameters.UserusernamePutPathParameters8()
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
| Class<? extends JsonSchema> | additionalProperties = [UserusernamePutPathParameters4.class](#userusernameputpathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernamePutPathParameters9](#userusernameputpathparameters9) | validate([Map&lt;?, ?&gt;](#userusernameputpathparameters8) arg, SchemaConfiguration configuration) |
| [UserusernamePutPathParameters1BoxedMap](#userusernameputpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#userusernameputpathparameters8) arg, SchemaConfiguration configuration) |
| [UserusernamePutPathParameters1Boxed](#userusernameputpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UserusernamePutPathParameters10
public class UserusernamePutPathParameters10<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutPathParameters10(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## UserusernamePutPathParameters8
public class UserusernamePutPathParameters8<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutPathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernamePutPathParameters10](#userusernameputpathparameters10) | username(String value) |

## UserusernamePutPathParameters9
public static class UserusernamePutPathParameters9<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UserusernamePutPathParameters9](#userusernameputpathparameters9) | of([Map<String, String>](#userusernameputpathparameters8) arg, SchemaConfiguration configuration) |
| String | username()<br> |

## UserusernamePutPathParameters4Boxed
public sealed interface UserusernamePutPathParameters4Boxed<br>
permits<br>
[UserusernamePutPathParameters4BoxedVoid](#userusernameputpathparameters4boxedvoid),
[UserusernamePutPathParameters4BoxedBoolean](#userusernameputpathparameters4boxedboolean),
[UserusernamePutPathParameters4BoxedNumber](#userusernameputpathparameters4boxednumber),
[UserusernamePutPathParameters4BoxedString](#userusernameputpathparameters4boxedstring),
[UserusernamePutPathParameters4BoxedList](#userusernameputpathparameters4boxedlist),
[UserusernamePutPathParameters4BoxedMap](#userusernameputpathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## UserusernamePutPathParameters4BoxedVoid
public record UserusernamePutPathParameters4BoxedVoid<br>
implements [UserusernamePutPathParameters4Boxed](#userusernameputpathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutPathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutPathParameters4BoxedBoolean
public record UserusernamePutPathParameters4BoxedBoolean<br>
implements [UserusernamePutPathParameters4Boxed](#userusernameputpathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutPathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutPathParameters4BoxedNumber
public record UserusernamePutPathParameters4BoxedNumber<br>
implements [UserusernamePutPathParameters4Boxed](#userusernameputpathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutPathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutPathParameters4BoxedString
public record UserusernamePutPathParameters4BoxedString<br>
implements [UserusernamePutPathParameters4Boxed](#userusernameputpathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutPathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutPathParameters4BoxedList
public record UserusernamePutPathParameters4BoxedList<br>
implements [UserusernamePutPathParameters4Boxed](#userusernameputpathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutPathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutPathParameters4BoxedMap
public record UserusernamePutPathParameters4BoxedMap<br>
implements [UserusernamePutPathParameters4Boxed](#userusernameputpathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutPathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutPathParameters4
public static class UserusernamePutPathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
