# FakeDeleteHeaderParameters
public class FakeDeleteHeaderParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters1Boxed](#fakedeleteheaderparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters1BoxedMap](#fakedeleteheaderparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters1](#fakedeleteheaderparameters1)<br> schema class |
| static class | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters11](#fakedeleteheaderparameters11)<br> builder for Map payloads |
| static class | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters12](#fakedeleteheaderparameters12)<br> output class for Map payloads |
| sealed interface | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters5Boxed](#fakedeleteheaderparameters5boxed)<br> sealed interface for validated payloads |
| record | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters5BoxedVoid](#fakedeleteheaderparameters5boxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters5BoxedBoolean](#fakedeleteheaderparameters5boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters5BoxedNumber](#fakedeleteheaderparameters5boxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters5BoxedString](#fakedeleteheaderparameters5boxedstring)<br> boxed class to store validated String payloads |
| record | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters5BoxedList](#fakedeleteheaderparameters5boxedlist)<br> boxed class to store validated List payloads |
| record | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters5BoxedMap](#fakedeleteheaderparameters5boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters5](#fakedeleteheaderparameters5)<br> schema class |

## FakeDeleteHeaderParameters1Boxed
public sealed interface FakeDeleteHeaderParameters1Boxed<br>
permits<br>
[FakeDeleteHeaderParameters1BoxedMap](#fakedeleteheaderparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeDeleteHeaderParameters1BoxedMap
public record FakeDeleteHeaderParameters1BoxedMap<br>
implements [FakeDeleteHeaderParameters1Boxed](#fakedeleteheaderparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteHeaderParameters1BoxedMap([FakeDeleteHeaderParameters12](#fakedeleteheaderparameters12) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteHeaderParameters12](#fakedeleteheaderparameters12) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteHeaderParameters1
public static class FakeDeleteHeaderParameters1<br>
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
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteHeaderParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakeDeleteHeaderParameters.FakeDeleteHeaderParameters12 validatedPayload =
    FakeDeleteHeaderParameters.FakeDeleteHeaderParameters1.validate(
    new FakeDeleteHeaderParameters.FakeDeleteHeaderParameters11()
        .required_boolean_group("true")

        .boolean_group("true")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("required_boolean_group", [Schema1.Schema11.class](../../../paths/fake/delete/parameters/parameter1/Schema1.md#schema11)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("boolean_group", [Schema4.Schema41.class](../../../paths/fake/delete/parameters/parameter4/Schema4.md#schema41))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"required_boolean_group"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakeDeleteHeaderParameters5.class](#fakedeleteheaderparameters5) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteHeaderParameters12](#fakedeleteheaderparameters12) | validate([Map&lt;?, ?&gt;](#fakedeleteheaderparameters11) arg, SchemaConfiguration configuration) |
| [FakeDeleteHeaderParameters1BoxedMap](#fakedeleteheaderparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakedeleteheaderparameters11) arg, SchemaConfiguration configuration) |
| [FakeDeleteHeaderParameters1Boxed](#fakedeleteheaderparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakeDeleteHeaderParameters13
public class FakeDeleteHeaderParameters13<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteHeaderParameters13(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FakeDeleteHeaderParameters13](#fakedeleteheaderparameters13) | boolean_group(String value) |
| [FakeDeleteHeaderParameters13](#fakedeleteheaderparameters13) | boolean_group([Schema4.StringSchemaEnums4](../../../paths/fake/delete/parameters/parameter4/Schema4.md#stringschemaenums4) value) |

## FakeDeleteHeaderParameters11
public class FakeDeleteHeaderParameters11<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteHeaderParameters11()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteHeaderParameters13](#fakedeleteheaderparameters13) | required_boolean_group(String value) |
| [FakeDeleteHeaderParameters13](#fakedeleteheaderparameters13) | required_boolean_group([Schema1.StringSchemaEnums1](../../../paths/fake/delete/parameters/parameter1/Schema1.md#stringschemaenums1) value) |

## FakeDeleteHeaderParameters12
public static class FakeDeleteHeaderParameters12<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakeDeleteHeaderParameters12](#fakedeleteheaderparameters12) | of([Map<String, ? extends @Nullable Object>](#fakedeleteheaderparameters11) arg, SchemaConfiguration configuration) |
| String | required_boolean_group()<br> |
| String | boolean_group()<br>[optional] |

## FakeDeleteHeaderParameters5Boxed
public sealed interface FakeDeleteHeaderParameters5Boxed<br>
permits<br>
[FakeDeleteHeaderParameters5BoxedVoid](#fakedeleteheaderparameters5boxedvoid),
[FakeDeleteHeaderParameters5BoxedBoolean](#fakedeleteheaderparameters5boxedboolean),
[FakeDeleteHeaderParameters5BoxedNumber](#fakedeleteheaderparameters5boxednumber),
[FakeDeleteHeaderParameters5BoxedString](#fakedeleteheaderparameters5boxedstring),
[FakeDeleteHeaderParameters5BoxedList](#fakedeleteheaderparameters5boxedlist),
[FakeDeleteHeaderParameters5BoxedMap](#fakedeleteheaderparameters5boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeDeleteHeaderParameters5BoxedVoid
public record FakeDeleteHeaderParameters5BoxedVoid<br>
implements [FakeDeleteHeaderParameters5Boxed](#fakedeleteheaderparameters5boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteHeaderParameters5BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteHeaderParameters5BoxedBoolean
public record FakeDeleteHeaderParameters5BoxedBoolean<br>
implements [FakeDeleteHeaderParameters5Boxed](#fakedeleteheaderparameters5boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteHeaderParameters5BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteHeaderParameters5BoxedNumber
public record FakeDeleteHeaderParameters5BoxedNumber<br>
implements [FakeDeleteHeaderParameters5Boxed](#fakedeleteheaderparameters5boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteHeaderParameters5BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteHeaderParameters5BoxedString
public record FakeDeleteHeaderParameters5BoxedString<br>
implements [FakeDeleteHeaderParameters5Boxed](#fakedeleteheaderparameters5boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteHeaderParameters5BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteHeaderParameters5BoxedList
public record FakeDeleteHeaderParameters5BoxedList<br>
implements [FakeDeleteHeaderParameters5Boxed](#fakedeleteheaderparameters5boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteHeaderParameters5BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteHeaderParameters5BoxedMap
public record FakeDeleteHeaderParameters5BoxedMap<br>
implements [FakeDeleteHeaderParameters5Boxed](#fakedeleteheaderparameters5boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteHeaderParameters5BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteHeaderParameters5
public static class FakeDeleteHeaderParameters5<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
