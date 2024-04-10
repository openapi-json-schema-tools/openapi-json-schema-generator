# CommonparamsubdirPostPathParameters
public class CommonparamsubdirPostPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters1Boxed](#commonparamsubdirpostpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters1BoxedMap](#commonparamsubdirpostpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters1](#commonparamsubdirpostpathparameters1)<br> schema class |
| static class | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParametersMapBuilder](#commonparamsubdirpostpathparametersmapbuilder)<br> builder for Map payloads |
| static class | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParametersMap](#commonparamsubdirpostpathparametersmap)<br> output class for Map payloads |
| sealed interface | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostadditionalPropertiesBoxed](#commonparamsubdirpostadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostadditionalPropertiesBoxedVoid](#commonparamsubdirpostadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostadditionalPropertiesBoxedBoolean](#commonparamsubdirpostadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostadditionalPropertiesBoxedNumber](#commonparamsubdirpostadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostadditionalPropertiesBoxedString](#commonparamsubdirpostadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostadditionalPropertiesBoxedList](#commonparamsubdirpostadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostadditionalPropertiesBoxedMap](#commonparamsubdirpostadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirPostPathParameters.CommonparamsubdirPostadditionalProperties](#commonparamsubdirpostadditionalproperties)<br> schema class |

## CommonparamsubdirPostPathParameters1Boxed
public sealed interface CommonparamsubdirPostPathParameters1Boxed<br>
permits<br>
[CommonparamsubdirPostPathParameters1BoxedMap](#commonparamsubdirpostpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirPostPathParameters1BoxedMap
public record CommonparamsubdirPostPathParameters1BoxedMap<br>
implements [CommonparamsubdirPostPathParameters1Boxed](#commonparamsubdirpostpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostPathParameters1BoxedMap([CommonparamsubdirPostPathParametersMap](#commonparamsubdirpostpathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirPostPathParametersMap](#commonparamsubdirpostpathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostPathParameters1
public static class CommonparamsubdirPostPathParameters1<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.post.CommonparamsubdirPostPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParametersMap validatedPayload =
    CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters1.validate(
    new CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [CommonparamsubdirPostadditionalProperties.class](#commonparamsubdirpostadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirPostPathParametersMap](#commonparamsubdirpostpathparametersmap) | validate([Map&lt;?, ?&gt;](#commonparamsubdirpostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirPostPathParameters1BoxedMap](#commonparamsubdirpostpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#commonparamsubdirpostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirPostPathParameters1Boxed](#commonparamsubdirpostpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## CommonparamsubdirPostPathParametersMap0Builder
public class CommonparamsubdirPostPathParametersMap0Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostPathParametersMap0Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## CommonparamsubdirPostPathParametersMapBuilder
public class CommonparamsubdirPostPathParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostPathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirPostPathParametersMap0Builder](#commonparamsubdirpostpathparametersmap0builder) | subDir(String value) |
| [CommonparamsubdirPostPathParametersMap0Builder](#commonparamsubdirpostpathparametersmap0builder) | subDir([RouteParamSchema0.StringRouteParamSchemaEnums0](../../../paths/commonparamsubdir/parameters/routeparameter0/RouteParamSchema0.md#stringrouteparamschemaenums0) value) |

## CommonparamsubdirPostPathParametersMap
public static class CommonparamsubdirPostPathParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CommonparamsubdirPostPathParametersMap](#commonparamsubdirpostpathparametersmap) | of([Map<String, String>](#commonparamsubdirpostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | subDir()<br> |

## CommonparamsubdirPostadditionalPropertiesBoxed
public sealed interface CommonparamsubdirPostadditionalPropertiesBoxed<br>
permits<br>
[CommonparamsubdirPostadditionalPropertiesBoxedVoid](#commonparamsubdirpostadditionalpropertiesboxedvoid),
[CommonparamsubdirPostadditionalPropertiesBoxedBoolean](#commonparamsubdirpostadditionalpropertiesboxedboolean),
[CommonparamsubdirPostadditionalPropertiesBoxedNumber](#commonparamsubdirpostadditionalpropertiesboxednumber),
[CommonparamsubdirPostadditionalPropertiesBoxedString](#commonparamsubdirpostadditionalpropertiesboxedstring),
[CommonparamsubdirPostadditionalPropertiesBoxedList](#commonparamsubdirpostadditionalpropertiesboxedlist),
[CommonparamsubdirPostadditionalPropertiesBoxedMap](#commonparamsubdirpostadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirPostadditionalPropertiesBoxedVoid
public record CommonparamsubdirPostadditionalPropertiesBoxedVoid<br>
implements [CommonparamsubdirPostadditionalPropertiesBoxed](#commonparamsubdirpostadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostadditionalPropertiesBoxedBoolean
public record CommonparamsubdirPostadditionalPropertiesBoxedBoolean<br>
implements [CommonparamsubdirPostadditionalPropertiesBoxed](#commonparamsubdirpostadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostadditionalPropertiesBoxedNumber
public record CommonparamsubdirPostadditionalPropertiesBoxedNumber<br>
implements [CommonparamsubdirPostadditionalPropertiesBoxed](#commonparamsubdirpostadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostadditionalPropertiesBoxedString
public record CommonparamsubdirPostadditionalPropertiesBoxedString<br>
implements [CommonparamsubdirPostadditionalPropertiesBoxed](#commonparamsubdirpostadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostadditionalPropertiesBoxedList
public record CommonparamsubdirPostadditionalPropertiesBoxedList<br>
implements [CommonparamsubdirPostadditionalPropertiesBoxed](#commonparamsubdirpostadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostadditionalPropertiesBoxedMap
public record CommonparamsubdirPostadditionalPropertiesBoxedMap<br>
implements [CommonparamsubdirPostadditionalPropertiesBoxed](#commonparamsubdirpostadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostadditionalProperties
public static class CommonparamsubdirPostadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
