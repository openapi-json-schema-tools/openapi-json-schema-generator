# HeadersWithNoBodyHeadersSchema
public class HeadersWithNoBodyHeadersSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyHeadersSchema1Boxed](#headerswithnobodyheadersschema1boxed)<br> sealed interface for validated payloads |
| record | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyHeadersSchema1BoxedMap](#headerswithnobodyheadersschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyHeadersSchema1](#headerswithnobodyheadersschema1)<br> schema class |
| static class | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyHeadersSchemaMapBuilder](#headerswithnobodyheadersschemamapbuilder)<br> builder for Map payloads |
| static class | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyHeadersSchemaMap](#headerswithnobodyheadersschemamap)<br> output class for Map payloads |
| sealed interface | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyAdditionalPropertiesBoxed](#headerswithnobodyadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyAdditionalPropertiesBoxedVoid](#headerswithnobodyadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyAdditionalPropertiesBoxedBoolean](#headerswithnobodyadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyAdditionalPropertiesBoxedNumber](#headerswithnobodyadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyAdditionalPropertiesBoxedString](#headerswithnobodyadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyAdditionalPropertiesBoxedList](#headerswithnobodyadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyAdditionalPropertiesBoxedMap](#headerswithnobodyadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyAdditionalProperties](#headerswithnobodyadditionalproperties)<br> schema class |

## HeadersWithNoBodyHeadersSchema1Boxed
public sealed interface HeadersWithNoBodyHeadersSchema1Boxed<br>
permits<br>
[HeadersWithNoBodyHeadersSchema1BoxedMap](#headerswithnobodyheadersschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## HeadersWithNoBodyHeadersSchema1BoxedMap
public record HeadersWithNoBodyHeadersSchema1BoxedMap<br>
implements [HeadersWithNoBodyHeadersSchema1Boxed](#headerswithnobodyheadersschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HeadersWithNoBodyHeadersSchema1BoxedMap([HeadersWithNoBodyHeadersSchemaMap](#headerswithnobodyheadersschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [HeadersWithNoBodyHeadersSchemaMap](#headerswithnobodyheadersschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## HeadersWithNoBodyHeadersSchema1
public static class HeadersWithNoBodyHeadersSchema1<br>
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
import org.openapijsonschematools.client.components.responses.headerswithnobody.HeadersWithNoBodyHeadersSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyHeadersSchemaMap validatedPayload =
    HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyHeadersSchema1.validate(
    new HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyHeadersSchemaMapBuilder()
        .location("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("location", [LocationSchema.LocationSchema1.class](../../../components/responses/headerswithnobody/headers/location/LocationSchema.md#locationschema1))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [HeadersWithNoBodyAdditionalProperties.class](#headerswithnobodyadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [HeadersWithNoBodyHeadersSchemaMap](#headerswithnobodyheadersschemamap) | validate([Map&lt;?, ?&gt;](#headerswithnobodyheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| [HeadersWithNoBodyHeadersSchema1BoxedMap](#headerswithnobodyheadersschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#headerswithnobodyheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| [HeadersWithNoBodyHeadersSchema1Boxed](#headerswithnobodyheadersschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## HeadersWithNoBodyHeadersSchemaMapBuilder
public class HeadersWithNoBodyHeadersSchemaMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HeadersWithNoBodyHeadersSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |
| [HeadersWithNoBodyHeadersSchemaMapBuilder](#headerswithnobodyheadersschemamapbuilder) | location(String value) |

## HeadersWithNoBodyHeadersSchemaMap
public static class HeadersWithNoBodyHeadersSchemaMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [HeadersWithNoBodyHeadersSchemaMap](#headerswithnobodyheadersschemamap) | of([Map<String, String>](#headerswithnobodyheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | location()<br>[optional] |

## HeadersWithNoBodyAdditionalPropertiesBoxed
public sealed interface HeadersWithNoBodyAdditionalPropertiesBoxed<br>
permits<br>
[HeadersWithNoBodyAdditionalPropertiesBoxedVoid](#headerswithnobodyadditionalpropertiesboxedvoid),
[HeadersWithNoBodyAdditionalPropertiesBoxedBoolean](#headerswithnobodyadditionalpropertiesboxedboolean),
[HeadersWithNoBodyAdditionalPropertiesBoxedNumber](#headerswithnobodyadditionalpropertiesboxednumber),
[HeadersWithNoBodyAdditionalPropertiesBoxedString](#headerswithnobodyadditionalpropertiesboxedstring),
[HeadersWithNoBodyAdditionalPropertiesBoxedList](#headerswithnobodyadditionalpropertiesboxedlist),
[HeadersWithNoBodyAdditionalPropertiesBoxedMap](#headerswithnobodyadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## HeadersWithNoBodyAdditionalPropertiesBoxedVoid
public record HeadersWithNoBodyAdditionalPropertiesBoxedVoid<br>
implements [HeadersWithNoBodyAdditionalPropertiesBoxed](#headerswithnobodyadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HeadersWithNoBodyAdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## HeadersWithNoBodyAdditionalPropertiesBoxedBoolean
public record HeadersWithNoBodyAdditionalPropertiesBoxedBoolean<br>
implements [HeadersWithNoBodyAdditionalPropertiesBoxed](#headerswithnobodyadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HeadersWithNoBodyAdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## HeadersWithNoBodyAdditionalPropertiesBoxedNumber
public record HeadersWithNoBodyAdditionalPropertiesBoxedNumber<br>
implements [HeadersWithNoBodyAdditionalPropertiesBoxed](#headerswithnobodyadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HeadersWithNoBodyAdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## HeadersWithNoBodyAdditionalPropertiesBoxedString
public record HeadersWithNoBodyAdditionalPropertiesBoxedString<br>
implements [HeadersWithNoBodyAdditionalPropertiesBoxed](#headerswithnobodyadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HeadersWithNoBodyAdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## HeadersWithNoBodyAdditionalPropertiesBoxedList
public record HeadersWithNoBodyAdditionalPropertiesBoxedList<br>
implements [HeadersWithNoBodyAdditionalPropertiesBoxed](#headerswithnobodyadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HeadersWithNoBodyAdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## HeadersWithNoBodyAdditionalPropertiesBoxedMap
public record HeadersWithNoBodyAdditionalPropertiesBoxedMap<br>
implements [HeadersWithNoBodyAdditionalPropertiesBoxed](#headerswithnobodyadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HeadersWithNoBodyAdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## HeadersWithNoBodyAdditionalProperties
public static class HeadersWithNoBodyAdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
