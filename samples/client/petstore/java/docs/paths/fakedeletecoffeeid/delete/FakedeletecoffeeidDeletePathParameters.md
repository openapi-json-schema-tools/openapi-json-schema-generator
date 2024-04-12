# FakedeletecoffeeidDeletePathParameters
public class FakedeletecoffeeidDeletePathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters1Boxed](#fakedeletecoffeeiddeletepathparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters1BoxedMap](#fakedeletecoffeeiddeletepathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters1](#fakedeletecoffeeiddeletepathparameters1)<br> schema class |
| static class | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters8](#fakedeletecoffeeiddeletepathparameters8)<br> builder for Map payloads |
| static class | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters9](#fakedeletecoffeeiddeletepathparameters9)<br> output class for Map payloads |
| sealed interface | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters4Boxed](#fakedeletecoffeeiddeletepathparameters4boxed)<br> sealed interface for validated payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters4BoxedVoid](#fakedeletecoffeeiddeletepathparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters4BoxedBoolean](#fakedeletecoffeeiddeletepathparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters4BoxedNumber](#fakedeletecoffeeiddeletepathparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters4BoxedString](#fakedeletecoffeeiddeletepathparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters4BoxedList](#fakedeletecoffeeiddeletepathparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters4BoxedMap](#fakedeletecoffeeiddeletepathparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters4](#fakedeletecoffeeiddeletepathparameters4)<br> schema class |

## FakedeletecoffeeidDeletePathParameters1Boxed
public sealed interface FakedeletecoffeeidDeletePathParameters1Boxed<br>
permits<br>
[FakedeletecoffeeidDeletePathParameters1BoxedMap](#fakedeletecoffeeiddeletepathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakedeletecoffeeidDeletePathParameters1BoxedMap
public record FakedeletecoffeeidDeletePathParameters1BoxedMap<br>
implements [FakedeletecoffeeidDeletePathParameters1Boxed](#fakedeletecoffeeiddeletepathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeletePathParameters1BoxedMap([FakedeletecoffeeidDeletePathParameters9](#fakedeletecoffeeiddeletepathparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakedeletecoffeeidDeletePathParameters9](#fakedeletecoffeeiddeletepathparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeletePathParameters1
public static class FakedeletecoffeeidDeletePathParameters1<br>
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
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete.FakedeletecoffeeidDeletePathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters9 validatedPayload =
    FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters1.validate(
    new FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters8()
        .id("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("id", [Schema0.Schema01.class](../../../paths/fakedeletecoffeeid/delete/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"id"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakedeletecoffeeidDeletePathParameters4.class](#fakedeletecoffeeiddeletepathparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakedeletecoffeeidDeletePathParameters9](#fakedeletecoffeeiddeletepathparameters9) | validate([Map&lt;?, ?&gt;](#fakedeletecoffeeiddeletepathparameters8) arg, SchemaConfiguration configuration) |
| [FakedeletecoffeeidDeletePathParameters1BoxedMap](#fakedeletecoffeeiddeletepathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakedeletecoffeeiddeletepathparameters8) arg, SchemaConfiguration configuration) |
| [FakedeletecoffeeidDeletePathParameters1Boxed](#fakedeletecoffeeiddeletepathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakedeletecoffeeidDeletePathParameters10
public class FakedeletecoffeeidDeletePathParameters10<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeletePathParameters10(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## FakedeletecoffeeidDeletePathParameters8
public class FakedeletecoffeeidDeletePathParameters8<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeletePathParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakedeletecoffeeidDeletePathParameters10](#fakedeletecoffeeiddeletepathparameters10) | id(String value) |

## FakedeletecoffeeidDeletePathParameters9
public static class FakedeletecoffeeidDeletePathParameters9<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakedeletecoffeeidDeletePathParameters9](#fakedeletecoffeeiddeletepathparameters9) | of([Map<String, String>](#fakedeletecoffeeiddeletepathparameters8) arg, SchemaConfiguration configuration) |
| String | id()<br> |

## FakedeletecoffeeidDeletePathParameters4Boxed
public sealed interface FakedeletecoffeeidDeletePathParameters4Boxed<br>
permits<br>
[FakedeletecoffeeidDeletePathParameters4BoxedVoid](#fakedeletecoffeeiddeletepathparameters4boxedvoid),
[FakedeletecoffeeidDeletePathParameters4BoxedBoolean](#fakedeletecoffeeiddeletepathparameters4boxedboolean),
[FakedeletecoffeeidDeletePathParameters4BoxedNumber](#fakedeletecoffeeiddeletepathparameters4boxednumber),
[FakedeletecoffeeidDeletePathParameters4BoxedString](#fakedeletecoffeeiddeletepathparameters4boxedstring),
[FakedeletecoffeeidDeletePathParameters4BoxedList](#fakedeletecoffeeiddeletepathparameters4boxedlist),
[FakedeletecoffeeidDeletePathParameters4BoxedMap](#fakedeletecoffeeiddeletepathparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakedeletecoffeeidDeletePathParameters4BoxedVoid
public record FakedeletecoffeeidDeletePathParameters4BoxedVoid<br>
implements [FakedeletecoffeeidDeletePathParameters4Boxed](#fakedeletecoffeeiddeletepathparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeletePathParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeletePathParameters4BoxedBoolean
public record FakedeletecoffeeidDeletePathParameters4BoxedBoolean<br>
implements [FakedeletecoffeeidDeletePathParameters4Boxed](#fakedeletecoffeeiddeletepathparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeletePathParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeletePathParameters4BoxedNumber
public record FakedeletecoffeeidDeletePathParameters4BoxedNumber<br>
implements [FakedeletecoffeeidDeletePathParameters4Boxed](#fakedeletecoffeeiddeletepathparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeletePathParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeletePathParameters4BoxedString
public record FakedeletecoffeeidDeletePathParameters4BoxedString<br>
implements [FakedeletecoffeeidDeletePathParameters4Boxed](#fakedeletecoffeeiddeletepathparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeletePathParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeletePathParameters4BoxedList
public record FakedeletecoffeeidDeletePathParameters4BoxedList<br>
implements [FakedeletecoffeeidDeletePathParameters4Boxed](#fakedeletecoffeeiddeletepathparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeletePathParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeletePathParameters4BoxedMap
public record FakedeletecoffeeidDeletePathParameters4BoxedMap<br>
implements [FakedeletecoffeeidDeletePathParameters4Boxed](#fakedeletecoffeeiddeletepathparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeletePathParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeletePathParameters4
public static class FakedeletecoffeeidDeletePathParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
