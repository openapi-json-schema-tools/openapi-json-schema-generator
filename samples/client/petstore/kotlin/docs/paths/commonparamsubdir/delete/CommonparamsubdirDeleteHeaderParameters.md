# CommonparamsubdirDeleteHeaderParameters
public class CommonparamsubdirDeleteHeaderParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters1Boxed](#commonparamsubdirdeleteheaderparameters1boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters1BoxedMap](#commonparamsubdirdeleteheaderparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters1](#commonparamsubdirdeleteheaderparameters1)<br> schema class |
| static class | [CommonparamsubdirDeleteHeaderParameters.HeaderParametersMapBuilder](#headerparametersmapbuilder)<br> builder for Map payloads |
| static class | [CommonparamsubdirDeleteHeaderParameters.HeaderParametersMap](#headerparametersmap)<br> output class for Map payloads |
| sealed interface | [CommonparamsubdirDeleteHeaderParameters.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirDeleteHeaderParameters.AdditionalProperties](#additionalproperties)<br> schema class |

## CommonparamsubdirDeleteHeaderParameters1Boxed
public sealed interface CommonparamsubdirDeleteHeaderParameters1Boxed<br>
permits<br>
[CommonparamsubdirDeleteHeaderParameters1BoxedMap](#commonparamsubdirdeleteheaderparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirDeleteHeaderParameters1BoxedMap
public record CommonparamsubdirDeleteHeaderParameters1BoxedMap<br>
implements [CommonparamsubdirDeleteHeaderParameters1Boxed](#commonparamsubdirdeleteheaderparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteHeaderParameters1BoxedMap([HeaderParametersMap](#headerparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [HeaderParametersMap](#headerparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteHeaderParameters1
public static class CommonparamsubdirDeleteHeaderParameters1<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.CommonparamsubdirDeleteHeaderParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
CommonparamsubdirDeleteHeaderParameters.HeaderParametersMap validatedPayload =
    CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters1.validate(
    new CommonparamsubdirDeleteHeaderParameters.HeaderParametersMapBuilder()
        .someHeader("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someHeader", [Schema0.Schema01.class](../../../paths/commonparamsubdir/delete/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [HeaderParametersMap](#headerparametersmap) | validate([Map&lt;?, ?&gt;](#headerparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirDeleteHeaderParameters1BoxedMap](#commonparamsubdirdeleteheaderparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#headerparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirDeleteHeaderParameters1Boxed](#commonparamsubdirdeleteheaderparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## HeaderParametersMapBuilder
public class HeaderParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HeaderParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [HeaderParametersMapBuilder](#headerparametersmapbuilder) | someHeader(String value) |

## HeaderParametersMap
public static class HeaderParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [HeaderParametersMap](#headerparametersmap) | of([Map<String, String>](#headerparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | someHeader()<br>[optional] |

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
