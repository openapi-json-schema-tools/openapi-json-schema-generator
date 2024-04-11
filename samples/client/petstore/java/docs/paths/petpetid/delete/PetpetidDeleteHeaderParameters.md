# PetpetidDeleteHeaderParameters
public class PetpetidDeleteHeaderParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters1Boxed](#petpetiddeleteheaderparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters1BoxedMap](#petpetiddeleteheaderparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters1](#petpetiddeleteheaderparameters1)<br> schema class |
| static class | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParametersMapBuilder](#petpetiddeleteheaderparametersmapbuilder)<br> builder for Map payloads |
| static class | [PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParametersMap](#petpetiddeleteheaderparametersmap)<br> output class for Map payloads |
| sealed interface | [PetpetidDeleteHeaderParameters.PetpetidDeleteadditionalPropertiesBoxed](#petpetiddeleteadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteadditionalPropertiesBoxedVoid](#petpetiddeleteadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteadditionalPropertiesBoxedBoolean](#petpetiddeleteadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteadditionalPropertiesBoxedNumber](#petpetiddeleteadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteadditionalPropertiesBoxedString](#petpetiddeleteadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteadditionalPropertiesBoxedList](#petpetiddeleteadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [PetpetidDeleteHeaderParameters.PetpetidDeleteadditionalPropertiesBoxedMap](#petpetiddeleteadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetpetidDeleteHeaderParameters.PetpetidDeleteadditionalProperties](#petpetiddeleteadditionalproperties)<br> schema class |

## PetpetidDeleteHeaderParameters1Boxed
public sealed interface PetpetidDeleteHeaderParameters1Boxed<br>
permits<br>
[PetpetidDeleteHeaderParameters1BoxedMap](#petpetiddeleteheaderparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetpetidDeleteHeaderParameters1BoxedMap
public record PetpetidDeleteHeaderParameters1BoxedMap<br>
implements [PetpetidDeleteHeaderParameters1Boxed](#petpetiddeleteheaderparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteHeaderParameters1BoxedMap([PetpetidDeleteHeaderParametersMap](#petpetiddeleteheaderparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidDeleteHeaderParametersMap](#petpetiddeleteheaderparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetpetidDeleteHeaderParameters1
public static class PetpetidDeleteHeaderParameters1<br>
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
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteHeaderParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParametersMap validatedPayload =
    PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParameters1.validate(
    new PetpetidDeleteHeaderParameters.PetpetidDeleteHeaderParametersMapBuilder()
        .api_key("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("api_key", [Schema0.Schema01.class](../../../paths/petpetid/delete/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetpetidDeleteadditionalProperties.class](#petpetiddeleteadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetidDeleteHeaderParametersMap](#petpetiddeleteheaderparametersmap) | validate([Map&lt;?, ?&gt;](#petpetiddeleteheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetpetidDeleteHeaderParameters1BoxedMap](#petpetiddeleteheaderparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petpetiddeleteheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetpetidDeleteHeaderParameters1Boxed](#petpetiddeleteheaderparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetpetidDeleteHeaderParametersMapBuilder
public class PetpetidDeleteHeaderParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidDeleteHeaderParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [PetpetidDeleteHeaderParametersMapBuilder](#petpetiddeleteheaderparametersmapbuilder) | api_key(String value) |

## PetpetidDeleteHeaderParametersMap
public static class PetpetidDeleteHeaderParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetpetidDeleteHeaderParametersMap](#petpetiddeleteheaderparametersmap) | of([Map<String, String>](#petpetiddeleteheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | api_key()<br>[optional] |

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
