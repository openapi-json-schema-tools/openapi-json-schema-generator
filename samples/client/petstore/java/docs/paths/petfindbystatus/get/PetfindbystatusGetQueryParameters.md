# PetfindbystatusGetQueryParameters
public class PetfindbystatusGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1Boxed](#petfindbystatusgetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1BoxedMap](#petfindbystatusgetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1](#petfindbystatusgetqueryparameters1)<br> schema class |
| static class | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParametersMapBuilder](#petfindbystatusgetqueryparametersmapbuilder)<br> builder for Map payloads |
| static class | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParametersMap](#petfindbystatusgetqueryparametersmap)<br> output class for Map payloads |
| sealed interface | [PetfindbystatusGetQueryParameters.PetfindbystatusGetadditionalPropertiesBoxed](#petfindbystatusgetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetadditionalPropertiesBoxedVoid](#petfindbystatusgetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetadditionalPropertiesBoxedBoolean](#petfindbystatusgetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetadditionalPropertiesBoxedNumber](#petfindbystatusgetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetadditionalPropertiesBoxedString](#petfindbystatusgetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetadditionalPropertiesBoxedList](#petfindbystatusgetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetadditionalPropertiesBoxedMap](#petfindbystatusgetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetfindbystatusGetQueryParameters.PetfindbystatusGetadditionalProperties](#petfindbystatusgetadditionalproperties)<br> schema class |

## PetfindbystatusGetQueryParameters1Boxed
public sealed interface PetfindbystatusGetQueryParameters1Boxed<br>
permits<br>
[PetfindbystatusGetQueryParameters1BoxedMap](#petfindbystatusgetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetfindbystatusGetQueryParameters1BoxedMap
public record PetfindbystatusGetQueryParameters1BoxedMap<br>
implements [PetfindbystatusGetQueryParameters1Boxed](#petfindbystatusgetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParameters1BoxedMap([PetfindbystatusGetQueryParametersMap](#petfindbystatusgetqueryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbystatusGetQueryParametersMap](#petfindbystatusgetqueryparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetQueryParameters1
public static class PetfindbystatusGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.petfindbystatus.get.PetfindbystatusGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParametersMap validatedPayload =
    PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1.validate(
    new PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParametersMapBuilder()
        .status(
            Arrays.asList(
                "available"
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("status", [Schema0.Schema01.class](../../../paths/petfindbystatus/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"status"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetfindbystatusGetadditionalProperties.class](#petfindbystatusgetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbystatusGetQueryParametersMap](#petfindbystatusgetqueryparametersmap) | validate([Map&lt;?, ?&gt;](#petfindbystatusgetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetfindbystatusGetQueryParameters1BoxedMap](#petfindbystatusgetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petfindbystatusgetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetfindbystatusGetQueryParameters1Boxed](#petfindbystatusgetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetfindbystatusGetQueryParametersMap0Builder
public class PetfindbystatusGetQueryParametersMap0Builder<br>
builder for `Map<String, List<String>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParametersMap0Builder(Map<String, List<String>> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, List<String>> | build()<br>Returns map input that should be used with Schema.validate |

## PetfindbystatusGetQueryParametersMapBuilder
public class PetfindbystatusGetQueryParametersMapBuilder<br>
builder for `Map<String, List<String>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbystatusGetQueryParametersMap0Builder](#petfindbystatusgetqueryparametersmap0builder) | status(List<String> value) |

## PetfindbystatusGetQueryParametersMap
public static class PetfindbystatusGetQueryParametersMap<br>
extends FrozenMap<String, Schema0.SchemaList0>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetfindbystatusGetQueryParametersMap](#petfindbystatusgetqueryparametersmap) | of([Map<String, List<String>>](#petfindbystatusgetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Schema0.SchemaList0](../../../paths/petfindbystatus/get/parameters/parameter0/Schema0.md#schemalist0) | status()<br> |

## PetfindbystatusGetadditionalPropertiesBoxed
public sealed interface PetfindbystatusGetadditionalPropertiesBoxed<br>
permits<br>
[PetfindbystatusGetadditionalPropertiesBoxedVoid](#petfindbystatusgetadditionalpropertiesboxedvoid),
[PetfindbystatusGetadditionalPropertiesBoxedBoolean](#petfindbystatusgetadditionalpropertiesboxedboolean),
[PetfindbystatusGetadditionalPropertiesBoxedNumber](#petfindbystatusgetadditionalpropertiesboxednumber),
[PetfindbystatusGetadditionalPropertiesBoxedString](#petfindbystatusgetadditionalpropertiesboxedstring),
[PetfindbystatusGetadditionalPropertiesBoxedList](#petfindbystatusgetadditionalpropertiesboxedlist),
[PetfindbystatusGetadditionalPropertiesBoxedMap](#petfindbystatusgetadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## PetfindbystatusGetadditionalPropertiesBoxedVoid
public record PetfindbystatusGetadditionalPropertiesBoxedVoid<br>
implements [PetfindbystatusGetadditionalPropertiesBoxed](#petfindbystatusgetadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetadditionalPropertiesBoxedBoolean
public record PetfindbystatusGetadditionalPropertiesBoxedBoolean<br>
implements [PetfindbystatusGetadditionalPropertiesBoxed](#petfindbystatusgetadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetadditionalPropertiesBoxedNumber
public record PetfindbystatusGetadditionalPropertiesBoxedNumber<br>
implements [PetfindbystatusGetadditionalPropertiesBoxed](#petfindbystatusgetadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetadditionalPropertiesBoxedString
public record PetfindbystatusGetadditionalPropertiesBoxedString<br>
implements [PetfindbystatusGetadditionalPropertiesBoxed](#petfindbystatusgetadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetadditionalPropertiesBoxedList
public record PetfindbystatusGetadditionalPropertiesBoxedList<br>
implements [PetfindbystatusGetadditionalPropertiesBoxed](#petfindbystatusgetadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetadditionalPropertiesBoxedMap
public record PetfindbystatusGetadditionalPropertiesBoxedMap<br>
implements [PetfindbystatusGetadditionalPropertiesBoxed](#petfindbystatusgetadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetadditionalProperties
public static class PetfindbystatusGetadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
