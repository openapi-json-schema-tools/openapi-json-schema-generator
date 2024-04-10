# PetpetiduploadimagePostPathParameters
public class PetpetiduploadimagePostPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters1Boxed](#petpetiduploadimagepostpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters1BoxedMap](#petpetiduploadimagepostpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters1](#petpetiduploadimagepostpathparameters1)<br> schema class |
| static class | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParametersMapBuilder](#petpetiduploadimagepostpathparametersmapbuilder)<br> builder for Map payloads |
| static class | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParametersMap](#petpetiduploadimagepostpathparametersmap)<br> output class for Map payloads |
| sealed interface | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostadditionalPropertiesBoxed](#petpetiduploadimagepostadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostadditionalPropertiesBoxedVoid](#petpetiduploadimagepostadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostadditionalPropertiesBoxedBoolean](#petpetiduploadimagepostadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostadditionalPropertiesBoxedNumber](#petpetiduploadimagepostadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostadditionalPropertiesBoxedString](#petpetiduploadimagepostadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostadditionalPropertiesBoxedList](#petpetiduploadimagepostadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostadditionalPropertiesBoxedMap](#petpetiduploadimagepostadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostadditionalProperties](#petpetiduploadimagepostadditionalproperties)<br> schema class |

## PetpetiduploadimagePostPathParameters1Boxed
public sealed interface PetpetiduploadimagePostPathParameters1Boxed<br>
permits<br>
[PetpetiduploadimagePostPathParameters1BoxedMap](#petpetiduploadimagepostpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetiduploadimagePostPathParameters1BoxedMap
public record PetpetiduploadimagePostPathParameters1BoxedMap<br>
implements [PetpetiduploadimagePostPathParameters1Boxed](#petpetiduploadimagepostpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostPathParameters1BoxedMap([PetpetiduploadimagePostPathParametersMap](#petpetiduploadimagepostpathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetiduploadimagePostPathParametersMap](#petpetiduploadimagepostpathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostPathParameters1
public static class PetpetiduploadimagePostPathParameters1<br>
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
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParametersMap validatedPayload =
    PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters1.validate(
    new PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParametersMapBuilder()
        .petId(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("petId", [Schema0.Schema01.class](../../../paths/petpetiduploadimage/post/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"petId"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetpetiduploadimagePostadditionalProperties.class](#petpetiduploadimagepostadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetiduploadimagePostPathParametersMap](#petpetiduploadimagepostpathparametersmap) | validate([Map&lt;?, ?&gt;](#petpetiduploadimagepostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetpetiduploadimagePostPathParameters1BoxedMap](#petpetiduploadimagepostpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petpetiduploadimagepostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetpetiduploadimagePostPathParameters1Boxed](#petpetiduploadimagepostpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetpetiduploadimagePostPathParametersMap0Builder
public class PetpetiduploadimagePostPathParametersMap0Builder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostPathParametersMap0Builder(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## PetpetiduploadimagePostPathParametersMapBuilder
public class PetpetiduploadimagePostPathParametersMapBuilder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostPathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetiduploadimagePostPathParametersMap0Builder](#petpetiduploadimagepostpathparametersmap0builder) | petId(int value) |
| [PetpetiduploadimagePostPathParametersMap0Builder](#petpetiduploadimagepostpathparametersmap0builder) | petId(float value) |
| [PetpetiduploadimagePostPathParametersMap0Builder](#petpetiduploadimagepostpathparametersmap0builder) | petId(long value) |
| [PetpetiduploadimagePostPathParametersMap0Builder](#petpetiduploadimagepostpathparametersmap0builder) | petId(double value) |

## PetpetiduploadimagePostPathParametersMap
public static class PetpetiduploadimagePostPathParametersMap<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetpetiduploadimagePostPathParametersMap](#petpetiduploadimagepostpathparametersmap) | of([Map<String, Number>](#petpetiduploadimagepostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| Number | petId()<br> |

## PetpetiduploadimagePostadditionalPropertiesBoxed
public sealed interface PetpetiduploadimagePostadditionalPropertiesBoxed<br>
permits<br>
[PetpetiduploadimagePostadditionalPropertiesBoxedVoid](#petpetiduploadimagepostadditionalpropertiesboxedvoid),
[PetpetiduploadimagePostadditionalPropertiesBoxedBoolean](#petpetiduploadimagepostadditionalpropertiesboxedboolean),
[PetpetiduploadimagePostadditionalPropertiesBoxedNumber](#petpetiduploadimagepostadditionalpropertiesboxednumber),
[PetpetiduploadimagePostadditionalPropertiesBoxedString](#petpetiduploadimagepostadditionalpropertiesboxedstring),
[PetpetiduploadimagePostadditionalPropertiesBoxedList](#petpetiduploadimagepostadditionalpropertiesboxedlist),
[PetpetiduploadimagePostadditionalPropertiesBoxedMap](#petpetiduploadimagepostadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetiduploadimagePostadditionalPropertiesBoxedVoid
public record PetpetiduploadimagePostadditionalPropertiesBoxedVoid<br>
implements [PetpetiduploadimagePostadditionalPropertiesBoxed](#petpetiduploadimagepostadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostadditionalPropertiesBoxedBoolean
public record PetpetiduploadimagePostadditionalPropertiesBoxedBoolean<br>
implements [PetpetiduploadimagePostadditionalPropertiesBoxed](#petpetiduploadimagepostadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostadditionalPropertiesBoxedNumber
public record PetpetiduploadimagePostadditionalPropertiesBoxedNumber<br>
implements [PetpetiduploadimagePostadditionalPropertiesBoxed](#petpetiduploadimagepostadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostadditionalPropertiesBoxedString
public record PetpetiduploadimagePostadditionalPropertiesBoxedString<br>
implements [PetpetiduploadimagePostadditionalPropertiesBoxed](#petpetiduploadimagepostadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostadditionalPropertiesBoxedList
public record PetpetiduploadimagePostadditionalPropertiesBoxedList<br>
implements [PetpetiduploadimagePostadditionalPropertiesBoxed](#petpetiduploadimagepostadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostadditionalPropertiesBoxedMap
public record PetpetiduploadimagePostadditionalPropertiesBoxedMap<br>
implements [PetpetiduploadimagePostadditionalPropertiesBoxed](#petpetiduploadimagepostadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetiduploadimagePostadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetiduploadimagePostadditionalProperties
public static class PetpetiduploadimagePostadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
