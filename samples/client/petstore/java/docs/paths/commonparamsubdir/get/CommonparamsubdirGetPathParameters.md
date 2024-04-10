# CommonparamsubdirGetPathParameters
public class CommonparamsubdirGetPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters1Boxed](#commonparamsubdirgetpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters1BoxedMap](#commonparamsubdirgetpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters1](#commonparamsubdirgetpathparameters1)<br> schema class |
| static class | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParametersMapBuilder](#commonparamsubdirgetpathparametersmapbuilder)<br> builder for Map payloads |
| static class | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParametersMap](#commonparamsubdirgetpathparametersmap)<br> output class for Map payloads |
| sealed interface | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetadditionalPropertiesBoxed](#commonparamsubdirgetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetadditionalPropertiesBoxedVoid](#commonparamsubdirgetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetadditionalPropertiesBoxedBoolean](#commonparamsubdirgetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetadditionalPropertiesBoxedNumber](#commonparamsubdirgetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetadditionalPropertiesBoxedString](#commonparamsubdirgetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetadditionalPropertiesBoxedList](#commonparamsubdirgetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetadditionalPropertiesBoxedMap](#commonparamsubdirgetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirGetPathParameters.CommonparamsubdirGetadditionalProperties](#commonparamsubdirgetadditionalproperties)<br> schema class |

## CommonparamsubdirGetPathParameters1Boxed
public sealed interface CommonparamsubdirGetPathParameters1Boxed<br>
permits<br>
[CommonparamsubdirGetPathParameters1BoxedMap](#commonparamsubdirgetpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirGetPathParameters1BoxedMap
public record CommonparamsubdirGetPathParameters1BoxedMap<br>
implements [CommonparamsubdirGetPathParameters1Boxed](#commonparamsubdirgetpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetPathParameters1BoxedMap([CommonparamsubdirGetPathParametersMap](#commonparamsubdirgetpathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirGetPathParametersMap](#commonparamsubdirgetpathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirGetPathParameters1
public static class CommonparamsubdirGetPathParameters1<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.get.CommonparamsubdirGetPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParametersMap validatedPayload =
    CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters1.validate(
    new CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParametersMapBuilder()
        .subDir("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("subDir", [RouteParamSchema0.RouteParamSchema01.class](../../../paths/commonparamsubdir/parameters/routeparameter0/RouteParamSchema0.md#routeparamschema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"subDir"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [CommonparamsubdirGetadditionalProperties.class](#commonparamsubdirgetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirGetPathParametersMap](#commonparamsubdirgetpathparametersmap) | validate([Map&lt;?, ?&gt;](#commonparamsubdirgetpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirGetPathParameters1BoxedMap](#commonparamsubdirgetpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#commonparamsubdirgetpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirGetPathParameters1Boxed](#commonparamsubdirgetpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## CommonparamsubdirGetPathParametersMap0Builder
public class CommonparamsubdirGetPathParametersMap0Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetPathParametersMap0Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## CommonparamsubdirGetPathParametersMapBuilder
public class CommonparamsubdirGetPathParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirGetPathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirGetPathParametersMap0Builder](#commonparamsubdirgetpathparametersmap0builder) | subDir(String value) |
| [CommonparamsubdirGetPathParametersMap0Builder](#commonparamsubdirgetpathparametersmap0builder) | subDir([RouteParamSchema0.StringRouteParamSchemaEnums0](../../../paths/commonparamsubdir/parameters/routeparameter0/RouteParamSchema0.md#stringrouteparamschemaenums0) value) |

## CommonparamsubdirGetPathParametersMap
public static class CommonparamsubdirGetPathParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CommonparamsubdirGetPathParametersMap](#commonparamsubdirgetpathparametersmap) | of([Map<String, String>](#commonparamsubdirgetpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | subDir()<br> |

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
