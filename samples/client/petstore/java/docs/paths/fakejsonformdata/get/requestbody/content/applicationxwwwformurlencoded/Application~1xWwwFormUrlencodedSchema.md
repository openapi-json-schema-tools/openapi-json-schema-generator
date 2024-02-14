# Application~1xWwwFormUrlencodedSchema
public class Application~1xWwwFormUrlencodedSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchema1Boxed](#application~1xwwwformurlencodedschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchema1BoxedMap](#application~1xwwwformurlencodedschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchema1](#application~1xwwwformurlencodedschema1)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder)<br> builder for Map payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap)<br> output class for Map payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedParam2Boxed](#application~1xwwwformurlencodedparam2boxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedParam2BoxedString](#application~1xwwwformurlencodedparam2boxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedParam2](#application~1xwwwformurlencodedparam2)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedParamBoxed](#application~1xwwwformurlencodedparamboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedParamBoxedString](#application~1xwwwformurlencodedparamboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedParam](#application~1xwwwformurlencodedparam)<br> schema class |

## Application~1xWwwFormUrlencodedSchema1Boxed
public static abstract sealed class Application~1xWwwFormUrlencodedSchema1Boxed<br>
permits<br>
[Application~1xWwwFormUrlencodedSchema1BoxedMap](#application~1xwwwformurlencodedschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedSchema1BoxedMap
public static final class Application~1xWwwFormUrlencodedSchema1BoxedMap<br>
extends [Application~1xWwwFormUrlencodedSchema1Boxed](#application~1xwwwformurlencodedschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchema1BoxedMap([Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap) | data<br>validated payload |

## Application~1xWwwFormUrlencodedSchema1
public static class Application~1xWwwFormUrlencodedSchema1<br>
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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchemaMap validatedPayload =
    Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchema1.validate(
    new Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchemaMapBuilder()
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("param", [Application~1xWwwFormUrlencodedParam.class](#application~1xwwwformurlencodedparam))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("param2", [Application~1xWwwFormUrlencodedParam2.class](#application~1xwwwformurlencodedparam2)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"param",<br>&nbsp;&nbsp;&nbsp;&nbsp;"param2"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap) | validate([Map&lt;?, ?&gt;](#application~1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Application~1xWwwFormUrlencodedSchema1BoxedMap](#application~1xwwwformurlencodedschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#application~1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1xWwwFormUrlencodedSchemaMap00Builder
public class Application~1xWwwFormUrlencodedSchemaMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Application~1xWwwFormUrlencodedSchemaMap00Builder](#application~1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, Void value) |
| [Application~1xWwwFormUrlencodedSchemaMap00Builder](#application~1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, boolean value) |
| [Application~1xWwwFormUrlencodedSchemaMap00Builder](#application~1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, String value) |
| [Application~1xWwwFormUrlencodedSchemaMap00Builder](#application~1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, int value) |
| [Application~1xWwwFormUrlencodedSchemaMap00Builder](#application~1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, float value) |
| [Application~1xWwwFormUrlencodedSchemaMap00Builder](#application~1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, long value) |
| [Application~1xWwwFormUrlencodedSchemaMap00Builder](#application~1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, double value) |
| [Application~1xWwwFormUrlencodedSchemaMap00Builder](#application~1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, List<?> value) |
| [Application~1xWwwFormUrlencodedSchemaMap00Builder](#application~1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, Map<String, ?> value) |

## Application~1xWwwFormUrlencodedSchemaMap01Builder
public class Application~1xWwwFormUrlencodedSchemaMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap00Builder](#application~1xwwwformurlencodedschemamap00builder) | param2(String value) |

## Application~1xWwwFormUrlencodedSchemaMap10Builder
public class Application~1xWwwFormUrlencodedSchemaMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap00Builder](#application~1xwwwformurlencodedschemamap00builder) | param(String value) |

## Application~1xWwwFormUrlencodedSchemaMapBuilder
public class Application~1xWwwFormUrlencodedSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap01Builder](#application~1xwwwformurlencodedschemamap01builder) | param(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap10Builder](#application~1xwwwformurlencodedschemamap10builder) | param2(String value) |

## Application~1xWwwFormUrlencodedSchemaMap
public static class Application~1xWwwFormUrlencodedSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap) | of([Map<String, ? extends @Nullable Object>](#application~1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | param()<br> |
| String | param2()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Application~1xWwwFormUrlencodedParam2Boxed
public static abstract sealed class Application~1xWwwFormUrlencodedParam2Boxed<br>
permits<br>
[Application~1xWwwFormUrlencodedParam2BoxedString](#application~1xwwwformurlencodedparam2boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedParam2BoxedString
public static final class Application~1xWwwFormUrlencodedParam2BoxedString<br>
extends [Application~1xWwwFormUrlencodedParam2Boxed](#application~1xwwwformurlencodedparam2boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedParam2BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1xWwwFormUrlencodedParam2
public static class Application~1xWwwFormUrlencodedParam2<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
field2

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Application~1xWwwFormUrlencodedParamBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedParamBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedParamBoxedString](#application~1xwwwformurlencodedparamboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedParamBoxedString
public static final class Application~1xWwwFormUrlencodedParamBoxedString<br>
extends [Application~1xWwwFormUrlencodedParamBoxed](#application~1xwwwformurlencodedparamboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedParamBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1xWwwFormUrlencodedParam
public static class Application~1xWwwFormUrlencodedParam<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
field1

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
