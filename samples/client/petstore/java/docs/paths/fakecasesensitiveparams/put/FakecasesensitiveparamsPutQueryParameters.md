# FakecasesensitiveparamsPutQueryParameters
public class FakecasesensitiveparamsPutQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters1Boxed](#fakecasesensitiveparamsputqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters1BoxedMap](#fakecasesensitiveparamsputqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters1](#fakecasesensitiveparamsputqueryparameters1)<br> schema class |
| static class | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters10](#fakecasesensitiveparamsputqueryparameters10)<br> builder for Map payloads |
| static class | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters11](#fakecasesensitiveparamsputqueryparameters11)<br> output class for Map payloads |
| sealed interface | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters6Boxed](#fakecasesensitiveparamsputqueryparameters6boxed)<br> sealed interface for validated payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters6BoxedVoid](#fakecasesensitiveparamsputqueryparameters6boxedvoid)<br> boxed class to store validated null payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters6BoxedBoolean](#fakecasesensitiveparamsputqueryparameters6boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters6BoxedNumber](#fakecasesensitiveparamsputqueryparameters6boxednumber)<br> boxed class to store validated Number payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters6BoxedString](#fakecasesensitiveparamsputqueryparameters6boxedstring)<br> boxed class to store validated String payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters6BoxedList](#fakecasesensitiveparamsputqueryparameters6boxedlist)<br> boxed class to store validated List payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters6BoxedMap](#fakecasesensitiveparamsputqueryparameters6boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters6](#fakecasesensitiveparamsputqueryparameters6)<br> schema class |

## FakecasesensitiveparamsPutQueryParameters1Boxed
public sealed interface FakecasesensitiveparamsPutQueryParameters1Boxed<br>
permits<br>
[FakecasesensitiveparamsPutQueryParameters1BoxedMap](#fakecasesensitiveparamsputqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakecasesensitiveparamsPutQueryParameters1BoxedMap
public record FakecasesensitiveparamsPutQueryParameters1BoxedMap<br>
implements [FakecasesensitiveparamsPutQueryParameters1Boxed](#fakecasesensitiveparamsputqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters1BoxedMap([FakecasesensitiveparamsPutQueryParameters11](#fakecasesensitiveparamsputqueryparameters11) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParameters11](#fakecasesensitiveparamsputqueryparameters11) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutQueryParameters1
public static class FakecasesensitiveparamsPutQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.FakecasesensitiveparamsPutQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters11 validatedPayload =
    FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters1.validate(
    new FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters10()
        .SomeVar("a")

        .someVar("a")

        .some_var("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someVar", [Schema0.Schema01.class](../../../paths/fakecasesensitiveparams/put/parameters/parameter0/Schema0.md#schema01)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("some_var", [Schema2.Schema21.class](../../../paths/fakecasesensitiveparams/put/parameters/parameter2/Schema2.md#schema21)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("SomeVar", [Schema1.Schema11.class](../../../paths/fakecasesensitiveparams/put/parameters/parameter1/Schema1.md#schema11))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"SomeVar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"someVar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"some_var"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakecasesensitiveparamsPutQueryParameters6.class](#fakecasesensitiveparamsputqueryparameters6) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParameters11](#fakecasesensitiveparamsputqueryparameters11) | validate([Map&lt;?, ?&gt;](#fakecasesensitiveparamsputqueryparameters10) arg, SchemaConfiguration configuration) |
| [FakecasesensitiveparamsPutQueryParameters1BoxedMap](#fakecasesensitiveparamsputqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakecasesensitiveparamsputqueryparameters10) arg, SchemaConfiguration configuration) |
| [FakecasesensitiveparamsPutQueryParameters1Boxed](#fakecasesensitiveparamsputqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakecasesensitiveparamsPutQueryParameters12
public class FakecasesensitiveparamsPutQueryParameters12<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters12(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## FakecasesensitiveparamsPutQueryParameters13
public class FakecasesensitiveparamsPutQueryParameters13<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters13(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParameters12](#fakecasesensitiveparamsputqueryparameters12) | some_var(String value) |

## FakecasesensitiveparamsPutQueryParameters14
public class FakecasesensitiveparamsPutQueryParameters14<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters14(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParameters12](#fakecasesensitiveparamsputqueryparameters12) | someVar(String value) |

## FakecasesensitiveparamsPutQueryParameters15
public class FakecasesensitiveparamsPutQueryParameters15<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters15(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParameters13](#fakecasesensitiveparamsputqueryparameters13) | someVar(String value) |
| [FakecasesensitiveparamsPutQueryParameters14](#fakecasesensitiveparamsputqueryparameters14) | some_var(String value) |

## FakecasesensitiveparamsPutQueryParameters16
public class FakecasesensitiveparamsPutQueryParameters16<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters16(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParameters12](#fakecasesensitiveparamsputqueryparameters12) | SomeVar(String value) |

## FakecasesensitiveparamsPutQueryParameters17
public class FakecasesensitiveparamsPutQueryParameters17<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters17(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParameters13](#fakecasesensitiveparamsputqueryparameters13) | SomeVar(String value) |
| [FakecasesensitiveparamsPutQueryParameters16](#fakecasesensitiveparamsputqueryparameters16) | some_var(String value) |

## FakecasesensitiveparamsPutQueryParameters18
public class FakecasesensitiveparamsPutQueryParameters18<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters18(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParameters14](#fakecasesensitiveparamsputqueryparameters14) | SomeVar(String value) |
| [FakecasesensitiveparamsPutQueryParameters16](#fakecasesensitiveparamsputqueryparameters16) | someVar(String value) |

## FakecasesensitiveparamsPutQueryParameters10
public class FakecasesensitiveparamsPutQueryParameters10<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters10()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParameters15](#fakecasesensitiveparamsputqueryparameters15) | SomeVar(String value) |
| [FakecasesensitiveparamsPutQueryParameters17](#fakecasesensitiveparamsputqueryparameters17) | someVar(String value) |
| [FakecasesensitiveparamsPutQueryParameters18](#fakecasesensitiveparamsputqueryparameters18) | some_var(String value) |

## FakecasesensitiveparamsPutQueryParameters11
public static class FakecasesensitiveparamsPutQueryParameters11<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakecasesensitiveparamsPutQueryParameters11](#fakecasesensitiveparamsputqueryparameters11) | of([Map<String, ? extends @Nullable Object>](#fakecasesensitiveparamsputqueryparameters10) arg, SchemaConfiguration configuration) |
| String | SomeVar()<br> |
| String | someVar()<br> |
| String | some_var()<br> |

## FakecasesensitiveparamsPutQueryParameters6Boxed
public sealed interface FakecasesensitiveparamsPutQueryParameters6Boxed<br>
permits<br>
[FakecasesensitiveparamsPutQueryParameters6BoxedVoid](#fakecasesensitiveparamsputqueryparameters6boxedvoid),
[FakecasesensitiveparamsPutQueryParameters6BoxedBoolean](#fakecasesensitiveparamsputqueryparameters6boxedboolean),
[FakecasesensitiveparamsPutQueryParameters6BoxedNumber](#fakecasesensitiveparamsputqueryparameters6boxednumber),
[FakecasesensitiveparamsPutQueryParameters6BoxedString](#fakecasesensitiveparamsputqueryparameters6boxedstring),
[FakecasesensitiveparamsPutQueryParameters6BoxedList](#fakecasesensitiveparamsputqueryparameters6boxedlist),
[FakecasesensitiveparamsPutQueryParameters6BoxedMap](#fakecasesensitiveparamsputqueryparameters6boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakecasesensitiveparamsPutQueryParameters6BoxedVoid
public record FakecasesensitiveparamsPutQueryParameters6BoxedVoid<br>
implements [FakecasesensitiveparamsPutQueryParameters6Boxed](#fakecasesensitiveparamsputqueryparameters6boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters6BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutQueryParameters6BoxedBoolean
public record FakecasesensitiveparamsPutQueryParameters6BoxedBoolean<br>
implements [FakecasesensitiveparamsPutQueryParameters6Boxed](#fakecasesensitiveparamsputqueryparameters6boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters6BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutQueryParameters6BoxedNumber
public record FakecasesensitiveparamsPutQueryParameters6BoxedNumber<br>
implements [FakecasesensitiveparamsPutQueryParameters6Boxed](#fakecasesensitiveparamsputqueryparameters6boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters6BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutQueryParameters6BoxedString
public record FakecasesensitiveparamsPutQueryParameters6BoxedString<br>
implements [FakecasesensitiveparamsPutQueryParameters6Boxed](#fakecasesensitiveparamsputqueryparameters6boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters6BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutQueryParameters6BoxedList
public record FakecasesensitiveparamsPutQueryParameters6BoxedList<br>
implements [FakecasesensitiveparamsPutQueryParameters6Boxed](#fakecasesensitiveparamsputqueryparameters6boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters6BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutQueryParameters6BoxedMap
public record FakecasesensitiveparamsPutQueryParameters6BoxedMap<br>
implements [FakecasesensitiveparamsPutQueryParameters6Boxed](#fakecasesensitiveparamsputqueryparameters6boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParameters6BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutQueryParameters6
public static class FakecasesensitiveparamsPutQueryParameters6<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
