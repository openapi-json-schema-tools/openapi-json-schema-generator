# CommonparamsubdirPostHeaderParameters
public class CommonparamsubdirPostHeaderParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostHeaderParameters1Boxed](#commonparamsubdirpostheaderparameters1boxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostHeaderParameters1BoxedMap](#commonparamsubdirpostheaderparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostHeaderParameters1](#commonparamsubdirpostheaderparameters1)<br> schema class |
| static class | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostHeaderParametersMapBuilder](#commonparamsubdirpostheaderparametersmapbuilder)<br> builder for Map payloads |
| static class | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostHeaderParametersMap](#commonparamsubdirpostheaderparametersmap)<br> output class for Map payloads |
| sealed interface | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostadditionalPropertiesBoxed](#commonparamsubdirpostadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostadditionalPropertiesBoxedVoid](#commonparamsubdirpostadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostadditionalPropertiesBoxedBoolean](#commonparamsubdirpostadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostadditionalPropertiesBoxedNumber](#commonparamsubdirpostadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostadditionalPropertiesBoxedString](#commonparamsubdirpostadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostadditionalPropertiesBoxedList](#commonparamsubdirpostadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostadditionalPropertiesBoxedMap](#commonparamsubdirpostadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostadditionalProperties](#commonparamsubdirpostadditionalproperties)<br> schema class |

## CommonparamsubdirPostHeaderParameters1Boxed
public sealed interface CommonparamsubdirPostHeaderParameters1Boxed<br>
permits<br>
[CommonparamsubdirPostHeaderParameters1BoxedMap](#commonparamsubdirpostheaderparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## CommonparamsubdirPostHeaderParameters1BoxedMap
public record CommonparamsubdirPostHeaderParameters1BoxedMap<br>
implements [CommonparamsubdirPostHeaderParameters1Boxed](#commonparamsubdirpostheaderparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostHeaderParameters1BoxedMap([CommonparamsubdirPostHeaderParametersMap](#commonparamsubdirpostheaderparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirPostHeaderParametersMap](#commonparamsubdirpostheaderparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## CommonparamsubdirPostHeaderParameters1
public static class CommonparamsubdirPostHeaderParameters1<br>
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
import org.openapijsonschematools.client.paths.commonparamsubdir.post.CommonparamsubdirPostHeaderParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostHeaderParametersMap validatedPayload =
    CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostHeaderParameters1.validate(
    new CommonparamsubdirPostHeaderParameters.CommonparamsubdirPostHeaderParametersMapBuilder()
        .someHeader("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someHeader", [Schema0.Schema01.class](../../../paths/commonparamsubdir/post/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [CommonparamsubdirPostadditionalProperties.class](#commonparamsubdirpostadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirPostHeaderParametersMap](#commonparamsubdirpostheaderparametersmap) | validate([Map&lt;?, ?&gt;](#commonparamsubdirpostheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirPostHeaderParameters1BoxedMap](#commonparamsubdirpostheaderparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#commonparamsubdirpostheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [CommonparamsubdirPostHeaderParameters1Boxed](#commonparamsubdirpostheaderparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## CommonparamsubdirPostHeaderParametersMapBuilder
public class CommonparamsubdirPostHeaderParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CommonparamsubdirPostHeaderParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [CommonparamsubdirPostHeaderParametersMapBuilder](#commonparamsubdirpostheaderparametersmapbuilder) | someHeader(String value) |

## CommonparamsubdirPostHeaderParametersMap
public static class CommonparamsubdirPostHeaderParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CommonparamsubdirPostHeaderParametersMap](#commonparamsubdirpostheaderparametersmap) | of([Map<String, String>](#commonparamsubdirpostheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | someHeader()<br>[optional] |

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
