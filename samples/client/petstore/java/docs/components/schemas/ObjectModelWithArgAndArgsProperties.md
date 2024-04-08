# ObjectModelWithArgAndArgsProperties
org.openapijsonschematools.client.components.schemas.ObjectModelWithArgAndArgsProperties.java
public class ObjectModelWithArgAndArgsProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsProperties1Boxed](#objectmodelwithargandargsproperties1boxed)<br> sealed interface for validated payloads |
| record | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsProperties1BoxedMap](#objectmodelwithargandargsproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsProperties1](#objectmodelwithargandargsproperties1)<br> schema class |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMapBuilder](#objectmodelwithargandargspropertiesmapbuilder)<br> builder for Map payloads |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap)<br> output class for Map payloads |
| sealed interface | [ObjectModelWithArgAndArgsProperties.ArgsBoxed](#argsboxed)<br> sealed interface for validated payloads |
| record | [ObjectModelWithArgAndArgsProperties.ArgsBoxedString](#argsboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectModelWithArgAndArgsProperties.Args](#args)<br> schema class |
| sealed interface | [ObjectModelWithArgAndArgsProperties.ArgBoxed](#argboxed)<br> sealed interface for validated payloads |
| record | [ObjectModelWithArgAndArgsProperties.ArgBoxedString](#argboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectModelWithArgAndArgsProperties.Arg](#arg)<br> schema class |

## ObjectModelWithArgAndArgsProperties1Boxed
public sealed interface ObjectModelWithArgAndArgsProperties1Boxed<br>
permits<br>
[ObjectModelWithArgAndArgsProperties1BoxedMap](#objectmodelwithargandargsproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjectModelWithArgAndArgsProperties1BoxedMap
public record ObjectModelWithArgAndArgsProperties1BoxedMap<br>
implements [ObjectModelWithArgAndArgsProperties1Boxed](#objectmodelwithargandargsproperties1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectModelWithArgAndArgsProperties1BoxedMap([ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ObjectModelWithArgAndArgsProperties1
public static class ObjectModelWithArgAndArgsProperties1<br>
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
import org.openapijsonschematools.client.components.schemas.ObjectModelWithArgAndArgsProperties;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMap validatedPayload =
    ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsProperties1.validate(
    new ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMapBuilder()
        .arg("a")

        .args("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("arg", [Arg.class](#arg))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("args", [Args.class](#args)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"arg",<br>&nbsp;&nbsp;&nbsp;&nbsp;"args"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap) | validate([Map&lt;?, ?&gt;](#objectmodelwithargandargspropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectModelWithArgAndArgsProperties1BoxedMap](#objectmodelwithargandargsproperties1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#objectmodelwithargandargspropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectModelWithArgAndArgsProperties1Boxed](#objectmodelwithargandargsproperties1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ObjectModelWithArgAndArgsPropertiesMap00Builder
public class ObjectModelWithArgAndArgsPropertiesMap00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectModelWithArgAndArgsPropertiesMap00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, Void value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, boolean value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, String value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, int value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, float value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, long value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, double value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, List<?> value) |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | additionalProperty(String key, Map<String, ?> value) |

## ObjectModelWithArgAndArgsPropertiesMap01Builder
public class ObjectModelWithArgAndArgsPropertiesMap01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectModelWithArgAndArgsPropertiesMap01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | args(String value) |

## ObjectModelWithArgAndArgsPropertiesMap10Builder
public class ObjectModelWithArgAndArgsPropertiesMap10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectModelWithArgAndArgsPropertiesMap10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectModelWithArgAndArgsPropertiesMap00Builder](#objectmodelwithargandargspropertiesmap00builder) | arg(String value) |

## ObjectModelWithArgAndArgsPropertiesMapBuilder
public class ObjectModelWithArgAndArgsPropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectModelWithArgAndArgsPropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectModelWithArgAndArgsPropertiesMap01Builder](#objectmodelwithargandargspropertiesmap01builder) | arg(String value) |
| [ObjectModelWithArgAndArgsPropertiesMap10Builder](#objectmodelwithargandargspropertiesmap10builder) | args(String value) |

## ObjectModelWithArgAndArgsPropertiesMap
public static class ObjectModelWithArgAndArgsPropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap) | of([Map<String, ? extends @Nullable Object>](#objectmodelwithargandargspropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| String | arg()<br> |
| String | args()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ArgsBoxed
public sealed interface ArgsBoxed<br>
permits<br>
[ArgsBoxedString](#argsboxedstring)

sealed interface that stores validated payloads using boxed classes

## ArgsBoxedString
public record ArgsBoxedString<br>
implements [ArgsBoxed](#argsboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArgsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Args
public static class Args<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ArgBoxed
public sealed interface ArgBoxed<br>
permits<br>
[ArgBoxedString](#argboxedstring)

sealed interface that stores validated payloads using boxed classes

## ArgBoxedString
public record ArgBoxedString<br>
implements [ArgBoxed](#argboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArgBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Arg
public static class Arg<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
