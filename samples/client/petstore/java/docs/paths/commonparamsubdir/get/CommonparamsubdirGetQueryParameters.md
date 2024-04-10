# CommonparamsubdirGetQueryParameters
public class CommonparamsubdirGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters1Boxed](#commonparamsubdirgetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters1BoxedMap](#commonparamsubdirgetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters1](#commonparamsubdirgetqueryparameters1)<br> schema class |
| static class | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParametersMapBuilder](#commonparamsubdirgetqueryparametersmapbuilder)<br> builder for Map payloads |
| static class | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParametersMap](#commonparamsubdirgetqueryparametersmap)<br> output class for Map payloads |
| sealed interface | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetadditionalPropertiesBoxed](#commonparamsubdirgetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetadditionalPropertiesBoxedVoid](#commonparamsubdirgetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetadditionalPropertiesBoxedBoolean](#commonparamsubdirgetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetadditionalPropertiesBoxedNumber](#commonparamsubdirgetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetadditionalPropertiesBoxedString](#commonparamsubdirgetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetadditionalPropertiesBoxedList](#commonparamsubdirgetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetadditionalPropertiesBoxedMap](#commonparamsubdirgetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirGetQueryParameters.CommonparamsubdirGetadditionalProperties](#commonparamsubdirgetadditionalproperties)<br> schema class |

## CommonparamsubdirGetQueryParameters1Boxed
public sealed interface CommonparamsubdirGetQueryParameters1Boxed<br>
permits<br>
[CommonparamsubdirGetQueryParameters1BoxedMap](#commonparamsubdirgetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirGetQueryParameters1BoxedMap
public record CommonparamsubdirGetQueryParameters1BoxedMap<br>
implements [CommonparamsubdirGetQueryParameters1Boxed](#commonparamsubdirgetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetQueryParameters1BoxedMap([CommonparamsubdirGetQueryParametersMap](#commonparamsubdirgetqueryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirGetQueryParametersMap](#commonparamsubdirgetqueryparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetQueryParameters1
public static class CommonparamsubdirGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.get.CommonparamsubdirGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParametersMap validatedPayload =
    CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParameters1.validate(
    new CommonparamsubdirGetQueryParameters.CommonparamsubdirGetQueryParametersMapBuilder()
        .searchStr("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("searchStr", [Schema0.Schema01.class](../../../paths/commonparamsubdir/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [CommonparamsubdirGetadditionalProperties.class](#commonparamsubdirgetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirGetQueryParametersMap](#commonparamsubdirgetqueryparametersmap) | validate([Map&lt;?, ?&gt;](#commonparamsubdirgetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirGetQueryParameters1BoxedMap](#commonparamsubdirgetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#commonparamsubdirgetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirGetQueryParameters1Boxed](#commonparamsubdirgetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## CommonparamsubdirGetQueryParametersMapBuilder
public class CommonparamsubdirGetQueryParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [CommonparamsubdirGetQueryParametersMapBuilder](#commonparamsubdirgetqueryparametersmapbuilder) | searchStr(String value) |

## CommonparamsubdirGetQueryParametersMap
public static class CommonparamsubdirGetQueryParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CommonparamsubdirGetQueryParametersMap](#commonparamsubdirgetqueryparametersmap) | of([Map<String, String>](#commonparamsubdirgetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | searchStr()<br>[optional] |

## CommonparamsubdirGetadditionalPropertiesBoxed
public sealed interface CommonparamsubdirGetadditionalPropertiesBoxed<br>
permits<br>
[CommonparamsubdirGetadditionalPropertiesBoxedVoid](#commonparamsubdirgetadditionalpropertiesboxedvoid),
[CommonparamsubdirGetadditionalPropertiesBoxedBoolean](#commonparamsubdirgetadditionalpropertiesboxedboolean),
[CommonparamsubdirGetadditionalPropertiesBoxedNumber](#commonparamsubdirgetadditionalpropertiesboxednumber),
[CommonparamsubdirGetadditionalPropertiesBoxedString](#commonparamsubdirgetadditionalpropertiesboxedstring),
[CommonparamsubdirGetadditionalPropertiesBoxedList](#commonparamsubdirgetadditionalpropertiesboxedlist),
[CommonparamsubdirGetadditionalPropertiesBoxedMap](#commonparamsubdirgetadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirGetadditionalPropertiesBoxedVoid
public record CommonparamsubdirGetadditionalPropertiesBoxedVoid<br>
implements [CommonparamsubdirGetadditionalPropertiesBoxed](#commonparamsubdirgetadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetadditionalPropertiesBoxedBoolean
public record CommonparamsubdirGetadditionalPropertiesBoxedBoolean<br>
implements [CommonparamsubdirGetadditionalPropertiesBoxed](#commonparamsubdirgetadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetadditionalPropertiesBoxedNumber
public record CommonparamsubdirGetadditionalPropertiesBoxedNumber<br>
implements [CommonparamsubdirGetadditionalPropertiesBoxed](#commonparamsubdirgetadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetadditionalPropertiesBoxedString
public record CommonparamsubdirGetadditionalPropertiesBoxedString<br>
implements [CommonparamsubdirGetadditionalPropertiesBoxed](#commonparamsubdirgetadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetadditionalPropertiesBoxedList
public record CommonparamsubdirGetadditionalPropertiesBoxedList<br>
implements [CommonparamsubdirGetadditionalPropertiesBoxed](#commonparamsubdirgetadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetadditionalPropertiesBoxedMap
public record CommonparamsubdirGetadditionalPropertiesBoxedMap<br>
implements [CommonparamsubdirGetadditionalPropertiesBoxed](#commonparamsubdirgetadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetadditionalProperties
public static class CommonparamsubdirGetadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
