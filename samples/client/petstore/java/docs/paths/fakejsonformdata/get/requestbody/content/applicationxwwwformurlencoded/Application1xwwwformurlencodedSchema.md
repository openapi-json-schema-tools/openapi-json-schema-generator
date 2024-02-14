# Application1xwwwformurlencodedSchema
public class Application1xwwwformurlencodedSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchema1Boxed](#application1xwwwformurlencodedschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchema1BoxedMap](#application1xwwwformurlencodedschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchema1](#application1xwwwformurlencodedschema1)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder)<br> builder for Map payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap)<br> output class for Map payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedParam2Boxed](#application1xwwwformurlencodedparam2boxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedParam2BoxedString](#application1xwwwformurlencodedparam2boxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedParam2](#application1xwwwformurlencodedparam2)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedParamBoxed](#application1xwwwformurlencodedparamboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedParamBoxedString](#application1xwwwformurlencodedparamboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedParam](#application1xwwwformurlencodedparam)<br> schema class |

## Application1xwwwformurlencodedSchema1Boxed
public static abstract sealed class Application1xwwwformurlencodedSchema1Boxed<br>
permits<br>
[Application1xwwwformurlencodedSchema1BoxedMap](#application1xwwwformurlencodedschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedSchema1BoxedMap
public static final class Application1xwwwformurlencodedSchema1BoxedMap<br>
extends [Application1xwwwformurlencodedSchema1Boxed](#application1xwwwformurlencodedschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchema1BoxedMap([Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap) | data<br>validated payload |

## Application1xwwwformurlencodedSchema1
public static class Application1xwwwformurlencodedSchema1<br>
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
Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchemaMap validatedPayload =
    Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchema1.validate(
    new Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchemaMapBuilder()
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("param", [Application1xwwwformurlencodedParam.class](#application1xwwwformurlencodedparam))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("param2", [Application1xwwwformurlencodedParam2.class](#application1xwwwformurlencodedparam2)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"param",<br>&nbsp;&nbsp;&nbsp;&nbsp;"param2"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap) | validate([Map&lt;?, ?&gt;](#application1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedSchema1BoxedMap](#application1xwwwformurlencodedschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#application1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1xwwwformurlencodedSchemaMap00Builder
public class Application1xwwwformurlencodedSchemaMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Application1xwwwformurlencodedSchemaMap00Builder](#application1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, Void value) |
| [Application1xwwwformurlencodedSchemaMap00Builder](#application1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, boolean value) |
| [Application1xwwwformurlencodedSchemaMap00Builder](#application1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, String value) |
| [Application1xwwwformurlencodedSchemaMap00Builder](#application1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, int value) |
| [Application1xwwwformurlencodedSchemaMap00Builder](#application1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, float value) |
| [Application1xwwwformurlencodedSchemaMap00Builder](#application1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, long value) |
| [Application1xwwwformurlencodedSchemaMap00Builder](#application1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, double value) |
| [Application1xwwwformurlencodedSchemaMap00Builder](#application1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, List<?> value) |
| [Application1xwwwformurlencodedSchemaMap00Builder](#application1xwwwformurlencodedschemamap00builder) | additionalProperty(String key, Map<String, ?> value) |

## Application1xwwwformurlencodedSchemaMap01Builder
public class Application1xwwwformurlencodedSchemaMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap00Builder](#application1xwwwformurlencodedschemamap00builder) | param2(String value) |

## Application1xwwwformurlencodedSchemaMap10Builder
public class Application1xwwwformurlencodedSchemaMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap00Builder](#application1xwwwformurlencodedschemamap00builder) | param(String value) |

## Application1xwwwformurlencodedSchemaMapBuilder
public class Application1xwwwformurlencodedSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap01Builder](#application1xwwwformurlencodedschemamap01builder) | param(String value) |
| [Application1xwwwformurlencodedSchemaMap10Builder](#application1xwwwformurlencodedschemamap10builder) | param2(String value) |

## Application1xwwwformurlencodedSchemaMap
public static class Application1xwwwformurlencodedSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap) | of([Map<String, ? extends @Nullable Object>](#application1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | param()<br> |
| String | param2()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Application1xwwwformurlencodedParam2Boxed
public static abstract sealed class Application1xwwwformurlencodedParam2Boxed<br>
permits<br>
[Application1xwwwformurlencodedParam2BoxedString](#application1xwwwformurlencodedparam2boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedParam2BoxedString
public static final class Application1xwwwformurlencodedParam2BoxedString<br>
extends [Application1xwwwformurlencodedParam2Boxed](#application1xwwwformurlencodedparam2boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedParam2BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedParam2
public static class Application1xwwwformurlencodedParam2<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
field2

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Application1xwwwformurlencodedParamBoxed
public static abstract sealed class Application1xwwwformurlencodedParamBoxed<br>
permits<br>
[Application1xwwwformurlencodedParamBoxedString](#application1xwwwformurlencodedparamboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedParamBoxedString
public static final class Application1xwwwformurlencodedParamBoxedString<br>
extends [Application1xwwwformurlencodedParamBoxed](#application1xwwwformurlencodedparamboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedParamBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedParam
public static class Application1xwwwformurlencodedParam<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
field1

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
