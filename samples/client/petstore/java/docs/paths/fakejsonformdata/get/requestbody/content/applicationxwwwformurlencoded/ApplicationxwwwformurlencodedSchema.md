# ApplicationxwwwformurlencodedSchema
public class ApplicationxwwwformurlencodedSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1Boxed](#applicationxwwwformurlencodedschema1boxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1BoxedMap](#applicationxwwwformurlencodedschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1](#applicationxwwwformurlencodedschema1)<br> schema class |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder)<br> builder for Map payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap)<br> output class for Map payloads |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedParam2Boxed](#applicationxwwwformurlencodedparam2boxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedParam2BoxedString](#applicationxwwwformurlencodedparam2boxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedParam2](#applicationxwwwformurlencodedparam2)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedParamBoxed](#applicationxwwwformurlencodedparamboxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedParamBoxedString](#applicationxwwwformurlencodedparamboxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedParam](#applicationxwwwformurlencodedparam)<br> schema class |

## ApplicationxwwwformurlencodedSchema1Boxed
public sealed interface ApplicationxwwwformurlencodedSchema1Boxed<br>
permits<br>
[ApplicationxwwwformurlencodedSchema1BoxedMap](#applicationxwwwformurlencodedschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedSchema1BoxedMap
public record ApplicationxwwwformurlencodedSchema1BoxedMap<br>
implements [ApplicationxwwwformurlencodedSchema1Boxed](#applicationxwwwformurlencodedschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchema1BoxedMap([ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedSchema1
public static class ApplicationxwwwformurlencodedSchema1<br>
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
import org.openapijsonschematools.client.paths.fakejsonformdata.get.requestbody.content.applicationxwwwformurlencoded.ApplicationxwwwformurlencodedSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchemaMap validatedPayload =
    ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1.validate(
    new ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchemaMapBuilder()
        .param("a")

        .param2("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("param", [ApplicationxwwwformurlencodedParam.class](#applicationxwwwformurlencodedparam))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("param2", [ApplicationxwwwformurlencodedParam2.class](#applicationxwwwformurlencodedparam2)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"param",<br>&nbsp;&nbsp;&nbsp;&nbsp;"param2"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap) | validate([Map&lt;?, ?&gt;](#applicationxwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedSchema1BoxedMap](#applicationxwwwformurlencodedschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#applicationxwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedSchema1Boxed](#applicationxwwwformurlencodedschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ApplicationxwwwformurlencodedSchemaMap00Builder
public class ApplicationxwwwformurlencodedSchemaMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ApplicationxwwwformurlencodedSchemaMap00Builder](#applicationxwwwformurlencodedschemamap00builder) | additionalProperty(String key, Void value) |
| [ApplicationxwwwformurlencodedSchemaMap00Builder](#applicationxwwwformurlencodedschemamap00builder) | additionalProperty(String key, boolean value) |
| [ApplicationxwwwformurlencodedSchemaMap00Builder](#applicationxwwwformurlencodedschemamap00builder) | additionalProperty(String key, String value) |
| [ApplicationxwwwformurlencodedSchemaMap00Builder](#applicationxwwwformurlencodedschemamap00builder) | additionalProperty(String key, int value) |
| [ApplicationxwwwformurlencodedSchemaMap00Builder](#applicationxwwwformurlencodedschemamap00builder) | additionalProperty(String key, float value) |
| [ApplicationxwwwformurlencodedSchemaMap00Builder](#applicationxwwwformurlencodedschemamap00builder) | additionalProperty(String key, long value) |
| [ApplicationxwwwformurlencodedSchemaMap00Builder](#applicationxwwwformurlencodedschemamap00builder) | additionalProperty(String key, double value) |
| [ApplicationxwwwformurlencodedSchemaMap00Builder](#applicationxwwwformurlencodedschemamap00builder) | additionalProperty(String key, List<?> value) |
| [ApplicationxwwwformurlencodedSchemaMap00Builder](#applicationxwwwformurlencodedschemamap00builder) | additionalProperty(String key, Map<String, ?> value) |

## ApplicationxwwwformurlencodedSchemaMap01Builder
public class ApplicationxwwwformurlencodedSchemaMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap00Builder](#applicationxwwwformurlencodedschemamap00builder) | param2(String value) |

## ApplicationxwwwformurlencodedSchemaMap10Builder
public class ApplicationxwwwformurlencodedSchemaMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap00Builder](#applicationxwwwformurlencodedschemamap00builder) | param(String value) |

## ApplicationxwwwformurlencodedSchemaMapBuilder
public class ApplicationxwwwformurlencodedSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap01Builder](#applicationxwwwformurlencodedschemamap01builder) | param(String value) |
| [ApplicationxwwwformurlencodedSchemaMap10Builder](#applicationxwwwformurlencodedschemamap10builder) | param2(String value) |

## ApplicationxwwwformurlencodedSchemaMap
public static class ApplicationxwwwformurlencodedSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap) | of([Map<String, ? extends @Nullable Object>](#applicationxwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | param()<br> |
| String | param2()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ApplicationxwwwformurlencodedParam2Boxed
public sealed interface ApplicationxwwwformurlencodedParam2Boxed<br>
permits<br>
[ApplicationxwwwformurlencodedParam2BoxedString](#applicationxwwwformurlencodedparam2boxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedParam2BoxedString
public record ApplicationxwwwformurlencodedParam2BoxedString<br>
implements [ApplicationxwwwformurlencodedParam2Boxed](#applicationxwwwformurlencodedparam2boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedParam2BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedParam2
public static class ApplicationxwwwformurlencodedParam2<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
field2

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ApplicationxwwwformurlencodedParamBoxed
public sealed interface ApplicationxwwwformurlencodedParamBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedParamBoxedString](#applicationxwwwformurlencodedparamboxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedParamBoxedString
public record ApplicationxwwwformurlencodedParamBoxedString<br>
implements [ApplicationxwwwformurlencodedParamBoxed](#applicationxwwwformurlencodedparamboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedParamBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedParam
public static class ApplicationxwwwformurlencodedParam<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
field1

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
