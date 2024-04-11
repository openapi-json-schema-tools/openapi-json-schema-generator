# PetpetidDeletePathParameters
public class PetpetidDeletePathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetpetidDeletePathParameters.PetpetidDeletePathParameters1Boxed](#petpetiddeletepathparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeletePathParameters1BoxedMap](#petpetiddeletepathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidDeletePathParameters.PetpetidDeletePathParameters1](#petpetiddeletepathparameters1)<br> schema class |
| static class | [PetpetidDeletePathParameters.PetpetidDeletePathParametersMapBuilder](#petpetiddeletepathparametersmapbuilder)<br> builder for Map payloads |
| static class | [PetpetidDeletePathParameters.PetpetidDeletePathParametersMap](#petpetiddeletepathparametersmap)<br> output class for Map payloads |
| sealed interface | [PetpetidDeletePathParameters.PetpetidDeleteadditionalPropertiesBoxed](#petpetiddeleteadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeleteadditionalPropertiesBoxedVoid](#petpetiddeleteadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeleteadditionalPropertiesBoxedBoolean](#petpetiddeleteadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeleteadditionalPropertiesBoxedNumber](#petpetiddeleteadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeleteadditionalPropertiesBoxedString](#petpetiddeleteadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeleteadditionalPropertiesBoxedList](#petpetiddeleteadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [PetpetidDeletePathParameters.PetpetidDeleteadditionalPropertiesBoxedMap](#petpetiddeleteadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidDeletePathParameters.PetpetidDeleteadditionalProperties](#petpetiddeleteadditionalproperties)<br> schema class |

## PetpetidDeletePathParameters1Boxed
public sealed interface PetpetidDeletePathParameters1Boxed<br>
permits<br>
[PetpetidDeletePathParameters1BoxedMap](#petpetiddeletepathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidDeletePathParameters1BoxedMap
public record PetpetidDeletePathParameters1BoxedMap<br>
implements [PetpetidDeletePathParameters1Boxed](#petpetiddeletepathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeletePathParameters1BoxedMap([PetpetidDeletePathParametersMap](#petpetiddeletepathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidDeletePathParametersMap](#petpetiddeletepathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeletePathParameters1
public static class PetpetidDeletePathParameters1<br>
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
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeletePathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetpetidDeletePathParameters.PetpetidDeletePathParametersMap validatedPayload =
    PetpetidDeletePathParameters.PetpetidDeletePathParameters1.validate(
    new PetpetidDeletePathParameters.PetpetidDeletePathParametersMapBuilder()
        .petId(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("petId", [Schema1.Schema11.class](../../../paths/petpetid/delete/parameters/parameter1/Schema1.md#schema11))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"petId"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetpetidDeleteadditionalProperties.class](#petpetiddeleteadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidDeletePathParametersMap](#petpetiddeletepathparametersmap) | validate([Map&lt;?, ?&gt;](#petpetiddeletepathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetpetidDeletePathParameters1BoxedMap](#petpetiddeletepathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petpetiddeletepathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetpetidDeletePathParameters1Boxed](#petpetiddeletepathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetpetidDeletePathParametersMap0Builder
public class PetpetidDeletePathParametersMap0Builder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeletePathParametersMap0Builder(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## PetpetidDeletePathParametersMapBuilder
public class PetpetidDeletePathParametersMapBuilder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeletePathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidDeletePathParametersMap0Builder](#petpetiddeletepathparametersmap0builder) | petId(int value) |
| [PetpetidDeletePathParametersMap0Builder](#petpetiddeletepathparametersmap0builder) | petId(float value) |
| [PetpetidDeletePathParametersMap0Builder](#petpetiddeletepathparametersmap0builder) | petId(long value) |
| [PetpetidDeletePathParametersMap0Builder](#petpetiddeletepathparametersmap0builder) | petId(double value) |

## PetpetidDeletePathParametersMap
public static class PetpetidDeletePathParametersMap<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetpetidDeletePathParametersMap](#petpetiddeletepathparametersmap) | of([Map<String, Number>](#petpetiddeletepathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| Number | petId()<br> |

## PetpetidDeleteadditionalPropertiesBoxed
public sealed interface PetpetidDeleteadditionalPropertiesBoxed<br>
permits<br>
[PetpetidDeleteadditionalPropertiesBoxedVoid](#petpetiddeleteadditionalpropertiesboxedvoid),
[PetpetidDeleteadditionalPropertiesBoxedBoolean](#petpetiddeleteadditionalpropertiesboxedboolean),
[PetpetidDeleteadditionalPropertiesBoxedNumber](#petpetiddeleteadditionalpropertiesboxednumber),
[PetpetidDeleteadditionalPropertiesBoxedString](#petpetiddeleteadditionalpropertiesboxedstring),
[PetpetidDeleteadditionalPropertiesBoxedList](#petpetiddeleteadditionalpropertiesboxedlist),
[PetpetidDeleteadditionalPropertiesBoxedMap](#petpetiddeleteadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidDeleteadditionalPropertiesBoxedVoid
public record PetpetidDeleteadditionalPropertiesBoxedVoid<br>
implements [PetpetidDeleteadditionalPropertiesBoxed](#petpetiddeleteadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteadditionalPropertiesBoxedBoolean
public record PetpetidDeleteadditionalPropertiesBoxedBoolean<br>
implements [PetpetidDeleteadditionalPropertiesBoxed](#petpetiddeleteadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteadditionalPropertiesBoxedNumber
public record PetpetidDeleteadditionalPropertiesBoxedNumber<br>
implements [PetpetidDeleteadditionalPropertiesBoxed](#petpetiddeleteadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteadditionalPropertiesBoxedString
public record PetpetidDeleteadditionalPropertiesBoxedString<br>
implements [PetpetidDeleteadditionalPropertiesBoxed](#petpetiddeleteadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteadditionalPropertiesBoxedList
public record PetpetidDeleteadditionalPropertiesBoxedList<br>
implements [PetpetidDeleteadditionalPropertiesBoxed](#petpetiddeleteadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteadditionalPropertiesBoxedMap
public record PetpetidDeleteadditionalPropertiesBoxedMap<br>
implements [PetpetidDeleteadditionalPropertiesBoxed](#petpetiddeleteadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteadditionalProperties
public static class PetpetidDeleteadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
