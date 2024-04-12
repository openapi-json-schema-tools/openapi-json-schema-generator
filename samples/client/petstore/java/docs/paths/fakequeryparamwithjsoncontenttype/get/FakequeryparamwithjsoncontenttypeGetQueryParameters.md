# FakequeryparamwithjsoncontenttypeGetQueryParameters
public class FakequeryparamwithjsoncontenttypeGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters1](#fakequeryparamwithjsoncontenttypegetqueryparameters1)<br> schema class |
| static class | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters8](#fakequeryparamwithjsoncontenttypegetqueryparameters8)<br> builder for Map payloads |
| static class | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters9](#fakequeryparamwithjsoncontenttypegetqueryparameters9)<br> output class for Map payloads |
| sealed interface | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters4Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxed)<br> sealed interface for validated payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedVoid](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxedvoid)<br> boxed class to store validated null payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedBoolean](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedNumber](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxednumber)<br> boxed class to store validated Number payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedString](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxedstring)<br> boxed class to store validated String payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedList](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxedlist)<br> boxed class to store validated List payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedMap](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters4](#fakequeryparamwithjsoncontenttypegetqueryparameters4)<br> schema class |

## FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed
public sealed interface FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed<br>
permits<br>
[FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap
public record FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap<br>
implements [FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap([FakequeryparamwithjsoncontenttypeGetQueryParameters9](#fakequeryparamwithjsoncontenttypegetqueryparameters9) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters9](#fakequeryparamwithjsoncontenttypegetqueryparameters9) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetQueryParameters1
public static class FakequeryparamwithjsoncontenttypeGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.FakequeryparamwithjsoncontenttypeGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters9 validatedPayload =
    FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters1.validate(
    new FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters8()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someParam", [Schema0.Schema01.class](../../../paths/fakequeryparamwithjsoncontenttype/get/parameters/parameter0/content/applicationjson/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"someParam"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakequeryparamwithjsoncontenttypeGetQueryParameters4.class](#fakequeryparamwithjsoncontenttypegetqueryparameters4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters9](#fakequeryparamwithjsoncontenttypegetqueryparameters9) | validate([Map&lt;?, ?&gt;](#fakequeryparamwithjsoncontenttypegetqueryparameters8) arg, SchemaConfiguration configuration) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakequeryparamwithjsoncontenttypegetqueryparameters8) arg, SchemaConfiguration configuration) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakequeryparamwithjsoncontenttypeGetQueryParameters10
public class FakequeryparamwithjsoncontenttypeGetQueryParameters10<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetQueryParameters10(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## FakequeryparamwithjsoncontenttypeGetQueryParameters8
public class FakequeryparamwithjsoncontenttypeGetQueryParameters8<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetQueryParameters8()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters10](#fakequeryparamwithjsoncontenttypegetqueryparameters10) | someParam(Void value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters10](#fakequeryparamwithjsoncontenttypegetqueryparameters10) | someParam(boolean value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters10](#fakequeryparamwithjsoncontenttypegetqueryparameters10) | someParam(String value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters10](#fakequeryparamwithjsoncontenttypegetqueryparameters10) | someParam(int value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters10](#fakequeryparamwithjsoncontenttypegetqueryparameters10) | someParam(float value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters10](#fakequeryparamwithjsoncontenttypegetqueryparameters10) | someParam(long value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters10](#fakequeryparamwithjsoncontenttypegetqueryparameters10) | someParam(double value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters10](#fakequeryparamwithjsoncontenttypegetqueryparameters10) | someParam(List<?> value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters10](#fakequeryparamwithjsoncontenttypegetqueryparameters10) | someParam(Map<String, ?> value) |

## FakequeryparamwithjsoncontenttypeGetQueryParameters9
public static class FakequeryparamwithjsoncontenttypeGetQueryParameters9<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakequeryparamwithjsoncontenttypeGetQueryParameters9](#fakequeryparamwithjsoncontenttypegetqueryparameters9) | of([Map<String, ? extends @Nullable Object>](#fakequeryparamwithjsoncontenttypegetqueryparameters8) arg, SchemaConfiguration configuration) |
| @Nullable Object | someParam()<br> |

## FakequeryparamwithjsoncontenttypeGetQueryParameters4Boxed
public sealed interface FakequeryparamwithjsoncontenttypeGetQueryParameters4Boxed<br>
permits<br>
[FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedVoid](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxedvoid),
[FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedBoolean](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxedboolean),
[FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedNumber](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxednumber),
[FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedString](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxedstring),
[FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedList](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxedlist),
[FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedMap](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedVoid
public record FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedVoid<br>
implements [FakequeryparamwithjsoncontenttypeGetQueryParameters4Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedBoolean
public record FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedBoolean<br>
implements [FakequeryparamwithjsoncontenttypeGetQueryParameters4Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedNumber
public record FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedNumber<br>
implements [FakequeryparamwithjsoncontenttypeGetQueryParameters4Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedString
public record FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedString<br>
implements [FakequeryparamwithjsoncontenttypeGetQueryParameters4Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedList
public record FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedList<br>
implements [FakequeryparamwithjsoncontenttypeGetQueryParameters4Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedMap
public record FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedMap<br>
implements [FakequeryparamwithjsoncontenttypeGetQueryParameters4Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters4boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetQueryParameters4BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetQueryParameters4
public static class FakequeryparamwithjsoncontenttypeGetQueryParameters4<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
