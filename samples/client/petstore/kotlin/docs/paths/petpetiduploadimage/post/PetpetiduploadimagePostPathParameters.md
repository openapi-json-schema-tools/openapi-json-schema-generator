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
| static class | [PetpetiduploadimagePostPathParameters.PathParametersMapBuilder](#pathparametersmapbuilder)<br> builder for Map payloads |
| static class | [PetpetiduploadimagePostPathParameters.PathParametersMap](#pathparametersmap)<br> output class for Map payloads |
| sealed interface | [PetpetiduploadimagePostPathParameters.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [PetpetiduploadimagePostPathParameters.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [PetpetiduploadimagePostPathParameters.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetpetiduploadimagePostPathParameters.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [PetpetiduploadimagePostPathParameters.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [PetpetiduploadimagePostPathParameters.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [PetpetiduploadimagePostPathParameters.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetiduploadimagePostPathParameters.AdditionalProperties](#additionalproperties)<br> schema class |

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
| PetpetiduploadimagePostPathParameters1BoxedMap([PathParametersMap](#pathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap](#pathparametersmap) | data()<br>validated payload |
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
PetpetiduploadimagePostPathParameters.PathParametersMap validatedPayload =
    PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters1.validate(
    new PetpetiduploadimagePostPathParameters.PathParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap](#pathparametersmap) | validate([Map&lt;?, ?&gt;](#pathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetpetiduploadimagePostPathParameters1BoxedMap](#petpetiduploadimagepostpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#pathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetpetiduploadimagePostPathParameters1Boxed](#petpetiduploadimagepostpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PathParametersMap0Builder
public class PathParametersMap0Builder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap0Builder(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## PathParametersMapBuilder
public class PathParametersMapBuilder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap0Builder](#pathparametersmap0builder) | petId(int value) |
| [PathParametersMap0Builder](#pathparametersmap0builder) | petId(float value) |
| [PathParametersMap0Builder](#pathparametersmap0builder) | petId(long value) |
| [PathParametersMap0Builder](#pathparametersmap0builder) | petId(double value) |

## PathParametersMap
public static class PathParametersMap<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PathParametersMap](#pathparametersmap) | of([Map<String, Number>](#pathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| Number | petId()<br> |

## AdditionalPropertiesBoxed
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public record AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedBoolean
public record AdditionalPropertiesBoxedBoolean<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedNumber
public record AdditionalPropertiesBoxedNumber<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedString
public record AdditionalPropertiesBoxedString<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedList
public record AdditionalPropertiesBoxedList<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedMap
public record AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
