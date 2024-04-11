# FakeGetHeaderParameters
public class FakeGetHeaderParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakeGetHeaderParameters.FakeGetHeaderParameters1Boxed](#fakegetheaderparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakeGetHeaderParameters.FakeGetHeaderParameters1BoxedMap](#fakegetheaderparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeGetHeaderParameters.FakeGetHeaderParameters1](#fakegetheaderparameters1)<br> schema class |
| static class | [FakeGetHeaderParameters.FakeGetHeaderParametersMapBuilder](#fakegetheaderparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakeGetHeaderParameters.FakeGetHeaderParametersMap](#fakegetheaderparametersmap)<br> output class for Map payloads |
| sealed interface | [FakeGetHeaderParameters.FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakeGetHeaderParameters.FakeGetadditionalPropertiesBoxedVoid](#fakegetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeGetHeaderParameters.FakeGetadditionalPropertiesBoxedBoolean](#fakegetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeGetHeaderParameters.FakeGetadditionalPropertiesBoxedNumber](#fakegetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeGetHeaderParameters.FakeGetadditionalPropertiesBoxedString](#fakegetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakeGetHeaderParameters.FakeGetadditionalPropertiesBoxedList](#fakegetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakeGetHeaderParameters.FakeGetadditionalPropertiesBoxedMap](#fakegetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeGetHeaderParameters.FakeGetadditionalProperties](#fakegetadditionalproperties)<br> schema class |

## FakeGetHeaderParameters1Boxed
public sealed interface FakeGetHeaderParameters1Boxed<br>
permits<br>
[FakeGetHeaderParameters1BoxedMap](#fakegetheaderparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeGetHeaderParameters1BoxedMap
public record FakeGetHeaderParameters1BoxedMap<br>
implements [FakeGetHeaderParameters1Boxed](#fakegetheaderparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetHeaderParameters1BoxedMap([FakeGetHeaderParametersMap](#fakegetheaderparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeGetHeaderParametersMap](#fakegetheaderparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetHeaderParameters1
public static class FakeGetHeaderParameters1<br>
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
import org.openapijsonschematools.client.paths.fake.get.FakeGetHeaderParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakeGetHeaderParameters.FakeGetHeaderParametersMap validatedPayload =
    FakeGetHeaderParameters.FakeGetHeaderParameters1.validate(
    new FakeGetHeaderParameters.FakeGetHeaderParametersMapBuilder()
        .enum_header_string("_abc")

        .enum_header_string_array(
            Arrays.asList(
                ">"
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_header_string", [Schema1.Schema11.class](../../../paths/fake/get/parameters/parameter1/Schema1.md#schema11)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_header_string_array", [Schema0.Schema01.class](../../../paths/fake/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakeGetadditionalProperties.class](#fakegetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeGetHeaderParametersMap](#fakegetheaderparametersmap) | validate([Map&lt;?, ?&gt;](#fakegetheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeGetHeaderParameters1BoxedMap](#fakegetheaderparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakegetheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeGetHeaderParameters1Boxed](#fakegetheaderparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakeGetHeaderParametersMapBuilder
public class FakeGetHeaderParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetHeaderParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FakeGetHeaderParametersMapBuilder](#fakegetheaderparametersmapbuilder) | enum_header_string(String value) |
| [FakeGetHeaderParametersMapBuilder](#fakegetheaderparametersmapbuilder) | enum_header_string([Schema1.StringSchemaEnums1](../../../paths/fake/get/parameters/parameter1/Schema1.md#stringschemaenums1) value) |
| [FakeGetHeaderParametersMapBuilder](#fakegetheaderparametersmapbuilder) | enum_header_string_array(List<String> value) |

## FakeGetHeaderParametersMap
public static class FakeGetHeaderParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakeGetHeaderParametersMap](#fakegetheaderparametersmap) | of([Map<String, ? extends @Nullable Object>](#fakegetheaderparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | enum_header_string()<br>[optional] |
| [Schema0.SchemaList0](../../../paths/fake/get/parameters/parameter0/Schema0.md#schemalist0) | enum_header_string_array()<br>[optional] |

## FakeGetadditionalPropertiesBoxed
public sealed interface FakeGetadditionalPropertiesBoxed<br>
permits<br>
[FakeGetadditionalPropertiesBoxedVoid](#fakegetadditionalpropertiesboxedvoid),
[FakeGetadditionalPropertiesBoxedBoolean](#fakegetadditionalpropertiesboxedboolean),
[FakeGetadditionalPropertiesBoxedNumber](#fakegetadditionalpropertiesboxednumber),
[FakeGetadditionalPropertiesBoxedString](#fakegetadditionalpropertiesboxedstring),
[FakeGetadditionalPropertiesBoxedList](#fakegetadditionalpropertiesboxedlist),
[FakeGetadditionalPropertiesBoxedMap](#fakegetadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeGetadditionalPropertiesBoxedVoid
public record FakeGetadditionalPropertiesBoxedVoid<br>
implements [FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetadditionalPropertiesBoxedBoolean
public record FakeGetadditionalPropertiesBoxedBoolean<br>
implements [FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetadditionalPropertiesBoxedNumber
public record FakeGetadditionalPropertiesBoxedNumber<br>
implements [FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetadditionalPropertiesBoxedString
public record FakeGetadditionalPropertiesBoxedString<br>
implements [FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetadditionalPropertiesBoxedList
public record FakeGetadditionalPropertiesBoxedList<br>
implements [FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetadditionalPropertiesBoxedMap
public record FakeGetadditionalPropertiesBoxedMap<br>
implements [FakeGetadditionalPropertiesBoxed](#fakegetadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeGetadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeGetadditionalProperties
public static class FakeGetadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
