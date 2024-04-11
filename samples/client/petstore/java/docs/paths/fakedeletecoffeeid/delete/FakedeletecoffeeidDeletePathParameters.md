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
| static class | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParametersMapBuilder](#fakedeletecoffeeiddeletepathparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParametersMap](#fakedeletecoffeeiddeletepathparametersmap)<br> output class for Map payloads |
| sealed interface | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeleteadditionalPropertiesBoxed](#fakedeletecoffeeiddeleteadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeleteadditionalPropertiesBoxedVoid](#fakedeletecoffeeiddeleteadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeleteadditionalPropertiesBoxedBoolean](#fakedeletecoffeeiddeleteadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeleteadditionalPropertiesBoxedNumber](#fakedeletecoffeeiddeleteadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeleteadditionalPropertiesBoxedString](#fakedeletecoffeeiddeleteadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeleteadditionalPropertiesBoxedList](#fakedeletecoffeeiddeleteadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeleteadditionalPropertiesBoxedMap](#fakedeletecoffeeiddeleteadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeleteadditionalProperties](#fakedeletecoffeeiddeleteadditionalproperties)<br> schema class |

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
| FakedeletecoffeeidDeletePathParameters1BoxedMap([FakedeletecoffeeidDeletePathParametersMap](#fakedeletecoffeeiddeletepathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakedeletecoffeeidDeletePathParametersMap](#fakedeletecoffeeiddeletepathparametersmap) | data()<br>validated payload |
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
FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParametersMap validatedPayload =
    FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters1.validate(
    new FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [FakedeletecoffeeidDeleteadditionalProperties.class](#fakedeletecoffeeiddeleteadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakedeletecoffeeidDeletePathParametersMap](#fakedeletecoffeeiddeletepathparametersmap) | validate([Map&lt;?, ?&gt;](#fakedeletecoffeeiddeletepathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakedeletecoffeeidDeletePathParameters1BoxedMap](#fakedeletecoffeeiddeletepathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakedeletecoffeeiddeletepathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakedeletecoffeeidDeletePathParameters1Boxed](#fakedeletecoffeeiddeletepathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakedeletecoffeeidDeletePathParametersMap0Builder
public class FakedeletecoffeeidDeletePathParametersMap0Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeletePathParametersMap0Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## FakedeletecoffeeidDeletePathParametersMapBuilder
public class FakedeletecoffeeidDeletePathParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeletePathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakedeletecoffeeidDeletePathParametersMap0Builder](#fakedeletecoffeeiddeletepathparametersmap0builder) | id(String value) |

## FakedeletecoffeeidDeletePathParametersMap
public static class FakedeletecoffeeidDeletePathParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakedeletecoffeeidDeletePathParametersMap](#fakedeletecoffeeiddeletepathparametersmap) | of([Map<String, String>](#fakedeletecoffeeiddeletepathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | id()<br> |

## FakedeletecoffeeidDeleteadditionalPropertiesBoxed
public sealed interface FakedeletecoffeeidDeleteadditionalPropertiesBoxed<br>
permits<br>
[FakedeletecoffeeidDeleteadditionalPropertiesBoxedVoid](#fakedeletecoffeeiddeleteadditionalpropertiesboxedvoid),
[FakedeletecoffeeidDeleteadditionalPropertiesBoxedBoolean](#fakedeletecoffeeiddeleteadditionalpropertiesboxedboolean),
[FakedeletecoffeeidDeleteadditionalPropertiesBoxedNumber](#fakedeletecoffeeiddeleteadditionalpropertiesboxednumber),
[FakedeletecoffeeidDeleteadditionalPropertiesBoxedString](#fakedeletecoffeeiddeleteadditionalpropertiesboxedstring),
[FakedeletecoffeeidDeleteadditionalPropertiesBoxedList](#fakedeletecoffeeiddeleteadditionalpropertiesboxedlist),
[FakedeletecoffeeidDeleteadditionalPropertiesBoxedMap](#fakedeletecoffeeiddeleteadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## FakedeletecoffeeidDeleteadditionalPropertiesBoxedVoid
public record FakedeletecoffeeidDeleteadditionalPropertiesBoxedVoid<br>
implements [FakedeletecoffeeidDeleteadditionalPropertiesBoxed](#fakedeletecoffeeiddeleteadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeleteadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeleteadditionalPropertiesBoxedBoolean
public record FakedeletecoffeeidDeleteadditionalPropertiesBoxedBoolean<br>
implements [FakedeletecoffeeidDeleteadditionalPropertiesBoxed](#fakedeletecoffeeiddeleteadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeleteadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeleteadditionalPropertiesBoxedNumber
public record FakedeletecoffeeidDeleteadditionalPropertiesBoxedNumber<br>
implements [FakedeletecoffeeidDeleteadditionalPropertiesBoxed](#fakedeletecoffeeiddeleteadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeleteadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeleteadditionalPropertiesBoxedString
public record FakedeletecoffeeidDeleteadditionalPropertiesBoxedString<br>
implements [FakedeletecoffeeidDeleteadditionalPropertiesBoxed](#fakedeletecoffeeiddeleteadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeleteadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeleteadditionalPropertiesBoxedList
public record FakedeletecoffeeidDeleteadditionalPropertiesBoxedList<br>
implements [FakedeletecoffeeidDeleteadditionalPropertiesBoxed](#fakedeletecoffeeiddeleteadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeleteadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeleteadditionalPropertiesBoxedMap
public record FakedeletecoffeeidDeleteadditionalPropertiesBoxedMap<br>
implements [FakedeletecoffeeidDeleteadditionalPropertiesBoxed](#fakedeletecoffeeiddeleteadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakedeletecoffeeidDeleteadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakedeletecoffeeidDeleteadditionalProperties
public static class FakedeletecoffeeidDeleteadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
