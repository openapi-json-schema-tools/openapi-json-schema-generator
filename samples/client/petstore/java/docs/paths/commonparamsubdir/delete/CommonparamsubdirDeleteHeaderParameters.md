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
| static class | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParametersMapBuilder](#commonparamsubdirdeleteheaderparametersmapbuilder)<br> builder for Map payloads |
| static class | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParametersMap](#commonparamsubdirdeleteheaderparametersmap)<br> output class for Map payloads |
| sealed interface | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteadditionalPropertiesBoxed](#commonparamsubdirdeleteadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteadditionalPropertiesBoxedVoid](#commonparamsubdirdeleteadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteadditionalPropertiesBoxedBoolean](#commonparamsubdirdeleteadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteadditionalPropertiesBoxedNumber](#commonparamsubdirdeleteadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteadditionalPropertiesBoxedString](#commonparamsubdirdeleteadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteadditionalPropertiesBoxedList](#commonparamsubdirdeleteadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteadditionalPropertiesBoxedMap](#commonparamsubdirdeleteadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteadditionalProperties](#commonparamsubdirdeleteadditionalproperties)<br> schema class |

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
| CommonparamsubdirDeleteHeaderParameters1BoxedMap([CommonparamsubdirDeleteHeaderParametersMap](#commonparamsubdirdeleteheaderparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirDeleteHeaderParametersMap](#commonparamsubdirdeleteheaderparametersmap) | data()<br>validated payload |
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
CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParametersMap validatedPayload =
    CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParameters1.validate(
    new CommonparamsubdirDeleteHeaderParameters.CommonparamsubdirDeleteHeaderParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [CommonparamsubdirDeleteadditionalProperties.class](#commonparamsubdirdeleteadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirDeleteHeaderParametersMap](#commonparamsubdirdeleteheaderparametersmap) | validate([Map&lt;?, ?&gt;](#commonparamsubdirdeleteheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirDeleteHeaderParameters1BoxedMap](#commonparamsubdirdeleteheaderparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#commonparamsubdirdeleteheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirDeleteHeaderParameters1Boxed](#commonparamsubdirdeleteheaderparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## CommonparamsubdirDeleteHeaderParametersMapBuilder
public class CommonparamsubdirDeleteHeaderParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteHeaderParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [CommonparamsubdirDeleteHeaderParametersMapBuilder](#commonparamsubdirdeleteheaderparametersmapbuilder) | someHeader(String value) |

## CommonparamsubdirDeleteHeaderParametersMap
public static class CommonparamsubdirDeleteHeaderParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CommonparamsubdirDeleteHeaderParametersMap](#commonparamsubdirdeleteheaderparametersmap) | of([Map<String, String>](#commonparamsubdirdeleteheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | someHeader()<br>[optional] |

## CommonparamsubdirDeleteadditionalPropertiesBoxed
public sealed interface CommonparamsubdirDeleteadditionalPropertiesBoxed<br>
permits<br>
[CommonparamsubdirDeleteadditionalPropertiesBoxedVoid](#commonparamsubdirdeleteadditionalpropertiesboxedvoid),
[CommonparamsubdirDeleteadditionalPropertiesBoxedBoolean](#commonparamsubdirdeleteadditionalpropertiesboxedboolean),
[CommonparamsubdirDeleteadditionalPropertiesBoxedNumber](#commonparamsubdirdeleteadditionalpropertiesboxednumber),
[CommonparamsubdirDeleteadditionalPropertiesBoxedString](#commonparamsubdirdeleteadditionalpropertiesboxedstring),
[CommonparamsubdirDeleteadditionalPropertiesBoxedList](#commonparamsubdirdeleteadditionalpropertiesboxedlist),
[CommonparamsubdirDeleteadditionalPropertiesBoxedMap](#commonparamsubdirdeleteadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirDeleteadditionalPropertiesBoxedVoid
public record CommonparamsubdirDeleteadditionalPropertiesBoxedVoid<br>
implements [CommonparamsubdirDeleteadditionalPropertiesBoxed](#commonparamsubdirdeleteadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteadditionalPropertiesBoxedBoolean
public record CommonparamsubdirDeleteadditionalPropertiesBoxedBoolean<br>
implements [CommonparamsubdirDeleteadditionalPropertiesBoxed](#commonparamsubdirdeleteadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteadditionalPropertiesBoxedNumber
public record CommonparamsubdirDeleteadditionalPropertiesBoxedNumber<br>
implements [CommonparamsubdirDeleteadditionalPropertiesBoxed](#commonparamsubdirdeleteadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteadditionalPropertiesBoxedString
public record CommonparamsubdirDeleteadditionalPropertiesBoxedString<br>
implements [CommonparamsubdirDeleteadditionalPropertiesBoxed](#commonparamsubdirdeleteadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteadditionalPropertiesBoxedList
public record CommonparamsubdirDeleteadditionalPropertiesBoxedList<br>
implements [CommonparamsubdirDeleteadditionalPropertiesBoxed](#commonparamsubdirdeleteadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteadditionalPropertiesBoxedMap
public record CommonparamsubdirDeleteadditionalPropertiesBoxedMap<br>
implements [CommonparamsubdirDeleteadditionalPropertiesBoxed](#commonparamsubdirdeleteadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirDeleteadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirDeleteadditionalProperties
public static class CommonparamsubdirDeleteadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
