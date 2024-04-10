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
| static class | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParametersMapBuilder](#fakecasesensitiveparamsputqueryparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParametersMap](#fakecasesensitiveparamsputqueryparametersmap)<br> output class for Map payloads |
| sealed interface | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutadditionalPropertiesBoxed](#fakecasesensitiveparamsputadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutadditionalPropertiesBoxedVoid](#fakecasesensitiveparamsputadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutadditionalPropertiesBoxedBoolean](#fakecasesensitiveparamsputadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutadditionalPropertiesBoxedNumber](#fakecasesensitiveparamsputadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutadditionalPropertiesBoxedString](#fakecasesensitiveparamsputadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutadditionalPropertiesBoxedList](#fakecasesensitiveparamsputadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutadditionalPropertiesBoxedMap](#fakecasesensitiveparamsputadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutadditionalProperties](#fakecasesensitiveparamsputadditionalproperties)<br> schema class |

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
| FakecasesensitiveparamsPutQueryParameters1BoxedMap([FakecasesensitiveparamsPutQueryParametersMap](#fakecasesensitiveparamsputqueryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParametersMap](#fakecasesensitiveparamsputqueryparametersmap) | data()<br>validated payload |
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
FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParametersMap validatedPayload =
    FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters1.validate(
    new FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [FakecasesensitiveparamsPutadditionalProperties.class](#fakecasesensitiveparamsputadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParametersMap](#fakecasesensitiveparamsputqueryparametersmap) | validate([Map&lt;?, ?&gt;](#fakecasesensitiveparamsputqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakecasesensitiveparamsPutQueryParameters1BoxedMap](#fakecasesensitiveparamsputqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakecasesensitiveparamsputqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakecasesensitiveparamsPutQueryParameters1Boxed](#fakecasesensitiveparamsputqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakecasesensitiveparamsPutQueryParametersMap000Builder
public class FakecasesensitiveparamsPutQueryParametersMap000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParametersMap000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## FakecasesensitiveparamsPutQueryParametersMap001Builder
public class FakecasesensitiveparamsPutQueryParametersMap001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParametersMap001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParametersMap000Builder](#fakecasesensitiveparamsputqueryparametersmap000builder) | some_var(String value) |

## FakecasesensitiveparamsPutQueryParametersMap010Builder
public class FakecasesensitiveparamsPutQueryParametersMap010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParametersMap010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParametersMap000Builder](#fakecasesensitiveparamsputqueryparametersmap000builder) | someVar(String value) |

## FakecasesensitiveparamsPutQueryParametersMap011Builder
public class FakecasesensitiveparamsPutQueryParametersMap011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParametersMap011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParametersMap001Builder](#fakecasesensitiveparamsputqueryparametersmap001builder) | someVar(String value) |
| [FakecasesensitiveparamsPutQueryParametersMap010Builder](#fakecasesensitiveparamsputqueryparametersmap010builder) | some_var(String value) |

## FakecasesensitiveparamsPutQueryParametersMap100Builder
public class FakecasesensitiveparamsPutQueryParametersMap100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParametersMap100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParametersMap000Builder](#fakecasesensitiveparamsputqueryparametersmap000builder) | SomeVar(String value) |

## FakecasesensitiveparamsPutQueryParametersMap101Builder
public class FakecasesensitiveparamsPutQueryParametersMap101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParametersMap101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParametersMap001Builder](#fakecasesensitiveparamsputqueryparametersmap001builder) | SomeVar(String value) |
| [FakecasesensitiveparamsPutQueryParametersMap100Builder](#fakecasesensitiveparamsputqueryparametersmap100builder) | some_var(String value) |

## FakecasesensitiveparamsPutQueryParametersMap110Builder
public class FakecasesensitiveparamsPutQueryParametersMap110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParametersMap110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParametersMap010Builder](#fakecasesensitiveparamsputqueryparametersmap010builder) | SomeVar(String value) |
| [FakecasesensitiveparamsPutQueryParametersMap100Builder](#fakecasesensitiveparamsputqueryparametersmap100builder) | someVar(String value) |

## FakecasesensitiveparamsPutQueryParametersMapBuilder
public class FakecasesensitiveparamsPutQueryParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutQueryParametersMap011Builder](#fakecasesensitiveparamsputqueryparametersmap011builder) | SomeVar(String value) |
| [FakecasesensitiveparamsPutQueryParametersMap101Builder](#fakecasesensitiveparamsputqueryparametersmap101builder) | someVar(String value) |
| [FakecasesensitiveparamsPutQueryParametersMap110Builder](#fakecasesensitiveparamsputqueryparametersmap110builder) | some_var(String value) |

## FakecasesensitiveparamsPutQueryParametersMap
public static class FakecasesensitiveparamsPutQueryParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakecasesensitiveparamsPutQueryParametersMap](#fakecasesensitiveparamsputqueryparametersmap) | of([Map<String, ? extends @Nullable Object>](#fakecasesensitiveparamsputqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | SomeVar()<br> |
| String | someVar()<br> |
| String | some_var()<br> |

## FakecasesensitiveparamsPutadditionalPropertiesBoxed
public sealed interface FakecasesensitiveparamsPutadditionalPropertiesBoxed<br>
permits<br>
[FakecasesensitiveparamsPutadditionalPropertiesBoxedVoid](#fakecasesensitiveparamsputadditionalpropertiesboxedvoid),
[FakecasesensitiveparamsPutadditionalPropertiesBoxedBoolean](#fakecasesensitiveparamsputadditionalpropertiesboxedboolean),
[FakecasesensitiveparamsPutadditionalPropertiesBoxedNumber](#fakecasesensitiveparamsputadditionalpropertiesboxednumber),
[FakecasesensitiveparamsPutadditionalPropertiesBoxedString](#fakecasesensitiveparamsputadditionalpropertiesboxedstring),
[FakecasesensitiveparamsPutadditionalPropertiesBoxedList](#fakecasesensitiveparamsputadditionalpropertiesboxedlist),
[FakecasesensitiveparamsPutadditionalPropertiesBoxedMap](#fakecasesensitiveparamsputadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## FakecasesensitiveparamsPutadditionalPropertiesBoxedVoid
public record FakecasesensitiveparamsPutadditionalPropertiesBoxedVoid<br>
implements [FakecasesensitiveparamsPutadditionalPropertiesBoxed](#fakecasesensitiveparamsputadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutadditionalPropertiesBoxedBoolean
public record FakecasesensitiveparamsPutadditionalPropertiesBoxedBoolean<br>
implements [FakecasesensitiveparamsPutadditionalPropertiesBoxed](#fakecasesensitiveparamsputadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutadditionalPropertiesBoxedNumber
public record FakecasesensitiveparamsPutadditionalPropertiesBoxedNumber<br>
implements [FakecasesensitiveparamsPutadditionalPropertiesBoxed](#fakecasesensitiveparamsputadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutadditionalPropertiesBoxedString
public record FakecasesensitiveparamsPutadditionalPropertiesBoxedString<br>
implements [FakecasesensitiveparamsPutadditionalPropertiesBoxed](#fakecasesensitiveparamsputadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutadditionalPropertiesBoxedList
public record FakecasesensitiveparamsPutadditionalPropertiesBoxedList<br>
implements [FakecasesensitiveparamsPutadditionalPropertiesBoxed](#fakecasesensitiveparamsputadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutadditionalPropertiesBoxedMap
public record FakecasesensitiveparamsPutadditionalPropertiesBoxedMap<br>
implements [FakecasesensitiveparamsPutadditionalPropertiesBoxed](#fakecasesensitiveparamsputadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakecasesensitiveparamsPutadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakecasesensitiveparamsPutadditionalProperties
public static class FakecasesensitiveparamsPutadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
