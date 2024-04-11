# PetpetidPostPathParameters
public class PetpetidPostPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetpetidPostPathParameters.PetpetidPostPathParameters1Boxed](#petpetidpostpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetpetidPostPathParameters.PetpetidPostPathParameters1BoxedMap](#petpetidpostpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidPostPathParameters.PetpetidPostPathParameters1](#petpetidpostpathparameters1)<br> schema class |
| static class | [PetpetidPostPathParameters.PetpetidPostPathParametersMapBuilder](#petpetidpostpathparametersmapbuilder)<br> builder for Map payloads |
| static class | [PetpetidPostPathParameters.PetpetidPostPathParametersMap](#petpetidpostpathparametersmap)<br> output class for Map payloads |
| sealed interface | [PetpetidPostPathParameters.PetpetidPostadditionalPropertiesBoxed](#petpetidpostadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [PetpetidPostPathParameters.PetpetidPostadditionalPropertiesBoxedVoid](#petpetidpostadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [PetpetidPostPathParameters.PetpetidPostadditionalPropertiesBoxedBoolean](#petpetidpostadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetpetidPostPathParameters.PetpetidPostadditionalPropertiesBoxedNumber](#petpetidpostadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [PetpetidPostPathParameters.PetpetidPostadditionalPropertiesBoxedString](#petpetidpostadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [PetpetidPostPathParameters.PetpetidPostadditionalPropertiesBoxedList](#petpetidpostadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [PetpetidPostPathParameters.PetpetidPostadditionalPropertiesBoxedMap](#petpetidpostadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidPostPathParameters.PetpetidPostadditionalProperties](#petpetidpostadditionalproperties)<br> schema class |

## PetpetidPostPathParameters1Boxed
public sealed interface PetpetidPostPathParameters1Boxed<br>
permits<br>
[PetpetidPostPathParameters1BoxedMap](#petpetidpostpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidPostPathParameters1BoxedMap
public record PetpetidPostPathParameters1BoxedMap<br>
implements [PetpetidPostPathParameters1Boxed](#petpetidpostpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostPathParameters1BoxedMap([PetpetidPostPathParametersMap](#petpetidpostpathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidPostPathParametersMap](#petpetidpostpathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostPathParameters1
public static class PetpetidPostPathParameters1<br>
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
import org.openapijsonschematools.client.paths.petpetid.post.PetpetidPostPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetpetidPostPathParameters.PetpetidPostPathParametersMap validatedPayload =
    PetpetidPostPathParameters.PetpetidPostPathParameters1.validate(
    new PetpetidPostPathParameters.PetpetidPostPathParametersMapBuilder()
        .petId(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("petId", [Schema0.Schema01.class](../../../paths/petpetid/post/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"petId"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetpetidPostadditionalProperties.class](#petpetidpostadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidPostPathParametersMap](#petpetidpostpathparametersmap) | validate([Map&lt;?, ?&gt;](#petpetidpostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetpetidPostPathParameters1BoxedMap](#petpetidpostpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petpetidpostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetpetidPostPathParameters1Boxed](#petpetidpostpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetpetidPostPathParametersMap0Builder
public class PetpetidPostPathParametersMap0Builder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostPathParametersMap0Builder(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## PetpetidPostPathParametersMapBuilder
public class PetpetidPostPathParametersMapBuilder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostPathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidPostPathParametersMap0Builder](#petpetidpostpathparametersmap0builder) | petId(int value) |
| [PetpetidPostPathParametersMap0Builder](#petpetidpostpathparametersmap0builder) | petId(float value) |
| [PetpetidPostPathParametersMap0Builder](#petpetidpostpathparametersmap0builder) | petId(long value) |
| [PetpetidPostPathParametersMap0Builder](#petpetidpostpathparametersmap0builder) | petId(double value) |

## PetpetidPostPathParametersMap
public static class PetpetidPostPathParametersMap<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetpetidPostPathParametersMap](#petpetidpostpathparametersmap) | of([Map<String, Number>](#petpetidpostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| Number | petId()<br> |

## PetpetidPostadditionalPropertiesBoxed
public sealed interface PetpetidPostadditionalPropertiesBoxed<br>
permits<br>
[PetpetidPostadditionalPropertiesBoxedVoid](#petpetidpostadditionalpropertiesboxedvoid),
[PetpetidPostadditionalPropertiesBoxedBoolean](#petpetidpostadditionalpropertiesboxedboolean),
[PetpetidPostadditionalPropertiesBoxedNumber](#petpetidpostadditionalpropertiesboxednumber),
[PetpetidPostadditionalPropertiesBoxedString](#petpetidpostadditionalpropertiesboxedstring),
[PetpetidPostadditionalPropertiesBoxedList](#petpetidpostadditionalpropertiesboxedlist),
[PetpetidPostadditionalPropertiesBoxedMap](#petpetidpostadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidPostadditionalPropertiesBoxedVoid
public record PetpetidPostadditionalPropertiesBoxedVoid<br>
implements [PetpetidPostadditionalPropertiesBoxed](#petpetidpostadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostadditionalPropertiesBoxedBoolean
public record PetpetidPostadditionalPropertiesBoxedBoolean<br>
implements [PetpetidPostadditionalPropertiesBoxed](#petpetidpostadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostadditionalPropertiesBoxedNumber
public record PetpetidPostadditionalPropertiesBoxedNumber<br>
implements [PetpetidPostadditionalPropertiesBoxed](#petpetidpostadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostadditionalPropertiesBoxedString
public record PetpetidPostadditionalPropertiesBoxedString<br>
implements [PetpetidPostadditionalPropertiesBoxed](#petpetidpostadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostadditionalPropertiesBoxedList
public record PetpetidPostadditionalPropertiesBoxedList<br>
implements [PetpetidPostadditionalPropertiesBoxed](#petpetidpostadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostadditionalPropertiesBoxedMap
public record PetpetidPostadditionalPropertiesBoxedMap<br>
implements [PetpetidPostadditionalPropertiesBoxed](#petpetidpostadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPostadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidPostadditionalProperties
public static class PetpetidPostadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
