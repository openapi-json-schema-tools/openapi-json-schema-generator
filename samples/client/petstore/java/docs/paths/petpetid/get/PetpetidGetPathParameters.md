# PetpetidGetPathParameters
public class PetpetidGetPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetpetidGetPathParameters.PetpetidGetPathParameters1Boxed](#petpetidgetpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetpetidGetPathParameters.PetpetidGetPathParameters1BoxedMap](#petpetidgetpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidGetPathParameters.PetpetidGetPathParameters1](#petpetidgetpathparameters1)<br> schema class |
| static class | [PetpetidGetPathParameters.PetpetidGetPathParametersMapBuilder](#petpetidgetpathparametersmapbuilder)<br> builder for Map payloads |
| static class | [PetpetidGetPathParameters.PetpetidGetPathParametersMap](#petpetidgetpathparametersmap)<br> output class for Map payloads |
| sealed interface | [PetpetidGetPathParameters.PetpetidGetadditionalPropertiesBoxed](#petpetidgetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [PetpetidGetPathParameters.PetpetidGetadditionalPropertiesBoxedVoid](#petpetidgetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [PetpetidGetPathParameters.PetpetidGetadditionalPropertiesBoxedBoolean](#petpetidgetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetpetidGetPathParameters.PetpetidGetadditionalPropertiesBoxedNumber](#petpetidgetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [PetpetidGetPathParameters.PetpetidGetadditionalPropertiesBoxedString](#petpetidgetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [PetpetidGetPathParameters.PetpetidGetadditionalPropertiesBoxedList](#petpetidgetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [PetpetidGetPathParameters.PetpetidGetadditionalPropertiesBoxedMap](#petpetidgetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidGetPathParameters.PetpetidGetadditionalProperties](#petpetidgetadditionalproperties)<br> schema class |

## PetpetidGetPathParameters1Boxed
public sealed interface PetpetidGetPathParameters1Boxed<br>
permits<br>
[PetpetidGetPathParameters1BoxedMap](#petpetidgetpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidGetPathParameters1BoxedMap
public record PetpetidGetPathParameters1BoxedMap<br>
implements [PetpetidGetPathParameters1Boxed](#petpetidgetpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetPathParameters1BoxedMap([PetpetidGetPathParametersMap](#petpetidgetpathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidGetPathParametersMap](#petpetidgetpathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetPathParameters1
public static class PetpetidGetPathParameters1<br>
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
import org.openapijsonschematools.client.paths.petpetid.get.PetpetidGetPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetpetidGetPathParameters.PetpetidGetPathParametersMap validatedPayload =
    PetpetidGetPathParameters.PetpetidGetPathParameters1.validate(
    new PetpetidGetPathParameters.PetpetidGetPathParametersMapBuilder()
        .petId(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("petId", [Schema0.Schema01.class](../../../paths/petpetid/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"petId"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetpetidGetadditionalProperties.class](#petpetidgetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidGetPathParametersMap](#petpetidgetpathparametersmap) | validate([Map&lt;?, ?&gt;](#petpetidgetpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetpetidGetPathParameters1BoxedMap](#petpetidgetpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petpetidgetpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetpetidGetPathParameters1Boxed](#petpetidgetpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetpetidGetPathParametersMap0Builder
public class PetpetidGetPathParametersMap0Builder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetPathParametersMap0Builder(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## PetpetidGetPathParametersMapBuilder
public class PetpetidGetPathParametersMapBuilder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetPathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidGetPathParametersMap0Builder](#petpetidgetpathparametersmap0builder) | petId(int value) |
| [PetpetidGetPathParametersMap0Builder](#petpetidgetpathparametersmap0builder) | petId(float value) |
| [PetpetidGetPathParametersMap0Builder](#petpetidgetpathparametersmap0builder) | petId(long value) |
| [PetpetidGetPathParametersMap0Builder](#petpetidgetpathparametersmap0builder) | petId(double value) |

## PetpetidGetPathParametersMap
public static class PetpetidGetPathParametersMap<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetpetidGetPathParametersMap](#petpetidgetpathparametersmap) | of([Map<String, Number>](#petpetidgetpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| Number | petId()<br> |

## PetpetidGetadditionalPropertiesBoxed
public sealed interface PetpetidGetadditionalPropertiesBoxed<br>
permits<br>
[PetpetidGetadditionalPropertiesBoxedVoid](#petpetidgetadditionalpropertiesboxedvoid),
[PetpetidGetadditionalPropertiesBoxedBoolean](#petpetidgetadditionalpropertiesboxedboolean),
[PetpetidGetadditionalPropertiesBoxedNumber](#petpetidgetadditionalpropertiesboxednumber),
[PetpetidGetadditionalPropertiesBoxedString](#petpetidgetadditionalpropertiesboxedstring),
[PetpetidGetadditionalPropertiesBoxedList](#petpetidgetadditionalpropertiesboxedlist),
[PetpetidGetadditionalPropertiesBoxedMap](#petpetidgetadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidGetadditionalPropertiesBoxedVoid
public record PetpetidGetadditionalPropertiesBoxedVoid<br>
implements [PetpetidGetadditionalPropertiesBoxed](#petpetidgetadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetadditionalPropertiesBoxedBoolean
public record PetpetidGetadditionalPropertiesBoxedBoolean<br>
implements [PetpetidGetadditionalPropertiesBoxed](#petpetidgetadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetadditionalPropertiesBoxedNumber
public record PetpetidGetadditionalPropertiesBoxedNumber<br>
implements [PetpetidGetadditionalPropertiesBoxed](#petpetidgetadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetadditionalPropertiesBoxedString
public record PetpetidGetadditionalPropertiesBoxedString<br>
implements [PetpetidGetadditionalPropertiesBoxed](#petpetidgetadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetadditionalPropertiesBoxedList
public record PetpetidGetadditionalPropertiesBoxedList<br>
implements [PetpetidGetadditionalPropertiesBoxed](#petpetidgetadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetadditionalPropertiesBoxedMap
public record PetpetidGetadditionalPropertiesBoxedMap<br>
implements [PetpetidGetadditionalPropertiesBoxed](#petpetidgetadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidGetadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidGetadditionalProperties
public static class PetpetidGetadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
