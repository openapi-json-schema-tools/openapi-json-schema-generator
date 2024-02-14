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
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedStatusBoxed](#application1xwwwformurlencodedstatusboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedStatusBoxedString](#application1xwwwformurlencodedstatusboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedStatus](#application1xwwwformurlencodedstatus)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedNameBoxed](#application1xwwwformurlencodednameboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedNameBoxedString](#application1xwwwformurlencodednameboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedName](#application1xwwwformurlencodedname)<br> schema class |

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
        .name("a")

        .status("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("name", [Application1xwwwformurlencodedName.class](#application1xwwwformurlencodedname))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("status", [Application1xwwwformurlencodedStatus.class](#application1xwwwformurlencodedstatus)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap) | validate([Map&lt;?, ?&gt;](#application1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedSchema1BoxedMap](#application1xwwwformurlencodedschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#application1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
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
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | name(String value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | status(String value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, Void value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, boolean value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, String value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, int value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, float value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, long value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, double value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Application1xwwwformurlencodedSchemaMap
public static class Application1xwwwformurlencodedSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap) | of([Map<String, ? extends @Nullable Object>](#application1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | name()<br>[optional] |
| String | status()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Application1xwwwformurlencodedStatusBoxed
public static abstract sealed class Application1xwwwformurlencodedStatusBoxed<br>
permits<br>
[Application1xwwwformurlencodedStatusBoxedString](#application1xwwwformurlencodedstatusboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedStatusBoxedString
public static final class Application1xwwwformurlencodedStatusBoxedString<br>
extends [Application1xwwwformurlencodedStatusBoxed](#application1xwwwformurlencodedstatusboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedStatusBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedStatus
public static class Application1xwwwformurlencodedStatus<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
Updated status of the pet

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Application1xwwwformurlencodedNameBoxed
public static abstract sealed class Application1xwwwformurlencodedNameBoxed<br>
permits<br>
[Application1xwwwformurlencodedNameBoxedString](#application1xwwwformurlencodednameboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedNameBoxedString
public static final class Application1xwwwformurlencodedNameBoxedString<br>
extends [Application1xwwwformurlencodedNameBoxed](#application1xwwwformurlencodednameboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedNameBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedName
public static class Application1xwwwformurlencodedName<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
Updated name of the pet

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
